// Generated from calcul.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, TYPE=23, IDENTIFIANT=24, 
		WHITE_SPACE=25, COMMENT=26, LINE_COMMENT=27, ENTIER=28, NEWLINE=29, OPLOG=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "TYPE", "IDENTIFIANT", "WHITE_SPACE", 
			"COMMENT", "LINE_COMMENT", "ENTIER", "NEWLINE", "OPLOG"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'input'", "'('", "')'", "'-'", "'*'", "'/'", "'+'", "'='", "'print'", 
			"'if'", "'while'", "'{'", "'}'", "'<'", "'>'", "'>='", "'<='", "'=='", 
			"'!='", "'true'", "'false'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "TYPE", 
			"IDENTIFIANT", "WHITE_SPACE", "COMMENT", "LINE_COMMENT", "ENTIER", "NEWLINE", 
			"OPLOG"
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


	public calculLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calcul.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u008d"+
		"\n\30\3\31\3\31\7\31\u0091\n\31\f\31\16\31\u0094\13\31\3\32\6\32\u0097"+
		"\n\32\r\32\16\32\u0098\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00a1\n\33\f"+
		"\33\16\33\u00a4\13\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u00ae"+
		"\n\34\3\34\7\34\u00b1\n\34\f\34\16\34\u00b4\13\34\3\34\3\34\3\35\6\35"+
		"\u00b9\n\35\r\35\16\35\u00ba\3\36\5\36\u00be\n\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u00c7\n\37\3\u00a2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\6\5\2C\\aac|\6\2\62"+
		";C\\aac|\5\2\13\13\17\17\"\"\3\2\f\f\2\u00d1\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2"+
		"\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2"+
		"\21Q\3\2\2\2\23S\3\2\2\2\25Y\3\2\2\2\27\\\3\2\2\2\31b\3\2\2\2\33d\3\2"+
		"\2\2\35f\3\2\2\2\37h\3\2\2\2!j\3\2\2\2#m\3\2\2\2%p\3\2\2\2\'s\3\2\2\2"+
		")v\3\2\2\2+{\3\2\2\2-\u0081\3\2\2\2/\u008c\3\2\2\2\61\u008e\3\2\2\2\63"+
		"\u0096\3\2\2\2\65\u009c\3\2\2\2\67\u00ad\3\2\2\29\u00b8\3\2\2\2;\u00bd"+
		"\3\2\2\2=\u00c6\3\2\2\2?@\7k\2\2@A\7p\2\2AB\7r\2\2BC\7w\2\2CD\7v\2\2D"+
		"\4\3\2\2\2EF\7*\2\2F\6\3\2\2\2GH\7+\2\2H\b\3\2\2\2IJ\7/\2\2J\n\3\2\2\2"+
		"KL\7,\2\2L\f\3\2\2\2MN\7\61\2\2N\16\3\2\2\2OP\7-\2\2P\20\3\2\2\2QR\7?"+
		"\2\2R\22\3\2\2\2ST\7r\2\2TU\7t\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2X\24\3\2"+
		"\2\2YZ\7k\2\2Z[\7h\2\2[\26\3\2\2\2\\]\7y\2\2]^\7j\2\2^_\7k\2\2_`\7n\2"+
		"\2`a\7g\2\2a\30\3\2\2\2bc\7}\2\2c\32\3\2\2\2de\7\177\2\2e\34\3\2\2\2f"+
		"g\7>\2\2g\36\3\2\2\2hi\7@\2\2i \3\2\2\2jk\7@\2\2kl\7?\2\2l\"\3\2\2\2m"+
		"n\7>\2\2no\7?\2\2o$\3\2\2\2pq\7?\2\2qr\7?\2\2r&\3\2\2\2st\7#\2\2tu\7?"+
		"\2\2u(\3\2\2\2vw\7v\2\2wx\7t\2\2xy\7w\2\2yz\7g\2\2z*\3\2\2\2{|\7h\2\2"+
		"|}\7c\2\2}~\7n\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080,\3\2\2\2\u0081\u0082"+
		"\7=\2\2\u0082.\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u008d"+
		"\7v\2\2\u0086\u0087\7f\2\2\u0087\u0088\7q\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u008a\7d\2\2\u008a\u008b\7n\2\2\u008b\u008d\7g\2\2\u008c\u0083\3\2\2"+
		"\2\u008c\u0086\3\2\2\2\u008d\60\3\2\2\2\u008e\u0092\t\2\2\2\u008f\u0091"+
		"\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\62\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\t\4\2"+
		"\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\32\2\2\u009b\64\3\2\2\2\u009c"+
		"\u009d\7\61\2\2\u009d\u009e\7,\2\2\u009e\u00a2\3\2\2\2\u009f\u00a1\13"+
		"\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7,"+
		"\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\33\2\2\u00a9"+
		"\66\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ae\7\61\2\2\u00ac\u00ae\7\'"+
		"\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af"+
		"\u00b1\n\5\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\b\34\2\2\u00b68\3\2\2\2\u00b7\u00b9\4\62;\2\u00b8\u00b7\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb:\3"+
		"\2\2\2\u00bc\u00be\7\17\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\7\f\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7~\2\2\u00c2"+
		"\u00c7\7~\2\2\u00c3\u00c4\7(\2\2\u00c4\u00c7\7(\2\2\u00c5\u00c7\7#\2\2"+
		"\u00c6\u00c1\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7>\3"+
		"\2\2\2\f\2\u008c\u0092\u0098\u00a2\u00ad\u00b2\u00ba\u00bd\u00c6\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}