// Generated from C:/Users/joseg/PycharmProjects/antlr_simple_token_recognizer\Grammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIGLAS=1, PAL=2, NUM=3, DATA=4, HORA=5, MIN=6, SEG=7, ESPECIAIS=8, EMOJI=9, 
		CIT=10, SPACE=11;
	public static final int
		RULE_inicio = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SIGLAS", "PAL", "NUM", "DATA", "HORA", "MIN", "SEG", "ESPECIAIS", 
			"EMOJI", "CIT", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public List<TerminalNode> SIGLAS() { return getTokens(GrammarParser.SIGLAS); }
		public TerminalNode SIGLAS(int i) {
			return getToken(GrammarParser.SIGLAS, i);
		}
		public List<TerminalNode> PAL() { return getTokens(GrammarParser.PAL); }
		public TerminalNode PAL(int i) {
			return getToken(GrammarParser.PAL, i);
		}
		public List<TerminalNode> NUM() { return getTokens(GrammarParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GrammarParser.NUM, i);
		}
		public List<TerminalNode> DATA() { return getTokens(GrammarParser.DATA); }
		public TerminalNode DATA(int i) {
			return getToken(GrammarParser.DATA, i);
		}
		public List<TerminalNode> HORA() { return getTokens(GrammarParser.HORA); }
		public TerminalNode HORA(int i) {
			return getToken(GrammarParser.HORA, i);
		}
		public List<TerminalNode> MIN() { return getTokens(GrammarParser.MIN); }
		public TerminalNode MIN(int i) {
			return getToken(GrammarParser.MIN, i);
		}
		public List<TerminalNode> SEG() { return getTokens(GrammarParser.SEG); }
		public TerminalNode SEG(int i) {
			return getToken(GrammarParser.SEG, i);
		}
		public List<TerminalNode> ESPECIAIS() { return getTokens(GrammarParser.ESPECIAIS); }
		public TerminalNode ESPECIAIS(int i) {
			return getToken(GrammarParser.ESPECIAIS, i);
		}
		public List<TerminalNode> EMOJI() { return getTokens(GrammarParser.EMOJI); }
		public TerminalNode EMOJI(int i) {
			return getToken(GrammarParser.EMOJI, i);
		}
		public List<TerminalNode> CIT() { return getTokens(GrammarParser.CIT); }
		public TerminalNode CIT(int i) {
			return getToken(GrammarParser.CIT, i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2046L) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2046L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b\t\u0002\u0000\u0007\u0000\u0001\u0000\u0005\u0000\u0004"+
		"\b\u0000\n\u0000\f\u0000\u0007\t\u0000\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0001\u0000\u0001\n\b\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0002\u0004\u0007\u0000\u0000\u0000\u0003\u0002\u0001\u0000\u0000\u0000"+
		"\u0004\u0007\u0001\u0000\u0000\u0000\u0005\u0003\u0001\u0000\u0000\u0000"+
		"\u0005\u0006\u0001\u0000\u0000\u0000\u0006\u0001\u0001\u0000\u0000\u0000"+
		"\u0007\u0005\u0001\u0000\u0000\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}