%{
	#include"y.tab.h"
	int count = 0;
%}
%%
a	{count++;if(count>10){return A;}}
b	{return B;}
.	;
%%
