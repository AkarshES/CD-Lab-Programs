%{
	#include<stdio.h>
	#include<stdlib.h>
%}
%token PRINTF
%%
S:PRINTF'()'
;
%%
int main()
{
	if(!yyparse())
	{
		printf("Matched");
	}
}
yywrap()
{
	return 1;
}
yyerror()
{
	printf("Unmatched");
	exit(1);
}
