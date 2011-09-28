// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Eclipse Projects\\Prog_2\\Prog2.g 2011-09-24 11:42:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Prog2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VERBS", "NOUN", "ADJECTIVE"
    };
    public static final int VERBS=4;
    public static final int NOUN=5;
    public static final int ADJECTIVE=6;
    public static final int EOF=-1;

    // delegates
    // delegators


        public Prog2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Prog2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Prog2Parser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Eclipse Projects\\Prog_2\\Prog2.g"; }



    // $ANTLR start "sentance"
    // D:\\Eclipse Projects\\Prog_2\\Prog2.g:12:1: sentance : ( VERBS | NOUN | ADJECTIVE )+ ;
    public final void sentance() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog2.g:12:10: ( ( VERBS | NOUN | ADJECTIVE )+ )
            // D:\\Eclipse Projects\\Prog_2\\Prog2.g:12:12: ( VERBS | NOUN | ADJECTIVE )+
            {
            // D:\\Eclipse Projects\\Prog_2\\Prog2.g:12:12: ( VERBS | NOUN | ADJECTIVE )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=VERBS && LA1_0<=ADJECTIVE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Eclipse Projects\\Prog_2\\Prog2.g:
            	    {
            	    if ( (input.LA(1)>=VERBS && input.LA(1)<=ADJECTIVE) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sentance"

    // Delegated rules


 

    public static final BitSet FOLLOW_set_in_sentance56 = new BitSet(new long[]{0x0000000000000072L});

}