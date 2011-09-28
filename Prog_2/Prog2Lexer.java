// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Eclipse Projects\\Prog_2\\Prog2.g 2011-09-24 11:42:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Prog2Lexer extends Lexer {
    public static final int VERBS=4;
    public static final int NOUN=5;
    public static final int ADJECTIVE=6;
    public static final int EOF=-1;

    // delegates
    // delegators

    public Prog2Lexer() {;} 
    public Prog2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Prog2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Eclipse Projects\\Prog_2\\Prog2.g"; }

    // $ANTLR start "VERBS"
    public final void mVERBS() throws RecognitionException {
        try {
            int _type = VERBS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog2.g:8:7: ( 'doing' | 'using' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='d') ) {
                alt1=1;
            }
            else if ( (LA1_0=='u') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Eclipse Projects\\Prog_2\\Prog2.g:8:9: 'doing'
                    {
                    match("doing"); 


                    }
                    break;
                case 2 :
                    // D:\\Eclipse Projects\\Prog_2\\Prog2.g:8:19: 'using'
                    {
                    match("using"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERBS"

    // $ANTLR start "NOUN"
    public final void mNOUN() throws RecognitionException {
        try {
            int _type = NOUN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog2.g:9:6: ( 'bangalore' | 'dog' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='b') ) {
                alt2=1;
            }
            else if ( (LA2_0=='d') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Eclipse Projects\\Prog_2\\Prog2.g:9:8: 'bangalore'
                    {
                    match("bangalore"); 


                    }
                    break;
                case 2 :
                    // D:\\Eclipse Projects\\Prog_2\\Prog2.g:9:22: 'dog'
                    {
                    match("dog"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOUN"

    // $ANTLR start "ADJECTIVE"
    public final void mADJECTIVE() throws RecognitionException {
        try {
            int _type = ADJECTIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse Projects\\Prog_2\\Prog2.g:10:11: ( 'complicated' | 'massive' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='c') ) {
                alt3=1;
            }
            else if ( (LA3_0=='m') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Eclipse Projects\\Prog_2\\Prog2.g:10:13: 'complicated'
                    {
                    match("complicated"); 


                    }
                    break;
                case 2 :
                    // D:\\Eclipse Projects\\Prog_2\\Prog2.g:10:27: 'massive'
                    {
                    match("massive"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADJECTIVE"

    public void mTokens() throws RecognitionException {
        // D:\\Eclipse Projects\\Prog_2\\Prog2.g:1:8: ( VERBS | NOUN | ADJECTIVE )
        int alt4=3;
        switch ( input.LA(1) ) {
        case 'd':
            {
            int LA4_1 = input.LA(2);

            if ( (LA4_1=='o') ) {
                int LA4_5 = input.LA(3);

                if ( (LA4_5=='i') ) {
                    alt4=1;
                }
                else if ( (LA4_5=='g') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 1, input);

                throw nvae;
            }
            }
            break;
        case 'u':
            {
            alt4=1;
            }
            break;
        case 'b':
            {
            alt4=2;
            }
            break;
        case 'c':
        case 'm':
            {
            alt4=3;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;
        }

        switch (alt4) {
            case 1 :
                // D:\\Eclipse Projects\\Prog_2\\Prog2.g:1:10: VERBS
                {
                mVERBS(); 

                }
                break;
            case 2 :
                // D:\\Eclipse Projects\\Prog_2\\Prog2.g:1:16: NOUN
                {
                mNOUN(); 

                }
                break;
            case 3 :
                // D:\\Eclipse Projects\\Prog_2\\Prog2.g:1:21: ADJECTIVE
                {
                mADJECTIVE(); 

                }
                break;

        }

    }


 

}