%{
	#include<stdio.h>
	#include<stdlib.h>
	extern int count;
%}
%token A B
%%
S:A S 
|B
;

%%
int main()
{
	yyparse();
	if(count>10)printf("Accepted");
	else	printf("Not Accepted");
	return 0;
}
yywrap()
{
	return 1;
}
yyerror()
{
	printf("Syntax Error");
	exit(1);
}
