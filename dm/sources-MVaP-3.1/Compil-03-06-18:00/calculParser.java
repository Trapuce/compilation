// Generated from calcul.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, TYPE=23, IDENTIFIANT=24, 
		WHITE_SPACE=25, COMMENT=26, LINE_COMMENT=27, ENTIER=28, NEWLINE=29;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_instruction = 2, RULE_expr = 3, 
		RULE_decl = 4, RULE_assignation = 5, RULE_statement = 6, RULE_loop = 7, 
		RULE_bloc = 8, RULE_condition = 9, RULE_finInstruction = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "instruction", "expr", "decl", "assignation", "statement", 
			"loop", "bloc", "condition", "finInstruction"
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
			"IDENTIFIANT", "WHITE_SPACE", "COMMENT", "LINE_COMMENT", "ENTIER", "NEWLINE"
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
	public String getGrammarFileName() { return "calcul.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	     private int _cur_label = 1;
	    /** générateur de nom d'étiquettes pour les boucles */
	    private String getNewLabel() { return "Label" +(_cur_label++); }
	    // ...
	       private TablesSymboles tablesSymboles = new TablesSymboles();

	    private String evalexpr (String x, String op, String y) {
	        if ( op.equals("*") ){
	            return x+y + "MUL\n";
	        } else if ( op.equals("+") ){
	            return x+y+"ADD\n";
	        }else if ( op.equals("/") ){
	            return x+y+"DIV\n";
	        }else if ( op.equals("-") ){
	            return x+y+"SUB\n";
	        }   
	        else {
	           System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
	           throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
	        }
	    }


	public calculParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(calculParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			calcul();
			setState(23);
			match(EOF);
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

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public InstructionContext instruction;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(calculParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(calculParser.NEWLINE, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(25);
				((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33);
					match(NEWLINE);
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(39);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "  HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
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

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public ExprContext expr;
		public AssignationContext assignation;
		public StatementContext statement;
		public LoopContext loop;
		public BlocContext bloc;
		public ConditionContext condition;
		public Token IDENTIFIANT;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode IDENTIFIANT() { return getToken(calculParser.IDENTIFIANT, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((InstructionContext)_localctx).expr = expr(0);
				setState(50);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expr.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((InstructionContext)_localctx).assignation = assignation();
				setState(54);
				finInstruction();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				((InstructionContext)_localctx).statement = statement();
				setState(58);
				finInstruction();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).statement.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				((InstructionContext)_localctx).loop = loop();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).loop.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				((InstructionContext)_localctx).bloc = bloc();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				((InstructionContext)_localctx).condition = condition();
				setState(68);
				finInstruction();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).condition.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				match(T__0);
				setState(72);
				match(T__1);
				setState(73);
				((InstructionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(74);
				match(T__2);
				setState(75);
				finInstruction();

				             VariableInfo vi = tablesSymboles.getVar((((InstructionContext)_localctx).IDENTIFIANT!=null?((InstructionContext)_localctx).IDENTIFIANT.getText():null));
				             ((InstructionContext)_localctx).code =  "READ\nSTOREG "+vi.address+"\n";
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
				finInstruction();

				            ((InstructionContext)_localctx).code = "";
				        
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
		public String code;
		public ExprContext a;
		public Token ENTIER;
		public Token IDENTIFIANT;
		public Token op;
		public ExprContext b;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENTIER() { return getToken(calculParser.ENTIER, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(calculParser.IDENTIFIANT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitExpr(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(84);
				match(T__3);
				setState(85);
				((ExprContext)_localctx).a = expr(6);
				 ((ExprContext)_localctx).code =    "PUSHI -1\n" + ((ExprContext)_localctx).a.code  + "MUL \n" ;
				}
				break;
			case T__1:
				{
				setState(88);
				match(T__1);
				setState(89);
				((ExprContext)_localctx).a = expr(0);
				setState(90);
				match(T__2);
				((ExprContext)_localctx).code =  ((ExprContext)_localctx).a.code;
				}
				break;
			case ENTIER:
				{
				setState(93);
				((ExprContext)_localctx).ENTIER = match(ENTIER);
				((ExprContext)_localctx).code =  "PUSHI " + (((ExprContext)_localctx).ENTIER!=null?((ExprContext)_localctx).ENTIER.getText():null)+"\n";
				}
				break;
			case IDENTIFIANT:
				{
				setState(95);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				        VariableInfo vi = tablesSymboles.getVar((((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null));
				        ((ExprContext)_localctx).code =  "PUSHG "+vi.address+"\n";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(100);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						((ExprContext)_localctx).b = expr(6);
						((ExprContext)_localctx).code =  evalexpr(((ExprContext)_localctx).a.code ,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).b.code);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(105);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__6) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						((ExprContext)_localctx).b = expr(5);
						((ExprContext)_localctx).code =  evalexpr(((ExprContext)_localctx).a.code ,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null) ,((ExprContext)_localctx).b.code);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExprContext expr;
		public TerminalNode TYPE() { return getToken(calculParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(calculParser.IDENTIFIANT, 0); }
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(TYPE);
				setState(115);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(116);
				finInstruction();

				            ((DeclContext)_localctx).code =  "PUSHI 0 \n";
				            tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(TYPE);
				setState(120);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(121);
				match(T__7);
				setState(122);
				((DeclContext)_localctx).expr = expr(0);
				setState(123);
				finInstruction();

				            tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
				            VariableInfo vi = tablesSymboles.getVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null));
				            ((DeclContext)_localctx).code =  "PUSHI 0 \n" + ((DeclContext)_localctx).expr.code + "STOREG "+ vi.address+"\n"; 

				        
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

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExprContext expr;
		public List<TerminalNode> IDENTIFIANT() { return getTokens(calculParser.IDENTIFIANT); }
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(calculParser.IDENTIFIANT, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignation);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(129);
				match(T__7);
				setState(130);
				((AssignationContext)_localctx).expr = expr(0);
				  

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expr.code + "STOREG "+ vi.address+"\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(134);
				match(T__6);
				setState(135);
				match(T__7);
				setState(136);
				((AssignationContext)_localctx).expr = expr(0);

				        VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				        ((AssignationContext)_localctx).code =  "PUSHG "+vi.address+"\n";
				        _localctx.code +=  ((AssignationContext)_localctx).expr.code + "ADD\n";
				        _localctx.code += "STOREG "+vi.address+"\n";

				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(140);
				match(T__7);
				setState(141);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(142);
				match(T__6);
				setState(143);
				((AssignationContext)_localctx).expr = expr(0);

				        VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				        ((AssignationContext)_localctx).code =  "PUSHG "+vi.address+"\n";
				        _localctx.code +=  ((AssignationContext)_localctx).expr.code + "ADD\n";
				        _localctx.code += "STOREG "+vi.address+"\n";

				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(T__8);
				setState(147);
				match(T__1);
				setState(148);
				((AssignationContext)_localctx).expr = expr(0);
				setState(149);
				match(T__2);

				            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expr.code+"WRITE\nPOP\n";
				        
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

	public static class StatementContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__9);
			setState(155);
			match(T__1);
			setState(156);
			condition();
			setState(157);
			match(T__2);
			setState(158);
			bloc();
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

	public static class LoopContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext instruction;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__10);
			setState(161);
			match(T__1);
			setState(162);
			((LoopContext)_localctx).condition = condition();
			setState(163);
			match(T__2);
			setState(164);
			((LoopContext)_localctx).instruction = instruction();
			 String start = getNewLabel() ; String end = getNewLabel() ;
			        ((LoopContext)_localctx).code =  "LABEL " + start +"\n" ;
			        _localctx.code += ((LoopContext)_localctx).condition.code ;
			        _localctx.code += "JUMPF " + end +"\n" ;
			        _localctx.code += ((LoopContext)_localctx).instruction.code ;
			        _localctx.code += "JUMP " + start + "\n" ;
			        _localctx.code +="LABEL " + end +"\n" ;
			    
			    
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

	public static class BlocContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(calculParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(calculParser.NEWLINE, i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__11);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(168);
				((BlocContext)_localctx).instruction = instruction();
				 _localctx.code += ((BlocContext)_localctx).instruction.code; 
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__12);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(NEWLINE);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ExprContext a;
		public ExprContext b;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((ConditionContext)_localctx).a = expr(0);
				setState(184);
				match(T__13);
				setState(185);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INF\n";  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				((ConditionContext)_localctx).a = expr(0);
				setState(189);
				match(T__14);
				setState(190);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUP\n";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				((ConditionContext)_localctx).a = expr(0);
				setState(194);
				match(T__15);
				setState(195);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUPEQUAL\n";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				((ConditionContext)_localctx).a = expr(0);
				setState(199);
				match(T__16);
				setState(200);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INFEQUAL\n";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				((ConditionContext)_localctx).a = expr(0);
				setState(204);
				match(T__17);
				setState(205);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "EQUAL\n";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				((ConditionContext)_localctx).a = expr(0);
				setState(209);
				match(T__18);
				setState(210);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "NEQ\n";
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
				match(T__19);
				 ((ConditionContext)_localctx).code =  "  PUSHI 1\n"; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				match(T__20);
				 ((ConditionContext)_localctx).code =  "  PUSHI 0\n"; 
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

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(calculParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(calculParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(219);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00e3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\7"+
		"\3%\n\3\f\3\16\3(\13\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4T\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5d\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5p\n\5\f\5\16\5s\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u009b\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\7\n\u00ae\n\n\f\n\16\n\u00b1\13\n\3\n\3\n\7\n\u00b5\n"+
		"\n\f\n\16\n\u00b8\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00dc\n\13"+
		"\3\f\6\f\u00df\n\f\r\f\16\f\u00e0\3\f\2\3\b\r\2\4\6\b\n\f\16\20\22\24"+
		"\26\2\5\3\2\7\b\4\2\6\6\t\t\4\2\30\30\37\37\2\u00f4\2\30\3\2\2\2\4 \3"+
		"\2\2\2\6S\3\2\2\2\bc\3\2\2\2\n\u0080\3\2\2\2\f\u009a\3\2\2\2\16\u009c"+
		"\3\2\2\2\20\u00a2\3\2\2\2\22\u00a9\3\2\2\2\24\u00db\3\2\2\2\26\u00de\3"+
		"\2\2\2\30\31\5\4\3\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\5\n\6\2\34\35\b"+
		"\3\1\2\35\37\3\2\2\2\36\33\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2"+
		"!&\3\2\2\2\" \3\2\2\2#%\7\37\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2"+
		"\2\2\'.\3\2\2\2(&\3\2\2\2)*\5\6\4\2*+\b\3\1\2+-\3\2\2\2,)\3\2\2\2-\60"+
		"\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\b\3\1\2\62"+
		"\5\3\2\2\2\63\64\5\b\5\2\64\65\5\26\f\2\65\66\b\4\1\2\66T\3\2\2\2\678"+
		"\5\f\7\289\5\26\f\29:\b\4\1\2:T\3\2\2\2;<\5\16\b\2<=\5\26\f\2=>\b\4\1"+
		"\2>T\3\2\2\2?@\5\20\t\2@A\b\4\1\2AT\3\2\2\2BC\5\22\n\2CD\b\4\1\2DT\3\2"+
		"\2\2EF\5\24\13\2FG\5\26\f\2GH\b\4\1\2HT\3\2\2\2IJ\7\3\2\2JK\7\4\2\2KL"+
		"\7\32\2\2LM\7\5\2\2MN\5\26\f\2NO\b\4\1\2OT\3\2\2\2PQ\5\26\f\2QR\b\4\1"+
		"\2RT\3\2\2\2S\63\3\2\2\2S\67\3\2\2\2S;\3\2\2\2S?\3\2\2\2SB\3\2\2\2SE\3"+
		"\2\2\2SI\3\2\2\2SP\3\2\2\2T\7\3\2\2\2UV\b\5\1\2VW\7\6\2\2WX\5\b\5\bXY"+
		"\b\5\1\2Yd\3\2\2\2Z[\7\4\2\2[\\\5\b\5\2\\]\7\5\2\2]^\b\5\1\2^d\3\2\2\2"+
		"_`\7\36\2\2`d\b\5\1\2ab\7\32\2\2bd\b\5\1\2cU\3\2\2\2cZ\3\2\2\2c_\3\2\2"+
		"\2ca\3\2\2\2dq\3\2\2\2ef\f\7\2\2fg\t\2\2\2gh\5\b\5\bhi\b\5\1\2ip\3\2\2"+
		"\2jk\f\6\2\2kl\t\3\2\2lm\5\b\5\7mn\b\5\1\2np\3\2\2\2oe\3\2\2\2oj\3\2\2"+
		"\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\t\3\2\2\2sq\3\2\2\2tu\7\31\2\2uv\7\32"+
		"\2\2vw\5\26\f\2wx\b\6\1\2x\u0081\3\2\2\2yz\7\31\2\2z{\7\32\2\2{|\7\n\2"+
		"\2|}\5\b\5\2}~\5\26\f\2~\177\b\6\1\2\177\u0081\3\2\2\2\u0080t\3\2\2\2"+
		"\u0080y\3\2\2\2\u0081\13\3\2\2\2\u0082\u0083\7\32\2\2\u0083\u0084\7\n"+
		"\2\2\u0084\u0085\5\b\5\2\u0085\u0086\b\7\1\2\u0086\u009b\3\2\2\2\u0087"+
		"\u0088\7\32\2\2\u0088\u0089\7\t\2\2\u0089\u008a\7\n\2\2\u008a\u008b\5"+
		"\b\5\2\u008b\u008c\b\7\1\2\u008c\u009b\3\2\2\2\u008d\u008e\7\32\2\2\u008e"+
		"\u008f\7\n\2\2\u008f\u0090\7\32\2\2\u0090\u0091\7\t\2\2\u0091\u0092\5"+
		"\b\5\2\u0092\u0093\b\7\1\2\u0093\u009b\3\2\2\2\u0094\u0095\7\13\2\2\u0095"+
		"\u0096\7\4\2\2\u0096\u0097\5\b\5\2\u0097\u0098\7\5\2\2\u0098\u0099\b\7"+
		"\1\2\u0099\u009b\3\2\2\2\u009a\u0082\3\2\2\2\u009a\u0087\3\2\2\2\u009a"+
		"\u008d\3\2\2\2\u009a\u0094\3\2\2\2\u009b\r\3\2\2\2\u009c\u009d\7\f\2\2"+
		"\u009d\u009e\7\4\2\2\u009e\u009f\5\24\13\2\u009f\u00a0\7\5\2\2\u00a0\u00a1"+
		"\5\22\n\2\u00a1\17\3\2\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\7\4\2\2\u00a4"+
		"\u00a5\5\24\13\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\5\6\4\2\u00a7\u00a8\b"+
		"\t\1\2\u00a8\21\3\2\2\2\u00a9\u00af\7\16\2\2\u00aa\u00ab\5\6\4\2\u00ab"+
		"\u00ac\b\n\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b6\7\17\2\2\u00b3\u00b5\7\37\2\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\23\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb\7\20\2"+
		"\2\u00bb\u00bc\5\b\5\2\u00bc\u00bd\b\13\1\2\u00bd\u00dc\3\2\2\2\u00be"+
		"\u00bf\5\b\5\2\u00bf\u00c0\7\21\2\2\u00c0\u00c1\5\b\5\2\u00c1\u00c2\b"+
		"\13\1\2\u00c2\u00dc\3\2\2\2\u00c3\u00c4\5\b\5\2\u00c4\u00c5\7\22\2\2\u00c5"+
		"\u00c6\5\b\5\2\u00c6\u00c7\b\13\1\2\u00c7\u00dc\3\2\2\2\u00c8\u00c9\5"+
		"\b\5\2\u00c9\u00ca\7\23\2\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\b\13\1\2\u00cc"+
		"\u00dc\3\2\2\2\u00cd\u00ce\5\b\5\2\u00ce\u00cf\7\24\2\2\u00cf\u00d0\5"+
		"\b\5\2\u00d0\u00d1\b\13\1\2\u00d1\u00dc\3\2\2\2\u00d2\u00d3\5\b\5\2\u00d3"+
		"\u00d4\7\25\2\2\u00d4\u00d5\5\b\5\2\u00d5\u00d6\b\13\1\2\u00d6\u00dc\3"+
		"\2\2\2\u00d7\u00d8\7\26\2\2\u00d8\u00dc\b\13\1\2\u00d9\u00da\7\27\2\2"+
		"\u00da\u00dc\b\13\1\2\u00db\u00b9\3\2\2\2\u00db\u00be\3\2\2\2\u00db\u00c3"+
		"\3\2\2\2\u00db\u00c8\3\2\2\2\u00db\u00cd\3\2\2\2\u00db\u00d2\3\2\2\2\u00db"+
		"\u00d7\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\25\3\2\2\2\u00dd\u00df\t\4\2"+
		"\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\27\3\2\2\2\17 &.Scoq\u0080\u009a\u00af\u00b6\u00db\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}