// Generated from C:/Users/Projects-Java-Link/Expr3/src/main/antlr\Expr.g4 by ANTLR 4.7
package in.kyle.expr.generated;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ARG_SEP=3, NAME=4, PAR_OPEN=5, PAR_CLOSE=6, ADD=7, SUB=8, 
		DIV=9, MUL=10, MOD=11, EXP=12, ABS=13, GTE=14, LTE=15, EQ=16, GT=17, LT=18, 
		WS=19, INT=20;
	public static final int
		RULE_operation = 0, RULE_expr = 1, RULE_assignment = 2, RULE_function_call = 3, 
		RULE_number = 4;
	public static final String[] ruleNames = {
		"operation", "expr", "assignment", "function_call", "number"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OperationContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operation);
		try {
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				expr(0);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ABSContext extends ExprContext {
		public List<TerminalNode> ABS() { return getTokens(ExprParser.ABS); }
		public TerminalNode ABS(int i) {
			return getToken(ExprParser.ABS, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ABSContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitABS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARENSContext extends ExprContext {
		public TerminalNode PAR_OPEN() { return getToken(ExprParser.PAR_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ExprParser.PAR_CLOSE, 0); }
		public PARENSContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPARENS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IMP_MUL_2Context extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public IMP_MUL_2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIMP_MUL_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OP_MODContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(ExprParser.MOD, 0); }
		public OP_MODContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOP_MOD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OP_GETVARContext extends ExprContext {
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public OP_GETVARContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOP_GETVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OP_ADDSUBContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public OP_ADDSUBContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOP_ADDSUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OP_COMPAREContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public TerminalNode GT() { return getToken(ExprParser.GT, 0); }
		public TerminalNode GTE() { return getToken(ExprParser.GTE, 0); }
		public TerminalNode LT() { return getToken(ExprParser.LT, 0); }
		public TerminalNode LTE() { return getToken(ExprParser.LTE, 0); }
		public OP_COMPAREContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOP_COMPARE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OP_FUNCContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public OP_FUNCContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOP_FUNC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OP_MULDIVContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public OP_MULDIVContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOP_MULDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OP_EXPContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXP() { return getToken(ExprParser.EXP, 0); }
		public OP_EXPContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOP_EXP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IMP_MULContext extends ExprContext {
		public List<TerminalNode> PAR_OPEN() { return getTokens(ExprParser.PAR_OPEN); }
		public TerminalNode PAR_OPEN(int i) {
			return getToken(ExprParser.PAR_OPEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> PAR_CLOSE() { return getTokens(ExprParser.PAR_CLOSE); }
		public TerminalNode PAR_CLOSE(int i) {
			return getToken(ExprParser.PAR_CLOSE, i);
		}
		public IMP_MULContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIMP_MUL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OP_NUMBERContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OP_NUMBERContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOP_NUMBER(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new OP_FUNCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(15);
				function_call();
				}
				break;
			case 2:
				{
				_localctx = new ABSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				match(ABS);
				setState(17);
				expr(0);
				setState(18);
				match(ABS);
				}
				break;
			case 3:
				{
				_localctx = new IMP_MULContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(PAR_OPEN);
				setState(21);
				expr(0);
				setState(22);
				match(PAR_CLOSE);
				setState(23);
				match(PAR_OPEN);
				setState(24);
				expr(0);
				setState(25);
				match(PAR_CLOSE);
				}
				break;
			case 4:
				{
				_localctx = new IMP_MUL_2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUB:
				case INT:
					{
					setState(27);
					number();
					setState(28);
					match(NAME);
					}
					break;
				case NAME:
					{
					setState(30);
					match(NAME);
					setState(31);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				{
				_localctx = new PARENSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(PAR_OPEN);
				setState(35);
				expr(0);
				setState(36);
				match(PAR_CLOSE);
				}
				break;
			case 6:
				{
				_localctx = new OP_GETVARContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(NAME);
				}
				break;
			case 7:
				{
				_localctx = new OP_NUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				number();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new OP_EXPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(42);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(43);
						match(EXP);
						setState(44);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new OP_MULDIVContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(45);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(46);
						((OP_MULDIVContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
							((OP_MULDIVContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(47);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new OP_MODContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(49);
						match(MOD);
						}
						setState(50);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new OP_ADDSUBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(52);
						((OP_ADDSUBContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((OP_ADDSUBContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(53);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new OP_COMPAREContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(55);
						((OP_COMPAREContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTE) | (1L << LTE) | (1L << EQ) | (1L << GT) | (1L << LT))) != 0)) ) {
							((OP_COMPAREContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(56);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(NAME);
			setState(63);
			match(EQ);
			setState(64);
			expr(0);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ExprParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ExprParser.PAR_CLOSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ARG_SEP() { return getTokens(ExprParser.ARG_SEP); }
		public TerminalNode ARG_SEP(int i) {
			return getToken(ExprParser.ARG_SEP, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_call);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(NAME);
				setState(67);
				match(PAR_OPEN);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << PAR_OPEN) | (1L << SUB) | (1L << ABS) | (1L << INT))) != 0)) {
					{
					setState(68);
					expr(0);
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ARG_SEP) {
						{
						{
						setState(69);
						match(ARG_SEP);
						setState(70);
						expr(0);
						}
						}
						setState(75);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(78);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(NAME);
				setState(80);
				expr(0);
				}
				break;
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

	public static class NumberContext extends ParserRuleContext {
		public Token power;
		public List<TerminalNode> INT() { return getTokens(ExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExprParser.INT, i);
		}
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(83);
				match(SUB);
				}
			}

			setState(86);
			match(INT);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(87);
				match(T__0);
				setState(88);
				match(INT);
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				{
				setState(91);
				match(T__1);
				}
				setState(92);
				((NumberContext)_localctx).power = match(INT);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26b\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\7\5J\n\5\f\5\16\5M\13\5\5\5O\n\5\3\5\3\5\3\5\5\5T\n\5\3\6\5\6W\n\6"+
		"\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\5\6`\n\6\3\6\2\3\4\7\2\4\6\b\n\2\5\3\2"+
		"\13\f\3\2\t\n\3\2\20\24\2o\2\16\3\2\2\2\4*\3\2\2\2\6@\3\2\2\2\bS\3\2\2"+
		"\2\nV\3\2\2\2\f\17\5\6\4\2\r\17\5\4\3\2\16\f\3\2\2\2\16\r\3\2\2\2\17\3"+
		"\3\2\2\2\20\21\b\3\1\2\21+\5\b\5\2\22\23\7\17\2\2\23\24\5\4\3\2\24\25"+
		"\7\17\2\2\25+\3\2\2\2\26\27\7\7\2\2\27\30\5\4\3\2\30\31\7\b\2\2\31\32"+
		"\7\7\2\2\32\33\5\4\3\2\33\34\7\b\2\2\34+\3\2\2\2\35\36\5\n\6\2\36\37\7"+
		"\6\2\2\37#\3\2\2\2 !\7\6\2\2!#\5\n\6\2\"\35\3\2\2\2\" \3\2\2\2#+\3\2\2"+
		"\2$%\7\7\2\2%&\5\4\3\2&\'\7\b\2\2\'+\3\2\2\2(+\7\6\2\2)+\5\n\6\2*\20\3"+
		"\2\2\2*\22\3\2\2\2*\26\3\2\2\2*\"\3\2\2\2*$\3\2\2\2*(\3\2\2\2*)\3\2\2"+
		"\2+=\3\2\2\2,-\f\r\2\2-.\7\16\2\2.<\5\4\3\16/\60\f\f\2\2\60\61\t\2\2\2"+
		"\61<\5\4\3\r\62\63\f\13\2\2\63\64\7\r\2\2\64<\5\4\3\f\65\66\f\n\2\2\66"+
		"\67\t\3\2\2\67<\5\4\3\1389\f\t\2\29:\t\4\2\2:<\5\4\3\n;,\3\2\2\2;/\3\2"+
		"\2\2;\62\3\2\2\2;\65\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>"+
		"\5\3\2\2\2?=\3\2\2\2@A\7\6\2\2AB\7\22\2\2BC\5\4\3\2C\7\3\2\2\2DE\7\6\2"+
		"\2EN\7\7\2\2FK\5\4\3\2GH\7\5\2\2HJ\5\4\3\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2"+
		"\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NF\3\2\2\2NO\3\2\2\2OP\3\2\2\2PT\7\b\2"+
		"\2QR\7\6\2\2RT\5\4\3\2SD\3\2\2\2SQ\3\2\2\2T\t\3\2\2\2UW\7\n\2\2VU\3\2"+
		"\2\2VW\3\2\2\2WX\3\2\2\2X[\7\26\2\2YZ\7\3\2\2Z\\\7\26\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\_\3\2\2\2]^\7\4\2\2^`\7\26\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2"+
		"\2\r\16\"*;=KNSV[_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}