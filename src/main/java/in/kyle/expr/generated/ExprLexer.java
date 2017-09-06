// Generated from C:/Users/Projects-Java-Link/Expr3/src/main/antlr\Expr.g4 by ANTLR 4.7
package in.kyle.expr.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ARG_SEP=4, NAME=5, PAR_OPEN=6, PAR_CLOSE=7, ADD=8, 
		SUB=9, DIV=10, MUL=11, MOD=12, EXP=13, ABS=14, GTE=15, LTE=16, EQ=17, 
		GT=18, LT=19, WS=20, INT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "ARG_SEP", "NAME", "PAR_OPEN", "PAR_CLOSE", "ADD", 
		"SUB", "DIV", "MUL", "MOD", "EXP", "ABS", "GTE", "LTE", "EQ", "GT", "LT", 
		"WS", "INT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'e'", "'E'", "','", null, "'('", "')'", "'+'", "'-'", "'/'", 
		"'*'", "'%'", "'^'", "'|'", "'>='", "'<='", "'='", "'>'", "'<'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ARG_SEP", "NAME", "PAR_OPEN", "PAR_CLOSE", "ADD", 
		"SUB", "DIV", "MUL", "MOD", "EXP", "ABS", "GTE", "LTE", "EQ", "GT", "LT", 
		"WS", "INT"
	};
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\6\6\67\n\6\r\6\16\68\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\6\26^\n\26\r\26\16"+
		"\26_\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\4\4\2C\\c|\3\2\62;\2b\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7"+
		"\61\3\2\2\2\t\63\3\2\2\2\13\66\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21>\3\2"+
		"\2\2\23@\3\2\2\2\25B\3\2\2\2\27D\3\2\2\2\31F\3\2\2\2\33H\3\2\2\2\35J\3"+
		"\2\2\2\37L\3\2\2\2!O\3\2\2\2#R\3\2\2\2%T\3\2\2\2\'V\3\2\2\2)X\3\2\2\2"+
		"+]\3\2\2\2-.\7\60\2\2.\4\3\2\2\2/\60\7g\2\2\60\6\3\2\2\2\61\62\7G\2\2"+
		"\62\b\3\2\2\2\63\64\7.\2\2\64\n\3\2\2\2\65\67\t\2\2\2\66\65\3\2\2\2\67"+
		"8\3\2\2\28\66\3\2\2\289\3\2\2\29\f\3\2\2\2:;\7*\2\2;\16\3\2\2\2<=\7+\2"+
		"\2=\20\3\2\2\2>?\7-\2\2?\22\3\2\2\2@A\7/\2\2A\24\3\2\2\2BC\7\61\2\2C\26"+
		"\3\2\2\2DE\7,\2\2E\30\3\2\2\2FG\7\'\2\2G\32\3\2\2\2HI\7`\2\2I\34\3\2\2"+
		"\2JK\7~\2\2K\36\3\2\2\2LM\7@\2\2MN\7?\2\2N \3\2\2\2OP\7>\2\2PQ\7?\2\2"+
		"Q\"\3\2\2\2RS\7?\2\2S$\3\2\2\2TU\7@\2\2U&\3\2\2\2VW\7>\2\2W(\3\2\2\2X"+
		"Y\7\"\2\2YZ\3\2\2\2Z[\b\25\2\2[*\3\2\2\2\\^\t\3\2\2]\\\3\2\2\2^_\3\2\2"+
		"\2_]\3\2\2\2_`\3\2\2\2`,\3\2\2\2\5\28_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}