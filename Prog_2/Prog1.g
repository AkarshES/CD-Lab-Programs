grammar Prog1;

options {
  language = Java;
}
tokens 
{
  ASSIGN = ':=';
  PLUS = '+';
  MINUS = '-';
  MULT  = '*';
  DIV   = '/';
  TO = 'TO';
  DO = 'DO';
  BEGIN = 'BEGIN';
  END = 'END';
  WRITE = 'WRITE';
  SEMICLN = ';';
  FOR = 'FOR';
  OB = '(';
  CB = ')';
  CM = ',';
}


ID: A+;
NUMBER : (DIGIT)+('.' (DIGIT)+)? ;
//WS:      ('\t'|' '|'\r'|'\n')+ ;
fragment A : 'a'..'z'|'A'..'Z';
fragment DIGIT: '0'..'9';
for: FOR ID ASSIGN NUMBER TO NUMBER DO BEGIN stmtlist END;

stmtlist: stmt+;
stmt: write | ID ASSIGN expr SEMICLN;
expr:term((PLUS|MINUS)term)* ;
term:factor((MULT|DIV)factor)*;
factor: ID | NUMBER;
write : WRITE OB idlist CB SEMICLN;
idlist : ID((CM ID)+)?;