grammar Grammar;

inicio: (SIGLAS|PAL|NUM|DATA|HORA|MIN|SEG|ESPECIAIS|EMOJI|CIT)*;



SIGLAS:('PDF'|'ABNT'|'ABNT2'|'USB'|'LED'|'RGB'|'5G'|'PC'|'TV'|
        'pdf'|'abnt'|'abnt2'|'usb'|'led'|'rgb'|'5g'|'pc'|'tv');
PAL:[a-zA-ZàáãâäéèêíìïóòôõúùûçÀÁÃÂÄÉÈÊÍÌÏÓÒÔÕÚÙÛÇ]+;
NUM:[0-9]+;
DATA:[0-3][0-9] '/' [0-1][0-9] '/' [0-9][0-9][0-9][0-9];
HORA:[0-9]+ ('hr'|'hora'|'h'|'horas');
MIN: [0-9]+ ('min'|'minuto'|'minutos');
SEG: [0-9]+ ('seg'|'segundo'|'segndos'|'s');
ESPECIAIS:('!'|'@'|'#'|'$'|'%'|'&'|'*'|'('|')'|'-'|'_'|'='|'+'
            '§'|'°'|'['|']'|'{'|'}'|'ª'|'º'|'?'|'<'|'>'|','|'.'|
            ';'|':'|'/'|'~')+;
EMOJI:[\u+1f601+];
CIT:'"' (~["\r\n] | '\\"')* '"';
SPACE: [ \t\r\n] -> skip;


