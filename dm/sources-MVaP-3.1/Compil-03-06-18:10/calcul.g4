grammar calcul ;

@parser::members {
     private int _cur_label = 1;
    /** générateur de nom d'étiquettes pour les boucles */
    private String getNewLabel() { return "Label" +(_cur_label++); }
    // ...
       private TablesSymboles tablesSymboles = new TablesSymboles();

    private String evalexpr (String x, String op, String y) {
        if ( op.equals("*") ){
            return x+y + "MUL\n";
        } else if ( op.equals("+") ){
            return x+y+"ADD\n";
        }else if ( op.equals("/") ){
            return x+y+"DIV\n";
        }else if ( op.equals("-") ){
            return x+y+"SUB\n";
        }   
        else {
           System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
           throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
        }
    }

}

start : calcul  EOF ;

calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise code, pour l'utiliser comme accumulateur 
@after{ System.out.println($code); } // On affiche l’ensemble du code produit

        :   (decl { $code += $decl.code; })*        
        NEWLINE*

        (instruction { $code += $instruction.code; })*

        { $code += "  HALT\n"; }
    ;


instruction returns [ String code ] 
    : expr finInstruction 
        { 
            $code = $expr.code;
        }
    | assignation finInstruction
        { 
		        $code=$assignation.code;
        }
    | statement finInstruction
        { 
		        $code=$statement.code;
        }
     | loop 
        { 
		        $code=$loop.code;
        }
    | bloc 
        { 
		        $code=$bloc.code;
        }
     | condition finInstruction
        { 
		        $code=$condition.code;
        }
    |'input' '('IDENTIFIANT')'finInstruction
        {
             VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
             $code = "READ\nSTOREG "+vi.address+"\n";
        }
   | finInstruction
        {
            $code="";
        }
    ;

expr returns [ String code ]
    :'-' a=expr { $code =   "PUSHI -1\n" + $a.code  + "MUL \n" ;} 
    | a=expr op=('*'| '/') b=expr {$code = evalexpr($a.code ,$op.text, $b.code);}
    | a=expr op=('+'| '-') b=expr {$code = evalexpr($a.code ,$op.text ,$b.code);}
    | '('a=expr ')'               {$code = $a.code;}
    | ENTIER{$code = "PUSHI " + $ENTIER.text+"\n";}  
    |IDENTIFIANT{
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
        $code = "PUSHG "+vi.address+"\n";}   
    ;

decl returns [ String code ]
    :
        TYPE IDENTIFIANT finInstruction
        {
            $code = "PUSHI 0 \n";
            tablesSymboles.addVarDecl($IDENTIFIANT.text,"int");
        }
        |TYPE IDENTIFIANT '=' expr finInstruction
        {
            tablesSymboles.addVarDecl($IDENTIFIANT.text,"int");
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $code = "PUSHI 0 \n" + $expr.code + "STOREG "+ vi.address+"\n"; 

        }
        
        
        
    ;

assignation returns [ String code ] 
    : IDENTIFIANT '=' expr
        {  

            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $code = $expr.code + "STOREG "+ vi.address+"\n";
        }
    | IDENTIFIANT '+''=' expr
    {
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
        $code = "PUSHG "+vi.address+"\n";
        $code +=  $expr.code + "ADD\n";
        $code += "STOREG "+vi.address+"\n";

    }
    | IDENTIFIANT '=' IDENTIFIANT '+' expr
    {
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
        $code = "PUSHG "+vi.address+"\n";
        $code +=  $expr.code + "ADD\n";
        $code += "STOREG "+vi.address+"\n";

    }
    |'print''('expr')'
        {
            $code = $expr.code+"WRITE\nPOP\n";
        }
    
    ;

statement returns[String code ]
         :'if''('condition ')' bloc 
         ;
loop returns [ String code ]
    :'while' '('condition')' instruction
    { String start = getNewLabel() ; String end = getNewLabel() ;
        $code = "LABEL " + start +"\n" ;
        $code += $condition.code ;
        $code += "JUMPF " + end +"\n" ;
        $code += $instruction.code ;
        $code += "JUMP " + start + "\n" ;
        $code +="LABEL " + end +"\n" ;
    
    }
    ;
bloc returns [ String code ]  @init{ $code = new String(); } 
    : '{' 
        (instruction { $code += $instruction.code; })* 
      '}'  
      NEWLINE*
    ;
condition returns [String code]
    : a = expr '<' b = expr{$code = $a.code + $b.code + "INF\n";  }
    |a = expr '>' b = expr{$code = $a.code + $b.code + "SUP\n";}
    |a = expr '>=' b = expr{$code = $a.code + $b.code + "SUPEQ\n";}
    |a = expr '<=' b = expr{$code = $a.code + $b.code + "INFEQ\n";}
    |a = expr '==' b = expr{$code = $a.code + $b.code + "EQUAL\n";}
    |a = expr '!=' b = expr{$code = $a.code + $b.code + "NEQ\n";}
    | 'true'  { $code = "  PUSHI 1\n"; }
    | 'false' { $code = "  PUSHI 0\n"; }
    
    ;


finInstruction : ( NEWLINE | ';' )+ ;


// lexer
TYPE : 'int' | 'double' ;
IDENTIFIANT : ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;
WHITE_SPACE: (' '|'\t'|'\r')+ ->skip ;
COMMENT     : ('/*'.*? '*/')  ->skip ;
LINE_COMMENT:   ('//'|'%') (~('\n'))*  ->skip ;
ENTIER:('0'..'9')+ ;
NEWLINE : '\r'? '\n'   ;
OPLOG : '||' | '&&' | '!';

