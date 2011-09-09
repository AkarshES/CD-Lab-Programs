%{
	int flag = 0;
%}
%%
[\ ]and|between[\ ] 	{flag = 1;}
. {;}
%%
int main()
{
	yylex();
	if (flag == 1)	
	{	printf("Compound");}
	return 0;
}

