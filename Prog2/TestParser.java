// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Eclipse Projects\\Prog2\\Test.g 2011-09-20 15:03:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TestParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "ASSIGNMENT", "A", "ID", "DIGIT", "NUMBER", "WS"
    };
    public static final int WS=13;
    public static final int A=9;
    public static final int NUMBER=12;
    public static final int PLUS=4;
    public static final int ASSIGNMENT=8;
    public static final int DIGIT=11;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int DIV=7;
    public static final int ID=10;
    public static final int EOF=-1;

    // delegates
    // delegators


        public TestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TestParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Eclipse Projects\\Prog2\\Test.g"; }


      public static void main(String[] args)
      throws Exception
      {
        TestLexer lex = new TestCalLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        TestParser parser = new TestParser(tokens);
        try
        {
          parser.expr();
        }
        catch(RecognitionException e)
        {
          e.printStackTrace();
        }
      }



    // $ANTLR start "stmt"
    // D:\\Eclipse Projects\\Prog2\\Test.g:41:1: stmt : ID ASSIGNMENT expr ;
    public final void stmt() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog2\\Test.g:41:6: ( ID ASSIGNMENT expr )
            // D:\\Eclipse Projects\\Prog2\\Test.g:41:8: ID ASSIGNMENT expr
            {
            match(input,ID,FOLLOW_ID_in_stmt161); 
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_stmt163); 
            pushFollow(FOLLOW_expr_in_stmt165);
            expr();

            state._fsp--;


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
    // $ANTLR end "stmt"


    // $ANTLR start "expr"
    // D:\\Eclipse Projects\\Prog2\\Test.g:42:1: expr : term ( ( PLUS | MINUS ) term )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog2\\Test.g:42:5: ( term ( ( PLUS | MINUS ) term )* )
            // D:\\Eclipse Projects\\Prog2\\Test.g:42:6: term ( ( PLUS | MINUS ) term )*
            {
            pushFollow(FOLLOW_term_in_expr170);
            term();

            state._fsp--;

            // D:\\Eclipse Projects\\Prog2\\Test.g:42:10: ( ( PLUS | MINUS ) term )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=PLUS && LA1_0<=MINUS)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Eclipse Projects\\Prog2\\Test.g:42:11: ( PLUS | MINUS ) term
            	    {
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_expr177);
            	    term();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "expr"


    // $ANTLR start "term"
    // D:\\Eclipse Projects\\Prog2\\Test.g:43:1: term : factor ( ( MULT | DIV ) factor )* ;
    public final void term() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog2\\Test.g:43:5: ( factor ( ( MULT | DIV ) factor )* )
            // D:\\Eclipse Projects\\Prog2\\Test.g:43:6: factor ( ( MULT | DIV ) factor )*
            {
            pushFollow(FOLLOW_factor_in_term184);
            factor();

            state._fsp--;

            // D:\\Eclipse Projects\\Prog2\\Test.g:43:12: ( ( MULT | DIV ) factor )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=MULT && LA2_0<=DIV)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Eclipse Projects\\Prog2\\Test.g:43:13: ( MULT | DIV ) factor
            	    {
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term191);
            	    factor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // D:\\Eclipse Projects\\Prog2\\Test.g:44:1: factor : ( ID | NUMBER );
    public final void factor() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog2\\Test.g:44:7: ( ID | NUMBER )
            // D:\\Eclipse Projects\\Prog2\\Test.g:
            {
            if ( input.LA(1)==ID||input.LA(1)==NUMBER ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_stmt161 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_stmt163 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_expr_in_stmt165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr170 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr172 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_term_in_expr177 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_factor_in_term184 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term186 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_factor_in_term191 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_factor0 = new BitSet(new long[]{0x0000000000000002L});

}