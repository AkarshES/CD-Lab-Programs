// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Eclipse Projects\\Prog2\\Test.g 2011-09-20 15:03:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TestLexer extends Lexer {
    public static final int WS=13;
    public static final int A=9;
    public static final int NUMBER=12;
    public static final int PLUS=4;
    public static final int ASSIGNMENT=8;
    public static final int DIGIT=11;
    public static final int DIV=7;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int ID=10;
    public static final int EOF=-1;

    // delegates
    // delegators

    public TestLexer() {;} 
    public TestLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TestLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Eclipse Projects\\Prog2\\Test.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog2\\Test.g:7:6: ( '+' )
            // D:\\Eclipse Projects\\Prog2\\Test.g:7:8: '+'
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
            // D:\\Eclipse Projects\\Prog2\\Test.g:8:7: ( '-' )
            // D:\\Eclipse Projects\\Prog2\\Test.g:8:9: '-'
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
            // D:\\Eclipse Projects\\Prog2\\Test.g:9:6: ( '*' )
            // D:\\Eclipse Projects\\Prog2\\Test.g:9:8: '*'
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
            // D:\\Eclipse Projects\\Prog2\\Test.g:10:5: ( '/' )
            // D:\\Eclipse Projects\\Prog2\\Test.g:10:7: '/'
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

    // $ANTLR start "ASSIGNMENT"
    public final void mASSIGNMENT() throws RecognitionException {
        try {
            int _type = ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog2\\Test.g:11:12: ( ':=' )
            // D:\\Eclipse Projects\\Prog2\\Test.g:11:14: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGNMENT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog2\\Test.g:34:3: ( ( A )+ )
            // D:\\Eclipse Projects\\Prog2\\Test.g:34:5: ( A )+
            {
            // D:\\Eclipse Projects\\Prog2\\Test.g:34:5: ( A )+
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
            	    // D:\\Eclipse Projects\\Prog2\\Test.g:34:5: A
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
            // D:\\Eclipse Projects\\Prog2\\Test.g:35:8: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // D:\\Eclipse Projects\\Prog2\\Test.g:35:10: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // D:\\Eclipse Projects\\Prog2\\Test.g:35:10: ( DIGIT )+
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
            	    // D:\\Eclipse Projects\\Prog2\\Test.g:35:11: DIGIT
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

            // D:\\Eclipse Projects\\Prog2\\Test.g:35:18: ( '.' ( DIGIT )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Eclipse Projects\\Prog2\\Test.g:35:19: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // D:\\Eclipse Projects\\Prog2\\Test.g:35:23: ( DIGIT )+
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
                    	    // D:\\Eclipse Projects\\Prog2\\Test.g:35:24: DIGIT
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog2\\Test.g:36:3: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
            // D:\\Eclipse Projects\\Prog2\\Test.g:36:10: ( '\\t' | ' ' | '\\r' | '\\n' )+
            {
            // D:\\Eclipse Projects\\Prog2\\Test.g:36:10: ( '\\t' | ' ' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Eclipse Projects\\Prog2\\Test.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog2\\Test.g:37:12: ( 'a' .. 'z' | 'A' .. 'Z' )
            // D:\\Eclipse Projects\\Prog2\\Test.g:
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
            // D:\\Eclipse Projects\\Prog2\\Test.g:39:15: ( '0' .. '9' )
            // D:\\Eclipse Projects\\Prog2\\Test.g:39:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // D:\\Eclipse Projects\\Prog2\\Test.g:1:8: ( PLUS | MINUS | MULT | DIV | ASSIGNMENT | ID | NUMBER | WS )
        int alt6=8;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt6=1;
            }
            break;
        case '-':
            {
            alt6=2;
            }
            break;
        case '*':
            {
            alt6=3;
            }
            break;
        case '/':
            {
            alt6=4;
            }
            break;
        case ':':
            {
            alt6=5;
            }
            break;
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
            alt6=6;
            }
            break;
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
            {
            alt6=7;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt6=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;
        }

        switch (alt6) {
            case 1 :
                // D:\\Eclipse Projects\\Prog2\\Test.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // D:\\Eclipse Projects\\Prog2\\Test.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // D:\\Eclipse Projects\\Prog2\\Test.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // D:\\Eclipse Projects\\Prog2\\Test.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // D:\\Eclipse Projects\\Prog2\\Test.g:1:30: ASSIGNMENT
                {
                mASSIGNMENT(); 

                }
                break;
            case 6 :
                // D:\\Eclipse Projects\\Prog2\\Test.g:1:41: ID
                {
                mID(); 

                }
                break;
            case 7 :
                // D:\\Eclipse Projects\\Prog2\\Test.g:1:44: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 8 :
                // D:\\Eclipse Projects\\Prog2\\Test.g:1:51: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}