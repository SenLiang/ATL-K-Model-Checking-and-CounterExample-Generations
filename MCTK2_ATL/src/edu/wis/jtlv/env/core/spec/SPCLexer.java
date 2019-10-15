// $ANTLR 3.0.1 F:\\StudyAntlr\\SPC.g 2018-06-03 21:04:55

package edu.wis.jtlv.env.core.spec;
import edu.wis.jtlv.env.Env;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SPCLexer extends Lexer {
    public static final int TOK_PLUS=52;
    public static final int TOK_RCB=47;
    public static final int CTL_KNOW_T=19;
    public static final int TOK_UNARY_MINUS_T=14;
    public static final int TOK_XOR=35;
    public static final int ARRAY_INDEX_T=13;
    public static final int TOK_ABG=76;
    public static final int TOK_ABF=74;
    public static final int TOK_TIMES=54;
    public static final int AGENT_SET_LIST_T=27;
    public static final int TOK_EBG=75;
    public static final int TOK_EBF=73;
    public static final int Tokens=113;
    public static final int TOK_LP=58;
    public static final int TOK_LT=40;
    public static final int CTLS_KNOW_T=23;
    public static final int TOK_COLON=101;
    public static final int JTOK_MULTI_COMMENT=111;
    public static final int TOK_SETIN=44;
    public static final int SPEC_LIST_T=5;
    public static final int TOK_BRELEASE=96;
    public static final int TOK_EQUAL=38;
    public static final int TOK_LB=78;
    public static final int TOK_TRUEEXP=106;
    public static final int TOK_BUNTIL=82;
    public static final int TOK_LE=42;
    public static final int TOK_OP_BGLOBALLY=98;
    public static final int TOK_UNTIL=79;
    public static final int TOK_DOT=99;
    public static final int SUBRANGE_T=6;
    public static final int CASE_ELEMENT_EXPR_T=11;
    public static final int TOK_CTL_SKNOW_T=22;
    public static final int TOK_ATOM=85;
    public static final int TOK_XNOR=36;
    public static final int TOK_AG=72;
    public static final int TOK_AF=70;
    public static final int TOK_WAWRITE=66;
    public static final int TOK_RB=80;
    public static final int TOK_OP_ONCE=95;
    public static final int TOK_CTL_KNOW_T=20;
    public static final int TOK_SEMI=102;
    public static final int TOK_OP_BFINALLY=97;
    public static final int TOK_AA=77;
    public static final int TOK_NUMBER_FRAC=109;
    public static final int TOK_MINUS=53;
    public static final int TOK_NUMBER_WORD=103;
    public static final int PURE_ATL_STAR_T=26;
    public static final int TOK_IMPLIES=32;
    public static final int TOK_KNOW=83;
    public static final int TOK_AX=68;
    public static final int JTOK_WS=110;
    public static final int TOK_OP_GLOBALLY=92;
    public static final int TOK_FALSEEXP=105;
    public static final int TOK_RP=59;
    public static final int VALUE_T=7;
    public static final int TOK_RSHIFT=50;
    public static final int TOK_SINCE=86;
    public static final int TOK_WAREAD=65;
    public static final int TOK_OR=34;
    public static final int TOK_OP_NOTPREVNOT=91;
    public static final int TOK_NOT=57;
    public static final int TOK_OP_PREV=90;
    public static final int BLOCK_T=9;
    public static final int TOK_LSHIFT=49;
    public static final int CTL_SKNOW_T=21;
    public static final int TOK_AND=37;
    public static final int TOK_GT=41;
    public static final int TOK_ATL_STAR_SPEC=31;
    public static final int TOK_TRIGGERED=88;
    public static final int TOK_AGENT_NAME_T=24;
    public static final int TOK_CASE=63;
    public static final int TOK_IFF=33;
    public static final int TOK_CTL_STAR_SPEC=107;
    public static final int TOK_GE=43;
    public static final int SET_LIST_EXP_T=8;
    public static final int CASE_LIST_EXPR_T=10;
    public static final int TOK_TWODOTS=104;
    public static final int NOP=4;
    public static final int TOK_COMMA=48;
    public static final int TOK_UNION=45;
    public static final int TOK_NUMBER=100;
    public static final int TOK_LTL_SPEC=30;
    public static final int TOK_ESAC=64;
    public static final int TOK_SKNOW=84;
    public static final int TOK_LCB=46;
    public static final int TOK_DIVIDE=55;
    public static final int TOK_OP_NEXT=89;
    public static final int PURE_CTL_EPISTEMIC_T=18;
    public static final int TOK_EG=71;
    public static final int TOK_EF=69;
    public static final int TOK_RELEASE=87;
    public static final int PURE_CTL_T=15;
    public static final int TOK_NOTEQUAL=39;
    public static final int ATLS_PURE_CTL_T=17;
    public static final int BIT_SELECT_T=12;
    public static final int TOK_INVAR_SPEC=28;
    public static final int TOK_EE=81;
    public static final int EOF=-1;
    public static final int TOK_BOOL=60;
    public static final int PURE_LTL_T=16;
    public static final int TOK_OP_FINALLY=94;
    public static final int JTOK_LINE_COMMENT=112;
    public static final int TOK_OP_HISTORICALLY=93;
    public static final int PURE_ATLS_T=25;
    public static final int TOK_WORD1=61;
    public static final int TOK_CONCATENATION=56;
    public static final int TOK_NEXT=62;
    public static final int TOK_EX=67;
    public static final int TOK_MOD=51;
    public static final int TOK_WORD=108;
    public static final int TOK_CTL_SPEC=29;

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

    public SPCLexer() {;}
    public SPCLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "F:\\StudyAntlr\\SPC.g"; }

    // $ANTLR start TOK_CTL_SPEC
    public final void mTOK_CTL_SPEC() throws RecognitionException {
        try {
            int _type = TOK_CTL_SPEC;
            // F:\\StudyAntlr\\SPC.g:1431:17: ( 'CTLSPEC' | 'SPEC' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='C') ) {
                alt1=1;
            }
            else if ( (LA1_0=='S') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1431:1: TOK_CTL_SPEC : ( 'CTLSPEC' | 'SPEC' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1431:19: 'CTLSPEC'
                {
                    match("CTLSPEC");


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1431:31: 'SPEC'
                {
                    match("SPEC");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_CTL_SPEC

    // $ANTLR start TOK_CTL_STAR_SPEC
    public final void mTOK_CTL_STAR_SPEC() throws RecognitionException {
        try {
            int _type = TOK_CTL_STAR_SPEC;
            // F:\\StudyAntlr\\SPC.g:1432:21: ( 'CTL*SPEC' )
            // F:\\StudyAntlr\\SPC.g:1432:23: 'CTL*SPEC'
            {
                match("CTL*SPEC");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_CTL_STAR_SPEC

    // $ANTLR start TOK_LTL_SPEC
    public final void mTOK_LTL_SPEC() throws RecognitionException {
        try {
            int _type = TOK_LTL_SPEC;
            // F:\\StudyAntlr\\SPC.g:1433:17: ( 'LTLSPEC' )
            // F:\\StudyAntlr\\SPC.g:1433:19: 'LTLSPEC'
            {
                match("LTLSPEC");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LTL_SPEC

    // $ANTLR start TOK_INVAR_SPEC
    public final void mTOK_INVAR_SPEC() throws RecognitionException {
        try {
            int _type = TOK_INVAR_SPEC;
            // F:\\StudyAntlr\\SPC.g:1434:19: ( 'INVARSPEC' )
            // F:\\StudyAntlr\\SPC.g:1434:21: 'INVARSPEC'
            {
                match("INVARSPEC");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_INVAR_SPEC

    // $ANTLR start TOK_ATL_STAR_SPEC
    public final void mTOK_ATL_STAR_SPEC() throws RecognitionException {
        try {
            int _type = TOK_ATL_STAR_SPEC;
            // F:\\StudyAntlr\\SPC.g:1435:21: ( 'ATL*SPEC' )
            // F:\\StudyAntlr\\SPC.g:1435:23: 'ATL*SPEC'
            {
                match("ATL*SPEC");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_ATL_STAR_SPEC

    // $ANTLR start TOK_EX
    public final void mTOK_EX() throws RecognitionException {
        try {
            int _type = TOK_EX;
            // F:\\StudyAntlr\\SPC.g:1437:13: ( 'EX' )
            // F:\\StudyAntlr\\SPC.g:1437:15: 'EX'
            {
                match("EX");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EX

    // $ANTLR start TOK_AX
    public final void mTOK_AX() throws RecognitionException {
        try {
            int _type = TOK_AX;
            // F:\\StudyAntlr\\SPC.g:1438:13: ( 'AX' )
            // F:\\StudyAntlr\\SPC.g:1438:15: 'AX'
            {
                match("AX");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_AX

    // $ANTLR start TOK_EF
    public final void mTOK_EF() throws RecognitionException {
        try {
            int _type = TOK_EF;
            // F:\\StudyAntlr\\SPC.g:1439:13: ( 'EF' )
            // F:\\StudyAntlr\\SPC.g:1439:15: 'EF'
            {
                match("EF");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EF

    // $ANTLR start TOK_AF
    public final void mTOK_AF() throws RecognitionException {
        try {
            int _type = TOK_AF;
            // F:\\StudyAntlr\\SPC.g:1440:13: ( 'AF' )
            // F:\\StudyAntlr\\SPC.g:1440:15: 'AF'
            {
                match("AF");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_AF

    // $ANTLR start TOK_EG
    public final void mTOK_EG() throws RecognitionException {
        try {
            int _type = TOK_EG;
            // F:\\StudyAntlr\\SPC.g:1441:13: ( 'EG' )
            // F:\\StudyAntlr\\SPC.g:1441:15: 'EG'
            {
                match("EG");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EG

    // $ANTLR start TOK_AG
    public final void mTOK_AG() throws RecognitionException {
        try {
            int _type = TOK_AG;
            // F:\\StudyAntlr\\SPC.g:1442:13: ( 'AG' )
            // F:\\StudyAntlr\\SPC.g:1442:15: 'AG'
            {
                match("AG");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_AG

    // $ANTLR start TOK_EE
    public final void mTOK_EE() throws RecognitionException {
        try {
            int _type = TOK_EE;
            // F:\\StudyAntlr\\SPC.g:1443:13: ( 'E' )
            // F:\\StudyAntlr\\SPC.g:1443:15: 'E'
            {
                match('E');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EE

    // $ANTLR start TOK_AA
    public final void mTOK_AA() throws RecognitionException {
        try {
            int _type = TOK_AA;
            // F:\\StudyAntlr\\SPC.g:1444:13: ( 'A' )
            // F:\\StudyAntlr\\SPC.g:1444:15: 'A'
            {
                match('A');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_AA

    // $ANTLR start TOK_BUNTIL
    public final void mTOK_BUNTIL() throws RecognitionException {
        try {
            int _type = TOK_BUNTIL;
            // F:\\StudyAntlr\\SPC.g:1445:16: ( 'BU' )
            // F:\\StudyAntlr\\SPC.g:1445:18: 'BU'
            {
                match("BU");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_BUNTIL

    // $ANTLR start TOK_EBF
    public final void mTOK_EBF() throws RecognitionException {
        try {
            int _type = TOK_EBF;
            // F:\\StudyAntlr\\SPC.g:1446:14: ( 'EBF' )
            // F:\\StudyAntlr\\SPC.g:1446:16: 'EBF'
            {
                match("EBF");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EBF

    // $ANTLR start TOK_ABF
    public final void mTOK_ABF() throws RecognitionException {
        try {
            int _type = TOK_ABF;
            // F:\\StudyAntlr\\SPC.g:1447:14: ( 'ABF' )
            // F:\\StudyAntlr\\SPC.g:1447:16: 'ABF'
            {
                match("ABF");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_ABF

    // $ANTLR start TOK_EBG
    public final void mTOK_EBG() throws RecognitionException {
        try {
            int _type = TOK_EBG;
            // F:\\StudyAntlr\\SPC.g:1448:14: ( 'EBG' )
            // F:\\StudyAntlr\\SPC.g:1448:16: 'EBG'
            {
                match("EBG");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EBG

    // $ANTLR start TOK_ABG
    public final void mTOK_ABG() throws RecognitionException {
        try {
            int _type = TOK_ABG;
            // F:\\StudyAntlr\\SPC.g:1449:14: ( 'ABG' )
            // F:\\StudyAntlr\\SPC.g:1449:16: 'ABG'
            {
                match("ABG");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_ABG

    // $ANTLR start TOK_OP_FINALLY
    public final void mTOK_OP_FINALLY() throws RecognitionException {
        try {
            int _type = TOK_OP_FINALLY;
            // F:\\StudyAntlr\\SPC.g:1451:19: ( 'F' | 'FINALLY' | 'EVENTUALLY' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='F') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='I') ) {
                    alt2=2;
                }
                else {
                    alt2=1;}
            }
            else if ( (LA2_0=='E') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1451:1: TOK_OP_FINALLY : ( 'F' | 'FINALLY' | 'EVENTUALLY' );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1451:21: 'F'
                {
                    match('F');

                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1451:27: 'FINALLY'
                {
                    match("FINALLY");


                }
                break;
                case 3 :
                    // F:\\StudyAntlr\\SPC.g:1451:39: 'EVENTUALLY'
                {
                    match("EVENTUALLY");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_FINALLY

    // $ANTLR start TOK_OP_ONCE
    public final void mTOK_OP_ONCE() throws RecognitionException {
        try {
            int _type = TOK_OP_ONCE;
            // F:\\StudyAntlr\\SPC.g:1452:16: ( 'O' | 'ONCE' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='O') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='N') ) {
                    alt3=2;
                }
                else {
                    alt3=1;}
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1452:1: TOK_OP_ONCE : ( 'O' | 'ONCE' );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1452:18: 'O'
                {
                    match('O');

                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1452:24: 'ONCE'
                {
                    match("ONCE");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_ONCE

    // $ANTLR start TOK_OP_GLOBALLY
    public final void mTOK_OP_GLOBALLY() throws RecognitionException {
        try {
            int _type = TOK_OP_GLOBALLY;
            // F:\\StudyAntlr\\SPC.g:1453:20: ( 'G' | 'GLOBALLY' | 'ALWAYS' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='G') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='L') ) {
                    alt4=2;
                }
                else {
                    alt4=1;}
            }
            else if ( (LA4_0=='A') ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1453:1: TOK_OP_GLOBALLY : ( 'G' | 'GLOBALLY' | 'ALWAYS' );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1453:22: 'G'
                {
                    match('G');

                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1453:28: 'GLOBALLY'
                {
                    match("GLOBALLY");


                }
                break;
                case 3 :
                    // F:\\StudyAntlr\\SPC.g:1453:41: 'ALWAYS'
                {
                    match("ALWAYS");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_GLOBALLY

    // $ANTLR start TOK_OP_HISTORICALLY
    public final void mTOK_OP_HISTORICALLY() throws RecognitionException {
        try {
            int _type = TOK_OP_HISTORICALLY;
            // F:\\StudyAntlr\\SPC.g:1454:23: ( 'H' | 'HISTORICALLY' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='H') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='I') ) {
                    alt5=2;
                }
                else {
                    alt5=1;}
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1454:1: TOK_OP_HISTORICALLY : ( 'H' | 'HISTORICALLY' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1454:25: 'H'
                {
                    match('H');

                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1454:31: 'HISTORICALLY'
                {
                    match("HISTORICALLY");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_HISTORICALLY

    // $ANTLR start TOK_OP_NEXT
    public final void mTOK_OP_NEXT() throws RecognitionException {
        try {
            int _type = TOK_OP_NEXT;
            // F:\\StudyAntlr\\SPC.g:1455:17: ( 'X' | 'NEXT' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='X') ) {
                alt6=1;
            }
            else if ( (LA6_0=='N') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1455:1: TOK_OP_NEXT : ( 'X' | 'NEXT' );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1455:19: 'X'
                {
                    match('X');

                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1455:25: 'NEXT'
                {
                    match("NEXT");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_NEXT

    // $ANTLR start TOK_OP_PREV
    public final void mTOK_OP_PREV() throws RecognitionException {
        try {
            int _type = TOK_OP_PREV;
            // F:\\StudyAntlr\\SPC.g:1456:17: ( 'Y' | 'PREV' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='Y') ) {
                alt7=1;
            }
            else if ( (LA7_0=='P') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1456:1: TOK_OP_PREV : ( 'Y' | 'PREV' );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1456:19: 'Y'
                {
                    match('Y');

                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1456:25: 'PREV'
                {
                    match("PREV");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_PREV

    // $ANTLR start TOK_UNTIL
    public final void mTOK_UNTIL() throws RecognitionException {
        try {
            int _type = TOK_UNTIL;
            // F:\\StudyAntlr\\SPC.g:1457:15: ( 'Until' | 'U' | 'UNTIL' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='U') ) {
                switch ( input.LA(2) ) {
                    case 'N':
                    {
                        alt8=3;
                    }
                    break;
                    case 'n':
                    {
                        alt8=1;
                    }
                    break;
                    default:
                        alt8=2;}

            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1457:1: TOK_UNTIL : ( 'Until' | 'U' | 'UNTIL' );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1457:17: 'Until'
                {
                    match("Until");


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1457:27: 'U'
                {
                    match('U');

                }
                break;
                case 3 :
                    // F:\\StudyAntlr\\SPC.g:1457:33: 'UNTIL'
                {
                    match("UNTIL");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_UNTIL

    // $ANTLR start TOK_SINCE
    public final void mTOK_SINCE() throws RecognitionException {
        try {
            int _type = TOK_SINCE;
            // F:\\StudyAntlr\\SPC.g:1458:15: ( 'Since' | 'S' | 'SINCE' )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='S') ) {
                switch ( input.LA(2) ) {
                    case 'I':
                    {
                        alt9=3;
                    }
                    break;
                    case 'i':
                    {
                        alt9=1;
                    }
                    break;
                    default:
                        alt9=2;}

            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1458:1: TOK_SINCE : ( 'Since' | 'S' | 'SINCE' );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1458:17: 'Since'
                {
                    match("Since");


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1458:27: 'S'
                {
                    match('S');

                }
                break;
                case 3 :
                    // F:\\StudyAntlr\\SPC.g:1458:33: 'SINCE'
                {
                    match("SINCE");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_SINCE

    // $ANTLR start TOK_RELEASE
    public final void mTOK_RELEASE() throws RecognitionException {
        try {
            int _type = TOK_RELEASE;
            // F:\\StudyAntlr\\SPC.g:1459:16: ( 'Awaits' | 'R' | 'RELEASE' )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='A') ) {
                alt10=1;
            }
            else if ( (LA10_0=='R') ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2=='E') ) {
                    alt10=3;
                }
                else {
                    alt10=2;}
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1459:1: TOK_RELEASE : ( 'Awaits' | 'R' | 'RELEASE' );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1459:18: 'Awaits'
                {
                    match("Awaits");


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1459:29: 'R'
                {
                    match('R');

                }
                break;
                case 3 :
                    // F:\\StudyAntlr\\SPC.g:1459:35: 'RELEASE'
                {
                    match("RELEASE");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_RELEASE

    // $ANTLR start TOK_TRIGGERED
    public final void mTOK_TRIGGERED() throws RecognitionException {
        try {
            int _type = TOK_TRIGGERED;
            // F:\\StudyAntlr\\SPC.g:1460:18: ( 'Backto' | 'T' | 'TRIGGERED' )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='B') ) {
                alt11=1;
            }
            else if ( (LA11_0=='T') ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2=='R') ) {
                    alt11=3;
                }
                else {
                    alt11=2;}
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1460:1: TOK_TRIGGERED : ( 'Backto' | 'T' | 'TRIGGERED' );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1460:20: 'Backto'
                {
                    match("Backto");


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1460:31: 'T'
                {
                    match('T');

                }
                break;
                case 3 :
                    // F:\\StudyAntlr\\SPC.g:1460:37: 'TRIGGERED'
                {
                    match("TRIGGERED");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_TRIGGERED

    // $ANTLR start TOK_OP_NOTPREVNOT
    public final void mTOK_OP_NOTPREVNOT() throws RecognitionException {
        try {
            int _type = TOK_OP_NOTPREVNOT;
            // F:\\StudyAntlr\\SPC.g:1461:21: ( 'Z' )
            // F:\\StudyAntlr\\SPC.g:1461:23: 'Z'
            {
                match('Z');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_NOTPREVNOT

    // $ANTLR start TOK_OP_BFINALLY
    public final void mTOK_OP_BFINALLY() throws RecognitionException {
        try {
            int _type = TOK_OP_BFINALLY;
            // F:\\StudyAntlr\\SPC.g:1464:20: ( 'BF' | 'BFINALLY' | 'BEVENTUALLY' )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='B') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='F') ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2=='I') ) {
                        alt12=2;
                    }
                    else {
                        alt12=1;}
                }
                else if ( (LA12_1=='E') ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                            new NoViableAltException("1464:1: TOK_OP_BFINALLY : ( 'BF' | 'BFINALLY' | 'BEVENTUALLY' );", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1464:1: TOK_OP_BFINALLY : ( 'BF' | 'BFINALLY' | 'BEVENTUALLY' );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1464:22: 'BF'
                {
                    match("BF");


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1464:29: 'BFINALLY'
                {
                    match("BFINALLY");


                }
                break;
                case 3 :
                    // F:\\StudyAntlr\\SPC.g:1464:42: 'BEVENTUALLY'
                {
                    match("BEVENTUALLY");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_BFINALLY

    // $ANTLR start TOK_OP_BGLOBALLY
    public final void mTOK_OP_BGLOBALLY() throws RecognitionException {
        try {
            int _type = TOK_OP_BGLOBALLY;
            // F:\\StudyAntlr\\SPC.g:1465:20: ( 'BG' | 'BGLOBALLY' | 'BALWAYS' )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='B') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='A') ) {
                    alt13=3;
                }
                else if ( (LA13_1=='G') ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3=='L') ) {
                        alt13=2;
                    }
                    else {
                        alt13=1;}
                }
                else {
                    NoViableAltException nvae =
                            new NoViableAltException("1465:1: TOK_OP_BGLOBALLY : ( 'BG' | 'BGLOBALLY' | 'BALWAYS' );", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1465:1: TOK_OP_BGLOBALLY : ( 'BG' | 'BGLOBALLY' | 'BALWAYS' );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1465:22: 'BG'
                {
                    match("BG");


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1465:29: 'BGLOBALLY'
                {
                    match("BGLOBALLY");


                }
                break;
                case 3 :
                    // F:\\StudyAntlr\\SPC.g:1465:43: 'BALWAYS'
                {
                    match("BALWAYS");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_BGLOBALLY

    // $ANTLR start TOK_BRELEASE
    public final void mTOK_BRELEASE() throws RecognitionException {
        try {
            int _type = TOK_BRELEASE;
            // F:\\StudyAntlr\\SPC.g:1466:17: ( 'BR' | 'BRELEASE' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='B') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='R') ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2=='E') ) {
                        alt14=2;
                    }
                    else {
                        alt14=1;}
                }
                else {
                    NoViableAltException nvae =
                            new NoViableAltException("1466:1: TOK_BRELEASE : ( 'BR' | 'BRELEASE' );", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1466:1: TOK_BRELEASE : ( 'BR' | 'BRELEASE' );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1466:19: 'BR'
                {
                    match("BR");


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1466:26: 'BRELEASE'
                {
                    match("BRELEASE");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_BRELEASE

    // $ANTLR start TOK_KNOW
    public final void mTOK_KNOW() throws RecognitionException {
        try {
            int _type = TOK_KNOW;
            // F:\\StudyAntlr\\SPC.g:1470:13: ( 'K' | 'KNOW' | 'Know' )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='K') ) {
                switch ( input.LA(2) ) {
                    case 'N':
                    {
                        alt15=2;
                    }
                    break;
                    case 'n':
                    {
                        alt15=3;
                    }
                    break;
                    default:
                        alt15=1;}

            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1470:1: TOK_KNOW : ( 'K' | 'KNOW' | 'Know' );", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1470:15: 'K'
                {
                    match('K');

                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1470:21: 'KNOW'
                {
                    match("KNOW");


                }
                break;
                case 3 :
                    // F:\\StudyAntlr\\SPC.g:1470:30: 'Know'
                {
                    match("Know");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_KNOW

    // $ANTLR start TOK_SKNOW
    public final void mTOK_SKNOW() throws RecognitionException {
        try {
            int _type = TOK_SKNOW;
            // F:\\StudyAntlr\\SPC.g:1471:14: ( 'SK' | 'SKNOW' | 'Sknow' )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='S') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='K') ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2=='N') ) {
                        alt16=2;
                    }
                    else {
                        alt16=1;}
                }
                else if ( (LA16_1=='k') ) {
                    alt16=3;
                }
                else {
                    NoViableAltException nvae =
                            new NoViableAltException("1471:1: TOK_SKNOW : ( 'SK' | 'SKNOW' | 'Sknow' );", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1471:1: TOK_SKNOW : ( 'SK' | 'SKNOW' | 'Sknow' );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1471:16: 'SK'
                {
                    match("SK");


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1471:23: 'SKNOW'
                {
                    match("SKNOW");


                }
                break;
                case 3 :
                    // F:\\StudyAntlr\\SPC.g:1471:33: 'Sknow'
                {
                    match("Sknow");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_SKNOW

    // $ANTLR start TOK_LP
    public final void mTOK_LP() throws RecognitionException {
        try {
            int _type = TOK_LP;
            // F:\\StudyAntlr\\SPC.g:1476:13: ( '(' )
            // F:\\StudyAntlr\\SPC.g:1476:15: '('
            {
                match('(');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LP

    // $ANTLR start TOK_RP
    public final void mTOK_RP() throws RecognitionException {
        try {
            int _type = TOK_RP;
            // F:\\StudyAntlr\\SPC.g:1477:13: ( ')' )
            // F:\\StudyAntlr\\SPC.g:1477:15: ')'
            {
                match(')');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_RP

    // $ANTLR start TOK_LB
    public final void mTOK_LB() throws RecognitionException {
        try {
            int _type = TOK_LB;
            // F:\\StudyAntlr\\SPC.g:1478:13: ( '[' )
            // F:\\StudyAntlr\\SPC.g:1478:15: '['
            {
                match('[');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LB

    // $ANTLR start TOK_RB
    public final void mTOK_RB() throws RecognitionException {
        try {
            int _type = TOK_RB;
            // F:\\StudyAntlr\\SPC.g:1479:13: ( ']' )
            // F:\\StudyAntlr\\SPC.g:1479:15: ']'
            {
                match(']');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_RB

    // $ANTLR start TOK_LCB
    public final void mTOK_LCB() throws RecognitionException {
        try {
            int _type = TOK_LCB;
            // F:\\StudyAntlr\\SPC.g:1480:14: ( '{' )
            // F:\\StudyAntlr\\SPC.g:1480:16: '{'
            {
                match('{');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LCB

    // $ANTLR start TOK_RCB
    public final void mTOK_RCB() throws RecognitionException {
        try {
            int _type = TOK_RCB;
            // F:\\StudyAntlr\\SPC.g:1481:14: ( '}' )
            // F:\\StudyAntlr\\SPC.g:1481:16: '}'
            {
                match('}');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_RCB

    // $ANTLR start TOK_FALSEEXP
    public final void mTOK_FALSEEXP() throws RecognitionException {
        try {
            int _type = TOK_FALSEEXP;
            // F:\\StudyAntlr\\SPC.g:1482:17: ( 'FALSE' )
            // F:\\StudyAntlr\\SPC.g:1482:19: 'FALSE'
            {
                match("FALSE");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_FALSEEXP

    // $ANTLR start TOK_TRUEEXP
    public final void mTOK_TRUEEXP() throws RecognitionException {
        try {
            int _type = TOK_TRUEEXP;
            // F:\\StudyAntlr\\SPC.g:1483:17: ( 'TRUE' )
            // F:\\StudyAntlr\\SPC.g:1483:19: 'TRUE'
            {
                match("TRUE");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_TRUEEXP

    // $ANTLR start TOK_WORD1
    public final void mTOK_WORD1() throws RecognitionException {
        try {
            int _type = TOK_WORD1;
            // F:\\StudyAntlr\\SPC.g:1487:15: ( 'word1' )
            // F:\\StudyAntlr\\SPC.g:1487:17: 'word1'
            {
                match("word1");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_WORD1

    // $ANTLR start TOK_WORD
    public final void mTOK_WORD() throws RecognitionException {
        try {
            int _type = TOK_WORD;
            // F:\\StudyAntlr\\SPC.g:1488:14: ( 'word' | 'Word' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='w') ) {
                alt17=1;
            }
            else if ( (LA17_0=='W') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1488:1: TOK_WORD : ( 'word' | 'Word' );", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1488:16: 'word'
                {
                    match("word");


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1488:25: 'Word'
                {
                    match("Word");


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_WORD

    // $ANTLR start TOK_BOOL
    public final void mTOK_BOOL() throws RecognitionException {
        try {
            int _type = TOK_BOOL;
            // F:\\StudyAntlr\\SPC.g:1489:14: ( 'bool' )
            // F:\\StudyAntlr\\SPC.g:1489:16: 'bool'
            {
                match("bool");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_BOOL

    // $ANTLR start TOK_WAREAD
    public final void mTOK_WAREAD() throws RecognitionException {
        try {
            int _type = TOK_WAREAD;
            // F:\\StudyAntlr\\SPC.g:1490:16: ( 'READ' )
            // F:\\StudyAntlr\\SPC.g:1490:18: 'READ'
            {
                match("READ");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_WAREAD

    // $ANTLR start TOK_WAWRITE
    public final void mTOK_WAWRITE() throws RecognitionException {
        try {
            int _type = TOK_WAWRITE;
            // F:\\StudyAntlr\\SPC.g:1491:17: ( 'WRITE' )
            // F:\\StudyAntlr\\SPC.g:1491:19: 'WRITE'
            {
                match("WRITE");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_WAWRITE

    // $ANTLR start TOK_CASE
    public final void mTOK_CASE() throws RecognitionException {
        try {
            int _type = TOK_CASE;
            // F:\\StudyAntlr\\SPC.g:1493:14: ( 'case' )
            // F:\\StudyAntlr\\SPC.g:1493:16: 'case'
            {
                match("case");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_CASE

    // $ANTLR start TOK_ESAC
    public final void mTOK_ESAC() throws RecognitionException {
        try {
            int _type = TOK_ESAC;
            // F:\\StudyAntlr\\SPC.g:1494:14: ( 'esac' )
            // F:\\StudyAntlr\\SPC.g:1494:16: 'esac'
            {
                match("esac");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_ESAC

    // $ANTLR start TOK_PLUS
    public final void mTOK_PLUS() throws RecognitionException {
        try {
            int _type = TOK_PLUS;
            // F:\\StudyAntlr\\SPC.g:1495:14: ( '+' )
            // F:\\StudyAntlr\\SPC.g:1495:16: '+'
            {
                match('+');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_PLUS

    // $ANTLR start TOK_MINUS
    public final void mTOK_MINUS() throws RecognitionException {
        try {
            int _type = TOK_MINUS;
            // F:\\StudyAntlr\\SPC.g:1496:15: ( '-' )
            // F:\\StudyAntlr\\SPC.g:1496:17: '-'
            {
                match('-');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_MINUS

    // $ANTLR start TOK_TIMES
    public final void mTOK_TIMES() throws RecognitionException {
        try {
            int _type = TOK_TIMES;
            // F:\\StudyAntlr\\SPC.g:1497:15: ( '*' )
            // F:\\StudyAntlr\\SPC.g:1497:17: '*'
            {
                match('*');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_TIMES

    // $ANTLR start TOK_DIVIDE
    public final void mTOK_DIVIDE() throws RecognitionException {
        try {
            int _type = TOK_DIVIDE;
            // F:\\StudyAntlr\\SPC.g:1498:16: ( '/' )
            // F:\\StudyAntlr\\SPC.g:1498:18: '/'
            {
                match('/');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_DIVIDE

    // $ANTLR start TOK_MOD
    public final void mTOK_MOD() throws RecognitionException {
        try {
            int _type = TOK_MOD;
            // F:\\StudyAntlr\\SPC.g:1499:14: ( 'mod' )
            // F:\\StudyAntlr\\SPC.g:1499:16: 'mod'
            {
                match("mod");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_MOD

    // $ANTLR start TOK_LSHIFT
    public final void mTOK_LSHIFT() throws RecognitionException {
        try {
            int _type = TOK_LSHIFT;
            // F:\\StudyAntlr\\SPC.g:1500:16: ( '<<' )
            // F:\\StudyAntlr\\SPC.g:1500:18: '<<'
            {
                match("<<");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LSHIFT

    // $ANTLR start TOK_RSHIFT
    public final void mTOK_RSHIFT() throws RecognitionException {
        try {
            int _type = TOK_RSHIFT;
            // F:\\StudyAntlr\\SPC.g:1501:16: ( '>>' )
            // F:\\StudyAntlr\\SPC.g:1501:18: '>>'
            {
                match(">>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_RSHIFT

    // $ANTLR start TOK_EQUAL
    public final void mTOK_EQUAL() throws RecognitionException {
        try {
            int _type = TOK_EQUAL;
            // F:\\StudyAntlr\\SPC.g:1504:15: ( '=' )
            // F:\\StudyAntlr\\SPC.g:1504:17: '='
            {
                match('=');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EQUAL

    // $ANTLR start TOK_NOTEQUAL
    public final void mTOK_NOTEQUAL() throws RecognitionException {
        try {
            int _type = TOK_NOTEQUAL;
            // F:\\StudyAntlr\\SPC.g:1505:17: ( '!=' )
            // F:\\StudyAntlr\\SPC.g:1505:19: '!='
            {
                match("!=");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NOTEQUAL

    // $ANTLR start TOK_LE
    public final void mTOK_LE() throws RecognitionException {
        try {
            int _type = TOK_LE;
            // F:\\StudyAntlr\\SPC.g:1506:13: ( '<=' )
            // F:\\StudyAntlr\\SPC.g:1506:15: '<='
            {
                match("<=");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LE

    // $ANTLR start TOK_GE
    public final void mTOK_GE() throws RecognitionException {
        try {
            int _type = TOK_GE;
            // F:\\StudyAntlr\\SPC.g:1507:13: ( '>=' )
            // F:\\StudyAntlr\\SPC.g:1507:15: '>='
            {
                match(">=");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_GE

    // $ANTLR start TOK_LT
    public final void mTOK_LT() throws RecognitionException {
        try {
            int _type = TOK_LT;
            // F:\\StudyAntlr\\SPC.g:1508:13: ( '<' )
            // F:\\StudyAntlr\\SPC.g:1508:15: '<'
            {
                match('<');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LT

    // $ANTLR start TOK_GT
    public final void mTOK_GT() throws RecognitionException {
        try {
            int _type = TOK_GT;
            // F:\\StudyAntlr\\SPC.g:1509:13: ( '>' )
            // F:\\StudyAntlr\\SPC.g:1509:15: '>'
            {
                match('>');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_GT

    // $ANTLR start TOK_NEXT
    public final void mTOK_NEXT() throws RecognitionException {
        try {
            int _type = TOK_NEXT;
            // F:\\StudyAntlr\\SPC.g:1510:14: ( 'next' )
            // F:\\StudyAntlr\\SPC.g:1510:16: 'next'
            {
                match("next");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NEXT

    // $ANTLR start TOK_UNION
    public final void mTOK_UNION() throws RecognitionException {
        try {
            int _type = TOK_UNION;
            // F:\\StudyAntlr\\SPC.g:1512:15: ( 'union' )
            // F:\\StudyAntlr\\SPC.g:1512:17: 'union'
            {
                match("union");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_UNION

    // $ANTLR start TOK_SETIN
    public final void mTOK_SETIN() throws RecognitionException {
        try {
            int _type = TOK_SETIN;
            // F:\\StudyAntlr\\SPC.g:1513:15: ( 'in' )
            // F:\\StudyAntlr\\SPC.g:1513:17: 'in'
            {
                match("in");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_SETIN

    // $ANTLR start TOK_TWODOTS
    public final void mTOK_TWODOTS() throws RecognitionException {
        try {
            int _type = TOK_TWODOTS;
            // F:\\StudyAntlr\\SPC.g:1514:17: ( '..' )
            // F:\\StudyAntlr\\SPC.g:1514:19: '..'
            {
                match("..");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_TWODOTS

    // $ANTLR start TOK_DOT
    public final void mTOK_DOT() throws RecognitionException {
        try {
            int _type = TOK_DOT;
            // F:\\StudyAntlr\\SPC.g:1515:14: ( '.' )
            // F:\\StudyAntlr\\SPC.g:1515:16: '.'
            {
                match('.');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_DOT

    // $ANTLR start TOK_IMPLIES
    public final void mTOK_IMPLIES() throws RecognitionException {
        try {
            int _type = TOK_IMPLIES;
            // F:\\StudyAntlr\\SPC.g:1518:17: ( '->' )
            // F:\\StudyAntlr\\SPC.g:1518:19: '->'
            {
                match("->");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_IMPLIES

    // $ANTLR start TOK_IFF
    public final void mTOK_IFF() throws RecognitionException {
        try {
            int _type = TOK_IFF;
            // F:\\StudyAntlr\\SPC.g:1519:14: ( '<->' )
            // F:\\StudyAntlr\\SPC.g:1519:16: '<->'
            {
                match("<->");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_IFF

    // $ANTLR start TOK_OR
    public final void mTOK_OR() throws RecognitionException {
        try {
            int _type = TOK_OR;
            // F:\\StudyAntlr\\SPC.g:1520:13: ( '|' )
            // F:\\StudyAntlr\\SPC.g:1520:15: '|'
            {
                match('|');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OR

    // $ANTLR start TOK_AND
    public final void mTOK_AND() throws RecognitionException {
        try {
            int _type = TOK_AND;
            // F:\\StudyAntlr\\SPC.g:1521:14: ( '&' )
            // F:\\StudyAntlr\\SPC.g:1521:16: '&'
            {
                match('&');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_AND

    // $ANTLR start TOK_XOR
    public final void mTOK_XOR() throws RecognitionException {
        try {
            int _type = TOK_XOR;
            // F:\\StudyAntlr\\SPC.g:1522:14: ( 'xor' )
            // F:\\StudyAntlr\\SPC.g:1522:16: 'xor'
            {
                match("xor");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_XOR

    // $ANTLR start TOK_XNOR
    public final void mTOK_XNOR() throws RecognitionException {
        try {
            int _type = TOK_XNOR;
            // F:\\StudyAntlr\\SPC.g:1523:14: ( 'xnor' )
            // F:\\StudyAntlr\\SPC.g:1523:16: 'xnor'
            {
                match("xnor");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_XNOR

    // $ANTLR start TOK_NOT
    public final void mTOK_NOT() throws RecognitionException {
        try {
            int _type = TOK_NOT;
            // F:\\StudyAntlr\\SPC.g:1524:14: ( '!' )
            // F:\\StudyAntlr\\SPC.g:1524:16: '!'
            {
                match('!');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NOT

    // $ANTLR start TOK_COMMA
    public final void mTOK_COMMA() throws RecognitionException {
        try {
            int _type = TOK_COMMA;
            // F:\\StudyAntlr\\SPC.g:1526:15: ( ',' )
            // F:\\StudyAntlr\\SPC.g:1526:17: ','
            {
                match(',');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_COMMA

    // $ANTLR start TOK_COLON
    public final void mTOK_COLON() throws RecognitionException {
        try {
            int _type = TOK_COLON;
            // F:\\StudyAntlr\\SPC.g:1527:15: ( ':' )
            // F:\\StudyAntlr\\SPC.g:1527:17: ':'
            {
                match(':');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_COLON

    // $ANTLR start TOK_SEMI
    public final void mTOK_SEMI() throws RecognitionException {
        try {
            int _type = TOK_SEMI;
            // F:\\StudyAntlr\\SPC.g:1528:14: ( ';' )
            // F:\\StudyAntlr\\SPC.g:1528:16: ';'
            {
                match(';');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_SEMI

    // $ANTLR start TOK_CONCATENATION
    public final void mTOK_CONCATENATION() throws RecognitionException {
        try {
            int _type = TOK_CONCATENATION;
            // F:\\StudyAntlr\\SPC.g:1529:21: ( '::' )
            // F:\\StudyAntlr\\SPC.g:1529:23: '::'
            {
                match("::");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_CONCATENATION

    // $ANTLR start TOK_NUMBER_WORD
    public final void mTOK_NUMBER_WORD() throws RecognitionException {
        try {
            int _type = TOK_NUMBER_WORD;
            // F:\\StudyAntlr\\SPC.g:1538:21: ( '0' ( 'b' | 'B' | 'o' | 'O' | 'd' | 'D' | 'h' | 'H' ) ( '0' .. '9' )* '_' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )* )
            // F:\\StudyAntlr\\SPC.g:1538:23: '0' ( 'b' | 'B' | 'o' | 'O' | 'd' | 'D' | 'h' | 'H' ) ( '0' .. '9' )* '_' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )*
            {
                match('0');
                if ( input.LA(1)=='B'||input.LA(1)=='D'||input.LA(1)=='H'||input.LA(1)=='O'||input.LA(1)=='b'||input.LA(1)=='d'||input.LA(1)=='h'||input.LA(1)=='o' ) {
                    input.consume();

                }
                else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                    recover(mse);    throw mse;
                }

                // F:\\StudyAntlr\\SPC.g:1538:75: ( '0' .. '9' )*
                loop18:
                do {
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                        alt18=1;
                    }


                    switch (alt18) {
                        case 1 :
                            // F:\\StudyAntlr\\SPC.g:1538:76: '0' .. '9'
                        {
                            matchRange('0','9');

                        }
                        break;

                        default :
                            break loop18;
                    }
                } while (true);

                match('_');
                if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    input.consume();

                }
                else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                    recover(mse);    throw mse;
                }

                // F:\\StudyAntlr\\SPC.g:1538:124: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='F')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='f')) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                        case 1 :
                            // F:\\StudyAntlr\\SPC.g:
                        {
                            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                        new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                        }
                        break;

                        default :
                            break loop19;
                    }
                } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NUMBER_WORD

    // $ANTLR start TOK_NUMBER_FRAC
    public final void mTOK_NUMBER_FRAC() throws RecognitionException {
        try {
            int _type = TOK_NUMBER_FRAC;
            // F:\\StudyAntlr\\SPC.g:1541:21: ( ( 'f' | 'F' ) '\\'' ( '0' .. '9' )+ '/' ( '0' .. '9' )+ )
            // F:\\StudyAntlr\\SPC.g:1541:23: ( 'f' | 'F' ) '\\'' ( '0' .. '9' )+ '/' ( '0' .. '9' )+
            {
                if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                    input.consume();

                }
                else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                    recover(mse);    throw mse;
                }

                match('\'');
                // F:\\StudyAntlr\\SPC.g:1541:40: ( '0' .. '9' )+
                int cnt20=0;
                loop20:
                do {
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                        alt20=1;
                    }


                    switch (alt20) {
                        case 1 :
                            // F:\\StudyAntlr\\SPC.g:1541:41: '0' .. '9'
                        {
                            matchRange('0','9');

                        }
                        break;

                        default :
                            if ( cnt20 >= 1 ) break loop20;
                            EarlyExitException eee =
                                    new EarlyExitException(20, input);
                            throw eee;
                    }
                    cnt20++;
                } while (true);

                match('/');
                // F:\\StudyAntlr\\SPC.g:1541:56: ( '0' .. '9' )+
                int cnt21=0;
                loop21:
                do {
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                        alt21=1;
                    }


                    switch (alt21) {
                        case 1 :
                            // F:\\StudyAntlr\\SPC.g:1541:57: '0' .. '9'
                        {
                            matchRange('0','9');

                        }
                        break;

                        default :
                            if ( cnt21 >= 1 ) break loop21;
                            EarlyExitException eee =
                                    new EarlyExitException(21, input);
                            throw eee;
                    }
                    cnt21++;
                } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NUMBER_FRAC

    // $ANTLR start TOK_NUMBER
    public final void mTOK_NUMBER() throws RecognitionException {
        try {
            int _type = TOK_NUMBER;
            // F:\\StudyAntlr\\SPC.g:1544:17: ( ( '0' .. '9' )+ )
            // F:\\StudyAntlr\\SPC.g:1544:19: ( '0' .. '9' )+
            {
                // F:\\StudyAntlr\\SPC.g:1544:19: ( '0' .. '9' )+
                int cnt22=0;
                loop22:
                do {
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                        alt22=1;
                    }


                    switch (alt22) {
                        case 1 :
                            // F:\\StudyAntlr\\SPC.g:1544:20: '0' .. '9'
                        {
                            matchRange('0','9');

                        }
                        break;

                        default :
                            if ( cnt22 >= 1 ) break loop22;
                            EarlyExitException eee =
                                    new EarlyExitException(22, input);
                            throw eee;
                    }
                    cnt22++;
                } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NUMBER

    // $ANTLR start TOK_ATOM
    public final void mTOK_ATOM() throws RecognitionException {
        try {
            int _type = TOK_ATOM;
            // F:\\StudyAntlr\\SPC.g:1547:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )* )
            // F:\\StudyAntlr\\SPC.g:1547:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )*
            {
                if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    input.consume();

                }
                else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                    recover(mse);    throw mse;
                }

                // F:\\StudyAntlr\\SPC.g:1547:45: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )*
                loop23:
                do {
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>='#' && LA23_0<='$')||LA23_0=='-'||(LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='\\'||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                        alt23=1;
                    }


                    switch (alt23) {
                        case 1 :
                            // F:\\StudyAntlr\\SPC.g:
                        {
                            if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                        new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                        }
                        break;

                        default :
                            break loop23;
                    }
                } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_ATOM

    // $ANTLR start JTOK_WS
    public final void mJTOK_WS() throws RecognitionException {
        try {
            int _type = JTOK_WS;
            // F:\\StudyAntlr\\SPC.g:1550:15: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // F:\\StudyAntlr\\SPC.g:1550:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
                // F:\\StudyAntlr\\SPC.g:1550:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
                int cnt24=0;
                loop24:
                do {
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                        alt24=1;
                    }


                    switch (alt24) {
                        case 1 :
                            // F:\\StudyAntlr\\SPC.g:
                        {
                            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                        new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                        }
                        break;

                        default :
                            if ( cnt24 >= 1 ) break loop24;
                            EarlyExitException eee =
                                    new EarlyExitException(24, input);
                            throw eee;
                    }
                    cnt24++;
                } while (true);

                channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JTOK_WS

    // $ANTLR start JTOK_MULTI_COMMENT
    public final void mJTOK_MULTI_COMMENT() throws RecognitionException {
        try {
            int _type = JTOK_MULTI_COMMENT;
            // F:\\StudyAntlr\\SPC.g:1556:23: ( ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' ) )
            // F:\\StudyAntlr\\SPC.g:1556:25: ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' )
            {
                // F:\\StudyAntlr\\SPC.g:1556:25: ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' )
                // F:\\StudyAntlr\\SPC.g:1556:26: '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/'
                {
                    match("/*");

                    // F:\\StudyAntlr\\SPC.g:1556:31: ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )*
                    loop25:
                    do {
                        int alt25=4;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='*') ) {
                            int LA25_1 = input.LA(2);

                            if ( (LA25_1=='/') ) {
                                alt25=4;
                            }
                            else if ( ((LA25_1>='\u0000' && LA25_1<='.')||(LA25_1>='0' && LA25_1<='\uFFFE')) ) {
                                alt25=3;
                            }


                        }
                        else if ( (LA25_0=='\r') ) {
                            alt25=1;
                        }
                        else if ( (LA25_0=='\n') ) {
                            alt25=2;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<=')')||(LA25_0>='+' && LA25_0<='\uFFFE')) ) {
                            alt25=3;
                        }


                        switch (alt25) {
                            case 1 :
                                // F:\\StudyAntlr\\SPC.g:1559:9: '\\r'
                            {
                                match('\r');

                            }
                            break;
                            case 2 :
                                // F:\\StudyAntlr\\SPC.g:1560:13: '\\n'
                            {
                                match('\n');

                            }
                            break;
                            case 3 :
                                // F:\\StudyAntlr\\SPC.g:1561:13: ~ ( '\\n' | '\\r' )
                            {
                                if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
                                    input.consume();

                                }
                                else {
                                    MismatchedSetException mse =
                                            new MismatchedSetException(null,input);
                                    recover(mse);    throw mse;
                                }


                            }
                            break;

                            default :
                                break loop25;
                        }
                    } while (true);

                    match("*/");

                    channel=HIDDEN;

                }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JTOK_MULTI_COMMENT

    // $ANTLR start JTOK_LINE_COMMENT
    public final void mJTOK_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = JTOK_LINE_COMMENT;
            // F:\\StudyAntlr\\SPC.g:1565:22: ( ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) | ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='-') ) {
                alt34=1;
            }
            else if ( (LA34_0=='/') ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                        new NoViableAltException("1565:1: JTOK_LINE_COMMENT : ( ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) | ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // F:\\StudyAntlr\\SPC.g:1565:24: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                {
                    // F:\\StudyAntlr\\SPC.g:1565:24: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    // F:\\StudyAntlr\\SPC.g:1565:25: '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    {
                        match("--");

                        // F:\\StudyAntlr\\SPC.g:1565:30: (~ ( '\\n' | '\\r' ) )*
                        loop26:
                        do {
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\uFFFE')) ) {
                                alt26=1;
                            }


                            switch (alt26) {
                                case 1 :
                                    // F:\\StudyAntlr\\SPC.g:1565:31: ~ ( '\\n' | '\\r' )
                                {
                                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse =
                                                new MismatchedSetException(null,input);
                                        recover(mse);    throw mse;
                                    }


                                }
                                break;

                                default :
                                    break loop26;
                            }
                        } while (true);

                        // F:\\StudyAntlr\\SPC.g:1565:46: ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\n'||LA29_0=='\r') ) {
                            alt29=1;
                        }
                        switch (alt29) {
                            case 1 :
                                // F:\\StudyAntlr\\SPC.g:1565:47: ( '\\n' | '\\r' ( '\\n' )? )
                            {
                                // F:\\StudyAntlr\\SPC.g:1565:47: ( '\\n' | '\\r' ( '\\n' )? )
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0=='\n') ) {
                                    alt28=1;
                                }
                                else if ( (LA28_0=='\r') ) {
                                    alt28=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                            new NoViableAltException("1565:47: ( '\\n' | '\\r' ( '\\n' )? )", 28, 0, input);

                                    throw nvae;
                                }
                                switch (alt28) {
                                    case 1 :
                                        // F:\\StudyAntlr\\SPC.g:1565:48: '\\n'
                                    {
                                        match('\n');

                                    }
                                    break;
                                    case 2 :
                                        // F:\\StudyAntlr\\SPC.g:1565:53: '\\r' ( '\\n' )?
                                    {
                                        match('\r');
                                        // F:\\StudyAntlr\\SPC.g:1565:57: ( '\\n' )?
                                        int alt27=2;
                                        int LA27_0 = input.LA(1);

                                        if ( (LA27_0=='\n') ) {
                                            alt27=1;
                                        }
                                        switch (alt27) {
                                            case 1 :
                                                // F:\\StudyAntlr\\SPC.g:1565:58: '\\n'
                                            {
                                                match('\n');

                                            }
                                            break;

                                        }


                                    }
                                    break;

                                }


                            }
                            break;

                        }

                        channel=HIDDEN;

                    }


                }
                break;
                case 2 :
                    // F:\\StudyAntlr\\SPC.g:1566:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                {
                    // F:\\StudyAntlr\\SPC.g:1566:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    // F:\\StudyAntlr\\SPC.g:1566:12: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    {
                        match("//");

                        // F:\\StudyAntlr\\SPC.g:1566:17: (~ ( '\\n' | '\\r' ) )*
                        loop30:
                        do {
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\uFFFE')) ) {
                                alt30=1;
                            }


                            switch (alt30) {
                                case 1 :
                                    // F:\\StudyAntlr\\SPC.g:1566:18: ~ ( '\\n' | '\\r' )
                                {
                                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse =
                                                new MismatchedSetException(null,input);
                                        recover(mse);    throw mse;
                                    }


                                }
                                break;

                                default :
                                    break loop30;
                            }
                        } while (true);

                        // F:\\StudyAntlr\\SPC.g:1566:33: ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0=='\n'||LA33_0=='\r') ) {
                            alt33=1;
                        }
                        switch (alt33) {
                            case 1 :
                                // F:\\StudyAntlr\\SPC.g:1566:34: ( '\\n' | '\\r' ( '\\n' )? )
                            {
                                // F:\\StudyAntlr\\SPC.g:1566:34: ( '\\n' | '\\r' ( '\\n' )? )
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0=='\n') ) {
                                    alt32=1;
                                }
                                else if ( (LA32_0=='\r') ) {
                                    alt32=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                            new NoViableAltException("1566:34: ( '\\n' | '\\r' ( '\\n' )? )", 32, 0, input);

                                    throw nvae;
                                }
                                switch (alt32) {
                                    case 1 :
                                        // F:\\StudyAntlr\\SPC.g:1566:35: '\\n'
                                    {
                                        match('\n');

                                    }
                                    break;
                                    case 2 :
                                        // F:\\StudyAntlr\\SPC.g:1566:40: '\\r' ( '\\n' )?
                                    {
                                        match('\r');
                                        // F:\\StudyAntlr\\SPC.g:1566:44: ( '\\n' )?
                                        int alt31=2;
                                        int LA31_0 = input.LA(1);

                                        if ( (LA31_0=='\n') ) {
                                            alt31=1;
                                        }
                                        switch (alt31) {
                                            case 1 :
                                                // F:\\StudyAntlr\\SPC.g:1566:45: '\\n'
                                            {
                                                match('\n');

                                            }
                                            break;

                                        }


                                    }
                                    break;

                                }


                            }
                            break;

                        }

                        channel=HIDDEN;

                    }


                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JTOK_LINE_COMMENT

    public void mTokens() throws RecognitionException {
        // F:\\StudyAntlr\\SPC.g:1:8: ( TOK_CTL_SPEC | TOK_CTL_STAR_SPEC | TOK_LTL_SPEC | TOK_INVAR_SPEC | TOK_ATL_STAR_SPEC | TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_EE | TOK_AA | TOK_BUNTIL | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_NEXT | TOK_OP_PREV | TOK_UNTIL | TOK_SINCE | TOK_RELEASE | TOK_TRIGGERED | TOK_OP_NOTPREVNOT | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_BRELEASE | TOK_KNOW | TOK_SKNOW | TOK_LP | TOK_RP | TOK_LB | TOK_RB | TOK_LCB | TOK_RCB | TOK_FALSEEXP | TOK_TRUEEXP | TOK_WORD1 | TOK_WORD | TOK_BOOL | TOK_WAREAD | TOK_WAWRITE | TOK_CASE | TOK_ESAC | TOK_PLUS | TOK_MINUS | TOK_TIMES | TOK_DIVIDE | TOK_MOD | TOK_LSHIFT | TOK_RSHIFT | TOK_EQUAL | TOK_NOTEQUAL | TOK_LE | TOK_GE | TOK_LT | TOK_GT | TOK_NEXT | TOK_UNION | TOK_SETIN | TOK_TWODOTS | TOK_DOT | TOK_IMPLIES | TOK_IFF | TOK_OR | TOK_AND | TOK_XOR | TOK_XNOR | TOK_NOT | TOK_COMMA | TOK_COLON | TOK_SEMI | TOK_CONCATENATION | TOK_NUMBER_WORD | TOK_NUMBER_FRAC | TOK_NUMBER | TOK_ATOM | JTOK_WS | JTOK_MULTI_COMMENT | JTOK_LINE_COMMENT )
        int alt35=85;
        switch ( input.LA(1) ) {
            case 'C':
            {
                int LA35_1 = input.LA(2);

                if ( (LA35_1=='T') ) {
                    int LA35_56 = input.LA(3);

                    if ( (LA35_56=='L') ) {
                        switch ( input.LA(4) ) {
                            case '*':
                            {
                                alt35=2;
                            }
                            break;
                            case 'S':
                            {
                                int LA35_203 = input.LA(5);

                                if ( (LA35_203=='P') ) {
                                    int LA35_251 = input.LA(6);

                                    if ( (LA35_251=='E') ) {
                                        int LA35_287 = input.LA(7);

                                        if ( (LA35_287=='C') ) {
                                            int LA35_308 = input.LA(8);

                                            if ( ((LA35_308>='#' && LA35_308<='$')||LA35_308=='-'||(LA35_308>='0' && LA35_308<='9')||(LA35_308>='A' && LA35_308<='Z')||LA35_308=='\\'||LA35_308=='_'||(LA35_308>='a' && LA35_308<='z')) ) {
                                                alt35=82;
                                            }
                                            else {
                                                alt35=1;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            break;
                            default:
                                alt35=82;}

                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case 'S':
            {
                switch ( input.LA(2) ) {
                    case 'P':
                    {
                        int LA35_57 = input.LA(3);

                        if ( (LA35_57=='E') ) {
                            int LA35_143 = input.LA(4);

                            if ( (LA35_143=='C') ) {
                                int LA35_204 = input.LA(5);

                                if ( ((LA35_204>='#' && LA35_204<='$')||LA35_204=='-'||(LA35_204>='0' && LA35_204<='9')||(LA35_204>='A' && LA35_204<='Z')||LA35_204=='\\'||LA35_204=='_'||(LA35_204>='a' && LA35_204<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=1;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'i':
                    {
                        int LA35_58 = input.LA(3);

                        if ( (LA35_58=='n') ) {
                            int LA35_144 = input.LA(4);

                            if ( (LA35_144=='c') ) {
                                int LA35_205 = input.LA(5);

                                if ( (LA35_205=='e') ) {
                                    int LA35_253 = input.LA(6);

                                    if ( ((LA35_253>='#' && LA35_253<='$')||LA35_253=='-'||(LA35_253>='0' && LA35_253<='9')||(LA35_253>='A' && LA35_253<='Z')||LA35_253=='\\'||LA35_253=='_'||(LA35_253>='a' && LA35_253<='z')) ) {
                                        alt35=82;
                                    }
                                    else {
                                        alt35=26;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'I':
                    {
                        int LA35_59 = input.LA(3);

                        if ( (LA35_59=='N') ) {
                            int LA35_145 = input.LA(4);

                            if ( (LA35_145=='C') ) {
                                int LA35_206 = input.LA(5);

                                if ( (LA35_206=='E') ) {
                                    int LA35_254 = input.LA(6);

                                    if ( ((LA35_254>='#' && LA35_254<='$')||LA35_254=='-'||(LA35_254>='0' && LA35_254<='9')||(LA35_254>='A' && LA35_254<='Z')||LA35_254=='\\'||LA35_254=='_'||(LA35_254>='a' && LA35_254<='z')) ) {
                                        alt35=82;
                                    }
                                    else {
                                        alt35=26;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'K':
                    {
                        switch ( input.LA(3) ) {
                            case 'N':
                            {
                                int LA35_146 = input.LA(4);

                                if ( (LA35_146=='O') ) {
                                    int LA35_207 = input.LA(5);

                                    if ( (LA35_207=='W') ) {
                                        int LA35_255 = input.LA(6);

                                        if ( ((LA35_255>='#' && LA35_255<='$')||LA35_255=='-'||(LA35_255>='0' && LA35_255<='9')||(LA35_255>='A' && LA35_255<='Z')||LA35_255=='\\'||LA35_255=='_'||(LA35_255>='a' && LA35_255<='z')) ) {
                                            alt35=82;
                                        }
                                        else {
                                            alt35=34;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            break;
                            case '#':
                            case '$':
                            case '-':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'I':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'M':
                            case 'O':
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                            case '\\':
                            case '_':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 's':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                            {
                                alt35=82;
                            }
                            break;
                            default:
                                alt35=34;}

                    }
                    break;
                    case 'k':
                    {
                        int LA35_61 = input.LA(3);

                        if ( (LA35_61=='n') ) {
                            int LA35_148 = input.LA(4);

                            if ( (LA35_148=='o') ) {
                                int LA35_208 = input.LA(5);

                                if ( (LA35_208=='w') ) {
                                    int LA35_256 = input.LA(6);

                                    if ( ((LA35_256>='#' && LA35_256<='$')||LA35_256=='-'||(LA35_256>='0' && LA35_256<='9')||(LA35_256>='A' && LA35_256<='Z')||LA35_256=='\\'||LA35_256=='_'||(LA35_256>='a' && LA35_256<='z')) ) {
                                        alt35=82;
                                    }
                                    else {
                                        alt35=34;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'J':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'j':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=26;}

            }
            break;
            case 'L':
            {
                int LA35_3 = input.LA(2);

                if ( (LA35_3=='T') ) {
                    int LA35_63 = input.LA(3);

                    if ( (LA35_63=='L') ) {
                        int LA35_149 = input.LA(4);

                        if ( (LA35_149=='S') ) {
                            int LA35_209 = input.LA(5);

                            if ( (LA35_209=='P') ) {
                                int LA35_257 = input.LA(6);

                                if ( (LA35_257=='E') ) {
                                    int LA35_288 = input.LA(7);

                                    if ( (LA35_288=='C') ) {
                                        int LA35_309 = input.LA(8);

                                        if ( ((LA35_309>='#' && LA35_309<='$')||LA35_309=='-'||(LA35_309>='0' && LA35_309<='9')||(LA35_309>='A' && LA35_309<='Z')||LA35_309=='\\'||LA35_309=='_'||(LA35_309>='a' && LA35_309<='z')) ) {
                                            alt35=82;
                                        }
                                        else {
                                            alt35=3;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case 'I':
            {
                int LA35_4 = input.LA(2);

                if ( (LA35_4=='N') ) {
                    int LA35_64 = input.LA(3);

                    if ( (LA35_64=='V') ) {
                        int LA35_150 = input.LA(4);

                        if ( (LA35_150=='A') ) {
                            int LA35_210 = input.LA(5);

                            if ( (LA35_210=='R') ) {
                                int LA35_258 = input.LA(6);

                                if ( (LA35_258=='S') ) {
                                    int LA35_289 = input.LA(7);

                                    if ( (LA35_289=='P') ) {
                                        int LA35_310 = input.LA(8);

                                        if ( (LA35_310=='E') ) {
                                            int LA35_323 = input.LA(9);

                                            if ( (LA35_323=='C') ) {
                                                int LA35_332 = input.LA(10);

                                                if ( ((LA35_332>='#' && LA35_332<='$')||LA35_332=='-'||(LA35_332>='0' && LA35_332<='9')||(LA35_332>='A' && LA35_332<='Z')||LA35_332=='\\'||LA35_332=='_'||(LA35_332>='a' && LA35_332<='z')) ) {
                                                    alt35=82;
                                                }
                                                else {
                                                    alt35=4;}
                                            }
                                            else {
                                                alt35=82;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case 'A':
            {
                switch ( input.LA(2) ) {
                    case 'T':
                    {
                        int LA35_65 = input.LA(3);

                        if ( (LA35_65=='L') ) {
                            int LA35_151 = input.LA(4);

                            if ( (LA35_151=='*') ) {
                                alt35=5;
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'X':
                    {
                        int LA35_66 = input.LA(3);

                        if ( ((LA35_66>='#' && LA35_66<='$')||LA35_66=='-'||(LA35_66>='0' && LA35_66<='9')||(LA35_66>='A' && LA35_66<='Z')||LA35_66=='\\'||LA35_66=='_'||(LA35_66>='a' && LA35_66<='z')) ) {
                            alt35=82;
                        }
                        else {
                            alt35=7;}
                    }
                    break;
                    case 'F':
                    {
                        int LA35_67 = input.LA(3);

                        if ( ((LA35_67>='#' && LA35_67<='$')||LA35_67=='-'||(LA35_67>='0' && LA35_67<='9')||(LA35_67>='A' && LA35_67<='Z')||LA35_67=='\\'||LA35_67=='_'||(LA35_67>='a' && LA35_67<='z')) ) {
                            alt35=82;
                        }
                        else {
                            alt35=9;}
                    }
                    break;
                    case 'G':
                    {
                        int LA35_68 = input.LA(3);

                        if ( ((LA35_68>='#' && LA35_68<='$')||LA35_68=='-'||(LA35_68>='0' && LA35_68<='9')||(LA35_68>='A' && LA35_68<='Z')||LA35_68=='\\'||LA35_68=='_'||(LA35_68>='a' && LA35_68<='z')) ) {
                            alt35=82;
                        }
                        else {
                            alt35=11;}
                    }
                    break;
                    case 'B':
                    {
                        switch ( input.LA(3) ) {
                            case 'G':
                            {
                                int LA35_155 = input.LA(4);

                                if ( ((LA35_155>='#' && LA35_155<='$')||LA35_155=='-'||(LA35_155>='0' && LA35_155<='9')||(LA35_155>='A' && LA35_155<='Z')||LA35_155=='\\'||LA35_155=='_'||(LA35_155>='a' && LA35_155<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=18;}
                            }
                            break;
                            case 'F':
                            {
                                int LA35_156 = input.LA(4);

                                if ( ((LA35_156>='#' && LA35_156<='$')||LA35_156=='-'||(LA35_156>='0' && LA35_156<='9')||(LA35_156>='A' && LA35_156<='Z')||LA35_156=='\\'||LA35_156=='_'||(LA35_156>='a' && LA35_156<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=16;}
                            }
                            break;
                            default:
                                alt35=82;}

                    }
                    break;
                    case 'L':
                    {
                        int LA35_70 = input.LA(3);

                        if ( (LA35_70=='W') ) {
                            int LA35_157 = input.LA(4);

                            if ( (LA35_157=='A') ) {
                                int LA35_214 = input.LA(5);

                                if ( (LA35_214=='Y') ) {
                                    int LA35_259 = input.LA(6);

                                    if ( (LA35_259=='S') ) {
                                        int LA35_290 = input.LA(7);

                                        if ( ((LA35_290>='#' && LA35_290<='$')||LA35_290=='-'||(LA35_290>='0' && LA35_290<='9')||(LA35_290>='A' && LA35_290<='Z')||LA35_290=='\\'||LA35_290=='_'||(LA35_290>='a' && LA35_290<='z')) ) {
                                            alt35=82;
                                        }
                                        else {
                                            alt35=21;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'w':
                    {
                        int LA35_71 = input.LA(3);

                        if ( (LA35_71=='a') ) {
                            int LA35_158 = input.LA(4);

                            if ( (LA35_158=='i') ) {
                                int LA35_215 = input.LA(5);

                                if ( (LA35_215=='t') ) {
                                    int LA35_260 = input.LA(6);

                                    if ( (LA35_260=='s') ) {
                                        int LA35_291 = input.LA(7);

                                        if ( ((LA35_291>='#' && LA35_291<='$')||LA35_291=='-'||(LA35_291>='0' && LA35_291<='9')||(LA35_291>='A' && LA35_291<='Z')||LA35_291=='\\'||LA35_291=='_'||(LA35_291>='a' && LA35_291<='z')) ) {
                                            alt35=82;
                                        }
                                        else {
                                            alt35=27;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=13;}

            }
            break;
            case 'E':
            {
                switch ( input.LA(2) ) {
                    case 'X':
                    {
                        int LA35_73 = input.LA(3);

                        if ( ((LA35_73>='#' && LA35_73<='$')||LA35_73=='-'||(LA35_73>='0' && LA35_73<='9')||(LA35_73>='A' && LA35_73<='Z')||LA35_73=='\\'||LA35_73=='_'||(LA35_73>='a' && LA35_73<='z')) ) {
                            alt35=82;
                        }
                        else {
                            alt35=6;}
                    }
                    break;
                    case 'F':
                    {
                        int LA35_74 = input.LA(3);

                        if ( ((LA35_74>='#' && LA35_74<='$')||LA35_74=='-'||(LA35_74>='0' && LA35_74<='9')||(LA35_74>='A' && LA35_74<='Z')||LA35_74=='\\'||LA35_74=='_'||(LA35_74>='a' && LA35_74<='z')) ) {
                            alt35=82;
                        }
                        else {
                            alt35=8;}
                    }
                    break;
                    case 'G':
                    {
                        int LA35_75 = input.LA(3);

                        if ( ((LA35_75>='#' && LA35_75<='$')||LA35_75=='-'||(LA35_75>='0' && LA35_75<='9')||(LA35_75>='A' && LA35_75<='Z')||LA35_75=='\\'||LA35_75=='_'||(LA35_75>='a' && LA35_75<='z')) ) {
                            alt35=82;
                        }
                        else {
                            alt35=10;}
                    }
                    break;
                    case 'B':
                    {
                        switch ( input.LA(3) ) {
                            case 'G':
                            {
                                int LA35_162 = input.LA(4);

                                if ( ((LA35_162>='#' && LA35_162<='$')||LA35_162=='-'||(LA35_162>='0' && LA35_162<='9')||(LA35_162>='A' && LA35_162<='Z')||LA35_162=='\\'||LA35_162=='_'||(LA35_162>='a' && LA35_162<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=17;}
                            }
                            break;
                            case 'F':
                            {
                                int LA35_163 = input.LA(4);

                                if ( ((LA35_163>='#' && LA35_163<='$')||LA35_163=='-'||(LA35_163>='0' && LA35_163<='9')||(LA35_163>='A' && LA35_163<='Z')||LA35_163=='\\'||LA35_163=='_'||(LA35_163>='a' && LA35_163<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=15;}
                            }
                            break;
                            default:
                                alt35=82;}

                    }
                    break;
                    case 'V':
                    {
                        int LA35_77 = input.LA(3);

                        if ( (LA35_77=='E') ) {
                            int LA35_164 = input.LA(4);

                            if ( (LA35_164=='N') ) {
                                int LA35_218 = input.LA(5);

                                if ( (LA35_218=='T') ) {
                                    int LA35_261 = input.LA(6);

                                    if ( (LA35_261=='U') ) {
                                        int LA35_292 = input.LA(7);

                                        if ( (LA35_292=='A') ) {
                                            int LA35_311 = input.LA(8);

                                            if ( (LA35_311=='L') ) {
                                                int LA35_324 = input.LA(9);

                                                if ( (LA35_324=='L') ) {
                                                    int LA35_333 = input.LA(10);

                                                    if ( (LA35_333=='Y') ) {
                                                        int LA35_339 = input.LA(11);

                                                        if ( ((LA35_339>='#' && LA35_339<='$')||LA35_339=='-'||(LA35_339>='0' && LA35_339<='9')||(LA35_339>='A' && LA35_339<='Z')||LA35_339=='\\'||LA35_339=='_'||(LA35_339>='a' && LA35_339<='z')) ) {
                                                            alt35=82;
                                                        }
                                                        else {
                                                            alt35=19;}
                                                    }
                                                    else {
                                                        alt35=82;}
                                                }
                                                else {
                                                    alt35=82;}
                                            }
                                            else {
                                                alt35=82;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'W':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=12;}

            }
            break;
            case 'B':
            {
                switch ( input.LA(2) ) {
                    case 'U':
                    {
                        int LA35_79 = input.LA(3);

                        if ( ((LA35_79>='#' && LA35_79<='$')||LA35_79=='-'||(LA35_79>='0' && LA35_79<='9')||(LA35_79>='A' && LA35_79<='Z')||LA35_79=='\\'||LA35_79=='_'||(LA35_79>='a' && LA35_79<='z')) ) {
                            alt35=82;
                        }
                        else {
                            alt35=14;}
                    }
                    break;
                    case 'a':
                    {
                        int LA35_80 = input.LA(3);

                        if ( (LA35_80=='c') ) {
                            int LA35_166 = input.LA(4);

                            if ( (LA35_166=='k') ) {
                                int LA35_219 = input.LA(5);

                                if ( (LA35_219=='t') ) {
                                    int LA35_262 = input.LA(6);

                                    if ( (LA35_262=='o') ) {
                                        int LA35_293 = input.LA(7);

                                        if ( ((LA35_293>='#' && LA35_293<='$')||LA35_293=='-'||(LA35_293>='0' && LA35_293<='9')||(LA35_293>='A' && LA35_293<='Z')||LA35_293=='\\'||LA35_293=='_'||(LA35_293>='a' && LA35_293<='z')) ) {
                                            alt35=82;
                                        }
                                        else {
                                            alt35=28;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'F':
                    {
                        switch ( input.LA(3) ) {
                            case 'I':
                            {
                                int LA35_167 = input.LA(4);

                                if ( (LA35_167=='N') ) {
                                    int LA35_220 = input.LA(5);

                                    if ( (LA35_220=='A') ) {
                                        int LA35_263 = input.LA(6);

                                        if ( (LA35_263=='L') ) {
                                            int LA35_294 = input.LA(7);

                                            if ( (LA35_294=='L') ) {
                                                int LA35_312 = input.LA(8);

                                                if ( (LA35_312=='Y') ) {
                                                    int LA35_325 = input.LA(9);

                                                    if ( ((LA35_325>='#' && LA35_325<='$')||LA35_325=='-'||(LA35_325>='0' && LA35_325<='9')||(LA35_325>='A' && LA35_325<='Z')||LA35_325=='\\'||LA35_325=='_'||(LA35_325>='a' && LA35_325<='z')) ) {
                                                        alt35=82;
                                                    }
                                                    else {
                                                        alt35=30;}
                                                }
                                                else {
                                                    alt35=82;}
                                            }
                                            else {
                                                alt35=82;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            break;
                            case '#':
                            case '$':
                            case '-':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'M':
                            case 'N':
                            case 'O':
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                            case '\\':
                            case '_':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 's':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                            {
                                alt35=82;
                            }
                            break;
                            default:
                                alt35=30;}

                    }
                    break;
                    case 'E':
                    {
                        int LA35_82 = input.LA(3);

                        if ( (LA35_82=='V') ) {
                            int LA35_169 = input.LA(4);

                            if ( (LA35_169=='E') ) {
                                int LA35_221 = input.LA(5);

                                if ( (LA35_221=='N') ) {
                                    int LA35_264 = input.LA(6);

                                    if ( (LA35_264=='T') ) {
                                        int LA35_295 = input.LA(7);

                                        if ( (LA35_295=='U') ) {
                                            int LA35_313 = input.LA(8);

                                            if ( (LA35_313=='A') ) {
                                                int LA35_326 = input.LA(9);

                                                if ( (LA35_326=='L') ) {
                                                    int LA35_334 = input.LA(10);

                                                    if ( (LA35_334=='L') ) {
                                                        int LA35_340 = input.LA(11);

                                                        if ( (LA35_340=='Y') ) {
                                                            int LA35_342 = input.LA(12);

                                                            if ( ((LA35_342>='#' && LA35_342<='$')||LA35_342=='-'||(LA35_342>='0' && LA35_342<='9')||(LA35_342>='A' && LA35_342<='Z')||LA35_342=='\\'||LA35_342=='_'||(LA35_342>='a' && LA35_342<='z')) ) {
                                                                alt35=82;
                                                            }
                                                            else {
                                                                alt35=30;}
                                                        }
                                                        else {
                                                            alt35=82;}
                                                    }
                                                    else {
                                                        alt35=82;}
                                                }
                                                else {
                                                    alt35=82;}
                                            }
                                            else {
                                                alt35=82;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'G':
                    {
                        switch ( input.LA(3) ) {
                            case 'L':
                            {
                                int LA35_170 = input.LA(4);

                                if ( (LA35_170=='O') ) {
                                    int LA35_222 = input.LA(5);

                                    if ( (LA35_222=='B') ) {
                                        int LA35_265 = input.LA(6);

                                        if ( (LA35_265=='A') ) {
                                            int LA35_296 = input.LA(7);

                                            if ( (LA35_296=='L') ) {
                                                int LA35_314 = input.LA(8);

                                                if ( (LA35_314=='L') ) {
                                                    int LA35_327 = input.LA(9);

                                                    if ( (LA35_327=='Y') ) {
                                                        int LA35_335 = input.LA(10);

                                                        if ( ((LA35_335>='#' && LA35_335<='$')||LA35_335=='-'||(LA35_335>='0' && LA35_335<='9')||(LA35_335>='A' && LA35_335<='Z')||LA35_335=='\\'||LA35_335=='_'||(LA35_335>='a' && LA35_335<='z')) ) {
                                                            alt35=82;
                                                        }
                                                        else {
                                                            alt35=31;}
                                                    }
                                                    else {
                                                        alt35=82;}
                                                }
                                                else {
                                                    alt35=82;}
                                            }
                                            else {
                                                alt35=82;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            break;
                            case '#':
                            case '$':
                            case '-':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'I':
                            case 'J':
                            case 'K':
                            case 'M':
                            case 'N':
                            case 'O':
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                            case '\\':
                            case '_':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 's':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                            {
                                alt35=82;
                            }
                            break;
                            default:
                                alt35=31;}

                    }
                    break;
                    case 'A':
                    {
                        int LA35_84 = input.LA(3);

                        if ( (LA35_84=='L') ) {
                            int LA35_172 = input.LA(4);

                            if ( (LA35_172=='W') ) {
                                int LA35_223 = input.LA(5);

                                if ( (LA35_223=='A') ) {
                                    int LA35_266 = input.LA(6);

                                    if ( (LA35_266=='Y') ) {
                                        int LA35_297 = input.LA(7);

                                        if ( (LA35_297=='S') ) {
                                            int LA35_315 = input.LA(8);

                                            if ( ((LA35_315>='#' && LA35_315<='$')||LA35_315=='-'||(LA35_315>='0' && LA35_315<='9')||(LA35_315>='A' && LA35_315<='Z')||LA35_315=='\\'||LA35_315=='_'||(LA35_315>='a' && LA35_315<='z')) ) {
                                                alt35=82;
                                            }
                                            else {
                                                alt35=31;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'R':
                    {
                        switch ( input.LA(3) ) {
                            case 'E':
                            {
                                int LA35_173 = input.LA(4);

                                if ( (LA35_173=='L') ) {
                                    int LA35_224 = input.LA(5);

                                    if ( (LA35_224=='E') ) {
                                        int LA35_267 = input.LA(6);

                                        if ( (LA35_267=='A') ) {
                                            int LA35_298 = input.LA(7);

                                            if ( (LA35_298=='S') ) {
                                                int LA35_316 = input.LA(8);

                                                if ( (LA35_316=='E') ) {
                                                    int LA35_328 = input.LA(9);

                                                    if ( ((LA35_328>='#' && LA35_328<='$')||LA35_328=='-'||(LA35_328>='0' && LA35_328<='9')||(LA35_328>='A' && LA35_328<='Z')||LA35_328=='\\'||LA35_328=='_'||(LA35_328>='a' && LA35_328<='z')) ) {
                                                        alt35=82;
                                                    }
                                                    else {
                                                        alt35=32;}
                                                }
                                                else {
                                                    alt35=82;}
                                            }
                                            else {
                                                alt35=82;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            break;
                            case '#':
                            case '$':
                            case '-':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'I':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'M':
                            case 'N':
                            case 'O':
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                            case '\\':
                            case '_':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 's':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                            {
                                alt35=82;
                            }
                            break;
                            default:
                                alt35=32;}

                    }
                    break;
                    default:
                        alt35=82;}

            }
            break;
            case 'F':
            {
                switch ( input.LA(2) ) {
                    case 'I':
                    {
                        int LA35_86 = input.LA(3);

                        if ( (LA35_86=='N') ) {
                            int LA35_175 = input.LA(4);

                            if ( (LA35_175=='A') ) {
                                int LA35_225 = input.LA(5);

                                if ( (LA35_225=='L') ) {
                                    int LA35_268 = input.LA(6);

                                    if ( (LA35_268=='L') ) {
                                        int LA35_299 = input.LA(7);

                                        if ( (LA35_299=='Y') ) {
                                            int LA35_317 = input.LA(8);

                                            if ( ((LA35_317>='#' && LA35_317<='$')||LA35_317=='-'||(LA35_317>='0' && LA35_317<='9')||(LA35_317>='A' && LA35_317<='Z')||LA35_317=='\\'||LA35_317=='_'||(LA35_317>='a' && LA35_317<='z')) ) {
                                                alt35=82;
                                            }
                                            else {
                                                alt35=19;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'A':
                    {
                        int LA35_87 = input.LA(3);

                        if ( (LA35_87=='L') ) {
                            int LA35_176 = input.LA(4);

                            if ( (LA35_176=='S') ) {
                                int LA35_226 = input.LA(5);

                                if ( (LA35_226=='E') ) {
                                    int LA35_269 = input.LA(6);

                                    if ( ((LA35_269>='#' && LA35_269<='$')||LA35_269=='-'||(LA35_269>='0' && LA35_269<='9')||(LA35_269>='A' && LA35_269<='Z')||LA35_269=='\\'||LA35_269=='_'||(LA35_269>='a' && LA35_269<='z')) ) {
                                        alt35=82;
                                    }
                                    else {
                                        alt35=41;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case '\'':
                    {
                        alt35=80;
                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=19;}

            }
            break;
            case 'O':
            {
                switch ( input.LA(2) ) {
                    case 'N':
                    {
                        int LA35_90 = input.LA(3);

                        if ( (LA35_90=='C') ) {
                            int LA35_177 = input.LA(4);

                            if ( (LA35_177=='E') ) {
                                int LA35_227 = input.LA(5);

                                if ( ((LA35_227>='#' && LA35_227<='$')||LA35_227=='-'||(LA35_227>='0' && LA35_227<='9')||(LA35_227>='A' && LA35_227<='Z')||LA35_227=='\\'||LA35_227=='_'||(LA35_227>='a' && LA35_227<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=20;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=20;}

            }
            break;
            case 'G':
            {
                switch ( input.LA(2) ) {
                    case 'L':
                    {
                        int LA35_92 = input.LA(3);

                        if ( (LA35_92=='O') ) {
                            int LA35_178 = input.LA(4);

                            if ( (LA35_178=='B') ) {
                                int LA35_228 = input.LA(5);

                                if ( (LA35_228=='A') ) {
                                    int LA35_270 = input.LA(6);

                                    if ( (LA35_270=='L') ) {
                                        int LA35_301 = input.LA(7);

                                        if ( (LA35_301=='L') ) {
                                            int LA35_318 = input.LA(8);

                                            if ( (LA35_318=='Y') ) {
                                                int LA35_329 = input.LA(9);

                                                if ( ((LA35_329>='#' && LA35_329<='$')||LA35_329=='-'||(LA35_329>='0' && LA35_329<='9')||(LA35_329>='A' && LA35_329<='Z')||LA35_329=='\\'||LA35_329=='_'||(LA35_329>='a' && LA35_329<='z')) ) {
                                                    alt35=82;
                                                }
                                                else {
                                                    alt35=21;}
                                            }
                                            else {
                                                alt35=82;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=21;}

            }
            break;
            case 'H':
            {
                switch ( input.LA(2) ) {
                    case 'I':
                    {
                        int LA35_94 = input.LA(3);

                        if ( (LA35_94=='S') ) {
                            int LA35_179 = input.LA(4);

                            if ( (LA35_179=='T') ) {
                                int LA35_229 = input.LA(5);

                                if ( (LA35_229=='O') ) {
                                    int LA35_271 = input.LA(6);

                                    if ( (LA35_271=='R') ) {
                                        int LA35_302 = input.LA(7);

                                        if ( (LA35_302=='I') ) {
                                            int LA35_319 = input.LA(8);

                                            if ( (LA35_319=='C') ) {
                                                int LA35_330 = input.LA(9);

                                                if ( (LA35_330=='A') ) {
                                                    int LA35_336 = input.LA(10);

                                                    if ( (LA35_336=='L') ) {
                                                        int LA35_341 = input.LA(11);

                                                        if ( (LA35_341=='L') ) {
                                                            int LA35_343 = input.LA(12);

                                                            if ( (LA35_343=='Y') ) {
                                                                int LA35_344 = input.LA(13);

                                                                if ( ((LA35_344>='#' && LA35_344<='$')||LA35_344=='-'||(LA35_344>='0' && LA35_344<='9')||(LA35_344>='A' && LA35_344<='Z')||LA35_344=='\\'||LA35_344=='_'||(LA35_344>='a' && LA35_344<='z')) ) {
                                                                    alt35=82;
                                                                }
                                                                else {
                                                                    alt35=22;}
                                                            }
                                                            else {
                                                                alt35=82;}
                                                        }
                                                        else {
                                                            alt35=82;}
                                                    }
                                                    else {
                                                        alt35=82;}
                                                }
                                                else {
                                                    alt35=82;}
                                            }
                                            else {
                                                alt35=82;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=22;}

            }
            break;
            case 'X':
            {
                int LA35_12 = input.LA(2);

                if ( ((LA35_12>='#' && LA35_12<='$')||LA35_12=='-'||(LA35_12>='0' && LA35_12<='9')||(LA35_12>='A' && LA35_12<='Z')||LA35_12=='\\'||LA35_12=='_'||(LA35_12>='a' && LA35_12<='z')) ) {
                    alt35=82;
                }
                else {
                    alt35=23;}
            }
            break;
            case 'N':
            {
                int LA35_13 = input.LA(2);

                if ( (LA35_13=='E') ) {
                    int LA35_97 = input.LA(3);

                    if ( (LA35_97=='X') ) {
                        int LA35_180 = input.LA(4);

                        if ( (LA35_180=='T') ) {
                            int LA35_230 = input.LA(5);

                            if ( ((LA35_230>='#' && LA35_230<='$')||LA35_230=='-'||(LA35_230>='0' && LA35_230<='9')||(LA35_230>='A' && LA35_230<='Z')||LA35_230=='\\'||LA35_230=='_'||(LA35_230>='a' && LA35_230<='z')) ) {
                                alt35=82;
                            }
                            else {
                                alt35=23;}
                        }
                        else {
                            alt35=82;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case 'Y':
            {
                int LA35_14 = input.LA(2);

                if ( ((LA35_14>='#' && LA35_14<='$')||LA35_14=='-'||(LA35_14>='0' && LA35_14<='9')||(LA35_14>='A' && LA35_14<='Z')||LA35_14=='\\'||LA35_14=='_'||(LA35_14>='a' && LA35_14<='z')) ) {
                    alt35=82;
                }
                else {
                    alt35=24;}
            }
            break;
            case 'P':
            {
                int LA35_15 = input.LA(2);

                if ( (LA35_15=='R') ) {
                    int LA35_99 = input.LA(3);

                    if ( (LA35_99=='E') ) {
                        int LA35_181 = input.LA(4);

                        if ( (LA35_181=='V') ) {
                            int LA35_231 = input.LA(5);

                            if ( ((LA35_231>='#' && LA35_231<='$')||LA35_231=='-'||(LA35_231>='0' && LA35_231<='9')||(LA35_231>='A' && LA35_231<='Z')||LA35_231=='\\'||LA35_231=='_'||(LA35_231>='a' && LA35_231<='z')) ) {
                                alt35=82;
                            }
                            else {
                                alt35=24;}
                        }
                        else {
                            alt35=82;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case 'U':
            {
                switch ( input.LA(2) ) {
                    case 'n':
                    {
                        int LA35_100 = input.LA(3);

                        if ( (LA35_100=='t') ) {
                            int LA35_182 = input.LA(4);

                            if ( (LA35_182=='i') ) {
                                int LA35_232 = input.LA(5);

                                if ( (LA35_232=='l') ) {
                                    int LA35_272 = input.LA(6);

                                    if ( ((LA35_272>='#' && LA35_272<='$')||LA35_272=='-'||(LA35_272>='0' && LA35_272<='9')||(LA35_272>='A' && LA35_272<='Z')||LA35_272=='\\'||LA35_272=='_'||(LA35_272>='a' && LA35_272<='z')) ) {
                                        alt35=82;
                                    }
                                    else {
                                        alt35=25;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'N':
                    {
                        int LA35_101 = input.LA(3);

                        if ( (LA35_101=='T') ) {
                            int LA35_183 = input.LA(4);

                            if ( (LA35_183=='I') ) {
                                int LA35_233 = input.LA(5);

                                if ( (LA35_233=='L') ) {
                                    int LA35_273 = input.LA(6);

                                    if ( ((LA35_273>='#' && LA35_273<='$')||LA35_273=='-'||(LA35_273>='0' && LA35_273<='9')||(LA35_273>='A' && LA35_273<='Z')||LA35_273=='\\'||LA35_273=='_'||(LA35_273>='a' && LA35_273<='z')) ) {
                                        alt35=82;
                                    }
                                    else {
                                        alt35=25;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=25;}

            }
            break;
            case 'R':
            {
                switch ( input.LA(2) ) {
                    case 'E':
                    {
                        switch ( input.LA(3) ) {
                            case 'A':
                            {
                                int LA35_184 = input.LA(4);

                                if ( (LA35_184=='D') ) {
                                    int LA35_234 = input.LA(5);

                                    if ( ((LA35_234>='#' && LA35_234<='$')||LA35_234=='-'||(LA35_234>='0' && LA35_234<='9')||(LA35_234>='A' && LA35_234<='Z')||LA35_234=='\\'||LA35_234=='_'||(LA35_234>='a' && LA35_234<='z')) ) {
                                        alt35=82;
                                    }
                                    else {
                                        alt35=46;}
                                }
                                else {
                                    alt35=82;}
                            }
                            break;
                            case 'L':
                            {
                                int LA35_185 = input.LA(4);

                                if ( (LA35_185=='E') ) {
                                    int LA35_235 = input.LA(5);

                                    if ( (LA35_235=='A') ) {
                                        int LA35_275 = input.LA(6);

                                        if ( (LA35_275=='S') ) {
                                            int LA35_303 = input.LA(7);

                                            if ( (LA35_303=='E') ) {
                                                int LA35_320 = input.LA(8);

                                                if ( ((LA35_320>='#' && LA35_320<='$')||LA35_320=='-'||(LA35_320>='0' && LA35_320<='9')||(LA35_320>='A' && LA35_320<='Z')||LA35_320=='\\'||LA35_320=='_'||(LA35_320>='a' && LA35_320<='z')) ) {
                                                    alt35=82;
                                                }
                                                else {
                                                    alt35=27;}
                                            }
                                            else {
                                                alt35=82;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            break;
                            default:
                                alt35=82;}

                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=27;}

            }
            break;
            case 'T':
            {
                switch ( input.LA(2) ) {
                    case 'R':
                    {
                        switch ( input.LA(3) ) {
                            case 'U':
                            {
                                int LA35_186 = input.LA(4);

                                if ( (LA35_186=='E') ) {
                                    int LA35_236 = input.LA(5);

                                    if ( ((LA35_236>='#' && LA35_236<='$')||LA35_236=='-'||(LA35_236>='0' && LA35_236<='9')||(LA35_236>='A' && LA35_236<='Z')||LA35_236=='\\'||LA35_236=='_'||(LA35_236>='a' && LA35_236<='z')) ) {
                                        alt35=82;
                                    }
                                    else {
                                        alt35=42;}
                                }
                                else {
                                    alt35=82;}
                            }
                            break;
                            case 'I':
                            {
                                int LA35_187 = input.LA(4);

                                if ( (LA35_187=='G') ) {
                                    int LA35_237 = input.LA(5);

                                    if ( (LA35_237=='G') ) {
                                        int LA35_277 = input.LA(6);

                                        if ( (LA35_277=='E') ) {
                                            int LA35_304 = input.LA(7);

                                            if ( (LA35_304=='R') ) {
                                                int LA35_321 = input.LA(8);

                                                if ( (LA35_321=='E') ) {
                                                    int LA35_331 = input.LA(9);

                                                    if ( (LA35_331=='D') ) {
                                                        int LA35_337 = input.LA(10);

                                                        if ( ((LA35_337>='#' && LA35_337<='$')||LA35_337=='-'||(LA35_337>='0' && LA35_337<='9')||(LA35_337>='A' && LA35_337<='Z')||LA35_337=='\\'||LA35_337=='_'||(LA35_337>='a' && LA35_337<='z')) ) {
                                                            alt35=82;
                                                        }
                                                        else {
                                                            alt35=28;}
                                                    }
                                                    else {
                                                        alt35=82;}
                                                }
                                                else {
                                                    alt35=82;}
                                            }
                                            else {
                                                alt35=82;}
                                        }
                                        else {
                                            alt35=82;}
                                    }
                                    else {
                                        alt35=82;}
                                }
                                else {
                                    alt35=82;}
                            }
                            break;
                            default:
                                alt35=82;}

                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=28;}

            }
            break;
            case 'Z':
            {
                int LA35_19 = input.LA(2);

                if ( ((LA35_19>='#' && LA35_19<='$')||LA35_19=='-'||(LA35_19>='0' && LA35_19<='9')||(LA35_19>='A' && LA35_19<='Z')||LA35_19=='\\'||LA35_19=='_'||(LA35_19>='a' && LA35_19<='z')) ) {
                    alt35=82;
                }
                else {
                    alt35=29;}
            }
            break;
            case 'K':
            {
                switch ( input.LA(2) ) {
                    case 'N':
                    {
                        int LA35_108 = input.LA(3);

                        if ( (LA35_108=='O') ) {
                            int LA35_188 = input.LA(4);

                            if ( (LA35_188=='W') ) {
                                int LA35_238 = input.LA(5);

                                if ( ((LA35_238>='#' && LA35_238<='$')||LA35_238=='-'||(LA35_238>='0' && LA35_238<='9')||(LA35_238>='A' && LA35_238<='Z')||LA35_238=='\\'||LA35_238=='_'||(LA35_238>='a' && LA35_238<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=33;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'n':
                    {
                        int LA35_109 = input.LA(3);

                        if ( (LA35_109=='o') ) {
                            int LA35_189 = input.LA(4);

                            if ( (LA35_189=='w') ) {
                                int LA35_239 = input.LA(5);

                                if ( ((LA35_239>='#' && LA35_239<='$')||LA35_239=='-'||(LA35_239>='0' && LA35_239<='9')||(LA35_239>='A' && LA35_239<='Z')||LA35_239=='\\'||LA35_239=='_'||(LA35_239>='a' && LA35_239<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=33;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '\\':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    {
                        alt35=82;
                    }
                    break;
                    default:
                        alt35=33;}

            }
            break;
            case '(':
            {
                alt35=35;
            }
            break;
            case ')':
            {
                alt35=36;
            }
            break;
            case '[':
            {
                alt35=37;
            }
            break;
            case ']':
            {
                alt35=38;
            }
            break;
            case '{':
            {
                alt35=39;
            }
            break;
            case '}':
            {
                alt35=40;
            }
            break;
            case 'w':
            {
                int LA35_27 = input.LA(2);

                if ( (LA35_27=='o') ) {
                    int LA35_111 = input.LA(3);

                    if ( (LA35_111=='r') ) {
                        int LA35_190 = input.LA(4);

                        if ( (LA35_190=='d') ) {
                            switch ( input.LA(5) ) {
                                case '1':
                                {
                                    int LA35_278 = input.LA(6);

                                    if ( ((LA35_278>='#' && LA35_278<='$')||LA35_278=='-'||(LA35_278>='0' && LA35_278<='9')||(LA35_278>='A' && LA35_278<='Z')||LA35_278=='\\'||LA35_278=='_'||(LA35_278>='a' && LA35_278<='z')) ) {
                                        alt35=82;
                                    }
                                    else {
                                        alt35=43;}
                                }
                                break;
                                case '#':
                                case '$':
                                case '-':
                                case '0':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case 'A':
                                case 'B':
                                case 'C':
                                case 'D':
                                case 'E':
                                case 'F':
                                case 'G':
                                case 'H':
                                case 'I':
                                case 'J':
                                case 'K':
                                case 'L':
                                case 'M':
                                case 'N':
                                case 'O':
                                case 'P':
                                case 'Q':
                                case 'R':
                                case 'S':
                                case 'T':
                                case 'U':
                                case 'V':
                                case 'W':
                                case 'X':
                                case 'Y':
                                case 'Z':
                                case '\\':
                                case '_':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'i':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'o':
                                case 'p':
                                case 'q':
                                case 'r':
                                case 's':
                                case 't':
                                case 'u':
                                case 'v':
                                case 'w':
                                case 'x':
                                case 'y':
                                case 'z':
                                {
                                    alt35=82;
                                }
                                break;
                                default:
                                    alt35=44;}

                        }
                        else {
                            alt35=82;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case 'W':
            {
                switch ( input.LA(2) ) {
                    case 'o':
                    {
                        int LA35_112 = input.LA(3);

                        if ( (LA35_112=='r') ) {
                            int LA35_191 = input.LA(4);

                            if ( (LA35_191=='d') ) {
                                int LA35_241 = input.LA(5);

                                if ( ((LA35_241>='#' && LA35_241<='$')||LA35_241=='-'||(LA35_241>='0' && LA35_241<='9')||(LA35_241>='A' && LA35_241<='Z')||LA35_241=='\\'||LA35_241=='_'||(LA35_241>='a' && LA35_241<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=44;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'R':
                    {
                        int LA35_113 = input.LA(3);

                        if ( (LA35_113=='I') ) {
                            int LA35_192 = input.LA(4);

                            if ( (LA35_192=='T') ) {
                                int LA35_242 = input.LA(5);

                                if ( (LA35_242=='E') ) {
                                    int LA35_280 = input.LA(6);

                                    if ( ((LA35_280>='#' && LA35_280<='$')||LA35_280=='-'||(LA35_280>='0' && LA35_280<='9')||(LA35_280>='A' && LA35_280<='Z')||LA35_280=='\\'||LA35_280=='_'||(LA35_280>='a' && LA35_280<='z')) ) {
                                        alt35=82;
                                    }
                                    else {
                                        alt35=47;}
                                }
                                else {
                                    alt35=82;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    default:
                        alt35=82;}

            }
            break;
            case 'b':
            {
                int LA35_29 = input.LA(2);

                if ( (LA35_29=='o') ) {
                    int LA35_114 = input.LA(3);

                    if ( (LA35_114=='o') ) {
                        int LA35_193 = input.LA(4);

                        if ( (LA35_193=='l') ) {
                            int LA35_243 = input.LA(5);

                            if ( ((LA35_243>='#' && LA35_243<='$')||LA35_243=='-'||(LA35_243>='0' && LA35_243<='9')||(LA35_243>='A' && LA35_243<='Z')||LA35_243=='\\'||LA35_243=='_'||(LA35_243>='a' && LA35_243<='z')) ) {
                                alt35=82;
                            }
                            else {
                                alt35=45;}
                        }
                        else {
                            alt35=82;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case 'c':
            {
                int LA35_30 = input.LA(2);

                if ( (LA35_30=='a') ) {
                    int LA35_115 = input.LA(3);

                    if ( (LA35_115=='s') ) {
                        int LA35_194 = input.LA(4);

                        if ( (LA35_194=='e') ) {
                            int LA35_244 = input.LA(5);

                            if ( ((LA35_244>='#' && LA35_244<='$')||LA35_244=='-'||(LA35_244>='0' && LA35_244<='9')||(LA35_244>='A' && LA35_244<='Z')||LA35_244=='\\'||LA35_244=='_'||(LA35_244>='a' && LA35_244<='z')) ) {
                                alt35=82;
                            }
                            else {
                                alt35=48;}
                        }
                        else {
                            alt35=82;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case 'e':
            {
                int LA35_31 = input.LA(2);

                if ( (LA35_31=='s') ) {
                    int LA35_116 = input.LA(3);

                    if ( (LA35_116=='a') ) {
                        int LA35_195 = input.LA(4);

                        if ( (LA35_195=='c') ) {
                            int LA35_245 = input.LA(5);

                            if ( ((LA35_245>='#' && LA35_245<='$')||LA35_245=='-'||(LA35_245>='0' && LA35_245<='9')||(LA35_245>='A' && LA35_245<='Z')||LA35_245=='\\'||LA35_245=='_'||(LA35_245>='a' && LA35_245<='z')) ) {
                                alt35=82;
                            }
                            else {
                                alt35=49;}
                        }
                        else {
                            alt35=82;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case '+':
            {
                alt35=50;
            }
            break;
            case '-':
            {
                switch ( input.LA(2) ) {
                    case '>':
                    {
                        alt35=68;
                    }
                    break;
                    case '-':
                    {
                        alt35=85;
                    }
                    break;
                    default:
                        alt35=51;}

            }
            break;
            case '*':
            {
                alt35=52;
            }
            break;
            case '/':
            {
                switch ( input.LA(2) ) {
                    case '*':
                    {
                        alt35=84;
                    }
                    break;
                    case '/':
                    {
                        alt35=85;
                    }
                    break;
                    default:
                        alt35=53;}

            }
            break;
            case 'm':
            {
                int LA35_36 = input.LA(2);

                if ( (LA35_36=='o') ) {
                    int LA35_122 = input.LA(3);

                    if ( (LA35_122=='d') ) {
                        int LA35_196 = input.LA(4);

                        if ( ((LA35_196>='#' && LA35_196<='$')||LA35_196=='-'||(LA35_196>='0' && LA35_196<='9')||(LA35_196>='A' && LA35_196<='Z')||LA35_196=='\\'||LA35_196=='_'||(LA35_196>='a' && LA35_196<='z')) ) {
                            alt35=82;
                        }
                        else {
                            alt35=54;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case '<':
            {
                switch ( input.LA(2) ) {
                    case '<':
                    {
                        alt35=55;
                    }
                    break;
                    case '=':
                    {
                        alt35=59;
                    }
                    break;
                    case '-':
                    {
                        alt35=69;
                    }
                    break;
                    default:
                        alt35=61;}

            }
            break;
            case '>':
            {
                switch ( input.LA(2) ) {
                    case '>':
                    {
                        alt35=56;
                    }
                    break;
                    case '=':
                    {
                        alt35=60;
                    }
                    break;
                    default:
                        alt35=62;}

            }
            break;
            case '=':
            {
                alt35=57;
            }
            break;
            case '!':
            {
                int LA35_40 = input.LA(2);

                if ( (LA35_40=='=') ) {
                    alt35=58;
                }
                else {
                    alt35=74;}
            }
            break;
            case 'n':
            {
                int LA35_41 = input.LA(2);

                if ( (LA35_41=='e') ) {
                    int LA35_132 = input.LA(3);

                    if ( (LA35_132=='x') ) {
                        int LA35_197 = input.LA(4);

                        if ( (LA35_197=='t') ) {
                            int LA35_247 = input.LA(5);

                            if ( ((LA35_247>='#' && LA35_247<='$')||LA35_247=='-'||(LA35_247>='0' && LA35_247<='9')||(LA35_247>='A' && LA35_247<='Z')||LA35_247=='\\'||LA35_247=='_'||(LA35_247>='a' && LA35_247<='z')) ) {
                                alt35=82;
                            }
                            else {
                                alt35=63;}
                        }
                        else {
                            alt35=82;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case 'u':
            {
                int LA35_42 = input.LA(2);

                if ( (LA35_42=='n') ) {
                    int LA35_133 = input.LA(3);

                    if ( (LA35_133=='i') ) {
                        int LA35_198 = input.LA(4);

                        if ( (LA35_198=='o') ) {
                            int LA35_248 = input.LA(5);

                            if ( (LA35_248=='n') ) {
                                int LA35_285 = input.LA(6);

                                if ( ((LA35_285>='#' && LA35_285<='$')||LA35_285=='-'||(LA35_285>='0' && LA35_285<='9')||(LA35_285>='A' && LA35_285<='Z')||LA35_285=='\\'||LA35_285=='_'||(LA35_285>='a' && LA35_285<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=64;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    else {
                        alt35=82;}
                }
                else {
                    alt35=82;}
            }
            break;
            case 'i':
            {
                int LA35_43 = input.LA(2);

                if ( (LA35_43=='n') ) {
                    int LA35_134 = input.LA(3);

                    if ( ((LA35_134>='#' && LA35_134<='$')||LA35_134=='-'||(LA35_134>='0' && LA35_134<='9')||(LA35_134>='A' && LA35_134<='Z')||LA35_134=='\\'||LA35_134=='_'||(LA35_134>='a' && LA35_134<='z')) ) {
                        alt35=82;
                    }
                    else {
                        alt35=65;}
                }
                else {
                    alt35=82;}
            }
            break;
            case '.':
            {
                int LA35_44 = input.LA(2);

                if ( (LA35_44=='.') ) {
                    alt35=66;
                }
                else {
                    alt35=67;}
            }
            break;
            case '|':
            {
                alt35=70;
            }
            break;
            case '&':
            {
                alt35=71;
            }
            break;
            case 'x':
            {
                switch ( input.LA(2) ) {
                    case 'o':
                    {
                        int LA35_137 = input.LA(3);

                        if ( (LA35_137=='r') ) {
                            int LA35_200 = input.LA(4);

                            if ( ((LA35_200>='#' && LA35_200<='$')||LA35_200=='-'||(LA35_200>='0' && LA35_200<='9')||(LA35_200>='A' && LA35_200<='Z')||LA35_200=='\\'||LA35_200=='_'||(LA35_200>='a' && LA35_200<='z')) ) {
                                alt35=82;
                            }
                            else {
                                alt35=72;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    case 'n':
                    {
                        int LA35_138 = input.LA(3);

                        if ( (LA35_138=='o') ) {
                            int LA35_201 = input.LA(4);

                            if ( (LA35_201=='r') ) {
                                int LA35_250 = input.LA(5);

                                if ( ((LA35_250>='#' && LA35_250<='$')||LA35_250=='-'||(LA35_250>='0' && LA35_250<='9')||(LA35_250>='A' && LA35_250<='Z')||LA35_250=='\\'||LA35_250=='_'||(LA35_250>='a' && LA35_250<='z')) ) {
                                    alt35=82;
                                }
                                else {
                                    alt35=73;}
                            }
                            else {
                                alt35=82;}
                        }
                        else {
                            alt35=82;}
                    }
                    break;
                    default:
                        alt35=82;}

            }
            break;
            case ',':
            {
                alt35=75;
            }
            break;
            case ':':
            {
                int LA35_49 = input.LA(2);

                if ( (LA35_49==':') ) {
                    alt35=78;
                }
                else {
                    alt35=76;}
            }
            break;
            case ';':
            {
                alt35=77;
            }
            break;
            case '0':
            {
                int LA35_51 = input.LA(2);

                if ( (LA35_51=='B'||LA35_51=='D'||LA35_51=='H'||LA35_51=='O'||LA35_51=='b'||LA35_51=='d'||LA35_51=='h'||LA35_51=='o') ) {
                    alt35=79;
                }
                else {
                    alt35=81;}
            }
            break;
            case 'f':
            {
                int LA35_52 = input.LA(2);

                if ( (LA35_52=='\'') ) {
                    alt35=80;
                }
                else {
                    alt35=82;}
            }
            break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            {
                alt35=81;
            }
            break;
            case 'D':
            case 'J':
            case 'M':
            case 'Q':
            case 'V':
            case '_':
            case 'a':
            case 'd':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'y':
            case 'z':
            {
                alt35=82;
            }
            break;
            case '\t':
            case '\n':
            case '\r':
            case ' ':
            {
                alt35=83;
            }
            break;
            default:
                NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( TOK_CTL_SPEC | TOK_CTL_STAR_SPEC | TOK_LTL_SPEC | TOK_INVAR_SPEC | TOK_ATL_STAR_SPEC | TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_EE | TOK_AA | TOK_BUNTIL | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_NEXT | TOK_OP_PREV | TOK_UNTIL | TOK_SINCE | TOK_RELEASE | TOK_TRIGGERED | TOK_OP_NOTPREVNOT | TOK_OP_BFINALLY | TOK_OP_BGLOBALLY | TOK_BRELEASE | TOK_KNOW | TOK_SKNOW | TOK_LP | TOK_RP | TOK_LB | TOK_RB | TOK_LCB | TOK_RCB | TOK_FALSEEXP | TOK_TRUEEXP | TOK_WORD1 | TOK_WORD | TOK_BOOL | TOK_WAREAD | TOK_WAWRITE | TOK_CASE | TOK_ESAC | TOK_PLUS | TOK_MINUS | TOK_TIMES | TOK_DIVIDE | TOK_MOD | TOK_LSHIFT | TOK_RSHIFT | TOK_EQUAL | TOK_NOTEQUAL | TOK_LE | TOK_GE | TOK_LT | TOK_GT | TOK_NEXT | TOK_UNION | TOK_SETIN | TOK_TWODOTS | TOK_DOT | TOK_IMPLIES | TOK_IFF | TOK_OR | TOK_AND | TOK_XOR | TOK_XNOR | TOK_NOT | TOK_COMMA | TOK_COLON | TOK_SEMI | TOK_CONCATENATION | TOK_NUMBER_WORD | TOK_NUMBER_FRAC | TOK_NUMBER | TOK_ATOM | JTOK_WS | JTOK_MULTI_COMMENT | JTOK_LINE_COMMENT );", 35, 0, input);

                throw nvae;
        }

        switch (alt35) {
            case 1 :
                // F:\\StudyAntlr\\SPC.g:1:10: TOK_CTL_SPEC
            {
                mTOK_CTL_SPEC();

            }
            break;
            case 2 :
                // F:\\StudyAntlr\\SPC.g:1:23: TOK_CTL_STAR_SPEC
            {
                mTOK_CTL_STAR_SPEC();

            }
            break;
            case 3 :
                // F:\\StudyAntlr\\SPC.g:1:41: TOK_LTL_SPEC
            {
                mTOK_LTL_SPEC();

            }
            break;
            case 4 :
                // F:\\StudyAntlr\\SPC.g:1:54: TOK_INVAR_SPEC
            {
                mTOK_INVAR_SPEC();

            }
            break;
            case 5 :
                // F:\\StudyAntlr\\SPC.g:1:69: TOK_ATL_STAR_SPEC
            {
                mTOK_ATL_STAR_SPEC();

            }
            break;
            case 6 :
                // F:\\StudyAntlr\\SPC.g:1:87: TOK_EX
            {
                mTOK_EX();

            }
            break;
            case 7 :
                // F:\\StudyAntlr\\SPC.g:1:94: TOK_AX
            {
                mTOK_AX();

            }
            break;
            case 8 :
                // F:\\StudyAntlr\\SPC.g:1:101: TOK_EF
            {
                mTOK_EF();

            }
            break;
            case 9 :
                // F:\\StudyAntlr\\SPC.g:1:108: TOK_AF
            {
                mTOK_AF();

            }
            break;
            case 10 :
                // F:\\StudyAntlr\\SPC.g:1:115: TOK_EG
            {
                mTOK_EG();

            }
            break;
            case 11 :
                // F:\\StudyAntlr\\SPC.g:1:122: TOK_AG
            {
                mTOK_AG();

            }
            break;
            case 12 :
                // F:\\StudyAntlr\\SPC.g:1:129: TOK_EE
            {
                mTOK_EE();

            }
            break;
            case 13 :
                // F:\\StudyAntlr\\SPC.g:1:136: TOK_AA
            {
                mTOK_AA();

            }
            break;
            case 14 :
                // F:\\StudyAntlr\\SPC.g:1:143: TOK_BUNTIL
            {
                mTOK_BUNTIL();

            }
            break;
            case 15 :
                // F:\\StudyAntlr\\SPC.g:1:154: TOK_EBF
            {
                mTOK_EBF();

            }
            break;
            case 16 :
                // F:\\StudyAntlr\\SPC.g:1:162: TOK_ABF
            {
                mTOK_ABF();

            }
            break;
            case 17 :
                // F:\\StudyAntlr\\SPC.g:1:170: TOK_EBG
            {
                mTOK_EBG();

            }
            break;
            case 18 :
                // F:\\StudyAntlr\\SPC.g:1:178: TOK_ABG
            {
                mTOK_ABG();

            }
            break;
            case 19 :
                // F:\\StudyAntlr\\SPC.g:1:186: TOK_OP_FINALLY
            {
                mTOK_OP_FINALLY();

            }
            break;
            case 20 :
                // F:\\StudyAntlr\\SPC.g:1:201: TOK_OP_ONCE
            {
                mTOK_OP_ONCE();

            }
            break;
            case 21 :
                // F:\\StudyAntlr\\SPC.g:1:213: TOK_OP_GLOBALLY
            {
                mTOK_OP_GLOBALLY();

            }
            break;
            case 22 :
                // F:\\StudyAntlr\\SPC.g:1:229: TOK_OP_HISTORICALLY
            {
                mTOK_OP_HISTORICALLY();

            }
            break;
            case 23 :
                // F:\\StudyAntlr\\SPC.g:1:249: TOK_OP_NEXT
            {
                mTOK_OP_NEXT();

            }
            break;
            case 24 :
                // F:\\StudyAntlr\\SPC.g:1:261: TOK_OP_PREV
            {
                mTOK_OP_PREV();

            }
            break;
            case 25 :
                // F:\\StudyAntlr\\SPC.g:1:273: TOK_UNTIL
            {
                mTOK_UNTIL();

            }
            break;
            case 26 :
                // F:\\StudyAntlr\\SPC.g:1:283: TOK_SINCE
            {
                mTOK_SINCE();

            }
            break;
            case 27 :
                // F:\\StudyAntlr\\SPC.g:1:293: TOK_RELEASE
            {
                mTOK_RELEASE();

            }
            break;
            case 28 :
                // F:\\StudyAntlr\\SPC.g:1:305: TOK_TRIGGERED
            {
                mTOK_TRIGGERED();

            }
            break;
            case 29 :
                // F:\\StudyAntlr\\SPC.g:1:319: TOK_OP_NOTPREVNOT
            {
                mTOK_OP_NOTPREVNOT();

            }
            break;
            case 30 :
                // F:\\StudyAntlr\\SPC.g:1:337: TOK_OP_BFINALLY
            {
                mTOK_OP_BFINALLY();

            }
            break;
            case 31 :
                // F:\\StudyAntlr\\SPC.g:1:353: TOK_OP_BGLOBALLY
            {
                mTOK_OP_BGLOBALLY();

            }
            break;
            case 32 :
                // F:\\StudyAntlr\\SPC.g:1:370: TOK_BRELEASE
            {
                mTOK_BRELEASE();

            }
            break;
            case 33 :
                // F:\\StudyAntlr\\SPC.g:1:383: TOK_KNOW
            {
                mTOK_KNOW();

            }
            break;
            case 34 :
                // F:\\StudyAntlr\\SPC.g:1:392: TOK_SKNOW
            {
                mTOK_SKNOW();

            }
            break;
            case 35 :
                // F:\\StudyAntlr\\SPC.g:1:402: TOK_LP
            {
                mTOK_LP();

            }
            break;
            case 36 :
                // F:\\StudyAntlr\\SPC.g:1:409: TOK_RP
            {
                mTOK_RP();

            }
            break;
            case 37 :
                // F:\\StudyAntlr\\SPC.g:1:416: TOK_LB
            {
                mTOK_LB();

            }
            break;
            case 38 :
                // F:\\StudyAntlr\\SPC.g:1:423: TOK_RB
            {
                mTOK_RB();

            }
            break;
            case 39 :
                // F:\\StudyAntlr\\SPC.g:1:430: TOK_LCB
            {
                mTOK_LCB();

            }
            break;
            case 40 :
                // F:\\StudyAntlr\\SPC.g:1:438: TOK_RCB
            {
                mTOK_RCB();

            }
            break;
            case 41 :
                // F:\\StudyAntlr\\SPC.g:1:446: TOK_FALSEEXP
            {
                mTOK_FALSEEXP();

            }
            break;
            case 42 :
                // F:\\StudyAntlr\\SPC.g:1:459: TOK_TRUEEXP
            {
                mTOK_TRUEEXP();

            }
            break;
            case 43 :
                // F:\\StudyAntlr\\SPC.g:1:471: TOK_WORD1
            {
                mTOK_WORD1();

            }
            break;
            case 44 :
                // F:\\StudyAntlr\\SPC.g:1:481: TOK_WORD
            {
                mTOK_WORD();

            }
            break;
            case 45 :
                // F:\\StudyAntlr\\SPC.g:1:490: TOK_BOOL
            {
                mTOK_BOOL();

            }
            break;
            case 46 :
                // F:\\StudyAntlr\\SPC.g:1:499: TOK_WAREAD
            {
                mTOK_WAREAD();

            }
            break;
            case 47 :
                // F:\\StudyAntlr\\SPC.g:1:510: TOK_WAWRITE
            {
                mTOK_WAWRITE();

            }
            break;
            case 48 :
                // F:\\StudyAntlr\\SPC.g:1:522: TOK_CASE
            {
                mTOK_CASE();

            }
            break;
            case 49 :
                // F:\\StudyAntlr\\SPC.g:1:531: TOK_ESAC
            {
                mTOK_ESAC();

            }
            break;
            case 50 :
                // F:\\StudyAntlr\\SPC.g:1:540: TOK_PLUS
            {
                mTOK_PLUS();

            }
            break;
            case 51 :
                // F:\\StudyAntlr\\SPC.g:1:549: TOK_MINUS
            {
                mTOK_MINUS();

            }
            break;
            case 52 :
                // F:\\StudyAntlr\\SPC.g:1:559: TOK_TIMES
            {
                mTOK_TIMES();

            }
            break;
            case 53 :
                // F:\\StudyAntlr\\SPC.g:1:569: TOK_DIVIDE
            {
                mTOK_DIVIDE();

            }
            break;
            case 54 :
                // F:\\StudyAntlr\\SPC.g:1:580: TOK_MOD
            {
                mTOK_MOD();

            }
            break;
            case 55 :
                // F:\\StudyAntlr\\SPC.g:1:588: TOK_LSHIFT
            {
                mTOK_LSHIFT();

            }
            break;
            case 56 :
                // F:\\StudyAntlr\\SPC.g:1:599: TOK_RSHIFT
            {
                mTOK_RSHIFT();

            }
            break;
            case 57 :
                // F:\\StudyAntlr\\SPC.g:1:610: TOK_EQUAL
            {
                mTOK_EQUAL();

            }
            break;
            case 58 :
                // F:\\StudyAntlr\\SPC.g:1:620: TOK_NOTEQUAL
            {
                mTOK_NOTEQUAL();

            }
            break;
            case 59 :
                // F:\\StudyAntlr\\SPC.g:1:633: TOK_LE
            {
                mTOK_LE();

            }
            break;
            case 60 :
                // F:\\StudyAntlr\\SPC.g:1:640: TOK_GE
            {
                mTOK_GE();

            }
            break;
            case 61 :
                // F:\\StudyAntlr\\SPC.g:1:647: TOK_LT
            {
                mTOK_LT();

            }
            break;
            case 62 :
                // F:\\StudyAntlr\\SPC.g:1:654: TOK_GT
            {
                mTOK_GT();

            }
            break;
            case 63 :
                // F:\\StudyAntlr\\SPC.g:1:661: TOK_NEXT
            {
                mTOK_NEXT();

            }
            break;
            case 64 :
                // F:\\StudyAntlr\\SPC.g:1:670: TOK_UNION
            {
                mTOK_UNION();

            }
            break;
            case 65 :
                // F:\\StudyAntlr\\SPC.g:1:680: TOK_SETIN
            {
                mTOK_SETIN();

            }
            break;
            case 66 :
                // F:\\StudyAntlr\\SPC.g:1:690: TOK_TWODOTS
            {
                mTOK_TWODOTS();

            }
            break;
            case 67 :
                // F:\\StudyAntlr\\SPC.g:1:702: TOK_DOT
            {
                mTOK_DOT();

            }
            break;
            case 68 :
                // F:\\StudyAntlr\\SPC.g:1:710: TOK_IMPLIES
            {
                mTOK_IMPLIES();

            }
            break;
            case 69 :
                // F:\\StudyAntlr\\SPC.g:1:722: TOK_IFF
            {
                mTOK_IFF();

            }
            break;
            case 70 :
                // F:\\StudyAntlr\\SPC.g:1:730: TOK_OR
            {
                mTOK_OR();

            }
            break;
            case 71 :
                // F:\\StudyAntlr\\SPC.g:1:737: TOK_AND
            {
                mTOK_AND();

            }
            break;
            case 72 :
                // F:\\StudyAntlr\\SPC.g:1:745: TOK_XOR
            {
                mTOK_XOR();

            }
            break;
            case 73 :
                // F:\\StudyAntlr\\SPC.g:1:753: TOK_XNOR
            {
                mTOK_XNOR();

            }
            break;
            case 74 :
                // F:\\StudyAntlr\\SPC.g:1:762: TOK_NOT
            {
                mTOK_NOT();

            }
            break;
            case 75 :
                // F:\\StudyAntlr\\SPC.g:1:770: TOK_COMMA
            {
                mTOK_COMMA();

            }
            break;
            case 76 :
                // F:\\StudyAntlr\\SPC.g:1:780: TOK_COLON
            {
                mTOK_COLON();

            }
            break;
            case 77 :
                // F:\\StudyAntlr\\SPC.g:1:790: TOK_SEMI
            {
                mTOK_SEMI();

            }
            break;
            case 78 :
                // F:\\StudyAntlr\\SPC.g:1:799: TOK_CONCATENATION
            {
                mTOK_CONCATENATION();

            }
            break;
            case 79 :
                // F:\\StudyAntlr\\SPC.g:1:817: TOK_NUMBER_WORD
            {
                mTOK_NUMBER_WORD();

            }
            break;
            case 80 :
                // F:\\StudyAntlr\\SPC.g:1:833: TOK_NUMBER_FRAC
            {
                mTOK_NUMBER_FRAC();

            }
            break;
            case 81 :
                // F:\\StudyAntlr\\SPC.g:1:849: TOK_NUMBER
            {
                mTOK_NUMBER();

            }
            break;
            case 82 :
                // F:\\StudyAntlr\\SPC.g:1:860: TOK_ATOM
            {
                mTOK_ATOM();

            }
            break;
            case 83 :
                // F:\\StudyAntlr\\SPC.g:1:869: JTOK_WS
            {
                mJTOK_WS();

            }
            break;
            case 84 :
                // F:\\StudyAntlr\\SPC.g:1:877: JTOK_MULTI_COMMENT
            {
                mJTOK_MULTI_COMMENT();

            }
            break;
            case 85 :
                // F:\\StudyAntlr\\SPC.g:1:896: JTOK_LINE_COMMENT
            {
                mJTOK_LINE_COMMENT();

            }
            break;

        }

    }




}