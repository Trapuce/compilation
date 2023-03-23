grammar calcul;

@parser::members {
     private int _cur_label = 1;
    /** générateur de nom d'étiquettes pour les boucles */
    private String getNewLabel() { return "Label" +(_cur_label++); }
    private TablesSymboles tablesSymboles = new TablesSymboles();

    private String evalexpr (String x, String op, String y , String type) {
        
        if(type.equals("double")){
            if ( op.equals("*") ){
                return x+y + "FMUL\n";
             } else if ( op.equals("+") ){
                return x+y+"FADD\n";
            }else if ( op.equals("/") ){
                return x+y+"FDIV\n";
            }else if ( op.equals("-") ){
                return x+y+"FSUB\n";
            }   
            else {
                System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
                throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
            }
        }else{
            if ( op.equals("*") ){
                 return x+y + "MUL\n";
             } else if ( op.equals("+") ){
                 return x+y+"ADD\n";
            }else if ( op.equals("/")){
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

}

start: calcul EOF;
calcul
	returns[ String code ]
	@init { $code = new String(); } // On initialise code, pour l'utiliser comme accumulateur 
	@after { System.out.println($code); } 
    : (decl { $code += $decl.code; })* { $code += "  JUMP Main\n"; } NEWLINE* ( // On affiche l’ensemble du code produit
		fonction { $code += $fonction.code; }
	)* NEWLINE* { $code += "LABEL Main\n"; } (
		instruction { $code += $instruction.code; }
	)* { $code += "  HALT\n"; };
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
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            if(!$TYPE.text.equals($expr.type)){
                System.out.println("Warning : ");
                if($TYPE.text.equals("double")){
                    $expr.code = $expr.code + "ITOF\n";
                    if(vi.scope == VariableInfo.Scope.GLOBAL){
                        $code = "PUSHF 0.0 \n" + $expr.code + "STOREG "+ (vi.address +1)+"\nSTOREG "+ vi.address +"\n"; 
                    }else{
                        $code = "PUSHF 0.0 \n" + $expr.code + "STOREL "+ (vi.address+1)+"\nSTOREL "+ vi.address+"\n"; 
                    }
                }else{
                    $expr.code = $expr.code + "FTOI\n";
                    if(vi.scope == VariableInfo.Scope.GLOBAL){
                        $code = "PUSHI 0 \n" + $expr.code + "STOREG "+ vi.address+"\n"; 
                    }else{
                        $code = "PUSHI 0 \n" + $expr.code + "STOREL "+ vi.address+"\n"; 
                    }
                }
            }else{
                if($TYPE.text.equals("double")){
                    if(vi.scope == VariableInfo.Scope.GLOBAL){
                        $code = "PUSHF 0.0 \n" + $expr.code + "STOREG "+ (vi.address +1)+"\nSTOREG "+ vi.address +"\n"; 
                    }else{
                        $code = "PUSHF 0.0 \n" + $expr.code + "STOREL "+ (vi.address+1)+"\nSTOREL "+ vi.address+"\n"; 
                    }
                }else{
                        if(vi.scope == VariableInfo.Scope.GLOBAL){
                            $code = "PUSHI 0 \n" + $expr.code + "STOREG "+ vi.address+"\n"; 
                        }else{
                            $code = "PUSHI 0 \n" + $expr.code + "STOREL "+ vi.address+"\n"; 
                        }
                }
            }
        };

assignation
	returns[ String code ]:
	IDENTIFIANT '=' expr 
    {  
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            if(!vi.type.equals($expr.type)){
                System.out.println("Warning : ");
                     
                if(vi.type.equals("double")){
                    $expr.code = $expr.code + "ITOF\n";
                    if(vi.scope==VariableInfo.Scope.GLOBAL){
                        $code = $expr.code + "STOREG "+ (vi.address +1)+"\nSTOREG "+ vi.address +"\n"; 
                    }else{
                        $code = $expr.code + "STOREL "+ (vi.address +1)+"\nSTOREL "+ vi.address +"\n";   
                    }
                }else{
                $expr.code = $expr.code + "FTOI\n";
                    if(vi.scope==VariableInfo.Scope.GLOBAL){
                        $code = $expr.code + "STOREG "+ vi.address+"\n";
                    }else{
                        $code = $expr.code + "STOREL "+ vi.address+"\n";   
                    }
                }
            }else{
                if(vi.type.equals("double")){
                if(vi.scope==VariableInfo.Scope.GLOBAL){
                    $code = $expr.code + "STOREG "+ (vi.address +1)+"\nSTOREG "+ vi.address +"\n"; 
                }else{
                    $code = $expr.code + "STOREL "+ (vi.address +1)+"\nSTOREL "+ vi.address +"\n";   
                }
            }else if(vi.type.equals("int")){
                if(vi.scope == VariableInfo.Scope.GLOBAL){
                    $code = $expr.code + "STOREG "+ vi.address+"\n";
                 }else{
                    $code = $expr.code + "STOREL "+ vi.address+"\n";   
                }
            }
            else {
                $expr.code = $expr.code ;
                $expr.code += $expr.type.equals("double") ? "FOTI\nPUSHI 0\nNEQ\n" : "PUSHI 0\nNEQ\n";
                if(vi.scope == VariableInfo.Scope.GLOBAL){
                    $code = $expr.code + "STOREG ";
                 }else{
                    $code = $expr.code + "STOREL ";  
                }
                $code += vi.address+"\n";
            }
            }
            
        }
    
	|IDENTIFIANT '+' '=' expr {
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
        if(!vi.type.equals($expr.type)){
                System.out.println("Warning : ");
        if(vi.type.equals("double")){
                $expr.code = $expr.code + "ITOF\n";
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
            $expr.code = $expr.code + "FTOI\n";

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
        }else{
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

    }
	| IDENTIFIANT '=' IDENTIFIANT '+' expr {
        
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
         if(!vi.type.equals($expr.type)){
                System.out.println("Warning : ");
        if(vi.type.equals("double")){
            $expr.code = $expr.code + "ITOF\n"; 
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
            $expr.code = $expr.code + "FTOI\n"; 
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
         }else{
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

    }
	;
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
            if(vi.type.equals("double")){
                $expr.code = $expr.type.equals("double") ? $expr.code : $expr.code + "ITOF\n";
                $code = $expr.code + "STOREL "+ (vi.address+1) + "\nSTOREL "+vi.address+"\n";
            }else{
                $code = $expr.code + "STOREL "+vi.address+"\n";
            }
                $code +="RETURN\n";

    }
    | 'print' '(' expr ')' finInstruction 
    {
            if($expr.type.equals("double")){
                $code = $expr.code+"WRITEF\nPOP\nPOP\n";
            }else{
                $code = $expr.code+"WRITE\nPOP\n";
            }
    }
	| finInstruction {
            $code="";
        };

expr returns[ String code, String type ]
    :	'-' a = expr
    {
         $type = $a.type;
        if($type.equals("double")){
            $code =   "PUSHF -1.0\n" + $a.code  + "FMUL \n" ;
        }else{
             $code =   "PUSHI -1\n" + $a.code  + "MUL \n" ;
        }
    }
	| a = expr op = ('*' | '/') b = expr 
    {    $type = $a.type;
        if($a.type.equals($b.type))
        {
            $code = evalexpr($a.code ,$op.text, $b.code,$type); 
        }else{
            System.err.println("WARNING  cast implicite");
            if($a.type.equals("double"))
            {
                
                $type = "double";
                $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
                $code = evalexpr($a.code ,$op.text, $b.code,$type); 
                 
            }else if($b.type.equals("double"))
            {
                
                $type = "double";
                $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
                $code = evalexpr($a.code ,$op.text, $b.code,$type); 
                 
             }else
             {
                $type = "int";
                $code = evalexpr($a.code ,$op.text, $b.code,$type); 
             }
        }
       
    }
	| a = expr op = ('+' | '-') b = expr 
    {     
        if($a.type.equals($b.type))
        {
            $type = $a.type;
            $code = evalexpr($a.code ,$op.text, $b.code,$type); 
        }else{
            if($a.type.equals("double"))
            {
                
                $type = "double";
                $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
                $code = evalexpr($a.code ,$op.text, $b.code,$type); 
                 
            }else if($b.type.equals("double"))
              {
                
                $type = "double";
                $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
                $code = evalexpr($a.code ,$op.text, $b.code,$type); 
                 
             }else
             {
                $type = "int";
                $code = evalexpr($a.code ,$op.text, $b.code,$type); 
             }
        }   
    }
	| '(' a = expr ')' {$code = $a.code; $type = $a.type;}
	| ENTIER {$code = "PUSHI " + $ENTIER.text+"\n"; $type = "int";}
    |FLOTTANT{$code = "PUSHF "+ $FLOTTANT.text+"\n"; $type="double";}
    | BOOLEAN { $type ="bool";$code = $BOOLEAN.text.equals("true") ? "PUSHI 1\n":"PUSHI 0\n"; }
    |'('TYPE')' a= expr
    {
        $type = $TYPE.text;
         if($TYPE.text.equals("double")){
            
            $code = $a.type.equals("double") ?  $a.code : $a.code + "ITOF\n";
         }
         else if($TYPE.text.equals("int"))
         {
            $code = !$a.type.equals("double") ?  $a.code : $a.code + "FTOI\n";

         }
         else
         {
                if($a.type.equals("double")){
                     $code = $a.code + "PUSHF 0. \n"+ "FNEQ\n";
                }else{
                    $code = $a.code + "PUSHI 0 \n" + "NEQ\n" ;
                }
         }
    }
	| IDENTIFIANT
    {
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
        $type = vi.type ;
        if($type.equals("double")){
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
        $code = ($type.equals("double")?"PUSHF 0.0\n":"PUSHI 0\n");
        $code += $args.code ;
        $code +="CALL " + $IDENTIFIANT.text +"\n";
         for(int i=0 ; i<$args.size ; i++){
             
                $code +="POP\n";
          }
    }
    |a = expr '<' b = expr 
    {
        if($a.type.equals("double"))
        {
            $type = $a.type ;
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FINF\n";  
        }else if($b.type.equals("double"))
        {
             $type = $b.type ;
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FINF\n";  
        }else
        {
             $type = $a.type ;
            $code = $a.code + $b.code + "INF\n";  
        }
       
    }
	| a = expr '>' b = expr 
    {
       
         if($a.type.equals("double"))
        {
             $type = $a.type ;
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FSUP\n";  
                 
        }else if($b.type.equals("double"))
        {
             $type = $b.type ;    
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FSUP\n";             
        }else
        {
            $type = $a.type ;    
            $code = $a.code + $b.code + "SUP\n";  
        }
        
    }
	| a = expr '>=' b = expr 
    {
        if($a.type.equals("double"))
        {
            $type = $a.type ;
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FSUPEQ\n";  
        }else if($b.type.equals("double"))
        {
             $type = $b.type ;
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FSUPEQ\n";  
        }else
        {
             $type = $a.type ; 
            $code = $a.code + $b.code + "SUPEQ\n";  
        }

    }
	| a = expr '<=' b = expr 
    {   
         if($a.type.equals("double"))
        {
            $type = $a.type ;
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FINFEQ\n";  
                 
        }else if($b.type.equals("double"))
        {
            $type = $b.type ;
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FINFEQ\n";  
        }else
        {
         $type = $a.type ;             
         $code = $a.code + $b.code + "INFEQ\n";  
        }
        
    }
	| a = expr '==' b = expr 
    {
         if($a.type.equals("double"))
        {
            $type = $a.type ;    
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FEQUAL\n";  
                 
        }else if($b.type.equals("double"))
        {
             $type = $b.type ;    
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FEQUAL\n";  
                 
        }else
        {
             $type = $a.type ;
            $code = $a.code + $b.code + "EQUAL\n";  

        }
        
    }
	| a = expr '!=' b = expr 
    {
         if($a.type.equals("double"))
        {    $type = $a.type ;
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FNEQ\n";  
                 
        }else if($b.type.equals("double"))
        {   $type = $b.type ;
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FNEQ\n";  
        }else
        {
            $type = $a.type ;
            $code = $a.code + $b.code + "NEQ\n";  
        }

        
    }
    |BOOLEAN {$type="bool"; $code = $BOOLEAN.text.equals("true") ? "PUSHI 1\n":"PUSHI 0\n"; }
	| '!' expr {
        $type="bool";
        $code =$expr.code;
        $code+="PUSHI 0\n";
        $code+="EQUAL\n";
    }
	| c = expr '&&' d = expr {
        $type ="bool";
        $code=$c.code;
        $code+=$d.code;
        $code+="MUL\n";
        $code+="PUSHI 1\n";
        $code+="EQUAL\n";
    }
	| g = expr '||' e = expr {
        
        $type ="bool";
        $code=$g.code;
        $code+=$e.code;
        $code+="ADD\n";
        $code+="PUSHI 1\n";
        $code+="SUPEQ\n";
    };




fonction
	returns[ String code ]
	@init { tablesSymboles.enterFunction() ; }
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
           tablesSymboles.addParam($IDENTIFIANT.text,$TYPE.text);
        } (
		',' TYPE IDENTIFIANT {
               tablesSymboles.addParam($IDENTIFIANT.text,$TYPE.text);
            }
	)*;

// init nécessaire à cause du ? final et donc args peut être vide (mais $args sera non null) 
args
	returns[ String code, int size]
	@init { $code = new String(); $size = 0; }: (
		expr {
         $code = $expr.code;
         if($expr.type.equals("double")){$size +=2;}
         else{$size +=1;}
    } (
			',' expr {
        $code += $expr.code;
        if($expr.type.equals("double")){$size +=2;}
         else{$size +=1;}
    }
		)*
	)?;
statement
	returns[String code ]:
	'if' '(' expr ')' a = instruction 'else' b = instruction {
            String start = getNewLabel() ; String end = getNewLabel();
            $code = $expr.code;
            $code+="JUMPF "+end+"\n";
            $code+=$a.code;
            $code+="JUMP "+start+"\n";
            $code+="LABEL "+end+"\n";
            $code+=$b.code;
            $code+="LABEL "+start+"\n";
         }
	| 'if' '(' expr ')' instruction {
            String label = getNewLabel();
            $code = $expr.code;
            $code+="JUMPF "+label+"\n";
            $code+=$instruction.code;
            $code+="LABEL "+label+"\n";
        };
loop
	returns[ String code ]:
	'while' '(' expr ')' instruction { String start = getNewLabel() ; String end = getNewLabel() ;
        $code = "LABEL " + start +"\n" ;
        $code += $expr.code ;
        $code += "JUMPF " + end +"\n" ;
        $code += $instruction.code ;
        $code += "JUMP " + start + "\n" ;
        $code +="LABEL " + end +"\n" ;
    
    };
loopFor
	returns[ String code ]:
	'for' '(' a = assignation ';' expr ';' b = assignation ')' instruction {
        String start = getNewLabel();
        String end = getNewLabel();
        $code=$a.code;
        $code+="LABEL "+start+"\n";
        $code+=$expr.code;
        $code+="JUMPF "+end+"\n";
        $code+=$instruction.code;
        $code+=$b.code;
        $code+="JUMP "+start+"\n";
        $code+="LABEL "+end+"\n";
    };

bloc
	returns[ String code ,String type ]
	@init { $code = new String(); }: '{' (instruction { $code += $instruction.code; })* '}' NEWLINE*;

finInstruction: ( NEWLINE | ';')+;
// lexer lexer
RETURN: 'return';
BOOLEAN: 'true' | 'false';
TYPE: 'int' | 'double' | 'bool';
IDENTIFIANT: ('a' ..'z' | 'A' ..'Z' | '_') ('a' ..'z'| 'A' ..'Z'| '_'| '0' ..'9')*;
WHITE_SPACE: (' ' | '\t' | '\r')+ -> skip;
COMMENT: ('/*' .*? '*/' ) -> skip;
LINE_COMMENT: ('//' | '%'| '#') (~('\n'))* -> skip;
FLOTTANT:('0'..'9')+'.'('0'..'9')* ; 
ENTIER: ('0' ..'9')+;
NEWLINE: '\r'? '\n';
UNMATCH : .;
