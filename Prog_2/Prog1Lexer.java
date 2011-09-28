// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Eclipse Projects\\Prog_2\\Prog1.g 2011-09-24 11:27:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Prog1Lexer extends Lexer {
    public static final int A=19;
    public static final int SEMICLN=14;
    public static final int TO=9;
    public static final int CB=17;
    public static final int NUMBER=22;
    public static final int DO=10;
    public static final int FOR=15;
    public static final int MULT=7;
    public static final int MINUS=6;
    public static final int ID=20;
    public static final int EOF=-1;
    public static final int WRITE=13;
    public static final int OB=16;
    public static final int BEGIN=11;
    public static final int ASSIGN=4;
    public static final int PLUS=5;
    public static final int DIGIT=21;
    public static final int DIV=8;
    public static final int END=12;
    public static final int CM=18;

    // delegates
    // delegators

    public Prog1Lexer() {;} 
    public Prog1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Prog1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Eclipse Projects\\Prog_2\\Prog1.g"; }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:7:8: ( ':=' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:7:10: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:8:6: ( '+' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:8:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:9:7: ( '-' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:9:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:10:6: ( '*' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:10:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:11:5: ( '/' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:11:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:12:4: ( 'TO' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:12:6: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:13:4: ( 'DO' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:13:6: 'DO'
            {
            match("DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:14:7: ( 'BEGIN' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:14:9: 'BEGIN'
            {
            match("BEGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:15:5: ( 'END' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:15:7: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:16:7: ( 'WRITE' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:16:9: 'WRITE'
            {
            match("WRITE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "SEMICLN"
    public final void mSEMICLN() throws RecognitionException {
        try {
            int _type = SEMICLN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:17:9: ( ';' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:17:11: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICLN"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:18:5: ( 'FOR' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:18:7: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "OB"
    public final void mOB() throws RecognitionException {
        try {
            int _type = OB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:19:4: ( '(' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:19:6: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OB"

    // $ANTLR start "CB"
    public final void mCB() throws RecognitionException {
        try {
            int _type = CB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:20:4: ( ')' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:20:6: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CB"

    // $ANTLR start "CM"
    public final void mCM() throws RecognitionException {
        try {
            int _type = CM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:21:4: ( ',' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:21:6: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CM"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:26:3: ( ( A )+ )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:26:5: ( A )+
            {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:26:5: ( A )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:26:5: A
            	    {
            	    mA(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:27:8: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:27:10: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:27:10: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:27:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:27:18: ( '.' ( DIGIT )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:27:19: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:27:23: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:27:24: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:29:12: ( 'a' .. 'z' | 'A' .. 'Z' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:30:15: ( '0' .. '9' )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:30:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:8: ( ASSIGN | PLUS | MINUS | MULT | DIV | TO | DO | BEGIN | END | WRITE | SEMICLN | FOR | OB | CB | CM | ID | NUMBER )
        int alt5=17;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:10: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 2 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:17: PLUS
                {
                mPLUS(); 

                }
                break;
            case 3 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:22: MINUS
                {
                mMINUS(); 

                }
                break;
            case 4 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:28: MULT
                {
                mMULT(); 

                }
                break;
            case 5 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:33: DIV
                {
                mDIV(); 

                }
                break;
            case 6 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:37: TO
                {
                mTO(); 

                }
                break;
            case 7 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:40: DO
                {
                mDO(); 

                }
                break;
            case 8 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:43: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 9 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:49: END
                {
                mEND(); 

                }
                break;
            case 10 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:53: WRITE
                {
                mWRITE(); 

                }
                break;
            case 11 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:59: SEMICLN
                {
                mSEMICLN(); 

                }
                break;
            case 12 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:67: FOR
                {
                mFOR(); 

                }
                break;
            case 13 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:71: OB
                {
                mOB(); 

                }
                break;
            case 14 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:74: CB
                {
                mCB(); 

                }
                break;
            case 15 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:77: CM
                {
                mCM(); 

                }
                break;
            case 16 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:80: ID
                {
                mID(); 

                }
                break;
            case 17 :
                // D:\\Eclipse Projects\\Prog_2\\Prog1.g:1:83: NUMBER
                {
                mNUMBER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\6\uffff\5\20\1\uffff\1\20\5\uffff\1\30\1\31\4\20\2\uffff\1\20"+
        "\1\37\1\20\1\41\1\20\1\uffff\1\20\1\uffff\1\44\1\45\2\uffff";
    static final String DFA5_eofS =
        "\46\uffff";
    static final String DFA5_minS =
        "\1\50\5\uffff\2\117\1\105\1\116\1\122\1\uffff\1\117\5\uffff\2\101"+
        "\1\107\1\104\1\111\1\122\2\uffff\1\111\1\101\1\124\1\101\1\116\1"+
        "\uffff\1\105\1\uffff\2\101\2\uffff";
    static final String DFA5_maxS =
        "\1\172\5\uffff\2\117\1\105\1\116\1\122\1\uffff\1\117\5\uffff\2"+
        "\172\1\107\1\104\1\111\1\122\2\uffff\1\111\1\172\1\124\1\172\1\116"+
        "\1\uffff\1\105\1\uffff\2\172\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\13\1\uffff\1\15\1\16\1\17"+
        "\1\20\1\21\6\uffff\1\6\1\7\5\uffff\1\11\1\uffff\1\14\2\uffff\1\10"+
        "\1\12";
    static final String DFA5_specialS =
        "\46\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\15\1\16\1\4\1\2\1\17\1\3\1\uffff\1\5\12\21\1\1\1\13\5\uffff"+
            "\1\20\1\10\1\20\1\7\1\11\1\14\15\20\1\6\2\20\1\12\3\20\6\uffff"+
            "\32\20",
            "",
            "",
            "",
            "",
            "",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "",
            "\1\27",
            "",
            "",
            "",
            "",
            "",
            "\32\20\6\uffff\32\20",
            "\32\20\6\uffff\32\20",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "",
            "\1\36",
            "\32\20\6\uffff\32\20",
            "\1\40",
            "\32\20\6\uffff\32\20",
            "\1\42",
            "",
            "\1\43",
            "",
            "\32\20\6\uffff\32\20",
            "\32\20\6\uffff\32\20",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ASSIGN | PLUS | MINUS | MULT | DIV | TO | DO | BEGIN | END | WRITE | SEMICLN | FOR | OB | CB | CM | ID | NUMBER );";
        }
    }
 

}