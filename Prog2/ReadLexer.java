// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Eclipse Projects\\Prog2\\Read.g 2011-09-20 15:25:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ReadLexer extends Lexer {
    public static final int READ=4;
    public static final int CB=6;
    public static final int IDLIST=9;
    public static final int ID=8;
    public static final int AL=10;
    public static final int EOF=-1;
    public static final int CM=7;
    public static final int OB=5;

    // delegates
    // delegators

    public ReadLexer() {;} 
    public ReadLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ReadLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Eclipse Projects\\Prog2\\Read.g"; }

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog2\\Read.g:7:6: ( 'READ' )
            // D:\\Eclipse Projects\\Prog2\\Read.g:7:8: 'READ'
            {
            match("READ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "OB"
    public final void mOB() throws RecognitionException {
        try {
            int _type = OB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog2\\Read.g:8:4: ( '(' )
            // D:\\Eclipse Projects\\Prog2\\Read.g:8:6: '('
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
            // D:\\Eclipse Projects\\Prog2\\Read.g:9:4: ( ')' )
            // D:\\Eclipse Projects\\Prog2\\Read.g:9:6: ')'
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
            // D:\\Eclipse Projects\\Prog2\\Read.g:10:4: ( ',' )
            // D:\\Eclipse Projects\\Prog2\\Read.g:10:6: ','
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

    // $ANTLR start "IDLIST"
    public final void mIDLIST() throws RecognitionException {
        try {
            int _type = IDLIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog2\\Read.g:34:8: ( ID ( ( ( CM ) ID )+ )? )
            // D:\\Eclipse Projects\\Prog2\\Read.g:34:10: ID ( ( ( CM ) ID )+ )?
            {
            mID(); 
            // D:\\Eclipse Projects\\Prog2\\Read.g:34:12: ( ( ( CM ) ID )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==',') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Eclipse Projects\\Prog2\\Read.g:34:13: ( ( CM ) ID )+
                    {
                    // D:\\Eclipse Projects\\Prog2\\Read.g:34:13: ( ( CM ) ID )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==',') ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // D:\\Eclipse Projects\\Prog2\\Read.g:34:14: ( CM ) ID
                    	    {
                    	    // D:\\Eclipse Projects\\Prog2\\Read.g:34:14: ( CM )
                    	    // D:\\Eclipse Projects\\Prog2\\Read.g:34:15: CM
                    	    {
                    	    mCM(); 

                    	    }

                    	    mID(); 

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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDLIST"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog2\\Read.g:35:13: ( ( AL )+ )
            // D:\\Eclipse Projects\\Prog2\\Read.g:35:15: ( AL )+
            {
            // D:\\Eclipse Projects\\Prog2\\Read.g:35:15: ( AL )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Eclipse Projects\\Prog2\\Read.g:35:15: AL
            	    {
            	    mAL(); 

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

        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "AL"
    public final void mAL() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog2\\Read.g:36:13: ( 'a' .. 'z' | 'A' .. 'Z' )
            // D:\\Eclipse Projects\\Prog2\\Read.g:
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
    // $ANTLR end "AL"

    public void mTokens() throws RecognitionException {
        // D:\\Eclipse Projects\\Prog2\\Read.g:1:8: ( READ | OB | CB | CM | IDLIST )
        int alt4=5;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // D:\\Eclipse Projects\\Prog2\\Read.g:1:10: READ
                {
                mREAD(); 

                }
                break;
            case 2 :
                // D:\\Eclipse Projects\\Prog2\\Read.g:1:15: OB
                {
                mOB(); 

                }
                break;
            case 3 :
                // D:\\Eclipse Projects\\Prog2\\Read.g:1:18: CB
                {
                mCB(); 

                }
                break;
            case 4 :
                // D:\\Eclipse Projects\\Prog2\\Read.g:1:21: CM
                {
                mCM(); 

                }
                break;
            case 5 :
                // D:\\Eclipse Projects\\Prog2\\Read.g:1:24: IDLIST
                {
                mIDLIST(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\1\5\4\uffff\2\5\1\11\1\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\50\1\105\4\uffff\1\101\1\104\1\54\1\uffff";
    static final String DFA4_maxS =
        "\1\172\1\105\4\uffff\1\101\1\104\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\3\uffff\1\1";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\3\2\uffff\1\4\24\uffff\21\5\1\1\10\5\6\uffff\32\5",
            "\1\6",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\5\24\uffff\32\5\6\uffff\32\5",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( READ | OB | CB | CM | IDLIST );";
        }
    }
 

}