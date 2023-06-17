// Generated from C:/Users/joseg/PycharmProjects/antlr_simple_token_recognizer\Grammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIGLAS=1, PAL=2, NUM=3, DATA=4, HORA=5, MIN=6, SEG=7, ESPECIAIS=8, EMOJI=9, 
		CIT=10, SPACE=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SIGLAS", "PAL", "NUM", "DATA", "HORA", "MIN", "SEG", "ESPECIAIS", "EMOJI", 
			"CIT", "SPACE"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000b\u00c8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000N\b\u0000\u0001\u0001\u0004\u0001Q\b\u0001\u000b\u0001\f\u0001R"+
		"\u0001\u0002\u0004\u0002V\b\u0002\u000b\u0002\f\u0002W\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004f\b"+
		"\u0004\u000b\u0004\f\u0004g\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004v\b\u0004\u0001\u0005\u0004"+
		"\u0005y\b\u0005\u000b\u0005\f\u0005z\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u008d\b\u0005\u0001\u0006\u0004\u0006\u0090\b"+
		"\u0006\u000b\u0006\f\u0006\u0091\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a6\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00b4"+
		"\b\u0007\u000b\u0007\f\u0007\u00b5\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00be\b\t\n\t\f\t\u00c1\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0001\u0000\n\u0015\u0000AZaz\u00a0\u00a4\u00a7\u00aa\u00ac"+
		"\u00ad\u00af\u00af\u00b2\u00b5\u00b9\u00bb\u00c3\u00c3\u0152\u0152\u0160"+
		"\u0161\u0192\u0192\u02c6\u02c6\u2019\u201a\u201c\u201e\u2021\u2022\u2030"+
		"\u2030\u203a\u203a\u20ac\u20ac\u2122\u2122\u8000\ufffd\u8000\ufffd\u0001"+
		"\u000009\u0001\u000003\u0001\u000001\u0007\u0000!!#&(*--==@@__\u0004\u0000"+
		"[[]]{{}}\u0005\u0000,,./:<>?~~\u0003\u0000++01\u01f6\u01f6\u0003\u0000"+
		"\n\n\r\r\"\"\u0003\u0000\t\n\r\r  \u00ee\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001"+
		"M\u0001\u0000\u0000\u0000\u0003P\u0001\u0000\u0000\u0000\u0005U\u0001"+
		"\u0000\u0000\u0000\u0007Y\u0001\u0000\u0000\u0000\te\u0001\u0000\u0000"+
		"\u0000\u000bx\u0001\u0000\u0000\u0000\r\u008f\u0001\u0000\u0000\u0000"+
		"\u000f\u00b3\u0001\u0000\u0000\u0000\u0011\u00b7\u0001\u0000\u0000\u0000"+
		"\u0013\u00b9\u0001\u0000\u0000\u0000\u0015\u00c4\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0005P\u0000\u0000\u0018\u0019\u0005D\u0000\u0000\u0019N"+
		"\u0005F\u0000\u0000\u001a\u001b\u0005A\u0000\u0000\u001b\u001c\u0005B"+
		"\u0000\u0000\u001c\u001d\u0005N\u0000\u0000\u001dN\u0005T\u0000\u0000"+
		"\u001e\u001f\u0005A\u0000\u0000\u001f \u0005B\u0000\u0000 !\u0005N\u0000"+
		"\u0000!\"\u0005T\u0000\u0000\"N\u00052\u0000\u0000#$\u0005U\u0000\u0000"+
		"$%\u0005S\u0000\u0000%N\u0005B\u0000\u0000&\'\u0005L\u0000\u0000\'(\u0005"+
		"E\u0000\u0000(N\u0005D\u0000\u0000)*\u0005R\u0000\u0000*+\u0005G\u0000"+
		"\u0000+N\u0005B\u0000\u0000,-\u00055\u0000\u0000-N\u0005G\u0000\u0000"+
		"./\u0005P\u0000\u0000/N\u0005C\u0000\u000001\u0005T\u0000\u00001N\u0005"+
		"V\u0000\u000023\u0005p\u0000\u000034\u0005d\u0000\u00004N\u0005f\u0000"+
		"\u000056\u0005a\u0000\u000067\u0005b\u0000\u000078\u0005n\u0000\u0000"+
		"8N\u0005t\u0000\u00009:\u0005a\u0000\u0000:;\u0005b\u0000\u0000;<\u0005"+
		"n\u0000\u0000<=\u0005t\u0000\u0000=N\u00052\u0000\u0000>?\u0005u\u0000"+
		"\u0000?@\u0005s\u0000\u0000@N\u0005b\u0000\u0000AB\u0005l\u0000\u0000"+
		"BC\u0005e\u0000\u0000CN\u0005d\u0000\u0000DE\u0005r\u0000\u0000EF\u0005"+
		"g\u0000\u0000FN\u0005b\u0000\u0000GH\u00055\u0000\u0000HN\u0005g\u0000"+
		"\u0000IJ\u0005p\u0000\u0000JN\u0005c\u0000\u0000KL\u0005t\u0000\u0000"+
		"LN\u0005v\u0000\u0000M\u0017\u0001\u0000\u0000\u0000M\u001a\u0001\u0000"+
		"\u0000\u0000M\u001e\u0001\u0000\u0000\u0000M#\u0001\u0000\u0000\u0000"+
		"M&\u0001\u0000\u0000\u0000M)\u0001\u0000\u0000\u0000M,\u0001\u0000\u0000"+
		"\u0000M.\u0001\u0000\u0000\u0000M0\u0001\u0000\u0000\u0000M2\u0001\u0000"+
		"\u0000\u0000M5\u0001\u0000\u0000\u0000M9\u0001\u0000\u0000\u0000M>\u0001"+
		"\u0000\u0000\u0000MA\u0001\u0000\u0000\u0000MD\u0001\u0000\u0000\u0000"+
		"MG\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000N\u0002\u0001\u0000\u0000\u0000OQ\u0007\u0000\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000S\u0004\u0001\u0000\u0000\u0000TV\u0007\u0001"+
		"\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0006\u0001\u0000\u0000"+
		"\u0000YZ\u0007\u0002\u0000\u0000Z[\u0007\u0001\u0000\u0000[\\\u0005/\u0000"+
		"\u0000\\]\u0007\u0003\u0000\u0000]^\u0007\u0001\u0000\u0000^_\u0005/\u0000"+
		"\u0000_`\u0007\u0001\u0000\u0000`a\u0007\u0001\u0000\u0000ab\u0007\u0001"+
		"\u0000\u0000bc\u0007\u0001\u0000\u0000c\b\u0001\u0000\u0000\u0000df\u0007"+
		"\u0001\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hu\u0001\u0000\u0000"+
		"\u0000ij\u0005h\u0000\u0000jv\u0005r\u0000\u0000kl\u0005h\u0000\u0000"+
		"lm\u0005o\u0000\u0000mn\u0005r\u0000\u0000nv\u0005a\u0000\u0000ov\u0005"+
		"h\u0000\u0000pq\u0005h\u0000\u0000qr\u0005o\u0000\u0000rs\u0005r\u0000"+
		"\u0000st\u0005a\u0000\u0000tv\u0005s\u0000\u0000ui\u0001\u0000\u0000\u0000"+
		"uk\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000up\u0001\u0000\u0000"+
		"\u0000v\n\u0001\u0000\u0000\u0000wy\u0007\u0001\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{\u008c\u0001\u0000\u0000\u0000|}\u0005m\u0000\u0000"+
		"}~\u0005i\u0000\u0000~\u008d\u0005n\u0000\u0000\u007f\u0080\u0005m\u0000"+
		"\u0000\u0080\u0081\u0005i\u0000\u0000\u0081\u0082\u0005n\u0000\u0000\u0082"+
		"\u0083\u0005u\u0000\u0000\u0083\u0084\u0005t\u0000\u0000\u0084\u008d\u0005"+
		"o\u0000\u0000\u0085\u0086\u0005m\u0000\u0000\u0086\u0087\u0005i\u0000"+
		"\u0000\u0087\u0088\u0005n\u0000\u0000\u0088\u0089\u0005u\u0000\u0000\u0089"+
		"\u008a\u0005t\u0000\u0000\u008a\u008b\u0005o\u0000\u0000\u008b\u008d\u0005"+
		"s\u0000\u0000\u008c|\u0001\u0000\u0000\u0000\u008c\u007f\u0001\u0000\u0000"+
		"\u0000\u008c\u0085\u0001\u0000\u0000\u0000\u008d\f\u0001\u0000\u0000\u0000"+
		"\u008e\u0090\u0007\u0001\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u00a5\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005s\u0000\u0000\u0094\u0095\u0005e\u0000\u0000\u0095\u00a6"+
		"\u0005g\u0000\u0000\u0096\u0097\u0005s\u0000\u0000\u0097\u0098\u0005e"+
		"\u0000\u0000\u0098\u0099\u0005g\u0000\u0000\u0099\u009a\u0005u\u0000\u0000"+
		"\u009a\u009b\u0005n\u0000\u0000\u009b\u009c\u0005d\u0000\u0000\u009c\u00a6"+
		"\u0005o\u0000\u0000\u009d\u009e\u0005s\u0000\u0000\u009e\u009f\u0005e"+
		"\u0000\u0000\u009f\u00a0\u0005g\u0000\u0000\u00a0\u00a1\u0005n\u0000\u0000"+
		"\u00a1\u00a2\u0005d\u0000\u0000\u00a2\u00a3\u0005o\u0000\u0000\u00a3\u00a6"+
		"\u0005s\u0000\u0000\u00a4\u00a6\u0005s\u0000\u0000\u00a5\u0093\u0001\u0000"+
		"\u0000\u0000\u00a5\u0096\u0001\u0000\u0000\u0000\u00a5\u009d\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u000e\u0001\u0000"+
		"\u0000\u0000\u00a7\u00b4\u0007\u0004\u0000\u0000\u00a8\u00a9\u0005+\u0000"+
		"\u0000\u00a9\u00aa\u0005\u00c2\u0000\u0000\u00aa\u00b4\u0005\u00a7\u0000"+
		"\u0000\u00ab\u00ac\u0005\u00c2\u0000\u0000\u00ac\u00b4\u0005\u00b0\u0000"+
		"\u0000\u00ad\u00b4\u0007\u0005\u0000\u0000\u00ae\u00af\u0005\u00c2\u0000"+
		"\u0000\u00af\u00b4\u0005\u00aa\u0000\u0000\u00b0\u00b1\u0005\u00c2\u0000"+
		"\u0000\u00b1\u00b4\u0005\u00ba\u0000\u0000\u00b2\u00b4\u0007\u0006\u0000"+
		"\u0000\u00b3\u00a7\u0001\u0000\u0000\u0000\u00b3\u00a8\u0001\u0000\u0000"+
		"\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u0010\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\u0007\u0000"+
		"\u0000\u00b8\u0012\u0001\u0000\u0000\u0000\u00b9\u00bf\u0005\"\u0000\u0000"+
		"\u00ba\u00be\b\b\u0000\u0000\u00bb\u00bc\u0005\\\u0000\u0000\u00bc\u00be"+
		"\u0005\"\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\"\u0000\u0000\u00c3\u0014\u0001\u0000\u0000\u0000\u00c4\u00c5\u0007\t"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0006\n\u0000"+
		"\u0000\u00c7\u0016\u0001\u0000\u0000\u0000\u000e\u0000MRWguz\u008c\u0091"+
		"\u00a5\u00b3\u00b5\u00bd\u00bf\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}