grammar Test;

options {
  language = Java;
}

tokens
{
PLUS = '+';
DIV = 'div';
MINUS = '-';
MULT = '*';
EQUAL = ':=';
OPENB = '(';
CLOSEB = ')';
BEGIN = 'begin';
END = 'end';
READ = 'read';
WRITE = 'write';
SC = ';';
TO = 'to';
DO = 'do';
VAR = 'var';
CLN = ':';
IF = 'if';
ELSE = 'else';
THEN = 'then';
}


@members {
  public static void main(String[] args)
  {
    TestLexer lex = new TestLexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    TestParser parser = new TestParser(tokens);                                                    
    try
    {
      parser.expr();
    }  catch(RecognitionException e)
    {
      e.printStackTrace();
    }
  }
}

NUMBER:(DIGIT)+('\.'(DIGIT)+)?;
ID: (ALPHA)+;
//WS:('\t'|'\r'|' ')+{$channel=HIDDEN;};

fragment DIGIT: '0'..'9';
fragment ALPHA: 'a'..'z';

prog:'program'ID VAR id_list CLN type SC BEGIN stmt_list END;
stmt_list: stmt+;
stmt: for|assignment|write|read|if;
read:READ OPENB id_list CLOSEB SC;
id_list: (ID|ID'\,')+ ;
write: WRITE OPENB id_list CLOSEB SC;
assignment: ID EQUAL expr SC;
expr:term((PLUS|MINUS)term)*;
term: factor((MULT|DIV)factor)*;
factor:NUMBER|ID;
for: ID EQUAL factor TO factor DO BEGIN stmt_list END;
type: 'integer'|'float'; 
if: IF condn THEN BEGIN stmt_list END ELSE BEGIN stmt_list END;
condn: expr ('<'|'>'|'=='|'<='|'>=') expr;