// Generated from calcul.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class calculParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, RETURN=29, TYPE=30, IDENTIFIANT=31, 
		WHITE_SPACE=32, COMMENT=33, LINE_COMMENT=34, ENTIER=35, NEWLINE=36;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_instruction = 2, RULE_expr = 3, 
		RULE_decl = 4, RULE_assignation = 5, RULE_fonction = 6, RULE_params = 7, 
		RULE_args = 8, RULE_statement = 9, RULE_loop = 10, RULE_loopFor = 11, 
		RULE_bloc = 12, RULE_condition = 13, RULE_finInstruction = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "instruction", "expr", "decl", "assignation", "fonction", 
			"params", "args", "statement", "loop", "loopFor", "bloc", "condition", 
			"finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'input'", "'('", "')'", "'-'", "'*'", "'/'", "'+'", "'='", "'print'", 
			"','", "'if'", "'else'", "'while'", "'for'", "';'", "'{'", "'}'", "'<'", 
			"'>'", "'>='", "'<='", "'=='", "'!='", "'true'", "'false'", "'!'", "'&&'", 
			"'||'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "RETURN", "TYPE", "IDENTIFIANT", "WHITE_SPACE", 
			"COMMENT", "LINE_COMMENT", "ENTIER", "NEWLINE"
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(30);
			calcul();
			setState(31);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33);
					((CalculContext)_localctx).decl = decl();
					 _localctx.code += ((CalculContext)_localctx).decl.code; 
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			 _localctx.code += "  JUMP Main\n"; 
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					match(NEWLINE);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(48);
				((CalculContext)_localctx).fonction = fonction();
				 _localctx.code += ((CalculContext)_localctx).fonction.code; 
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					match(NEWLINE);
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			 _localctx.code += "LABEL Main\n"; 
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 105881135638L) != 0)) {
				{
				{
				setState(63);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(70);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public ExprContext expr;
		public BlocContext bloc;
		public AssignationContext assignation;
		public StatementContext statement;
		public LoopForContext loopFor;
		public LoopContext loop;
		public ConditionContext condition;
		public Token IDENTIFIANT;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode IDENTIFIANT() { return getToken(calculParser.IDENTIFIANT, 0); }
		public TerminalNode RETURN() { return getToken(calculParser.RETURN, 0); }
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((InstructionContext)_localctx).expr = expr(0);
				setState(74);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expr.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((InstructionContext)_localctx).bloc = bloc();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				((InstructionContext)_localctx).assignation = assignation();
				setState(81);
				finInstruction();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				((InstructionContext)_localctx).statement = statement();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).statement.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				((InstructionContext)_localctx).loopFor = loopFor();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).loopFor.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				((InstructionContext)_localctx).loop = loop();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).loop.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				((InstructionContext)_localctx).condition = condition(0);
				setState(94);
				finInstruction();
				 
						        ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).condition.code;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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
				             if(vi.scope == VariableInfo.Scope.GLOBAL){
				                ((InstructionContext)_localctx).code =  "READ\nSTOREG "+vi.address+"\n";
				             }else{
				                ((InstructionContext)_localctx).code =  "READ\nSTOREL "+vi.address+"\n";

				             }
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(104);
				match(RETURN);
				setState(105);
				((InstructionContext)_localctx).expr = expr(0);
				setState(106);
				finInstruction();

				            VariableInfo vi = tablesSymboles.getReturn();
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expr.code + "STOREL "+vi.address+"\n";
				            _localctx.code +="RETURN\n";
				            
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(109);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public String code;
		public String type;
		public ExprContext a;
		public Token ENTIER;
		public Token IDENTIFIANT;
		public ArgsContext args;
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(115);
				match(T__3);
				setState(116);
				((ExprContext)_localctx).a = expr(8);
				 ((ExprContext)_localctx).code =    "PUSHI -1\n" + ((ExprContext)_localctx).a.code  + "MUL \n" ;
				}
				break;
			case 2:
				{
				setState(119);
				match(T__1);
				setState(120);
				((ExprContext)_localctx).a = expr(0);
				setState(121);
				match(T__2);
				((ExprContext)_localctx).code =  ((ExprContext)_localctx).a.code;
				}
				break;
			case 3:
				{
				setState(124);
				((ExprContext)_localctx).ENTIER = match(ENTIER);
				((ExprContext)_localctx).code =  "PUSHI " + (((ExprContext)_localctx).ENTIER!=null?((ExprContext)_localctx).ENTIER.getText():null)+"\n";
				}
				break;
			case 4:
				{
				setState(126);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				        
				        VariableInfo vi = tablesSymboles.getVar((((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null));
				         if(vi.scope == VariableInfo.Scope.GLOBAL){
				            ((ExprContext)_localctx).code =  "PUSHG "+vi.address+"\n"; 
				         }else{
				            ((ExprContext)_localctx).code =  "PUSHL "+vi.address+"\n";
				         }
				    
				}
				break;
			case 5:
				{
				setState(128);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(129);
				match(T__1);
				setState(130);
				match(T__2);

				            
				            ((ExprContext)_localctx).code = "CALL " + (((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null) +"\n";
				        
				}
				break;
			case 6:
				{
				setState(132);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(133);
				match(T__1);
				setState(134);
				((ExprContext)_localctx).args = args();
				setState(135);
				match(T__2);

				         ((ExprContext)_localctx).code =  "PUSHI 0\n";
				         _localctx.code += ((ExprContext)_localctx).args.code ;
				        _localctx.code +="CALL " + (((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null) +"\n";
				         for(int i=0 ; i<((ExprContext)_localctx).args.size ; i++){
				             _localctx.code +="POP\n";
				          }
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(141);
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
						setState(142);
						((ExprContext)_localctx).b = expr(8);
						((ExprContext)_localctx).code =  evalexpr(((ExprContext)_localctx).a.code ,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).b.code);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(146);
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
						setState(147);
						((ExprContext)_localctx).b = expr(7);
						((ExprContext)_localctx).code =  evalexpr(((ExprContext)_localctx).a.code ,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null) ,((ExprContext)_localctx).b.code);
						}
						break;
					}
					} 
				}
				setState(154);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(TYPE);
				setState(156);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(157);
				finInstruction();

				            ((DeclContext)_localctx).code =  "PUSHI 0 \n";
				            tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(TYPE);
				setState(161);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(162);
				match(T__7);
				setState(163);
				((DeclContext)_localctx).expr = expr(0);
				setState(164);
				finInstruction();

				            tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
				            VariableInfo vi = tablesSymboles.getVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null));
				            if(vi.scope == VariableInfo.Scope.GLOBAL){
				            ((DeclContext)_localctx).code =  "PUSHI 0 \n" + ((DeclContext)_localctx).expr.code + "STOREG "+ vi.address+"\n"; 
				            }else{
				            ((DeclContext)_localctx).code =  "PUSHI 0 \n" + ((DeclContext)_localctx).expr.code + "STOREL "+ vi.address+"\n"; 
				            }
				        
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(170);
				match(T__7);
				setState(171);
				((AssignationContext)_localctx).expr = expr(0);
				  
				            
				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            if(vi.scope == VariableInfo.Scope.GLOBAL){
				                ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expr.code + "STOREG "+ vi.address+"\n";
				            }else{
				                ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expr.code + "STOREL "+ vi.address+"\n";   
				            }
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(175);
				match(T__6);
				setState(176);
				match(T__7);
				setState(177);
				((AssignationContext)_localctx).expr = expr(0);

				        VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				        if(vi.scope == VariableInfo.Scope.GLOBAL){
				            ((AssignationContext)_localctx).code =  "PUSHG "+vi.address+"\n";
				            _localctx.code +=  ((AssignationContext)_localctx).expr.code + "ADD\n";
				            _localctx.code += "STOREG "+vi.address+"\n";
				        }else{
				            ((AssignationContext)_localctx).code =  "PUSHL "+vi.address+"\n";
				            _localctx.code +=  ((AssignationContext)_localctx).expr.code + "ADD\n";
				            _localctx.code += "STOREL "+vi.address+"\n";
				        }

				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(181);
				match(T__7);
				setState(182);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(183);
				match(T__6);
				setState(184);
				((AssignationContext)_localctx).expr = expr(0);

				        
				        VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				        if(vi.scope == VariableInfo.Scope.GLOBAL){
				            ((AssignationContext)_localctx).code =  "PUSHG "+vi.address+"\n";
				            _localctx.code +=  ((AssignationContext)_localctx).expr.code + "ADD\n";
				            _localctx.code += "STOREG "+vi.address+"\n";
				        }else{
				            ((AssignationContext)_localctx).code =  "PUSHL "+vi.address+"\n";
				            _localctx.code +=  ((AssignationContext)_localctx).expr.code + "ADD\n";
				            _localctx.code += "STOREL "+vi.address+"\n";
				        }

				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(T__8);
				setState(188);
				match(T__1);
				setState(189);
				((AssignationContext)_localctx).expr = expr(0);
				setState(190);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FonctionContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public InstructionContext instruction;
		public TerminalNode TYPE() { return getToken(calculParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(calculParser.IDENTIFIANT, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		 tablesSymboles.enterFunction() ; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((FonctionContext)_localctx).TYPE = match(TYPE);
			setState(196);
			((FonctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(197);
			match(T__1);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(198);
				params();
				}
			}

			setState(201);
			match(T__2);

				    tablesSymboles.addFunction((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null) , (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null) );
			        ((FonctionContext)_localctx).code =  "LABEL "+ (((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null) +"\n";
				    
			setState(203);
			((FonctionContext)_localctx).instruction = instruction();

			        _localctx.code += ((FonctionContext)_localctx).instruction.code ;
				    _localctx.code += "RETURN\n";  //  Return "de sécurité"      
			        
			}
			_ctx.stop = _input.LT(-1);
			 tablesSymboles.exitFunction(); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public Token IDENTIFIANT;
		public List<TerminalNode> TYPE() { return getTokens(calculParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(calculParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIANT() { return getTokens(calculParser.IDENTIFIANT); }
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(calculParser.IDENTIFIANT, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(TYPE);
			setState(207);
			((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

			           tablesSymboles.addParam((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null),"int");
			        
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(209);
				match(T__9);
				setState(210);
				match(TYPE);
				setState(211);
				((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				               tablesSymboles.addParam((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null),"int");
				            
				}
				}
				setState(217);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public String code;
		public int size;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculListener ) ((calculListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_args);
		 ((ArgsContext)_localctx).code =  new String(); ((ArgsContext)_localctx).size =  0; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36507222036L) != 0)) {
				{
				setState(218);
				((ArgsContext)_localctx).expr = expr(0);

				         ((ArgsContext)_localctx).code =  ((ArgsContext)_localctx).expr.code;
				         _localctx.size +=1;
				    
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(220);
					match(T__9);
					setState(221);
					((ArgsContext)_localctx).expr = expr(0);

					        _localctx.code += ((ArgsContext)_localctx).expr.code;
					        _localctx.size +=1;
					    
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__10);
				setState(232);
				match(T__1);
				setState(233);
				((StatementContext)_localctx).condition = condition(0);
				setState(234);
				match(T__2);
				setState(235);
				((StatementContext)_localctx).a = instruction();
				setState(236);
				match(T__11);
				setState(237);
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
				setState(240);
				match(T__10);
				setState(241);
				match(T__1);
				setState(242);
				((StatementContext)_localctx).condition = condition(0);
				setState(243);
				match(T__2);
				setState(244);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 20, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__12);
			setState(250);
			match(T__1);
			setState(251);
			((LoopContext)_localctx).condition = condition(0);
			setState(252);
			match(T__2);
			setState(253);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 22, RULE_loopFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__13);
			setState(257);
			match(T__1);
			setState(258);
			((LoopForContext)_localctx).a = assignation();
			setState(259);
			match(T__14);
			setState(260);
			((LoopForContext)_localctx).condition = condition(0);
			setState(261);
			match(T__14);
			setState(262);
			((LoopForContext)_localctx).b = assignation();
			setState(263);
			match(T__2);
			setState(264);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 24, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__15);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 105881135638L) != 0)) {
				{
				{
				setState(268);
				((BlocContext)_localctx).instruction = instruction();
				 _localctx.code += ((BlocContext)_localctx).instruction.code; 
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(T__16);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					match(NEWLINE);
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(284);
				((ConditionContext)_localctx).a = expr(0);
				setState(285);
				match(T__17);
				setState(286);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INF\n";  
				}
				break;
			case 2:
				{
				setState(289);
				((ConditionContext)_localctx).a = expr(0);
				setState(290);
				match(T__18);
				setState(291);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUP\n";
				}
				break;
			case 3:
				{
				setState(294);
				((ConditionContext)_localctx).a = expr(0);
				setState(295);
				match(T__19);
				setState(296);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUPEQ\n";
				}
				break;
			case 4:
				{
				setState(299);
				((ConditionContext)_localctx).a = expr(0);
				setState(300);
				match(T__20);
				setState(301);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INFEQ\n";
				}
				break;
			case 5:
				{
				setState(304);
				((ConditionContext)_localctx).a = expr(0);
				setState(305);
				match(T__21);
				setState(306);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "EQUAL\n";
				}
				break;
			case 6:
				{
				setState(309);
				((ConditionContext)_localctx).a = expr(0);
				setState(310);
				match(T__22);
				setState(311);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "NEQ\n";
				}
				break;
			case 7:
				{
				setState(314);
				match(T__23);
				 ((ConditionContext)_localctx).code =  "  PUSHI 1\n"; 
				}
				break;
			case 8:
				{
				setState(316);
				match(T__24);
				 ((ConditionContext)_localctx).code =  "  PUSHI 0\n"; 
				}
				break;
			case 9:
				{
				setState(318);
				match(T__25);
				setState(319);
				((ConditionContext)_localctx).condition = condition(3);

				        ((ConditionContext)_localctx).code = ((ConditionContext)_localctx).condition.code;
				        _localctx.code+="PUSHI 0\n";
				        _localctx.code+="EQUAL\n";
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(334);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(324);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(325);
						match(T__26);
						setState(326);
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
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(329);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(330);
						match(T__27);
						setState(331);
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
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 28, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(339);
					_la = _input.LA(1);
					if ( !(_la==T__14 || _la==NEWLINE) ) {
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
				setState(342); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		case 13:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
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
		"\u0004\u0001$\u0159\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001%\b\u0001"+
		"\n\u0001\f\u0001(\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001,\b\u0001"+
		"\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"4\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0005\u0001:\b\u0001\n"+
		"\u0001\f\u0001=\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001C\b\u0001\n\u0001\f\u0001F\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u008b\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u0097\b\u0003\n\u0003\f\u0003\u009a\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a8\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00c2\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00c8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00d6\b\u0007\n\u0007\f\u0007\u00d9\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00e1\b\b\n\b"+
		"\f\b\u00e4\t\b\u0003\b\u00e6\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00f8\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0110\b\f\n\f\f\f\u0113"+
		"\t\f\u0001\f\u0001\f\u0005\f\u0117\b\f\n\f\f\f\u011a\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0143\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u014f\b\r\n\r\f\r\u0152\t\r"+
		"\u0001\u000e\u0004\u000e\u0155\b\u000e\u000b\u000e\f\u000e\u0156\u0001"+
		"\u000e\u0000\u0002\u0006\u001a\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0003\u0001\u0000\u0005"+
		"\u0006\u0002\u0000\u0004\u0004\u0007\u0007\u0002\u0000\u000f\u000f$$\u0174"+
		"\u0000\u001e\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u0004"+
		"p\u0001\u0000\u0000\u0000\u0006\u008a\u0001\u0000\u0000\u0000\b\u00a7"+
		"\u0001\u0000\u0000\u0000\n\u00c1\u0001\u0000\u0000\u0000\f\u00c3\u0001"+
		"\u0000\u0000\u0000\u000e\u00ce\u0001\u0000\u0000\u0000\u0010\u00e5\u0001"+
		"\u0000\u0000\u0000\u0012\u00f7\u0001\u0000\u0000\u0000\u0014\u00f9\u0001"+
		"\u0000\u0000\u0000\u0016\u0100\u0001\u0000\u0000\u0000\u0018\u010b\u0001"+
		"\u0000\u0000\u0000\u001a\u0142\u0001\u0000\u0000\u0000\u001c\u0154\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0005\u0000"+
		"\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!\"\u0003\b\u0004\u0000\"#"+
		"\u0006\u0001\uffff\uffff\u0000#%\u0001\u0000\u0000\u0000$!\u0001\u0000"+
		"\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		")-\u0006\u0001\uffff\uffff\u0000*,\u0005$\u0000\u0000+*\u0001\u0000\u0000"+
		"\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.5\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0003"+
		"\f\u0006\u000012\u0006\u0001\uffff\uffff\u000024\u0001\u0000\u0000\u0000"+
		"30\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u00006;\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u00008:\u0005$\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>D\u0006\u0001\uffff\uffff"+
		"\u0000?@\u0003\u0004\u0002\u0000@A\u0006\u0001\uffff\uffff\u0000AC\u0001"+
		"\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000GH\u0006\u0001\uffff\uffff\u0000H\u0003"+
		"\u0001\u0000\u0000\u0000IJ\u0003\u0006\u0003\u0000JK\u0003\u001c\u000e"+
		"\u0000KL\u0006\u0002\uffff\uffff\u0000Lq\u0001\u0000\u0000\u0000MN\u0003"+
		"\u0018\f\u0000NO\u0006\u0002\uffff\uffff\u0000Oq\u0001\u0000\u0000\u0000"+
		"PQ\u0003\n\u0005\u0000QR\u0003\u001c\u000e\u0000RS\u0006\u0002\uffff\uffff"+
		"\u0000Sq\u0001\u0000\u0000\u0000TU\u0003\u0012\t\u0000UV\u0006\u0002\uffff"+
		"\uffff\u0000Vq\u0001\u0000\u0000\u0000WX\u0003\u0016\u000b\u0000XY\u0006"+
		"\u0002\uffff\uffff\u0000Yq\u0001\u0000\u0000\u0000Z[\u0003\u0014\n\u0000"+
		"[\\\u0006\u0002\uffff\uffff\u0000\\q\u0001\u0000\u0000\u0000]^\u0003\u001a"+
		"\r\u0000^_\u0003\u001c\u000e\u0000_`\u0006\u0002\uffff\uffff\u0000`q\u0001"+
		"\u0000\u0000\u0000ab\u0005\u0001\u0000\u0000bc\u0005\u0002\u0000\u0000"+
		"cd\u0005\u001f\u0000\u0000de\u0005\u0003\u0000\u0000ef\u0003\u001c\u000e"+
		"\u0000fg\u0006\u0002\uffff\uffff\u0000gq\u0001\u0000\u0000\u0000hi\u0005"+
		"\u001d\u0000\u0000ij\u0003\u0006\u0003\u0000jk\u0003\u001c\u000e\u0000"+
		"kl\u0006\u0002\uffff\uffff\u0000lq\u0001\u0000\u0000\u0000mn\u0003\u001c"+
		"\u000e\u0000no\u0006\u0002\uffff\uffff\u0000oq\u0001\u0000\u0000\u0000"+
		"pI\u0001\u0000\u0000\u0000pM\u0001\u0000\u0000\u0000pP\u0001\u0000\u0000"+
		"\u0000pT\u0001\u0000\u0000\u0000pW\u0001\u0000\u0000\u0000pZ\u0001\u0000"+
		"\u0000\u0000p]\u0001\u0000\u0000\u0000pa\u0001\u0000\u0000\u0000ph\u0001"+
		"\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000q\u0005\u0001\u0000\u0000"+
		"\u0000rs\u0006\u0003\uffff\uffff\u0000st\u0005\u0004\u0000\u0000tu\u0003"+
		"\u0006\u0003\buv\u0006\u0003\uffff\uffff\u0000v\u008b\u0001\u0000\u0000"+
		"\u0000wx\u0005\u0002\u0000\u0000xy\u0003\u0006\u0003\u0000yz\u0005\u0003"+
		"\u0000\u0000z{\u0006\u0003\uffff\uffff\u0000{\u008b\u0001\u0000\u0000"+
		"\u0000|}\u0005#\u0000\u0000}\u008b\u0006\u0003\uffff\uffff\u0000~\u007f"+
		"\u0005\u001f\u0000\u0000\u007f\u008b\u0006\u0003\uffff\uffff\u0000\u0080"+
		"\u0081\u0005\u001f\u0000\u0000\u0081\u0082\u0005\u0002\u0000\u0000\u0082"+
		"\u0083\u0005\u0003\u0000\u0000\u0083\u008b\u0006\u0003\uffff\uffff\u0000"+
		"\u0084\u0085\u0005\u001f\u0000\u0000\u0085\u0086\u0005\u0002\u0000\u0000"+
		"\u0086\u0087\u0003\u0010\b\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088"+
		"\u0089\u0006\u0003\uffff\uffff\u0000\u0089\u008b\u0001\u0000\u0000\u0000"+
		"\u008ar\u0001\u0000\u0000\u0000\u008aw\u0001\u0000\u0000\u0000\u008a|"+
		"\u0001\u0000\u0000\u0000\u008a~\u0001\u0000\u0000\u0000\u008a\u0080\u0001"+
		"\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008b\u0098\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\n\u0007\u0000\u0000\u008d\u008e\u0007\u0000"+
		"\u0000\u0000\u008e\u008f\u0003\u0006\u0003\b\u008f\u0090\u0006\u0003\uffff"+
		"\uffff\u0000\u0090\u0097\u0001\u0000\u0000\u0000\u0091\u0092\n\u0006\u0000"+
		"\u0000\u0092\u0093\u0007\u0001\u0000\u0000\u0093\u0094\u0003\u0006\u0003"+
		"\u0007\u0094\u0095\u0006\u0003\uffff\uffff\u0000\u0095\u0097\u0001\u0000"+
		"\u0000\u0000\u0096\u008c\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000"+
		"\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0007\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u001e"+
		"\u0000\u0000\u009c\u009d\u0005\u001f\u0000\u0000\u009d\u009e\u0003\u001c"+
		"\u000e\u0000\u009e\u009f\u0006\u0004\uffff\uffff\u0000\u009f\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005\u001e\u0000\u0000\u00a1\u00a2\u0005"+
		"\u001f\u0000\u0000\u00a2\u00a3\u0005\b\u0000\u0000\u00a3\u00a4\u0003\u0006"+
		"\u0003\u0000\u00a4\u00a5\u0003\u001c\u000e\u0000\u00a5\u00a6\u0006\u0004"+
		"\uffff\uffff\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u009b\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a0\u0001\u0000\u0000\u0000\u00a8\t\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005\u001f\u0000\u0000\u00aa\u00ab\u0005\b\u0000"+
		"\u0000\u00ab\u00ac\u0003\u0006\u0003\u0000\u00ac\u00ad\u0006\u0005\uffff"+
		"\uffff\u0000\u00ad\u00c2\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u001f"+
		"\u0000\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0\u00b1\u0005\b\u0000"+
		"\u0000\u00b1\u00b2\u0003\u0006\u0003\u0000\u00b2\u00b3\u0006\u0005\uffff"+
		"\uffff\u0000\u00b3\u00c2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u001f"+
		"\u0000\u0000\u00b5\u00b6\u0005\b\u0000\u0000\u00b6\u00b7\u0005\u001f\u0000"+
		"\u0000\u00b7\u00b8\u0005\u0007\u0000\u0000\u00b8\u00b9\u0003\u0006\u0003"+
		"\u0000\u00b9\u00ba\u0006\u0005\uffff\uffff\u0000\u00ba\u00c2\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\t\u0000\u0000\u00bc\u00bd\u0005\u0002\u0000"+
		"\u0000\u00bd\u00be\u0003\u0006\u0003\u0000\u00be\u00bf\u0005\u0003\u0000"+
		"\u0000\u00bf\u00c0\u0006\u0005\uffff\uffff\u0000\u00c0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00a9\u0001\u0000\u0000\u0000\u00c1\u00ae\u0001\u0000"+
		"\u0000\u0000\u00c1\u00b4\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c2\u000b\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u001e"+
		"\u0000\u0000\u00c4\u00c5\u0005\u001f\u0000\u0000\u00c5\u00c7\u0005\u0002"+
		"\u0000\u0000\u00c6\u00c8\u0003\u000e\u0007\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0003\u0000\u0000\u00ca\u00cb\u0006\u0006"+
		"\uffff\uffff\u0000\u00cb\u00cc\u0003\u0004\u0002\u0000\u00cc\u00cd\u0006"+
		"\u0006\uffff\uffff\u0000\u00cd\r\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"\u001e\u0000\u0000\u00cf\u00d0\u0005\u001f\u0000\u0000\u00d0\u00d7\u0006"+
		"\u0007\uffff\uffff\u0000\u00d1\u00d2\u0005\n\u0000\u0000\u00d2\u00d3\u0005"+
		"\u001e\u0000\u0000\u00d3\u00d4\u0005\u001f\u0000\u0000\u00d4\u00d6\u0006"+
		"\u0007\uffff\uffff\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d6\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u000f\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0003\u0006\u0003\u0000\u00db\u00e2"+
		"\u0006\b\uffff\uffff\u0000\u00dc\u00dd\u0005\n\u0000\u0000\u00dd\u00de"+
		"\u0003\u0006\u0003\u0000\u00de\u00df\u0006\b\uffff\uffff\u0000\u00df\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e5\u00da\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u0011\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0005\u000b\u0000\u0000\u00e8\u00e9\u0005\u0002\u0000\u0000\u00e9\u00ea"+
		"\u0003\u001a\r\u0000\u00ea\u00eb\u0005\u0003\u0000\u0000\u00eb\u00ec\u0003"+
		"\u0004\u0002\u0000\u00ec\u00ed\u0005\f\u0000\u0000\u00ed\u00ee\u0003\u0004"+
		"\u0002\u0000\u00ee\u00ef\u0006\t\uffff\uffff\u0000\u00ef\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0005\u000b\u0000\u0000\u00f1\u00f2\u0005\u0002"+
		"\u0000\u0000\u00f2\u00f3\u0003\u001a\r\u0000\u00f3\u00f4\u0005\u0003\u0000"+
		"\u0000\u00f4\u00f5\u0003\u0004\u0002\u0000\u00f5\u00f6\u0006\t\uffff\uffff"+
		"\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00e7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f0\u0001\u0000\u0000\u0000\u00f8\u0013\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005\r\u0000\u0000\u00fa\u00fb\u0005\u0002\u0000\u0000"+
		"\u00fb\u00fc\u0003\u001a\r\u0000\u00fc\u00fd\u0005\u0003\u0000\u0000\u00fd"+
		"\u00fe\u0003\u0004\u0002\u0000\u00fe\u00ff\u0006\n\uffff\uffff\u0000\u00ff"+
		"\u0015\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u000e\u0000\u0000\u0101"+
		"\u0102\u0005\u0002\u0000\u0000\u0102\u0103\u0003\n\u0005\u0000\u0103\u0104"+
		"\u0005\u000f\u0000\u0000\u0104\u0105\u0003\u001a\r\u0000\u0105\u0106\u0005"+
		"\u000f\u0000\u0000\u0106\u0107\u0003\n\u0005\u0000\u0107\u0108\u0005\u0003"+
		"\u0000\u0000\u0108\u0109\u0003\u0004\u0002\u0000\u0109\u010a\u0006\u000b"+
		"\uffff\uffff\u0000\u010a\u0017\u0001\u0000\u0000\u0000\u010b\u0111\u0005"+
		"\u0010\u0000\u0000\u010c\u010d\u0003\u0004\u0002\u0000\u010d\u010e\u0006"+
		"\f\uffff\uffff\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010c\u0001"+
		"\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0118\u0005"+
		"\u0011\u0000\u0000\u0115\u0117\u0005$\u0000\u0000\u0116\u0115\u0001\u0000"+
		"\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0019\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0006\r\uffff"+
		"\uffff\u0000\u011c\u011d\u0003\u0006\u0003\u0000\u011d\u011e\u0005\u0012"+
		"\u0000\u0000\u011e\u011f\u0003\u0006\u0003\u0000\u011f\u0120\u0006\r\uffff"+
		"\uffff\u0000\u0120\u0143\u0001\u0000\u0000\u0000\u0121\u0122\u0003\u0006"+
		"\u0003\u0000\u0122\u0123\u0005\u0013\u0000\u0000\u0123\u0124\u0003\u0006"+
		"\u0003\u0000\u0124\u0125\u0006\r\uffff\uffff\u0000\u0125\u0143\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0003\u0006\u0003\u0000\u0127\u0128\u0005\u0014"+
		"\u0000\u0000\u0128\u0129\u0003\u0006\u0003\u0000\u0129\u012a\u0006\r\uffff"+
		"\uffff\u0000\u012a\u0143\u0001\u0000\u0000\u0000\u012b\u012c\u0003\u0006"+
		"\u0003\u0000\u012c\u012d\u0005\u0015\u0000\u0000\u012d\u012e\u0003\u0006"+
		"\u0003\u0000\u012e\u012f\u0006\r\uffff\uffff\u0000\u012f\u0143\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0003\u0006\u0003\u0000\u0131\u0132\u0005\u0016"+
		"\u0000\u0000\u0132\u0133\u0003\u0006\u0003\u0000\u0133\u0134\u0006\r\uffff"+
		"\uffff\u0000\u0134\u0143\u0001\u0000\u0000\u0000\u0135\u0136\u0003\u0006"+
		"\u0003\u0000\u0136\u0137\u0005\u0017\u0000\u0000\u0137\u0138\u0003\u0006"+
		"\u0003\u0000\u0138\u0139\u0006\r\uffff\uffff\u0000\u0139\u0143\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0005\u0018\u0000\u0000\u013b\u0143\u0006\r\uffff"+
		"\uffff\u0000\u013c\u013d\u0005\u0019\u0000\u0000\u013d\u0143\u0006\r\uffff"+
		"\uffff\u0000\u013e\u013f\u0005\u001a\u0000\u0000\u013f\u0140\u0003\u001a"+
		"\r\u0003\u0140\u0141\u0006\r\uffff\uffff\u0000\u0141\u0143\u0001\u0000"+
		"\u0000\u0000\u0142\u011b\u0001\u0000\u0000\u0000\u0142\u0121\u0001\u0000"+
		"\u0000\u0000\u0142\u0126\u0001\u0000\u0000\u0000\u0142\u012b\u0001\u0000"+
		"\u0000\u0000\u0142\u0130\u0001\u0000\u0000\u0000\u0142\u0135\u0001\u0000"+
		"\u0000\u0000\u0142\u013a\u0001\u0000\u0000\u0000\u0142\u013c\u0001\u0000"+
		"\u0000\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0143\u0150\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\n\u0002\u0000\u0000\u0145\u0146\u0005\u001b\u0000"+
		"\u0000\u0146\u0147\u0003\u001a\r\u0003\u0147\u0148\u0006\r\uffff\uffff"+
		"\u0000\u0148\u014f\u0001\u0000\u0000\u0000\u0149\u014a\n\u0001\u0000\u0000"+
		"\u014a\u014b\u0005\u001c\u0000\u0000\u014b\u014c\u0003\u001a\r\u0002\u014c"+
		"\u014d\u0006\r\uffff\uffff\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e"+
		"\u0144\u0001\u0000\u0000\u0000\u014e\u0149\u0001\u0000\u0000\u0000\u014f"+
		"\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0001\u0000\u0000\u0000\u0151\u001b\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0153\u0155\u0007\u0002\u0000\u0000\u0154"+
		"\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"\u001d\u0001\u0000\u0000\u0000\u0016&-5;Dp\u008a\u0096\u0098\u00a7\u00c1"+
		"\u00c7\u00d7\u00e2\u00e5\u00f7\u0111\u0118\u0142\u014e\u0150\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}