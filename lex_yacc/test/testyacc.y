%{
	#include<stdio.h>
%}
%token N
%%
S:N'+'	{printf("Here");}
;
%%
