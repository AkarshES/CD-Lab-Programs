%{
int kwds = 0;
int ids = 0;
%}
%%
([ \t]+)?if|else|for|main|int|double|float([ ]+)	{kwds++;}
[_]?[a-z]+[a-zA-Z0-9_]*		{ids++;}
%%
int main()
{
	yylex();
	printf("%d\t%d",kwds,ids);
	return 0;
}
