# Generated from C:/Users/joseg/PycharmProjects/antlr_simple_token_recognizer\Grammar.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser

# This class defines a complete generic visitor for a parse tree produced by GrammarParser.

class GrammarVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by GrammarParser#inicio.
    def visitInicio(self, ctx:GrammarParser.InicioContext):
        return self.visitChildren(ctx)



del GrammarParser