// $ANTLR 3.0.1 F:\\StudyAntlr\\SPC.g 2018-06-03 21:04:54

package edu.wis.jtlv.env.core.spec;

import edu.wis.jtlv.env.Env;

import java.util.Vector;

import static edu.wis.jtlv.env.core.spec.InternalSpecLanguage.*;


import org.antlr.runtime.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SPCParser extends Parser {
    public static final String[] tokenNames = new String[]{
            "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NOP", "SPEC_LIST_T", "SUBRANGE_T", "VALUE_T", "SET_LIST_EXP_T", "BLOCK_T", "CASE_LIST_EXPR_T", "CASE_ELEMENT_EXPR_T", "BIT_SELECT_T", "ARRAY_INDEX_T", "TOK_UNARY_MINUS_T", "PURE_CTL_T", "PURE_LTL_T", "ATLS_PURE_CTL_T", "PURE_CTL_EPISTEMIC_T", "CTL_KNOW_T", "TOK_CTL_KNOW_T", "CTL_SKNOW_T", "TOK_CTL_SKNOW_T", "CTLS_KNOW_T", "TOK_AGENT_NAME_T", "PURE_ATLS_T", "PURE_ATL_STAR_T", "AGENT_SET_LIST_T", "TOK_INVAR_SPEC", "TOK_CTL_SPEC", "TOK_LTL_SPEC", "TOK_ATL_STAR_SPEC", "TOK_IMPLIES", "TOK_IFF", "TOK_OR", "TOK_XOR", "TOK_XNOR", "TOK_AND", "TOK_EQUAL", "TOK_NOTEQUAL", "TOK_LT", "TOK_GT", "TOK_LE", "TOK_GE", "TOK_SETIN", "TOK_UNION", "TOK_LCB", "TOK_RCB", "TOK_COMMA", "TOK_LSHIFT", "TOK_RSHIFT", "TOK_MOD", "TOK_PLUS", "TOK_MINUS", "TOK_TIMES", "TOK_DIVIDE", "TOK_CONCATENATION", "TOK_NOT", "TOK_LP", "TOK_RP", "TOK_BOOL", "TOK_WORD1", "TOK_NEXT", "TOK_CASE", "TOK_ESAC", "TOK_WAREAD", "TOK_WAWRITE", "TOK_EX", "TOK_AX", "TOK_EF", "TOK_AF", "TOK_EG", "TOK_AG", "TOK_EBF", "TOK_ABF", "TOK_EBG", "TOK_ABG", "TOK_AA", "TOK_LB", "TOK_UNTIL", "TOK_RB", "TOK_EE", "TOK_BUNTIL", "TOK_KNOW", "TOK_SKNOW", "TOK_ATOM", "TOK_SINCE", "TOK_RELEASE", "TOK_TRIGGERED", "TOK_OP_NEXT", "TOK_OP_PREV", "TOK_OP_NOTPREVNOT", "TOK_OP_GLOBALLY", "TOK_OP_HISTORICALLY", "TOK_OP_FINALLY", "TOK_OP_ONCE", "TOK_BRELEASE", "TOK_OP_BFINALLY", "TOK_OP_BGLOBALLY", "TOK_DOT", "TOK_NUMBER", "TOK_COLON", "TOK_SEMI", "TOK_NUMBER_WORD", "TOK_TWODOTS", "TOK_FALSEEXP", "TOK_TRUEEXP", "TOK_CTL_STAR_SPEC", "TOK_WORD", "TOK_NUMBER_FRAC", "JTOK_WS", "JTOK_MULTI_COMMENT", "JTOK_LINE_COMMENT"
    };
    public static final int TOK_PLUS = 52;
    public static final int TOK_RCB = 47;
    public static final int CTL_KNOW_T = 19;
    public static final int TOK_UNARY_MINUS_T = 14;
    public static final int TOK_XOR = 35;
    public static final int ARRAY_INDEX_T = 13;
    public static final int TOK_ABG = 76;
    public static final int TOK_ABF = 74;
    public static final int TOK_TIMES = 54;
    public static final int AGENT_SET_LIST_T = 27;
    public static final int TOK_EBG = 75;
    public static final int TOK_EBF = 73;
    public static final int TOK_LP = 58;
    public static final int TOK_LT = 40;
    public static final int CTLS_KNOW_T = 23;
    public static final int TOK_COLON = 101;
    public static final int JTOK_MULTI_COMMENT = 111;
    public static final int TOK_SETIN = 44;
    public static final int SPEC_LIST_T = 5;
    public static final int TOK_BRELEASE = 96;
    public static final int TOK_EQUAL = 38;
    public static final int TOK_LB = 78;
    public static final int TOK_TRUEEXP = 106;
    public static final int TOK_BUNTIL = 82;
    public static final int TOK_LE = 42;
    public static final int TOK_OP_BGLOBALLY = 98;
    public static final int TOK_UNTIL = 79;
    public static final int TOK_DOT = 99;
    public static final int SUBRANGE_T = 6;
    public static final int CASE_ELEMENT_EXPR_T = 11;
    public static final int TOK_CTL_SKNOW_T = 22;
    public static final int TOK_ATOM = 85;
    public static final int TOK_XNOR = 36;
    public static final int TOK_AG = 72;
    public static final int TOK_AF = 70;
    public static final int TOK_WAWRITE = 66;
    public static final int TOK_RB = 80;
    public static final int TOK_OP_ONCE = 95;
    public static final int TOK_CTL_KNOW_T = 20;
    public static final int TOK_SEMI = 102;
    public static final int TOK_OP_BFINALLY = 97;
    public static final int TOK_AA = 77;
    public static final int TOK_NUMBER_FRAC = 109;
    public static final int TOK_MINUS = 53;
    public static final int TOK_NUMBER_WORD = 103;
    public static final int PURE_ATL_STAR_T = 26;
    public static final int TOK_IMPLIES = 32;
    public static final int TOK_KNOW = 83;
    public static final int TOK_AX = 68;
    public static final int JTOK_WS = 110;
    public static final int TOK_OP_GLOBALLY = 92;
    public static final int TOK_FALSEEXP = 105;
    public static final int TOK_RP = 59;
    public static final int VALUE_T = 7;
    public static final int TOK_RSHIFT = 50;
    public static final int TOK_SINCE = 86;
    public static final int TOK_WAREAD = 65;
    public static final int TOK_OR = 34;
    public static final int TOK_OP_NOTPREVNOT = 91;
    public static final int TOK_NOT = 57;
    public static final int TOK_OP_PREV = 90;
    public static final int BLOCK_T = 9;
    public static final int TOK_LSHIFT = 49;
    public static final int CTL_SKNOW_T = 21;
    public static final int TOK_AND = 37;
    public static final int TOK_GT = 41;
    public static final int TOK_ATL_STAR_SPEC = 31;
    public static final int TOK_TRIGGERED = 88;
    public static final int TOK_AGENT_NAME_T = 24;
    public static final int TOK_CASE = 63;
    public static final int TOK_IFF = 33;
    public static final int TOK_CTL_STAR_SPEC = 107;
    public static final int TOK_GE = 43;
    public static final int SET_LIST_EXP_T = 8;
    public static final int CASE_LIST_EXPR_T = 10;
    public static final int TOK_TWODOTS = 104;
    public static final int NOP = 4;
    public static final int TOK_COMMA = 48;
    public static final int TOK_UNION = 45;
    public static final int TOK_NUMBER = 100;
    public static final int TOK_LTL_SPEC = 30;
    public static final int TOK_ESAC = 64;
    public static final int TOK_SKNOW = 84;
    public static final int TOK_LCB = 46;
    public static final int TOK_DIVIDE = 55;
    public static final int TOK_OP_NEXT = 89;
    public static final int PURE_CTL_EPISTEMIC_T = 18;
    public static final int TOK_EG = 71;
    public static final int TOK_EF = 69;
    public static final int TOK_RELEASE = 87;
    public static final int PURE_CTL_T = 15;
    public static final int TOK_NOTEQUAL = 39;
    public static final int ATLS_PURE_CTL_T = 17;
    public static final int BIT_SELECT_T = 12;
    public static final int TOK_INVAR_SPEC = 28;
    public static final int TOK_EE = 81;
    public static final int EOF = -1;
    public static final int TOK_BOOL = 60;
    public static final int PURE_LTL_T = 16;
    public static final int TOK_OP_FINALLY = 94;
    public static final int JTOK_LINE_COMMENT = 112;
    public static final int TOK_OP_HISTORICALLY = 93;
    public static final int PURE_ATLS_T = 25;
    public static final int TOK_WORD1 = 61;
    public static final int TOK_CONCATENATION = 56;
    public static final int TOK_NEXT = 62;
    public static final int TOK_EX = 67;
    public static final int TOK_MOD = 51;
    public static final int TOK_WORD = 108;
    public static final int TOK_CTL_SPEC = 29;

    public SPCParser(TokenStream input) {
        super(input);
        ruleMemo = new HashMap[113 + 1];
    }

    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }

    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() {
        return tokenNames;
    }

    public String getGrammarFileName() {
        return "F:\\StudyAntlr\\SPC.g";
    }


    // for exception handling
    public String getErrorMessage(RecognitionException e, String[] tokenNames) {
        String msg = null;
        if (e instanceof SpecParseException) {
            msg = e.toString();
            Env.doError(e, msg);
        } else {
            msg = super.getErrorMessage(e, tokenNames);
            Env.doError(e, msg);
        }
        return msg;
    }

    public void emitErrorMessage(String msg) {
        // System.err.println(msg);
        // do nothing.
    }

    // I don't like the printing...
    public void recoverFromMismatchedToken(IntStream input,
                                           RecognitionException e, int ttype, BitSet follow)
            throws RecognitionException {
        //System.err.println("BR.recoverFromMismatchedToken");
        // if next token is what we are looking for then "delete" this token
        if (input.LA(2) == ttype) {
            reportError(e);
            /*
             * System.err.println("recoverFromMismatchedToken deleting
             * "+input.LT(1)+ " since "+input.LT(2)+" is what we want");
             */
            beginResync();
            input.consume(); // simply delete extra token
            endResync();
            input.consume(); // move past ttype token as if all were ok
            return;
        }
        if (!recoverFromMismatchedElement(input, e, follow)) {
            throw e;
        }
    }

    public static boolean in_my_recovery_mode = false;

    public boolean er() {
        //if (input.LA(1) == TOK_SEMI)
        //	in_my_recovery_mode = true;
        return errorRecovery | in_my_recovery_mode;
    }

    public void recover(IntStream input, RecognitionException re) {
        in_my_recovery_mode = true;
        super.recover(input, re);
    }

    public void consumeUntilSpecStart(TokenStream input) throws SpecParseException {
        int ttype = input.LA(1);

        Token tstart = input.LT(1);
        Token tstop = null;
        while (ttype != Token.EOF && ttype != SPCLexer.TOK_INVAR_SPEC && ttype != SPCLexer.TOK_CTL_SPEC && ttype != SPCLexer.TOK_LTL_SPEC && ttype != SPCLexer.TOK_ATL_STAR_SPEC) {
            tstop = input.LT(1);
            input.consume();
            ttype = input.LA(1);
        }
        // if there is something to  throw, i.e. there was a problem.
        if (tstop != null) {
            throw new SpecParseException("Failed to parse expression '" + input.toString(tstart, tstop) + "'", input, tstart, tstop);
        }
    }


    public static class spec_return extends ParserRuleReturnScope {
        public WAArrayOfSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start spec
    // F:\\StudyAntlr\\SPC.g:144:1: spec returns [WAArrayOfSpec ret] : ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) );
    public final spec_return spec() throws RecognitionException {
        spec_return retval = new spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF1 = null;
        Token EOF3 = null;
        spec_list_return spec_list2 = null;


        Object EOF1_tree = null;
        Object EOF3_tree = null;
        RewriteRuleTokenStream stream_EOF = new RewriteRuleTokenStream(adaptor, "token EOF");
        RewriteRuleSubtreeStream stream_spec_list = new RewriteRuleSubtreeStream(adaptor, "rule spec_list");
        try {
            // F:\\StudyAntlr\\SPC.g:145:9: ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) )
            int alt1 = 2;
            int LA1_0 = input.LA(1);

            if ((LA1_0 == EOF)) {
                alt1 = 1;
            } else if (((LA1_0 >= TOK_INVAR_SPEC && LA1_0 <= TOK_ATL_STAR_SPEC))) {
                alt1 = 2;
            } else {
                if (backtracking > 0) {
                    failed = true;
                    return retval;
                }
                NoViableAltException nvae =
                        new NoViableAltException("144:1: spec returns [WAArrayOfSpec ret] : ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:145:11: EOF
                {
                    root_0 = (Object) adaptor.nil();

                    EOF1 = (Token) input.LT(1);
                    match(input, EOF, FOLLOW_EOF_in_spec189);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        EOF1_tree = (Object) adaptor.create(EOF1);
                        adaptor.addChild(root_0, EOF1_tree);
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:146:11: spec_list EOF
                {
                    pushFollow(FOLLOW_spec_list_in_spec201);
                    spec_list2 = spec_list();
                    _fsp--;

                    if (failed) return retval;
                    if (backtracking == 0) stream_spec_list.add(spec_list2.getTree());
                    EOF3 = (Token) input.LT(1);
                    match(input, EOF, FOLLOW_EOF_in_spec203);
                    if (failed) return retval;
                    if (backtracking == 0) stream_EOF.add(EOF3);

                    if (backtracking == 0) {
                        retval.ret = spec_list2.ret;
                    }

                    // AST REWRITE
                    // elements: spec_list
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 148:9: -> ^( SPEC_LIST_T spec_list )
                        {
                            // F:\\StudyAntlr\\SPC.g:148:12: ^( SPEC_LIST_T spec_list )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(SPEC_LIST_T, "SPEC_LIST_T"), root_1);

                                adaptor.addChild(root_1, stream_spec_list.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end spec

    public static class spec_list_return extends ParserRuleReturnScope {
        public WAArrayOfSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start spec_list
    // F:\\StudyAntlr\\SPC.g:150:1: spec_list returns [WAArrayOfSpec ret] : f= spec_element (s= spec_element )* ;
    public final spec_list_return spec_list() throws RecognitionException {
        spec_list_return retval = new spec_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        spec_element_return f = null;

        spec_element_return s = null;


        retval.ret = new WAArrayOfSpec();
        try {
            // F:\\StudyAntlr\\SPC.g:152:9: (f= spec_element (s= spec_element )* )
            // F:\\StudyAntlr\\SPC.g:152:11: f= spec_element (s= spec_element )*
            {
                root_0 = (Object) adaptor.nil();
                pushFollow(FOLLOW_spec_element_in_spec_list267);
                f = spec_element();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) retval.ret.specs.add(f.ret);
                    else retval.ret.specs.add(null);
                    in_my_recovery_mode = false;
                }
                // F:\\StudyAntlr\\SPC.g:153:9: (s= spec_element )*
                loop2:
                do {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);

                    if (((LA2_0 >= TOK_INVAR_SPEC && LA2_0 <= TOK_ATL_STAR_SPEC))) {
                        alt2 = 1;
                    }
                    switch (alt2) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:153:11: s= spec_element
                        {
                            pushFollow(FOLLOW_spec_element_in_spec_list283);
                            s = spec_element();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) retval.ret.specs.add(s.ret);
                                else retval.ret.specs.add(null);
                                in_my_recovery_mode = false;
                            }

                        }
                        break;

                        default:
                            break loop2;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            re.printStackTrace();
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end spec_list

    public static class spec_element_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start spec_element
    // F:\\StudyAntlr\\SPC.g:156:1: spec_element returns [InternalSpec ret] : ( invar_spec | ctl_spec | ltl_spec | atls_spec );
    public final spec_element_return spec_element() throws RecognitionException {
        spec_element_return retval = new spec_element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        invar_spec_return invar_spec4 = null;

        ctl_spec_return ctl_spec5 = null;

        ltl_spec_return ltl_spec6 = null;

        atls_spec_return atls_spec7 = null;


        try {
            // F:\\StudyAntlr\\SPC.g:157:9: ( invar_spec | ctl_spec | ltl_spec | atls_spec )
            int alt3 = 4;
            switch (input.LA(1)) {
                case TOK_INVAR_SPEC: {
                    alt3 = 1;
                }
                break;
                case TOK_CTL_SPEC: {
                    alt3 = 2;
                }
                break;
                case TOK_LTL_SPEC: {
                    alt3 = 3;
                }
                break;
                case TOK_ATL_STAR_SPEC: {
                    alt3 = 4;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("156:1: spec_element returns [InternalSpec ret] : ( invar_spec | ctl_spec | ltl_spec | atls_spec );", 3, 0, input);

                    throw nvae;
            }

            switch (alt3) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:157:11: invar_spec
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_invar_spec_in_spec_element326);
                    invar_spec4 = invar_spec();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, invar_spec4.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = invar_spec4.ret;
                        consumeUntilSpecStart(input);
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:158:11: ctl_spec
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ctl_spec_in_spec_element340);
                    ctl_spec5 = ctl_spec();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ctl_spec5.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_spec5.ret;
                        consumeUntilSpecStart(input);
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:159:11: ltl_spec
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ltl_spec_in_spec_element354);
                    ltl_spec6 = ltl_spec();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ltl_spec6.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ltl_spec6.ret;
                        consumeUntilSpecStart(input);
                    }

                }
                break;
                case 4:
                    // F:\\StudyAntlr\\SPC.g:160:11: atls_spec
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_atls_spec_in_spec_element368);
                    atls_spec7 = atls_spec();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, atls_spec7.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = atls_spec7.ret;
                        consumeUntilSpecStart(input);
                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end spec_element

    public static class invar_spec_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start invar_spec
    // F:\\StudyAntlr\\SPC.g:163:1: invar_spec returns [InternalSpec ret] : TOK_INVAR_SPEC simple_root_expr optsemi ;
    public final invar_spec_return invar_spec() throws RecognitionException {
        invar_spec_return retval = new invar_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_INVAR_SPEC8 = null;
        simple_root_expr_return simple_root_expr9 = null;

        optsemi_return optsemi10 = null;


        Object TOK_INVAR_SPEC8_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:165:9: ( TOK_INVAR_SPEC simple_root_expr optsemi )
            // F:\\StudyAntlr\\SPC.g:165:11: TOK_INVAR_SPEC simple_root_expr optsemi
            {
                root_0 = (Object) adaptor.nil();

                TOK_INVAR_SPEC8 = (Token) input.LT(1);
                match(input, TOK_INVAR_SPEC, FOLLOW_TOK_INVAR_SPEC_in_invar_spec407);
                if (failed) return retval;
                if (backtracking == 0) {
                    TOK_INVAR_SPEC8_tree = (Object) adaptor.create(TOK_INVAR_SPEC8);
                    root_0 = (Object) adaptor.becomeRoot(TOK_INVAR_SPEC8_tree, root_0);
                }
                pushFollow(FOLLOW_simple_root_expr_in_invar_spec410);
                simple_root_expr9 = simple_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, simple_root_expr9.getTree());
                pushFollow(FOLLOW_optsemi_in_invar_spec412);
                optsemi10 = optsemi();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) {
                    if (!er()) retval.ret = simple_root_expr9.ret;
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                retval.ret.setLanguage(INVAR);
                if (!er() && (retval.ret instanceof InternalSpecBDD)) ((InternalSpecBDD) retval.ret).evalBDDExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end invar_spec

    public static class ctl_spec_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_spec
    // F:\\StudyAntlr\\SPC.g:167:1: ctl_spec returns [InternalSpec ret] : TOK_CTL_SPEC ctl_root_expr optsemi ;
    public final ctl_spec_return ctl_spec() throws RecognitionException {
        ctl_spec_return retval = new ctl_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_CTL_SPEC11 = null;
        ctl_root_expr_return ctl_root_expr12 = null;

        optsemi_return optsemi13 = null;


        Object TOK_CTL_SPEC11_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:169:9: ( TOK_CTL_SPEC ctl_root_expr optsemi )
            // F:\\StudyAntlr\\SPC.g:169:11: TOK_CTL_SPEC ctl_root_expr optsemi
            {
                root_0 = (Object) adaptor.nil();

                TOK_CTL_SPEC11 = (Token) input.LT(1);
                match(input, TOK_CTL_SPEC, FOLLOW_TOK_CTL_SPEC_in_ctl_spec451);
                if (failed) return retval;
                if (backtracking == 0) {
                    TOK_CTL_SPEC11_tree = (Object) adaptor.create(TOK_CTL_SPEC11);
                    root_0 = (Object) adaptor.becomeRoot(TOK_CTL_SPEC11_tree, root_0);
                }
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_spec454);
                ctl_root_expr12 = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, ctl_root_expr12.getTree());
                pushFollow(FOLLOW_optsemi_in_ctl_spec456);
                optsemi13 = optsemi();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) {
                    if (!er()) retval.ret = ctl_root_expr12.ret;
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (retval.ret!=null)
                retval.ret.setLanguage(CTL);
                if (!er() && (retval.ret instanceof InternalSpecBDD))
                    ((InternalSpecBDD) retval.ret).evalBDDExp(input);
            }
        } catch (RecognitionException re) {
            re.printStackTrace();
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_spec

    public static class ltl_spec_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_spec
    // F:\\StudyAntlr\\SPC.g:171:1: ltl_spec returns [InternalSpec ret] : TOK_LTL_SPEC ltl_root_expr optsemi ;
    public final ltl_spec_return ltl_spec() throws RecognitionException {
        ltl_spec_return retval = new ltl_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LTL_SPEC14 = null;
        ltl_root_expr_return ltl_root_expr15 = null;

        optsemi_return optsemi16 = null;


        Object TOK_LTL_SPEC14_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:173:9: ( TOK_LTL_SPEC ltl_root_expr optsemi )
            // F:\\StudyAntlr\\SPC.g:173:11: TOK_LTL_SPEC ltl_root_expr optsemi
            {
                root_0 = (Object) adaptor.nil();

                TOK_LTL_SPEC14 = (Token) input.LT(1);
                match(input, TOK_LTL_SPEC, FOLLOW_TOK_LTL_SPEC_in_ltl_spec495);
                if (failed) return retval;
                if (backtracking == 0) {
                    TOK_LTL_SPEC14_tree = (Object) adaptor.create(TOK_LTL_SPEC14);
                    root_0 = (Object) adaptor.becomeRoot(TOK_LTL_SPEC14_tree, root_0);
                }
                pushFollow(FOLLOW_ltl_root_expr_in_ltl_spec498);
                ltl_root_expr15 = ltl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, ltl_root_expr15.getTree());
                pushFollow(FOLLOW_optsemi_in_ltl_spec500);
                optsemi16 = optsemi();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) {
                    if (!er()) retval.ret = ltl_root_expr15.ret;
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (retval.ret!=null)
                retval.ret.setLanguage(LTL);
                if (!er() && (retval.ret instanceof InternalSpecBDD))
                    ((InternalSpecBDD) retval.ret).evalBDDExp(input);
            }
        } catch (RecognitionException re) {
            re.printStackTrace();
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_spec

    public static class atls_spec_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_spec
    // F:\\StudyAntlr\\SPC.g:176:1: atls_spec returns [InternalSpec ret] : TOK_ATL_STAR_SPEC atls_root_expr optsemi ;
    public final atls_spec_return atls_spec() throws RecognitionException {
        atls_spec_return retval = new atls_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_ATL_STAR_SPEC17 = null;
        atls_root_expr_return atls_root_expr18 = null;

        optsemi_return optsemi19 = null;


        Object TOK_ATL_STAR_SPEC17_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:178:9: ( TOK_ATL_STAR_SPEC atls_root_expr optsemi )
            // F:\\StudyAntlr\\SPC.g:178:11: TOK_ATL_STAR_SPEC atls_root_expr optsemi
            {
                root_0 = (Object) adaptor.nil();

                TOK_ATL_STAR_SPEC17 = (Token) input.LT(1);
                match(input, TOK_ATL_STAR_SPEC, FOLLOW_TOK_ATL_STAR_SPEC_in_atls_spec540);
                if (failed) return retval;
                if (backtracking == 0) {
                    TOK_ATL_STAR_SPEC17_tree = (Object) adaptor.create(TOK_ATL_STAR_SPEC17);
                    root_0 = (Object) adaptor.becomeRoot(TOK_ATL_STAR_SPEC17_tree, root_0);
                }
                pushFollow(FOLLOW_atls_root_expr_in_atls_spec543);
                atls_root_expr18 = atls_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, atls_root_expr18.getTree());
                pushFollow(FOLLOW_optsemi_in_atls_spec545);
                optsemi19 = optsemi();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) {
                    if (!er()) retval.ret = atls_root_expr18.ret;
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (retval.ret!=null)// Motified By LS
                retval.ret.setLanguage(ATLs);
                if (!er() && (retval.ret instanceof InternalSpecBDD))
                    ((InternalSpecBDD) retval.ret).evalBDDExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_spec

    public static class simple_root_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start simple_root_expr
    // F:\\StudyAntlr\\SPC.g:187:1: simple_root_expr returns [InternalSpec ret] : implies_expr ;
    public final simple_root_expr_return simple_root_expr() throws RecognitionException {
        simple_root_expr_return retval = new simple_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        implies_expr_return implies_expr20 = null;


        try {
            // F:\\StudyAntlr\\SPC.g:188:9: ( implies_expr )
            // F:\\StudyAntlr\\SPC.g:188:11: implies_expr
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_implies_expr_in_simple_root_expr587);
                implies_expr20 = implies_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, implies_expr20.getTree());
                if (backtracking == 0) {
                    if (!er()) retval.ret = implies_expr20.ret;
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end simple_root_expr

    public static class implies_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start implies_expr
    // F:\\StudyAntlr\\SPC.g:190:1: implies_expr returns [InternalSpec ret] : f= iff_expr (op= TOK_IMPLIES s= implies_expr )? ;
    public final implies_expr_return implies_expr() throws RecognitionException {
        implies_expr_return retval = new implies_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        iff_expr_return f = null;

        implies_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:193:9: (f= iff_expr (op= TOK_IMPLIES s= implies_expr )? )
            // F:\\StudyAntlr\\SPC.g:193:11: f= iff_expr (op= TOK_IMPLIES s= implies_expr )?
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_iff_expr_in_implies_expr631);
                f = iff_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:194:9: (op= TOK_IMPLIES s= implies_expr )?
                int alt4 = 2;
                int LA4_0 = input.LA(1);

                if ((LA4_0 == TOK_IMPLIES)) {
                    alt4 = 1;
                }
                switch (alt4) {
                    case 1:
                        // F:\\StudyAntlr\\SPC.g:194:11: op= TOK_IMPLIES s= implies_expr
                    {
                        op = (Token) input.LT(1);
                        match(input, TOK_IMPLIES, FOLLOW_TOK_IMPLIES_in_implies_expr647);
                        if (failed) return retval;
                        if (backtracking == 0) {
                            op_tree = (Object) adaptor.create(op);
                            root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                        }
                        pushFollow(FOLLOW_implies_expr_in_implies_expr652);
                        s = implies_expr();
                        _fsp--;
                        if (failed) return retval;
                        if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                        if (backtracking == 0) {
                            if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                            if (!er()) append_end = true;
                            if (!er())
                                retval.ret = InitSpec.mk_imply(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                        }

                    }
                    break;

                }


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end implies_expr

    public static class iff_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start iff_expr
    // F:\\StudyAntlr\\SPC.g:198:1: iff_expr returns [InternalSpec ret] : f= or_expr (op= TOK_IFF s= or_expr )* ;
    public final iff_expr_return iff_expr() throws RecognitionException {
        iff_expr_return retval = new iff_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        or_expr_return f = null;

        or_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:201:9: (f= or_expr (op= TOK_IFF s= or_expr )* )
            // F:\\StudyAntlr\\SPC.g:201:11: f= or_expr (op= TOK_IFF s= or_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_or_expr_in_iff_expr718);
                f = or_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:202:9: (op= TOK_IFF s= or_expr )*
                loop5:
                do {
                    int alt5 = 2;
                    int LA5_0 = input.LA(1);

                    if ((LA5_0 == TOK_IFF)) {
                        alt5 = 1;
                    }


                    switch (alt5) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:202:11: op= TOK_IFF s= or_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_IFF, FOLLOW_TOK_IFF_in_iff_expr734);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_or_expr_in_iff_expr739);
                            s = or_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_iff(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop5;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end iff_expr

    public static class or_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start or_expr
    // F:\\StudyAntlr\\SPC.g:206:1: or_expr returns [InternalSpec ret] : f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )* ;
    public final or_expr_return or_expr() throws RecognitionException {
        or_expr_return retval = new or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        and_expr_return f = null;

        and_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:209:9: (f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )* )
            // F:\\StudyAntlr\\SPC.g:209:11: f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_and_expr_in_or_expr804);
                f = and_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:210:9: (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )*
                loop6:
                do {
                    int alt6 = 4;
                    switch (input.LA(1)) {
                        case TOK_OR: {
                            alt6 = 1;
                        }
                        break;
                        case TOK_XOR: {
                            alt6 = 2;
                        }
                        break;
                        case TOK_XNOR: {
                            alt6 = 3;
                        }
                        break;

                    }

                    switch (alt6) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:210:11: op= TOK_OR s= and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_OR, FOLLOW_TOK_OR_in_or_expr820);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_and_expr_in_or_expr825);
                            s = and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_or(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:212:11: op= TOK_XOR s= and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_XOR, FOLLOW_TOK_XOR_in_or_expr849);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_and_expr_in_or_expr854);
                            s = and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_xor(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 3:
                            // F:\\StudyAntlr\\SPC.g:214:11: op= TOK_XNOR s= and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_XNOR, FOLLOW_TOK_XNOR_in_or_expr878);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_and_expr_in_or_expr883);
                            s = and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_xnor(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop6;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end or_expr

    public static class and_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start and_expr
    // F:\\StudyAntlr\\SPC.g:218:1: and_expr returns [InternalSpec ret] : f= relational_expr (op= TOK_AND s= relational_expr )* ;
    public final and_expr_return and_expr() throws RecognitionException {
        and_expr_return retval = new and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        relational_expr_return f = null;

        relational_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:221:9: (f= relational_expr (op= TOK_AND s= relational_expr )* )
            // F:\\StudyAntlr\\SPC.g:221:11: f= relational_expr (op= TOK_AND s= relational_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_relational_expr_in_and_expr947);
                f = relational_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:222:9: (op= TOK_AND s= relational_expr )*
                loop7:
                do {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);

                    if ((LA7_0 == TOK_AND)) {
                        alt7 = 1;
                    }


                    switch (alt7) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:222:11: op= TOK_AND s= relational_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_AND, FOLLOW_TOK_AND_in_and_expr963);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_relational_expr_in_and_expr968);
                            s = relational_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_and(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop7;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end and_expr

    public static class relational_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start relational_expr
    // F:\\StudyAntlr\\SPC.g:226:1: relational_expr returns [InternalSpec ret] : f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )* ;
    public final relational_expr_return relational_expr() throws RecognitionException {
        relational_expr_return retval = new relational_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        in_expr_return f = null;

        in_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:229:9: (f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )* )
            // F:\\StudyAntlr\\SPC.g:229:11: f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_in_expr_in_relational_expr1031);
                f = in_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:230:9: (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )*
                loop8:
                do {
                    int alt8 = 7;
                    switch (input.LA(1)) {
                        case TOK_EQUAL: {
                            alt8 = 1;
                        }
                        break;
                        case TOK_NOTEQUAL: {
                            alt8 = 2;
                        }
                        break;
                        case TOK_LT: {
                            alt8 = 3;
                        }
                        break;
                        case TOK_GT: {
                            alt8 = 4;
                        }
                        break;
                        case TOK_LE: {
                            alt8 = 5;
                        }
                        break;
                        case TOK_GE: {
                            alt8 = 6;
                        }
                        break;

                    }

                    switch (alt8) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:230:11: op= TOK_EQUAL s= in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_EQUAL, FOLLOW_TOK_EQUAL_in_relational_expr1047);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_in_expr_in_relational_expr1052);
                            s = in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_eq(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:232:11: op= TOK_NOTEQUAL s= in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_NOTEQUAL, FOLLOW_TOK_NOTEQUAL_in_relational_expr1077);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_in_expr_in_relational_expr1082);
                            s = in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_neq(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 3:
                            // F:\\StudyAntlr\\SPC.g:234:11: op= TOK_LT s= in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LT, FOLLOW_TOK_LT_in_relational_expr1107);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_in_expr_in_relational_expr1112);
                            s = in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_lt(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 4:
                            // F:\\StudyAntlr\\SPC.g:236:11: op= TOK_GT s= in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_GT, FOLLOW_TOK_GT_in_relational_expr1137);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_in_expr_in_relational_expr1142);
                            s = in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_gt(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 5:
                            // F:\\StudyAntlr\\SPC.g:238:11: op= TOK_LE s= in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LE, FOLLOW_TOK_LE_in_relational_expr1167);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_in_expr_in_relational_expr1172);
                            s = in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_le(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 6:
                            // F:\\StudyAntlr\\SPC.g:240:11: op= TOK_GE s= in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_GE, FOLLOW_TOK_GE_in_relational_expr1197);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_in_expr_in_relational_expr1202);
                            s = in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_ge(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop8;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end relational_expr

    public static class in_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start in_expr
    // F:\\StudyAntlr\\SPC.g:244:1: in_expr returns [InternalSpec ret] : f= union_expr (op= TOK_SETIN s= union_expr )* ;
    public final in_expr_return in_expr() throws RecognitionException {
        in_expr_return retval = new in_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        union_expr_return f = null;

        union_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:247:9: (f= union_expr (op= TOK_SETIN s= union_expr )* )
            // F:\\StudyAntlr\\SPC.g:247:11: f= union_expr (op= TOK_SETIN s= union_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_union_expr_in_in_expr1267);
                f = union_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:248:9: (op= TOK_SETIN s= union_expr )*
                loop9:
                do {
                    int alt9 = 2;
                    int LA9_0 = input.LA(1);

                    if ((LA9_0 == TOK_SETIN)) {
                        alt9 = 1;
                    }


                    switch (alt9) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:248:11: op= TOK_SETIN s= union_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_SETIN, FOLLOW_TOK_SETIN_in_in_expr1283);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_union_expr_in_in_expr1288);
                            s = union_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_setin(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop9;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end in_expr

    public static class union_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start union_expr
    // F:\\StudyAntlr\\SPC.g:252:1: union_expr returns [InternalSpec ret] : f= set_expr (op= TOK_UNION s= set_expr )* ;
    public final union_expr_return union_expr() throws RecognitionException {
        union_expr_return retval = new union_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        set_expr_return f = null;

        set_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:255:9: (f= set_expr (op= TOK_UNION s= set_expr )* )
            // F:\\StudyAntlr\\SPC.g:255:11: f= set_expr (op= TOK_UNION s= set_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_set_expr_in_union_expr1352);
                f = set_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:256:9: (op= TOK_UNION s= set_expr )*
                loop10:
                do {
                    int alt10 = 2;
                    int LA10_0 = input.LA(1);

                    if ((LA10_0 == TOK_UNION)) {
                        alt10 = 1;
                    }


                    switch (alt10) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:256:11: op= TOK_UNION s= set_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_UNION, FOLLOW_TOK_UNION_in_union_expr1368);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_set_expr_in_union_expr1373);
                            s = set_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_union(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop10;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end union_expr

    public static class set_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start set_expr
    // F:\\StudyAntlr\\SPC.g:260:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );
    public final set_expr_return set_expr() throws RecognitionException {
        set_expr_return retval = new set_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LCB23 = null;
        Token TOK_RCB25 = null;
        shift_expr_return shift_expr21 = null;

        subrange_return subrange22 = null;

        set_list_expr_return set_list_expr24 = null;


        Object TOK_LCB23_tree = null;
        Object TOK_RCB25_tree = null;
        RewriteRuleTokenStream stream_TOK_RCB = new RewriteRuleTokenStream(adaptor, "token TOK_RCB");
        RewriteRuleTokenStream stream_TOK_LCB = new RewriteRuleTokenStream(adaptor, "token TOK_LCB");
        RewriteRuleSubtreeStream stream_set_list_expr = new RewriteRuleSubtreeStream(adaptor, "rule set_list_expr");
        boolean append_end = false;
        try {
            // F:\\StudyAntlr\\SPC.g:263:9: ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) )
            int alt11 = 3;
            switch (input.LA(1)) {
                case TOK_NOT:
                case TOK_LP:
                case TOK_BOOL:
                case TOK_WORD1:
                case TOK_NEXT:
                case TOK_CASE:
                case TOK_WAREAD:
                case TOK_WAWRITE:
                case TOK_ATOM:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt11 = 1;
                }
                break;
                case TOK_NUMBER: {
                    int LA11_2 = input.LA(2);

                    if ((LA11_2 == EOF || (LA11_2 >= TOK_INVAR_SPEC && LA11_2 <= TOK_UNION) || (LA11_2 >= TOK_RCB && LA11_2 <= TOK_CONCATENATION) || LA11_2 == TOK_RP || LA11_2 == TOK_LB || LA11_2 == TOK_RB || LA11_2 == TOK_DOT || (LA11_2 >= TOK_COLON && LA11_2 <= TOK_SEMI))) {
                        alt11 = 1;
                    } else if ((LA11_2 == TOK_TWODOTS)) {
                        alt11 = 2;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("260:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 2, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_PLUS: {
                    int LA11_3 = input.LA(2);

                    if ((LA11_3 == TOK_NUMBER)) {
                        int LA11_7 = input.LA(3);

                        if ((LA11_7 == EOF || (LA11_7 >= TOK_INVAR_SPEC && LA11_7 <= TOK_UNION) || (LA11_7 >= TOK_RCB && LA11_7 <= TOK_CONCATENATION) || LA11_7 == TOK_RP || LA11_7 == TOK_LB || LA11_7 == TOK_RB || LA11_7 == TOK_DOT || (LA11_7 >= TOK_COLON && LA11_7 <= TOK_SEMI))) {
                            alt11 = 1;
                        } else if ((LA11_7 == TOK_TWODOTS)) {
                            alt11 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("260:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 7, input);

                            throw nvae;
                        }
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("260:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 3, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_MINUS: {
                    int LA11_4 = input.LA(2);

                    if ((LA11_4 == TOK_NUMBER)) {
                        int LA11_8 = input.LA(3);

                        if ((LA11_8 == TOK_TWODOTS)) {
                            alt11 = 2;
                        } else if ((LA11_8 == EOF || (LA11_8 >= TOK_INVAR_SPEC && LA11_8 <= TOK_UNION) || (LA11_8 >= TOK_RCB && LA11_8 <= TOK_CONCATENATION) || LA11_8 == TOK_RP || LA11_8 == TOK_LB || LA11_8 == TOK_RB || LA11_8 == TOK_DOT || (LA11_8 >= TOK_COLON && LA11_8 <= TOK_SEMI))) {
                            alt11 = 1;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("260:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 8, input);

                            throw nvae;
                        }
                    } else if (((LA11_4 >= TOK_PLUS && LA11_4 <= TOK_MINUS) || (LA11_4 >= TOK_NOT && LA11_4 <= TOK_LP) || (LA11_4 >= TOK_BOOL && LA11_4 <= TOK_CASE) || (LA11_4 >= TOK_WAREAD && LA11_4 <= TOK_WAWRITE) || LA11_4 == TOK_ATOM || LA11_4 == TOK_NUMBER_WORD || (LA11_4 >= TOK_FALSEEXP && LA11_4 <= TOK_TRUEEXP))) {
                        alt11 = 1;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("260:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 4, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_LCB: {
                    alt11 = 3;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("260:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 0, input);

                    throw nvae;
            }

            switch (alt11) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:263:11: shift_expr
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_shift_expr_in_set_expr1435);
                    shift_expr21 = shift_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, shift_expr21.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = shift_expr21.ret;
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:265:11: subrange
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_set_expr1457);
                    subrange22 = subrange();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, subrange22.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_range(input, ((Token) retval.start), input.toString(subrange22.start, subrange22.stop));
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:267:11: TOK_LCB set_list_expr TOK_RCB
                {
                    TOK_LCB23 = (Token) input.LT(1);
                    match(input, TOK_LCB, FOLLOW_TOK_LCB_in_set_expr1480);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LCB.add(TOK_LCB23);

                    pushFollow(FOLLOW_set_list_expr_in_set_expr1482);
                    set_list_expr24 = set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_set_list_expr.add(set_list_expr24.getTree());
                    TOK_RCB25 = (Token) input.LT(1);
                    match(input, TOK_RCB, FOLLOW_TOK_RCB_in_set_expr1484);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RCB.add(TOK_RCB25);

                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_set(input, ((Token) retval.start), TOK_LCB23.getText() + " " + input.toString(set_list_expr24.start, set_list_expr24.stop) + " " + TOK_RCB25.getText());
                    }

                    // AST REWRITE
                    // elements: set_list_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 269:9: -> ^( SET_LIST_EXP_T set_list_expr )
                        {
                            // F:\\StudyAntlr\\SPC.g:269:12: ^( SET_LIST_EXP_T set_list_expr )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(SET_LIST_EXP_T, "SET_LIST_EXP_T"), root_1);

                                adaptor.addChild(root_1, stream_set_list_expr.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end set_expr

    public static class set_list_expr_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start set_list_expr
    // F:\\StudyAntlr\\SPC.g:271:1: set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final set_list_expr_return set_list_expr() throws RecognitionException {
        set_list_expr_return retval = new set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA27 = null;
        simple_root_expr_return simple_root_expr26 = null;

        simple_root_expr_return simple_root_expr28 = null;


        Object TOK_COMMA27_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:272:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // F:\\StudyAntlr\\SPC.g:272:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_simple_root_expr_in_set_list_expr1538);
                simple_root_expr26 = simple_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, simple_root_expr26.getTree());
                // F:\\StudyAntlr\\SPC.g:272:28: ( TOK_COMMA simple_root_expr )*
                loop12:
                do {
                    int alt12 = 2;
                    int LA12_0 = input.LA(1);

                    if ((LA12_0 == TOK_COMMA)) {
                        alt12 = 1;
                    }


                    switch (alt12) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:272:29: TOK_COMMA simple_root_expr
                        {
                            TOK_COMMA27 = (Token) input.LT(1);
                            match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_set_list_expr1541);
                            if (failed) return retval;
                            pushFollow(FOLLOW_simple_root_expr_in_set_list_expr1544);
                            simple_root_expr28 = simple_root_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, simple_root_expr28.getTree());

                        }
                        break;

                        default:
                            break loop12;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end set_list_expr

    public static class shift_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start shift_expr
    // F:\\StudyAntlr\\SPC.g:274:1: shift_expr returns [InternalSpec ret] : f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )* ;
    public final shift_expr_return shift_expr() throws RecognitionException {
        shift_expr_return retval = new shift_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        remainder_expr_return f = null;

        remainder_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:277:9: (f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )* )
            // F:\\StudyAntlr\\SPC.g:277:11: f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_remainder_expr_in_shift_expr1589);
                f = remainder_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:278:9: (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )*
                loop13:
                do {
                    int alt13 = 3;
                    int LA13_0 = input.LA(1);

                    if ((LA13_0 == TOK_LSHIFT)) {
                        alt13 = 1;
                    } else if ((LA13_0 == TOK_RSHIFT)) {
                        alt13 = 2;
                    }


                    switch (alt13) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:278:11: op= TOK_LSHIFT s= remainder_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LSHIFT, FOLLOW_TOK_LSHIFT_in_shift_expr1605);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_remainder_expr_in_shift_expr1610);
                            s = remainder_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_lshift(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:280:11: op= TOK_RSHIFT s= remainder_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_RSHIFT, FOLLOW_TOK_RSHIFT_in_shift_expr1634);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_remainder_expr_in_shift_expr1639);
                            s = remainder_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_rshift(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop13;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end shift_expr

    public static class remainder_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start remainder_expr
    // F:\\StudyAntlr\\SPC.g:284:1: remainder_expr returns [InternalSpec ret] : f= additive_expr (op= TOK_MOD s= additive_expr )* ;
    public final remainder_expr_return remainder_expr() throws RecognitionException {
        remainder_expr_return retval = new remainder_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        additive_expr_return f = null;

        additive_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:287:9: (f= additive_expr (op= TOK_MOD s= additive_expr )* )
            // F:\\StudyAntlr\\SPC.g:287:11: f= additive_expr (op= TOK_MOD s= additive_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_additive_expr_in_remainder_expr1702);
                f = additive_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:288:9: (op= TOK_MOD s= additive_expr )*
                loop14:
                do {
                    int alt14 = 2;
                    int LA14_0 = input.LA(1);

                    if ((LA14_0 == TOK_MOD)) {
                        alt14 = 1;
                    }


                    switch (alt14) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:288:11: op= TOK_MOD s= additive_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_MOD, FOLLOW_TOK_MOD_in_remainder_expr1718);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_additive_expr_in_remainder_expr1723);
                            s = additive_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_mod(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop14;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end remainder_expr

    public static class additive_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start additive_expr
    // F:\\StudyAntlr\\SPC.g:292:1: additive_expr returns [InternalSpec ret] : f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )* ;
    public final additive_expr_return additive_expr() throws RecognitionException {
        additive_expr_return retval = new additive_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        multiplicative_expr_return f = null;

        multiplicative_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:295:9: (f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )* )
            // F:\\StudyAntlr\\SPC.g:295:11: f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1786);
                f = multiplicative_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:296:9: (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )*
                loop15:
                do {
                    int alt15 = 3;
                    int LA15_0 = input.LA(1);

                    if ((LA15_0 == TOK_PLUS)) {
                        alt15 = 1;
                    } else if ((LA15_0 == TOK_MINUS)) {
                        alt15 = 2;
                    }


                    switch (alt15) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:296:11: op= TOK_PLUS s= multiplicative_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_PLUS, FOLLOW_TOK_PLUS_in_additive_expr1802);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1807);
                            s = multiplicative_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_plus(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:298:11: op= TOK_MINUS s= multiplicative_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_MINUS, FOLLOW_TOK_MINUS_in_additive_expr1831);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1836);
                            s = multiplicative_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_minus(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop15;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end additive_expr

    public static class multiplicative_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start multiplicative_expr
    // F:\\StudyAntlr\\SPC.g:302:1: multiplicative_expr returns [InternalSpec ret] : f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )* ;
    public final multiplicative_expr_return multiplicative_expr() throws RecognitionException {
        multiplicative_expr_return retval = new multiplicative_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        concatination_expr_return f = null;

        concatination_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:305:9: (f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )* )
            // F:\\StudyAntlr\\SPC.g:305:11: f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1898);
                f = concatination_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:306:9: (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )*
                loop16:
                do {
                    int alt16 = 3;
                    int LA16_0 = input.LA(1);

                    if ((LA16_0 == TOK_TIMES)) {
                        alt16 = 1;
                    } else if ((LA16_0 == TOK_DIVIDE)) {
                        alt16 = 2;
                    }


                    switch (alt16) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:306:11: op= TOK_TIMES s= concatination_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_TIMES, FOLLOW_TOK_TIMES_in_multiplicative_expr1914);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1919);
                            s = concatination_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_times(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:308:11: op= TOK_DIVIDE s= concatination_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_DIVIDE, FOLLOW_TOK_DIVIDE_in_multiplicative_expr1943);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1948);
                            s = concatination_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_divide(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop16;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end multiplicative_expr

    public static class concatination_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start concatination_expr
    // F:\\StudyAntlr\\SPC.g:312:1: concatination_expr returns [InternalSpec ret] : f= primary_expr (op= TOK_CONCATENATION s= primary_expr )* ;
    public final concatination_expr_return concatination_expr() throws RecognitionException {
        concatination_expr_return retval = new concatination_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        primary_expr_return f = null;

        primary_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:315:9: (f= primary_expr (op= TOK_CONCATENATION s= primary_expr )* )
            // F:\\StudyAntlr\\SPC.g:315:11: f= primary_expr (op= TOK_CONCATENATION s= primary_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_primary_expr_in_concatination_expr2010);
                f = primary_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:316:9: (op= TOK_CONCATENATION s= primary_expr )*
                loop17:
                do {
                    int alt17 = 2;
                    int LA17_0 = input.LA(1);

                    if ((LA17_0 == TOK_CONCATENATION)) {
                        alt17 = 1;
                    }


                    switch (alt17) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:316:11: op= TOK_CONCATENATION s= primary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_CONCATENATION, FOLLOW_TOK_CONCATENATION_in_concatination_expr2026);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_primary_expr_in_concatination_expr2031);
                            s = primary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += op.getText() + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_concatenation(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop17;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end concatination_expr

    public static class primary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start primary_expr
    // F:\\StudyAntlr\\SPC.g:321:1: primary_expr returns [InternalSpec ret] : ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) );
    public final primary_expr_return primary_expr() throws RecognitionException {
        primary_expr_return retval = new primary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        primary_expr_return v = null;

        primary_expr_helper1_return primary_expr_helper129 = null;


        Object op_tree = null;
        RewriteRuleTokenStream stream_TOK_MINUS = new RewriteRuleTokenStream(adaptor, "token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NOT = new RewriteRuleTokenStream(adaptor, "token TOK_NOT");
        RewriteRuleSubtreeStream stream_primary_expr = new RewriteRuleSubtreeStream(adaptor, "rule primary_expr");
        boolean append_end = false;
        try {
            // F:\\StudyAntlr\\SPC.g:324:9: ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) )
            int alt18 = 3;
            switch (input.LA(1)) {
                case TOK_PLUS:
                case TOK_LP:
                case TOK_BOOL:
                case TOK_WORD1:
                case TOK_NEXT:
                case TOK_CASE:
                case TOK_WAREAD:
                case TOK_WAWRITE:
                case TOK_ATOM:
                case TOK_NUMBER:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt18 = 1;
                }
                break;
                case TOK_MINUS: {
                    alt18 = 2;
                }
                break;
                case TOK_NOT: {
                    alt18 = 3;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("321:1: primary_expr returns [InternalSpec ret] : ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) );", 18, 0, input);

                    throw nvae;
            }

            switch (alt18) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:324:11: primary_expr_helper1
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_in_primary_expr2101);
                    primary_expr_helper129 = primary_expr_helper1();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, primary_expr_helper129.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = primary_expr_helper129.ret;
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:328:11: op= TOK_MINUS v= primary_expr
                {
                    op = (Token) input.LT(1);
                    match(input, TOK_MINUS, FOLLOW_TOK_MINUS_in_primary_expr2143);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_primary_expr_in_primary_expr2147);
                    v = primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr.add(v.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_unary_minus(input, ((Token) retval.start), op.getText() + " " + input.toString(v.start, v.stop), v.ret);
                    }

                    // AST REWRITE
                    // elements: primary_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 330:9: -> ^( TOK_UNARY_MINUS_T primary_expr )
                        {
                            // F:\\StudyAntlr\\SPC.g:330:12: ^( TOK_UNARY_MINUS_T primary_expr )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(TOK_UNARY_MINUS_T, "TOK_UNARY_MINUS_T"), root_1);

                                adaptor.addChild(root_1, stream_primary_expr.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:331:11: op= TOK_NOT v= primary_expr
                {
                    op = (Token) input.LT(1);
                    match(input, TOK_NOT, FOLLOW_TOK_NOT_in_primary_expr2187);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_primary_expr_in_primary_expr2191);
                    v = primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr.add(v.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_not(input, ((Token) retval.start), op.getText() + " " + input.toString(v.start, v.stop), v.ret);
                    }

                    // AST REWRITE
                    // elements: primary_expr, TOK_NOT
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 333:9: -> ^( TOK_NOT primary_expr )
                        {
                            // F:\\StudyAntlr\\SPC.g:333:12: ^( TOK_NOT primary_expr )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_NOT.next(), root_1);

                                adaptor.addChild(root_1, stream_primary_expr.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end primary_expr

    public static class primary_expr_helper1_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start primary_expr_helper1
    // F:\\StudyAntlr\\SPC.g:336:1: primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) );
    public final primary_expr_helper1_return primary_expr_helper1() throws RecognitionException {
        primary_expr_helper1_return retval = new primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LP33 = null;
        Token TOK_RP35 = null;
        Token TOK_BOOL37 = null;
        Token TOK_LP38 = null;
        Token TOK_RP40 = null;
        Token TOK_WORD142 = null;
        Token TOK_LP43 = null;
        Token TOK_RP45 = null;
        Token TOK_NEXT47 = null;
        Token TOK_LP48 = null;
        Token TOK_RP50 = null;
        Token TOK_CASE52 = null;
        Token TOK_ESAC54 = null;
        Token TOK_WAREAD56 = null;
        Token TOK_LP57 = null;
        Token TOK_COMMA59 = null;
        Token TOK_RP61 = null;
        Token TOK_WAWRITE63 = null;
        Token TOK_LP64 = null;
        Token TOK_COMMA66 = null;
        Token TOK_COMMA68 = null;
        Token TOK_RP70 = null;
        constant_return constant30 = null;

        primary_expr_select_return primary_expr_select31 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer132 = null;

        simple_root_expr_return simple_root_expr34 = null;

        primary_expr_select_return primary_expr_select36 = null;

        simple_root_expr_return simple_root_expr39 = null;

        primary_expr_select_return primary_expr_select41 = null;

        simple_root_expr_return simple_root_expr44 = null;

        primary_expr_select_return primary_expr_select46 = null;

        simple_root_expr_return simple_root_expr49 = null;

        primary_expr_select_return primary_expr_select51 = null;

        case_element_list_expr_return case_element_list_expr53 = null;

        primary_expr_select_return primary_expr_select55 = null;

        simple_root_expr_return simple_root_expr58 = null;

        simple_root_expr_return simple_root_expr60 = null;

        primary_expr_select_return primary_expr_select62 = null;

        simple_root_expr_return simple_root_expr65 = null;

        simple_root_expr_return simple_root_expr67 = null;

        simple_root_expr_return simple_root_expr69 = null;

        primary_expr_select_return primary_expr_select71 = null;


        Object TOK_LP33_tree = null;
        Object TOK_RP35_tree = null;
        Object TOK_BOOL37_tree = null;
        Object TOK_LP38_tree = null;
        Object TOK_RP40_tree = null;
        Object TOK_WORD142_tree = null;
        Object TOK_LP43_tree = null;
        Object TOK_RP45_tree = null;
        Object TOK_NEXT47_tree = null;
        Object TOK_LP48_tree = null;
        Object TOK_RP50_tree = null;
        Object TOK_CASE52_tree = null;
        Object TOK_ESAC54_tree = null;
        Object TOK_WAREAD56_tree = null;
        Object TOK_LP57_tree = null;
        Object TOK_COMMA59_tree = null;
        Object TOK_RP61_tree = null;
        Object TOK_WAWRITE63_tree = null;
        Object TOK_LP64_tree = null;
        Object TOK_COMMA66_tree = null;
        Object TOK_COMMA68_tree = null;
        Object TOK_RP70_tree = null;
        RewriteRuleTokenStream stream_TOK_LP = new RewriteRuleTokenStream(adaptor, "token TOK_LP");
        RewriteRuleTokenStream stream_TOK_WAREAD = new RewriteRuleTokenStream(adaptor, "token TOK_WAREAD");
        RewriteRuleTokenStream stream_TOK_COMMA = new RewriteRuleTokenStream(adaptor, "token TOK_COMMA");
        RewriteRuleTokenStream stream_TOK_WORD1 = new RewriteRuleTokenStream(adaptor, "token TOK_WORD1");
        RewriteRuleTokenStream stream_TOK_ESAC = new RewriteRuleTokenStream(adaptor, "token TOK_ESAC");
        RewriteRuleTokenStream stream_TOK_NEXT = new RewriteRuleTokenStream(adaptor, "token TOK_NEXT");
        RewriteRuleTokenStream stream_TOK_CASE = new RewriteRuleTokenStream(adaptor, "token TOK_CASE");
        RewriteRuleTokenStream stream_TOK_WAWRITE = new RewriteRuleTokenStream(adaptor, "token TOK_WAWRITE");
        RewriteRuleTokenStream stream_TOK_BOOL = new RewriteRuleTokenStream(adaptor, "token TOK_BOOL");
        RewriteRuleTokenStream stream_TOK_RP = new RewriteRuleTokenStream(adaptor, "token TOK_RP");
        RewriteRuleSubtreeStream stream_case_element_list_expr = new RewriteRuleSubtreeStream(adaptor, "rule case_element_list_expr");
        RewriteRuleSubtreeStream stream_constant = new RewriteRuleSubtreeStream(adaptor, "rule constant");
        RewriteRuleSubtreeStream stream_simple_root_expr = new RewriteRuleSubtreeStream(adaptor, "rule simple_root_expr");
        RewriteRuleSubtreeStream stream_primary_expr_select = new RewriteRuleSubtreeStream(adaptor, "rule primary_expr_select");
        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:339:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) )
            int alt19 = 9;
            switch (input.LA(1)) {
                case TOK_PLUS:
                case TOK_NUMBER:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt19 = 1;
                }
                break;
                case TOK_ATOM: {
                    alt19 = 2;
                }
                break;
                case TOK_LP: {
                    alt19 = 3;
                }
                break;
                case TOK_BOOL: {
                    alt19 = 4;
                }
                break;
                case TOK_WORD1: {
                    alt19 = 5;
                }
                break;
                case TOK_NEXT: {
                    alt19 = 6;
                }
                break;
                case TOK_CASE: {
                    alt19 = 7;
                }
                break;
                case TOK_WAREAD: {
                    alt19 = 8;
                }
                break;
                case TOK_WAWRITE: {
                    alt19 = 9;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("336:1: primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) );", 19, 0, input);

                    throw nvae;
            }

            switch (alt19) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:339:11: constant primary_expr_select
                {
                    pushFollow(FOLLOW_constant_in_primary_expr_helper12256);
                    constant30 = constant();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_constant.add(constant30.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12258);
                    primary_expr_select31 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select31.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, constant
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 341:9: -> ^( VALUE_T constant NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:341:12: ^( VALUE_T constant NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(VALUE_T, "VALUE_T"), root_1);

                                adaptor.addChild(root_1, stream_constant.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:342:11: primary_expr_helper1_pointer1
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_primary_expr_helper12300);
                    primary_expr_helper1_pointer132 = primary_expr_helper1_pointer1();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, primary_expr_helper1_pointer132.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:347:11: TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_LP33 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_primary_expr_helper12333);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP33);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12335);
                    simple_root_expr34 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr34.getTree());
                    TOK_RP35 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_primary_expr_helper12337);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP35);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12339);
                    primary_expr_select36 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select36.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, simple_root_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 349:9: -> ^( BLOCK_T simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:349:12: ^( BLOCK_T simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(BLOCK_T, "BLOCK_T"), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 4:
                    // F:\\StudyAntlr\\SPC.g:350:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_BOOL37 = (Token) input.LT(1);
                    match(input, TOK_BOOL, FOLLOW_TOK_BOOL_in_primary_expr_helper12381);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_BOOL.add(TOK_BOOL37);

                    TOK_LP38 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_primary_expr_helper12384);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP38);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12386);
                    simple_root_expr39 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr39.getTree());
                    TOK_RP40 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_primary_expr_helper12388);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP40);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12390);
                    primary_expr_select41 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select41.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: TOK_BOOL, simple_root_expr, primary_expr_select
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 352:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:352:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_BOOL.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 5:
                    // F:\\StudyAntlr\\SPC.g:353:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WORD142 = (Token) input.LT(1);
                    match(input, TOK_WORD1, FOLLOW_TOK_WORD1_in_primary_expr_helper12433);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WORD1.add(TOK_WORD142);

                    TOK_LP43 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_primary_expr_helper12435);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP43);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12437);
                    simple_root_expr44 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr44.getTree());
                    TOK_RP45 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_primary_expr_helper12439);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP45);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12441);
                    primary_expr_select46 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select46.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, TOK_WORD1, simple_root_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 355:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:355:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WORD1.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 6:
                    // F:\\StudyAntlr\\SPC.g:356:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_NEXT47 = (Token) input.LT(1);
                    match(input, TOK_NEXT, FOLLOW_TOK_NEXT_in_primary_expr_helper12483);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NEXT.add(TOK_NEXT47);

                    TOK_LP48 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_primary_expr_helper12485);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP48);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12487);
                    simple_root_expr49 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr49.getTree());
                    TOK_RP50 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_primary_expr_helper12489);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP50);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12491);
                    primary_expr_select51 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select51.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, TOK_NEXT, primary_expr_select
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 358:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:358:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_NEXT.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 7:
                    // F:\\StudyAntlr\\SPC.g:359:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                {
                    TOK_CASE52 = (Token) input.LT(1);
                    match(input, TOK_CASE, FOLLOW_TOK_CASE_in_primary_expr_helper12533);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_CASE.add(TOK_CASE52);

                    pushFollow(FOLLOW_case_element_list_expr_in_primary_expr_helper12535);
                    case_element_list_expr53 = case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_case_element_list_expr.add(case_element_list_expr53.getTree());
                    TOK_ESAC54 = (Token) input.LT(1);
                    match(input, TOK_ESAC, FOLLOW_TOK_ESAC_in_primary_expr_helper12537);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_ESAC.add(TOK_ESAC54);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12539);
                    primary_expr_select55 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select55.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: case_element_list_expr, primary_expr_select
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 361:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:361:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(CASE_LIST_EXPR_T, "CASE_LIST_EXPR_T"), root_1);

                                adaptor.addChild(root_1, stream_case_element_list_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 8:
                    // F:\\StudyAntlr\\SPC.g:362:11: TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WAREAD56 = (Token) input.LT(1);
                    match(input, TOK_WAREAD, FOLLOW_TOK_WAREAD_in_primary_expr_helper12581);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WAREAD.add(TOK_WAREAD56);

                    TOK_LP57 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_primary_expr_helper12583);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP57);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12585);
                    simple_root_expr58 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr58.getTree());
                    TOK_COMMA59 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_primary_expr_helper12587);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(TOK_COMMA59);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12589);
                    simple_root_expr60 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr60.getTree());
                    TOK_RP61 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_primary_expr_helper12591);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP61);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12593);
                    primary_expr_select62 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select62.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: TOK_WAREAD, simple_root_expr, simple_root_expr, primary_expr_select
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 364:9: -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:364:12: ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WAREAD.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 9:
                    // F:\\StudyAntlr\\SPC.g:365:11: TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WAWRITE63 = (Token) input.LT(1);
                    match(input, TOK_WAWRITE, FOLLOW_TOK_WAWRITE_in_primary_expr_helper12637);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WAWRITE.add(TOK_WAWRITE63);

                    TOK_LP64 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_primary_expr_helper12639);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP64);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12641);
                    simple_root_expr65 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr65.getTree());
                    TOK_COMMA66 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_primary_expr_helper12643);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(TOK_COMMA66);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12645);
                    simple_root_expr67 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr67.getTree());
                    TOK_COMMA68 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_primary_expr_helper12647);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(TOK_COMMA68);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12649);
                    simple_root_expr69 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr69.getTree());
                    TOK_RP70 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_primary_expr_helper12651);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP70);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12653);
                    primary_expr_select71 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select71.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: TOK_WAWRITE, simple_root_expr, simple_root_expr, primary_expr_select, simple_root_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 367:9: -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:367:12: ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WAWRITE.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end primary_expr_helper1

    public static class ctl_root_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_root_expr
    // F:\\StudyAntlr\\SPC.g:373:1: ctl_root_expr returns [InternalSpec ret] : ctl_implies_expr ;
    public final ctl_root_expr_return ctl_root_expr() throws RecognitionException {
        ctl_root_expr_return retval = new ctl_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctl_implies_expr_return ctl_implies_expr72 = null;


        try {
            // F:\\StudyAntlr\\SPC.g:374:9: ( ctl_implies_expr )
            // F:\\StudyAntlr\\SPC.g:374:11: ctl_implies_expr
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_implies_expr_in_ctl_root_expr2721);
                ctl_implies_expr72 = ctl_implies_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, ctl_implies_expr72.getTree());
                if (backtracking == 0) {
                    if (!er()) retval.ret = ctl_implies_expr72.ret;
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_root_expr

    public static class ctl_implies_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_implies_expr
    // F:\\StudyAntlr\\SPC.g:376:1: ctl_implies_expr returns [InternalSpec ret] : f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )? ;
    public final ctl_implies_expr_return ctl_implies_expr() throws RecognitionException {
        ctl_implies_expr_return retval = new ctl_implies_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_iff_expr_return f = null;

        ctl_implies_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:379:9: (f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )? )
            // F:\\StudyAntlr\\SPC.g:379:11: f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )?
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_iff_expr_in_ctl_implies_expr2764);
                f = ctl_iff_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:380:9: (op= TOK_IMPLIES s= ctl_implies_expr )?
                int alt20 = 2;
                int LA20_0 = input.LA(1);

                if ((LA20_0 == TOK_IMPLIES)) {
                    alt20 = 1;
                }
                switch (alt20) {
                    case 1:
                        // F:\\StudyAntlr\\SPC.g:380:11: op= TOK_IMPLIES s= ctl_implies_expr
                    {
                        op = (Token) input.LT(1);
                        match(input, TOK_IMPLIES, FOLLOW_TOK_IMPLIES_in_ctl_implies_expr2780);
                        if (failed) return retval;
                        if (backtracking == 0) {
                            op_tree = (Object) adaptor.create(op);
                            root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                        }
                        pushFollow(FOLLOW_ctl_implies_expr_in_ctl_implies_expr2785);
                        s = ctl_implies_expr();
                        _fsp--;
                        if (failed) return retval;
                        if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                        if (backtracking == 0) {
                            if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                            if (!er()) append_end = true;
                            if (!er())
                                retval.ret = InitSpec.mk_imply(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                        }

                    }
                    break;

                }


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_implies_expr

    public static class ctl_iff_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_iff_expr
    // F:\\StudyAntlr\\SPC.g:384:1: ctl_iff_expr returns [InternalSpec ret] : f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )* ;
    public final ctl_iff_expr_return ctl_iff_expr() throws RecognitionException {
        ctl_iff_expr_return retval = new ctl_iff_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_or_expr_return f = null;

        ctl_or_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:387:9: (f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )* )
            // F:\\StudyAntlr\\SPC.g:387:11: f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_or_expr_in_ctl_iff_expr2850);
                f = ctl_or_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:388:9: (op= TOK_IFF s= ctl_or_expr )*
                loop21:
                do {
                    int alt21 = 2;
                    int LA21_0 = input.LA(1);

                    if ((LA21_0 == TOK_IFF)) {
                        alt21 = 1;
                    }


                    switch (alt21) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:388:11: op= TOK_IFF s= ctl_or_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_IFF, FOLLOW_TOK_IFF_in_ctl_iff_expr2866);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_or_expr_in_ctl_iff_expr2871);
                            s = ctl_or_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_iff(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop21;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_iff_expr

    public static class ctl_or_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_or_expr
    // F:\\StudyAntlr\\SPC.g:392:1: ctl_or_expr returns [InternalSpec ret] : f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )* ;
    public final ctl_or_expr_return ctl_or_expr() throws RecognitionException {
        ctl_or_expr_return retval = new ctl_or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_and_expr_return f = null;

        ctl_and_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:395:9: (f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )* )
            // F:\\StudyAntlr\\SPC.g:395:11: f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2935);
                f = ctl_and_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:396:9: (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )*
                loop22:
                do {
                    int alt22 = 4;
                    switch (input.LA(1)) {
                        case TOK_OR: {
                            alt22 = 1;
                        }
                        break;
                        case TOK_XOR: {
                            alt22 = 2;
                        }
                        break;
                        case TOK_XNOR: {
                            alt22 = 3;
                        }
                        break;

                    }

                    switch (alt22) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:396:11: op= TOK_OR s= ctl_and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_OR, FOLLOW_TOK_OR_in_ctl_or_expr2951);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2956);
                            s = ctl_and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_or(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:398:11: op= TOK_XOR s= ctl_and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_XOR, FOLLOW_TOK_XOR_in_ctl_or_expr2980);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2985);
                            s = ctl_and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_xor(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 3:
                            // F:\\StudyAntlr\\SPC.g:400:11: op= TOK_XNOR s= ctl_and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_XNOR, FOLLOW_TOK_XNOR_in_ctl_or_expr3009);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr3014);
                            s = ctl_and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_xnor(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop22;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_or_expr

    public static class ctl_and_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_and_expr
    // F:\\StudyAntlr\\SPC.g:404:1: ctl_and_expr returns [InternalSpec ret] : f= ctl_expr (op= TOK_AND s= ctl_expr )* ;
    public final ctl_and_expr_return ctl_and_expr() throws RecognitionException {
        ctl_and_expr_return retval = new ctl_and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_expr_return f = null;

        ctl_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:407:9: (f= ctl_expr (op= TOK_AND s= ctl_expr )* )
            // F:\\StudyAntlr\\SPC.g:407:11: f= ctl_expr (op= TOK_AND s= ctl_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_expr_in_ctl_and_expr3077);
                f = ctl_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:408:9: (op= TOK_AND s= ctl_expr )*
                loop23:
                do {
                    int alt23 = 2;
                    int LA23_0 = input.LA(1);

                    if ((LA23_0 == TOK_AND)) {
                        alt23 = 1;
                    }


                    switch (alt23) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:408:11: op= TOK_AND s= ctl_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_AND, FOLLOW_TOK_AND_in_ctl_and_expr3093);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_expr_in_ctl_and_expr3098);
                            s = ctl_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_and(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop23;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_and_expr

    public static class ctl_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_expr
    // F:\\StudyAntlr\\SPC.g:412:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );
    public final ctl_expr_return ctl_expr() throws RecognitionException {
        ctl_expr_return retval = new ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        pure_ctl_expr_return pure_ctl_expr73 = null;

        ctl_relational_expr_return ctl_relational_expr74 = null;


        RewriteRuleSubtreeStream stream_pure_ctl_expr = new RewriteRuleSubtreeStream(adaptor, "rule pure_ctl_expr");
        try {
            // F:\\StudyAntlr\\SPC.g:413:9: ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr )
            int alt24 = 2;
            int LA24_0 = input.LA(1);

            if ((LA24_0 == TOK_EX) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_AX) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_EF) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_AF) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_EG) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_AG) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_AA) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_EE) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_EBF) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_ABF) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_EBG) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_ABG) && (synpred1())) {
                alt24 = 1;
            } else if ((LA24_0 == TOK_NOT)) {
                int LA24_13 = input.LA(2);

                if ((LA24_13 == TOK_EX) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_AX) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_EF) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_AF) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_EG) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_AG) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_AA) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_EE) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_EBF) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_ABF) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_EBG) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_ABG) && (synpred1())) {
                    alt24 = 1;
                } else if ((LA24_13 == TOK_NOT)) {
                    int LA24_27 = input.LA(3);

                    if ((synpred1())) {
                        alt24 = 1;
                    } else if ((true)) {
                        alt24 = 2;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("412:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 27, input);

                        throw nvae;
                    }
                } else if (((LA24_13 >= TOK_PLUS && LA24_13 <= TOK_MINUS) || LA24_13 == TOK_LP || (LA24_13 >= TOK_BOOL && LA24_13 <= TOK_CASE) || (LA24_13 >= TOK_WAREAD && LA24_13 <= TOK_WAWRITE) || LA24_13 == TOK_ATOM || LA24_13 == TOK_NUMBER || LA24_13 == TOK_NUMBER_WORD || (LA24_13 >= TOK_FALSEEXP && LA24_13 <= TOK_TRUEEXP))) {
                    alt24 = 2;
                } else {
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("412:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 13, input);

                    throw nvae;
                }
            } else if ((LA24_0 == TOK_LCB || (LA24_0 >= TOK_PLUS && LA24_0 <= TOK_MINUS) || LA24_0 == TOK_LP || (LA24_0 >= TOK_BOOL && LA24_0 <= TOK_CASE) || (LA24_0 >= TOK_WAREAD && LA24_0 <= TOK_WAWRITE) || LA24_0 == TOK_ATOM || LA24_0 == TOK_NUMBER || LA24_0 == TOK_NUMBER_WORD || (LA24_0 >= TOK_FALSEEXP && LA24_0 <= TOK_TRUEEXP))) {
                alt24 = 2;
            } else {
                if (backtracking > 0) {
                    failed = true;
                    return retval;
                }
                NoViableAltException nvae =
                        new NoViableAltException("412:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:413:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr
                {
                    pushFollow(FOLLOW_pure_ctl_expr_in_ctl_expr3326);
                    pure_ctl_expr73 = pure_ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_pure_ctl_expr.add(pure_ctl_expr73.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = pure_ctl_expr73.ret;
                    }

                    // AST REWRITE
                    // elements: pure_ctl_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 427:11: -> ^( PURE_CTL_T pure_ctl_expr )
                        {
                            // F:\\StudyAntlr\\SPC.g:427:14: ^( PURE_CTL_T pure_ctl_expr )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(PURE_CTL_T, "PURE_CTL_T"), root_1);

                                adaptor.addChild(root_1, stream_pure_ctl_expr.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:428:11: ctl_relational_expr
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ctl_relational_expr_in_ctl_expr3366);
                    ctl_relational_expr74 = ctl_relational_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ctl_relational_expr74.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_relational_expr74.ret;
                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_expr

    public static class pure_ctl_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start pure_ctl_expr
    // F:\\StudyAntlr\\SPC.g:436:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );
    public final pure_ctl_expr_return pure_ctl_expr() throws RecognitionException {
        pure_ctl_expr_return retval = new pure_ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_expr_return f = null;

        subrange_return fsr = null;

        ctl_expr_return s = null;

        pure_ctl_expr_return fp = null;

        ctl_au_return ctl_au75 = null;

        ctl_abu_return ctl_abu76 = null;

        ctl_eu_return ctl_eu77 = null;

        ctl_ebu_return ctl_ebu78 = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:439:9: (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr )
            int alt25 = 15;
            switch (input.LA(1)) {
                case TOK_EX: {
                    alt25 = 1;
                }
                break;
                case TOK_AX: {
                    alt25 = 2;
                }
                break;
                case TOK_EF: {
                    alt25 = 3;
                }
                break;
                case TOK_AF: {
                    alt25 = 4;
                }
                break;
                case TOK_EG: {
                    alt25 = 5;
                }
                break;
                case TOK_AG: {
                    alt25 = 6;
                }
                break;
                case TOK_AA: {
                    int LA25_7 = input.LA(2);

                    if ((LA25_7 == TOK_LB)) {
                        int LA25_14 = input.LA(3);

                        if ((synpred2())) {
                            alt25 = 7;
                        } else if ((synpred3())) {
                            alt25 = 8;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("436:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 14, input);

                            throw nvae;
                        }
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("436:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 7, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_EE: {
                    int LA25_8 = input.LA(2);

                    if ((LA25_8 == TOK_LB)) {
                        int LA25_15 = input.LA(3);

                        if ((synpred4())) {
                            alt25 = 9;
                        } else if ((synpred5())) {
                            alt25 = 10;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("436:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 15, input);

                            throw nvae;
                        }
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("436:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 8, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_EBF: {
                    alt25 = 11;
                }
                break;
                case TOK_ABF: {
                    alt25 = 12;
                }
                break;
                case TOK_EBG: {
                    alt25 = 13;
                }
                break;
                case TOK_ABG: {
                    alt25 = 14;
                }
                break;
                case TOK_NOT: {
                    alt25 = 15;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("436:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 0, input);

                    throw nvae;
            }

            switch (alt25) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:439:11: op= TOK_EX f= ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_EX, FOLLOW_TOK_EX_in_pure_ctl_expr3429);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3434);
                    f = ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_EX(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:441:11: op= TOK_AX f= ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_AX, FOLLOW_TOK_AX_in_pure_ctl_expr3458);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3463);
                    f = ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_AX(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:443:11: op= TOK_EF f= ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_EF, FOLLOW_TOK_EF_in_pure_ctl_expr3487);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3492);
                    f = ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_EF(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 4:
                    // F:\\StudyAntlr\\SPC.g:445:11: op= TOK_AF f= ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_AF, FOLLOW_TOK_AF_in_pure_ctl_expr3516);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3521);
                    f = ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_AF(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 5:
                    // F:\\StudyAntlr\\SPC.g:447:11: op= TOK_EG f= ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_EG, FOLLOW_TOK_EG_in_pure_ctl_expr3545);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3550);
                    f = ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_EG(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 6:
                    // F:\\StudyAntlr\\SPC.g:449:11: op= TOK_AG f= ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_AG, FOLLOW_TOK_AG_in_pure_ctl_expr3574);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3579);
                    f = ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_AG(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 7:
                    // F:\\StudyAntlr\\SPC.g:459:11: ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ctl_au_in_pure_ctl_expr3685);
                    ctl_au75 = ctl_au();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ctl_au75.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_au75.ret;
                    }

                }
                break;
                case 8:
                    // F:\\StudyAntlr\\SPC.g:460:11: ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ctl_abu_in_pure_ctl_expr3711);
                    ctl_abu76 = ctl_abu();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ctl_abu76.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_abu76.ret;
                    }

                }
                break;
                case 9:
                    // F:\\StudyAntlr\\SPC.g:461:11: ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ctl_eu_in_pure_ctl_expr3737);
                    ctl_eu77 = ctl_eu();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ctl_eu77.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_eu77.ret;
                    }

                }
                break;
                case 10:
                    // F:\\StudyAntlr\\SPC.g:462:11: ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ctl_ebu_in_pure_ctl_expr3763);
                    ctl_ebu78 = ctl_ebu();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ctl_ebu78.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_ebu78.ret;
                    }

                }
                break;
                case 11:
                    // F:\\StudyAntlr\\SPC.g:463:11: op= TOK_EBF fsr= subrange s= ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_EBF, FOLLOW_TOK_EBF_in_pure_ctl_expr3779);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3784);
                    fsr = subrange();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3788);
                    s = ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                    if (backtracking == 0) {
                        if (!er())
                            exp_str = op.getText() + " " + input.toString(fsr.start, fsr.stop) + " " + input.toString(s.start, s.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_EBF(input, ((Token) retval.start), exp_str, fsr.ret, s.ret);
                    }

                }
                break;
                case 12:
                    // F:\\StudyAntlr\\SPC.g:465:11: op= TOK_ABF fsr= subrange s= ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_ABF, FOLLOW_TOK_ABF_in_pure_ctl_expr3812);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3817);
                    fsr = subrange();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3821);
                    s = ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                    if (backtracking == 0) {
                        if (!er())
                            exp_str = op.getText() + " " + input.toString(fsr.start, fsr.stop) + " " + input.toString(s.start, s.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_ABF(input, ((Token) retval.start), exp_str, fsr.ret, s.ret);
                    }

                }
                break;
                case 13:
                    // F:\\StudyAntlr\\SPC.g:467:11: op= TOK_EBG fsr= subrange s= ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_EBG, FOLLOW_TOK_EBG_in_pure_ctl_expr3845);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3850);
                    fsr = subrange();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3854);
                    s = ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                    if (backtracking == 0) {
                        if (!er())
                            exp_str = op.getText() + " " + input.toString(fsr.start, fsr.stop) + " " + input.toString(s.start, s.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_EBG(input, ((Token) retval.start), exp_str, fsr.ret, s.ret);
                    }

                }
                break;
                case 14:
                    // F:\\StudyAntlr\\SPC.g:469:11: op= TOK_ABG fsr= subrange s= ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_ABG, FOLLOW_TOK_ABG_in_pure_ctl_expr3878);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3883);
                    fsr = subrange();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3887);
                    s = ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                    if (backtracking == 0) {
                        if (!er())
                            exp_str = op.getText() + " " + input.toString(fsr.start, fsr.stop) + " " + input.toString(s.start, s.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_ABG(input, ((Token) retval.start), exp_str, fsr.ret, s.ret);
                    }

                }
                break;
                case 15:
                    // F:\\StudyAntlr\\SPC.g:472:11: op= TOK_NOT fp= pure_ctl_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_NOT, FOLLOW_TOK_NOT_in_pure_ctl_expr3921);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_pure_ctl_expr_in_pure_ctl_expr3926);
                    fp = pure_ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, fp.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(fp.start, fp.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_not(input, ((Token) retval.start), exp_str, fp.ret);
                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end pure_ctl_expr

    public static class ctl_au_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_au
    // F:\\StudyAntlr\\SPC.g:475:1: ctl_au returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB ;
    public final ctl_au_return ctl_au() throws RecognitionException {
        ctl_au_return retval = new ctl_au_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        Token lb = null;
        Token opu = null;
        Token rb = null;
        ctl_root_expr_return fre = null;

        ctl_root_expr_return sre = null;


        Object op_tree = null;
        Object lb_tree = null;
        Object opu_tree = null;
        Object rb_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:478:9: (op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB )
            // F:\\StudyAntlr\\SPC.g:478:11: op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB
            {
                root_0 = (Object) adaptor.nil();

                op = (Token) input.LT(1);
                match(input, TOK_AA, FOLLOW_TOK_AA_in_ctl_au3980);
                if (failed) return retval;
                if (backtracking == 0) {
                    op_tree = (Object) adaptor.create(op);
                    root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                }
                lb = (Token) input.LT(1);
                match(input, TOK_LB, FOLLOW_TOK_LB_in_ctl_au3985);
                if (failed) return retval;
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_au3990);
                fre = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, fre.getTree());
                opu = (Token) input.LT(1);
                match(input, TOK_UNTIL, FOLLOW_TOK_UNTIL_in_ctl_au3994);
                if (failed) return retval;
                if (backtracking == 0) {
                    opu_tree = (Object) adaptor.create(opu);
                    adaptor.addChild(root_0, opu_tree);
                }
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_au3998);
                sre = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, sre.getTree());
                rb = (Token) input.LT(1);
                match(input, TOK_RB, FOLLOW_TOK_RB_in_ctl_au4002);
                if (failed) return retval;
                if (backtracking == 0) {
                    if (!er())
                        exp_str = op.getText() + lb.getText() + input.toString(fre.start, fre.stop) + " " + opu.getText() + " " + input.toString(sre.start, sre.stop) + rb.getText();
                    if (!er()) append_end = true;
                    if (!er()) retval.ret = InitSpec.mk_AU(input, ((Token) retval.start), exp_str, fre.ret, sre.ret);
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_au

    public static class ctl_eu_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_eu
    // F:\\StudyAntlr\\SPC.g:481:1: ctl_eu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB ;
    public final ctl_eu_return ctl_eu() throws RecognitionException {
        ctl_eu_return retval = new ctl_eu_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        Token lb = null;
        Token opu = null;
        Token rb = null;
        ctl_root_expr_return fre = null;

        ctl_root_expr_return sre = null;


        Object op_tree = null;
        Object lb_tree = null;
        Object opu_tree = null;
        Object rb_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:484:9: (op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB )
            // F:\\StudyAntlr\\SPC.g:484:11: op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB
            {
                root_0 = (Object) adaptor.nil();

                op = (Token) input.LT(1);
                match(input, TOK_EE, FOLLOW_TOK_EE_in_ctl_eu4057);
                if (failed) return retval;
                if (backtracking == 0) {
                    op_tree = (Object) adaptor.create(op);
                    root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                }
                lb = (Token) input.LT(1);
                match(input, TOK_LB, FOLLOW_TOK_LB_in_ctl_eu4062);
                if (failed) return retval;
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_eu4067);
                fre = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, fre.getTree());
                opu = (Token) input.LT(1);
                match(input, TOK_UNTIL, FOLLOW_TOK_UNTIL_in_ctl_eu4071);
                if (failed) return retval;
                if (backtracking == 0) {
                    opu_tree = (Object) adaptor.create(opu);
                    adaptor.addChild(root_0, opu_tree);
                }
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_eu4075);
                sre = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, sre.getTree());
                rb = (Token) input.LT(1);
                match(input, TOK_RB, FOLLOW_TOK_RB_in_ctl_eu4079);
                if (failed) return retval;
                if (backtracking == 0) {
                    if (!er())
                        exp_str = op.getText() + lb.getText() + input.toString(fre.start, fre.stop) + " " + opu.getText() + " " + input.toString(sre.start, sre.stop) + rb.getText();
                    if (!er()) append_end = true;
                    if (!er()) retval.ret = InitSpec.mk_EU(input, ((Token) retval.start), exp_str, fre.ret, sre.ret);
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_eu

    public static class ctl_abu_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_abu
    // F:\\StudyAntlr\\SPC.g:487:1: ctl_abu returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB ;
    public final ctl_abu_return ctl_abu() throws RecognitionException {
        ctl_abu_return retval = new ctl_abu_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        Token lb = null;
        Token opu = null;
        Token rb = null;
        ctl_root_expr_return fre = null;

        subrange_return msr = null;

        ctl_root_expr_return sre = null;


        Object op_tree = null;
        Object lb_tree = null;
        Object opu_tree = null;
        Object rb_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:490:9: (op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB )
            // F:\\StudyAntlr\\SPC.g:490:11: op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB
            {
                root_0 = (Object) adaptor.nil();

                op = (Token) input.LT(1);
                match(input, TOK_AA, FOLLOW_TOK_AA_in_ctl_abu4134);
                if (failed) return retval;
                if (backtracking == 0) {
                    op_tree = (Object) adaptor.create(op);
                    root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                }
                lb = (Token) input.LT(1);
                match(input, TOK_LB, FOLLOW_TOK_LB_in_ctl_abu4139);
                if (failed) return retval;
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_abu4144);
                fre = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, fre.getTree());
                opu = (Token) input.LT(1);
                match(input, TOK_BUNTIL, FOLLOW_TOK_BUNTIL_in_ctl_abu4148);
                if (failed) return retval;
                if (backtracking == 0) {
                    opu_tree = (Object) adaptor.create(opu);
                    adaptor.addChild(root_0, opu_tree);
                }
                pushFollow(FOLLOW_subrange_in_ctl_abu4152);
                msr = subrange();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, msr.getTree());
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_abu4156);
                sre = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, sre.getTree());
                rb = (Token) input.LT(1);
                match(input, TOK_RB, FOLLOW_TOK_RB_in_ctl_abu4160);
                if (failed) return retval;
                if (backtracking == 0) {
                    if (!er())
                        exp_str = op.getText() + lb.getText() + input.toString(fre.start, fre.stop) + " " + opu.getText() + " " + input.toString(msr.start, msr.stop) + " " + input.toString(sre.start, sre.stop) + rb.getText();
                    if (!er()) append_end = true;
                    if (!er())
                        retval.ret = InitSpec.mk_ABU(input, ((Token) retval.start), exp_str, fre.ret, msr.ret, sre.ret);
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_abu

    public static class ctl_ebu_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_ebu
    // F:\\StudyAntlr\\SPC.g:493:1: ctl_ebu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB ;
    public final ctl_ebu_return ctl_ebu() throws RecognitionException {
        ctl_ebu_return retval = new ctl_ebu_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        Token lb = null;
        Token opu = null;
        Token rb = null;
        ctl_root_expr_return fre = null;

        subrange_return msr = null;

        ctl_root_expr_return sre = null;


        Object op_tree = null;
        Object lb_tree = null;
        Object opu_tree = null;
        Object rb_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:496:9: (op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB )
            // F:\\StudyAntlr\\SPC.g:496:11: op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB
            {
                root_0 = (Object) adaptor.nil();

                op = (Token) input.LT(1);
                match(input, TOK_EE, FOLLOW_TOK_EE_in_ctl_ebu4215);
                if (failed) return retval;
                if (backtracking == 0) {
                    op_tree = (Object) adaptor.create(op);
                    root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                }
                lb = (Token) input.LT(1);
                match(input, TOK_LB, FOLLOW_TOK_LB_in_ctl_ebu4220);
                if (failed) return retval;
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_ebu4225);
                fre = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, fre.getTree());
                opu = (Token) input.LT(1);
                match(input, TOK_BUNTIL, FOLLOW_TOK_BUNTIL_in_ctl_ebu4229);
                if (failed) return retval;
                if (backtracking == 0) {
                    opu_tree = (Object) adaptor.create(opu);
                    adaptor.addChild(root_0, opu_tree);
                }
                pushFollow(FOLLOW_subrange_in_ctl_ebu4233);
                msr = subrange();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, msr.getTree());
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_ebu4237);
                sre = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, sre.getTree());
                rb = (Token) input.LT(1);
                match(input, TOK_RB, FOLLOW_TOK_RB_in_ctl_ebu4241);
                if (failed) return retval;
                if (backtracking == 0) {
                    if (!er())
                        exp_str = op.getText() + lb.getText() + input.toString(fre.start, fre.stop) + " " + opu.getText() + " " + input.toString(msr.start, msr.stop) + " " + input.toString(sre.start, sre.stop) + rb.getText();
                    if (!er()) append_end = true;
                    if (!er())
                        retval.ret = InitSpec.mk_EBU(input, ((Token) retval.start), exp_str, fre.ret, msr.ret, sre.ret);
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_ebu

    public static class ctl_relational_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_relational_expr
    // F:\\StudyAntlr\\SPC.g:500:1: ctl_relational_expr returns [InternalSpec ret] : f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )* ;
    public final ctl_relational_expr_return ctl_relational_expr() throws RecognitionException {
        ctl_relational_expr_return retval = new ctl_relational_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_in_expr_return f = null;

        ctl_in_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:503:9: (f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )* )
            // F:\\StudyAntlr\\SPC.g:503:11: f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4302);
                f = ctl_in_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:504:9: (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )*
                loop26:
                do {
                    int alt26 = 7;
                    switch (input.LA(1)) {
                        case TOK_EQUAL: {
                            alt26 = 1;
                        }
                        break;
                        case TOK_NOTEQUAL: {
                            alt26 = 2;
                        }
                        break;
                        case TOK_LT: {
                            alt26 = 3;
                        }
                        break;
                        case TOK_GT: {
                            alt26 = 4;
                        }
                        break;
                        case TOK_LE: {
                            alt26 = 5;
                        }
                        break;
                        case TOK_GE: {
                            alt26 = 6;
                        }
                        break;

                    }

                    switch (alt26) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:504:11: op= TOK_EQUAL s= ctl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_EQUAL, FOLLOW_TOK_EQUAL_in_ctl_relational_expr4318);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4323);
                            s = ctl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_eq(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:506:11: op= TOK_NOTEQUAL s= ctl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_NOTEQUAL, FOLLOW_TOK_NOTEQUAL_in_ctl_relational_expr4348);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4353);
                            s = ctl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_neq(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 3:
                            // F:\\StudyAntlr\\SPC.g:508:11: op= TOK_LT s= ctl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LT, FOLLOW_TOK_LT_in_ctl_relational_expr4378);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4383);
                            s = ctl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_lt(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 4:
                            // F:\\StudyAntlr\\SPC.g:510:11: op= TOK_GT s= ctl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_GT, FOLLOW_TOK_GT_in_ctl_relational_expr4408);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4413);
                            s = ctl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_gt(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 5:
                            // F:\\StudyAntlr\\SPC.g:512:11: op= TOK_LE s= ctl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LE, FOLLOW_TOK_LE_in_ctl_relational_expr4438);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4443);
                            s = ctl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_le(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 6:
                            // F:\\StudyAntlr\\SPC.g:514:11: op= TOK_GE s= ctl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_GE, FOLLOW_TOK_GE_in_ctl_relational_expr4468);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4473);
                            s = ctl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_ge(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop26;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_relational_expr

    public static class ctl_in_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_in_expr
    // F:\\StudyAntlr\\SPC.g:518:1: ctl_in_expr returns [InternalSpec ret] : f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )* ;
    public final ctl_in_expr_return ctl_in_expr() throws RecognitionException {
        ctl_in_expr_return retval = new ctl_in_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_union_expr_return f = null;

        ctl_union_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:521:9: (f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )* )
            // F:\\StudyAntlr\\SPC.g:521:11: f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_union_expr_in_ctl_in_expr4537);
                f = ctl_union_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:522:9: (op= TOK_SETIN s= ctl_union_expr )*
                loop27:
                do {
                    int alt27 = 2;
                    int LA27_0 = input.LA(1);

                    if ((LA27_0 == TOK_SETIN)) {
                        alt27 = 1;
                    }


                    switch (alt27) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:522:11: op= TOK_SETIN s= ctl_union_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_SETIN, FOLLOW_TOK_SETIN_in_ctl_in_expr4553);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_union_expr_in_ctl_in_expr4558);
                            s = ctl_union_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_setin(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop27;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_in_expr

    public static class ctl_union_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_union_expr
    // F:\\StudyAntlr\\SPC.g:526:1: ctl_union_expr returns [InternalSpec ret] : f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )* ;
    public final ctl_union_expr_return ctl_union_expr() throws RecognitionException {
        ctl_union_expr_return retval = new ctl_union_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_set_expr_return f = null;

        ctl_set_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:529:9: (f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )* )
            // F:\\StudyAntlr\\SPC.g:529:11: f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_set_expr_in_ctl_union_expr4621);
                f = ctl_set_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:530:9: (op= TOK_UNION s= ctl_set_expr )*
                loop28:
                do {
                    int alt28 = 2;
                    int LA28_0 = input.LA(1);

                    if ((LA28_0 == TOK_UNION)) {
                        alt28 = 1;
                    }


                    switch (alt28) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:530:11: op= TOK_UNION s= ctl_set_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_UNION, FOLLOW_TOK_UNION_in_ctl_union_expr4637);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_set_expr_in_ctl_union_expr4642);
                            s = ctl_set_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_union(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop28;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_union_expr

    public static class ctl_set_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_set_expr
    // F:\\StudyAntlr\\SPC.g:534:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );
    public final ctl_set_expr_return ctl_set_expr() throws RecognitionException {
        ctl_set_expr_return retval = new ctl_set_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LCB81 = null;
        Token TOK_RCB83 = null;
        ctl_shift_expr_return ctl_shift_expr79 = null;

        subrange_return subrange80 = null;

        ctl_set_list_expr_return ctl_set_list_expr82 = null;


        Object TOK_LCB81_tree = null;
        Object TOK_RCB83_tree = null;
        RewriteRuleTokenStream stream_TOK_RCB = new RewriteRuleTokenStream(adaptor, "token TOK_RCB");
        RewriteRuleTokenStream stream_TOK_LCB = new RewriteRuleTokenStream(adaptor, "token TOK_LCB");
        RewriteRuleSubtreeStream stream_ctl_set_list_expr = new RewriteRuleSubtreeStream(adaptor, "rule ctl_set_list_expr");
        boolean append_end = false;
        try {
            // F:\\StudyAntlr\\SPC.g:537:9: ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) )
            int alt29 = 3;
            switch (input.LA(1)) {
                case TOK_NOT:
                case TOK_LP:
                case TOK_BOOL:
                case TOK_WORD1:
                case TOK_NEXT:
                case TOK_CASE:
                case TOK_WAREAD:
                case TOK_WAWRITE:
                case TOK_ATOM:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt29 = 1;
                }
                break;
                case TOK_NUMBER: {
                    int LA29_2 = input.LA(2);

                    if ((LA29_2 == EOF || (LA29_2 >= TOK_INVAR_SPEC && LA29_2 <= TOK_UNION) || (LA29_2 >= TOK_LSHIFT && LA29_2 <= TOK_CONCATENATION) || LA29_2 == TOK_RP || (LA29_2 >= TOK_LB && LA29_2 <= TOK_RB) || LA29_2 == TOK_BUNTIL || LA29_2 == TOK_DOT || LA29_2 == TOK_SEMI)) {
                        alt29 = 1;
                    } else if ((LA29_2 == TOK_TWODOTS)) {
                        alt29 = 2;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("534:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 2, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_PLUS: {
                    int LA29_3 = input.LA(2);

                    if ((LA29_3 == TOK_NUMBER)) {
                        int LA29_7 = input.LA(3);

                        if ((LA29_7 == EOF || (LA29_7 >= TOK_INVAR_SPEC && LA29_7 <= TOK_UNION) || (LA29_7 >= TOK_LSHIFT && LA29_7 <= TOK_CONCATENATION) || LA29_7 == TOK_RP || (LA29_7 >= TOK_LB && LA29_7 <= TOK_RB) || LA29_7 == TOK_BUNTIL || LA29_7 == TOK_DOT || LA29_7 == TOK_SEMI)) {
                            alt29 = 1;
                        } else if ((LA29_7 == TOK_TWODOTS)) {
                            alt29 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("534:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 7, input);

                            throw nvae;
                        }
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("534:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 3, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_MINUS: {
                    int LA29_4 = input.LA(2);

                    if ((LA29_4 == TOK_NUMBER)) {
                        int LA29_8 = input.LA(3);

                        if ((LA29_8 == EOF || (LA29_8 >= TOK_INVAR_SPEC && LA29_8 <= TOK_UNION) || (LA29_8 >= TOK_LSHIFT && LA29_8 <= TOK_CONCATENATION) || LA29_8 == TOK_RP || (LA29_8 >= TOK_LB && LA29_8 <= TOK_RB) || LA29_8 == TOK_BUNTIL || LA29_8 == TOK_DOT || LA29_8 == TOK_SEMI)) {
                            alt29 = 1;
                        } else if ((LA29_8 == TOK_TWODOTS)) {
                            alt29 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("534:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 8, input);

                            throw nvae;
                        }
                    } else if (((LA29_4 >= TOK_PLUS && LA29_4 <= TOK_MINUS) || (LA29_4 >= TOK_NOT && LA29_4 <= TOK_LP) || (LA29_4 >= TOK_BOOL && LA29_4 <= TOK_CASE) || (LA29_4 >= TOK_WAREAD && LA29_4 <= TOK_WAWRITE) || LA29_4 == TOK_ATOM || LA29_4 == TOK_NUMBER_WORD || (LA29_4 >= TOK_FALSEEXP && LA29_4 <= TOK_TRUEEXP))) {
                        alt29 = 1;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("534:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 4, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_LCB: {
                    alt29 = 3;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("534:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 0, input);

                    throw nvae;
            }

            switch (alt29) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:537:11: ctl_shift_expr
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ctl_shift_expr_in_ctl_set_expr4703);
                    ctl_shift_expr79 = ctl_shift_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ctl_shift_expr79.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_shift_expr79.ret;
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:539:11: subrange
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ctl_set_expr4725);
                    subrange80 = subrange();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, subrange80.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_range(input, ((Token) retval.start), input.toString(subrange80.start, subrange80.stop));
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:541:11: TOK_LCB ctl_set_list_expr TOK_RCB
                {
                    TOK_LCB81 = (Token) input.LT(1);
                    match(input, TOK_LCB, FOLLOW_TOK_LCB_in_ctl_set_expr4748);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LCB.add(TOK_LCB81);

                    pushFollow(FOLLOW_ctl_set_list_expr_in_ctl_set_expr4750);
                    ctl_set_list_expr82 = ctl_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ctl_set_list_expr.add(ctl_set_list_expr82.getTree());
                    TOK_RCB83 = (Token) input.LT(1);
                    match(input, TOK_RCB, FOLLOW_TOK_RCB_in_ctl_set_expr4752);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RCB.add(TOK_RCB83);

                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_set(input, ((Token) retval.start), TOK_LCB81.getText() + " " + input.toString(ctl_set_list_expr82.start, ctl_set_list_expr82.stop) + " " + TOK_RCB83.getText());
                    }

                    // AST REWRITE
                    // elements: ctl_set_list_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 543:9: -> ^( SET_LIST_EXP_T ctl_set_list_expr )
                        {
                            // F:\\StudyAntlr\\SPC.g:543:12: ^( SET_LIST_EXP_T ctl_set_list_expr )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(SET_LIST_EXP_T, "SET_LIST_EXP_T"), root_1);

                                adaptor.addChild(root_1, stream_ctl_set_list_expr.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_set_expr

    public static class ctl_set_list_expr_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_set_list_expr
    // F:\\StudyAntlr\\SPC.g:545:1: ctl_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ctl_set_list_expr_return ctl_set_list_expr() throws RecognitionException {
        ctl_set_list_expr_return retval = new ctl_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA85 = null;
        simple_root_expr_return simple_root_expr84 = null;

        simple_root_expr_return simple_root_expr86 = null;


        Object TOK_COMMA85_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:546:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // F:\\StudyAntlr\\SPC.g:546:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_simple_root_expr_in_ctl_set_list_expr4805);
                simple_root_expr84 = simple_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, simple_root_expr84.getTree());
                // F:\\StudyAntlr\\SPC.g:546:28: ( TOK_COMMA simple_root_expr )*
                loop30:
                do {
                    int alt30 = 2;
                    int LA30_0 = input.LA(1);

                    if ((LA30_0 == TOK_COMMA)) {
                        alt30 = 1;
                    }


                    switch (alt30) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:546:29: TOK_COMMA simple_root_expr
                        {
                            TOK_COMMA85 = (Token) input.LT(1);
                            match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_ctl_set_list_expr4808);
                            if (failed) return retval;
                            pushFollow(FOLLOW_simple_root_expr_in_ctl_set_list_expr4811);
                            simple_root_expr86 = simple_root_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, simple_root_expr86.getTree());

                        }
                        break;

                        default:
                            break loop30;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_set_list_expr

    public static class ctl_shift_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_shift_expr
    // F:\\StudyAntlr\\SPC.g:548:1: ctl_shift_expr returns [InternalSpec ret] : f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )* ;
    public final ctl_shift_expr_return ctl_shift_expr() throws RecognitionException {
        ctl_shift_expr_return retval = new ctl_shift_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_remainder_expr_return f = null;

        ctl_remainder_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:551:9: (f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )* )
            // F:\\StudyAntlr\\SPC.g:551:11: f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4857);
                f = ctl_remainder_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:552:9: (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )*
                loop31:
                do {
                    int alt31 = 3;
                    int LA31_0 = input.LA(1);

                    if ((LA31_0 == TOK_LSHIFT)) {
                        alt31 = 1;
                    } else if ((LA31_0 == TOK_RSHIFT)) {
                        alt31 = 2;
                    }


                    switch (alt31) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:552:11: op= TOK_LSHIFT s= ctl_remainder_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LSHIFT, FOLLOW_TOK_LSHIFT_in_ctl_shift_expr4873);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4878);
                            s = ctl_remainder_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_lshift(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:554:11: op= TOK_RSHIFT s= ctl_remainder_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_RSHIFT, FOLLOW_TOK_RSHIFT_in_ctl_shift_expr4902);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4907);
                            s = ctl_remainder_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_rshift(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop31;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_shift_expr

    public static class ctl_remainder_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_remainder_expr
    // F:\\StudyAntlr\\SPC.g:558:1: ctl_remainder_expr returns [InternalSpec ret] : f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )* ;
    public final ctl_remainder_expr_return ctl_remainder_expr() throws RecognitionException {
        ctl_remainder_expr_return retval = new ctl_remainder_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_additive_expr_return f = null;

        ctl_additive_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:561:9: (f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )* )
            // F:\\StudyAntlr\\SPC.g:561:11: f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4969);
                f = ctl_additive_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:562:9: (op= TOK_MOD s= ctl_additive_expr )*
                loop32:
                do {
                    int alt32 = 2;
                    int LA32_0 = input.LA(1);

                    if ((LA32_0 == TOK_MOD)) {
                        alt32 = 1;
                    }


                    switch (alt32) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:562:11: op= TOK_MOD s= ctl_additive_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_MOD, FOLLOW_TOK_MOD_in_ctl_remainder_expr4985);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4990);
                            s = ctl_additive_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_mod(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop32;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_remainder_expr

    public static class ctl_additive_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_additive_expr
    // F:\\StudyAntlr\\SPC.g:568:1: ctl_additive_expr returns [InternalSpec ret] : f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )* ;
    public final ctl_additive_expr_return ctl_additive_expr() throws RecognitionException {
        ctl_additive_expr_return retval = new ctl_additive_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_multiplicative_expr_return f = null;

        ctl_multiplicative_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:571:9: (f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )* )
            // F:\\StudyAntlr\\SPC.g:571:11: f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5054);
                f = ctl_multiplicative_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:572:9: (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )*
                loop33:
                do {
                    int alt33 = 3;
                    int LA33_0 = input.LA(1);

                    if ((LA33_0 == TOK_PLUS)) {
                        alt33 = 1;
                    } else if ((LA33_0 == TOK_MINUS)) {
                        alt33 = 2;
                    }


                    switch (alt33) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:572:11: op= TOK_PLUS s= ctl_multiplicative_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_PLUS, FOLLOW_TOK_PLUS_in_ctl_additive_expr5070);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5075);
                            s = ctl_multiplicative_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_plus(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:574:11: op= TOK_MINUS s= ctl_multiplicative_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_MINUS, FOLLOW_TOK_MINUS_in_ctl_additive_expr5099);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5104);
                            s = ctl_multiplicative_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_minus(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop33;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_additive_expr

    public static class ctl_multiplicative_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_multiplicative_expr
    // F:\\StudyAntlr\\SPC.g:578:1: ctl_multiplicative_expr returns [InternalSpec ret] : f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )* ;
    public final ctl_multiplicative_expr_return ctl_multiplicative_expr() throws RecognitionException {
        ctl_multiplicative_expr_return retval = new ctl_multiplicative_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_concatination_expr_return f = null;

        ctl_concatination_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:581:9: (f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )* )
            // F:\\StudyAntlr\\SPC.g:581:11: f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5165);
                f = ctl_concatination_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:582:9: (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )*
                loop34:
                do {
                    int alt34 = 3;
                    int LA34_0 = input.LA(1);

                    if ((LA34_0 == TOK_TIMES)) {
                        alt34 = 1;
                    } else if ((LA34_0 == TOK_DIVIDE)) {
                        alt34 = 2;
                    }


                    switch (alt34) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:582:11: op= TOK_TIMES s= ctl_concatination_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_TIMES, FOLLOW_TOK_TIMES_in_ctl_multiplicative_expr5181);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5186);
                            s = ctl_concatination_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_times(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:584:11: op= TOK_DIVIDE s= ctl_concatination_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_DIVIDE, FOLLOW_TOK_DIVIDE_in_ctl_multiplicative_expr5210);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5215);
                            s = ctl_concatination_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_divide(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop34;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_multiplicative_expr

    public static class ctl_concatination_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_concatination_expr
    // F:\\StudyAntlr\\SPC.g:588:1: ctl_concatination_expr returns [InternalSpec ret] : f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )* ;
    public final ctl_concatination_expr_return ctl_concatination_expr() throws RecognitionException {
        ctl_concatination_expr_return retval = new ctl_concatination_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_primary_expr_return f = null;

        ctl_primary_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:591:9: (f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )* )
            // F:\\StudyAntlr\\SPC.g:591:11: f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5276);
                f = ctl_primary_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:592:9: (op= TOK_CONCATENATION s= ctl_primary_expr )*
                loop35:
                do {
                    int alt35 = 2;
                    int LA35_0 = input.LA(1);

                    if ((LA35_0 == TOK_CONCATENATION)) {
                        alt35 = 1;
                    }


                    switch (alt35) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:592:11: op= TOK_CONCATENATION s= ctl_primary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_CONCATENATION, FOLLOW_TOK_CONCATENATION_in_ctl_concatination_expr5292);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5297);
                            s = ctl_primary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += op.getText() + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_concatenation(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop35;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_concatination_expr

    public static class ctl_primary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_primary_expr
    // F:\\StudyAntlr\\SPC.g:597:1: ctl_primary_expr returns [InternalSpec ret] : ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) );
    public final ctl_primary_expr_return ctl_primary_expr() throws RecognitionException {
        ctl_primary_expr_return retval = new ctl_primary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ctl_primary_expr_return v = null;

        ctl_primary_expr_helper1_return ctl_primary_expr_helper187 = null;


        Object op_tree = null;
        RewriteRuleTokenStream stream_TOK_MINUS = new RewriteRuleTokenStream(adaptor, "token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NOT = new RewriteRuleTokenStream(adaptor, "token TOK_NOT");
        RewriteRuleSubtreeStream stream_ctl_primary_expr = new RewriteRuleSubtreeStream(adaptor, "rule ctl_primary_expr");
        boolean append_end = false;
        try {
            // F:\\StudyAntlr\\SPC.g:600:9: ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) )
            int alt36 = 3;
            switch (input.LA(1)) {
                case TOK_PLUS:
                case TOK_LP:
                case TOK_BOOL:
                case TOK_WORD1:
                case TOK_NEXT:
                case TOK_CASE:
                case TOK_WAREAD:
                case TOK_WAWRITE:
                case TOK_ATOM:
                case TOK_NUMBER:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt36 = 1;
                }
                break;
                case TOK_MINUS: {
                    alt36 = 2;
                }
                break;
                case TOK_NOT: {
                    alt36 = 3;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("597:1: ctl_primary_expr returns [InternalSpec ret] : ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) );", 36, 0, input);

                    throw nvae;
            }

            switch (alt36) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:600:11: ctl_primary_expr_helper1
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ctl_primary_expr_helper1_in_ctl_primary_expr5366);
                    ctl_primary_expr_helper187 = ctl_primary_expr_helper1();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ctl_primary_expr_helper187.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_primary_expr_helper187.ret;
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:602:11: op= TOK_MINUS v= ctl_primary_expr
                {
                    op = (Token) input.LT(1);
                    match(input, TOK_MINUS, FOLLOW_TOK_MINUS_in_ctl_primary_expr5390);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_primary_expr5394);
                    v = ctl_primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ctl_primary_expr.add(v.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_unary_minus(input, ((Token) retval.start), op.getText() + " " + input.toString(v.start, v.stop), v.ret);
                    }

                    // AST REWRITE
                    // elements: v
                    // token labels:
                    // rule labels: v, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_v = new RewriteRuleSubtreeStream(adaptor, "token v", v != null ? v.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 604:9: -> ^( TOK_UNARY_MINUS_T $v)
                        {
                            // F:\\StudyAntlr\\SPC.g:604:12: ^( TOK_UNARY_MINUS_T $v)
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(TOK_UNARY_MINUS_T, "TOK_UNARY_MINUS_T"), root_1);

                                adaptor.addChild(root_1, stream_v.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:605:11: op= TOK_NOT v= ctl_primary_expr
                {
                    op = (Token) input.LT(1);
                    match(input, TOK_NOT, FOLLOW_TOK_NOT_in_ctl_primary_expr5435);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_primary_expr5439);
                    v = ctl_primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ctl_primary_expr.add(v.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_not(input, ((Token) retval.start), op.getText() + " " + input.toString(v.start, v.stop), v.ret);
                    }

                    // AST REWRITE
                    // elements: TOK_NOT, v
                    // token labels:
                    // rule labels: v, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_v = new RewriteRuleSubtreeStream(adaptor, "token v", v != null ? v.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 607:9: -> ^( TOK_NOT $v)
                        {
                            // F:\\StudyAntlr\\SPC.g:607:12: ^( TOK_NOT $v)
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_NOT.next(), root_1);

                                adaptor.addChild(root_1, stream_v.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_primary_expr

    public static class ctl_primary_expr_helper1_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_primary_expr_helper1
    // F:\\StudyAntlr\\SPC.g:610:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final ctl_primary_expr_helper1_return ctl_primary_expr_helper1() throws RecognitionException {
        ctl_primary_expr_helper1_return retval = new ctl_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1 = null;
        Token tc2 = null;
        Token TOK_LP95 = null;
        Token TOK_RP97 = null;
        Token TOK_BOOL99 = null;
        Token TOK_LP100 = null;
        Token TOK_RP102 = null;
        Token TOK_WORD1104 = null;
        Token TOK_LP105 = null;
        Token TOK_RP107 = null;
        Token TOK_NEXT109 = null;
        Token TOK_LP110 = null;
        Token TOK_RP112 = null;
        Token TOK_CASE114 = null;
        Token TOK_ESAC116 = null;
        Token TOK_WAREAD118 = null;
        Token TOK_LP119 = null;
        Token TOK_COMMA120 = null;
        Token TOK_RP121 = null;
        Token TOK_WAWRITE123 = null;
        Token TOK_LP124 = null;
        Token TOK_RP125 = null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant88 = null;

        primary_expr_select_return primary_expr_select89 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer190 = null;

        ctl_know_return ctl_know91 = null;

        primary_expr_select_return primary_expr_select92 = null;

        ctl_sknow_return ctl_sknow93 = null;

        primary_expr_select_return primary_expr_select94 = null;

        ctl_root_expr_return ctl_root_expr96 = null;

        primary_expr_select_return primary_expr_select98 = null;

        simple_root_expr_return simple_root_expr101 = null;

        primary_expr_select_return primary_expr_select103 = null;

        simple_root_expr_return simple_root_expr106 = null;

        primary_expr_select_return primary_expr_select108 = null;

        simple_root_expr_return simple_root_expr111 = null;

        primary_expr_select_return primary_expr_select113 = null;

        case_element_list_expr_return case_element_list_expr115 = null;

        primary_expr_select_return primary_expr_select117 = null;

        primary_expr_select_return primary_expr_select122 = null;

        primary_expr_select_return primary_expr_select126 = null;


        Object tc1_tree = null;
        Object tc2_tree = null;
        Object TOK_LP95_tree = null;
        Object TOK_RP97_tree = null;
        Object TOK_BOOL99_tree = null;
        Object TOK_LP100_tree = null;
        Object TOK_RP102_tree = null;
        Object TOK_WORD1104_tree = null;
        Object TOK_LP105_tree = null;
        Object TOK_RP107_tree = null;
        Object TOK_NEXT109_tree = null;
        Object TOK_LP110_tree = null;
        Object TOK_RP112_tree = null;
        Object TOK_CASE114_tree = null;
        Object TOK_ESAC116_tree = null;
        Object TOK_WAREAD118_tree = null;
        Object TOK_LP119_tree = null;
        Object TOK_COMMA120_tree = null;
        Object TOK_RP121_tree = null;
        Object TOK_WAWRITE123_tree = null;
        Object TOK_LP124_tree = null;
        Object TOK_RP125_tree = null;
        RewriteRuleTokenStream stream_TOK_LP = new RewriteRuleTokenStream(adaptor, "token TOK_LP");
        RewriteRuleTokenStream stream_TOK_WAREAD = new RewriteRuleTokenStream(adaptor, "token TOK_WAREAD");
        RewriteRuleTokenStream stream_TOK_COMMA = new RewriteRuleTokenStream(adaptor, "token TOK_COMMA");
        RewriteRuleTokenStream stream_TOK_WORD1 = new RewriteRuleTokenStream(adaptor, "token TOK_WORD1");
        RewriteRuleTokenStream stream_TOK_ESAC = new RewriteRuleTokenStream(adaptor, "token TOK_ESAC");
        RewriteRuleTokenStream stream_TOK_NEXT = new RewriteRuleTokenStream(adaptor, "token TOK_NEXT");
        RewriteRuleTokenStream stream_TOK_CASE = new RewriteRuleTokenStream(adaptor, "token TOK_CASE");
        RewriteRuleTokenStream stream_TOK_WAWRITE = new RewriteRuleTokenStream(adaptor, "token TOK_WAWRITE");
        RewriteRuleTokenStream stream_TOK_BOOL = new RewriteRuleTokenStream(adaptor, "token TOK_BOOL");
        RewriteRuleTokenStream stream_TOK_RP = new RewriteRuleTokenStream(adaptor, "token TOK_RP");
        RewriteRuleSubtreeStream stream_ctl_know = new RewriteRuleSubtreeStream(adaptor, "rule ctl_know");
        RewriteRuleSubtreeStream stream_case_element_list_expr = new RewriteRuleSubtreeStream(adaptor, "rule case_element_list_expr");
        RewriteRuleSubtreeStream stream_constant = new RewriteRuleSubtreeStream(adaptor, "rule constant");
        RewriteRuleSubtreeStream stream_simple_root_expr = new RewriteRuleSubtreeStream(adaptor, "rule simple_root_expr");
        RewriteRuleSubtreeStream stream_ctl_sknow = new RewriteRuleSubtreeStream(adaptor, "rule ctl_sknow");
        RewriteRuleSubtreeStream stream_ctl_root_expr = new RewriteRuleSubtreeStream(adaptor, "rule ctl_root_expr");
        RewriteRuleSubtreeStream stream_primary_expr_select = new RewriteRuleSubtreeStream(adaptor, "rule primary_expr_select");
        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:613:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
            int alt37 = 11;
            switch (input.LA(1)) {
                case TOK_PLUS:
                case TOK_NUMBER:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt37 = 1;
                }
                break;
                case TOK_ATOM: {
                    alt37 = 2;
                }
                break;
                case TOK_LP: {
                    int LA37_3 = input.LA(2);

                    if ((LA37_3 == TOK_ATOM)) {
                        switch (input.LA(3)) {
                            case TOK_IMPLIES:
                            case TOK_IFF:
                            case TOK_OR:
                            case TOK_XOR:
                            case TOK_XNOR:
                            case TOK_AND:
                            case TOK_EQUAL:
                            case TOK_NOTEQUAL:
                            case TOK_LT:
                            case TOK_GT:
                            case TOK_LE:
                            case TOK_GE:
                            case TOK_SETIN:
                            case TOK_UNION:
                            case TOK_LSHIFT:
                            case TOK_RSHIFT:
                            case TOK_MOD:
                            case TOK_PLUS:
                            case TOK_MINUS:
                            case TOK_TIMES:
                            case TOK_DIVIDE:
                            case TOK_CONCATENATION:
                            case TOK_RP:
                            case TOK_LB:
                            case TOK_DOT: {
                                alt37 = 5;
                            }
                            break;
                            case TOK_KNOW: {
                                alt37 = 3;
                            }
                            break;
                            case TOK_SKNOW: {
                                alt37 = 4;
                            }
                            break;
                            default:
                                if (backtracking > 0) {
                                    failed = true;
                                    return retval;
                                }
                                NoViableAltException nvae =
                                        new NoViableAltException("610:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 10, input);

                                throw nvae;
                        }

                    } else if ((LA37_3 == TOK_LCB || (LA37_3 >= TOK_PLUS && LA37_3 <= TOK_MINUS) || (LA37_3 >= TOK_NOT && LA37_3 <= TOK_LP) || (LA37_3 >= TOK_BOOL && LA37_3 <= TOK_CASE) || (LA37_3 >= TOK_WAREAD && LA37_3 <= TOK_AA) || LA37_3 == TOK_EE || LA37_3 == TOK_NUMBER || LA37_3 == TOK_NUMBER_WORD || (LA37_3 >= TOK_FALSEEXP && LA37_3 <= TOK_TRUEEXP))) {
                        alt37 = 5;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("610:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 3, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_BOOL: {
                    alt37 = 6;
                }
                break;
                case TOK_WORD1: {
                    alt37 = 7;
                }
                break;
                case TOK_NEXT: {
                    alt37 = 8;
                }
                break;
                case TOK_CASE: {
                    alt37 = 9;
                }
                break;
                case TOK_WAREAD: {
                    alt37 = 10;
                }
                break;
                case TOK_WAWRITE: {
                    alt37 = 11;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("610:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 0, input);

                    throw nvae;
            }

            switch (alt37) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:613:11: constant primary_expr_select
                {
                    pushFollow(FOLLOW_constant_in_ctl_primary_expr_helper15504);
                    constant88 = constant();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_constant.add(constant88.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15506);
                    primary_expr_select89 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select89.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: constant, primary_expr_select
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 616:9: -> ^( VALUE_T constant NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:616:12: ^( VALUE_T constant NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(VALUE_T, "VALUE_T"), root_1);

                                adaptor.addChild(root_1, stream_constant.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:617:11: primary_expr_helper1_pointer1
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ctl_primary_expr_helper15557);
                    primary_expr_helper1_pointer190 = primary_expr_helper1_pointer1();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, primary_expr_helper1_pointer190.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:624:11: ctl_know primary_expr_select
                {
                    pushFollow(FOLLOW_ctl_know_in_ctl_primary_expr_helper15600);
                    ctl_know91 = ctl_know();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ctl_know.add(ctl_know91.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15602);
                    primary_expr_select92 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select92.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_know91.ret;
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, ctl_know
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 626:9: -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:626:12: ^( CTL_KNOW_T ctl_know NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(CTL_KNOW_T, "CTL_KNOW_T"), root_1);

                                adaptor.addChild(root_1, stream_ctl_know.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 4:
                    // F:\\StudyAntlr\\SPC.g:628:11: ctl_sknow primary_expr_select
                {
                    pushFollow(FOLLOW_ctl_sknow_in_ctl_primary_expr_helper15646);
                    ctl_sknow93 = ctl_sknow();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ctl_sknow.add(ctl_sknow93.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15648);
                    primary_expr_select94 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select94.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_sknow93.ret;
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, ctl_sknow
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 630:9: -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:630:12: ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(CTL_SKNOW_T, "CTL_SKNOW_T"), root_1);

                                adaptor.addChild(root_1, stream_ctl_sknow.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 5:
                    // F:\\StudyAntlr\\SPC.g:634:11: TOK_LP ctl_root_expr TOK_RP primary_expr_select
                {
                    TOK_LP95 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ctl_primary_expr_helper15702);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP95);

                    pushFollow(FOLLOW_ctl_root_expr_in_ctl_primary_expr_helper15704);
                    ctl_root_expr96 = ctl_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ctl_root_expr.add(ctl_root_expr96.getTree());
                    TOK_RP97 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ctl_primary_expr_helper15706);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP97);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15708);
                    primary_expr_select98 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select98.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ctl_root_expr96.ret;
                    }

                    // AST REWRITE
                    // elements: ctl_root_expr, primary_expr_select
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 636:9: -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:636:12: ^( BLOCK_T ctl_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(BLOCK_T, "BLOCK_T"), root_1);

                                adaptor.addChild(root_1, stream_ctl_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 6:
                    // F:\\StudyAntlr\\SPC.g:640:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_BOOL99 = (Token) input.LT(1);
                    match(input, TOK_BOOL, FOLLOW_TOK_BOOL_in_ctl_primary_expr_helper15779);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_BOOL.add(TOK_BOOL99);

                    TOK_LP100 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ctl_primary_expr_helper15781);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP100);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15783);
                    simple_root_expr101 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr101.getTree());
                    TOK_RP102 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ctl_primary_expr_helper15785);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP102);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15787);
                    primary_expr_select103 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select103.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, TOK_BOOL, simple_root_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 643:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:643:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_BOOL.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 7:
                    // F:\\StudyAntlr\\SPC.g:644:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WORD1104 = (Token) input.LT(1);
                    match(input, TOK_WORD1, FOLLOW_TOK_WORD1_in_ctl_primary_expr_helper15838);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WORD1.add(TOK_WORD1104);

                    TOK_LP105 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ctl_primary_expr_helper15840);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP105);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15842);
                    simple_root_expr106 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr106.getTree());
                    TOK_RP107 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ctl_primary_expr_helper15844);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP107);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15846);
                    primary_expr_select108 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select108.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, simple_root_expr, TOK_WORD1
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 647:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:647:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WORD1.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 8:
                    // F:\\StudyAntlr\\SPC.g:649:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_NEXT109 = (Token) input.LT(1);
                    match(input, TOK_NEXT, FOLLOW_TOK_NEXT_in_ctl_primary_expr_helper15906);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NEXT.add(TOK_NEXT109);

                    TOK_LP110 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ctl_primary_expr_helper15908);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP110);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15910);
                    simple_root_expr111 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr111.getTree());
                    TOK_RP112 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ctl_primary_expr_helper15912);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP112);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15914);
                    primary_expr_select113 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select113.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, simple_root_expr, TOK_NEXT
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 652:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:652:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_NEXT.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 9:
                    // F:\\StudyAntlr\\SPC.g:654:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                {
                    TOK_CASE114 = (Token) input.LT(1);
                    match(input, TOK_CASE, FOLLOW_TOK_CASE_in_ctl_primary_expr_helper15974);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_CASE.add(TOK_CASE114);

                    pushFollow(FOLLOW_case_element_list_expr_in_ctl_primary_expr_helper15976);
                    case_element_list_expr115 = case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_case_element_list_expr.add(case_element_list_expr115.getTree());
                    TOK_ESAC116 = (Token) input.LT(1);
                    match(input, TOK_ESAC, FOLLOW_TOK_ESAC_in_ctl_primary_expr_helper15978);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_ESAC.add(TOK_ESAC116);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15980);
                    primary_expr_select117 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select117.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: case_element_list_expr, primary_expr_select
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 657:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:657:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(CASE_LIST_EXPR_T, "CASE_LIST_EXPR_T"), root_1);

                                adaptor.addChild(root_1, stream_case_element_list_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 10:
                    // F:\\StudyAntlr\\SPC.g:659:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WAREAD118 = (Token) input.LT(1);
                    match(input, TOK_WAREAD, FOLLOW_TOK_WAREAD_in_ctl_primary_expr_helper16040);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WAREAD.add(TOK_WAREAD118);

                    TOK_LP119 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ctl_primary_expr_helper16042);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP119);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16046);
                    f = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA120 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16048);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(TOK_COMMA120);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16052);
                    s = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(s.getTree());
                    TOK_RP121 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ctl_primary_expr_helper16054);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP121);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16056);
                    primary_expr_select122 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select122.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: TOK_WAREAD, f, s, primary_expr_select
                    // token labels:
                    // rule labels: s, f, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_s = new RewriteRuleSubtreeStream(adaptor, "token s", s != null ? s.tree : null);
                        RewriteRuleSubtreeStream stream_f = new RewriteRuleSubtreeStream(adaptor, "token f", f != null ? f.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 662:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:662:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WAREAD.next(), root_1);

                                adaptor.addChild(root_1, stream_f.next());
                                adaptor.addChild(root_1, stream_s.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 11:
                    // F:\\StudyAntlr\\SPC.g:664:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WAWRITE123 = (Token) input.LT(1);
                    match(input, TOK_WAWRITE, FOLLOW_TOK_WAWRITE_in_ctl_primary_expr_helper16120);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WAWRITE.add(TOK_WAWRITE123);

                    TOK_LP124 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ctl_primary_expr_helper16122);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP124);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16126);
                    f = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(f.getTree());
                    tc1 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16130);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16134);
                    m = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(m.getTree());
                    tc2 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16138);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16142);
                    s = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(s.getTree());
                    TOK_RP125 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ctl_primary_expr_helper16144);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP125);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16146);
                    primary_expr_select126 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select126.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: m, TOK_WAWRITE, f, primary_expr_select, s
                    // token labels:
                    // rule labels: s, f, m, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_s = new RewriteRuleSubtreeStream(adaptor, "token s", s != null ? s.tree : null);
                        RewriteRuleSubtreeStream stream_f = new RewriteRuleSubtreeStream(adaptor, "token f", f != null ? f.tree : null);
                        RewriteRuleSubtreeStream stream_m = new RewriteRuleSubtreeStream(adaptor, "token m", m != null ? m.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 667:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:667:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WAWRITE.next(), root_1);

                                adaptor.addChild(root_1, stream_f.next());
                                adaptor.addChild(root_1, stream_m.next());
                                adaptor.addChild(root_1, stream_s.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_primary_expr_helper1

    public static class ctl_know_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_know
    // F:\\StudyAntlr\\SPC.g:670:1: ctl_know returns [InternalSpec ret] : TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP ;
    public final ctl_know_return ctl_know() throws RecognitionException {
        ctl_know_return retval = new ctl_know_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token opk = null;
        Token TOK_LP127 = null;
        Token TOK_RP128 = null;
        agent_name_return agent = null;

        ctl_root_expr_return f = null;


        Object opk_tree = null;
        Object TOK_LP127_tree = null;
        Object TOK_RP128_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:673:9: ( TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP )
            // F:\\StudyAntlr\\SPC.g:673:11: TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP
            {
                root_0 = (Object) adaptor.nil();

                TOK_LP127 = (Token) input.LT(1);
                match(input, TOK_LP, FOLLOW_TOK_LP_in_ctl_know6235);
                if (failed) return retval;
                pushFollow(FOLLOW_agent_name_in_ctl_know6240);
                agent = agent_name();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, agent.getTree());
                opk = (Token) input.LT(1);
                match(input, TOK_KNOW, FOLLOW_TOK_KNOW_in_ctl_know6244);
                if (failed) return retval;
                if (backtracking == 0) {
                    opk_tree = (Object) adaptor.create(opk);
                    root_0 = (Object) adaptor.becomeRoot(opk_tree, root_0);
                }
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_know6249);
                f = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                TOK_RP128 = (Token) input.LT(1);
                match(input, TOK_RP, FOLLOW_TOK_RP_in_ctl_know6251);
                if (failed) return retval;
                if (backtracking == 0) {
                    if (!er())
                        exp_str = input.toString(agent.start, agent.stop) + " " + opk.getText() + " " + input.toString(f.start, f.stop);
                    if (!er()) append_end = true;
                    if (!er())
                        retval.ret = InitSpec.mk_ctl_know(input, ((Token) retval.start), exp_str, agent.ret, f.ret);

                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_know

    public static class ctl_sknow_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ctl_sknow
    // F:\\StudyAntlr\\SPC.g:680:1: ctl_sknow returns [InternalSpec ret] : TOK_LP agent= agent_name opk= TOK_SKNOW f= ctl_root_expr TOK_RP ;
    public final ctl_sknow_return ctl_sknow() throws RecognitionException {
        ctl_sknow_return retval = new ctl_sknow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token opk = null;
        Token TOK_LP129 = null;
        Token TOK_RP130 = null;
        agent_name_return agent = null;

        ctl_root_expr_return f = null;


        Object opk_tree = null;
        Object TOK_LP129_tree = null;
        Object TOK_RP130_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:683:9: ( TOK_LP agent= agent_name opk= TOK_SKNOW f= ctl_root_expr TOK_RP )
            // F:\\StudyAntlr\\SPC.g:683:11: TOK_LP agent= agent_name opk= TOK_SKNOW f= ctl_root_expr TOK_RP
            {
                root_0 = (Object) adaptor.nil();

                TOK_LP129 = (Token) input.LT(1);
                match(input, TOK_LP, FOLLOW_TOK_LP_in_ctl_sknow6317);
                if (failed) return retval;
                pushFollow(FOLLOW_agent_name_in_ctl_sknow6322);
                agent = agent_name();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, agent.getTree());
                opk = (Token) input.LT(1);
                match(input, TOK_SKNOW, FOLLOW_TOK_SKNOW_in_ctl_sknow6326);
                if (failed) return retval;
                if (backtracking == 0) {
                    opk_tree = (Object) adaptor.create(opk);
                    root_0 = (Object) adaptor.becomeRoot(opk_tree, root_0);
                }
                pushFollow(FOLLOW_ctl_root_expr_in_ctl_sknow6331);
                f = ctl_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                TOK_RP130 = (Token) input.LT(1);
                match(input, TOK_RP, FOLLOW_TOK_RP_in_ctl_sknow6333);
                if (failed) return retval;
                if (backtracking == 0) {
                    if (!er())
                        exp_str = input.toString(agent.start, agent.stop) + " " + opk.getText() + " " + input.toString(f.start, f.stop);
                    if (!er()) append_end = true;
                    if (!er())
                        retval.ret = InitSpec.mk_ctl_sknow(input, ((Token) retval.start), exp_str, agent.ret, f.ret);

                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ctl_sknow

    public static class agent_name_return extends ParserRuleReturnScope {
        public InternalSpecAgentIdentifier ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start agent_name
    // F:\\StudyAntlr\\SPC.g:700:1: agent_name returns [InternalSpecAgentIdentifier ret] : agentName= TOK_ATOM ;
    public final agent_name_return agent_name() throws RecognitionException {
        agent_name_return retval = new agent_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token agentName = null;

        Object agentName_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:702:9: (agentName= TOK_ATOM )
            // F:\\StudyAntlr\\SPC.g:702:11: agentName= TOK_ATOM
            {
                root_0 = (Object) adaptor.nil();

                agentName = (Token) input.LT(1);
                match(input, TOK_ATOM, FOLLOW_TOK_ATOM_in_agent_name6405);
                if (failed) return retval;
                if (backtracking == 0) {
                    agentName_tree = (Object) adaptor.create(agentName);
                    adaptor.addChild(root_0, agentName_tree);
                }
                if (backtracking == 0) {
                    if (!er())
                        retval.ret = new InternalSpecAgentIdentifier(agentName.getText(), ((Token) retval.start));
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end agent_name

    public static class ltl_root_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_root_expr
    // F:\\StudyAntlr\\SPC.g:709:1: ltl_root_expr returns [InternalSpec ret] : ltl_implies_expr ;
    public final ltl_root_expr_return ltl_root_expr() throws RecognitionException {
        ltl_root_expr_return retval = new ltl_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ltl_implies_expr_return ltl_implies_expr131 = null;


        try {
            // F:\\StudyAntlr\\SPC.g:710:9: ( ltl_implies_expr )
            // F:\\StudyAntlr\\SPC.g:710:11: ltl_implies_expr
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_implies_expr_in_ltl_root_expr6462);
                ltl_implies_expr131 = ltl_implies_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, ltl_implies_expr131.getTree());
                if (backtracking == 0) {
                    if (!er()) retval.ret = ltl_implies_expr131.ret;
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_root_expr

    public static class ltl_implies_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_implies_expr
    // F:\\StudyAntlr\\SPC.g:712:1: ltl_implies_expr returns [InternalSpec ret] : f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )? ;
    public final ltl_implies_expr_return ltl_implies_expr() throws RecognitionException {
        ltl_implies_expr_return retval = new ltl_implies_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_iff_expr_return f = null;

        ltl_implies_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:715:9: (f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )? )
            // F:\\StudyAntlr\\SPC.g:715:11: f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )?
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_iff_expr_in_ltl_implies_expr6505);
                f = ltl_iff_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:716:9: (op= TOK_IMPLIES s= ltl_implies_expr )?
                int alt38 = 2;
                int LA38_0 = input.LA(1);

                if ((LA38_0 == TOK_IMPLIES)) {
                    alt38 = 1;
                }
                switch (alt38) {
                    case 1:
                        // F:\\StudyAntlr\\SPC.g:716:11: op= TOK_IMPLIES s= ltl_implies_expr
                    {
                        op = (Token) input.LT(1);
                        match(input, TOK_IMPLIES, FOLLOW_TOK_IMPLIES_in_ltl_implies_expr6521);
                        if (failed) return retval;
                        if (backtracking == 0) {
                            op_tree = (Object) adaptor.create(op);
                            root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                        }
                        pushFollow(FOLLOW_ltl_implies_expr_in_ltl_implies_expr6526);
                        s = ltl_implies_expr();
                        _fsp--;
                        if (failed) return retval;
                        if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                        if (backtracking == 0) {
                            if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                            if (!er()) append_end = true;
                            if (!er())
                                retval.ret = InitSpec.mk_imply(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                        }

                    }
                    break;

                }


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_implies_expr

    public static class ltl_iff_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_iff_expr
    // F:\\StudyAntlr\\SPC.g:720:1: ltl_iff_expr returns [InternalSpec ret] : f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )* ;
    public final ltl_iff_expr_return ltl_iff_expr() throws RecognitionException {
        ltl_iff_expr_return retval = new ltl_iff_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_or_expr_return f = null;

        ltl_or_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:723:9: (f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )* )
            // F:\\StudyAntlr\\SPC.g:723:11: f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_or_expr_in_ltl_iff_expr6591);
                f = ltl_or_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:724:9: (op= TOK_IFF s= ltl_or_expr )*
                loop39:
                do {
                    int alt39 = 2;
                    int LA39_0 = input.LA(1);

                    if ((LA39_0 == TOK_IFF)) {
                        alt39 = 1;
                    }


                    switch (alt39) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:724:11: op= TOK_IFF s= ltl_or_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_IFF, FOLLOW_TOK_IFF_in_ltl_iff_expr6607);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_or_expr_in_ltl_iff_expr6612);
                            s = ltl_or_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_iff(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop39;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_iff_expr

    public static class ltl_or_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_or_expr
    // F:\\StudyAntlr\\SPC.g:728:1: ltl_or_expr returns [InternalSpec ret] : f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )* ;
    public final ltl_or_expr_return ltl_or_expr() throws RecognitionException {
        ltl_or_expr_return retval = new ltl_or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_and_expr_return f = null;

        ltl_and_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:731:9: (f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )* )
            // F:\\StudyAntlr\\SPC.g:731:11: f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6676);
                f = ltl_and_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:732:9: (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )*
                loop40:
                do {
                    int alt40 = 4;
                    switch (input.LA(1)) {
                        case TOK_OR: {
                            alt40 = 1;
                        }
                        break;
                        case TOK_XOR: {
                            alt40 = 2;
                        }
                        break;
                        case TOK_XNOR: {
                            alt40 = 3;
                        }
                        break;

                    }

                    switch (alt40) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:732:11: op= TOK_OR s= ltl_and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_OR, FOLLOW_TOK_OR_in_ltl_or_expr6692);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6697);
                            s = ltl_and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_or(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:734:11: op= TOK_XOR s= ltl_and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_XOR, FOLLOW_TOK_XOR_in_ltl_or_expr6721);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6726);
                            s = ltl_and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_xor(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 3:
                            // F:\\StudyAntlr\\SPC.g:736:11: op= TOK_XNOR s= ltl_and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_XNOR, FOLLOW_TOK_XNOR_in_ltl_or_expr6750);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6755);
                            s = ltl_and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_xnor(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop40;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_or_expr

    public static class ltl_and_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_and_expr
    // F:\\StudyAntlr\\SPC.g:740:1: ltl_and_expr returns [InternalSpec ret] : f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )* ;
    public final ltl_and_expr_return ltl_and_expr() throws RecognitionException {
        ltl_and_expr_return retval = new ltl_and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_binary_expr_return f = null;

        ltl_binary_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:743:9: (f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )* )
            // F:\\StudyAntlr\\SPC.g:743:11: f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_binary_expr_in_ltl_and_expr6818);
                f = ltl_binary_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:744:9: (op= TOK_AND s= ltl_binary_expr )*
                loop41:
                do {
                    int alt41 = 2;
                    int LA41_0 = input.LA(1);

                    if ((LA41_0 == TOK_AND)) {
                        alt41 = 1;
                    }


                    switch (alt41) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:744:11: op= TOK_AND s= ltl_binary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_AND, FOLLOW_TOK_AND_in_ltl_and_expr6834);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_binary_expr_in_ltl_and_expr6839);
                            s = ltl_binary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_and(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop41;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_and_expr

    public static class ltl_binary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_binary_expr
    // F:\\StudyAntlr\\SPC.g:750:1: ltl_binary_expr returns [InternalSpec ret] : f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASE s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )* ;
    public final ltl_binary_expr_return ltl_binary_expr() throws RecognitionException {
        ltl_binary_expr_return retval = new ltl_binary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_unary_expr_return f = null;

        ltl_unary_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:753:9: (f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASE s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )* )
            // F:\\StudyAntlr\\SPC.g:753:11: f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASE s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6904);
                f = ltl_unary_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:754:9: (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASE s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )*
                loop42:
                do {
                    int alt42 = 6;
                    switch (input.LA(1)) {
                        case TOK_UNTIL: {
                            alt42 = 1;
                        }
                        break;
                        case TOK_SINCE: {
                            alt42 = 2;
                        }
                        break;
                        case TOK_RELEASE: {
                            alt42 = 3;
                        }
                        break;
                        case TOK_TRIGGERED: {
                            alt42 = 4;
                        }
                        break;
                        case TOK_KNOW: {
                            alt42 = 5;
                        }
                        break;

                    }

                    switch (alt42) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:754:11: op= TOK_UNTIL s= ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_UNTIL, FOLLOW_TOK_UNTIL_in_ltl_binary_expr6920);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6925);
                            s = ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_until(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:756:11: op= TOK_SINCE s= ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_SINCE, FOLLOW_TOK_SINCE_in_ltl_binary_expr6950);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6955);
                            s = ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_since(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 3:
                            // F:\\StudyAntlr\\SPC.g:758:11: op= TOK_RELEASE s= ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_RELEASE, FOLLOW_TOK_RELEASE_in_ltl_binary_expr6980);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6985);
                            s = ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_releases(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 4:
                            // F:\\StudyAntlr\\SPC.g:760:11: op= TOK_TRIGGERED s= ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_TRIGGERED, FOLLOW_TOK_TRIGGERED_in_ltl_binary_expr7010);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr7015);
                            s = ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_triggered(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 5:
                            // F:\\StudyAntlr\\SPC.g:763:11: op= TOK_KNOW s= ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_KNOW, FOLLOW_TOK_KNOW_in_ltl_binary_expr7048);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr7053);
                            s = ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_ltl_know(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop42;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_binary_expr

    public static class ltl_unary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_unary_expr
    // F:\\StudyAntlr\\SPC.g:767:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );
    public final ltl_unary_expr_return ltl_unary_expr() throws RecognitionException {
        ltl_unary_expr_return retval = new ltl_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ltl_pure_unary_expr_return ltl_pure_unary_expr132 = null;

        ltl_relational_expr_return ltl_relational_expr133 = null;


        RewriteRuleSubtreeStream stream_ltl_pure_unary_expr = new RewriteRuleSubtreeStream(adaptor, "rule ltl_pure_unary_expr");
        try {
            // F:\\StudyAntlr\\SPC.g:768:9: ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr )
            int alt43 = 2;
            int LA43_0 = input.LA(1);

            if ((LA43_0 == TOK_OP_NEXT) && (synpred6())) {
                alt43 = 1;
            } else if ((LA43_0 == TOK_OP_PREV) && (synpred6())) {
                alt43 = 1;
            } else if ((LA43_0 == TOK_OP_NOTPREVNOT) && (synpred6())) {
                alt43 = 1;
            } else if ((LA43_0 == TOK_OP_GLOBALLY) && (synpred6())) {
                alt43 = 1;
            } else if ((LA43_0 == TOK_OP_HISTORICALLY) && (synpred6())) {
                alt43 = 1;
            } else if ((LA43_0 == TOK_OP_FINALLY) && (synpred6())) {
                alt43 = 1;
            } else if ((LA43_0 == TOK_OP_ONCE) && (synpred6())) {
                alt43 = 1;
            } else if ((LA43_0 == TOK_NOT)) {
                int LA43_8 = input.LA(2);

                if (((LA43_8 >= TOK_PLUS && LA43_8 <= TOK_MINUS) || LA43_8 == TOK_LP || (LA43_8 >= TOK_BOOL && LA43_8 <= TOK_CASE) || (LA43_8 >= TOK_WAREAD && LA43_8 <= TOK_WAWRITE) || LA43_8 == TOK_ATOM || LA43_8 == TOK_NUMBER || LA43_8 == TOK_NUMBER_WORD || (LA43_8 >= TOK_FALSEEXP && LA43_8 <= TOK_TRUEEXP))) {
                    alt43 = 2;
                } else if ((LA43_8 == TOK_NOT)) {
                    int LA43_10 = input.LA(3);

                    if ((synpred6())) {
                        alt43 = 1;
                    } else if ((true)) {
                        alt43 = 2;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("767:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 10, input);

                        throw nvae;
                    }
                } else if ((LA43_8 == TOK_OP_NEXT) && (synpred6())) {
                    alt43 = 1;
                } else if ((LA43_8 == TOK_OP_PREV) && (synpred6())) {
                    alt43 = 1;
                } else if ((LA43_8 == TOK_OP_NOTPREVNOT) && (synpred6())) {
                    alt43 = 1;
                } else if ((LA43_8 == TOK_OP_GLOBALLY) && (synpred6())) {
                    alt43 = 1;
                } else if ((LA43_8 == TOK_OP_HISTORICALLY) && (synpred6())) {
                    alt43 = 1;
                } else if ((LA43_8 == TOK_OP_FINALLY) && (synpred6())) {
                    alt43 = 1;
                } else if ((LA43_8 == TOK_OP_ONCE) && (synpred6())) {
                    alt43 = 1;
                } else {
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("767:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 8, input);

                    throw nvae;
                }
            } else if ((LA43_0 == TOK_LCB || (LA43_0 >= TOK_PLUS && LA43_0 <= TOK_MINUS) || LA43_0 == TOK_LP || (LA43_0 >= TOK_BOOL && LA43_0 <= TOK_CASE) || (LA43_0 >= TOK_WAREAD && LA43_0 <= TOK_WAWRITE) || LA43_0 == TOK_ATOM || LA43_0 == TOK_NUMBER || LA43_0 == TOK_NUMBER_WORD || (LA43_0 >= TOK_FALSEEXP && LA43_0 <= TOK_TRUEEXP))) {
                alt43 = 2;
            } else {
                if (backtracking > 0) {
                    failed = true;
                    return retval;
                }
                NoViableAltException nvae =
                        new NoViableAltException("767:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:768:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr
                {
                    pushFollow(FOLLOW_ltl_pure_unary_expr_in_ltl_unary_expr7205);
                    ltl_pure_unary_expr132 = ltl_pure_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ltl_pure_unary_expr.add(ltl_pure_unary_expr132.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ltl_pure_unary_expr132.ret;
                    }

                    // AST REWRITE
                    // elements: ltl_pure_unary_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 777:9: -> ^( PURE_LTL_T ltl_pure_unary_expr )
                        {
                            // F:\\StudyAntlr\\SPC.g:777:12: ^( PURE_LTL_T ltl_pure_unary_expr )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(PURE_LTL_T, "PURE_LTL_T"), root_1);

                                adaptor.addChild(root_1, stream_ltl_pure_unary_expr.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:778:11: ltl_relational_expr
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ltl_relational_expr_in_ltl_unary_expr7246);
                    ltl_relational_expr133 = ltl_relational_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ltl_relational_expr133.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ltl_relational_expr133.ret;
                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_unary_expr

    public static class ltl_pure_unary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_pure_unary_expr
    // F:\\StudyAntlr\\SPC.g:781:1: ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr );
    public final ltl_pure_unary_expr_return ltl_pure_unary_expr() throws RecognitionException {
        ltl_pure_unary_expr_return retval = new ltl_pure_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_unary_expr_return f = null;

        ltl_pure_unary_expr_return fp = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:784:9: (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr )
            int alt44 = 8;
            switch (input.LA(1)) {
                case TOK_OP_NEXT: {
                    alt44 = 1;
                }
                break;
                case TOK_OP_PREV: {
                    alt44 = 2;
                }
                break;
                case TOK_OP_NOTPREVNOT: {
                    alt44 = 3;
                }
                break;
                case TOK_OP_GLOBALLY: {
                    alt44 = 4;
                }
                break;
                case TOK_OP_HISTORICALLY: {
                    alt44 = 5;
                }
                break;
                case TOK_OP_FINALLY: {
                    alt44 = 6;
                }
                break;
                case TOK_OP_ONCE: {
                    alt44 = 7;
                }
                break;
                case TOK_NOT: {
                    alt44 = 8;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("781:1: ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr );", 44, 0, input);

                    throw nvae;
            }

            switch (alt44) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:784:11: op= TOK_OP_NEXT f= ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_NEXT, FOLLOW_TOK_OP_NEXT_in_ltl_pure_unary_expr7298);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7303);
                    f = ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_next(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:786:11: op= TOK_OP_PREV f= ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_PREV, FOLLOW_TOK_OP_PREV_in_ltl_pure_unary_expr7327);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7332);
                    f = ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_prev(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:788:11: op= TOK_OP_NOTPREVNOT f= ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_NOTPREVNOT, FOLLOW_TOK_OP_NOTPREVNOT_in_ltl_pure_unary_expr7356);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7361);
                    f = ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_notprevnot(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 4:
                    // F:\\StudyAntlr\\SPC.g:790:11: op= TOK_OP_GLOBALLY f= ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_GLOBALLY, FOLLOW_TOK_OP_GLOBALLY_in_ltl_pure_unary_expr7385);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7390);
                    f = ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_globally(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 5:
                    // F:\\StudyAntlr\\SPC.g:792:11: op= TOK_OP_HISTORICALLY f= ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_HISTORICALLY, FOLLOW_TOK_OP_HISTORICALLY_in_ltl_pure_unary_expr7414);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7419);
                    f = ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_historically(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 6:
                    // F:\\StudyAntlr\\SPC.g:794:11: op= TOK_OP_FINALLY f= ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_FINALLY, FOLLOW_TOK_OP_FINALLY_in_ltl_pure_unary_expr7443);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7448);
                    f = ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_finally(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 7:
                    // F:\\StudyAntlr\\SPC.g:796:11: op= TOK_OP_ONCE f= ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_ONCE, FOLLOW_TOK_OP_ONCE_in_ltl_pure_unary_expr7472);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7477);
                    f = ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_once(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 8:
                    // F:\\StudyAntlr\\SPC.g:799:11: op= TOK_NOT fp= ltl_pure_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_NOT, FOLLOW_TOK_NOT_in_ltl_pure_unary_expr7511);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_pure_unary_expr_in_ltl_pure_unary_expr7516);
                    fp = ltl_pure_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, fp.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(fp.start, fp.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_not(input, ((Token) retval.start), exp_str, fp.ret);
                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_pure_unary_expr

    public static class ltl_relational_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_relational_expr
    // F:\\StudyAntlr\\SPC.g:803:1: ltl_relational_expr returns [InternalSpec ret] : f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )* ;
    public final ltl_relational_expr_return ltl_relational_expr() throws RecognitionException {
        ltl_relational_expr_return retval = new ltl_relational_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_in_expr_return f = null;

        ltl_in_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:806:9: (f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )* )
            // F:\\StudyAntlr\\SPC.g:806:11: f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7568);
                f = ltl_in_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:807:9: (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )*
                loop45:
                do {
                    int alt45 = 7;
                    switch (input.LA(1)) {
                        case TOK_EQUAL: {
                            alt45 = 1;
                        }
                        break;
                        case TOK_NOTEQUAL: {
                            alt45 = 2;
                        }
                        break;
                        case TOK_LT: {
                            alt45 = 3;
                        }
                        break;
                        case TOK_GT: {
                            alt45 = 4;
                        }
                        break;
                        case TOK_LE: {
                            alt45 = 5;
                        }
                        break;
                        case TOK_GE: {
                            alt45 = 6;
                        }
                        break;

                    }

                    switch (alt45) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:807:11: op= TOK_EQUAL s= ltl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_EQUAL, FOLLOW_TOK_EQUAL_in_ltl_relational_expr7584);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7589);
                            s = ltl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_eq(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:809:11: op= TOK_NOTEQUAL s= ltl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_NOTEQUAL, FOLLOW_TOK_NOTEQUAL_in_ltl_relational_expr7614);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7619);
                            s = ltl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_neq(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 3:
                            // F:\\StudyAntlr\\SPC.g:811:11: op= TOK_LT s= ltl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LT, FOLLOW_TOK_LT_in_ltl_relational_expr7644);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7649);
                            s = ltl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_lt(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 4:
                            // F:\\StudyAntlr\\SPC.g:813:11: op= TOK_GT s= ltl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_GT, FOLLOW_TOK_GT_in_ltl_relational_expr7674);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7679);
                            s = ltl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_gt(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 5:
                            // F:\\StudyAntlr\\SPC.g:815:11: op= TOK_LE s= ltl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LE, FOLLOW_TOK_LE_in_ltl_relational_expr7704);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7709);
                            s = ltl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_le(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 6:
                            // F:\\StudyAntlr\\SPC.g:817:11: op= TOK_GE s= ltl_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_GE, FOLLOW_TOK_GE_in_ltl_relational_expr7734);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7739);
                            s = ltl_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_ge(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop45;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_relational_expr

    public static class ltl_in_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_in_expr
    // F:\\StudyAntlr\\SPC.g:821:1: ltl_in_expr returns [InternalSpec ret] : f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )* ;
    public final ltl_in_expr_return ltl_in_expr() throws RecognitionException {
        ltl_in_expr_return retval = new ltl_in_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_union_expr_return f = null;

        ltl_union_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:824:9: (f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )* )
            // F:\\StudyAntlr\\SPC.g:824:11: f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_union_expr_in_ltl_in_expr7803);
                f = ltl_union_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:825:9: (op= TOK_SETIN s= ltl_union_expr )*
                loop46:
                do {
                    int alt46 = 2;
                    int LA46_0 = input.LA(1);

                    if ((LA46_0 == TOK_SETIN)) {
                        alt46 = 1;
                    }


                    switch (alt46) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:825:11: op= TOK_SETIN s= ltl_union_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_SETIN, FOLLOW_TOK_SETIN_in_ltl_in_expr7819);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_union_expr_in_ltl_in_expr7824);
                            s = ltl_union_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_setin(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop46;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_in_expr

    public static class ltl_union_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_union_expr
    // F:\\StudyAntlr\\SPC.g:829:1: ltl_union_expr returns [InternalSpec ret] : f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )* ;
    public final ltl_union_expr_return ltl_union_expr() throws RecognitionException {
        ltl_union_expr_return retval = new ltl_union_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_set_expr_return f = null;

        ltl_set_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:832:9: (f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )* )
            // F:\\StudyAntlr\\SPC.g:832:11: f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_set_expr_in_ltl_union_expr7887);
                f = ltl_set_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:833:9: (op= TOK_UNION s= ltl_set_expr )*
                loop47:
                do {
                    int alt47 = 2;
                    int LA47_0 = input.LA(1);

                    if ((LA47_0 == TOK_UNION)) {
                        alt47 = 1;
                    }


                    switch (alt47) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:833:11: op= TOK_UNION s= ltl_set_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_UNION, FOLLOW_TOK_UNION_in_ltl_union_expr7903);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_set_expr_in_ltl_union_expr7908);
                            s = ltl_set_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_union(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop47;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_union_expr

    public static class ltl_set_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_set_expr
    // F:\\StudyAntlr\\SPC.g:837:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );
    public final ltl_set_expr_return ltl_set_expr() throws RecognitionException {
        ltl_set_expr_return retval = new ltl_set_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LCB136 = null;
        Token TOK_RCB138 = null;
        ltl_shift_expr_return ltl_shift_expr134 = null;

        subrange_return subrange135 = null;

        ltl_set_list_expr_return ltl_set_list_expr137 = null;


        Object TOK_LCB136_tree = null;
        Object TOK_RCB138_tree = null;
        RewriteRuleTokenStream stream_TOK_RCB = new RewriteRuleTokenStream(adaptor, "token TOK_RCB");
        RewriteRuleTokenStream stream_TOK_LCB = new RewriteRuleTokenStream(adaptor, "token TOK_LCB");
        RewriteRuleSubtreeStream stream_ltl_set_list_expr = new RewriteRuleSubtreeStream(adaptor, "rule ltl_set_list_expr");
        boolean append_end = false;
        try {
            // F:\\StudyAntlr\\SPC.g:840:9: ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) )
            int alt48 = 3;
            switch (input.LA(1)) {
                case TOK_NOT:
                case TOK_LP:
                case TOK_BOOL:
                case TOK_WORD1:
                case TOK_NEXT:
                case TOK_CASE:
                case TOK_WAREAD:
                case TOK_WAWRITE:
                case TOK_ATOM:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt48 = 1;
                }
                break;
                case TOK_NUMBER: {
                    int LA48_2 = input.LA(2);

                    if ((LA48_2 == TOK_TWODOTS)) {
                        alt48 = 2;
                    } else if ((LA48_2 == EOF || (LA48_2 >= TOK_INVAR_SPEC && LA48_2 <= TOK_UNION) || (LA48_2 >= TOK_LSHIFT && LA48_2 <= TOK_CONCATENATION) || LA48_2 == TOK_RP || (LA48_2 >= TOK_LB && LA48_2 <= TOK_UNTIL) || LA48_2 == TOK_KNOW || (LA48_2 >= TOK_SINCE && LA48_2 <= TOK_TRIGGERED) || LA48_2 == TOK_DOT || LA48_2 == TOK_SEMI)) {
                        alt48 = 1;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("837:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 2, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_PLUS: {
                    int LA48_3 = input.LA(2);

                    if ((LA48_3 == TOK_NUMBER)) {
                        int LA48_7 = input.LA(3);

                        if ((LA48_7 == TOK_TWODOTS)) {
                            alt48 = 2;
                        } else if ((LA48_7 == EOF || (LA48_7 >= TOK_INVAR_SPEC && LA48_7 <= TOK_UNION) || (LA48_7 >= TOK_LSHIFT && LA48_7 <= TOK_CONCATENATION) || LA48_7 == TOK_RP || (LA48_7 >= TOK_LB && LA48_7 <= TOK_UNTIL) || LA48_7 == TOK_KNOW || (LA48_7 >= TOK_SINCE && LA48_7 <= TOK_TRIGGERED) || LA48_7 == TOK_DOT || LA48_7 == TOK_SEMI)) {
                            alt48 = 1;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("837:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 7, input);

                            throw nvae;
                        }
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("837:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 3, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_MINUS: {
                    int LA48_4 = input.LA(2);

                    if ((LA48_4 == TOK_NUMBER)) {
                        int LA48_8 = input.LA(3);

                        if ((LA48_8 == EOF || (LA48_8 >= TOK_INVAR_SPEC && LA48_8 <= TOK_UNION) || (LA48_8 >= TOK_LSHIFT && LA48_8 <= TOK_CONCATENATION) || LA48_8 == TOK_RP || (LA48_8 >= TOK_LB && LA48_8 <= TOK_UNTIL) || LA48_8 == TOK_KNOW || (LA48_8 >= TOK_SINCE && LA48_8 <= TOK_TRIGGERED) || LA48_8 == TOK_DOT || LA48_8 == TOK_SEMI)) {
                            alt48 = 1;
                        } else if ((LA48_8 == TOK_TWODOTS)) {
                            alt48 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("837:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 8, input);

                            throw nvae;
                        }
                    } else if (((LA48_4 >= TOK_PLUS && LA48_4 <= TOK_MINUS) || (LA48_4 >= TOK_NOT && LA48_4 <= TOK_LP) || (LA48_4 >= TOK_BOOL && LA48_4 <= TOK_CASE) || (LA48_4 >= TOK_WAREAD && LA48_4 <= TOK_WAWRITE) || LA48_4 == TOK_ATOM || LA48_4 == TOK_NUMBER_WORD || (LA48_4 >= TOK_FALSEEXP && LA48_4 <= TOK_TRUEEXP))) {
                        alt48 = 1;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("837:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 4, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_LCB: {
                    alt48 = 3;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("837:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 0, input);

                    throw nvae;
            }

            switch (alt48) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:840:11: ltl_shift_expr
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ltl_shift_expr_in_ltl_set_expr7969);
                    ltl_shift_expr134 = ltl_shift_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ltl_shift_expr134.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ltl_shift_expr134.ret;
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:842:11: subrange
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ltl_set_expr7991);
                    subrange135 = subrange();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, subrange135.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_range(input, ((Token) retval.start), input.toString(subrange135.start, subrange135.stop));
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:844:11: TOK_LCB ltl_set_list_expr TOK_RCB
                {
                    TOK_LCB136 = (Token) input.LT(1);
                    match(input, TOK_LCB, FOLLOW_TOK_LCB_in_ltl_set_expr8014);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LCB.add(TOK_LCB136);

                    pushFollow(FOLLOW_ltl_set_list_expr_in_ltl_set_expr8016);
                    ltl_set_list_expr137 = ltl_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ltl_set_list_expr.add(ltl_set_list_expr137.getTree());
                    TOK_RCB138 = (Token) input.LT(1);
                    match(input, TOK_RCB, FOLLOW_TOK_RCB_in_ltl_set_expr8018);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RCB.add(TOK_RCB138);

                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_set(input, ((Token) retval.start), TOK_LCB136.getText() + " " + input.toString(ltl_set_list_expr137.start, ltl_set_list_expr137.stop) + " " + TOK_RCB138.getText());
                    }

                    // AST REWRITE
                    // elements: ltl_set_list_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 846:9: -> ^( SET_LIST_EXP_T ltl_set_list_expr )
                        {
                            // F:\\StudyAntlr\\SPC.g:846:12: ^( SET_LIST_EXP_T ltl_set_list_expr )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(SET_LIST_EXP_T, "SET_LIST_EXP_T"), root_1);

                                adaptor.addChild(root_1, stream_ltl_set_list_expr.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_set_expr

    public static class ltl_set_list_expr_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_set_list_expr
    // F:\\StudyAntlr\\SPC.g:848:1: ltl_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ltl_set_list_expr_return ltl_set_list_expr() throws RecognitionException {
        ltl_set_list_expr_return retval = new ltl_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA140 = null;
        simple_root_expr_return simple_root_expr139 = null;

        simple_root_expr_return simple_root_expr141 = null;


        Object TOK_COMMA140_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:849:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // F:\\StudyAntlr\\SPC.g:849:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_simple_root_expr_in_ltl_set_list_expr8071);
                simple_root_expr139 = simple_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, simple_root_expr139.getTree());
                // F:\\StudyAntlr\\SPC.g:849:28: ( TOK_COMMA simple_root_expr )*
                loop49:
                do {
                    int alt49 = 2;
                    int LA49_0 = input.LA(1);

                    if ((LA49_0 == TOK_COMMA)) {
                        alt49 = 1;
                    }


                    switch (alt49) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:849:29: TOK_COMMA simple_root_expr
                        {
                            TOK_COMMA140 = (Token) input.LT(1);
                            match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_ltl_set_list_expr8074);
                            if (failed) return retval;
                            pushFollow(FOLLOW_simple_root_expr_in_ltl_set_list_expr8077);
                            simple_root_expr141 = simple_root_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, simple_root_expr141.getTree());

                        }
                        break;

                        default:
                            break loop49;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_set_list_expr

    public static class ltl_shift_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_shift_expr
    // F:\\StudyAntlr\\SPC.g:851:1: ltl_shift_expr returns [InternalSpec ret] : f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )* ;
    public final ltl_shift_expr_return ltl_shift_expr() throws RecognitionException {
        ltl_shift_expr_return retval = new ltl_shift_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_remainder_expr_return f = null;

        ltl_remainder_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:854:9: (f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )* )
            // F:\\StudyAntlr\\SPC.g:854:11: f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8123);
                f = ltl_remainder_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:855:9: (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )*
                loop50:
                do {
                    int alt50 = 3;
                    int LA50_0 = input.LA(1);

                    if ((LA50_0 == TOK_LSHIFT)) {
                        alt50 = 1;
                    } else if ((LA50_0 == TOK_RSHIFT)) {
                        alt50 = 2;
                    }


                    switch (alt50) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:855:11: op= TOK_LSHIFT s= ltl_remainder_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LSHIFT, FOLLOW_TOK_LSHIFT_in_ltl_shift_expr8139);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8144);
                            s = ltl_remainder_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_lshift(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:857:11: op= TOK_RSHIFT s= ltl_remainder_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_RSHIFT, FOLLOW_TOK_RSHIFT_in_ltl_shift_expr8168);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8173);
                            s = ltl_remainder_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_rshift(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop50;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_shift_expr

    public static class ltl_remainder_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_remainder_expr
    // F:\\StudyAntlr\\SPC.g:861:1: ltl_remainder_expr returns [InternalSpec ret] : f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )* ;
    public final ltl_remainder_expr_return ltl_remainder_expr() throws RecognitionException {
        ltl_remainder_expr_return retval = new ltl_remainder_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_additive_expr_return f = null;

        ltl_additive_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:864:9: (f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )* )
            // F:\\StudyAntlr\\SPC.g:864:11: f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8235);
                f = ltl_additive_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:865:9: (op= TOK_MOD s= ltl_additive_expr )*
                loop51:
                do {
                    int alt51 = 2;
                    int LA51_0 = input.LA(1);

                    if ((LA51_0 == TOK_MOD)) {
                        alt51 = 1;
                    }


                    switch (alt51) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:865:11: op= TOK_MOD s= ltl_additive_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_MOD, FOLLOW_TOK_MOD_in_ltl_remainder_expr8251);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8256);
                            s = ltl_additive_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_mod(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop51;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_remainder_expr

    public static class ltl_additive_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_additive_expr
    // F:\\StudyAntlr\\SPC.g:871:1: ltl_additive_expr returns [InternalSpec ret] : f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )* ;
    public final ltl_additive_expr_return ltl_additive_expr() throws RecognitionException {
        ltl_additive_expr_return retval = new ltl_additive_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_multiplicative_expr_return f = null;

        ltl_multiplicative_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:874:9: (f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )* )
            // F:\\StudyAntlr\\SPC.g:874:11: f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8320);
                f = ltl_multiplicative_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:875:9: (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )*
                loop52:
                do {
                    int alt52 = 3;
                    int LA52_0 = input.LA(1);

                    if ((LA52_0 == TOK_PLUS)) {
                        alt52 = 1;
                    } else if ((LA52_0 == TOK_MINUS)) {
                        alt52 = 2;
                    }


                    switch (alt52) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:875:11: op= TOK_PLUS s= ltl_multiplicative_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_PLUS, FOLLOW_TOK_PLUS_in_ltl_additive_expr8336);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8341);
                            s = ltl_multiplicative_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_plus(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:877:11: op= TOK_MINUS s= ltl_multiplicative_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_MINUS, FOLLOW_TOK_MINUS_in_ltl_additive_expr8365);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8370);
                            s = ltl_multiplicative_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_minus(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop52;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_additive_expr

    public static class ltl_multiplicative_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_multiplicative_expr
    // F:\\StudyAntlr\\SPC.g:881:1: ltl_multiplicative_expr returns [InternalSpec ret] : f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )* ;
    public final ltl_multiplicative_expr_return ltl_multiplicative_expr() throws RecognitionException {
        ltl_multiplicative_expr_return retval = new ltl_multiplicative_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_concatination_expr_return f = null;

        ltl_concatination_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:884:9: (f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )* )
            // F:\\StudyAntlr\\SPC.g:884:11: f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8431);
                f = ltl_concatination_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:885:9: (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )*
                loop53:
                do {
                    int alt53 = 3;
                    int LA53_0 = input.LA(1);

                    if ((LA53_0 == TOK_TIMES)) {
                        alt53 = 1;
                    } else if ((LA53_0 == TOK_DIVIDE)) {
                        alt53 = 2;
                    }


                    switch (alt53) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:885:11: op= TOK_TIMES s= ltl_concatination_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_TIMES, FOLLOW_TOK_TIMES_in_ltl_multiplicative_expr8447);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8452);
                            s = ltl_concatination_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_times(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:887:11: op= TOK_DIVIDE s= ltl_concatination_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_DIVIDE, FOLLOW_TOK_DIVIDE_in_ltl_multiplicative_expr8476);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8481);
                            s = ltl_concatination_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_divide(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop53;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_multiplicative_expr

    public static class ltl_concatination_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_concatination_expr
    // F:\\StudyAntlr\\SPC.g:891:1: ltl_concatination_expr returns [InternalSpec ret] : f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )* ;
    public final ltl_concatination_expr_return ltl_concatination_expr() throws RecognitionException {
        ltl_concatination_expr_return retval = new ltl_concatination_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_primary_expr_return f = null;

        ltl_primary_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:894:9: (f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )* )
            // F:\\StudyAntlr\\SPC.g:894:11: f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8542);
                f = ltl_primary_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:895:9: (op= TOK_CONCATENATION s= ltl_primary_expr )*
                loop54:
                do {
                    int alt54 = 2;
                    int LA54_0 = input.LA(1);

                    if ((LA54_0 == TOK_CONCATENATION)) {
                        alt54 = 1;
                    }


                    switch (alt54) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:895:11: op= TOK_CONCATENATION s= ltl_primary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_CONCATENATION, FOLLOW_TOK_CONCATENATION_in_ltl_concatination_expr8558);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8563);
                            s = ltl_primary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += op.getText() + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_concatenation(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop54;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_concatination_expr

    public static class ltl_primary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_primary_expr
    // F:\\StudyAntlr\\SPC.g:900:1: ltl_primary_expr returns [InternalSpec ret] : ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) );
    public final ltl_primary_expr_return ltl_primary_expr() throws RecognitionException {
        ltl_primary_expr_return retval = new ltl_primary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        ltl_primary_expr_return v = null;

        ltl_primary_expr_helper1_return ltl_primary_expr_helper1142 = null;


        Object op_tree = null;
        RewriteRuleTokenStream stream_TOK_MINUS = new RewriteRuleTokenStream(adaptor, "token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NOT = new RewriteRuleTokenStream(adaptor, "token TOK_NOT");
        RewriteRuleSubtreeStream stream_ltl_primary_expr = new RewriteRuleSubtreeStream(adaptor, "rule ltl_primary_expr");
        boolean append_end = false;
        try {
            // F:\\StudyAntlr\\SPC.g:903:9: ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) )
            int alt55 = 3;
            switch (input.LA(1)) {
                case TOK_PLUS:
                case TOK_LP:
                case TOK_BOOL:
                case TOK_WORD1:
                case TOK_NEXT:
                case TOK_CASE:
                case TOK_WAREAD:
                case TOK_WAWRITE:
                case TOK_ATOM:
                case TOK_NUMBER:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt55 = 1;
                }
                break;
                case TOK_MINUS: {
                    alt55 = 2;
                }
                break;
                case TOK_NOT: {
                    alt55 = 3;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("900:1: ltl_primary_expr returns [InternalSpec ret] : ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) );", 55, 0, input);

                    throw nvae;
            }

            switch (alt55) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:903:11: ltl_primary_expr_helper1
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ltl_primary_expr_helper1_in_ltl_primary_expr8624);
                    ltl_primary_expr_helper1142 = ltl_primary_expr_helper1();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, ltl_primary_expr_helper1142.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ltl_primary_expr_helper1142.ret;
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:905:11: op= TOK_MINUS v= ltl_primary_expr
                {
                    op = (Token) input.LT(1);
                    match(input, TOK_MINUS, FOLLOW_TOK_MINUS_in_ltl_primary_expr8648);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_primary_expr8652);
                    v = ltl_primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ltl_primary_expr.add(v.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_unary_minus(input, ((Token) retval.start), op.getText() + " " + input.toString(v.start, v.stop), v.ret);
                    }

                    // AST REWRITE
                    // elements: v
                    // token labels:
                    // rule labels: v, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_v = new RewriteRuleSubtreeStream(adaptor, "token v", v != null ? v.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 907:9: -> ^( TOK_UNARY_MINUS_T $v)
                        {
                            // F:\\StudyAntlr\\SPC.g:907:12: ^( TOK_UNARY_MINUS_T $v)
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(TOK_UNARY_MINUS_T, "TOK_UNARY_MINUS_T"), root_1);

                                adaptor.addChild(root_1, stream_v.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:908:11: op= TOK_NOT v= ltl_primary_expr
                {
                    op = (Token) input.LT(1);
                    match(input, TOK_NOT, FOLLOW_TOK_NOT_in_ltl_primary_expr8693);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_primary_expr8697);
                    v = ltl_primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ltl_primary_expr.add(v.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_not(input, ((Token) retval.start), op.getText() + " " + input.toString(v.start, v.stop), v.ret);
                    }

                    // AST REWRITE
                    // elements: v, TOK_NOT
                    // token labels:
                    // rule labels: v, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_v = new RewriteRuleSubtreeStream(adaptor, "token v", v != null ? v.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 910:9: -> ^( TOK_NOT $v)
                        {
                            // F:\\StudyAntlr\\SPC.g:910:12: ^( TOK_NOT $v)
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_NOT.next(), root_1);

                                adaptor.addChild(root_1, stream_v.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_primary_expr

    public static class ltl_primary_expr_helper1_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ltl_primary_expr_helper1
    // F:\\StudyAntlr\\SPC.g:913:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final ltl_primary_expr_helper1_return ltl_primary_expr_helper1() throws RecognitionException {
        ltl_primary_expr_helper1_return retval = new ltl_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1 = null;
        Token tc2 = null;
        Token TOK_LP146 = null;
        Token TOK_RP148 = null;
        Token TOK_BOOL150 = null;
        Token TOK_LP151 = null;
        Token TOK_RP153 = null;
        Token TOK_WORD1155 = null;
        Token TOK_LP156 = null;
        Token TOK_RP158 = null;
        Token TOK_NEXT160 = null;
        Token TOK_LP161 = null;
        Token TOK_RP163 = null;
        Token TOK_CASE165 = null;
        Token TOK_ESAC167 = null;
        Token TOK_WAREAD169 = null;
        Token TOK_LP170 = null;
        Token TOK_COMMA171 = null;
        Token TOK_RP172 = null;
        Token TOK_WAWRITE174 = null;
        Token TOK_LP175 = null;
        Token TOK_RP176 = null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant143 = null;

        primary_expr_select_return primary_expr_select144 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1145 = null;

        ltl_root_expr_return ltl_root_expr147 = null;

        primary_expr_select_return primary_expr_select149 = null;

        simple_root_expr_return simple_root_expr152 = null;

        primary_expr_select_return primary_expr_select154 = null;

        simple_root_expr_return simple_root_expr157 = null;

        primary_expr_select_return primary_expr_select159 = null;

        simple_root_expr_return simple_root_expr162 = null;

        primary_expr_select_return primary_expr_select164 = null;

        case_element_list_expr_return case_element_list_expr166 = null;

        primary_expr_select_return primary_expr_select168 = null;

        primary_expr_select_return primary_expr_select173 = null;

        primary_expr_select_return primary_expr_select177 = null;


        Object tc1_tree = null;
        Object tc2_tree = null;
        Object TOK_LP146_tree = null;
        Object TOK_RP148_tree = null;
        Object TOK_BOOL150_tree = null;
        Object TOK_LP151_tree = null;
        Object TOK_RP153_tree = null;
        Object TOK_WORD1155_tree = null;
        Object TOK_LP156_tree = null;
        Object TOK_RP158_tree = null;
        Object TOK_NEXT160_tree = null;
        Object TOK_LP161_tree = null;
        Object TOK_RP163_tree = null;
        Object TOK_CASE165_tree = null;
        Object TOK_ESAC167_tree = null;
        Object TOK_WAREAD169_tree = null;
        Object TOK_LP170_tree = null;
        Object TOK_COMMA171_tree = null;
        Object TOK_RP172_tree = null;
        Object TOK_WAWRITE174_tree = null;
        Object TOK_LP175_tree = null;
        Object TOK_RP176_tree = null;
        RewriteRuleTokenStream stream_TOK_LP = new RewriteRuleTokenStream(adaptor, "token TOK_LP");
        RewriteRuleTokenStream stream_TOK_WAREAD = new RewriteRuleTokenStream(adaptor, "token TOK_WAREAD");
        RewriteRuleTokenStream stream_TOK_COMMA = new RewriteRuleTokenStream(adaptor, "token TOK_COMMA");
        RewriteRuleTokenStream stream_TOK_WORD1 = new RewriteRuleTokenStream(adaptor, "token TOK_WORD1");
        RewriteRuleTokenStream stream_TOK_ESAC = new RewriteRuleTokenStream(adaptor, "token TOK_ESAC");
        RewriteRuleTokenStream stream_TOK_NEXT = new RewriteRuleTokenStream(adaptor, "token TOK_NEXT");
        RewriteRuleTokenStream stream_TOK_CASE = new RewriteRuleTokenStream(adaptor, "token TOK_CASE");
        RewriteRuleTokenStream stream_TOK_WAWRITE = new RewriteRuleTokenStream(adaptor, "token TOK_WAWRITE");
        RewriteRuleTokenStream stream_TOK_BOOL = new RewriteRuleTokenStream(adaptor, "token TOK_BOOL");
        RewriteRuleTokenStream stream_TOK_RP = new RewriteRuleTokenStream(adaptor, "token TOK_RP");
        RewriteRuleSubtreeStream stream_case_element_list_expr = new RewriteRuleSubtreeStream(adaptor, "rule case_element_list_expr");
        RewriteRuleSubtreeStream stream_constant = new RewriteRuleSubtreeStream(adaptor, "rule constant");
        RewriteRuleSubtreeStream stream_simple_root_expr = new RewriteRuleSubtreeStream(adaptor, "rule simple_root_expr");
        RewriteRuleSubtreeStream stream_ltl_root_expr = new RewriteRuleSubtreeStream(adaptor, "rule ltl_root_expr");
        RewriteRuleSubtreeStream stream_primary_expr_select = new RewriteRuleSubtreeStream(adaptor, "rule primary_expr_select");
        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:916:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
            int alt56 = 9;
            switch (input.LA(1)) {
                case TOK_PLUS:
                case TOK_NUMBER:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt56 = 1;
                }
                break;
                case TOK_ATOM: {
                    alt56 = 2;
                }
                break;
                case TOK_LP: {
                    alt56 = 3;
                }
                break;
                case TOK_BOOL: {
                    alt56 = 4;
                }
                break;
                case TOK_WORD1: {
                    alt56 = 5;
                }
                break;
                case TOK_NEXT: {
                    alt56 = 6;
                }
                break;
                case TOK_CASE: {
                    alt56 = 7;
                }
                break;
                case TOK_WAREAD: {
                    alt56 = 8;
                }
                break;
                case TOK_WAWRITE: {
                    alt56 = 9;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("913:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 56, 0, input);

                    throw nvae;
            }

            switch (alt56) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:916:11: constant primary_expr_select
                {
                    pushFollow(FOLLOW_constant_in_ltl_primary_expr_helper18762);
                    constant143 = constant();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_constant.add(constant143.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18764);
                    primary_expr_select144 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select144.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: constant, primary_expr_select
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 919:9: -> ^( VALUE_T constant NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:919:12: ^( VALUE_T constant NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(VALUE_T, "VALUE_T"), root_1);

                                adaptor.addChild(root_1, stream_constant.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:920:11: primary_expr_helper1_pointer1
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ltl_primary_expr_helper18815);
                    primary_expr_helper1_pointer1145 = primary_expr_helper1_pointer1();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, primary_expr_helper1_pointer1145.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:929:11: TOK_LP ltl_root_expr TOK_RP primary_expr_select
                {
                    TOK_LP146 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ltl_primary_expr_helper18868);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP146);

                    pushFollow(FOLLOW_ltl_root_expr_in_ltl_primary_expr_helper18870);
                    ltl_root_expr147 = ltl_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_ltl_root_expr.add(ltl_root_expr147.getTree());
                    TOK_RP148 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ltl_primary_expr_helper18872);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP148);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18874);
                    primary_expr_select149 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select149.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = ltl_root_expr147.ret;
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, ltl_root_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 931:9: -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:931:12: ^( BLOCK_T ltl_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(BLOCK_T, "BLOCK_T"), root_1);

                                adaptor.addChild(root_1, stream_ltl_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 4:
                    // F:\\StudyAntlr\\SPC.g:935:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_BOOL150 = (Token) input.LT(1);
                    match(input, TOK_BOOL, FOLLOW_TOK_BOOL_in_ltl_primary_expr_helper18945);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_BOOL.add(TOK_BOOL150);

                    TOK_LP151 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ltl_primary_expr_helper18947);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP151);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18949);
                    simple_root_expr152 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr152.getTree());
                    TOK_RP153 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ltl_primary_expr_helper18951);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP153);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18953);
                    primary_expr_select154 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select154.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, simple_root_expr, TOK_BOOL
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 938:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:938:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_BOOL.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 5:
                    // F:\\StudyAntlr\\SPC.g:939:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WORD1155 = (Token) input.LT(1);
                    match(input, TOK_WORD1, FOLLOW_TOK_WORD1_in_ltl_primary_expr_helper19004);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WORD1.add(TOK_WORD1155);

                    TOK_LP156 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ltl_primary_expr_helper19006);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP156);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19008);
                    simple_root_expr157 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr157.getTree());
                    TOK_RP158 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ltl_primary_expr_helper19010);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP158);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19012);
                    primary_expr_select159 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select159.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, simple_root_expr, TOK_WORD1
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 942:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:942:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WORD1.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 6:
                    // F:\\StudyAntlr\\SPC.g:944:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_NEXT160 = (Token) input.LT(1);
                    match(input, TOK_NEXT, FOLLOW_TOK_NEXT_in_ltl_primary_expr_helper19072);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NEXT.add(TOK_NEXT160);

                    TOK_LP161 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ltl_primary_expr_helper19074);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP161);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19076);
                    simple_root_expr162 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr162.getTree());
                    TOK_RP163 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ltl_primary_expr_helper19078);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP163);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19080);
                    primary_expr_select164 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select164.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: TOK_NEXT, simple_root_expr, primary_expr_select
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 947:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:947:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_NEXT.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 7:
                    // F:\\StudyAntlr\\SPC.g:949:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                {
                    TOK_CASE165 = (Token) input.LT(1);
                    match(input, TOK_CASE, FOLLOW_TOK_CASE_in_ltl_primary_expr_helper19140);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_CASE.add(TOK_CASE165);

                    pushFollow(FOLLOW_case_element_list_expr_in_ltl_primary_expr_helper19142);
                    case_element_list_expr166 = case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_case_element_list_expr.add(case_element_list_expr166.getTree());
                    TOK_ESAC167 = (Token) input.LT(1);
                    match(input, TOK_ESAC, FOLLOW_TOK_ESAC_in_ltl_primary_expr_helper19144);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_ESAC.add(TOK_ESAC167);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19146);
                    primary_expr_select168 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select168.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, case_element_list_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 952:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:952:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(CASE_LIST_EXPR_T, "CASE_LIST_EXPR_T"), root_1);

                                adaptor.addChild(root_1, stream_case_element_list_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 8:
                    // F:\\StudyAntlr\\SPC.g:954:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WAREAD169 = (Token) input.LT(1);
                    match(input, TOK_WAREAD, FOLLOW_TOK_WAREAD_in_ltl_primary_expr_helper19206);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WAREAD.add(TOK_WAREAD169);

                    TOK_LP170 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ltl_primary_expr_helper19208);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP170);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19212);
                    f = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA171 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19214);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(TOK_COMMA171);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19218);
                    s = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(s.getTree());
                    TOK_RP172 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ltl_primary_expr_helper19220);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP172);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19222);
                    primary_expr_select173 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select173.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: s, TOK_WAREAD, f, primary_expr_select
                    // token labels:
                    // rule labels: s, f, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_s = new RewriteRuleSubtreeStream(adaptor, "token s", s != null ? s.tree : null);
                        RewriteRuleSubtreeStream stream_f = new RewriteRuleSubtreeStream(adaptor, "token f", f != null ? f.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 957:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:957:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WAREAD.next(), root_1);

                                adaptor.addChild(root_1, stream_f.next());
                                adaptor.addChild(root_1, stream_s.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 9:
                    // F:\\StudyAntlr\\SPC.g:959:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WAWRITE174 = (Token) input.LT(1);
                    match(input, TOK_WAWRITE, FOLLOW_TOK_WAWRITE_in_ltl_primary_expr_helper19286);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WAWRITE.add(TOK_WAWRITE174);

                    TOK_LP175 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_ltl_primary_expr_helper19288);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP175);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19292);
                    f = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(f.getTree());
                    tc1 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19296);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19300);
                    m = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(m.getTree());
                    tc2 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19304);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19308);
                    s = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(s.getTree());
                    TOK_RP176 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_ltl_primary_expr_helper19310);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP176);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19312);
                    primary_expr_select177 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select177.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: s, f, m, primary_expr_select, TOK_WAWRITE
                    // token labels:
                    // rule labels: s, f, m, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_s = new RewriteRuleSubtreeStream(adaptor, "token s", s != null ? s.tree : null);
                        RewriteRuleSubtreeStream stream_f = new RewriteRuleSubtreeStream(adaptor, "token f", f != null ? f.tree : null);
                        RewriteRuleSubtreeStream stream_m = new RewriteRuleSubtreeStream(adaptor, "token m", m != null ? m.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 962:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:962:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WAWRITE.next(), root_1);

                                adaptor.addChild(root_1, stream_f.next());
                                adaptor.addChild(root_1, stream_m.next());
                                adaptor.addChild(root_1, stream_s.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end ltl_primary_expr_helper1

    public static class atls_root_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_root_expr
    // F:\\StudyAntlr\\SPC.g:968:1: atls_root_expr returns [InternalSpec ret] : atls_implies_expr ;
    public final atls_root_expr_return atls_root_expr() throws RecognitionException {
        atls_root_expr_return retval = new atls_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        atls_implies_expr_return atls_implies_expr178 = null;


        try {
            // F:\\StudyAntlr\\SPC.g:969:9: ( atls_implies_expr )
            // F:\\StudyAntlr\\SPC.g:969:11: atls_implies_expr
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_implies_expr_in_atls_root_expr9392);
                atls_implies_expr178 = atls_implies_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, atls_implies_expr178.getTree());
                if (backtracking == 0) {
                    if (!er()) retval.ret = atls_implies_expr178.ret;
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_root_expr

    public static class atls_implies_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_implies_expr
    // F:\\StudyAntlr\\SPC.g:971:1: atls_implies_expr returns [InternalSpec ret] : f= atls_iff_expr (op= TOK_IMPLIES s= atls_implies_expr )? ;
    public final atls_implies_expr_return atls_implies_expr() throws RecognitionException {
        atls_implies_expr_return retval = new atls_implies_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_iff_expr_return f = null;

        atls_implies_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:974:9: (f= atls_iff_expr (op= TOK_IMPLIES s= atls_implies_expr )? )
            // F:\\StudyAntlr\\SPC.g:974:11: f= atls_iff_expr (op= TOK_IMPLIES s= atls_implies_expr )?
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_iff_expr_in_atls_implies_expr9435);
                f = atls_iff_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:975:9: (op= TOK_IMPLIES s= atls_implies_expr )?
                int alt57 = 2;
                int LA57_0 = input.LA(1);

                if ((LA57_0 == TOK_IMPLIES)) {
                    alt57 = 1;
                }
                switch (alt57) {
                    case 1:
                        // F:\\StudyAntlr\\SPC.g:975:11: op= TOK_IMPLIES s= atls_implies_expr
                    {
                        op = (Token) input.LT(1);
                        match(input, TOK_IMPLIES, FOLLOW_TOK_IMPLIES_in_atls_implies_expr9451);
                        if (failed) return retval;
                        if (backtracking == 0) {
                            op_tree = (Object) adaptor.create(op);
                            root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                        }
                        pushFollow(FOLLOW_atls_implies_expr_in_atls_implies_expr9456);
                        s = atls_implies_expr();
                        _fsp--;
                        if (failed) return retval;
                        if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                        if (backtracking == 0) {
                            if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                            if (!er()) append_end = true;
                            if (!er())
                                retval.ret = InitSpec.mk_imply(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                        }

                    }
                    break;

                }


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_implies_expr

    public static class atls_iff_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_iff_expr
    // F:\\StudyAntlr\\SPC.g:979:1: atls_iff_expr returns [InternalSpec ret] : f= atls_or_expr (op= TOK_IFF s= atls_or_expr )* ;
    public final atls_iff_expr_return atls_iff_expr() throws RecognitionException {
        atls_iff_expr_return retval = new atls_iff_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_or_expr_return f = null;

        atls_or_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:982:9: (f= atls_or_expr (op= TOK_IFF s= atls_or_expr )* )
            // F:\\StudyAntlr\\SPC.g:982:11: f= atls_or_expr (op= TOK_IFF s= atls_or_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_or_expr_in_atls_iff_expr9521);
                f = atls_or_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:983:9: (op= TOK_IFF s= atls_or_expr )*
                loop58:
                do {
                    int alt58 = 2;
                    int LA58_0 = input.LA(1);

                    if ((LA58_0 == TOK_IFF)) {
                        alt58 = 1;
                    }


                    switch (alt58) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:983:11: op= TOK_IFF s= atls_or_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_IFF, FOLLOW_TOK_IFF_in_atls_iff_expr9537);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_or_expr_in_atls_iff_expr9542);
                            s = atls_or_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_iff(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop58;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_iff_expr

    public static class atls_or_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_or_expr
    // F:\\StudyAntlr\\SPC.g:987:1: atls_or_expr returns [InternalSpec ret] : f= atls_and_expr (op= TOK_OR s= atls_and_expr | op= TOK_XOR s= atls_and_expr | op= TOK_XNOR s= atls_and_expr )* ;
    public final atls_or_expr_return atls_or_expr() throws RecognitionException {
        atls_or_expr_return retval = new atls_or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_and_expr_return f = null;

        atls_and_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:990:9: (f= atls_and_expr (op= TOK_OR s= atls_and_expr | op= TOK_XOR s= atls_and_expr | op= TOK_XNOR s= atls_and_expr )* )
            // F:\\StudyAntlr\\SPC.g:990:11: f= atls_and_expr (op= TOK_OR s= atls_and_expr | op= TOK_XOR s= atls_and_expr | op= TOK_XNOR s= atls_and_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_and_expr_in_atls_or_expr9605);
                f = atls_and_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:991:9: (op= TOK_OR s= atls_and_expr | op= TOK_XOR s= atls_and_expr | op= TOK_XNOR s= atls_and_expr )*
                loop59:
                do {
                    int alt59 = 4;
                    switch (input.LA(1)) {
                        case TOK_OR: {
                            alt59 = 1;
                        }
                        break;
                        case TOK_XOR: {
                            alt59 = 2;
                        }
                        break;
                        case TOK_XNOR: {
                            alt59 = 3;
                        }
                        break;

                    }

                    switch (alt59) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:991:11: op= TOK_OR s= atls_and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_OR, FOLLOW_TOK_OR_in_atls_or_expr9621);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_and_expr_in_atls_or_expr9626);
                            s = atls_and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_or(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:993:11: op= TOK_XOR s= atls_and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_XOR, FOLLOW_TOK_XOR_in_atls_or_expr9650);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_and_expr_in_atls_or_expr9655);
                            s = atls_and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_xor(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 3:
                            // F:\\StudyAntlr\\SPC.g:995:11: op= TOK_XNOR s= atls_and_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_XNOR, FOLLOW_TOK_XNOR_in_atls_or_expr9679);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_and_expr_in_atls_or_expr9684);
                            s = atls_and_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_xnor(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop59;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_or_expr

    public static class atls_and_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_and_expr
    // F:\\StudyAntlr\\SPC.g:999:1: atls_and_expr returns [InternalSpec ret] : f= atls_ltl_binary_expr (op= TOK_AND s= atls_ltl_binary_expr )* ;
    public final atls_and_expr_return atls_and_expr() throws RecognitionException {
        atls_and_expr_return retval = new atls_and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_ltl_binary_expr_return f = null;

        atls_ltl_binary_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1002:9: (f= atls_ltl_binary_expr (op= TOK_AND s= atls_ltl_binary_expr )* )
            // F:\\StudyAntlr\\SPC.g:1002:11: f= atls_ltl_binary_expr (op= TOK_AND s= atls_ltl_binary_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_ltl_binary_expr_in_atls_and_expr9747);
                f = atls_ltl_binary_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:1003:9: (op= TOK_AND s= atls_ltl_binary_expr )*
                loop60:
                do {
                    int alt60 = 2;
                    int LA60_0 = input.LA(1);

                    if ((LA60_0 == TOK_AND)) {
                        alt60 = 1;
                    }


                    switch (alt60) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1003:11: op= TOK_AND s= atls_ltl_binary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_AND, FOLLOW_TOK_AND_in_atls_and_expr9763);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_ltl_binary_expr_in_atls_and_expr9768);
                            s = atls_ltl_binary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_and(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop60;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_and_expr

    public static class atls_ltl_binary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_ltl_binary_expr
    // F:\\StudyAntlr\\SPC.g:1009:1: atls_ltl_binary_expr returns [InternalSpec ret] : f= atls_ltl_unary_expr (op= TOK_UNTIL s= atls_ltl_unary_expr | op= TOK_SINCE s= atls_ltl_unary_expr | op= TOK_RELEASE s= atls_ltl_unary_expr | op= TOK_TRIGGERED s= atls_ltl_unary_expr | op= TOK_BUNTIL r= subrange s= atls_ltl_unary_expr | op= TOK_BRELEASE r= subrange s= atls_ltl_unary_expr | op= TOK_KNOW s= atls_ltl_unary_expr | op= TOK_SKNOW s= atls_ltl_unary_expr )* ;
    public final atls_ltl_binary_expr_return atls_ltl_binary_expr() throws RecognitionException {
        atls_ltl_binary_expr_return retval = new atls_ltl_binary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_ltl_unary_expr_return f = null;

        atls_ltl_unary_expr_return s = null;

        subrange_return r = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1012:9: (f= atls_ltl_unary_expr (op= TOK_UNTIL s= atls_ltl_unary_expr | op= TOK_SINCE s= atls_ltl_unary_expr | op= TOK_RELEASE s= atls_ltl_unary_expr | op= TOK_TRIGGERED s= atls_ltl_unary_expr | op= TOK_BUNTIL r= subrange s= atls_ltl_unary_expr | op= TOK_BRELEASE r= subrange s= atls_ltl_unary_expr | op= TOK_KNOW s= atls_ltl_unary_expr | op= TOK_SKNOW s= atls_ltl_unary_expr )* )
            // F:\\StudyAntlr\\SPC.g:1012:11: f= atls_ltl_unary_expr (op= TOK_UNTIL s= atls_ltl_unary_expr | op= TOK_SINCE s= atls_ltl_unary_expr | op= TOK_RELEASE s= atls_ltl_unary_expr | op= TOK_TRIGGERED s= atls_ltl_unary_expr | op= TOK_BUNTIL r= subrange s= atls_ltl_unary_expr | op= TOK_BRELEASE r= subrange s= atls_ltl_unary_expr | op= TOK_KNOW s= atls_ltl_unary_expr | op= TOK_SKNOW s= atls_ltl_unary_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr9833);
                f = atls_ltl_unary_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:1013:9: (op= TOK_UNTIL s= atls_ltl_unary_expr | op= TOK_SINCE s= atls_ltl_unary_expr | op= TOK_RELEASE s= atls_ltl_unary_expr | op= TOK_TRIGGERED s= atls_ltl_unary_expr | op= TOK_BUNTIL r= subrange s= atls_ltl_unary_expr | op= TOK_BRELEASE r= subrange s= atls_ltl_unary_expr | op= TOK_KNOW s= atls_ltl_unary_expr | op= TOK_SKNOW s= atls_ltl_unary_expr )*
                loop61:
                do {
                    int alt61 = 9;
                    switch (input.LA(1)) {
                        case TOK_UNTIL: {
                            alt61 = 1;
                        }
                        break;
                        case TOK_SINCE: {
                            alt61 = 2;
                        }
                        break;
                        case TOK_RELEASE: {
                            alt61 = 3;
                        }
                        break;
                        case TOK_TRIGGERED: {
                            alt61 = 4;
                        }
                        break;
                        case TOK_BUNTIL: {
                            alt61 = 5;
                        }
                        break;
                        case TOK_BRELEASE: {
                            alt61 = 6;
                        }
                        break;
                        case TOK_KNOW: {
                            alt61 = 7;
                        }
                        break;
                        case TOK_SKNOW: {
                            alt61 = 8;
                        }
                        break;

                    }

                    switch (alt61) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1015:9: op= TOK_UNTIL s= atls_ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_UNTIL, FOLLOW_TOK_UNTIL_in_atls_ltl_binary_expr9867);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr9872);
                            s = atls_ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_until(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:1017:11: op= TOK_SINCE s= atls_ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_SINCE, FOLLOW_TOK_SINCE_in_atls_ltl_binary_expr9897);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr9902);
                            s = atls_ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_since(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 3:
                            // F:\\StudyAntlr\\SPC.g:1019:11: op= TOK_RELEASE s= atls_ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_RELEASE, FOLLOW_TOK_RELEASE_in_atls_ltl_binary_expr9927);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr9932);
                            s = atls_ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_releases(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 4:
                            // F:\\StudyAntlr\\SPC.g:1021:11: op= TOK_TRIGGERED s= atls_ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_TRIGGERED, FOLLOW_TOK_TRIGGERED_in_atls_ltl_binary_expr9957);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr9962);
                            s = atls_ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_triggered(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 5:
                            // F:\\StudyAntlr\\SPC.g:1024:10: op= TOK_BUNTIL r= subrange s= atls_ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_BUNTIL, FOLLOW_TOK_BUNTIL_in_atls_ltl_binary_expr9994);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_subrange_in_atls_ltl_binary_expr9999);
                            r = subrange();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, r.getTree());
                            pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr10003);
                            s = atls_ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er())
                                    exp_str += " " + op.getText() + " " + input.toString(r.start, r.stop) + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_buntil(input, ((Token) retval.start), exp_str, retval.ret, r.ret, s.ret);
                            }

                        }
                        break;
                        case 6:
                            // F:\\StudyAntlr\\SPC.g:1026:11: op= TOK_BRELEASE r= subrange s= atls_ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_BRELEASE, FOLLOW_TOK_BRELEASE_in_atls_ltl_binary_expr10028);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_subrange_in_atls_ltl_binary_expr10033);
                            r = subrange();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, r.getTree());
                            pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr10037);
                            s = atls_ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er())
                                    exp_str += " " + op.getText() + " " + input.toString(r.start, r.stop) + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_brelease(input, ((Token) retval.start), exp_str, retval.ret, r.ret, s.ret);
                            }

                        }
                        break;
                        case 7:
                            // F:\\StudyAntlr\\SPC.g:1029:11: op= TOK_KNOW s= atls_ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_KNOW, FOLLOW_TOK_KNOW_in_atls_ltl_binary_expr10071);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr10076);
                            s = atls_ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                InternalSpecAgentIdentifier agentId = null;
                                if (!er())
                                    agentId = new InternalSpecAgentIdentifier(input.toString(f.start, f.stop), ((Token) retval.start));
                                if (!er())
                                    retval.ret = InitSpec.mk_atls_know(input, ((Token) retval.start), exp_str, agentId, s.ret);
                            }

                        }
                        break;
                        case 8:
                            // F:\\StudyAntlr\\SPC.g:1035:11: op= TOK_SKNOW s= atls_ltl_unary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_SKNOW, FOLLOW_TOK_SKNOW_in_atls_ltl_binary_expr10100);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr10105);
                            s = atls_ltl_unary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                InternalSpecAgentIdentifier agentId = null;
                                if (!er())
                                    agentId = new InternalSpecAgentIdentifier(input.toString(f.start, f.stop), ((Token) retval.start));
                                if (!er())
                                    retval.ret = InitSpec.mk_atls_sknow(input, ((Token) retval.start), exp_str, agentId, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop61;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_ltl_binary_expr

    public static class atls_ltl_unary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_ltl_unary_expr
    // F:\\StudyAntlr\\SPC.g:1044:1: atls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_AA | TOK_EE | TOK_LT agent_list TOK_GT | TOK_LB agent_list TOK_RB ) )=> atls_ltl_pure_unary_expr -> ^( PURE_LTL_T atls_ltl_pure_unary_expr ) | atls_relational_expr );
    public final atls_ltl_unary_expr_return atls_ltl_unary_expr() throws RecognitionException {
        atls_ltl_unary_expr_return retval = new atls_ltl_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        atls_ltl_pure_unary_expr_return atls_ltl_pure_unary_expr179 = null;

        atls_relational_expr_return atls_relational_expr180 = null;


        RewriteRuleSubtreeStream stream_atls_ltl_pure_unary_expr = new RewriteRuleSubtreeStream(adaptor, "rule atls_ltl_pure_unary_expr");
        try {
            // F:\\StudyAntlr\\SPC.g:1045:9: ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_AA | TOK_EE | TOK_LT agent_list TOK_GT | TOK_LB agent_list TOK_RB ) )=> atls_ltl_pure_unary_expr -> ^( PURE_LTL_T atls_ltl_pure_unary_expr ) | atls_relational_expr )
            int alt62 = 2;
            int LA62_0 = input.LA(1);

            if ((LA62_0 == TOK_OP_NEXT) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_OP_PREV) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_OP_NOTPREVNOT) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_OP_GLOBALLY) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_OP_HISTORICALLY) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_OP_FINALLY) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_OP_ONCE) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_OP_BFINALLY) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_OP_BGLOBALLY) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_AA) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_EE) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_LT) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_LB) && (synpred7())) {
                alt62 = 1;
            } else if ((LA62_0 == TOK_NOT)) {
                int LA62_14 = input.LA(2);

                if (((LA62_14 >= TOK_PLUS && LA62_14 <= TOK_MINUS) || LA62_14 == TOK_LP || (LA62_14 >= TOK_BOOL && LA62_14 <= TOK_CASE) || (LA62_14 >= TOK_WAREAD && LA62_14 <= TOK_WAWRITE) || LA62_14 == TOK_ATOM || LA62_14 == TOK_NUMBER || LA62_14 == TOK_NUMBER_WORD || (LA62_14 >= TOK_FALSEEXP && LA62_14 <= TOK_TRUEEXP))) {
                    alt62 = 2;
                } else if ((LA62_14 == TOK_NOT)) {
                    int LA62_16 = input.LA(3);

                    if ((synpred7())) {
                        alt62 = 1;
                    } else if ((true)) {
                        alt62 = 2;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("1044:1: atls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_AA | TOK_EE | TOK_LT agent_list TOK_GT | TOK_LB agent_list TOK_RB ) )=> atls_ltl_pure_unary_expr -> ^( PURE_LTL_T atls_ltl_pure_unary_expr ) | atls_relational_expr );", 62, 16, input);

                        throw nvae;
                    }
                } else if ((LA62_14 == TOK_OP_NEXT) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_OP_PREV) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_OP_NOTPREVNOT) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_OP_GLOBALLY) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_OP_HISTORICALLY) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_OP_FINALLY) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_OP_ONCE) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_OP_BFINALLY) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_OP_BGLOBALLY) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_AA) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_EE) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_LT) && (synpred7())) {
                    alt62 = 1;
                } else if ((LA62_14 == TOK_LB) && (synpred7())) {
                    alt62 = 1;
                } else {
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("1044:1: atls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_AA | TOK_EE | TOK_LT agent_list TOK_GT | TOK_LB agent_list TOK_RB ) )=> atls_ltl_pure_unary_expr -> ^( PURE_LTL_T atls_ltl_pure_unary_expr ) | atls_relational_expr );", 62, 14, input);

                    throw nvae;
                }
            } else if ((LA62_0 == TOK_LCB || (LA62_0 >= TOK_PLUS && LA62_0 <= TOK_MINUS) || LA62_0 == TOK_LP || (LA62_0 >= TOK_BOOL && LA62_0 <= TOK_CASE) || (LA62_0 >= TOK_WAREAD && LA62_0 <= TOK_WAWRITE) || LA62_0 == TOK_ATOM || LA62_0 == TOK_NUMBER || LA62_0 == TOK_NUMBER_WORD || (LA62_0 >= TOK_FALSEEXP && LA62_0 <= TOK_TRUEEXP))) {
                alt62 = 2;
            } else {
                if (backtracking > 0) {
                    failed = true;
                    return retval;
                }
                NoViableAltException nvae =
                        new NoViableAltException("1044:1: atls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_AA | TOK_EE | TOK_LT agent_list TOK_GT | TOK_LB agent_list TOK_RB ) )=> atls_ltl_pure_unary_expr -> ^( PURE_LTL_T atls_ltl_pure_unary_expr ) | atls_relational_expr );", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1045:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_AA | TOK_EE | TOK_LT agent_list TOK_GT | TOK_LB agent_list TOK_RB ) )=> atls_ltl_pure_unary_expr
                {
                    pushFollow(FOLLOW_atls_ltl_pure_unary_expr_in_atls_ltl_unary_expr10392);
                    atls_ltl_pure_unary_expr179 = atls_ltl_pure_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_atls_ltl_pure_unary_expr.add(atls_ltl_pure_unary_expr179.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = atls_ltl_pure_unary_expr179.ret;
                    }

                    // AST REWRITE
                    // elements: atls_ltl_pure_unary_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1064:9: -> ^( PURE_LTL_T atls_ltl_pure_unary_expr )
                        {
                            // F:\\StudyAntlr\\SPC.g:1064:12: ^( PURE_LTL_T atls_ltl_pure_unary_expr )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(PURE_LTL_T, "PURE_LTL_T"), root_1);

                                adaptor.addChild(root_1, stream_atls_ltl_pure_unary_expr.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1067:11: atls_relational_expr
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_atls_relational_expr_in_atls_ltl_unary_expr10435);
                    atls_relational_expr180 = atls_relational_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, atls_relational_expr180.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = atls_relational_expr180.ret;
                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_ltl_unary_expr

    public static class atls_ltl_pure_unary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_ltl_pure_unary_expr
    // F:\\StudyAntlr\\SPC.g:1071:1: atls_ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= atls_ltl_unary_expr | op= TOK_OP_PREV f= atls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= atls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= atls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= atls_ltl_unary_expr | op= TOK_OP_FINALLY f= atls_ltl_unary_expr | op= TOK_OP_ONCE f= atls_ltl_unary_expr | op= TOK_OP_BFINALLY r= subrange f= atls_ltl_unary_expr | op= TOK_OP_BGLOBALLY r= subrange f= atls_ltl_unary_expr | op= TOK_AA f= atls_ltl_unary_expr | op= TOK_EE f= atls_ltl_unary_expr | lt= TOK_LT al= agent_list gt= TOK_GT f= atls_ltl_unary_expr | lb= TOK_LB al= agent_list rb= TOK_RB f= atls_ltl_unary_expr | op= TOK_NOT fp= atls_ltl_pure_unary_expr );
    public final atls_ltl_pure_unary_expr_return atls_ltl_pure_unary_expr() throws RecognitionException {
        atls_ltl_pure_unary_expr_return retval = new atls_ltl_pure_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        Token lt = null;
        Token gt = null;
        Token lb = null;
        Token rb = null;
        atls_ltl_unary_expr_return f = null;

        subrange_return r = null;

        agent_list_return al = null;

        atls_ltl_pure_unary_expr_return fp = null;


        Object op_tree = null;
        Object lt_tree = null;
        Object gt_tree = null;
        Object lb_tree = null;
        Object rb_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1074:9: (op= TOK_OP_NEXT f= atls_ltl_unary_expr | op= TOK_OP_PREV f= atls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= atls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= atls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= atls_ltl_unary_expr | op= TOK_OP_FINALLY f= atls_ltl_unary_expr | op= TOK_OP_ONCE f= atls_ltl_unary_expr | op= TOK_OP_BFINALLY r= subrange f= atls_ltl_unary_expr | op= TOK_OP_BGLOBALLY r= subrange f= atls_ltl_unary_expr | op= TOK_AA f= atls_ltl_unary_expr | op= TOK_EE f= atls_ltl_unary_expr | lt= TOK_LT al= agent_list gt= TOK_GT f= atls_ltl_unary_expr | lb= TOK_LB al= agent_list rb= TOK_RB f= atls_ltl_unary_expr | op= TOK_NOT fp= atls_ltl_pure_unary_expr )
            int alt63 = 14;
            switch (input.LA(1)) {
                case TOK_OP_NEXT: {
                    alt63 = 1;
                }
                break;
                case TOK_OP_PREV: {
                    alt63 = 2;
                }
                break;
                case TOK_OP_NOTPREVNOT: {
                    alt63 = 3;
                }
                break;
                case TOK_OP_GLOBALLY: {
                    alt63 = 4;
                }
                break;
                case TOK_OP_HISTORICALLY: {
                    alt63 = 5;
                }
                break;
                case TOK_OP_FINALLY: {
                    alt63 = 6;
                }
                break;
                case TOK_OP_ONCE: {
                    alt63 = 7;
                }
                break;
                case TOK_OP_BFINALLY: {
                    alt63 = 8;
                }
                break;
                case TOK_OP_BGLOBALLY: {
                    alt63 = 9;
                }
                break;
                case TOK_AA: {
                    alt63 = 10;
                }
                break;
                case TOK_EE: {
                    alt63 = 11;
                }
                break;
                case TOK_LT: {
                    alt63 = 12;
                }
                break;
                case TOK_LB: {
                    alt63 = 13;
                }
                break;
                case TOK_NOT: {
                    alt63 = 14;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("1071:1: atls_ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= atls_ltl_unary_expr | op= TOK_OP_PREV f= atls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= atls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= atls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= atls_ltl_unary_expr | op= TOK_OP_FINALLY f= atls_ltl_unary_expr | op= TOK_OP_ONCE f= atls_ltl_unary_expr | op= TOK_OP_BFINALLY r= subrange f= atls_ltl_unary_expr | op= TOK_OP_BGLOBALLY r= subrange f= atls_ltl_unary_expr | op= TOK_AA f= atls_ltl_unary_expr | op= TOK_EE f= atls_ltl_unary_expr | lt= TOK_LT al= agent_list gt= TOK_GT f= atls_ltl_unary_expr | lb= TOK_LB al= agent_list rb= TOK_RB f= atls_ltl_unary_expr | op= TOK_NOT fp= atls_ltl_pure_unary_expr );", 63, 0, input);

                    throw nvae;
            }

            switch (alt63) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1074:11: op= TOK_OP_NEXT f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_NEXT, FOLLOW_TOK_OP_NEXT_in_atls_ltl_pure_unary_expr10494);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10499);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_next(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1076:11: op= TOK_OP_PREV f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_PREV, FOLLOW_TOK_OP_PREV_in_atls_ltl_pure_unary_expr10523);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10528);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_prev(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:1078:11: op= TOK_OP_NOTPREVNOT f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_NOTPREVNOT, FOLLOW_TOK_OP_NOTPREVNOT_in_atls_ltl_pure_unary_expr10552);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10557);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_notprevnot(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 4:
                    // F:\\StudyAntlr\\SPC.g:1080:11: op= TOK_OP_GLOBALLY f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_GLOBALLY, FOLLOW_TOK_OP_GLOBALLY_in_atls_ltl_pure_unary_expr10581);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10586);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_globally(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 5:
                    // F:\\StudyAntlr\\SPC.g:1082:11: op= TOK_OP_HISTORICALLY f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_HISTORICALLY, FOLLOW_TOK_OP_HISTORICALLY_in_atls_ltl_pure_unary_expr10610);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10615);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_historically(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 6:
                    // F:\\StudyAntlr\\SPC.g:1084:11: op= TOK_OP_FINALLY f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_FINALLY, FOLLOW_TOK_OP_FINALLY_in_atls_ltl_pure_unary_expr10639);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10644);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_finally(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 7:
                    // F:\\StudyAntlr\\SPC.g:1086:11: op= TOK_OP_ONCE f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_ONCE, FOLLOW_TOK_OP_ONCE_in_atls_ltl_pure_unary_expr10668);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10673);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_once(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 8:
                    // F:\\StudyAntlr\\SPC.g:1090:11: op= TOK_OP_BFINALLY r= subrange f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_BFINALLY, FOLLOW_TOK_OP_BFINALLY_in_atls_ltl_pure_unary_expr10715);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_atls_ltl_pure_unary_expr10720);
                    r = subrange();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, r.getTree());
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10724);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er())
                            exp_str = op.getText() + " " + input.toString(r.start, r.stop) + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_bfinally(input, ((Token) retval.start), exp_str, r.ret, f.ret);
                    }

                }
                break;
                case 9:
                    // F:\\StudyAntlr\\SPC.g:1092:11: op= TOK_OP_BGLOBALLY r= subrange f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_OP_BGLOBALLY, FOLLOW_TOK_OP_BGLOBALLY_in_atls_ltl_pure_unary_expr10748);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_atls_ltl_pure_unary_expr10753);
                    r = subrange();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, r.getTree());
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10757);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er())
                            exp_str = op.getText() + " " + input.toString(r.start, r.stop) + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_bglobally(input, ((Token) retval.start), exp_str, r.ret, f.ret);
                    }

                }
                break;
                case 10:
                    // F:\\StudyAntlr\\SPC.g:1096:11: op= TOK_AA f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_AA, FOLLOW_TOK_AA_in_atls_ltl_pure_unary_expr10791);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10796);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_allpath(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 11:
                    // F:\\StudyAntlr\\SPC.g:1098:11: op= TOK_EE f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_EE, FOLLOW_TOK_EE_in_atls_ltl_pure_unary_expr10820);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10825);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_somepath(input, ((Token) retval.start), exp_str, f.ret);
                    }

                }
                break;
                case 12:
                    // F:\\StudyAntlr\\SPC.g:1103:11: lt= TOK_LT al= agent_list gt= TOK_GT f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    lt = (Token) input.LT(1);
                    match(input, TOK_LT, FOLLOW_TOK_LT_in_atls_ltl_pure_unary_expr10868);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        lt_tree = (Object) adaptor.create(lt);
                        adaptor.addChild(root_0, lt_tree);
                    }
                    pushFollow(FOLLOW_agent_list_in_atls_ltl_pure_unary_expr10872);
                    al = agent_list();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, al.getTree());
                    gt = (Token) input.LT(1);
                    match(input, TOK_GT, FOLLOW_TOK_GT_in_atls_ltl_pure_unary_expr10876);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        gt_tree = (Object) adaptor.create(gt);
                        adaptor.addChild(root_0, gt_tree);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10880);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er())
                            exp_str = lt.getText() + input.toString(al.start, al.stop) + gt.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_atls_canEnforce(input, ((Token) retval.start), exp_str, al.ret, f.ret);
                    }

                }
                break;
                case 13:
                    // F:\\StudyAntlr\\SPC.g:1107:11: lb= TOK_LB al= agent_list rb= TOK_RB f= atls_ltl_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    lb = (Token) input.LT(1);
                    match(input, TOK_LB, FOLLOW_TOK_LB_in_atls_ltl_pure_unary_expr10914);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        lb_tree = (Object) adaptor.create(lb);
                        adaptor.addChild(root_0, lb_tree);
                    }
                    pushFollow(FOLLOW_agent_list_in_atls_ltl_pure_unary_expr10918);
                    al = agent_list();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, al.getTree());
                    rb = (Token) input.LT(1);
                    match(input, TOK_RB, FOLLOW_TOK_RB_in_atls_ltl_pure_unary_expr10922);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        rb_tree = (Object) adaptor.create(rb);
                        adaptor.addChild(root_0, rb_tree);
                    }
                    pushFollow(FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10926);
                    f = atls_ltl_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                    if (backtracking == 0) {
                        if (!er())
                            exp_str = lb.getText() + input.toString(al.start, al.stop) + rb.getText() + " " + input.toString(f.start, f.stop);
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_atls_cannotAvoid(input, ((Token) retval.start), exp_str, al.ret, f.ret);
                    }

                }
                break;
                case 14:
                    // F:\\StudyAntlr\\SPC.g:1111:11: op= TOK_NOT fp= atls_ltl_pure_unary_expr
                {
                    root_0 = (Object) adaptor.nil();

                    op = (Token) input.LT(1);
                    match(input, TOK_NOT, FOLLOW_TOK_NOT_in_atls_ltl_pure_unary_expr10969);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        op_tree = (Object) adaptor.create(op);
                        root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_atls_ltl_pure_unary_expr_in_atls_ltl_pure_unary_expr10974);
                    fp = atls_ltl_pure_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, fp.getTree());
                    if (backtracking == 0) {
                        if (!er()) exp_str = op.getText() + " " + input.toString(fp.start, fp.stop);
                        if (!er()) append_end = true;
                        if (!er()) retval.ret = InitSpec.mk_not(input, ((Token) retval.start), exp_str, fp.ret);
                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_ltl_pure_unary_expr

    public static class agent_list_return extends ParserRuleReturnScope {
        public WAArrayOfSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start agent_list
    // F:\\StudyAntlr\\SPC.g:1190:1: agent_list returns [WAArrayOfSpec ret] : ( | a1= agent_name ( TOK_COMMA a2= agent_name )* );
    public final agent_list_return agent_list() throws RecognitionException {
        agent_list_return retval = new agent_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA181 = null;
        agent_name_return a1 = null;

        agent_name_return a2 = null;


        Object TOK_COMMA181_tree = null;

        retval.ret = new WAArrayOfSpec();
        try {
            // F:\\StudyAntlr\\SPC.g:1192:2: ( | a1= agent_name ( TOK_COMMA a2= agent_name )* )
            int alt65 = 2;
            int LA65_0 = input.LA(1);

            if ((LA65_0 == TOK_GT || LA65_0 == TOK_RB)) {
                alt65 = 1;
            } else if ((LA65_0 == TOK_ATOM)) {
                alt65 = 2;
            } else {
                if (backtracking > 0) {
                    failed = true;
                    return retval;
                }
                NoViableAltException nvae =
                        new NoViableAltException("1190:1: agent_list returns [WAArrayOfSpec ret] : ( | a1= agent_name ( TOK_COMMA a2= agent_name )* );", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1194:2:
                {
                    root_0 = (Object) adaptor.nil();

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1194:4: a1= agent_name ( TOK_COMMA a2= agent_name )*
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_agent_name_in_agent_list11020);
                    a1 = agent_name();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, a1.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret.specs.add(a1.ret);
                        else retval.ret.specs.add(null);
                        in_my_recovery_mode = false;
                    }
                    // F:\\StudyAntlr\\SPC.g:1195:2: ( TOK_COMMA a2= agent_name )*
                    loop64:
                    do {
                        int alt64 = 2;
                        int LA64_0 = input.LA(1);

                        if ((LA64_0 == TOK_COMMA)) {
                            alt64 = 1;
                        }


                        switch (alt64) {
                            case 1:
                                // F:\\StudyAntlr\\SPC.g:1195:3: TOK_COMMA a2= agent_name
                            {
                                TOK_COMMA181 = (Token) input.LT(1);
                                match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_agent_list11026);
                                if (failed) return retval;
                                pushFollow(FOLLOW_agent_name_in_agent_list11031);
                                a2 = agent_name();
                                _fsp--;
                                if (failed) return retval;
                                if (backtracking == 0) adaptor.addChild(root_0, a2.getTree());
                                if (backtracking == 0) {
                                    if (!er()) retval.ret.specs.add(a2.ret);
                                    else retval.ret.specs.add(null);
                                    in_my_recovery_mode = false;
                                }

                            }
                            break;

                            default:
                                break loop64;
                        }
                    } while (true);


                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end agent_list

    public static class atls_relational_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_relational_expr
    // F:\\StudyAntlr\\SPC.g:1199:1: atls_relational_expr returns [InternalSpec ret] : f= atls_in_expr (op= TOK_EQUAL s= atls_in_expr | op= TOK_NOTEQUAL s= atls_in_expr | op= TOK_LT s= atls_in_expr | op= TOK_GT s= atls_in_expr | op= TOK_LE s= atls_in_expr | op= TOK_GE s= atls_in_expr )* ;
    public final atls_relational_expr_return atls_relational_expr() throws RecognitionException {
        atls_relational_expr_return retval = new atls_relational_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_in_expr_return f = null;

        atls_in_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1202:9: (f= atls_in_expr (op= TOK_EQUAL s= atls_in_expr | op= TOK_NOTEQUAL s= atls_in_expr | op= TOK_LT s= atls_in_expr | op= TOK_GT s= atls_in_expr | op= TOK_LE s= atls_in_expr | op= TOK_GE s= atls_in_expr )* )
            // F:\\StudyAntlr\\SPC.g:1202:11: f= atls_in_expr (op= TOK_EQUAL s= atls_in_expr | op= TOK_NOTEQUAL s= atls_in_expr | op= TOK_LT s= atls_in_expr | op= TOK_GT s= atls_in_expr | op= TOK_LE s= atls_in_expr | op= TOK_GE s= atls_in_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_in_expr_in_atls_relational_expr11071);
                f = atls_in_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:1203:9: (op= TOK_EQUAL s= atls_in_expr | op= TOK_NOTEQUAL s= atls_in_expr | op= TOK_LT s= atls_in_expr | op= TOK_GT s= atls_in_expr | op= TOK_LE s= atls_in_expr | op= TOK_GE s= atls_in_expr )*
                loop66:
                do {
                    int alt66 = 7;
                    switch (input.LA(1)) {
                        case TOK_EQUAL: {
                            alt66 = 1;
                        }
                        break;
                        case TOK_NOTEQUAL: {
                            alt66 = 2;
                        }
                        break;
                        case TOK_LT: {
                            alt66 = 3;
                        }
                        break;
                        case TOK_GT: {
                            alt66 = 4;
                        }
                        break;
                        case TOK_LE: {
                            alt66 = 5;
                        }
                        break;
                        case TOK_GE: {
                            alt66 = 6;
                        }
                        break;

                    }

                    switch (alt66) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1203:11: op= TOK_EQUAL s= atls_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_EQUAL, FOLLOW_TOK_EQUAL_in_atls_relational_expr11087);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_in_expr_in_atls_relational_expr11092);
                            s = atls_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_eq(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:1205:11: op= TOK_NOTEQUAL s= atls_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_NOTEQUAL, FOLLOW_TOK_NOTEQUAL_in_atls_relational_expr11117);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_in_expr_in_atls_relational_expr11122);
                            s = atls_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_neq(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 3:
                            // F:\\StudyAntlr\\SPC.g:1207:11: op= TOK_LT s= atls_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LT, FOLLOW_TOK_LT_in_atls_relational_expr11147);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_in_expr_in_atls_relational_expr11152);
                            s = atls_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_lt(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 4:
                            // F:\\StudyAntlr\\SPC.g:1209:11: op= TOK_GT s= atls_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_GT, FOLLOW_TOK_GT_in_atls_relational_expr11177);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_in_expr_in_atls_relational_expr11182);
                            s = atls_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_gt(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 5:
                            // F:\\StudyAntlr\\SPC.g:1211:11: op= TOK_LE s= atls_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LE, FOLLOW_TOK_LE_in_atls_relational_expr11207);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_in_expr_in_atls_relational_expr11212);
                            s = atls_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_le(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 6:
                            // F:\\StudyAntlr\\SPC.g:1213:11: op= TOK_GE s= atls_in_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_GE, FOLLOW_TOK_GE_in_atls_relational_expr11237);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_in_expr_in_atls_relational_expr11242);
                            s = atls_in_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_ge(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop66;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_relational_expr

    public static class atls_in_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_in_expr
    // F:\\StudyAntlr\\SPC.g:1217:1: atls_in_expr returns [InternalSpec ret] : f= atls_union_expr (op= TOK_SETIN s= atls_union_expr )* ;
    public final atls_in_expr_return atls_in_expr() throws RecognitionException {
        atls_in_expr_return retval = new atls_in_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_union_expr_return f = null;

        atls_union_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1220:9: (f= atls_union_expr (op= TOK_SETIN s= atls_union_expr )* )
            // F:\\StudyAntlr\\SPC.g:1220:11: f= atls_union_expr (op= TOK_SETIN s= atls_union_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_union_expr_in_atls_in_expr11305);
                f = atls_union_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:1221:9: (op= TOK_SETIN s= atls_union_expr )*
                loop67:
                do {
                    int alt67 = 2;
                    int LA67_0 = input.LA(1);

                    if ((LA67_0 == TOK_SETIN)) {
                        alt67 = 1;
                    }


                    switch (alt67) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1221:11: op= TOK_SETIN s= atls_union_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_SETIN, FOLLOW_TOK_SETIN_in_atls_in_expr11321);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_union_expr_in_atls_in_expr11326);
                            s = atls_union_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_setin(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop67;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_in_expr

    public static class atls_union_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_union_expr
    // F:\\StudyAntlr\\SPC.g:1225:1: atls_union_expr returns [InternalSpec ret] : f= atls_set_expr (op= TOK_UNION s= atls_set_expr )* ;
    public final atls_union_expr_return atls_union_expr() throws RecognitionException {
        atls_union_expr_return retval = new atls_union_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_set_expr_return f = null;

        atls_set_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1228:9: (f= atls_set_expr (op= TOK_UNION s= atls_set_expr )* )
            // F:\\StudyAntlr\\SPC.g:1228:11: f= atls_set_expr (op= TOK_UNION s= atls_set_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_set_expr_in_atls_union_expr11389);
                f = atls_set_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:1229:9: (op= TOK_UNION s= atls_set_expr )*
                loop68:
                do {
                    int alt68 = 2;
                    int LA68_0 = input.LA(1);

                    if ((LA68_0 == TOK_UNION)) {
                        alt68 = 1;
                    }


                    switch (alt68) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1229:11: op= TOK_UNION s= atls_set_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_UNION, FOLLOW_TOK_UNION_in_atls_union_expr11405);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_set_expr_in_atls_union_expr11410);
                            s = atls_set_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_union(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop68;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_union_expr

    public static class atls_set_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_set_expr
    // F:\\StudyAntlr\\SPC.g:1234:1: atls_set_expr returns [InternalSpec ret] : ( atls_shift_expr | subrange | TOK_LCB atls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T atls_set_list_expr ) );
    public final atls_set_expr_return atls_set_expr() throws RecognitionException {
        atls_set_expr_return retval = new atls_set_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LCB184 = null;
        Token TOK_RCB186 = null;
        atls_shift_expr_return atls_shift_expr182 = null;

        subrange_return subrange183 = null;

        atls_set_list_expr_return atls_set_list_expr185 = null;


        Object TOK_LCB184_tree = null;
        Object TOK_RCB186_tree = null;
        RewriteRuleTokenStream stream_TOK_RCB = new RewriteRuleTokenStream(adaptor, "token TOK_RCB");
        RewriteRuleTokenStream stream_TOK_LCB = new RewriteRuleTokenStream(adaptor, "token TOK_LCB");
        RewriteRuleSubtreeStream stream_atls_set_list_expr = new RewriteRuleSubtreeStream(adaptor, "rule atls_set_list_expr");
        boolean append_end = false;
        try {
            // F:\\StudyAntlr\\SPC.g:1237:9: ( atls_shift_expr | subrange | TOK_LCB atls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T atls_set_list_expr ) )
            int alt69 = 3;
            switch (input.LA(1)) {
                case TOK_NOT:
                case TOK_LP:
                case TOK_BOOL:
                case TOK_WORD1:
                case TOK_NEXT:
                case TOK_CASE:
                case TOK_WAREAD:
                case TOK_WAWRITE:
                case TOK_ATOM:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt69 = 1;
                }
                break;
                case TOK_NUMBER: {
                    int LA69_2 = input.LA(2);

                    if ((LA69_2 == EOF || (LA69_2 >= TOK_INVAR_SPEC && LA69_2 <= TOK_UNION) || (LA69_2 >= TOK_LSHIFT && LA69_2 <= TOK_CONCATENATION) || LA69_2 == TOK_RP || (LA69_2 >= TOK_LB && LA69_2 <= TOK_UNTIL) || (LA69_2 >= TOK_BUNTIL && LA69_2 <= TOK_SKNOW) || (LA69_2 >= TOK_SINCE && LA69_2 <= TOK_TRIGGERED) || LA69_2 == TOK_BRELEASE || LA69_2 == TOK_DOT || LA69_2 == TOK_SEMI)) {
                        alt69 = 1;
                    } else if ((LA69_2 == TOK_TWODOTS)) {
                        alt69 = 2;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("1234:1: atls_set_expr returns [InternalSpec ret] : ( atls_shift_expr | subrange | TOK_LCB atls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T atls_set_list_expr ) );", 69, 2, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_PLUS: {
                    int LA69_3 = input.LA(2);

                    if ((LA69_3 == TOK_NUMBER)) {
                        int LA69_7 = input.LA(3);

                        if ((LA69_7 == TOK_TWODOTS)) {
                            alt69 = 2;
                        } else if ((LA69_7 == EOF || (LA69_7 >= TOK_INVAR_SPEC && LA69_7 <= TOK_UNION) || (LA69_7 >= TOK_LSHIFT && LA69_7 <= TOK_CONCATENATION) || LA69_7 == TOK_RP || (LA69_7 >= TOK_LB && LA69_7 <= TOK_UNTIL) || (LA69_7 >= TOK_BUNTIL && LA69_7 <= TOK_SKNOW) || (LA69_7 >= TOK_SINCE && LA69_7 <= TOK_TRIGGERED) || LA69_7 == TOK_BRELEASE || LA69_7 == TOK_DOT || LA69_7 == TOK_SEMI)) {
                            alt69 = 1;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1234:1: atls_set_expr returns [InternalSpec ret] : ( atls_shift_expr | subrange | TOK_LCB atls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T atls_set_list_expr ) );", 69, 7, input);

                            throw nvae;
                        }
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("1234:1: atls_set_expr returns [InternalSpec ret] : ( atls_shift_expr | subrange | TOK_LCB atls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T atls_set_list_expr ) );", 69, 3, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_MINUS: {
                    int LA69_4 = input.LA(2);

                    if ((LA69_4 == TOK_NUMBER)) {
                        int LA69_8 = input.LA(3);

                        if ((LA69_8 == EOF || (LA69_8 >= TOK_INVAR_SPEC && LA69_8 <= TOK_UNION) || (LA69_8 >= TOK_LSHIFT && LA69_8 <= TOK_CONCATENATION) || LA69_8 == TOK_RP || (LA69_8 >= TOK_LB && LA69_8 <= TOK_UNTIL) || (LA69_8 >= TOK_BUNTIL && LA69_8 <= TOK_SKNOW) || (LA69_8 >= TOK_SINCE && LA69_8 <= TOK_TRIGGERED) || LA69_8 == TOK_BRELEASE || LA69_8 == TOK_DOT || LA69_8 == TOK_SEMI)) {
                            alt69 = 1;
                        } else if ((LA69_8 == TOK_TWODOTS)) {
                            alt69 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1234:1: atls_set_expr returns [InternalSpec ret] : ( atls_shift_expr | subrange | TOK_LCB atls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T atls_set_list_expr ) );", 69, 8, input);

                            throw nvae;
                        }
                    } else if (((LA69_4 >= TOK_PLUS && LA69_4 <= TOK_MINUS) || (LA69_4 >= TOK_NOT && LA69_4 <= TOK_LP) || (LA69_4 >= TOK_BOOL && LA69_4 <= TOK_CASE) || (LA69_4 >= TOK_WAREAD && LA69_4 <= TOK_WAWRITE) || LA69_4 == TOK_ATOM || LA69_4 == TOK_NUMBER_WORD || (LA69_4 >= TOK_FALSEEXP && LA69_4 <= TOK_TRUEEXP))) {
                        alt69 = 1;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("1234:1: atls_set_expr returns [InternalSpec ret] : ( atls_shift_expr | subrange | TOK_LCB atls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T atls_set_list_expr ) );", 69, 4, input);

                        throw nvae;
                    }
                }
                break;
                case TOK_LCB: {
                    alt69 = 3;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("1234:1: atls_set_expr returns [InternalSpec ret] : ( atls_shift_expr | subrange | TOK_LCB atls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T atls_set_list_expr ) );", 69, 0, input);

                    throw nvae;
            }

            switch (alt69) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1237:11: atls_shift_expr
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_atls_shift_expr_in_atls_set_expr11472);
                    atls_shift_expr182 = atls_shift_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, atls_shift_expr182.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = atls_shift_expr182.ret;
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1239:11: subrange
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_atls_set_expr11494);
                    subrange183 = subrange();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, subrange183.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_range(input, ((Token) retval.start), input.toString(subrange183.start, subrange183.stop));
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:1241:11: TOK_LCB atls_set_list_expr TOK_RCB
                {
                    TOK_LCB184 = (Token) input.LT(1);
                    match(input, TOK_LCB, FOLLOW_TOK_LCB_in_atls_set_expr11517);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LCB.add(TOK_LCB184);

                    pushFollow(FOLLOW_atls_set_list_expr_in_atls_set_expr11519);
                    atls_set_list_expr185 = atls_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_atls_set_list_expr.add(atls_set_list_expr185.getTree());
                    TOK_RCB186 = (Token) input.LT(1);
                    match(input, TOK_RCB, FOLLOW_TOK_RCB_in_atls_set_expr11521);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RCB.add(TOK_RCB186);

                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_set(input, ((Token) retval.start), TOK_LCB184.getText() + " " + input.toString(atls_set_list_expr185.start, atls_set_list_expr185.stop) + " " + TOK_RCB186.getText());
                    }

                    // AST REWRITE
                    // elements: atls_set_list_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1243:9: -> ^( SET_LIST_EXP_T atls_set_list_expr )
                        {
                            // F:\\StudyAntlr\\SPC.g:1243:12: ^( SET_LIST_EXP_T atls_set_list_expr )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(SET_LIST_EXP_T, "SET_LIST_EXP_T"), root_1);

                                adaptor.addChild(root_1, stream_atls_set_list_expr.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_set_expr

    public static class atls_set_list_expr_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_set_list_expr
    // F:\\StudyAntlr\\SPC.g:1245:1: atls_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final atls_set_list_expr_return atls_set_list_expr() throws RecognitionException {
        atls_set_list_expr_return retval = new atls_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA188 = null;
        simple_root_expr_return simple_root_expr187 = null;

        simple_root_expr_return simple_root_expr189 = null;


        Object TOK_COMMA188_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:1246:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // F:\\StudyAntlr\\SPC.g:1246:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_simple_root_expr_in_atls_set_list_expr11574);
                simple_root_expr187 = simple_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, simple_root_expr187.getTree());
                // F:\\StudyAntlr\\SPC.g:1246:28: ( TOK_COMMA simple_root_expr )*
                loop70:
                do {
                    int alt70 = 2;
                    int LA70_0 = input.LA(1);

                    if ((LA70_0 == TOK_COMMA)) {
                        alt70 = 1;
                    }


                    switch (alt70) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1246:29: TOK_COMMA simple_root_expr
                        {
                            TOK_COMMA188 = (Token) input.LT(1);
                            match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_atls_set_list_expr11577);
                            if (failed) return retval;
                            pushFollow(FOLLOW_simple_root_expr_in_atls_set_list_expr11580);
                            simple_root_expr189 = simple_root_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, simple_root_expr189.getTree());

                        }
                        break;

                        default:
                            break loop70;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_set_list_expr

    public static class atls_shift_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_shift_expr
    // F:\\StudyAntlr\\SPC.g:1248:1: atls_shift_expr returns [InternalSpec ret] : f= atls_remainder_expr (op= TOK_LSHIFT s= atls_remainder_expr | op= TOK_RSHIFT s= atls_remainder_expr )* ;
    public final atls_shift_expr_return atls_shift_expr() throws RecognitionException {
        atls_shift_expr_return retval = new atls_shift_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_remainder_expr_return f = null;

        atls_remainder_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1251:9: (f= atls_remainder_expr (op= TOK_LSHIFT s= atls_remainder_expr | op= TOK_RSHIFT s= atls_remainder_expr )* )
            // F:\\StudyAntlr\\SPC.g:1251:11: f= atls_remainder_expr (op= TOK_LSHIFT s= atls_remainder_expr | op= TOK_RSHIFT s= atls_remainder_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_remainder_expr_in_atls_shift_expr11626);
                f = atls_remainder_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:1252:9: (op= TOK_LSHIFT s= atls_remainder_expr | op= TOK_RSHIFT s= atls_remainder_expr )*
                loop71:
                do {
                    int alt71 = 3;
                    int LA71_0 = input.LA(1);

                    if ((LA71_0 == TOK_LSHIFT)) {
                        alt71 = 1;
                    } else if ((LA71_0 == TOK_RSHIFT)) {
                        alt71 = 2;
                    }


                    switch (alt71) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1252:11: op= TOK_LSHIFT s= atls_remainder_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_LSHIFT, FOLLOW_TOK_LSHIFT_in_atls_shift_expr11642);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_remainder_expr_in_atls_shift_expr11647);
                            s = atls_remainder_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_lshift(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:1254:11: op= TOK_RSHIFT s= atls_remainder_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_RSHIFT, FOLLOW_TOK_RSHIFT_in_atls_shift_expr11671);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_remainder_expr_in_atls_shift_expr11676);
                            s = atls_remainder_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_rshift(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop71;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_shift_expr

    public static class atls_remainder_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_remainder_expr
    // F:\\StudyAntlr\\SPC.g:1258:1: atls_remainder_expr returns [InternalSpec ret] : f= atls_additive_expr (op= TOK_MOD s= atls_additive_expr )* ;
    public final atls_remainder_expr_return atls_remainder_expr() throws RecognitionException {
        atls_remainder_expr_return retval = new atls_remainder_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_additive_expr_return f = null;

        atls_additive_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1261:9: (f= atls_additive_expr (op= TOK_MOD s= atls_additive_expr )* )
            // F:\\StudyAntlr\\SPC.g:1261:11: f= atls_additive_expr (op= TOK_MOD s= atls_additive_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_additive_expr_in_atls_remainder_expr11738);
                f = atls_additive_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:1262:9: (op= TOK_MOD s= atls_additive_expr )*
                loop72:
                do {
                    int alt72 = 2;
                    int LA72_0 = input.LA(1);

                    if ((LA72_0 == TOK_MOD)) {
                        alt72 = 1;
                    }


                    switch (alt72) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1262:11: op= TOK_MOD s= atls_additive_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_MOD, FOLLOW_TOK_MOD_in_atls_remainder_expr11754);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_additive_expr_in_atls_remainder_expr11759);
                            s = atls_additive_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_mod(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop72;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_remainder_expr

    public static class atls_additive_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_additive_expr
    // F:\\StudyAntlr\\SPC.g:1269:1: atls_additive_expr returns [InternalSpec ret] : f= atls_multiplicative_expr (op= TOK_PLUS s= atls_multiplicative_expr | op= TOK_MINUS s= atls_multiplicative_expr )* ;
    public final atls_additive_expr_return atls_additive_expr() throws RecognitionException {
        atls_additive_expr_return retval = new atls_additive_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_multiplicative_expr_return f = null;

        atls_multiplicative_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1272:9: (f= atls_multiplicative_expr (op= TOK_PLUS s= atls_multiplicative_expr | op= TOK_MINUS s= atls_multiplicative_expr )* )
            // F:\\StudyAntlr\\SPC.g:1272:11: f= atls_multiplicative_expr (op= TOK_PLUS s= atls_multiplicative_expr | op= TOK_MINUS s= atls_multiplicative_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_multiplicative_expr_in_atls_additive_expr11824);
                f = atls_multiplicative_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:1273:9: (op= TOK_PLUS s= atls_multiplicative_expr | op= TOK_MINUS s= atls_multiplicative_expr )*
                loop73:
                do {
                    int alt73 = 3;
                    int LA73_0 = input.LA(1);

                    if ((LA73_0 == TOK_PLUS)) {
                        alt73 = 1;
                    } else if ((LA73_0 == TOK_MINUS)) {
                        alt73 = 2;
                    }


                    switch (alt73) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1273:11: op= TOK_PLUS s= atls_multiplicative_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_PLUS, FOLLOW_TOK_PLUS_in_atls_additive_expr11840);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_multiplicative_expr_in_atls_additive_expr11845);
                            s = atls_multiplicative_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_plus(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:1275:11: op= TOK_MINUS s= atls_multiplicative_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_MINUS, FOLLOW_TOK_MINUS_in_atls_additive_expr11869);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_multiplicative_expr_in_atls_additive_expr11874);
                            s = atls_multiplicative_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_minus(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop73;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_additive_expr

    public static class atls_multiplicative_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_multiplicative_expr
    // F:\\StudyAntlr\\SPC.g:1279:1: atls_multiplicative_expr returns [InternalSpec ret] : f= atls_concatination_expr (op= TOK_TIMES s= atls_concatination_expr | op= TOK_DIVIDE s= atls_concatination_expr )* ;
    public final atls_multiplicative_expr_return atls_multiplicative_expr() throws RecognitionException {
        atls_multiplicative_expr_return retval = new atls_multiplicative_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_concatination_expr_return f = null;

        atls_concatination_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1282:9: (f= atls_concatination_expr (op= TOK_TIMES s= atls_concatination_expr | op= TOK_DIVIDE s= atls_concatination_expr )* )
            // F:\\StudyAntlr\\SPC.g:1282:11: f= atls_concatination_expr (op= TOK_TIMES s= atls_concatination_expr | op= TOK_DIVIDE s= atls_concatination_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_concatination_expr_in_atls_multiplicative_expr11934);
                f = atls_concatination_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:1283:9: (op= TOK_TIMES s= atls_concatination_expr | op= TOK_DIVIDE s= atls_concatination_expr )*
                loop74:
                do {
                    int alt74 = 3;
                    int LA74_0 = input.LA(1);

                    if ((LA74_0 == TOK_TIMES)) {
                        alt74 = 1;
                    } else if ((LA74_0 == TOK_DIVIDE)) {
                        alt74 = 2;
                    }


                    switch (alt74) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1283:11: op= TOK_TIMES s= atls_concatination_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_TIMES, FOLLOW_TOK_TIMES_in_atls_multiplicative_expr11950);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_concatination_expr_in_atls_multiplicative_expr11955);
                            s = atls_concatination_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_times(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:1285:11: op= TOK_DIVIDE s= atls_concatination_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_DIVIDE, FOLLOW_TOK_DIVIDE_in_atls_multiplicative_expr11979);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_concatination_expr_in_atls_multiplicative_expr11984);
                            s = atls_concatination_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_divide(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop74;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_multiplicative_expr

    public static class atls_concatination_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_concatination_expr
    // F:\\StudyAntlr\\SPC.g:1289:1: atls_concatination_expr returns [InternalSpec ret] : f= atls_primary_expr (op= TOK_CONCATENATION s= atls_primary_expr )* ;
    public final atls_concatination_expr_return atls_concatination_expr() throws RecognitionException {
        atls_concatination_expr_return retval = new atls_concatination_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_primary_expr_return f = null;

        atls_primary_expr_return s = null;


        Object op_tree = null;

        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1292:9: (f= atls_primary_expr (op= TOK_CONCATENATION s= atls_primary_expr )* )
            // F:\\StudyAntlr\\SPC.g:1292:11: f= atls_primary_expr (op= TOK_CONCATENATION s= atls_primary_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_atls_primary_expr_in_atls_concatination_expr12045);
                f = atls_primary_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, f.getTree());
                if (backtracking == 0) {
                    if (!er()) exp_str += input.toString(f.start, f.stop);
                    if (!er()) retval.ret = f.ret;
                }
                // F:\\StudyAntlr\\SPC.g:1293:9: (op= TOK_CONCATENATION s= atls_primary_expr )*
                loop75:
                do {
                    int alt75 = 2;
                    int LA75_0 = input.LA(1);

                    if ((LA75_0 == TOK_CONCATENATION)) {
                        alt75 = 1;
                    }


                    switch (alt75) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1293:11: op= TOK_CONCATENATION s= atls_primary_expr
                        {
                            op = (Token) input.LT(1);
                            match(input, TOK_CONCATENATION, FOLLOW_TOK_CONCATENATION_in_atls_concatination_expr12061);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                op_tree = (Object) adaptor.create(op);
                                root_0 = (Object) adaptor.becomeRoot(op_tree, root_0);
                            }
                            pushFollow(FOLLOW_atls_primary_expr_in_atls_concatination_expr12066);
                            s = atls_primary_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, s.getTree());
                            if (backtracking == 0) {
                                if (!er()) exp_str += op.getText() + input.toString(s.start, s.stop);
                                if (!er()) append_end = true;
                                if (!er())
                                    retval.ret = InitSpec.mk_concatenation(input, ((Token) retval.start), exp_str, retval.ret, s.ret);
                            }

                        }
                        break;

                        default:
                            break loop75;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_concatination_expr

    public static class atls_primary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_primary_expr
    // F:\\StudyAntlr\\SPC.g:1298:1: atls_primary_expr returns [InternalSpec ret] : ( atls_primary_expr_helper1 | op= TOK_MINUS v= atls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= atls_primary_expr -> ^( TOK_NOT $v) );
    public final atls_primary_expr_return atls_primary_expr() throws RecognitionException {
        atls_primary_expr_return retval = new atls_primary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op = null;
        atls_primary_expr_return v = null;

        atls_primary_expr_helper1_return atls_primary_expr_helper1190 = null;


        Object op_tree = null;
        RewriteRuleTokenStream stream_TOK_MINUS = new RewriteRuleTokenStream(adaptor, "token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NOT = new RewriteRuleTokenStream(adaptor, "token TOK_NOT");
        RewriteRuleSubtreeStream stream_atls_primary_expr = new RewriteRuleSubtreeStream(adaptor, "rule atls_primary_expr");
        boolean append_end = false;
        try {
            // F:\\StudyAntlr\\SPC.g:1301:9: ( atls_primary_expr_helper1 | op= TOK_MINUS v= atls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= atls_primary_expr -> ^( TOK_NOT $v) )
            int alt76 = 3;
            switch (input.LA(1)) {
                case TOK_PLUS:
                case TOK_LP:
                case TOK_BOOL:
                case TOK_WORD1:
                case TOK_NEXT:
                case TOK_CASE:
                case TOK_WAREAD:
                case TOK_WAWRITE:
                case TOK_ATOM:
                case TOK_NUMBER:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt76 = 1;
                }
                break;
                case TOK_MINUS: {
                    alt76 = 2;
                }
                break;
                case TOK_NOT: {
                    alt76 = 3;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("1298:1: atls_primary_expr returns [InternalSpec ret] : ( atls_primary_expr_helper1 | op= TOK_MINUS v= atls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= atls_primary_expr -> ^( TOK_NOT $v) );", 76, 0, input);

                    throw nvae;
            }

            switch (alt76) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1301:11: atls_primary_expr_helper1
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_atls_primary_expr_helper1_in_atls_primary_expr12135);
                    atls_primary_expr_helper1190 = atls_primary_expr_helper1();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, atls_primary_expr_helper1190.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = atls_primary_expr_helper1190.ret;
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1303:11: op= TOK_MINUS v= atls_primary_expr
                {
                    op = (Token) input.LT(1);
                    match(input, TOK_MINUS, FOLLOW_TOK_MINUS_in_atls_primary_expr12159);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_atls_primary_expr_in_atls_primary_expr12163);
                    v = atls_primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_atls_primary_expr.add(v.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_unary_minus(input, ((Token) retval.start), op.getText() + " " + input.toString(v.start, v.stop), v.ret);
                    }

                    // AST REWRITE
                    // elements: v
                    // token labels:
                    // rule labels: v, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_v = new RewriteRuleSubtreeStream(adaptor, "token v", v != null ? v.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1305:9: -> ^( TOK_UNARY_MINUS_T $v)
                        {
                            // F:\\StudyAntlr\\SPC.g:1305:12: ^( TOK_UNARY_MINUS_T $v)
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(TOK_UNARY_MINUS_T, "TOK_UNARY_MINUS_T"), root_1);

                                adaptor.addChild(root_1, stream_v.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:1306:11: op= TOK_NOT v= atls_primary_expr
                {
                    op = (Token) input.LT(1);
                    match(input, TOK_NOT, FOLLOW_TOK_NOT_in_atls_primary_expr12204);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_atls_primary_expr_in_atls_primary_expr12208);
                    v = atls_primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_atls_primary_expr.add(v.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_not(input, ((Token) retval.start), op.getText() + " " + input.toString(v.start, v.stop), v.ret);
                    }

                    // AST REWRITE
                    // elements: v, TOK_NOT
                    // token labels:
                    // rule labels: v, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_v = new RewriteRuleSubtreeStream(adaptor, "token v", v != null ? v.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1308:9: -> ^( TOK_NOT $v)
                        {
                            // F:\\StudyAntlr\\SPC.g:1308:12: ^( TOK_NOT $v)
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_NOT.next(), root_1);

                                adaptor.addChild(root_1, stream_v.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_primary_expr

    public static class atls_primary_expr_helper1_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start atls_primary_expr_helper1
    // F:\\StudyAntlr\\SPC.g:1311:1: atls_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP atls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T atls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final atls_primary_expr_helper1_return atls_primary_expr_helper1() throws RecognitionException {
        atls_primary_expr_helper1_return retval = new atls_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1 = null;
        Token tc2 = null;
        Token TOK_LP194 = null;
        Token TOK_RP196 = null;
        Token TOK_BOOL198 = null;
        Token TOK_LP199 = null;
        Token TOK_RP201 = null;
        Token TOK_WORD1203 = null;
        Token TOK_LP204 = null;
        Token TOK_RP206 = null;
        Token TOK_NEXT208 = null;
        Token TOK_LP209 = null;
        Token TOK_RP211 = null;
        Token TOK_CASE213 = null;
        Token TOK_ESAC215 = null;
        Token TOK_WAREAD217 = null;
        Token TOK_LP218 = null;
        Token TOK_COMMA219 = null;
        Token TOK_RP220 = null;
        Token TOK_WAWRITE222 = null;
        Token TOK_LP223 = null;
        Token TOK_RP224 = null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant191 = null;

        primary_expr_select_return primary_expr_select192 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1193 = null;

        atls_root_expr_return atls_root_expr195 = null;

        primary_expr_select_return primary_expr_select197 = null;

        simple_root_expr_return simple_root_expr200 = null;

        primary_expr_select_return primary_expr_select202 = null;

        simple_root_expr_return simple_root_expr205 = null;

        primary_expr_select_return primary_expr_select207 = null;

        simple_root_expr_return simple_root_expr210 = null;

        primary_expr_select_return primary_expr_select212 = null;

        case_element_list_expr_return case_element_list_expr214 = null;

        primary_expr_select_return primary_expr_select216 = null;

        primary_expr_select_return primary_expr_select221 = null;

        primary_expr_select_return primary_expr_select225 = null;


        Object tc1_tree = null;
        Object tc2_tree = null;
        Object TOK_LP194_tree = null;
        Object TOK_RP196_tree = null;
        Object TOK_BOOL198_tree = null;
        Object TOK_LP199_tree = null;
        Object TOK_RP201_tree = null;
        Object TOK_WORD1203_tree = null;
        Object TOK_LP204_tree = null;
        Object TOK_RP206_tree = null;
        Object TOK_NEXT208_tree = null;
        Object TOK_LP209_tree = null;
        Object TOK_RP211_tree = null;
        Object TOK_CASE213_tree = null;
        Object TOK_ESAC215_tree = null;
        Object TOK_WAREAD217_tree = null;
        Object TOK_LP218_tree = null;
        Object TOK_COMMA219_tree = null;
        Object TOK_RP220_tree = null;
        Object TOK_WAWRITE222_tree = null;
        Object TOK_LP223_tree = null;
        Object TOK_RP224_tree = null;
        RewriteRuleTokenStream stream_TOK_LP = new RewriteRuleTokenStream(adaptor, "token TOK_LP");
        RewriteRuleTokenStream stream_TOK_WAREAD = new RewriteRuleTokenStream(adaptor, "token TOK_WAREAD");
        RewriteRuleTokenStream stream_TOK_COMMA = new RewriteRuleTokenStream(adaptor, "token TOK_COMMA");
        RewriteRuleTokenStream stream_TOK_WORD1 = new RewriteRuleTokenStream(adaptor, "token TOK_WORD1");
        RewriteRuleTokenStream stream_TOK_ESAC = new RewriteRuleTokenStream(adaptor, "token TOK_ESAC");
        RewriteRuleTokenStream stream_TOK_NEXT = new RewriteRuleTokenStream(adaptor, "token TOK_NEXT");
        RewriteRuleTokenStream stream_TOK_CASE = new RewriteRuleTokenStream(adaptor, "token TOK_CASE");
        RewriteRuleTokenStream stream_TOK_WAWRITE = new RewriteRuleTokenStream(adaptor, "token TOK_WAWRITE");
        RewriteRuleTokenStream stream_TOK_BOOL = new RewriteRuleTokenStream(adaptor, "token TOK_BOOL");
        RewriteRuleTokenStream stream_TOK_RP = new RewriteRuleTokenStream(adaptor, "token TOK_RP");
        RewriteRuleSubtreeStream stream_case_element_list_expr = new RewriteRuleSubtreeStream(adaptor, "rule case_element_list_expr");
        RewriteRuleSubtreeStream stream_constant = new RewriteRuleSubtreeStream(adaptor, "rule constant");
        RewriteRuleSubtreeStream stream_simple_root_expr = new RewriteRuleSubtreeStream(adaptor, "rule simple_root_expr");
        RewriteRuleSubtreeStream stream_primary_expr_select = new RewriteRuleSubtreeStream(adaptor, "rule primary_expr_select");
        RewriteRuleSubtreeStream stream_atls_root_expr = new RewriteRuleSubtreeStream(adaptor, "rule atls_root_expr");
        boolean append_end = false;
        String exp_str = "";
        try {
            // F:\\StudyAntlr\\SPC.g:1314:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP atls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T atls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
            int alt77 = 9;
            switch (input.LA(1)) {
                case TOK_PLUS:
                case TOK_NUMBER:
                case TOK_NUMBER_WORD:
                case TOK_FALSEEXP:
                case TOK_TRUEEXP: {
                    alt77 = 1;
                }
                break;
                case TOK_ATOM: {
                    alt77 = 2;
                }
                break;
                case TOK_LP: {
                    alt77 = 3;
                }
                break;
                case TOK_BOOL: {
                    alt77 = 4;
                }
                break;
                case TOK_WORD1: {
                    alt77 = 5;
                }
                break;
                case TOK_NEXT: {
                    alt77 = 6;
                }
                break;
                case TOK_CASE: {
                    alt77 = 7;
                }
                break;
                case TOK_WAREAD: {
                    alt77 = 8;
                }
                break;
                case TOK_WAWRITE: {
                    alt77 = 9;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("1311:1: atls_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP atls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T atls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 77, 0, input);

                    throw nvae;
            }

            switch (alt77) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1314:11: constant primary_expr_select
                {
                    pushFollow(FOLLOW_constant_in_atls_primary_expr_helper112273);
                    constant191 = constant();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_constant.add(constant191.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_atls_primary_expr_helper112275);
                    primary_expr_select192 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select192.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, constant
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1317:9: -> ^( VALUE_T constant NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:1317:12: ^( VALUE_T constant NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(VALUE_T, "VALUE_T"), root_1);

                                adaptor.addChild(root_1, stream_constant.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1318:11: primary_expr_helper1_pointer1
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_atls_primary_expr_helper112326);
                    primary_expr_helper1_pointer1193 = primary_expr_helper1_pointer1();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, primary_expr_helper1_pointer1193.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:1327:11: TOK_LP atls_root_expr TOK_RP primary_expr_select
                {
                    TOK_LP194 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_atls_primary_expr_helper112379);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP194);

                    pushFollow(FOLLOW_atls_root_expr_in_atls_primary_expr_helper112381);
                    atls_root_expr195 = atls_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_atls_root_expr.add(atls_root_expr195.getTree());
                    TOK_RP196 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_atls_primary_expr_helper112383);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP196);

                    pushFollow(FOLLOW_primary_expr_select_in_atls_primary_expr_helper112385);
                    primary_expr_select197 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select197.getTree());
                    if (backtracking == 0) {
                        if (!er()) retval.ret = atls_root_expr195.ret;
                    }

                    // AST REWRITE
                    // elements: atls_root_expr, primary_expr_select
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1329:9: -> ^( BLOCK_T atls_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:1329:12: ^( BLOCK_T atls_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(BLOCK_T, "BLOCK_T"), root_1);

                                adaptor.addChild(root_1, stream_atls_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 4:
                    // F:\\StudyAntlr\\SPC.g:1333:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_BOOL198 = (Token) input.LT(1);
                    match(input, TOK_BOOL, FOLLOW_TOK_BOOL_in_atls_primary_expr_helper112456);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_BOOL.add(TOK_BOOL198);

                    TOK_LP199 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_atls_primary_expr_helper112458);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP199);

                    pushFollow(FOLLOW_simple_root_expr_in_atls_primary_expr_helper112460);
                    simple_root_expr200 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr200.getTree());
                    TOK_RP201 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_atls_primary_expr_helper112462);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP201);

                    pushFollow(FOLLOW_primary_expr_select_in_atls_primary_expr_helper112464);
                    primary_expr_select202 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select202.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: TOK_BOOL, primary_expr_select, simple_root_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1336:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:1336:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_BOOL.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 5:
                    // F:\\StudyAntlr\\SPC.g:1337:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WORD1203 = (Token) input.LT(1);
                    match(input, TOK_WORD1, FOLLOW_TOK_WORD1_in_atls_primary_expr_helper112515);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WORD1.add(TOK_WORD1203);

                    TOK_LP204 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_atls_primary_expr_helper112517);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP204);

                    pushFollow(FOLLOW_simple_root_expr_in_atls_primary_expr_helper112519);
                    simple_root_expr205 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr205.getTree());
                    TOK_RP206 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_atls_primary_expr_helper112521);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP206);

                    pushFollow(FOLLOW_primary_expr_select_in_atls_primary_expr_helper112523);
                    primary_expr_select207 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select207.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: TOK_WORD1, primary_expr_select, simple_root_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1340:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:1340:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WORD1.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 6:
                    // F:\\StudyAntlr\\SPC.g:1342:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_NEXT208 = (Token) input.LT(1);
                    match(input, TOK_NEXT, FOLLOW_TOK_NEXT_in_atls_primary_expr_helper112583);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NEXT.add(TOK_NEXT208);

                    TOK_LP209 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_atls_primary_expr_helper112585);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP209);

                    pushFollow(FOLLOW_simple_root_expr_in_atls_primary_expr_helper112587);
                    simple_root_expr210 = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr210.getTree());
                    TOK_RP211 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_atls_primary_expr_helper112589);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP211);

                    pushFollow(FOLLOW_primary_expr_select_in_atls_primary_expr_helper112591);
                    primary_expr_select212 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select212.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: TOK_NEXT, primary_expr_select, simple_root_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1345:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:1345:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_NEXT.next(), root_1);

                                adaptor.addChild(root_1, stream_simple_root_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 7:
                    // F:\\StudyAntlr\\SPC.g:1347:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                {
                    TOK_CASE213 = (Token) input.LT(1);
                    match(input, TOK_CASE, FOLLOW_TOK_CASE_in_atls_primary_expr_helper112651);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_CASE.add(TOK_CASE213);

                    pushFollow(FOLLOW_case_element_list_expr_in_atls_primary_expr_helper112653);
                    case_element_list_expr214 = case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_case_element_list_expr.add(case_element_list_expr214.getTree());
                    TOK_ESAC215 = (Token) input.LT(1);
                    match(input, TOK_ESAC, FOLLOW_TOK_ESAC_in_atls_primary_expr_helper112655);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_ESAC.add(TOK_ESAC215);

                    pushFollow(FOLLOW_primary_expr_select_in_atls_primary_expr_helper112657);
                    primary_expr_select216 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select216.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, case_element_list_expr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1350:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:1350:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(CASE_LIST_EXPR_T, "CASE_LIST_EXPR_T"), root_1);

                                adaptor.addChild(root_1, stream_case_element_list_expr.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 8:
                    // F:\\StudyAntlr\\SPC.g:1352:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WAREAD217 = (Token) input.LT(1);
                    match(input, TOK_WAREAD, FOLLOW_TOK_WAREAD_in_atls_primary_expr_helper112717);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WAREAD.add(TOK_WAREAD217);

                    TOK_LP218 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_atls_primary_expr_helper112719);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP218);

                    pushFollow(FOLLOW_simple_root_expr_in_atls_primary_expr_helper112723);
                    f = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA219 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_atls_primary_expr_helper112725);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(TOK_COMMA219);

                    pushFollow(FOLLOW_simple_root_expr_in_atls_primary_expr_helper112729);
                    s = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(s.getTree());
                    TOK_RP220 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_atls_primary_expr_helper112731);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP220);

                    pushFollow(FOLLOW_primary_expr_select_in_atls_primary_expr_helper112733);
                    primary_expr_select221 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select221.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: s, f, primary_expr_select, TOK_WAREAD
                    // token labels:
                    // rule labels: s, f, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_s = new RewriteRuleSubtreeStream(adaptor, "token s", s != null ? s.tree : null);
                        RewriteRuleSubtreeStream stream_f = new RewriteRuleSubtreeStream(adaptor, "token f", f != null ? f.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1355:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:1355:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WAREAD.next(), root_1);

                                adaptor.addChild(root_1, stream_f.next());
                                adaptor.addChild(root_1, stream_s.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 9:
                    // F:\\StudyAntlr\\SPC.g:1357:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                {
                    TOK_WAWRITE222 = (Token) input.LT(1);
                    match(input, TOK_WAWRITE, FOLLOW_TOK_WAWRITE_in_atls_primary_expr_helper112797);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_WAWRITE.add(TOK_WAWRITE222);

                    TOK_LP223 = (Token) input.LT(1);
                    match(input, TOK_LP, FOLLOW_TOK_LP_in_atls_primary_expr_helper112799);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_LP.add(TOK_LP223);

                    pushFollow(FOLLOW_simple_root_expr_in_atls_primary_expr_helper112803);
                    f = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(f.getTree());
                    tc1 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_atls_primary_expr_helper112807);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_atls_primary_expr_helper112811);
                    m = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(m.getTree());
                    tc2 = (Token) input.LT(1);
                    match(input, TOK_COMMA, FOLLOW_TOK_COMMA_in_atls_primary_expr_helper112815);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_atls_primary_expr_helper112819);
                    s = simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_simple_root_expr.add(s.getTree());
                    TOK_RP224 = (Token) input.LT(1);
                    match(input, TOK_RP, FOLLOW_TOK_RP_in_atls_primary_expr_helper112821);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_RP.add(TOK_RP224);

                    pushFollow(FOLLOW_primary_expr_select_in_atls_primary_expr_helper112823);
                    primary_expr_select225 = primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select225.getTree());
                    if (backtracking == 0) {
                        if (!er()) append_end = true;
                        if (!er())
                            retval.ret = InitSpec.mk_ref(input, ((Token) retval.start), input.toString(retval.start, input.LT(-1)));
                    }

                    // AST REWRITE
                    // elements: TOK_WAWRITE, f, m, s, primary_expr_select
                    // token labels:
                    // rule labels: s, f, m, retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_s = new RewriteRuleSubtreeStream(adaptor, "token s", s != null ? s.tree : null);
                        RewriteRuleSubtreeStream stream_f = new RewriteRuleSubtreeStream(adaptor, "token f", f != null ? f.tree : null);
                        RewriteRuleSubtreeStream stream_m = new RewriteRuleSubtreeStream(adaptor, "token m", m != null ? m.tree : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1360:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                        {
                            // F:\\StudyAntlr\\SPC.g:1360:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_WAWRITE.next(), root_1);

                                adaptor.addChild(root_1, stream_f.next());
                                adaptor.addChild(root_1, stream_m.next());
                                adaptor.addChild(root_1, stream_s.next());
                                adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                                adaptor.addChild(root_1, stream_primary_expr_select.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (append_end) retval.ret.setEndToken(((Token) retval.stop));
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end atls_primary_expr_helper1

    public static class primary_expr_helper1_pointer1_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start primary_expr_helper1_pointer1
    // F:\\StudyAntlr\\SPC.g:1369:1: primary_expr_helper1_pointer1 : TOK_ATOM primary_expr_select -> ^( VALUE_T TOK_ATOM NOP primary_expr_select ) ;
    public final primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1() throws RecognitionException {
        primary_expr_helper1_pointer1_return retval = new primary_expr_helper1_pointer1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_ATOM226 = null;
        primary_expr_select_return primary_expr_select227 = null;


        Object TOK_ATOM226_tree = null;
        RewriteRuleTokenStream stream_TOK_ATOM = new RewriteRuleTokenStream(adaptor, "token TOK_ATOM");
        RewriteRuleSubtreeStream stream_primary_expr_select = new RewriteRuleSubtreeStream(adaptor, "rule primary_expr_select");
        try {
            // F:\\StudyAntlr\\SPC.g:1369:31: ( TOK_ATOM primary_expr_select -> ^( VALUE_T TOK_ATOM NOP primary_expr_select ) )
            // F:\\StudyAntlr\\SPC.g:1369:33: TOK_ATOM primary_expr_select
            {
                TOK_ATOM226 = (Token) input.LT(1);
                match(input, TOK_ATOM, FOLLOW_TOK_ATOM_in_primary_expr_helper1_pointer112893);
                if (failed) return retval;
                if (backtracking == 0) stream_TOK_ATOM.add(TOK_ATOM226);

                pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper1_pointer112895);
                primary_expr_select227 = primary_expr_select();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) stream_primary_expr_select.add(primary_expr_select227.getTree());

                // AST REWRITE
                // elements: primary_expr_select, TOK_ATOM
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                if (backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 1370:9: -> ^( VALUE_T TOK_ATOM NOP primary_expr_select )
                    {
                        // F:\\StudyAntlr\\SPC.g:1370:12: ^( VALUE_T TOK_ATOM NOP primary_expr_select )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot(adaptor.create(VALUE_T, "VALUE_T"), root_1);

                            adaptor.addChild(root_1, stream_TOK_ATOM.next());
                            adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
                            adaptor.addChild(root_1, stream_primary_expr_select.next());

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end primary_expr_helper1_pointer1

    public static class primary_expr_select_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start primary_expr_select
    // F:\\StudyAntlr\\SPC.g:1375:1: primary_expr_select : ( primary_expr_select_helper | primary_expr_ref )* ;
    public final primary_expr_select_return primary_expr_select() throws RecognitionException {
        primary_expr_select_return retval = new primary_expr_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primary_expr_select_helper_return primary_expr_select_helper228 = null;

        primary_expr_ref_return primary_expr_ref229 = null;


        try {
            // F:\\StudyAntlr\\SPC.g:1375:24: ( ( primary_expr_select_helper | primary_expr_ref )* )
            // F:\\StudyAntlr\\SPC.g:1375:26: ( primary_expr_select_helper | primary_expr_ref )*
            {
                root_0 = (Object) adaptor.nil();

                // F:\\StudyAntlr\\SPC.g:1375:26: ( primary_expr_select_helper | primary_expr_ref )*
                loop78:
                do {
                    int alt78 = 3;
                    int LA78_0 = input.LA(1);

                    if ((LA78_0 == TOK_LB)) {
                        alt78 = 1;
                    } else if ((LA78_0 == TOK_DOT)) {
                        alt78 = 2;
                    }


                    switch (alt78) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1375:27: primary_expr_select_helper
                        {
                            pushFollow(FOLLOW_primary_expr_select_helper_in_primary_expr_select12938);
                            primary_expr_select_helper228 = primary_expr_select_helper();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, primary_expr_select_helper228.getTree());

                        }
                        break;
                        case 2:
                            // F:\\StudyAntlr\\SPC.g:1375:56: primary_expr_ref
                        {
                            pushFollow(FOLLOW_primary_expr_ref_in_primary_expr_select12942);
                            primary_expr_ref229 = primary_expr_ref();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, primary_expr_ref229.getTree());

                        }
                        break;

                        default:
                            break loop78;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end primary_expr_select

    public static class primary_expr_ref_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start primary_expr_ref
    // F:\\StudyAntlr\\SPC.g:1377:1: primary_expr_ref : ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) ) ;
    public final primary_expr_ref_return primary_expr_ref() throws RecognitionException {
        primary_expr_ref_return retval = new primary_expr_ref_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_DOT230 = null;
        Token set231 = null;

        Object TOK_DOT230_tree = null;
        Object set231_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:1377:21: ( ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) ) )
            // F:\\StudyAntlr\\SPC.g:1377:23: ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) )
            {
                root_0 = (Object) adaptor.nil();

                // F:\\StudyAntlr\\SPC.g:1377:23: ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) )
                // F:\\StudyAntlr\\SPC.g:1377:24: TOK_DOT ( TOK_ATOM | TOK_NUMBER )
                {
                    TOK_DOT230 = (Token) input.LT(1);
                    match(input, TOK_DOT, FOLLOW_TOK_DOT_in_primary_expr_ref12965);
                    if (failed) return retval;
                    set231 = (Token) input.LT(1);
                    if (input.LA(1) == TOK_ATOM || input.LA(1) == TOK_NUMBER) {
                        input.consume();
                        if (backtracking == 0) adaptor.addChild(root_0, adaptor.create(set231));
                        errorRecovery = false;
                        failed = false;
                    } else {
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        MismatchedSetException mse =
                                new MismatchedSetException(null, input);
                        recoverFromMismatchedSet(input, mse, FOLLOW_set_in_primary_expr_ref12968);
                        throw mse;
                    }


                }


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end primary_expr_ref

    public static class primary_expr_select_helper_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start primary_expr_select_helper
    // F:\\StudyAntlr\\SPC.g:1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );
    public final primary_expr_select_helper_return primary_expr_select_helper() throws RecognitionException {
        primary_expr_select_helper_return retval = new primary_expr_select_helper_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primary_expr_select_helper_arr_suffix_return primary_expr_select_helper_arr_suffix232 = null;

        primary_expr_select_helper_bit_suffix_return primary_expr_select_helper_bit_suffix233 = null;


        try {
            // F:\\StudyAntlr\\SPC.g:1379:29: ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix )
            int alt79 = 2;
            int LA79_0 = input.LA(1);

            if ((LA79_0 == TOK_LB)) {
                switch (input.LA(2)) {
                    case TOK_FALSEEXP: {
                        int LA79_2 = input.LA(3);

                        if ((synpred8())) {
                            alt79 = 1;
                        } else if ((true)) {
                            alt79 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 2, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_TRUEEXP: {
                        int LA79_3 = input.LA(3);

                        if ((synpred8())) {
                            alt79 = 1;
                        } else if ((true)) {
                            alt79 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 3, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_NUMBER: {
                        int LA79_4 = input.LA(3);

                        if ((synpred8())) {
                            alt79 = 1;
                        } else if ((true)) {
                            alt79 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 4, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_PLUS: {
                        int LA79_5 = input.LA(3);

                        if ((LA79_5 == TOK_NUMBER)) {
                            int LA79_23 = input.LA(4);

                            if ((synpred8())) {
                                alt79 = 1;
                            } else if ((true)) {
                                alt79 = 2;
                            } else {
                                if (backtracking > 0) {
                                    failed = true;
                                    return retval;
                                }
                                NoViableAltException nvae =
                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 23, input);

                                throw nvae;
                            }
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 5, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_NUMBER_WORD: {
                        int LA79_6 = input.LA(3);

                        if ((synpred8())) {
                            alt79 = 1;
                        } else if ((true)) {
                            alt79 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 6, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_ATOM: {
                        int LA79_7 = input.LA(3);

                        if ((synpred8())) {
                            alt79 = 1;
                        } else if ((true)) {
                            alt79 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 7, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_LP: {
                        int LA79_8 = input.LA(3);

                        if ((synpred8())) {
                            alt79 = 1;
                        } else if ((true)) {
                            alt79 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 8, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_BOOL: {
                        int LA79_9 = input.LA(3);

                        if ((LA79_9 == TOK_LP)) {
                            int LA79_29 = input.LA(4);

                            if ((synpred8())) {
                                alt79 = 1;
                            } else if ((true)) {
                                alt79 = 2;
                            } else {
                                if (backtracking > 0) {
                                    failed = true;
                                    return retval;
                                }
                                NoViableAltException nvae =
                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 29, input);

                                throw nvae;
                            }
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 9, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_WORD1: {
                        int LA79_10 = input.LA(3);

                        if ((LA79_10 == TOK_LP)) {
                            int LA79_30 = input.LA(4);

                            if ((synpred8())) {
                                alt79 = 1;
                            } else if ((true)) {
                                alt79 = 2;
                            } else {
                                if (backtracking > 0) {
                                    failed = true;
                                    return retval;
                                }
                                NoViableAltException nvae =
                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 30, input);

                                throw nvae;
                            }
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 10, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_NEXT: {
                        int LA79_11 = input.LA(3);

                        if ((LA79_11 == TOK_LP)) {
                            int LA79_31 = input.LA(4);

                            if ((synpred8())) {
                                alt79 = 1;
                            } else if ((true)) {
                                alt79 = 2;
                            } else {
                                if (backtracking > 0) {
                                    failed = true;
                                    return retval;
                                }
                                NoViableAltException nvae =
                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 31, input);

                                throw nvae;
                            }
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 11, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_CASE: {
                        int LA79_12 = input.LA(3);

                        if ((synpred8())) {
                            alt79 = 1;
                        } else if ((true)) {
                            alt79 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 12, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_WAREAD: {
                        int LA79_13 = input.LA(3);

                        if ((LA79_13 == TOK_LP)) {
                            int LA79_34 = input.LA(4);

                            if ((synpred8())) {
                                alt79 = 1;
                            } else if ((true)) {
                                alt79 = 2;
                            } else {
                                if (backtracking > 0) {
                                    failed = true;
                                    return retval;
                                }
                                NoViableAltException nvae =
                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 34, input);

                                throw nvae;
                            }
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 13, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_WAWRITE: {
                        int LA79_14 = input.LA(3);

                        if ((LA79_14 == TOK_LP)) {
                            int LA79_35 = input.LA(4);

                            if ((synpred8())) {
                                alt79 = 1;
                            } else if ((true)) {
                                alt79 = 2;
                            } else {
                                if (backtracking > 0) {
                                    failed = true;
                                    return retval;
                                }
                                NoViableAltException nvae =
                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 35, input);

                                throw nvae;
                            }
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 14, input);

                            throw nvae;
                        }
                    }
                    break;
                    case TOK_MINUS: {
                        switch (input.LA(3)) {
                            case TOK_NUMBER: {
                                int LA79_36 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 36, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_FALSEEXP: {
                                int LA79_37 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 37, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_TRUEEXP: {
                                int LA79_38 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 38, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_PLUS: {
                                int LA79_39 = input.LA(4);

                                if ((LA79_39 == TOK_NUMBER)) {
                                    int LA79_84 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 84, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 39, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_NUMBER_WORD: {
                                int LA79_40 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 40, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_ATOM: {
                                int LA79_41 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 41, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_LP: {
                                int LA79_42 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 42, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_BOOL: {
                                int LA79_43 = input.LA(4);

                                if ((LA79_43 == TOK_LP)) {
                                    int LA79_90 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 90, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 43, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_WORD1: {
                                int LA79_44 = input.LA(4);

                                if ((LA79_44 == TOK_LP)) {
                                    int LA79_91 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 91, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 44, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_NEXT: {
                                int LA79_45 = input.LA(4);

                                if ((LA79_45 == TOK_LP)) {
                                    int LA79_92 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 92, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 45, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_CASE: {
                                int LA79_46 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 46, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_WAREAD: {
                                int LA79_47 = input.LA(4);

                                if ((LA79_47 == TOK_LP)) {
                                    int LA79_95 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 95, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 47, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_WAWRITE: {
                                int LA79_48 = input.LA(4);

                                if ((LA79_48 == TOK_LP)) {
                                    int LA79_96 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 96, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 48, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_MINUS: {
                                int LA79_49 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 49, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_NOT: {
                                switch (input.LA(4)) {
                                    case TOK_FALSEEXP: {
                                        int LA79_99 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 99, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_TRUEEXP: {
                                        int LA79_100 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 100, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_NUMBER: {
                                        int LA79_101 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 101, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_PLUS: {
                                        int LA79_102 = input.LA(5);

                                        if ((LA79_102 == TOK_NUMBER)) {
                                            int LA79_167 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 167, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 102, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_NUMBER_WORD: {
                                        int LA79_103 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 103, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_ATOM: {
                                        int LA79_104 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 104, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_LP: {
                                        int LA79_105 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 105, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_BOOL: {
                                        int LA79_106 = input.LA(5);

                                        if ((LA79_106 == TOK_LP)) {
                                            int LA79_173 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 173, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 106, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_WORD1: {
                                        int LA79_107 = input.LA(5);

                                        if ((LA79_107 == TOK_LP)) {
                                            int LA79_174 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 174, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 107, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_NEXT: {
                                        int LA79_108 = input.LA(5);

                                        if ((LA79_108 == TOK_LP)) {
                                            int LA79_175 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 175, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 108, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_CASE: {
                                        int LA79_109 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 109, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_WAREAD: {
                                        int LA79_110 = input.LA(5);

                                        if ((LA79_110 == TOK_LP)) {
                                            int LA79_178 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 178, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 110, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_WAWRITE: {
                                        int LA79_111 = input.LA(5);

                                        if ((LA79_111 == TOK_LP)) {
                                            int LA79_179 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 179, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 111, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_MINUS: {
                                        int LA79_112 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 112, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_NOT: {
                                        int LA79_113 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 113, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    default:
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 50, input);

                                        throw nvae;
                                }

                            }
                            break;
                            default:
                                if (backtracking > 0) {
                                    failed = true;
                                    return retval;
                                }
                                NoViableAltException nvae =
                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 15, input);

                                throw nvae;
                        }

                    }
                    break;
                    case TOK_NOT: {
                        switch (input.LA(3)) {
                            case TOK_FALSEEXP: {
                                int LA79_51 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 51, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_TRUEEXP: {
                                int LA79_52 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 52, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_NUMBER: {
                                int LA79_53 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 53, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_PLUS: {
                                int LA79_54 = input.LA(4);

                                if ((LA79_54 == TOK_NUMBER)) {
                                    int LA79_120 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 120, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 54, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_NUMBER_WORD: {
                                int LA79_55 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 55, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_ATOM: {
                                int LA79_56 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 56, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_LP: {
                                int LA79_57 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 57, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_BOOL: {
                                int LA79_58 = input.LA(4);

                                if ((LA79_58 == TOK_LP)) {
                                    int LA79_126 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 126, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 58, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_WORD1: {
                                int LA79_59 = input.LA(4);

                                if ((LA79_59 == TOK_LP)) {
                                    int LA79_127 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 127, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 59, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_NEXT: {
                                int LA79_60 = input.LA(4);

                                if ((LA79_60 == TOK_LP)) {
                                    int LA79_128 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 128, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 60, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_CASE: {
                                int LA79_61 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 61, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_WAREAD: {
                                int LA79_62 = input.LA(4);

                                if ((LA79_62 == TOK_LP)) {
                                    int LA79_131 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 131, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 62, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_WAWRITE: {
                                int LA79_63 = input.LA(4);

                                if ((LA79_63 == TOK_LP)) {
                                    int LA79_132 = input.LA(5);

                                    if ((synpred8())) {
                                        alt79 = 1;
                                    } else if ((true)) {
                                        alt79 = 2;
                                    } else {
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 132, input);

                                        throw nvae;
                                    }
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 63, input);

                                    throw nvae;
                                }
                            }
                            break;
                            case TOK_MINUS: {
                                switch (input.LA(4)) {
                                    case TOK_FALSEEXP: {
                                        int LA79_133 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 133, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_TRUEEXP: {
                                        int LA79_134 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 134, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_NUMBER: {
                                        int LA79_135 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 135, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_PLUS: {
                                        int LA79_136 = input.LA(5);

                                        if ((LA79_136 == TOK_NUMBER)) {
                                            int LA79_200 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 200, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 136, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_NUMBER_WORD: {
                                        int LA79_137 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 137, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_ATOM: {
                                        int LA79_138 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 138, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_LP: {
                                        int LA79_139 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 139, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_BOOL: {
                                        int LA79_140 = input.LA(5);

                                        if ((LA79_140 == TOK_LP)) {
                                            int LA79_206 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 206, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 140, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_WORD1: {
                                        int LA79_141 = input.LA(5);

                                        if ((LA79_141 == TOK_LP)) {
                                            int LA79_207 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 207, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 141, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_NEXT: {
                                        int LA79_142 = input.LA(5);

                                        if ((LA79_142 == TOK_LP)) {
                                            int LA79_208 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 208, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 142, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_CASE: {
                                        int LA79_143 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 143, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_WAREAD: {
                                        int LA79_144 = input.LA(5);

                                        if ((LA79_144 == TOK_LP)) {
                                            int LA79_211 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 211, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 144, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_WAWRITE: {
                                        int LA79_145 = input.LA(5);

                                        if ((LA79_145 == TOK_LP)) {
                                            int LA79_212 = input.LA(6);

                                            if ((synpred8())) {
                                                alt79 = 1;
                                            } else if ((true)) {
                                                alt79 = 2;
                                            } else {
                                                if (backtracking > 0) {
                                                    failed = true;
                                                    return retval;
                                                }
                                                NoViableAltException nvae =
                                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 212, input);

                                                throw nvae;
                                            }
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 145, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_MINUS: {
                                        int LA79_146 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 146, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    case TOK_NOT: {
                                        int LA79_147 = input.LA(5);

                                        if ((synpred8())) {
                                            alt79 = 1;
                                        } else if ((true)) {
                                            alt79 = 2;
                                        } else {
                                            if (backtracking > 0) {
                                                failed = true;
                                                return retval;
                                            }
                                            NoViableAltException nvae =
                                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 147, input);

                                            throw nvae;
                                        }
                                    }
                                    break;
                                    default:
                                        if (backtracking > 0) {
                                            failed = true;
                                            return retval;
                                        }
                                        NoViableAltException nvae =
                                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 64, input);

                                        throw nvae;
                                }

                            }
                            break;
                            case TOK_NOT: {
                                int LA79_65 = input.LA(4);

                                if ((synpred8())) {
                                    alt79 = 1;
                                } else if ((true)) {
                                    alt79 = 2;
                                } else {
                                    if (backtracking > 0) {
                                        failed = true;
                                        return retval;
                                    }
                                    NoViableAltException nvae =
                                            new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 65, input);

                                    throw nvae;
                                }
                            }
                            break;
                            default:
                                if (backtracking > 0) {
                                    failed = true;
                                    return retval;
                                }
                                NoViableAltException nvae =
                                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 16, input);

                                throw nvae;
                        }

                    }
                    break;
                    case TOK_LCB: {
                        int LA79_17 = input.LA(3);

                        if ((synpred8())) {
                            alt79 = 1;
                        } else if ((true)) {
                            alt79 = 2;
                        } else {
                            if (backtracking > 0) {
                                failed = true;
                                return retval;
                            }
                            NoViableAltException nvae =
                                    new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 17, input);

                            throw nvae;
                        }
                    }
                    break;
                    default:
                        if (backtracking > 0) {
                            failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 1, input);

                        throw nvae;
                }

            } else {
                if (backtracking > 0) {
                    failed = true;
                    return retval;
                }
                NoViableAltException nvae =
                        new NoViableAltException("1379:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1379:31: ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_select_helper_arr_suffix_in_primary_expr_select_helper13002);
                    primary_expr_select_helper_arr_suffix232 = primary_expr_select_helper_arr_suffix();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, primary_expr_select_helper_arr_suffix232.getTree());

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1380:11: primary_expr_select_helper_bit_suffix
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_select_helper_bit_suffix_in_primary_expr_select_helper13014);
                    primary_expr_select_helper_bit_suffix233 = primary_expr_select_helper_bit_suffix();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, primary_expr_select_helper_bit_suffix233.getTree());

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end primary_expr_select_helper

    public static class primary_expr_select_helper_arr_suffix_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start primary_expr_select_helper_arr_suffix
    // F:\\StudyAntlr\\SPC.g:1382:1: primary_expr_select_helper_arr_suffix : TOK_LB simple_root_expr TOK_RB -> ^( ARRAY_INDEX_T simple_root_expr ) ;
    public final primary_expr_select_helper_arr_suffix_return primary_expr_select_helper_arr_suffix() throws RecognitionException {
        primary_expr_select_helper_arr_suffix_return retval = new primary_expr_select_helper_arr_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LB234 = null;
        Token TOK_RB236 = null;
        simple_root_expr_return simple_root_expr235 = null;


        Object TOK_LB234_tree = null;
        Object TOK_RB236_tree = null;
        RewriteRuleTokenStream stream_TOK_LB = new RewriteRuleTokenStream(adaptor, "token TOK_LB");
        RewriteRuleTokenStream stream_TOK_RB = new RewriteRuleTokenStream(adaptor, "token TOK_RB");
        RewriteRuleSubtreeStream stream_simple_root_expr = new RewriteRuleSubtreeStream(adaptor, "rule simple_root_expr");
        try {
            // F:\\StudyAntlr\\SPC.g:1383:9: ( TOK_LB simple_root_expr TOK_RB -> ^( ARRAY_INDEX_T simple_root_expr ) )
            // F:\\StudyAntlr\\SPC.g:1383:11: TOK_LB simple_root_expr TOK_RB
            {
                TOK_LB234 = (Token) input.LT(1);
                match(input, TOK_LB, FOLLOW_TOK_LB_in_primary_expr_select_helper_arr_suffix13038);
                if (failed) return retval;
                if (backtracking == 0) stream_TOK_LB.add(TOK_LB234);

                pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_arr_suffix13040);
                simple_root_expr235 = simple_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr235.getTree());
                TOK_RB236 = (Token) input.LT(1);
                match(input, TOK_RB, FOLLOW_TOK_RB_in_primary_expr_select_helper_arr_suffix13042);
                if (failed) return retval;
                if (backtracking == 0) stream_TOK_RB.add(TOK_RB236);


                // AST REWRITE
                // elements: simple_root_expr
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                if (backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 1384:9: -> ^( ARRAY_INDEX_T simple_root_expr )
                    {
                        // F:\\StudyAntlr\\SPC.g:1384:12: ^( ARRAY_INDEX_T simple_root_expr )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot(adaptor.create(ARRAY_INDEX_T, "ARRAY_INDEX_T"), root_1);

                            adaptor.addChild(root_1, stream_simple_root_expr.next());

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end primary_expr_select_helper_arr_suffix

    public static class primary_expr_select_helper_bit_suffix_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start primary_expr_select_helper_bit_suffix
    // F:\\StudyAntlr\\SPC.g:1386:1: primary_expr_select_helper_bit_suffix : TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB -> ^( BIT_SELECT_T $f $s) ;
    public final primary_expr_select_helper_bit_suffix_return primary_expr_select_helper_bit_suffix() throws RecognitionException {
        primary_expr_select_helper_bit_suffix_return retval = new primary_expr_select_helper_bit_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LB237 = null;
        Token TOK_COLON238 = null;
        Token TOK_RB239 = null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;


        Object TOK_LB237_tree = null;
        Object TOK_COLON238_tree = null;
        Object TOK_RB239_tree = null;
        RewriteRuleTokenStream stream_TOK_LB = new RewriteRuleTokenStream(adaptor, "token TOK_LB");
        RewriteRuleTokenStream stream_TOK_COLON = new RewriteRuleTokenStream(adaptor, "token TOK_COLON");
        RewriteRuleTokenStream stream_TOK_RB = new RewriteRuleTokenStream(adaptor, "token TOK_RB");
        RewriteRuleSubtreeStream stream_simple_root_expr = new RewriteRuleSubtreeStream(adaptor, "rule simple_root_expr");
        try {
            // F:\\StudyAntlr\\SPC.g:1387:9: ( TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB -> ^( BIT_SELECT_T $f $s) )
            // F:\\StudyAntlr\\SPC.g:1387:11: TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB
            {
                TOK_LB237 = (Token) input.LT(1);
                match(input, TOK_LB, FOLLOW_TOK_LB_in_primary_expr_select_helper_bit_suffix13082);
                if (failed) return retval;
                if (backtracking == 0) stream_TOK_LB.add(TOK_LB237);

                pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13086);
                f = simple_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) stream_simple_root_expr.add(f.getTree());
                TOK_COLON238 = (Token) input.LT(1);
                match(input, TOK_COLON, FOLLOW_TOK_COLON_in_primary_expr_select_helper_bit_suffix13088);
                if (failed) return retval;
                if (backtracking == 0) stream_TOK_COLON.add(TOK_COLON238);

                pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13092);
                s = simple_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) stream_simple_root_expr.add(s.getTree());
                TOK_RB239 = (Token) input.LT(1);
                match(input, TOK_RB, FOLLOW_TOK_RB_in_primary_expr_select_helper_bit_suffix13094);
                if (failed) return retval;
                if (backtracking == 0) stream_TOK_RB.add(TOK_RB239);


                // AST REWRITE
                // elements: s, f
                // token labels:
                // rule labels: s, f, retval
                // token list labels:
                // rule list labels:
                if (backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_s = new RewriteRuleSubtreeStream(adaptor, "token s", s != null ? s.tree : null);
                    RewriteRuleSubtreeStream stream_f = new RewriteRuleSubtreeStream(adaptor, "token f", f != null ? f.tree : null);
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 1388:9: -> ^( BIT_SELECT_T $f $s)
                    {
                        // F:\\StudyAntlr\\SPC.g:1388:12: ^( BIT_SELECT_T $f $s)
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot(adaptor.create(BIT_SELECT_T, "BIT_SELECT_T"), root_1);

                            adaptor.addChild(root_1, stream_f.next());
                            adaptor.addChild(root_1, stream_s.next());

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end primary_expr_select_helper_bit_suffix

    public static class case_element_expr_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start case_element_expr
    // F:\\StudyAntlr\\SPC.g:1391:1: case_element_expr : simple_root_expr TOK_COLON simple_root_expr TOK_SEMI -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr ) ;
    public final case_element_expr_return case_element_expr() throws RecognitionException {
        case_element_expr_return retval = new case_element_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COLON241 = null;
        Token TOK_SEMI243 = null;
        simple_root_expr_return simple_root_expr240 = null;

        simple_root_expr_return simple_root_expr242 = null;


        Object TOK_COLON241_tree = null;
        Object TOK_SEMI243_tree = null;
        RewriteRuleTokenStream stream_TOK_COLON = new RewriteRuleTokenStream(adaptor, "token TOK_COLON");
        RewriteRuleTokenStream stream_TOK_SEMI = new RewriteRuleTokenStream(adaptor, "token TOK_SEMI");
        RewriteRuleSubtreeStream stream_simple_root_expr = new RewriteRuleSubtreeStream(adaptor, "rule simple_root_expr");
        try {
            // F:\\StudyAntlr\\SPC.g:1391:22: ( simple_root_expr TOK_COLON simple_root_expr TOK_SEMI -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr ) )
            // F:\\StudyAntlr\\SPC.g:1391:24: simple_root_expr TOK_COLON simple_root_expr TOK_SEMI
            {
                pushFollow(FOLLOW_simple_root_expr_in_case_element_expr13142);
                simple_root_expr240 = simple_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr240.getTree());
                TOK_COLON241 = (Token) input.LT(1);
                match(input, TOK_COLON, FOLLOW_TOK_COLON_in_case_element_expr13144);
                if (failed) return retval;
                if (backtracking == 0) stream_TOK_COLON.add(TOK_COLON241);

                pushFollow(FOLLOW_simple_root_expr_in_case_element_expr13146);
                simple_root_expr242 = simple_root_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) stream_simple_root_expr.add(simple_root_expr242.getTree());
                TOK_SEMI243 = (Token) input.LT(1);
                match(input, TOK_SEMI, FOLLOW_TOK_SEMI_in_case_element_expr13148);
                if (failed) return retval;
                if (backtracking == 0) stream_TOK_SEMI.add(TOK_SEMI243);


                // AST REWRITE
                // elements: simple_root_expr, simple_root_expr
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                if (backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 1392:9: -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr )
                    {
                        // F:\\StudyAntlr\\SPC.g:1392:12: ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot(adaptor.create(CASE_ELEMENT_EXPR_T, "CASE_ELEMENT_EXPR_T"), root_1);

                            adaptor.addChild(root_1, stream_simple_root_expr.next());
                            adaptor.addChild(root_1, stream_simple_root_expr.next());

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end case_element_expr

    public static class case_element_list_expr_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start case_element_list_expr
    // F:\\StudyAntlr\\SPC.g:1394:1: case_element_list_expr : case_element_expr ( case_element_expr )* ;
    public final case_element_list_expr_return case_element_list_expr() throws RecognitionException {
        case_element_list_expr_return retval = new case_element_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        case_element_expr_return case_element_expr244 = null;

        case_element_expr_return case_element_expr245 = null;


        try {
            // F:\\StudyAntlr\\SPC.g:1394:26: ( case_element_expr ( case_element_expr )* )
            // F:\\StudyAntlr\\SPC.g:1394:28: case_element_expr ( case_element_expr )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_case_element_expr_in_case_element_list_expr13184);
                case_element_expr244 = case_element_expr();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) adaptor.addChild(root_0, case_element_expr244.getTree());
                // F:\\StudyAntlr\\SPC.g:1394:46: ( case_element_expr )*
                loop80:
                do {
                    int alt80 = 2;
                    int LA80_0 = input.LA(1);

                    if ((LA80_0 == TOK_LCB || (LA80_0 >= TOK_PLUS && LA80_0 <= TOK_MINUS) || (LA80_0 >= TOK_NOT && LA80_0 <= TOK_LP) || (LA80_0 >= TOK_BOOL && LA80_0 <= TOK_CASE) || (LA80_0 >= TOK_WAREAD && LA80_0 <= TOK_WAWRITE) || LA80_0 == TOK_ATOM || LA80_0 == TOK_NUMBER || LA80_0 == TOK_NUMBER_WORD || (LA80_0 >= TOK_FALSEEXP && LA80_0 <= TOK_TRUEEXP))) {
                        alt80 = 1;
                    }


                    switch (alt80) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1394:47: case_element_expr
                        {
                            pushFollow(FOLLOW_case_element_expr_in_case_element_list_expr13187);
                            case_element_expr245 = case_element_expr();
                            _fsp--;
                            if (failed) return retval;
                            if (backtracking == 0) adaptor.addChild(root_0, case_element_expr245.getTree());

                        }
                        break;

                        default:
                            break loop80;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end case_element_list_expr

    public static class number_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start number
    // F:\\StudyAntlr\\SPC.g:1397:1: number : ( TOK_NUMBER | TOK_PLUS TOK_NUMBER );
    public final number_return number() throws RecognitionException {
        number_return retval = new number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER246 = null;
        Token TOK_PLUS247 = null;
        Token TOK_NUMBER248 = null;

        Object TOK_NUMBER246_tree = null;
        Object TOK_PLUS247_tree = null;
        Object TOK_NUMBER248_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:1397:14: ( TOK_NUMBER | TOK_PLUS TOK_NUMBER )
            int alt81 = 2;
            int LA81_0 = input.LA(1);

            if ((LA81_0 == TOK_NUMBER)) {
                alt81 = 1;
            } else if ((LA81_0 == TOK_PLUS)) {
                alt81 = 2;
            } else {
                if (backtracking > 0) {
                    failed = true;
                    return retval;
                }
                NoViableAltException nvae =
                        new NoViableAltException("1397:1: number : ( TOK_NUMBER | TOK_PLUS TOK_NUMBER );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1397:16: TOK_NUMBER
                {
                    root_0 = (Object) adaptor.nil();

                    TOK_NUMBER246 = (Token) input.LT(1);
                    match(input, TOK_NUMBER, FOLLOW_TOK_NUMBER_in_number13212);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        TOK_NUMBER246_tree = (Object) adaptor.create(TOK_NUMBER246);
                        adaptor.addChild(root_0, TOK_NUMBER246_tree);
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1398:11: TOK_PLUS TOK_NUMBER
                {
                    root_0 = (Object) adaptor.nil();

                    TOK_PLUS247 = (Token) input.LT(1);
                    match(input, TOK_PLUS, FOLLOW_TOK_PLUS_in_number13224);
                    if (failed) return retval;
                    TOK_NUMBER248 = (Token) input.LT(1);
                    match(input, TOK_NUMBER, FOLLOW_TOK_NUMBER_in_number13227);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        TOK_NUMBER248_tree = (Object) adaptor.create(TOK_NUMBER248);
                        adaptor.addChild(root_0, TOK_NUMBER248_tree);
                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end number

    public static class integer_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start integer
    // F:\\StudyAntlr\\SPC.g:1399:1: integer : ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) );
    public final integer_return integer() throws RecognitionException {
        integer_return retval = new integer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER249 = null;
        Token TOK_PLUS250 = null;
        Token TOK_NUMBER251 = null;
        Token TOK_MINUS252 = null;
        Token TOK_NUMBER253 = null;

        Object TOK_NUMBER249_tree = null;
        Object TOK_PLUS250_tree = null;
        Object TOK_NUMBER251_tree = null;
        Object TOK_MINUS252_tree = null;
        Object TOK_NUMBER253_tree = null;
        RewriteRuleTokenStream stream_TOK_MINUS = new RewriteRuleTokenStream(adaptor, "token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NUMBER = new RewriteRuleTokenStream(adaptor, "token TOK_NUMBER");
        RewriteRuleTokenStream stream_TOK_PLUS = new RewriteRuleTokenStream(adaptor, "token TOK_PLUS");

        try {
            // F:\\StudyAntlr\\SPC.g:1399:15: ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) )
            int alt82 = 3;
            switch (input.LA(1)) {
                case TOK_NUMBER: {
                    alt82 = 1;
                }
                break;
                case TOK_PLUS: {
                    alt82 = 2;
                }
                break;
                case TOK_MINUS: {
                    alt82 = 3;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("1399:1: integer : ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) );", 82, 0, input);

                    throw nvae;
            }

            switch (alt82) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1399:17: TOK_NUMBER
                {
                    TOK_NUMBER249 = (Token) input.LT(1);
                    match(input, TOK_NUMBER, FOLLOW_TOK_NUMBER_in_integer13240);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NUMBER.add(TOK_NUMBER249);


                    // AST REWRITE
                    // elements: TOK_NUMBER
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1400:9: -> ^( TOK_PLUS TOK_NUMBER )
                        {
                            // F:\\StudyAntlr\\SPC.g:1400:12: ^( TOK_PLUS TOK_NUMBER )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(adaptor.create(TOK_PLUS, "TOK_PLUS"), root_1);

                                adaptor.addChild(root_1, stream_TOK_NUMBER.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1401:11: TOK_PLUS TOK_NUMBER
                {
                    TOK_PLUS250 = (Token) input.LT(1);
                    match(input, TOK_PLUS, FOLLOW_TOK_PLUS_in_integer13268);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_PLUS.add(TOK_PLUS250);

                    TOK_NUMBER251 = (Token) input.LT(1);
                    match(input, TOK_NUMBER, FOLLOW_TOK_NUMBER_in_integer13270);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NUMBER.add(TOK_NUMBER251);


                    // AST REWRITE
                    // elements: TOK_NUMBER, TOK_PLUS
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1402:9: -> ^( TOK_PLUS TOK_NUMBER )
                        {
                            // F:\\StudyAntlr\\SPC.g:1402:12: ^( TOK_PLUS TOK_NUMBER )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_PLUS.next(), root_1);

                                adaptor.addChild(root_1, stream_TOK_NUMBER.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:1403:11: TOK_MINUS TOK_NUMBER
                {
                    TOK_MINUS252 = (Token) input.LT(1);
                    match(input, TOK_MINUS, FOLLOW_TOK_MINUS_in_integer13298);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_MINUS.add(TOK_MINUS252);

                    TOK_NUMBER253 = (Token) input.LT(1);
                    match(input, TOK_NUMBER, FOLLOW_TOK_NUMBER_in_integer13300);
                    if (failed) return retval;
                    if (backtracking == 0) stream_TOK_NUMBER.add(TOK_NUMBER253);


                    // AST REWRITE
                    // elements: TOK_NUMBER, TOK_MINUS
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if (backtracking == 0) {
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                        root_0 = (Object) adaptor.nil();
                        // 1404:9: -> ^( TOK_MINUS TOK_NUMBER )
                        {
                            // F:\\StudyAntlr\\SPC.g:1404:12: ^( TOK_MINUS TOK_NUMBER )
                            {
                                Object root_1 = (Object) adaptor.nil();
                                root_1 = (Object) adaptor.becomeRoot(stream_TOK_MINUS.next(), root_1);

                                adaptor.addChild(root_1, stream_TOK_NUMBER.next());

                                adaptor.addChild(root_0, root_1);
                            }

                        }

                    }

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end integer

    public static class number_word_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start number_word
    // F:\\StudyAntlr\\SPC.g:1406:1: number_word : TOK_NUMBER_WORD ;
    public final number_word_return number_word() throws RecognitionException {
        number_word_return retval = new number_word_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER_WORD254 = null;

        Object TOK_NUMBER_WORD254_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:1406:18: ( TOK_NUMBER_WORD )
            // F:\\StudyAntlr\\SPC.g:1406:20: TOK_NUMBER_WORD
            {
                root_0 = (Object) adaptor.nil();

                TOK_NUMBER_WORD254 = (Token) input.LT(1);
                match(input, TOK_NUMBER_WORD, FOLLOW_TOK_NUMBER_WORD_in_number_word13337);
                if (failed) return retval;
                if (backtracking == 0) {
                    TOK_NUMBER_WORD254_tree = (Object) adaptor.create(TOK_NUMBER_WORD254);
                    adaptor.addChild(root_0, TOK_NUMBER_WORD254_tree);
                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end number_word

    public static class subrange_return extends ParserRuleReturnScope {
        public InternalSpecRange ret;
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start subrange
    // F:\\StudyAntlr\\SPC.g:1409:1: subrange returns [InternalSpecRange ret] : f= integer TOK_TWODOTS s= integer -> ^( SUBRANGE_T integer integer ) ;
    public final subrange_return subrange() throws RecognitionException {
        subrange_return retval = new subrange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_TWODOTS255 = null;
        integer_return f = null;

        integer_return s = null;


        Object TOK_TWODOTS255_tree = null;
        RewriteRuleTokenStream stream_TOK_TWODOTS = new RewriteRuleTokenStream(adaptor, "token TOK_TWODOTS");
        RewriteRuleSubtreeStream stream_integer = new RewriteRuleSubtreeStream(adaptor, "rule integer");
        try {
            // F:\\StudyAntlr\\SPC.g:1411:9: (f= integer TOK_TWODOTS s= integer -> ^( SUBRANGE_T integer integer ) )
            // F:\\StudyAntlr\\SPC.g:1411:11: f= integer TOK_TWODOTS s= integer
            {
                pushFollow(FOLLOW_integer_in_subrange13376);
                f = integer();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) stream_integer.add(f.getTree());
                TOK_TWODOTS255 = (Token) input.LT(1);
                match(input, TOK_TWODOTS, FOLLOW_TOK_TWODOTS_in_subrange13378);
                if (failed) return retval;
                if (backtracking == 0) stream_TOK_TWODOTS.add(TOK_TWODOTS255);

                pushFollow(FOLLOW_integer_in_subrange13382);
                s = integer();
                _fsp--;
                if (failed) return retval;
                if (backtracking == 0) stream_integer.add(s.getTree());
                if (backtracking == 0) {
                    if (!er())
                        retval.ret = new InternalSpecRange(input.toString(f.start, f.stop), input.toString(s.start, s.stop), ((Token) retval.start));
                }

                // AST REWRITE
                // elements: integer, integer
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                if (backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "token retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 1413:9: -> ^( SUBRANGE_T integer integer )
                    {
                        // F:\\StudyAntlr\\SPC.g:1413:12: ^( SUBRANGE_T integer integer )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot(adaptor.create(SUBRANGE_T, "SUBRANGE_T"), root_1);

                            adaptor.addChild(root_1, stream_integer.next());
                            adaptor.addChild(root_1, stream_integer.next());

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                }

            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if (backtracking == 0) {
                if (!er()) retval.ret.evalBDDChildrenExp(input);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end subrange

    public static class constant_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start constant
    // F:\\StudyAntlr\\SPC.g:1415:1: constant : ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word );
    public final constant_return constant() throws RecognitionException {
        constant_return retval = new constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_FALSEEXP256 = null;
        Token TOK_TRUEEXP257 = null;
        number_return number258 = null;

        number_word_return number_word259 = null;


        Object TOK_FALSEEXP256_tree = null;
        Object TOK_TRUEEXP257_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:1415:15: ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word )
            int alt83 = 4;
            switch (input.LA(1)) {
                case TOK_FALSEEXP: {
                    alt83 = 1;
                }
                break;
                case TOK_TRUEEXP: {
                    alt83 = 2;
                }
                break;
                case TOK_PLUS:
                case TOK_NUMBER: {
                    alt83 = 3;
                }
                break;
                case TOK_NUMBER_WORD: {
                    alt83 = 4;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("1415:1: constant : ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word );", 83, 0, input);

                    throw nvae;
            }

            switch (alt83) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1415:17: TOK_FALSEEXP
                {
                    root_0 = (Object) adaptor.nil();

                    TOK_FALSEEXP256 = (Token) input.LT(1);
                    match(input, TOK_FALSEEXP, FOLLOW_TOK_FALSEEXP_in_constant13431);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        TOK_FALSEEXP256_tree = (Object) adaptor.create(TOK_FALSEEXP256);
                        adaptor.addChild(root_0, TOK_FALSEEXP256_tree);
                    }

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1416:11: TOK_TRUEEXP
                {
                    root_0 = (Object) adaptor.nil();

                    TOK_TRUEEXP257 = (Token) input.LT(1);
                    match(input, TOK_TRUEEXP, FOLLOW_TOK_TRUEEXP_in_constant13443);
                    if (failed) return retval;
                    if (backtracking == 0) {
                        TOK_TRUEEXP257_tree = (Object) adaptor.create(TOK_TRUEEXP257);
                        adaptor.addChild(root_0, TOK_TRUEEXP257_tree);
                    }

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:1417:11: number
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_number_in_constant13455);
                    number258 = number();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, number258.getTree());

                }
                break;
                case 4:
                    // F:\\StudyAntlr\\SPC.g:1418:11: number_word
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_number_word_in_constant13467);
                    number_word259 = number_word();
                    _fsp--;
                    if (failed) return retval;
                    if (backtracking == 0) adaptor.addChild(root_0, number_word259.getTree());

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end constant

    public static class optsemi_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start optsemi
    // F:\\StudyAntlr\\SPC.g:1422:1: optsemi : ( TOK_SEMI )* ;
    public final optsemi_return optsemi() throws RecognitionException {
        optsemi_return retval = new optsemi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_SEMI260 = null;

        Object TOK_SEMI260_tree = null;

        try {
            // F:\\StudyAntlr\\SPC.g:1422:15: ( ( TOK_SEMI )* )
            // F:\\StudyAntlr\\SPC.g:1422:17: ( TOK_SEMI )*
            {
                root_0 = (Object) adaptor.nil();

                // F:\\StudyAntlr\\SPC.g:1422:17: ( TOK_SEMI )*
                loop84:
                do {
                    int alt84 = 2;
                    int LA84_0 = input.LA(1);

                    if ((LA84_0 == TOK_SEMI)) {
                        alt84 = 1;
                    }


                    switch (alt84) {
                        case 1:
                            // F:\\StudyAntlr\\SPC.g:1422:17: TOK_SEMI
                        {
                            TOK_SEMI260 = (Token) input.LT(1);
                            match(input, TOK_SEMI, FOLLOW_TOK_SEMI_in_optsemi13492);
                            if (failed) return retval;
                            if (backtracking == 0) {
                                TOK_SEMI260_tree = (Object) adaptor.create(TOK_SEMI260);
                                adaptor.addChild(root_0, TOK_SEMI260_tree);
                            }

                        }
                        break;

                        default:
                            break loop84;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (backtracking == 0) {
                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return retval;
    }
    // $ANTLR end optsemi

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {
        // F:\\StudyAntlr\\SPC.g:413:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )
        // F:\\StudyAntlr\\SPC.g:413:12: ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG )
        {
            // F:\\StudyAntlr\\SPC.g:413:12: ( TOK_NOT )*
            loop85:
            do {
                int alt85 = 2;
                int LA85_0 = input.LA(1);

                if ((LA85_0 == TOK_NOT)) {
                    alt85 = 1;
                }


                switch (alt85) {
                    case 1:
                        // F:\\StudyAntlr\\SPC.g:413:12: TOK_NOT
                    {
                        match(input, TOK_NOT, FOLLOW_TOK_NOT_in_synpred13151);
                        if (failed) return;

                    }
                    break;

                    default:
                        break loop85;
                }
            } while (true);

            if ((input.LA(1) >= TOK_EX && input.LA(1) <= TOK_AA) || input.LA(1) == TOK_EE) {
                input.consume();
                errorRecovery = false;
                failed = false;
            } else {
                if (backtracking > 0) {
                    failed = true;
                    return;
                }
                MismatchedSetException mse =
                        new MismatchedSetException(null, input);
                recoverFromMismatchedSet(input, mse, FOLLOW_set_in_synpred13164);
                throw mse;
            }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {
        // F:\\StudyAntlr\\SPC.g:459:11: ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )
        // F:\\StudyAntlr\\SPC.g:459:12: TOK_AA TOK_LB ctl_root_expr TOK_UNTIL
        {
            match(input, TOK_AA, FOLLOW_TOK_AA_in_synpred23674);
            if (failed) return;
            match(input, TOK_LB, FOLLOW_TOK_LB_in_synpred23676);
            if (failed) return;
            pushFollow(FOLLOW_ctl_root_expr_in_synpred23678);
            ctl_root_expr();
            _fsp--;
            if (failed) return;
            match(input, TOK_UNTIL, FOLLOW_TOK_UNTIL_in_synpred23680);
            if (failed) return;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {
        // F:\\StudyAntlr\\SPC.g:460:11: ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )
        // F:\\StudyAntlr\\SPC.g:460:12: TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL
        {
            match(input, TOK_AA, FOLLOW_TOK_AA_in_synpred33700);
            if (failed) return;
            match(input, TOK_LB, FOLLOW_TOK_LB_in_synpred33702);
            if (failed) return;
            pushFollow(FOLLOW_ctl_root_expr_in_synpred33704);
            ctl_root_expr();
            _fsp--;
            if (failed) return;
            match(input, TOK_BUNTIL, FOLLOW_TOK_BUNTIL_in_synpred33706);
            if (failed) return;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {
        // F:\\StudyAntlr\\SPC.g:461:11: ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )
        // F:\\StudyAntlr\\SPC.g:461:12: TOK_EE TOK_LB ctl_root_expr TOK_UNTIL
        {
            match(input, TOK_EE, FOLLOW_TOK_EE_in_synpred43726);
            if (failed) return;
            match(input, TOK_LB, FOLLOW_TOK_LB_in_synpred43728);
            if (failed) return;
            pushFollow(FOLLOW_ctl_root_expr_in_synpred43730);
            ctl_root_expr();
            _fsp--;
            if (failed) return;
            match(input, TOK_UNTIL, FOLLOW_TOK_UNTIL_in_synpred43732);
            if (failed) return;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {
        // F:\\StudyAntlr\\SPC.g:462:11: ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )
        // F:\\StudyAntlr\\SPC.g:462:12: TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL
        {
            match(input, TOK_EE, FOLLOW_TOK_EE_in_synpred53752);
            if (failed) return;
            match(input, TOK_LB, FOLLOW_TOK_LB_in_synpred53754);
            if (failed) return;
            pushFollow(FOLLOW_ctl_root_expr_in_synpred53756);
            ctl_root_expr();
            _fsp--;
            if (failed) return;
            match(input, TOK_BUNTIL, FOLLOW_TOK_BUNTIL_in_synpred53758);
            if (failed) return;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {
        // F:\\StudyAntlr\\SPC.g:768:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )
        // F:\\StudyAntlr\\SPC.g:768:12: ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE )
        {
            // F:\\StudyAntlr\\SPC.g:768:12: ( TOK_NOT )*
            loop86:
            do {
                int alt86 = 2;
                int LA86_0 = input.LA(1);

                if ((LA86_0 == TOK_NOT)) {
                    alt86 = 1;
                }


                switch (alt86) {
                    case 1:
                        // F:\\StudyAntlr\\SPC.g:768:12: TOK_NOT
                    {
                        match(input, TOK_NOT, FOLLOW_TOK_NOT_in_synpred67105);
                        if (failed) return;

                    }
                    break;

                    default:
                        break loop86;
                }
            } while (true);

            if ((input.LA(1) >= TOK_OP_NEXT && input.LA(1) <= TOK_OP_ONCE)) {
                input.consume();
                errorRecovery = false;
                failed = false;
            } else {
                if (backtracking > 0) {
                    failed = true;
                    return;
                }
                MismatchedSetException mse =
                        new MismatchedSetException(null, input);
                recoverFromMismatchedSet(input, mse, FOLLOW_set_in_synpred67118);
                throw mse;
            }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {
        // F:\\StudyAntlr\\SPC.g:1045:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_AA | TOK_EE | TOK_LT agent_list TOK_GT | TOK_LB agent_list TOK_RB ) )
        // F:\\StudyAntlr\\SPC.g:1045:12: ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_AA | TOK_EE | TOK_LT agent_list TOK_GT | TOK_LB agent_list TOK_RB )
        {
            // F:\\StudyAntlr\\SPC.g:1045:12: ( TOK_NOT )*
            loop87:
            do {
                int alt87 = 2;
                int LA87_0 = input.LA(1);

                if ((LA87_0 == TOK_NOT)) {
                    alt87 = 1;
                }


                switch (alt87) {
                    case 1:
                        // F:\\StudyAntlr\\SPC.g:1045:12: TOK_NOT
                    {
                        match(input, TOK_NOT, FOLLOW_TOK_NOT_in_synpred710166);
                        if (failed) return;

                    }
                    break;

                    default:
                        break loop87;
                }
            } while (true);

            // F:\\StudyAntlr\\SPC.g:1046:10: ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_AA | TOK_EE | TOK_LT agent_list TOK_GT | TOK_LB agent_list TOK_RB )
            int alt88 = 13;
            switch (input.LA(1)) {
                case TOK_OP_NEXT: {
                    alt88 = 1;
                }
                break;
                case TOK_OP_PREV: {
                    alt88 = 2;
                }
                break;
                case TOK_OP_NOTPREVNOT: {
                    alt88 = 3;
                }
                break;
                case TOK_OP_GLOBALLY: {
                    alt88 = 4;
                }
                break;
                case TOK_OP_HISTORICALLY: {
                    alt88 = 5;
                }
                break;
                case TOK_OP_FINALLY: {
                    alt88 = 6;
                }
                break;
                case TOK_OP_ONCE: {
                    alt88 = 7;
                }
                break;
                case TOK_OP_BFINALLY: {
                    alt88 = 8;
                }
                break;
                case TOK_OP_BGLOBALLY: {
                    alt88 = 9;
                }
                break;
                case TOK_AA: {
                    alt88 = 10;
                }
                break;
                case TOK_EE: {
                    alt88 = 11;
                }
                break;
                case TOK_LT: {
                    alt88 = 12;
                }
                break;
                case TOK_LB: {
                    alt88 = 13;
                }
                break;
                default:
                    if (backtracking > 0) {
                        failed = true;
                        return;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("1046:10: ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_AA | TOK_EE | TOK_LT agent_list TOK_GT | TOK_LB agent_list TOK_RB )", 88, 0, input);

                    throw nvae;
            }

            switch (alt88) {
                case 1:
                    // F:\\StudyAntlr\\SPC.g:1046:12: TOK_OP_NEXT
                {
                    match(input, TOK_OP_NEXT, FOLLOW_TOK_OP_NEXT_in_synpred710181);
                    if (failed) return;

                }
                break;
                case 2:
                    // F:\\StudyAntlr\\SPC.g:1047:12: TOK_OP_PREV
                {
                    match(input, TOK_OP_PREV, FOLLOW_TOK_OP_PREV_in_synpred710194);
                    if (failed) return;

                }
                break;
                case 3:
                    // F:\\StudyAntlr\\SPC.g:1048:12: TOK_OP_NOTPREVNOT
                {
                    match(input, TOK_OP_NOTPREVNOT, FOLLOW_TOK_OP_NOTPREVNOT_in_synpred710207);
                    if (failed) return;

                }
                break;
                case 4:
                    // F:\\StudyAntlr\\SPC.g:1049:12: TOK_OP_GLOBALLY
                {
                    match(input, TOK_OP_GLOBALLY, FOLLOW_TOK_OP_GLOBALLY_in_synpred710220);
                    if (failed) return;

                }
                break;
                case 5:
                    // F:\\StudyAntlr\\SPC.g:1050:12: TOK_OP_HISTORICALLY
                {
                    match(input, TOK_OP_HISTORICALLY, FOLLOW_TOK_OP_HISTORICALLY_in_synpred710233);
                    if (failed) return;

                }
                break;
                case 6:
                    // F:\\StudyAntlr\\SPC.g:1051:12: TOK_OP_FINALLY
                {
                    match(input, TOK_OP_FINALLY, FOLLOW_TOK_OP_FINALLY_in_synpred710246);
                    if (failed) return;

                }
                break;
                case 7:
                    // F:\\StudyAntlr\\SPC.g:1052:12: TOK_OP_ONCE
                {
                    match(input, TOK_OP_ONCE, FOLLOW_TOK_OP_ONCE_in_synpred710259);
                    if (failed) return;

                }
                break;
                case 8:
                    // F:\\StudyAntlr\\SPC.g:1054:12: TOK_OP_BFINALLY
                {
                    match(input, TOK_OP_BFINALLY, FOLLOW_TOK_OP_BFINALLY_in_synpred710283);
                    if (failed) return;

                }
                break;
                case 9:
                    // F:\\StudyAntlr\\SPC.g:1055:12: TOK_OP_BGLOBALLY
                {
                    match(input, TOK_OP_BGLOBALLY, FOLLOW_TOK_OP_BGLOBALLY_in_synpred710296);
                    if (failed) return;

                }
                break;
                case 10:
                    // F:\\StudyAntlr\\SPC.g:1057:12: TOK_AA
                {
                    match(input, TOK_AA, FOLLOW_TOK_AA_in_synpred710319);
                    if (failed) return;

                }
                break;
                case 11:
                    // F:\\StudyAntlr\\SPC.g:1058:12: TOK_EE
                {
                    match(input, TOK_EE, FOLLOW_TOK_EE_in_synpred710332);
                    if (failed) return;

                }
                break;
                case 12:
                    // F:\\StudyAntlr\\SPC.g:1060:12: TOK_LT agent_list TOK_GT
                {
                    match(input, TOK_LT, FOLLOW_TOK_LT_in_synpred710355);
                    if (failed) return;
                    pushFollow(FOLLOW_agent_list_in_synpred710357);
                    agent_list();
                    _fsp--;
                    if (failed) return;
                    match(input, TOK_GT, FOLLOW_TOK_GT_in_synpred710359);
                    if (failed) return;

                }
                break;
                case 13:
                    // F:\\StudyAntlr\\SPC.g:1061:12: TOK_LB agent_list TOK_RB
                {
                    match(input, TOK_LB, FOLLOW_TOK_LB_in_synpred710372);
                    if (failed) return;
                    pushFollow(FOLLOW_agent_list_in_synpred710374);
                    agent_list();
                    _fsp--;
                    if (failed) return;
                    match(input, TOK_RB, FOLLOW_TOK_RB_in_synpred710376);
                    if (failed) return;

                }
                break;

            }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {
        // F:\\StudyAntlr\\SPC.g:1379:31: ( TOK_LB simple_root_expr TOK_RB )
        // F:\\StudyAntlr\\SPC.g:1379:32: TOK_LB simple_root_expr TOK_RB
        {
            match(input, TOK_LB, FOLLOW_TOK_LB_in_synpred812993);
            if (failed) return;
            pushFollow(FOLLOW_simple_root_expr_in_synpred812995);
            simple_root_expr();
            _fsp--;
            if (failed) return;
            match(input, TOK_RB, FOLLOW_TOK_RB_in_synpred812997);
            if (failed) return;

        }
    }
    // $ANTLR end synpred8

    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed = false;
        return success;
    }

    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed = false;
        return success;
    }

    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed = false;
        return success;
    }

    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed = false;
        return success;
    }

    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed = false;
        return success;
    }

    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed = false;
        return success;
    }

    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed = false;
        return success;
    }

    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed = false;
        return success;
    }


    public static final BitSet FOLLOW_EOF_in_spec189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_list_in_spec201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_spec203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_element_in_spec_list267 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_spec_element_in_spec_list283 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_invar_spec_in_spec_element326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_spec_in_spec_element340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_spec_in_spec_element354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atls_spec_in_spec_element368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_INVAR_SPEC_in_invar_spec407 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_invar_spec410 = new BitSet(new long[]{0x0000000000000002L, 0x0000004000000000L});
    public static final BitSet FOLLOW_optsemi_in_invar_spec412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CTL_SPEC_in_ctl_spec451 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_spec454 = new BitSet(new long[]{0x0000000000000002L, 0x0000004000000000L});
    public static final BitSet FOLLOW_optsemi_in_ctl_spec456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LTL_SPEC_in_ltl_spec495 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_root_expr_in_ltl_spec498 = new BitSet(new long[]{0x0000000000000002L, 0x0000004000000000L});
    public static final BitSet FOLLOW_optsemi_in_ltl_spec500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ATL_STAR_SPEC_in_atls_spec540 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_root_expr_in_atls_spec543 = new BitSet(new long[]{0x0000000000000002L, 0x0000004000000000L});
    public static final BitSet FOLLOW_optsemi_in_atls_spec545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implies_expr_in_simple_root_expr587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iff_expr_in_implies_expr631 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_implies_expr647 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_implies_expr_in_implies_expr652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_iff_expr718 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_iff_expr734 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_or_expr_in_iff_expr739 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr804 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_OR_in_or_expr820 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_and_expr_in_or_expr825 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_or_expr849 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_and_expr_in_or_expr854 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_or_expr878 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_and_expr_in_or_expr883 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_relational_expr_in_and_expr947 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_TOK_AND_in_and_expr963 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_relational_expr_in_and_expr968 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1031 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_relational_expr1047 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1052 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_relational_expr1077 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1082 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_LT_in_relational_expr1107 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1112 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_GT_in_relational_expr1137 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1142 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_LE_in_relational_expr1167 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1172 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_GE_in_relational_expr1197 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1202 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_union_expr_in_in_expr1267 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_in_expr1283 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_union_expr_in_in_expr1288 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_set_expr_in_union_expr1352 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_union_expr1368 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_set_expr_in_union_expr1373 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_shift_expr_in_set_expr1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_set_expr1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_set_expr1480 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_set_list_expr_in_set_expr1482 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_set_expr1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_set_list_expr1538 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_set_list_expr1541 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_set_list_expr1544 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1589 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_shift_expr1605 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1610 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_shift_expr1634 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1639 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_additive_expr_in_remainder_expr1702 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_remainder_expr1718 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_additive_expr_in_remainder_expr1723 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1786 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_additive_expr1802 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1807 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_additive_expr1831 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1836 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1898 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_multiplicative_expr1914 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1919 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_multiplicative_expr1943 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1948 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_concatination_expr2010 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_concatination_expr2026 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_primary_expr_in_concatination_expr2031 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_in_primary_expr2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_primary_expr2143 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_primary_expr_in_primary_expr2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_primary_expr2187 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_primary_expr_in_primary_expr2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expr_helper12256 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_primary_expr_helper12300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12333 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12335 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12337 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_primary_expr_helper12381 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12384 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12386 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12388 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_primary_expr_helper12433 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12435 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12437 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12439 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_primary_expr_helper12483 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12485 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12487 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12489 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_primary_expr_helper12533 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_case_element_list_expr_in_primary_expr_helper12535 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000001L});
    public static final BitSet FOLLOW_TOK_ESAC_in_primary_expr_helper12537 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_primary_expr_helper12581 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12583 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12585 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12587 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12589 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12591 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_primary_expr_helper12637 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12639 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12641 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12643 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12645 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12647 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12649 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12651 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_implies_expr_in_ctl_root_expr2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_iff_expr_in_ctl_implies_expr2764 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ctl_implies_expr2780 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_implies_expr_in_ctl_implies_expr2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_or_expr_in_ctl_iff_expr2850 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ctl_iff_expr2866 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_or_expr_in_ctl_iff_expr2871 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2935 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ctl_or_expr2951 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2956 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ctl_or_expr2980 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2985 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ctl_or_expr3009 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr3014 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_ctl_expr_in_ctl_and_expr3077 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ctl_and_expr3093 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_ctl_and_expr3098 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_pure_ctl_expr_in_ctl_expr3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_relational_expr_in_ctl_expr3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EX_in_pure_ctl_expr3429 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AX_in_pure_ctl_expr3458 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EF_in_pure_ctl_expr3487 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AF_in_pure_ctl_expr3516 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EG_in_pure_ctl_expr3545 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AG_in_pure_ctl_expr3574 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_au_in_pure_ctl_expr3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_abu_in_pure_ctl_expr3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_eu_in_pure_ctl_expr3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_ebu_in_pure_ctl_expr3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBF_in_pure_ctl_expr3779 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3784 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABF_in_pure_ctl_expr3812 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3817 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBG_in_pure_ctl_expr3845 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3850 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABG_in_pure_ctl_expr3878 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3883 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_pure_ctl_expr3921 = new BitSet(new long[]{0x0200000000000000L, 0x0000000000023FF8L});
    public static final BitSet FOLLOW_pure_ctl_expr_in_pure_ctl_expr3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctl_au3980 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000004000L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_au3985 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_au3990 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000008000L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctl_au3994 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_au3998 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000010000L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_au4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctl_eu4057 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000004000L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_eu4062 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_eu4067 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000008000L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctl_eu4071 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_eu4075 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000010000L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_eu4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctl_abu4134 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000004000L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_abu4139 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_abu4144 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000040000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctl_abu4148 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_subrange_in_ctl_abu4152 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_abu4156 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000010000L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_abu4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctl_ebu4215 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000004000L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_ebu4220 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_ebu4225 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000040000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctl_ebu4229 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_subrange_in_ctl_ebu4233 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_ebu4237 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000010000L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_ebu4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4302 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ctl_relational_expr4318 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4323 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ctl_relational_expr4348 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4353 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ctl_relational_expr4378 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4383 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ctl_relational_expr4408 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4413 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ctl_relational_expr4438 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4443 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ctl_relational_expr4468 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4473 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_ctl_union_expr_in_ctl_in_expr4537 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ctl_in_expr4553 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_union_expr_in_ctl_in_expr4558 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ctl_set_expr_in_ctl_union_expr4621 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ctl_union_expr4637 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_set_expr_in_ctl_union_expr4642 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ctl_shift_expr_in_ctl_set_expr4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ctl_set_expr4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ctl_set_expr4748 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_set_list_expr_in_ctl_set_expr4750 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ctl_set_expr4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_set_list_expr4805 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_set_list_expr4808 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_set_list_expr4811 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4857 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ctl_shift_expr4873 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4878 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ctl_shift_expr4902 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4907 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4969 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ctl_remainder_expr4985 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4990 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5054 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ctl_additive_expr5070 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5075 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctl_additive_expr5099 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5104 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5165 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ctl_multiplicative_expr5181 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5186 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ctl_multiplicative_expr5210 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5215 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5276 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ctl_concatination_expr5292 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5297 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ctl_primary_expr_helper1_in_ctl_primary_expr5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctl_primary_expr5390 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_primary_expr5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctl_primary_expr5435 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_primary_expr5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ctl_primary_expr_helper15504 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ctl_primary_expr_helper15557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_know_in_ctl_primary_expr_helper15600 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_sknow_in_ctl_primary_expr_helper15646 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15702 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_primary_expr_helper15704 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15706 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ctl_primary_expr_helper15779 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15781 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15783 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15785 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ctl_primary_expr_helper15838 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15840 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15842 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15844 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ctl_primary_expr_helper15906 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15908 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15910 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15912 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ctl_primary_expr_helper15974 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ctl_primary_expr_helper15976 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000001L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ctl_primary_expr_helper15978 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ctl_primary_expr_helper16040 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper16042 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16046 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16048 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16052 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper16054 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ctl_primary_expr_helper16120 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper16122 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16126 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16130 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16134 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16138 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16142 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper16144 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_know6235 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000200000L});
    public static final BitSet FOLLOW_agent_name_in_ctl_know6240 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_TOK_KNOW_in_ctl_know6244 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_know6249 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_know6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_sknow6317 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000200000L});
    public static final BitSet FOLLOW_agent_name_in_ctl_sknow6322 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000100000L});
    public static final BitSet FOLLOW_TOK_SKNOW_in_ctl_sknow6326 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_sknow6331 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_sknow6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ATOM_in_agent_name6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_implies_expr_in_ltl_root_expr6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_iff_expr_in_ltl_implies_expr6505 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ltl_implies_expr6521 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_implies_expr_in_ltl_implies_expr6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_or_expr_in_ltl_iff_expr6591 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ltl_iff_expr6607 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_or_expr_in_ltl_iff_expr6612 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6676 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ltl_or_expr6692 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6697 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ltl_or_expr6721 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6726 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ltl_or_expr6750 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6755 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_ltl_binary_expr_in_ltl_and_expr6818 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ltl_and_expr6834 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_binary_expr_in_ltl_and_expr6839 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6904 = new BitSet(new long[]{0x0000000000000002L, 0x0000000001C88000L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ltl_binary_expr6920 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6925 = new BitSet(new long[]{0x0000000000000002L, 0x0000000001C88000L});
    public static final BitSet FOLLOW_TOK_SINCE_in_ltl_binary_expr6950 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6955 = new BitSet(new long[]{0x0000000000000002L, 0x0000000001C88000L});
    public static final BitSet FOLLOW_TOK_RELEASE_in_ltl_binary_expr6980 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6985 = new BitSet(new long[]{0x0000000000000002L, 0x0000000001C88000L});
    public static final BitSet FOLLOW_TOK_TRIGGERED_in_ltl_binary_expr7010 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr7015 = new BitSet(new long[]{0x0000000000000002L, 0x0000000001C88000L});
    public static final BitSet FOLLOW_TOK_KNOW_in_ltl_binary_expr7048 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr7053 = new BitSet(new long[]{0x0000000000000002L, 0x0000000001C88000L});
    public static final BitSet FOLLOW_ltl_pure_unary_expr_in_ltl_unary_expr7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_relational_expr_in_ltl_unary_expr7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NEXT_in_ltl_pure_unary_expr7298 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_PREV_in_ltl_pure_unary_expr7327 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_ltl_pure_unary_expr7356 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_ltl_pure_unary_expr7385 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_ltl_pure_unary_expr7414 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_FINALLY_in_ltl_pure_unary_expr7443 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_ONCE_in_ltl_pure_unary_expr7472 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ltl_pure_unary_expr7511 = new BitSet(new long[]{0x0200000000000000L, 0x00000000FE000000L});
    public static final BitSet FOLLOW_ltl_pure_unary_expr_in_ltl_pure_unary_expr7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7568 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ltl_relational_expr7584 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7589 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ltl_relational_expr7614 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7619 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ltl_relational_expr7644 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7649 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ltl_relational_expr7674 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7679 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ltl_relational_expr7704 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7709 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ltl_relational_expr7734 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7739 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_ltl_union_expr_in_ltl_in_expr7803 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ltl_in_expr7819 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_union_expr_in_ltl_in_expr7824 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ltl_set_expr_in_ltl_union_expr7887 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ltl_union_expr7903 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_set_expr_in_ltl_union_expr7908 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ltl_shift_expr_in_ltl_set_expr7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ltl_set_expr7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ltl_set_expr8014 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_set_list_expr_in_ltl_set_expr8016 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ltl_set_expr8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_set_list_expr8071 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_set_list_expr8074 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_set_list_expr8077 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8123 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ltl_shift_expr8139 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8144 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ltl_shift_expr8168 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8173 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8235 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ltl_remainder_expr8251 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8256 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8320 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ltl_additive_expr8336 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8341 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ltl_additive_expr8365 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8370 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8431 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ltl_multiplicative_expr8447 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8452 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ltl_multiplicative_expr8476 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8481 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8542 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ltl_concatination_expr8558 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8563 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ltl_primary_expr_helper1_in_ltl_primary_expr8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ltl_primary_expr8648 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_primary_expr8652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ltl_primary_expr8693 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_primary_expr8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ltl_primary_expr_helper18762 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ltl_primary_expr_helper18815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18868 = new BitSet(new long[]{0xF630400000000000L, 0x00000690FE200006L});
    public static final BitSet FOLLOW_ltl_root_expr_in_ltl_primary_expr_helper18870 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18872 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ltl_primary_expr_helper18945 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18947 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18949 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18951 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ltl_primary_expr_helper19004 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19006 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19008 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19010 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ltl_primary_expr_helper19072 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19074 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19076 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19078 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ltl_primary_expr_helper19140 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ltl_primary_expr_helper19142 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000001L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ltl_primary_expr_helper19144 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ltl_primary_expr_helper19206 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19208 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19212 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19214 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19218 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19220 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ltl_primary_expr_helper19286 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19288 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19292 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19296 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19300 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19304 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19308 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19310 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atls_implies_expr_in_atls_root_expr9392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atls_iff_expr_in_atls_implies_expr9435 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_atls_implies_expr9451 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_implies_expr_in_atls_implies_expr9456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atls_or_expr_in_atls_iff_expr9521 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_atls_iff_expr9537 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_or_expr_in_atls_iff_expr9542 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_atls_and_expr_in_atls_or_expr9605 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_OR_in_atls_or_expr9621 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_and_expr_in_atls_or_expr9626 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_atls_or_expr9650 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_and_expr_in_atls_or_expr9655 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_atls_or_expr9679 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_and_expr_in_atls_or_expr9684 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_atls_ltl_binary_expr_in_atls_and_expr9747 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_TOK_AND_in_atls_and_expr9763 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_binary_expr_in_atls_and_expr9768 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr9833 = new BitSet(new long[]{0x0000000000000002L, 0x0000000101DC8000L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_atls_ltl_binary_expr9867 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr9872 = new BitSet(new long[]{0x0000000000000002L, 0x0000000101DC8000L});
    public static final BitSet FOLLOW_TOK_SINCE_in_atls_ltl_binary_expr9897 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr9902 = new BitSet(new long[]{0x0000000000000002L, 0x0000000101DC8000L});
    public static final BitSet FOLLOW_TOK_RELEASE_in_atls_ltl_binary_expr9927 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr9932 = new BitSet(new long[]{0x0000000000000002L, 0x0000000101DC8000L});
    public static final BitSet FOLLOW_TOK_TRIGGERED_in_atls_ltl_binary_expr9957 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr9962 = new BitSet(new long[]{0x0000000000000002L, 0x0000000101DC8000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_atls_ltl_binary_expr9994 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_subrange_in_atls_ltl_binary_expr9999 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr10003 = new BitSet(new long[]{0x0000000000000002L, 0x0000000101DC8000L});
    public static final BitSet FOLLOW_TOK_BRELEASE_in_atls_ltl_binary_expr10028 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_subrange_in_atls_ltl_binary_expr10033 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr10037 = new BitSet(new long[]{0x0000000000000002L, 0x0000000101DC8000L});
    public static final BitSet FOLLOW_TOK_KNOW_in_atls_ltl_binary_expr10071 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr10076 = new BitSet(new long[]{0x0000000000000002L, 0x0000000101DC8000L});
    public static final BitSet FOLLOW_TOK_SKNOW_in_atls_ltl_binary_expr10100 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_binary_expr10105 = new BitSet(new long[]{0x0000000000000002L, 0x0000000101DC8000L});
    public static final BitSet FOLLOW_atls_ltl_pure_unary_expr_in_atls_ltl_unary_expr10392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atls_relational_expr_in_atls_ltl_unary_expr10435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NEXT_in_atls_ltl_pure_unary_expr10494 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_PREV_in_atls_ltl_pure_unary_expr10523 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_atls_ltl_pure_unary_expr10552 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_atls_ltl_pure_unary_expr10581 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_atls_ltl_pure_unary_expr10610 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_FINALLY_in_atls_ltl_pure_unary_expr10639 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_ONCE_in_atls_ltl_pure_unary_expr10668 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_BFINALLY_in_atls_ltl_pure_unary_expr10715 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_subrange_in_atls_ltl_pure_unary_expr10720 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_BGLOBALLY_in_atls_ltl_pure_unary_expr10748 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_subrange_in_atls_ltl_pure_unary_expr10753 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_atls_ltl_pure_unary_expr10791 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_atls_ltl_pure_unary_expr10820 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LT_in_atls_ltl_pure_unary_expr10868 = new BitSet(new long[]{0x0000020000000000L, 0x0000000000200000L});
    public static final BitSet FOLLOW_agent_list_in_atls_ltl_pure_unary_expr10872 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_GT_in_atls_ltl_pure_unary_expr10876 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_atls_ltl_pure_unary_expr10914 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000210000L});
    public static final BitSet FOLLOW_agent_list_in_atls_ltl_pure_unary_expr10918 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000010000L});
    public static final BitSet FOLLOW_TOK_RB_in_atls_ltl_pure_unary_expr10922 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_ltl_unary_expr_in_atls_ltl_pure_unary_expr10926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_atls_ltl_pure_unary_expr10969 = new BitSet(new long[]{0x0200010000000000L, 0x00000006FE026000L});
    public static final BitSet FOLLOW_atls_ltl_pure_unary_expr_in_atls_ltl_pure_unary_expr10974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_agent_name_in_agent_list11020 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_agent_list11026 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000200000L});
    public static final BitSet FOLLOW_agent_name_in_agent_list11031 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_atls_in_expr_in_atls_relational_expr11071 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_atls_relational_expr11087 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_in_expr_in_atls_relational_expr11092 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_atls_relational_expr11117 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_in_expr_in_atls_relational_expr11122 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_LT_in_atls_relational_expr11147 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_in_expr_in_atls_relational_expr11152 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_GT_in_atls_relational_expr11177 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_in_expr_in_atls_relational_expr11182 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_LE_in_atls_relational_expr11207 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_in_expr_in_atls_relational_expr11212 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_TOK_GE_in_atls_relational_expr11237 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_in_expr_in_atls_relational_expr11242 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_atls_union_expr_in_atls_in_expr11305 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_atls_in_expr11321 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_union_expr_in_atls_in_expr11326 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_atls_set_expr_in_atls_union_expr11389 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_atls_union_expr11405 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_set_expr_in_atls_union_expr11410 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_atls_shift_expr_in_atls_set_expr11472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_atls_set_expr11494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_atls_set_expr11517 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_set_list_expr_in_atls_set_expr11519 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_atls_set_expr11521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_atls_set_list_expr11574 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_atls_set_list_expr11577 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_atls_set_list_expr11580 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_atls_remainder_expr_in_atls_shift_expr11626 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_atls_shift_expr11642 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_remainder_expr_in_atls_shift_expr11647 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_atls_shift_expr11671 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_remainder_expr_in_atls_shift_expr11676 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_atls_additive_expr_in_atls_remainder_expr11738 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_atls_remainder_expr11754 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_additive_expr_in_atls_remainder_expr11759 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_atls_multiplicative_expr_in_atls_additive_expr11824 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_atls_additive_expr11840 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_multiplicative_expr_in_atls_additive_expr11845 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_atls_additive_expr11869 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_multiplicative_expr_in_atls_additive_expr11874 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_atls_concatination_expr_in_atls_multiplicative_expr11934 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_atls_multiplicative_expr11950 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_concatination_expr_in_atls_multiplicative_expr11955 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_atls_multiplicative_expr11979 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_concatination_expr_in_atls_multiplicative_expr11984 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_atls_primary_expr_in_atls_concatination_expr12045 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_atls_concatination_expr12061 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_primary_expr_in_atls_concatination_expr12066 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_atls_primary_expr_helper1_in_atls_primary_expr12135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_atls_primary_expr12159 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_primary_expr_in_atls_primary_expr12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_atls_primary_expr12204 = new BitSet(new long[]{0xF630000000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_atls_primary_expr_in_atls_primary_expr12208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_atls_primary_expr_helper112273 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_atls_primary_expr_helper112275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_atls_primary_expr_helper112326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_atls_primary_expr_helper112379 = new BitSet(new long[]{0xF630410000000000L, 0x00000696FE226006L});
    public static final BitSet FOLLOW_atls_root_expr_in_atls_primary_expr_helper112381 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_atls_primary_expr_helper112383 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_atls_primary_expr_helper112385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_atls_primary_expr_helper112456 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_atls_primary_expr_helper112458 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_atls_primary_expr_helper112460 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_atls_primary_expr_helper112462 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_atls_primary_expr_helper112464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_atls_primary_expr_helper112515 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_atls_primary_expr_helper112517 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_atls_primary_expr_helper112519 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_atls_primary_expr_helper112521 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_atls_primary_expr_helper112523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_atls_primary_expr_helper112583 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_atls_primary_expr_helper112585 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_atls_primary_expr_helper112587 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_atls_primary_expr_helper112589 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_atls_primary_expr_helper112591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_atls_primary_expr_helper112651 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_case_element_list_expr_in_atls_primary_expr_helper112653 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000001L});
    public static final BitSet FOLLOW_TOK_ESAC_in_atls_primary_expr_helper112655 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_atls_primary_expr_helper112657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_atls_primary_expr_helper112717 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_atls_primary_expr_helper112719 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_atls_primary_expr_helper112723 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_atls_primary_expr_helper112725 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_atls_primary_expr_helper112729 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_atls_primary_expr_helper112731 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_atls_primary_expr_helper112733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_atls_primary_expr_helper112797 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_atls_primary_expr_helper112799 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_atls_primary_expr_helper112803 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_atls_primary_expr_helper112807 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_atls_primary_expr_helper112811 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_atls_primary_expr_helper112815 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_atls_primary_expr_helper112819 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_atls_primary_expr_helper112821 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_atls_primary_expr_helper112823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ATOM_in_primary_expr_helper1_pointer112893 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper1_pointer112895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_in_primary_expr_select12938 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expr_ref_in_primary_expr_select12942 = new BitSet(new long[]{0x0000000000000002L, 0x0000000800004000L});
    public static final BitSet FOLLOW_TOK_DOT_in_primary_expr_ref12965 = new BitSet(new long[]{0x0000000000000000L, 0x0000001000200000L});
    public static final BitSet FOLLOW_set_in_primary_expr_ref12968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_arr_suffix_in_primary_expr_select_helper13002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_bit_suffix_in_primary_expr_select_helper13014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_primary_expr_select_helper_arr_suffix13038 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_arr_suffix13040 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000010000L});
    public static final BitSet FOLLOW_TOK_RB_in_primary_expr_select_helper_arr_suffix13042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_primary_expr_select_helper_bit_suffix13082 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13086 = new BitSet(new long[]{0x0000000000000000L, 0x0000002000000000L});
    public static final BitSet FOLLOW_TOK_COLON_in_primary_expr_select_helper_bit_suffix13088 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13092 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000010000L});
    public static final BitSet FOLLOW_TOK_RB_in_primary_expr_select_helper_bit_suffix13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_case_element_expr13142 = new BitSet(new long[]{0x0000000000000000L, 0x0000002000000000L});
    public static final BitSet FOLLOW_TOK_COLON_in_case_element_expr13144 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_case_element_expr13146 = new BitSet(new long[]{0x0000000000000000L, 0x0000004000000000L});
    public static final BitSet FOLLOW_TOK_SEMI_in_case_element_expr13148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_element_expr_in_case_element_list_expr13184 = new BitSet(new long[]{0xF630400000000002L, 0x0000069000200006L});
    public static final BitSet FOLLOW_case_element_expr_in_case_element_list_expr13187 = new BitSet(new long[]{0xF630400000000002L, 0x0000069000200006L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_number13212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_number13224 = new BitSet(new long[]{0x0000000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_number13227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_integer13268 = new BitSet(new long[]{0x0000000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_integer13298 = new BitSet(new long[]{0x0000000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NUMBER_WORD_in_number_word13337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_subrange13376 = new BitSet(new long[]{0x0000000000000000L, 0x0000010000000000L});
    public static final BitSet FOLLOW_TOK_TWODOTS_in_subrange13378 = new BitSet(new long[]{0x0030000000000000L, 0x0000001000000000L});
    public static final BitSet FOLLOW_integer_in_subrange13382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_FALSEEXP_in_constant13431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_TRUEEXP_in_constant13443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_constant13455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_word_in_constant13467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_SEMI_in_optsemi13492 = new BitSet(new long[]{0x0000000000000002L, 0x0000004000000000L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred13151 = new BitSet(new long[]{0x0200000000000000L, 0x0000000000023FF8L});
    public static final BitSet FOLLOW_set_in_synpred13164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred23674 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000004000L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred23676 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred23678 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000008000L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_synpred23680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred33700 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000004000L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred33702 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred33704 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000040000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred33706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred43726 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000004000L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred43728 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred43730 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000008000L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_synpred43732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred53752 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000004000L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred53754 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000223FFEL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred53756 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000040000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred53758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred67105 = new BitSet(new long[]{0x0200000000000000L, 0x00000000FE000000L});
    public static final BitSet FOLLOW_set_in_synpred67118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred710166 = new BitSet(new long[]{0x0200010000000000L, 0x00000006FE026000L});
    public static final BitSet FOLLOW_TOK_OP_NEXT_in_synpred710181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_PREV_in_synpred710194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_synpred710207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_synpred710220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_synpred710233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_FINALLY_in_synpred710246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_ONCE_in_synpred710259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_BFINALLY_in_synpred710283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_BGLOBALLY_in_synpred710296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred710319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred710332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LT_in_synpred710355 = new BitSet(new long[]{0x0000020000000000L, 0x0000000000200000L});
    public static final BitSet FOLLOW_agent_list_in_synpred710357 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_GT_in_synpred710359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred710372 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000210000L});
    public static final BitSet FOLLOW_agent_list_in_synpred710374 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000010000L});
    public static final BitSet FOLLOW_TOK_RB_in_synpred710376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred812993 = new BitSet(new long[]{0xF630400000000000L, 0x0000069000200006L});
    public static final BitSet FOLLOW_simple_root_expr_in_synpred812995 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000010000L});
    public static final BitSet FOLLOW_TOK_RB_in_synpred812997 = new BitSet(new long[]{0x0000000000000002L});

}