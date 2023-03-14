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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, TYPE=28, IDENTIFIANT=29, WHITE_SPACE=30, 
		COMMENT=31, LINE_COMMENT=32, ENTIER=33, NEWLINE=34;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_instruction = 2, RULE_expr = 3, 
		RULE_decl = 4, RULE_assignation = 5, RULE_fonction = 6, RULE_statement = 7, 
		RULE_loop = 8, RULE_loopFor = 9, RULE_bloc = 10, RULE_condition = 11, 
		RULE_finInstruction = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "instruction", "expr", "decl", "assignation", "fonction", 
			"statement", "loop", "loopFor", "bloc", "condition", "finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'input'", "'('", "')'", "'-'", "'*'", "'/'", "'+'", "'='", "'print'", 
			"'if'", "'else'", "'while'", "'for'", "';'", "'{'", "'}'", "'<'", "'>'", 
			"'>='", "'<='", "'=='", "'!='", "'true'", "'false'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TYPE", "IDENTIFIANT", "WHITE_SPACE", "COMMENT", 
			"LINE_COMMENT", "ENTIER", "NEWLINE"
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
			setState(26);
			calcul();
			setState(27);
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
		public FonctionContext fonction;
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
		public List<FonctionContext> fonction() {
			return getRuleContexts(FonctionContext.class);
		}
		public FonctionContext fonction(int i) {
			return getRuleContext(FonctionContext.class,i);
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
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(29);
					((CalculContext)_localctx).decl = decl();
					 _localctx.code += ((CalculContext)_localctx).decl.code; 
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			 _localctx.code += "  JUMP Main\n"; 
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					match(NEWLINE);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					((CalculContext)_localctx).fonction = fonction();
					 _localctx.code += ((CalculContext)_localctx).fonction.code; 
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					match(NEWLINE);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			 _localctx.code += "LABEL Main\n"; 
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << TYPE) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(59);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(66);
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
		public FonctionContext fonction;
		public StatementContext statement;
		public LoopForContext loopFor;
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
		public FonctionContext fonction() {
			return getRuleContext(FonctionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopForContext loopFor() {
			return getRuleContext(LoopForContext.class,0);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((InstructionContext)_localctx).expr = expr(0);
				setState(70);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expr.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((InstructionContext)_localctx).assignation = assignation();
				setState(74);
				finInstruction();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((InstructionContext)_localctx).fonction = fonction();
				setState(78);
				finInstruction();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).fonction.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				((InstructionContext)_localctx).statement = statement();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).statement.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				((InstructionContext)_localctx).loopFor = loopFor();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).loopFor.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				((InstructionContext)_localctx).loop = loop();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).loop.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				((InstructionContext)_localctx).bloc = bloc();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				((InstructionContext)_localctx).condition = condition(0);
				setState(94);
				finInstruction();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).condition.code;
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(97);
				match(T__0);
				setState(98);
				match(T__1);
				setState(99);
				((InstructionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(100);
				match(T__2);
				setState(101);
				finInstruction();

				             VariableInfo vi = tablesSymboles.getVar((((InstructionContext)_localctx).IDENTIFIANT!=null?((InstructionContext)_localctx).IDENTIFIANT.getText():null));
				             ((InstructionContext)_localctx).code =  "READ\nSTOREG "+vi.address+"\n";
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
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
		public String type;
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(110);
				match(T__3);
				setState(111);
				((ExprContext)_localctx).a = expr(7);
				 ((ExprContext)_localctx).code =    "PUSHI -1\n" + ((ExprContext)_localctx).a.code  + "MUL \n" ;
				}
				break;
			case 2:
				{
				setState(114);
				match(T__1);
				setState(115);
				((ExprContext)_localctx).a = expr(0);
				setState(116);
				match(T__2);
				((ExprContext)_localctx).code =  ((ExprContext)_localctx).a.code;
				}
				break;
			case 3:
				{
				setState(119);
				((ExprContext)_localctx).ENTIER = match(ENTIER);
				((ExprContext)_localctx).code =  "PUSHI " + (((ExprContext)_localctx).ENTIER!=null?((ExprContext)_localctx).ENTIER.getText():null)+"\n";
				}
				break;
			case 4:
				{
				setState(121);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				        VariableInfo vi = tablesSymboles.getVar((((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null));
				        ((ExprContext)_localctx).code =  "PUSHG "+vi.address+"\n";
				}
				break;
			case 5:
				{
				setState(123);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(124);
				match(T__1);
				setState(125);
				match(T__2);


				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
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
						setState(131);
						((ExprContext)_localctx).b = expr(7);
						((ExprContext)_localctx).code =  evalexpr(((ExprContext)_localctx).a.code ,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).b.code);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(135);
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
						setState(136);
						((ExprContext)_localctx).b = expr(6);
						((ExprContext)_localctx).code =  evalexpr(((ExprContext)_localctx).a.code ,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null) ,((ExprContext)_localctx).b.code);
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(TYPE);
				setState(145);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(146);
				finInstruction();

				            ((DeclContext)_localctx).code =  "PUSHI 0 \n";
				            tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(TYPE);
				setState(150);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(151);
				match(T__7);
				setState(152);
				((DeclContext)_localctx).expr = expr(0);
				setState(153);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(159);
				match(T__7);
				setState(160);
				((AssignationContext)_localctx).expr = expr(0);
				  

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expr.code + "STOREG "+ vi.address+"\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(164);
				match(T__6);
				setState(165);
				match(T__7);
				setState(166);
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
				setState(169);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(170);
				match(T__7);
				setState(171);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(172);
				match(T__6);
				setState(173);
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
				setState(176);
				match(T__8);
				setState(177);
				match(T__1);
				setState(178);
				((AssignationContext)_localctx).expr = expr(0);
				setState(179);
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

	public static class FonctionContext extends ParserRuleContext {
		public String code;
		public TerminalNode TYPE() { return getToken(calculParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(calculParser.IDENTIFIANT, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitFonction(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fonction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(TYPE);
			setState(185);
			match(IDENTIFIANT);

				    //  Enregistre le type de la fonction  
				
			setState(187);
			match(T__1);
			setState(188);
			match(T__2);
			setState(189);
			bloc();

			            // corps de la fonction
				    _localctx.code += "RETURN\n";  //  Return "de sécurité"      
			        
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
		public ConditionContext condition;
		public InstructionContext a;
		public InstructionContext b;
		public InstructionContext instruction;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__9);
				setState(193);
				match(T__1);
				setState(194);
				((StatementContext)_localctx).condition = condition(0);
				setState(195);
				match(T__2);
				setState(196);
				((StatementContext)_localctx).a = instruction();
				setState(197);
				match(T__10);
				setState(198);
				((StatementContext)_localctx).b = instruction();

				            String start = getNewLabel() ; String end = getNewLabel();
				            ((StatementContext)_localctx).code =  ((StatementContext)_localctx).condition.code;
				            _localctx.code+="JUMPF "+end+"\n";
				            _localctx.code+=((StatementContext)_localctx).a.code;
				            _localctx.code+="JUMP "+start+"\n";
				            _localctx.code+="LABEL "+end+"\n";
				            _localctx.code+=((StatementContext)_localctx).b.code;
				            _localctx.code+="LABEL "+start+"\n";
				         
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__9);
				setState(202);
				match(T__1);
				setState(203);
				((StatementContext)_localctx).condition = condition(0);
				setState(204);
				match(T__2);
				setState(205);
				((StatementContext)_localctx).instruction = instruction();

				            String label = getNewLabel();
				            ((StatementContext)_localctx).code =  ((StatementContext)_localctx).condition.code;
				            _localctx.code+="JUMPF "+label+"\n";
				            _localctx.code+=((StatementContext)_localctx).instruction.code;
				            _localctx.code+="LABEL "+label+"\n";
				        
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
		enterRule(_localctx, 16, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__11);
			setState(211);
			match(T__1);
			setState(212);
			((LoopContext)_localctx).condition = condition(0);
			setState(213);
			match(T__2);
			setState(214);
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

	public static class LoopForContext extends ParserRuleContext {
		public String code;
		public AssignationContext a;
		public ConditionContext condition;
		public AssignationContext b;
		public InstructionContext instruction;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public LoopForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterLoopFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitLoopFor(this);
		}
	}

	public final LoopForContext loopFor() throws RecognitionException {
		LoopForContext _localctx = new LoopForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loopFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__12);
			setState(218);
			match(T__1);
			setState(219);
			((LoopForContext)_localctx).a = assignation();
			setState(220);
			match(T__13);
			setState(221);
			((LoopForContext)_localctx).condition = condition(0);
			setState(222);
			match(T__13);
			setState(223);
			((LoopForContext)_localctx).b = assignation();
			setState(224);
			match(T__2);
			setState(225);
			((LoopForContext)_localctx).instruction = instruction();

			        String start = getNewLabel();
			        String end = getNewLabel();
			        ((LoopForContext)_localctx).code = ((LoopForContext)_localctx).a.code;
			        _localctx.code+="LABEL "+start+"\n";
			        _localctx.code+=((LoopForContext)_localctx).condition.code;
			        _localctx.code+="JUMPF "+end+"\n";
			        _localctx.code+=((LoopForContext)_localctx).instruction.code;
			        _localctx.code+=((LoopForContext)_localctx).b.code;
			        _localctx.code+="JUMP "+start+"\n";
			        _localctx.code+="LABEL "+end+"\n";
			    
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
		enterRule(_localctx, 20, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__14);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << TYPE) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(229);
				((BlocContext)_localctx).instruction = instruction();
				 _localctx.code += ((BlocContext)_localctx).instruction.code; 
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(T__15);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					match(NEWLINE);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public ConditionContext c;
		public ConditionContext g;
		public ExprContext a;
		public ExprContext b;
		public ConditionContext condition;
		public ConditionContext d;
		public ConditionContext e;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
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
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(245);
				((ConditionContext)_localctx).a = expr(0);
				setState(246);
				match(T__16);
				setState(247);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INF\n";  
				}
				break;
			case 2:
				{
				setState(250);
				((ConditionContext)_localctx).a = expr(0);
				setState(251);
				match(T__17);
				setState(252);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUP\n";
				}
				break;
			case 3:
				{
				setState(255);
				((ConditionContext)_localctx).a = expr(0);
				setState(256);
				match(T__18);
				setState(257);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUPEQ\n";
				}
				break;
			case 4:
				{
				setState(260);
				((ConditionContext)_localctx).a = expr(0);
				setState(261);
				match(T__19);
				setState(262);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INFEQ\n";
				}
				break;
			case 5:
				{
				setState(265);
				((ConditionContext)_localctx).a = expr(0);
				setState(266);
				match(T__20);
				setState(267);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "EQUAL\n";
				}
				break;
			case 6:
				{
				setState(270);
				((ConditionContext)_localctx).a = expr(0);
				setState(271);
				match(T__21);
				setState(272);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "NEQ\n";
				}
				break;
			case 7:
				{
				setState(275);
				match(T__22);
				 ((ConditionContext)_localctx).code =  "  PUSHI 1\n"; 
				}
				break;
			case 8:
				{
				setState(277);
				match(T__23);
				 ((ConditionContext)_localctx).code =  "  PUSHI 0\n"; 
				}
				break;
			case 9:
				{
				setState(279);
				match(T__24);
				setState(280);
				((ConditionContext)_localctx).condition = condition(3);

				        ((ConditionContext)_localctx).code = ((ConditionContext)_localctx).condition.code;
				        _localctx.code+="PUSHI 0\n";
				        _localctx.code+="EQUAL\n";
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.c = _prevctx;
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(285);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(286);
						match(T__25);
						setState(287);
						((ConditionContext)_localctx).d = ((ConditionContext)_localctx).condition = condition(3);

						                  ((ConditionContext)_localctx).code = ((ConditionContext)_localctx).c.code;
						                  _localctx.code+=((ConditionContext)_localctx).d.code;
						                  _localctx.code+="MUL\n";
						                  _localctx.code+="PUSHI 1\n";
						                  _localctx.code+="EQUAL\n";
						              
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.g = _prevctx;
						_localctx.g = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(290);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(291);
						match(T__26);
						setState(292);
						((ConditionContext)_localctx).e = ((ConditionContext)_localctx).condition = condition(2);

						                  ((ConditionContext)_localctx).code = ((ConditionContext)_localctx).g.code;
						                  _localctx.code+=((ConditionContext)_localctx).e.code;
						                  _localctx.code+="ADD\n";
						                  _localctx.code+="PUSHI 1\n";
						                  _localctx.code+="SUPEQ\n";
						              
						}
						break;
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 24, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(300);
					_la = _input.LA(1);
					if ( !(_la==T__13 || _la==NEWLINE) ) {
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
				setState(303); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 11:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0134\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\3\7\3\62\n\3\f\3\16"+
		"\3\65\13\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\3\3\3\7\3A\n\3\f\3\16"+
		"\3D\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009f\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00b9\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d3\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\7\f\u00eb\n\f\f\f\16\f\u00ee\13\f\3\f\3\f\7\f\u00f2"+
		"\n\f\f\f\16\f\u00f5\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011e\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u012a\n\r\f\r\16\r\u012d\13\r\3\16\6\16\u0130"+
		"\n\16\r\16\16\16\u0131\3\16\2\4\b\30\17\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\2\5\3\2\7\b\4\2\6\6\t\t\4\2\20\20$$\2\u014c\2\34\3\2\2\2\4$\3\2\2"+
		"\2\6m\3\2\2\2\b\u0081\3\2\2\2\n\u009e\3\2\2\2\f\u00b8\3\2\2\2\16\u00ba"+
		"\3\2\2\2\20\u00d2\3\2\2\2\22\u00d4\3\2\2\2\24\u00db\3\2\2\2\26\u00e6\3"+
		"\2\2\2\30\u011d\3\2\2\2\32\u012f\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36"+
		"\3\3\2\2\2\37 \5\n\6\2 !\b\3\1\2!#\3\2\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3"+
		"\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'+\b\3\1\2(*\7$\2\2)(\3\2\2\2*-"+
		"\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\63\3\2\2\2-+\3\2\2\2./\5\16\b\2/\60\b\3"+
		"\1\2\60\62\3\2\2\2\61.\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
		"\2\649\3\2\2\2\65\63\3\2\2\2\668\7$\2\2\67\66\3\2\2\28;\3\2\2\29\67\3"+
		"\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<B\b\3\1\2=>\5\6\4\2>?\b\3\1\2?A\3"+
		"\2\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\b"+
		"\3\1\2F\5\3\2\2\2GH\5\b\5\2HI\5\32\16\2IJ\b\4\1\2Jn\3\2\2\2KL\5\f\7\2"+
		"LM\5\32\16\2MN\b\4\1\2Nn\3\2\2\2OP\5\16\b\2PQ\5\32\16\2QR\b\4\1\2Rn\3"+
		"\2\2\2ST\5\20\t\2TU\b\4\1\2Un\3\2\2\2VW\5\24\13\2WX\b\4\1\2Xn\3\2\2\2"+
		"YZ\5\22\n\2Z[\b\4\1\2[n\3\2\2\2\\]\5\26\f\2]^\b\4\1\2^n\3\2\2\2_`\5\30"+
		"\r\2`a\5\32\16\2ab\b\4\1\2bn\3\2\2\2cd\7\3\2\2de\7\4\2\2ef\7\37\2\2fg"+
		"\7\5\2\2gh\5\32\16\2hi\b\4\1\2in\3\2\2\2jk\5\32\16\2kl\b\4\1\2ln\3\2\2"+
		"\2mG\3\2\2\2mK\3\2\2\2mO\3\2\2\2mS\3\2\2\2mV\3\2\2\2mY\3\2\2\2m\\\3\2"+
		"\2\2m_\3\2\2\2mc\3\2\2\2mj\3\2\2\2n\7\3\2\2\2op\b\5\1\2pq\7\6\2\2qr\5"+
		"\b\5\trs\b\5\1\2s\u0082\3\2\2\2tu\7\4\2\2uv\5\b\5\2vw\7\5\2\2wx\b\5\1"+
		"\2x\u0082\3\2\2\2yz\7#\2\2z\u0082\b\5\1\2{|\7\37\2\2|\u0082\b\5\1\2}~"+
		"\7\37\2\2~\177\7\4\2\2\177\u0080\7\5\2\2\u0080\u0082\b\5\1\2\u0081o\3"+
		"\2\2\2\u0081t\3\2\2\2\u0081y\3\2\2\2\u0081{\3\2\2\2\u0081}\3\2\2\2\u0082"+
		"\u008f\3\2\2\2\u0083\u0084\f\b\2\2\u0084\u0085\t\2\2\2\u0085\u0086\5\b"+
		"\5\t\u0086\u0087\b\5\1\2\u0087\u008e\3\2\2\2\u0088\u0089\f\7\2\2\u0089"+
		"\u008a\t\3\2\2\u008a\u008b\5\b\5\b\u008b\u008c\b\5\1\2\u008c\u008e\3\2"+
		"\2\2\u008d\u0083\3\2\2\2\u008d\u0088\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\t\3\2\2\2\u0091\u008f\3\2\2\2"+
		"\u0092\u0093\7\36\2\2\u0093\u0094\7\37\2\2\u0094\u0095\5\32\16\2\u0095"+
		"\u0096\b\6\1\2\u0096\u009f\3\2\2\2\u0097\u0098\7\36\2\2\u0098\u0099\7"+
		"\37\2\2\u0099\u009a\7\n\2\2\u009a\u009b\5\b\5\2\u009b\u009c\5\32\16\2"+
		"\u009c\u009d\b\6\1\2\u009d\u009f\3\2\2\2\u009e\u0092\3\2\2\2\u009e\u0097"+
		"\3\2\2\2\u009f\13\3\2\2\2\u00a0\u00a1\7\37\2\2\u00a1\u00a2\7\n\2\2\u00a2"+
		"\u00a3\5\b\5\2\u00a3\u00a4\b\7\1\2\u00a4\u00b9\3\2\2\2\u00a5\u00a6\7\37"+
		"\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00a9\5\b\5\2\u00a9"+
		"\u00aa\b\7\1\2\u00aa\u00b9\3\2\2\2\u00ab\u00ac\7\37\2\2\u00ac\u00ad\7"+
		"\n\2\2\u00ad\u00ae\7\37\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0\5\b\5\2\u00b0"+
		"\u00b1\b\7\1\2\u00b1\u00b9\3\2\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\7"+
		"\4\2\2\u00b4\u00b5\5\b\5\2\u00b5\u00b6\7\5\2\2\u00b6\u00b7\b\7\1\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00a0\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8\u00ab\3\2"+
		"\2\2\u00b8\u00b2\3\2\2\2\u00b9\r\3\2\2\2\u00ba\u00bb\7\36\2\2\u00bb\u00bc"+
		"\7\37\2\2\u00bc\u00bd\b\b\1\2\u00bd\u00be\7\4\2\2\u00be\u00bf\7\5\2\2"+
		"\u00bf\u00c0\5\26\f\2\u00c0\u00c1\b\b\1\2\u00c1\17\3\2\2\2\u00c2\u00c3"+
		"\7\f\2\2\u00c3\u00c4\7\4\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\7\5\2\2"+
		"\u00c6\u00c7\5\6\4\2\u00c7\u00c8\7\r\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00ca"+
		"\b\t\1\2\u00ca\u00d3\3\2\2\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\7\4\2\2\u00cd"+
		"\u00ce\5\30\r\2\u00ce\u00cf\7\5\2\2\u00cf\u00d0\5\6\4\2\u00d0\u00d1\b"+
		"\t\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00c2\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d3"+
		"\21\3\2\2\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\7\4\2\2\u00d6\u00d7\5\30"+
		"\r\2\u00d7\u00d8\7\5\2\2\u00d8\u00d9\5\6\4\2\u00d9\u00da\b\n\1\2\u00da"+
		"\23\3\2\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd\7\4\2\2\u00dd\u00de\5\f\7"+
		"\2\u00de\u00df\7\20\2\2\u00df\u00e0\5\30\r\2\u00e0\u00e1\7\20\2\2\u00e1"+
		"\u00e2\5\f\7\2\u00e2\u00e3\7\5\2\2\u00e3\u00e4\5\6\4\2\u00e4\u00e5\b\13"+
		"\1\2\u00e5\25\3\2\2\2\u00e6\u00ec\7\21\2\2\u00e7\u00e8\5\6\4\2\u00e8\u00e9"+
		"\b\f\1\2\u00e9\u00eb\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f3\7\22\2\2\u00f0\u00f2\7$\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\27\3\2\2"+
		"\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\b\r\1\2\u00f7\u00f8\5\b\5\2\u00f8\u00f9"+
		"\7\23\2\2\u00f9\u00fa\5\b\5\2\u00fa\u00fb\b\r\1\2\u00fb\u011e\3\2\2\2"+
		"\u00fc\u00fd\5\b\5\2\u00fd\u00fe\7\24\2\2\u00fe\u00ff\5\b\5\2\u00ff\u0100"+
		"\b\r\1\2\u0100\u011e\3\2\2\2\u0101\u0102\5\b\5\2\u0102\u0103\7\25\2\2"+
		"\u0103\u0104\5\b\5\2\u0104\u0105\b\r\1\2\u0105\u011e\3\2\2\2\u0106\u0107"+
		"\5\b\5\2\u0107\u0108\7\26\2\2\u0108\u0109\5\b\5\2\u0109\u010a\b\r\1\2"+
		"\u010a\u011e\3\2\2\2\u010b\u010c\5\b\5\2\u010c\u010d\7\27\2\2\u010d\u010e"+
		"\5\b\5\2\u010e\u010f\b\r\1\2\u010f\u011e\3\2\2\2\u0110\u0111\5\b\5\2\u0111"+
		"\u0112\7\30\2\2\u0112\u0113\5\b\5\2\u0113\u0114\b\r\1\2\u0114\u011e\3"+
		"\2\2\2\u0115\u0116\7\31\2\2\u0116\u011e\b\r\1\2\u0117\u0118\7\32\2\2\u0118"+
		"\u011e\b\r\1\2\u0119\u011a\7\33\2\2\u011a\u011b\5\30\r\5\u011b\u011c\b"+
		"\r\1\2\u011c\u011e\3\2\2\2\u011d\u00f6\3\2\2\2\u011d\u00fc\3\2\2\2\u011d"+
		"\u0101\3\2\2\2\u011d\u0106\3\2\2\2\u011d\u010b\3\2\2\2\u011d\u0110\3\2"+
		"\2\2\u011d\u0115\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u0119\3\2\2\2\u011e"+
		"\u012b\3\2\2\2\u011f\u0120\f\4\2\2\u0120\u0121\7\34\2\2\u0121\u0122\5"+
		"\30\r\5\u0122\u0123\b\r\1\2\u0123\u012a\3\2\2\2\u0124\u0125\f\3\2\2\u0125"+
		"\u0126\7\35\2\2\u0126\u0127\5\30\r\4\u0127\u0128\b\r\1\2\u0128\u012a\3"+
		"\2\2\2\u0129\u011f\3\2\2\2\u0129\u0124\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\31\3\2\2\2\u012d\u012b\3\2\2"+
		"\2\u012e\u0130\t\4\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\33\3\2\2\2\24$+\639Bm\u0081\u008d\u008f"+
		"\u009e\u00b8\u00d2\u00ec\u00f3\u011d\u0129\u012b\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}