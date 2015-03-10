/*
 * *
 *
 *
 * Copyright 2015 Bill Bejeck
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

// Generated from /Users/bbejeck/workspace_intellij/nosql-jdbc-driver/src/main/java/LuceneSql.g4 by ANTLR 4.5
package bbejeck.nosql.antlr.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuceneSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, NOT=6, DESCRIBE=7, MATCHES=8, 
		BETWEEN=9, LIKE=10, MEMORY=11, EQ=12, NE=13, GT=14, LT=15, GTE=16, LTE=17, 
		IN=18, NUMBER=19, DATE=20, FIELD=21, PATH=22, TERM=23, PHRASE=24, WILD_CARD=25, 
		MULTI_PHRASE=26, DB_QUOTE_STRING_LIT=27, COMMA=28, RPAREN=29, LPAREN=30, 
		WS=31;
	public static final int
		RULE_query = 0, RULE_describe_stmt = 1, RULE_select_stmt = 2, RULE_from_stmt = 3, 
		RULE_where_stmt = 4, RULE_search_condition = 5, RULE_predicate = 6, RULE_comparison_predicate = 7, 
		RULE_function_predicate = 8, RULE_field = 9, RULE_comparison_op = 10, 
		RULE_boolean_op = 11, RULE_nested_predicate = 12, RULE_value = 13, RULE_regexp = 14, 
		RULE_between = 15, RULE_between_term = 16, RULE_between_number = 17, RULE_like = 18, 
		RULE_in = 19, RULE_value_list = 20, RULE_number_list = 21, RULE_date_list = 22, 
		RULE_term_list = 23;
	public static final String[] ruleNames = {
		"query", "describe_stmt", "select_stmt", "from_stmt", "where_stmt", "search_condition", 
		"predicate", "comparison_predicate", "function_predicate", "field", "comparison_op", 
		"boolean_op", "nested_predicate", "value", "regexp", "between", "between_term", 
		"between_number", "like", "in", "value_list", "number_list", "date_list", 
		"term_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'='", "'!='", "'>'", "'<'", "'>='", "'<='", null, null, null, null, null, 
		null, null, null, null, null, "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "DESCRIBE", "MATCHES", 
		"BETWEEN", "LIKE", "MEMORY", "EQ", "NE", "GT", "LT", "GTE", "LTE", "IN", 
		"NUMBER", "DATE", "FIELD", "PATH", "TERM", "PHRASE", "WILD_CARD", "MULTI_PHRASE", 
		"DB_QUOTE_STRING_LIT", "COMMA", "RPAREN", "LPAREN", "WS"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LuceneSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LuceneSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public Describe_stmtContext describe_stmt() {
			return getRuleContext(Describe_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Where_stmtContext where_stmt() {
			return getRuleContext(Where_stmtContext.class,0);
		}
		public From_stmtContext from_stmt() {
			return getRuleContext(From_stmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			setState(55);
			switch (_input.LA(1)) {
			case DESCRIBE:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); 
				describe_stmt();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(49); 
				select_stmt();
				setState(51);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(50); 
					from_stmt();
					}
				}

				setState(53); 
				where_stmt();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Describe_stmtContext extends ParserRuleContext {
		public TerminalNode DESCRIBE() { return getToken(LuceneSqlParser.DESCRIBE, 0); }
		public TerminalNode PATH() { return getToken(LuceneSqlParser.PATH, 0); }
		public Describe_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterDescribe_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitDescribe_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitDescribe_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Describe_stmtContext describe_stmt() throws RecognitionException {
		Describe_stmtContext _localctx = new Describe_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_describe_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			match(DESCRIBE);
			setState(58); 
			match(PATH);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(LuceneSqlParser.SELECT, 0); }
		public List<TerminalNode> FIELD() { return getTokens(LuceneSqlParser.FIELD); }
		public TerminalNode FIELD(int i) {
			return getToken(LuceneSqlParser.FIELD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuceneSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuceneSqlParser.COMMA, i);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			match(SELECT);
			setState(61); 
			match(FIELD);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62); 
				match(COMMA);
				setState(63); 
				match(FIELD);
				}
				}
				setState(68);
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

	public static class From_stmtContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(LuceneSqlParser.FROM, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(LuceneSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(LuceneSqlParser.RPAREN, i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(LuceneSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(LuceneSqlParser.LPAREN, i);
		}
		public List<TerminalNode> PATH() { return getTokens(LuceneSqlParser.PATH); }
		public TerminalNode PATH(int i) {
			return getToken(LuceneSqlParser.PATH, i);
		}
		public From_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterFrom_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitFrom_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitFrom_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_stmtContext from_stmt() throws RecognitionException {
		From_stmtContext _localctx = new From_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_from_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			match(FROM);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATH || _la==RPAREN) {
				{
				setState(75);
				switch (_input.LA(1)) {
				case RPAREN:
					{
					setState(70); 
					match(RPAREN);
					setState(71); 
					query();
					setState(72); 
					match(LPAREN);
					}
					break;
				case PATH:
					{
					setState(74); 
					match(PATH);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
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

	public static class Where_stmtContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(LuceneSqlParser.WHERE, 0); }
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public Where_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterWhere_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitWhere_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitWhere_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_stmtContext where_stmt() throws RecognitionException {
		Where_stmtContext _localctx = new Where_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_where_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			match(WHERE);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81); 
				search_condition();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << FIELD))) != 0) );
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

	public static class Search_conditionContext extends ParserRuleContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<Nested_predicateContext> nested_predicate() {
			return getRuleContexts(Nested_predicateContext.class);
		}
		public Nested_predicateContext nested_predicate(int i) {
			return getRuleContext(Nested_predicateContext.class,i);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterSearch_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitSearch_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitSearch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_search_condition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			predicate();
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(89);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(87); 
						predicate();
						}
						break;
					case 2:
						{
						setState(88); 
						nested_predicate();
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class PredicateContext extends ParserRuleContext {
		public Comparison_predicateContext comparison_predicate() {
			return getRuleContext(Comparison_predicateContext.class,0);
		}
		public Function_predicateContext function_predicate() {
			return getRuleContext(Function_predicateContext.class,0);
		}
		public Boolean_opContext boolean_op() {
			return getRuleContext(Boolean_opContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				setState(94); 
				boolean_op();
				}
			}

			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(97); 
				comparison_predicate();
				}
				break;
			case 2:
				{
				setState(98); 
				function_predicate();
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

	public static class Comparison_predicateContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Comparison_opContext comparison_op() {
			return getRuleContext(Comparison_opContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Comparison_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterComparison_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitComparison_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitComparison_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_predicateContext comparison_predicate() throws RecognitionException {
		Comparison_predicateContext _localctx = new Comparison_predicateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparison_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			field();
			setState(102); 
			comparison_op();
			setState(103); 
			value();
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

	public static class Function_predicateContext extends ParserRuleContext {
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public BetweenContext between() {
			return getRuleContext(BetweenContext.class,0);
		}
		public LikeContext like() {
			return getRuleContext(LikeContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public Function_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterFunction_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitFunction_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitFunction_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_predicateContext function_predicate() throws RecognitionException {
		Function_predicateContext _localctx = new Function_predicateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_predicate);
		try {
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); 
				regexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); 
				between();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); 
				like();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108); 
				in();
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(LuceneSqlParser.FIELD, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			match(FIELD);
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

	public static class Comparison_opContext extends ParserRuleContext {
		public Comparison_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_op; }
	 
		public Comparison_opContext() { }
		public void copyFrom(Comparison_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterThanEqualsContext extends Comparison_opContext {
		public TerminalNode GTE() { return getToken(LuceneSqlParser.GTE, 0); }
		public GreaterThanEqualsContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterGreaterThanEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitGreaterThanEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitGreaterThanEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends Comparison_opContext {
		public TerminalNode LT() { return getToken(LuceneSqlParser.LT, 0); }
		public LessThanContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualContext extends Comparison_opContext {
		public TerminalNode NE() { return getToken(LuceneSqlParser.NE, 0); }
		public NotEqualContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends Comparison_opContext {
		public TerminalNode GT() { return getToken(LuceneSqlParser.GT, 0); }
		public GreaterThanContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends Comparison_opContext {
		public TerminalNode EQ() { return getToken(LuceneSqlParser.EQ, 0); }
		public EqualsContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanEqualsContext extends Comparison_opContext {
		public TerminalNode LTE() { return getToken(LuceneSqlParser.LTE, 0); }
		public LessThanEqualsContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLessThanEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLessThanEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLessThanEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_opContext comparison_op() throws RecognitionException {
		Comparison_opContext _localctx = new Comparison_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparison_op);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case EQ:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113); 
				match(EQ);
				}
				break;
			case NE:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114); 
				match(NE);
				}
				break;
			case LT:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115); 
				match(LT);
				}
				break;
			case GT:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116); 
				match(GT);
				}
				break;
			case GTE:
				_localctx = new GreaterThanEqualsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117); 
				match(GTE);
				}
				break;
			case LTE:
				_localctx = new LessThanEqualsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(118); 
				match(LTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Boolean_opContext extends ParserRuleContext {
		public Boolean_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_op; }
	 
		public Boolean_opContext() { }
		public void copyFrom(Boolean_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndNotContext extends Boolean_opContext {
		public TerminalNode AND() { return getToken(LuceneSqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(LuceneSqlParser.NOT, 0); }
		public AndNotContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterAndNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitAndNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitAndNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrNotContext extends Boolean_opContext {
		public TerminalNode OR() { return getToken(LuceneSqlParser.OR, 0); }
		public TerminalNode NOT() { return getToken(LuceneSqlParser.NOT, 0); }
		public OrNotContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitOrNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitOrNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends Boolean_opContext {
		public TerminalNode OR() { return getToken(LuceneSqlParser.OR, 0); }
		public OrContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends Boolean_opContext {
		public TerminalNode AND() { return getToken(LuceneSqlParser.AND, 0); }
		public AndContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends Boolean_opContext {
		public TerminalNode NOT() { return getToken(LuceneSqlParser.NOT, 0); }
		public NotContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_opContext boolean_op() throws RecognitionException {
		Boolean_opContext _localctx = new Boolean_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolean_op);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121); 
				match(AND);
				}
				break;
			case 2:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122); 
				match(OR);
				}
				break;
			case 3:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123); 
				match(NOT);
				}
				break;
			case 4:
				_localctx = new AndNotContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(124); 
				match(AND);
				setState(125); 
				match(NOT);
				}
				break;
			case 5:
				_localctx = new OrNotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(126); 
				match(OR);
				setState(127); 
				match(NOT);
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

	public static class Nested_predicateContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(LuceneSqlParser.RPAREN, 0); }
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(LuceneSqlParser.LPAREN, 0); }
		public Boolean_opContext boolean_op() {
			return getRuleContext(Boolean_opContext.class,0);
		}
		public List<Nested_predicateContext> nested_predicate() {
			return getRuleContexts(Nested_predicateContext.class);
		}
		public Nested_predicateContext nested_predicate(int i) {
			return getRuleContext(Nested_predicateContext.class,i);
		}
		public Nested_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterNested_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitNested_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitNested_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_predicateContext nested_predicate() throws RecognitionException {
		Nested_predicateContext _localctx = new Nested_predicateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nested_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				setState(130); 
				boolean_op();
				}
			}

			setState(133); 
			match(RPAREN);
			setState(134); 
			predicate();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << FIELD) | (1L << RPAREN))) != 0)) {
				{
				setState(137);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(135); 
					predicate();
					}
					break;
				case 2:
					{
					setState(136); 
					nested_predicate();
					}
					break;
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142); 
			match(LPAREN);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MULTI_PHRASEContext extends ValueContext {
		public TerminalNode MULTI_PHRASE() { return getToken(LuceneSqlParser.MULTI_PHRASE, 0); }
		public MULTI_PHRASEContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterMULTI_PHRASE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitMULTI_PHRASE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitMULTI_PHRASE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateContext extends ValueContext {
		public TerminalNode DATE() { return getToken(LuceneSqlParser.DATE, 0); }
		public DateContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(LuceneSqlParser.NUMBER, 0); }
		public NumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PhraseContext extends ValueContext {
		public TerminalNode PHRASE() { return getToken(LuceneSqlParser.PHRASE, 0); }
		public PhraseContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermContext extends ValueContext {
		public TerminalNode TERM() { return getToken(LuceneSqlParser.TERM, 0); }
		public TermContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144); 
				match(NUMBER);
				}
				break;
			case TERM:
				_localctx = new TermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145); 
				match(TERM);
				}
				break;
			case PHRASE:
				_localctx = new PhraseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146); 
				match(PHRASE);
				}
				break;
			case DATE:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(147); 
				match(DATE);
				}
				break;
			case MULTI_PHRASE:
				_localctx = new MULTI_PHRASEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148); 
				match(MULTI_PHRASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RegexpContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode MATCHES() { return getToken(LuceneSqlParser.MATCHES, 0); }
		public TerminalNode RPAREN() { return getToken(LuceneSqlParser.RPAREN, 0); }
		public TerminalNode WILD_CARD() { return getToken(LuceneSqlParser.WILD_CARD, 0); }
		public TerminalNode LPAREN() { return getToken(LuceneSqlParser.LPAREN, 0); }
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitRegexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitRegexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_regexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			field();
			setState(152); 
			match(MATCHES);
			setState(153); 
			match(RPAREN);
			setState(154); 
			match(WILD_CARD);
			setState(155); 
			match(LPAREN);
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

	public static class BetweenContext extends ParserRuleContext {
		public Between_numberContext between_number() {
			return getRuleContext(Between_numberContext.class,0);
		}
		public Between_termContext between_term() {
			return getRuleContext(Between_termContext.class,0);
		}
		public BetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenContext between() throws RecognitionException {
		BetweenContext _localctx = new BetweenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_between);
		try {
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); 
				between_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); 
				between_term();
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

	public static class Between_termContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(LuceneSqlParser.BETWEEN, 0); }
		public List<TerminalNode> TERM() { return getTokens(LuceneSqlParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(LuceneSqlParser.TERM, i);
		}
		public TerminalNode AND() { return getToken(LuceneSqlParser.AND, 0); }
		public Between_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterBetween_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitBetween_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitBetween_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_termContext between_term() throws RecognitionException {
		Between_termContext _localctx = new Between_termContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_between_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			field();
			setState(162); 
			match(BETWEEN);
			setState(163); 
			match(TERM);
			setState(164); 
			match(AND);
			setState(165); 
			match(TERM);
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

	public static class Between_numberContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(LuceneSqlParser.BETWEEN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(LuceneSqlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LuceneSqlParser.NUMBER, i);
		}
		public TerminalNode AND() { return getToken(LuceneSqlParser.AND, 0); }
		public Between_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterBetween_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitBetween_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitBetween_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_numberContext between_number() throws RecognitionException {
		Between_numberContext _localctx = new Between_numberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_between_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); 
			field();
			setState(168); 
			match(BETWEEN);
			setState(169); 
			match(NUMBER);
			setState(170); 
			match(AND);
			setState(171); 
			match(NUMBER);
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

	public static class LikeContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(LuceneSqlParser.LIKE, 0); }
		public TerminalNode WILD_CARD() { return getToken(LuceneSqlParser.WILD_CARD, 0); }
		public LikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_like; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeContext like() throws RecognitionException {
		LikeContext _localctx = new LikeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_like);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); 
			field();
			setState(174); 
			match(LIKE);
			setState(175); 
			match(WILD_CARD);
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

	public static class InContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode IN() { return getToken(LuceneSqlParser.IN, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LuceneSqlParser.NOT, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); 
			field();
			setState(179);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(178); 
				match(NOT);
				}
			}

			setState(181); 
			match(IN);
			setState(182); 
			value_list();
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

	public static class Value_listContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(LuceneSqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(LuceneSqlParser.LPAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public Number_listContext number_list() {
			return getRuleContext(Number_listContext.class,0);
		}
		public Date_listContext date_list() {
			return getRuleContext(Date_listContext.class,0);
		}
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitValue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitValue_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			match(RPAREN);
			setState(189);
			switch (_input.LA(1)) {
			case SELECT:
			case DESCRIBE:
				{
				setState(185); 
				query();
				}
				break;
			case NUMBER:
				{
				setState(186); 
				number_list();
				}
				break;
			case DATE:
				{
				setState(187); 
				date_list();
				}
				break;
			case TERM:
				{
				setState(188); 
				term_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(191); 
			match(LPAREN);
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

	public static class Number_listContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(LuceneSqlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LuceneSqlParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuceneSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuceneSqlParser.COMMA, i);
		}
		public Number_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterNumber_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitNumber_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitNumber_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_listContext number_list() throws RecognitionException {
		Number_listContext _localctx = new Number_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_number_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); 
			match(NUMBER);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(194); 
				match(COMMA);
				setState(195); 
				match(NUMBER);
				}
				}
				setState(200);
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

	public static class Date_listContext extends ParserRuleContext {
		public List<TerminalNode> DATE() { return getTokens(LuceneSqlParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(LuceneSqlParser.DATE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuceneSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuceneSqlParser.COMMA, i);
		}
		public Date_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterDate_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitDate_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitDate_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_listContext date_list() throws RecognitionException {
		Date_listContext _localctx = new Date_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_date_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			match(DATE);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202); 
				match(COMMA);
				setState(203); 
				match(DATE);
				}
				}
				setState(208);
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

	public static class Term_listContext extends ParserRuleContext {
		public List<TerminalNode> TERM() { return getTokens(LuceneSqlParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(LuceneSqlParser.TERM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuceneSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuceneSqlParser.COMMA, i);
		}
		public Term_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterTerm_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitTerm_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitTerm_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_listContext term_list() throws RecognitionException {
		Term_listContext _localctx = new Term_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_term_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); 
			match(TERM);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(210); 
				match(COMMA);
				setState(211); 
				match(TERM);
				}
				}
				setState(216);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\5\2\66\n\2\3\2\3\2\5\2:\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7"+
		"\4C\n\4\f\4\16\4F\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5"+
		"\3\6\3\6\6\6U\n\6\r\6\16\6V\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\b\5"+
		"\bb\n\b\3\b\3\b\5\bf\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\np\n\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0083\n\r\3\16\5\16\u0086\n\16\3\16\3\16\3\16\3\16\7\16\u008c\n\16\f"+
		"\16\16\16\u008f\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0098\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00a2\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\5\25\u00b6\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00c0\n\26\3\26\3\26\3\27\3\27\3\27\7\27\u00c7\n\27\f\27\16\27\u00ca"+
		"\13\27\3\30\3\30\3\30\7\30\u00cf\n\30\f\30\16\30\u00d2\13\30\3\31\3\31"+
		"\3\31\7\31\u00d7\n\31\f\31\16\31\u00da\13\31\3\31\2\2\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\u00e8\29\3\2\2\2\4;\3\2\2\2\6"+
		">\3\2\2\2\bG\3\2\2\2\nR\3\2\2\2\fX\3\2\2\2\16a\3\2\2\2\20g\3\2\2\2\22"+
		"o\3\2\2\2\24q\3\2\2\2\26y\3\2\2\2\30\u0082\3\2\2\2\32\u0085\3\2\2\2\34"+
		"\u0097\3\2\2\2\36\u0099\3\2\2\2 \u00a1\3\2\2\2\"\u00a3\3\2\2\2$\u00a9"+
		"\3\2\2\2&\u00af\3\2\2\2(\u00b3\3\2\2\2*\u00ba\3\2\2\2,\u00c3\3\2\2\2."+
		"\u00cb\3\2\2\2\60\u00d3\3\2\2\2\62:\5\4\3\2\63\65\5\6\4\2\64\66\5\b\5"+
		"\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\5\n\6\28:\3\2\2\29\62"+
		"\3\2\2\29\63\3\2\2\2:\3\3\2\2\2;<\7\t\2\2<=\7\30\2\2=\5\3\2\2\2>?\7\3"+
		"\2\2?D\7\27\2\2@A\7\36\2\2AC\7\27\2\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE"+
		"\3\2\2\2E\7\3\2\2\2FD\3\2\2\2GO\7\4\2\2HI\7\37\2\2IJ\5\2\2\2JK\7 \2\2"+
		"KN\3\2\2\2LN\7\30\2\2MH\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2P\t\3\2\2\2QO\3\2\2\2RT\7\5\2\2SU\5\f\7\2TS\3\2\2\2UV\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2W\13\3\2\2\2X]\5\16\b\2Y\\\5\16\b\2Z\\\5\32\16\2[Y\3\2\2"+
		"\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\r\3\2\2\2_]\3\2\2\2`b\5\30"+
		"\r\2a`\3\2\2\2ab\3\2\2\2be\3\2\2\2cf\5\20\t\2df\5\22\n\2ec\3\2\2\2ed\3"+
		"\2\2\2f\17\3\2\2\2gh\5\24\13\2hi\5\26\f\2ij\5\34\17\2j\21\3\2\2\2kp\5"+
		"\36\20\2lp\5 \21\2mp\5&\24\2np\5(\25\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2o"+
		"n\3\2\2\2p\23\3\2\2\2qr\7\27\2\2r\25\3\2\2\2sz\7\16\2\2tz\7\17\2\2uz\7"+
		"\21\2\2vz\7\20\2\2wz\7\22\2\2xz\7\23\2\2ys\3\2\2\2yt\3\2\2\2yu\3\2\2\2"+
		"yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\27\3\2\2\2{\u0083\7\6\2\2|\u0083\7\7\2"+
		"\2}\u0083\7\b\2\2~\177\7\6\2\2\177\u0083\7\b\2\2\u0080\u0081\7\7\2\2\u0081"+
		"\u0083\7\b\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0083\31\3\2\2\2\u0084\u0086\5\30\r\2\u0085\u0084"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\37\2\2"+
		"\u0088\u008d\5\16\b\2\u0089\u008c\5\16\b\2\u008a\u008c\5\32\16\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7 \2\2\u0091\33\3\2\2\2\u0092\u0098\7\25\2\2\u0093\u0098\7\31\2"+
		"\2\u0094\u0098\7\32\2\2\u0095\u0098\7\26\2\2\u0096\u0098\7\34\2\2\u0097"+
		"\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0096\3\2\2\2\u0098\35\3\2\2\2\u0099\u009a\5\24\13\2\u009a"+
		"\u009b\7\n\2\2\u009b\u009c\7\37\2\2\u009c\u009d\7\33\2\2\u009d\u009e\7"+
		" \2\2\u009e\37\3\2\2\2\u009f\u00a2\5$\23\2\u00a0\u00a2\5\"\22\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2!\3\2\2\2\u00a3\u00a4\5\24\13"+
		"\2\u00a4\u00a5\7\13\2\2\u00a5\u00a6\7\31\2\2\u00a6\u00a7\7\6\2\2\u00a7"+
		"\u00a8\7\31\2\2\u00a8#\3\2\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\7\13"+
		"\2\2\u00ab\u00ac\7\25\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00ae\7\25\2\2\u00ae"+
		"%\3\2\2\2\u00af\u00b0\5\24\13\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\7\33\2"+
		"\2\u00b2\'\3\2\2\2\u00b3\u00b5\5\24\13\2\u00b4\u00b6\7\b\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\24\2\2"+
		"\u00b8\u00b9\5*\26\2\u00b9)\3\2\2\2\u00ba\u00bf\7\37\2\2\u00bb\u00c0\5"+
		"\2\2\2\u00bc\u00c0\5,\27\2\u00bd\u00c0\5.\30\2\u00be\u00c0\5\60\31\2\u00bf"+
		"\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7 \2\2\u00c2+\3\2\2\2\u00c3\u00c8"+
		"\7\25\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00c7\7\25\2\2\u00c6\u00c4\3\2\2"+
		"\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9-"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d0\7\26\2\2\u00cc\u00cd\7\36\2\2"+
		"\u00cd\u00cf\7\26\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1/\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d8\7\31\2\2\u00d4\u00d5\7\36\2\2\u00d5\u00d7\7\31\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\61\3\2\2\2\u00da\u00d8\3\2\2\2\31\659DMOV[]aeoy\u0082\u0085\u008b\u008d"+
		"\u0097\u00a1\u00b5\u00bf\u00c8\u00d0\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}