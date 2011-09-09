%{
	#include<stdio.h>
	#include<stdlib.h>
%}
%token ID INT FLT EQU INTT FLOAT
%%
assn:FLOAT ID EQU FLT
|INTT ID EQU INT
|ID
;
%%

int main()
{
	if(!yyparse())
		printf("Assignment");
	return 0;
}
yywrap()
{
	return 0;
}
