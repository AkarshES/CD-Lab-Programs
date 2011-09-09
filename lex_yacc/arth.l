%{
	#include"y.tab.h"
%}
%%
([0-9]+)?(\.)?[0-9]+	{yylval.dval = atof(yytext);return N;}
\+	{return P;}
\-    {return M;}
\/	{return D;}
\*	{return ML;}
%%
