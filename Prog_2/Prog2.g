grammar Prog2;

options 
{
  language = Java;
}

VERBS : 'doing' | 'using';
NOUN : 'bangalore' | 'dog';
ADJECTIVE : 'complicated'|'massive';

sentance : (VERBS|NOUN|ADJECTIVE)+;