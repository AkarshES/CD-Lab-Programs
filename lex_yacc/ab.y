%{
	#include<stdio.h>
	#include<stdlib.h>
%}
%token A B
%%
S:A S B	{printf("%d",$1);}
|A B
;
%%
int yylex()
{
	int ch;
	ch = getchar();
	if(ch == 'a') 		return A;
	else if(ch == 'b') 	return B;
	else if(ch == '\n') 	return 0;
	else return ch;
}
int main()
{
	yyparse();
	printf("a^nb^n");
	return 0;
}
int yyerror()
{
	printf("String doesnt belong to the Grammar");
	exit(1);
}
