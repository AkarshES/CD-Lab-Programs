%{
	#include<stdio.h>
	#include<stdlib.h>
	float temp;
	
%}
%union{
	double dval;
}
%token N P M D ML
%type <dval> N
%type <dval> S
%%
statement:S	{printf("%.2lf",$1);}
;
S:N P N	{$$ = $1 + $3;}
|N M N	{$$ = $1 - $3;}
|N D N	{$$ = $1 / $3;}
|N ML N	{$$ = $1 * $3;}
;		
%%
int main()
{
	yyparse();
	return 0;
}
yyerror()
{
	printf("Not Valid");
	exit(1);
}
int yywrap()
{
	return 1;
}
