grammar Test;

options {
  language = Java;
}
tokens 
{
  PLUS  = '+';
  MINUS = '-';
  MULT  = '*';
  DIV   = '/';
  ASSIGNMENT =':=';
}
@members
{
  public static void main(String[] args)
  throws Exception
  {
    TestLexer lex = new TestCalLexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    TestParser parser = new TestParser(tokens);
    try
    {
      parser.expr();
    }
    catch(RecognitionException e)
    {
      e.printStackTrace();
    }
  }
}

/*Lexer Rules*/
ID: A+;
NUMBER : (DIGIT)+('.' (DIGIT)+)? ;
WS:      ('\t'|' '|'\r'|'\n')+ ;
fragment A : 'a'..'z'|'A'..'Z';
/*fragment:Special construct in ANTLR to describe a part of another rule*/
fragment DIGIT: '0'..'9' ;
/*Parser Rules*/
stmt : ID ASSIGNMENT expr;
expr:term((PLUS|MINUS)term)*;
term:factor((MULT|DIV)factor)*;
factor: ID | NUMBER;