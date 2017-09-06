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
		T__0=1, T__1=2, ARG_SEP=3, NAME=4, PAR_OPEN=5, PAR_CLOSE=6, ADD=7, SUB=8, 
		DIV=9, MUL=10, MOD=11, EXP=12, ABS=13, GTE=14, LTE=15, EQ=16, GT=17, LT=18, 
		WS=19, INT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ARG_SEP", "NAME", "PAR_OPEN", "PAR_CLOSE", "ADD", "SUB", 
		"DIV", "MUL", "MOD", "EXP", "ABS", "GTE", "LTE", "EQ", "GT", "LT", "WS", 
		"INT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'E'", "','", null, "'('", "')'", "'+'", "'-'", "'/'", "'*'", 
		"'%'", "'^'", "'|'", "'>='", "'<='", "'='", "'>'", "'<'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ARG_SEP", "NAME", "PAR_OPEN", "PAR_CLOSE", "ADD", "SUB", 
		"DIV", "MUL", "MOD", "EXP", "ABS", "GTE", "LTE", "EQ", "GT", "LT", "WS", 
		"INT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\63\n\5"+
		"\r\5\16\5\64\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\6\25Z\n\25\r\25\16\25[\2\2\26\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26\3\2\4\4\2C\\c|\3\2\62;\2^\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\62\3\2\2\2\13\66"+
		"\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27"+
		"B\3\2\2\2\31D\3\2\2\2\33F\3\2\2\2\35H\3\2\2\2\37K\3\2\2\2!N\3\2\2\2#P"+
		"\3\2\2\2%R\3\2\2\2\'T\3\2\2\2)Y\3\2\2\2+,\7\60\2\2,\4\3\2\2\2-.\7G\2\2"+
		".\6\3\2\2\2/\60\7.\2\2\60\b\3\2\2\2\61\63\t\2\2\2\62\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\n\3\2\2\2\66\67\7*\2\2\67\f\3"+
		"\2\2\289\7+\2\29\16\3\2\2\2:;\7-\2\2;\20\3\2\2\2<=\7/\2\2=\22\3\2\2\2"+
		">?\7\61\2\2?\24\3\2\2\2@A\7,\2\2A\26\3\2\2\2BC\7\'\2\2C\30\3\2\2\2DE\7"+
		"`\2\2E\32\3\2\2\2FG\7~\2\2G\34\3\2\2\2HI\7@\2\2IJ\7?\2\2J\36\3\2\2\2K"+
		"L\7>\2\2LM\7?\2\2M \3\2\2\2NO\7?\2\2O\"\3\2\2\2PQ\7@\2\2Q$\3\2\2\2RS\7"+
		">\2\2S&\3\2\2\2TU\7\"\2\2UV\3\2\2\2VW\b\24\2\2W(\3\2\2\2XZ\t\3\2\2YX\3"+
		"\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\*\3\2\2\2\5\2\64[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}