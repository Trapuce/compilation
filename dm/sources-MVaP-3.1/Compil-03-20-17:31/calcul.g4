grammar calcul;

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

start: calcul EOF;

calcul
	returns[ String code ]
	@init { $code = new String(); } // On initialise code, pour l'utiliser comme accumulateur 
	@after { System.out.println($code); } : (decl { $code += $decl.code; })* { $code += "  JUMP Main\n"; } NEWLINE* ( // On affiche l’ensemble du code produit
		fonction { $code += $fonction.code; }
	)* NEWLINE* { $code += "LABEL Main\n"; } (
		instruction { $code += $instruction.code; }
	)* { $code += "  HALT\n"; };

instruction
	returns[ String code ]:
	expr finInstruction { 
            $code = $expr.code;
        }
	| bloc { 
		        $code=$bloc.code;
        }
	| assignation finInstruction { 
		        $code=$assignation.code;
        }
	| statement { 
		        $code=$statement.code;
        }
	| loopFor { 
		        $code=$loopFor.code;
        }
	| loop { 
		        $code=$loop.code;
        }
	| condition finInstruction { 
		        $code=$condition.code;
        }
	| 'input' '(' IDENTIFIANT ')' finInstruction {
             VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
             if(vi.type.equals("double")){
             if(vi.scope == VariableInfo.Scope.GLOBAL){
                $code = "READF\nSTOREG "+(vi.address+1)+"\nSTOREG "+vi.address+"\n";
             }else{
                $code = "READF\nSTOREL "+(vi.address+1)+"\nSTOREL "+vi.address+"\n";
             }
             }else{
                if(vi.scope == VariableInfo.Scope.GLOBAL){
                $code = "READ\nSTOREG "+vi.address+"\n";
             }else{
                $code = "READ\nSTOREL "+vi.address+"\n";
             }
             }
        }
	| RETURN expr finInstruction {
            VariableInfo vi = tablesSymboles.getReturn();
            $code = $expr.code + "STOREL "+vi.address+"\n";
            $code +="RETURN\n";
            
        }
	| finInstruction {
            $code="";
        };

expr
	returns[ String code, String type ]:
	'-' a = expr { $code =   "PUSHI -1\n" + $a.code  + "MUL \n" ; $type = $a.type;}
	| a = expr op = ('*' | '/') b = expr {$code = evalexpr($a.code ,$op.text, $b.code); $type = $a.type;}
	| a = expr op = ('+' | '-') b = expr {$code = evalexpr($a.code ,$op.text ,$b.code);$type = $a.type;}
	| '(' a = expr ')' {$code = $a.code; $type = $a.type;}
	| ENTIER {$code = "PUSHI " + $ENTIER.text+"\n"; $type = "int";}
    |COMMA{$code = "PUSHF "+ $COMMA.text+"\n"; $type="double";}
	| IDENTIFIANT
    {
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
        $type = vi.type ;
        if(vi.type.equals("double")){
         if(vi.scope == VariableInfo.Scope.GLOBAL){
            $code = "PUSHG "+vi.address+"\nPUSHG "+(vi.address+1)+"\n";
         }else{
           $code = "PUSHL "+vi.address+"\nPUSHL "+(vi.address+1)+"\n";
         }
        }else{
         if(vi.scope == VariableInfo.Scope.GLOBAL){
            $code = "PUSHG "+vi.address+"\n"; 
         }else{
            $code = "PUSHL "+vi.address+"\n";
         }
        }
        

    }
    
	| IDENTIFIANT '(' ')' {
            $type = tablesSymboles.getFunction($IDENTIFIANT.text);
            $code = ($type.equals("double")?"PUSHF 0.0\n":"PUSHI 0\n");
            $code +="CALL " + $IDENTIFIANT.text +"\n";
        }
	| IDENTIFIANT '(' args ')' // appel de fonction
	{
        $type = tablesSymboles.getFunction($IDENTIFIANT.text);
         $code = "PUSHI 0\n";
         $code += $args.code ;
        $code +="CALL " + $IDENTIFIANT.text +"\n";
         for(int i=0 ; i<$args.size ; i++){
             $code +="POP\n";
          }
    };

decl
	returns[ String code ]:
	TYPE IDENTIFIANT finInstruction {
            tablesSymboles.addVarDecl($IDENTIFIANT.text,$TYPE.text);
            if($TYPE.text.equals("double")){
            $code = "PUSHF 0.0 \n";
            }else{
            $code = "PUSHI 0 \n";
            }
        }
	| TYPE IDENTIFIANT '=' expr finInstruction {
            tablesSymboles.addVarDecl($IDENTIFIANT.text,$TYPE.text);
            if($TYPE.text.equals("double")){
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            if(vi.scope == VariableInfo.Scope.GLOBAL){
            $code = "PUSHF 0.0 \n" + $expr.code + "STOREG "+ (vi.address +1)+"\nSTOREG "+ vi.address +"\n"; 
            }else{
            $code = "PUSHF 0.0 \n" + $expr.code + "STOREL "+ (vi.address+1)+"\nSTOREL "+ vi.address+"\n"; 
            }
            }else{
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            if(vi.scope == VariableInfo.Scope.GLOBAL){
            $code = "PUSHI 0 \n" + $expr.code + "STOREG "+ vi.address+"\n"; 
            }else{
            $code = "PUSHI 0 \n" + $expr.code + "STOREL "+ vi.address+"\n"; 
            }
            }
        };

assignation
	returns[ String code ]:
	IDENTIFIANT '=' expr {  
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            if(vi.type.equals("double")){
            if(vi.scope == VariableInfo.Scope.GLOBAL){
                $code = $expr.code + "STOREG "+ (vi.address +1)+"\nSTOREG "+ vi.address +"\n"; 
            }else{
                $code = $expr.code + "STOREL "+ (vi.address +1)+"\nSTOREL "+ vi.address +"\n";   
            }
            }else{
                if(vi.scope == VariableInfo.Scope.GLOBAL){
                $code = $expr.code + "STOREG "+ vi.address+"\n";
            }else{
                $code = $expr.code + "STOREL "+ vi.address+"\n";   
            }
            }
        }
	| IDENTIFIANT '+' '=' expr {
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
        if(vi.type.equals("double")){
        if(vi.scope == VariableInfo.Scope.GLOBAL){
            $code = "PUSHG "+vi.address+"\nPUSHG "+(vi.address+1)+"\n";
            $code +=  $expr.code + "FADD\n";
            $code += "STOREG "+ (vi.address +1)+"\nSTOREG "+ vi.address +"\n"; 
        }else{
            $code = "PUSHL "+vi.address+"\nPUSHL "+(vi.address+1)+"\n";
            $code +=  $expr.code + "FADD\n";
            $code += "STOREL "+ (vi.address +1)+"\nSTOREL "+ vi.address +"\n"; 
        }
        }else{
            if(vi.scope == VariableInfo.Scope.GLOBAL){
            $code = "PUSHG "+vi.address+"\n";
            $code +=  $expr.code + "ADD\n";
            $code += "STOREG "+vi.address+"\n";
        }else{
            $code = "PUSHL "+vi.address+"\n";
            $code +=  $expr.code + "ADD\n";
            $code += "STOREL "+vi.address+"\n";
        }
        }

    }
	| IDENTIFIANT '=' IDENTIFIANT '+' expr {
        
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
         if(vi.type.equals("double")){
        if(vi.scope == VariableInfo.Scope.GLOBAL){
            $code = "PUSHG "+vi.address+"\nPUSHG "+(vi.address+1)+"\n";
            $code +=  $expr.code + "FADD\n";
            $code += "STOREG "+ (vi.address +1)+"\nSTOREG "+ vi.address +"\n"; 
        }else{
            $code = "PUSHL "+vi.address+"\nPUSHL "+(vi.address+1)+"\n";
            $code +=  $expr.code + "FADD\n";
            $code += "STOREL "+ (vi.address +1)+"\nSTOREL "+ vi.address +"\n";
        }
         }else{
            if(vi.scope == VariableInfo.Scope.GLOBAL){
            $code = "PUSHG "+vi.address+"\n";
            $code +=  $expr.code + "ADD\n";
            $code += "STOREG "+vi.address+"\n";
        }else{
            $code = "PUSHL "+vi.address+"\n";
            $code +=  $expr.code + "ADD\n";
            $code += "STOREL "+vi.address+"\n";
        }
         }

    }
	| 'print' '(' expr ')' {

            
            if($expr.type.equals("double")){
            $code = $expr.code+"WRITEF\nPOP\n";
            }else{
                $code = $expr.code+"WRITE\nPOP\n";
            }
        };

fonction
	returns[ String code ]
	@init { tablesSymboles.enterFunction() ; }
	// On initialise $code, pour ensuite l'utiliser comme accumulateur 
	@after { tablesSymboles.exitFunction(); }:
	TYPE IDENTIFIANT {
           tablesSymboles.addFunction($IDENTIFIANT.text , $TYPE.text );
        $code = "LABEL "+ $IDENTIFIANT.text +"\n";
        } '(' params? ')' '{' NEWLINE? (
		decl { $code += $decl.code; }
	)* NEWLINE* (instruction { $code += $instruction.code; })* '}' { $code += "RETURN\n"; } NEWLINE*
		;

params:
	TYPE IDENTIFIANT {
           tablesSymboles.addParam($IDENTIFIANT.text,"int");
        } (
		',' TYPE IDENTIFIANT {
               tablesSymboles.addParam($IDENTIFIANT.text,"int");
            }
	)*;

// init nécessaire à cause du ? final et donc args peut être vide (mais $args sera non null) 
args
	returns[ String code, int size]
	@init { $code = new String(); $size = 0; }: (
		expr {
         $code = $expr.code;
         $size +=1;
    } (
			',' expr {
        $code += $expr.code;
        $size +=1;
    }
		)*
	)?;
statement
	returns[String code ]:
	'if' '(' condition ')' a = instruction 'else' b = instruction {
            String start = getNewLabel() ; String end = getNewLabel();
            $code = $condition.code;
            $code+="JUMPF "+end+"\n";
            $code+=$a.code;
            $code+="JUMP "+start+"\n";
            $code+="LABEL "+end+"\n";
            $code+=$b.code;
            $code+="LABEL "+start+"\n";
         }
	| 'if' '(' condition ')' instruction {
            String label = getNewLabel();
            $code = $condition.code;
            $code+="JUMPF "+label+"\n";
            $code+=$instruction.code;
            $code+="LABEL "+label+"\n";
        };
loop
	returns[ String code ]:
	'while' '(' condition ')' instruction { String start = getNewLabel() ; String end = getNewLabel() ;
        $code = "LABEL " + start +"\n" ;
        $code += $condition.code ;
        $code += "JUMPF " + end +"\n" ;
        $code += $instruction.code ;
        $code += "JUMP " + start + "\n" ;
        $code +="LABEL " + end +"\n" ;
    
    };
loopFor
	returns[ String code ]:
	'for' '(' a = assignation ';' condition ';' b = assignation ')' instruction {
        String start = getNewLabel();
        String end = getNewLabel();
        $code=$a.code;
        $code+="LABEL "+start+"\n";
        $code+=$condition.code;
        $code+="JUMPF "+end+"\n";
        $code+=$instruction.code;
        $code+=$b.code;
        $code+="JUMP "+start+"\n";
        $code+="LABEL "+end+"\n";
    };

bloc
	returns[ String code ]
	@init { $code = new String(); }: '{' (instruction { $code += $instruction.code; })* '}' NEWLINE*;
condition
	returns[String code]:
	a = expr '<' b = expr {$code = $a.code + $b.code + "INF\n";  }
	| a = expr '>' b = expr {$code = $a.code + $b.code + "SUP\n";}
	| a = expr '>=' b = expr {$code = $a.code + $b.code + "SUPEQ\n";}
	| a = expr '<=' b = expr {$code = $a.code + $b.code + "INFEQ\n";}
	| a = expr '==' b = expr {$code = $a.code + $b.code + "EQUAL\n";}
	| a = expr '!=' b = expr {$code = $a.code + $b.code + "NEQ\n";}
	| 'true' { $code = "  PUSHI 1\n"; }
	| 'false' { $code = "  PUSHI 0\n"; }
	| '!' condition {
        $code =$condition.code;
        $code+="PUSHI 0\n";
        $code+="EQUAL\n";
    }
	| c = condition '&&' d = condition {
        $code=$c.code;
        $code+=$d.code;
        $code+="MUL\n";
        $code+="PUSHI 1\n";
        $code+="EQUAL\n";
    }
	| g = condition '||' e = condition {
        $code=$g.code;
        $code+=$e.code;
        $code+="ADD\n";
        $code+="PUSHI 1\n";
        $code+="SUPEQ\n";
    };

finInstruction: ( NEWLINE | ';')+;

// lexer lexer
RETURN: 'return';
TYPE: 'int' | 'double';
IDENTIFIANT: ('a' ..'z' | 'A' ..'Z' | '_') ('a' ..'z'| 'A' ..'Z'| '_'| '0' ..'9')*;
WHITE_SPACE: (' ' | '\t' | '\r')+ -> skip;
COMMENT: ('/*' .*? '*/') -> skip;
LINE_COMMENT: ('//' | '%') (~('\n'))* -> skip;
COMMA:('0'..'9')'.'('0'..'9') ; 
ENTIER: ('0' ..'9')+;
NEWLINE: '\r'? '\n';

