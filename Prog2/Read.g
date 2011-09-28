grammar Read;

options {
  language = Java;
}
tokens{
READ = 'READ';
OB = '(';
CB = ')';
CM = ',';

}

@members
{
  /*public static void main(String[] args)
  throws Exception
  {
    ReadLexer lex = new ReadLexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    ReadParser parser = new ReadParser(tokens);
    try
    {
      parser.expr();
    }
    catch(RecognitionException e)
    {
      e.printStackTrace();
    }
  }*/                                                                                          
}


IDLIST : ID(((CM)ID)+)?;
fragment ID : AL+;
fragment AL : 'a'..'z'|'A'..'Z';

read: READ OB IDLIST CB;