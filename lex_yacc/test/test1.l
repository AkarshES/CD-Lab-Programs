%{
	#include"y.tab.h"
%}
%%
([0-9]+)?\.[0-9]+	{return FLT;}
[0-9]+			{return INT;}
int			{return INTT;}
float			{return FLOAT;}
([_a-zA-Z]+([0-9]+)?)+	{return ID;}
[=]+			{return EQU;}
[ \t]			;
%%
