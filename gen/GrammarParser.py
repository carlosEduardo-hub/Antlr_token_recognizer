# Generated from C:/Users/joseg/PycharmProjects/antlr_simple_token_recognizer\Grammar.g4 by ANTLR 4.12.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,11,9,2,0,7,0,1,0,5,0,4,8,0,10,0,12,0,7,9,0,1,0,0,0,1,0,0,1,1,
        0,1,10,8,0,5,1,0,0,0,2,4,7,0,0,0,3,2,1,0,0,0,4,7,1,0,0,0,5,3,1,0,
        0,0,5,6,1,0,0,0,6,1,1,0,0,0,7,5,1,0,0,0,1,5
    ]

class GrammarParser ( Parser ):

    grammarFileName = "Grammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "SIGLAS", "PAL", "NUM", "DATA", "HORA", 
                      "MIN", "SEG", "ESPECIAIS", "EMOJI", "CIT", "SPACE" ]

    RULE_inicio = 0

    ruleNames =  [ "inicio" ]

    EOF = Token.EOF
    SIGLAS=1
    PAL=2
    NUM=3
    DATA=4
    HORA=5
    MIN=6
    SEG=7
    ESPECIAIS=8
    EMOJI=9
    CIT=10
    SPACE=11

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class InicioContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SIGLAS(self, i:int=None):
            if i is None:
                return self.getTokens(GrammarParser.SIGLAS)
            else:
                return self.getToken(GrammarParser.SIGLAS, i)

        def PAL(self, i:int=None):
            if i is None:
                return self.getTokens(GrammarParser.PAL)
            else:
                return self.getToken(GrammarParser.PAL, i)

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(GrammarParser.NUM)
            else:
                return self.getToken(GrammarParser.NUM, i)

        def DATA(self, i:int=None):
            if i is None:
                return self.getTokens(GrammarParser.DATA)
            else:
                return self.getToken(GrammarParser.DATA, i)

        def HORA(self, i:int=None):
            if i is None:
                return self.getTokens(GrammarParser.HORA)
            else:
                return self.getToken(GrammarParser.HORA, i)

        def MIN(self, i:int=None):
            if i is None:
                return self.getTokens(GrammarParser.MIN)
            else:
                return self.getToken(GrammarParser.MIN, i)

        def SEG(self, i:int=None):
            if i is None:
                return self.getTokens(GrammarParser.SEG)
            else:
                return self.getToken(GrammarParser.SEG, i)

        def ESPECIAIS(self, i:int=None):
            if i is None:
                return self.getTokens(GrammarParser.ESPECIAIS)
            else:
                return self.getToken(GrammarParser.ESPECIAIS, i)

        def EMOJI(self, i:int=None):
            if i is None:
                return self.getTokens(GrammarParser.EMOJI)
            else:
                return self.getToken(GrammarParser.EMOJI, i)

        def CIT(self, i:int=None):
            if i is None:
                return self.getTokens(GrammarParser.CIT)
            else:
                return self.getToken(GrammarParser.CIT, i)

        def getRuleIndex(self):
            return GrammarParser.RULE_inicio

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInicio" ):
                listener.enterInicio(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInicio" ):
                listener.exitInicio(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInicio" ):
                return visitor.visitInicio(self)
            else:
                return visitor.visitChildren(self)




    def inicio(self):

        localctx = GrammarParser.InicioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_inicio)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 5
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 2046) != 0):
                self.state = 2
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 2046) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 7
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





