// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Eclipse Projects\\Prog_2\\Prog1.g 2011-09-24 11:27:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Prog1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "TO", "DO", "BEGIN", "END", "WRITE", "SEMICLN", "FOR", "OB", "CB", "CM", "A", "ID", "DIGIT", "NUMBER"
    };
    public static final int A=19;
    public static final int TO=9;
    public static final int SEMICLN=14;
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


        public Prog1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Prog1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Prog1Parser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Eclipse Projects\\Prog_2\\Prog1.g"; }



    // $ANTLR start "for"
    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:31:1: for : FOR ID ASSIGN NUMBER TO NUMBER DO BEGIN stmtlist END ;
    public final void for() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:31:4: ( FOR ID ASSIGN NUMBER TO NUMBER DO BEGIN stmtlist END )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:31:6: FOR ID ASSIGN NUMBER TO NUMBER DO BEGIN stmtlist END
            {
            match(input,FOR,FOLLOW_FOR_in_for219); 
            match(input,ID,FOLLOW_ID_in_for221); 
            match(input,ASSIGN,FOLLOW_ASSIGN_in_for223); 
            match(input,NUMBER,FOLLOW_NUMBER_in_for225); 
            match(input,TO,FOLLOW_TO_in_for227); 
            match(input,NUMBER,FOLLOW_NUMBER_in_for229); 
            match(input,DO,FOLLOW_DO_in_for231); 
            match(input,BEGIN,FOLLOW_BEGIN_in_for233); 
            pushFollow(FOLLOW_stmtlist_in_for235);
            stmtlist();

            state._fsp--;

            match(input,END,FOLLOW_END_in_for237); 

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
    // $ANTLR end "for"


    // $ANTLR start "stmtlist"
    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:33:1: stmtlist : ( stmt )+ ;
    public final void stmtlist() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:33:9: ( ( stmt )+ )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:33:11: ( stmt )+
            {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:33:11: ( stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WRITE||LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:33:11: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtlist244);
            	    stmt();

            	    state._fsp--;


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
    // $ANTLR end "stmtlist"


    // $ANTLR start "stmt"
    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:34:1: stmt : ( write | ID ASSIGN expr SEMICLN );
    public final void stmt() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:34:5: ( write | ID ASSIGN expr SEMICLN )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WRITE) ) {
                alt2=1;
            }
            else if ( (LA2_0==ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:34:7: write
                    {
                    pushFollow(FOLLOW_write_in_stmt251);
                    write();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:34:15: ID ASSIGN expr SEMICLN
                    {
                    match(input,ID,FOLLOW_ID_in_stmt255); 
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_stmt257); 
                    pushFollow(FOLLOW_expr_in_stmt259);
                    expr();

                    state._fsp--;

                    match(input,SEMICLN,FOLLOW_SEMICLN_in_stmt261); 

                    }
                    break;

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
    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:35:1: expr : term ( ( PLUS | MINUS ) term )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:35:5: ( term ( ( PLUS | MINUS ) term )* )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:35:6: term ( ( PLUS | MINUS ) term )*
            {
            pushFollow(FOLLOW_term_in_expr266);
            term();

            state._fsp--;

            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:35:10: ( ( PLUS | MINUS ) term )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=PLUS && LA3_0<=MINUS)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:35:11: ( PLUS | MINUS ) term
            	    {
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_expr273);
            	    term();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:36:1: term : factor ( ( MULT | DIV ) factor )* ;
    public final void term() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:36:5: ( factor ( ( MULT | DIV ) factor )* )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:36:6: factor ( ( MULT | DIV ) factor )*
            {
            pushFollow(FOLLOW_factor_in_term281);
            factor();

            state._fsp--;

            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:36:12: ( ( MULT | DIV ) factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=MULT && LA4_0<=DIV)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:36:13: ( MULT | DIV ) factor
            	    {
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term288);
            	    factor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:37:1: factor : ( ID | NUMBER );
    public final void factor() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:37:7: ( ID | NUMBER )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:
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


    // $ANTLR start "write"
    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:38:1: write : WRITE OB idlist CB SEMICLN ;
    public final void write() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:38:7: ( WRITE OB idlist CB SEMICLN )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:38:9: WRITE OB idlist CB SEMICLN
            {
            match(input,WRITE,FOLLOW_WRITE_in_write307); 
            match(input,OB,FOLLOW_OB_in_write309); 
            pushFollow(FOLLOW_idlist_in_write311);
            idlist();

            state._fsp--;

            match(input,CB,FOLLOW_CB_in_write313); 
            match(input,SEMICLN,FOLLOW_SEMICLN_in_write315); 

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
    // $ANTLR end "write"


    // $ANTLR start "idlist"
    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:39:1: idlist : ID ( ( CM ID )+ )? ;
    public final void idlist() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:39:8: ( ID ( ( CM ID )+ )? )
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:39:10: ID ( ( CM ID )+ )?
            {
            match(input,ID,FOLLOW_ID_in_idlist322); 
            // D:\\Eclipse Projects\\Prog_2\\Prog1.g:39:12: ( ( CM ID )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CM) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:39:13: ( CM ID )+
                    {
                    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:39:13: ( CM ID )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==CM) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Eclipse Projects\\Prog_2\\Prog1.g:39:14: CM ID
                    	    {
                    	    match(input,CM,FOLLOW_CM_in_idlist325); 
                    	    match(input,ID,FOLLOW_ID_in_idlist327); 

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
                    break;

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
    // $ANTLR end "idlist"

    // Delegated rules


 

    public static final BitSet FOLLOW_FOR_in_for219 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_for221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_for223 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUMBER_in_for225 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TO_in_for227 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUMBER_in_for229 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_for231 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BEGIN_in_for233 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_stmtlist_in_for235 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_in_for237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmtlist244 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_write_in_stmt251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stmt255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_stmt257 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_expr_in_stmt259 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEMICLN_in_stmt261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr266 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_set_in_expr268 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_term_in_expr273 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_factor_in_term281 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_set_in_term283 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_factor_in_term288 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_set_in_factor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write307 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OB_in_write309 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_idlist_in_write311 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CB_in_write313 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEMICLN_in_write315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idlist322 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_CM_in_idlist325 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_idlist327 = new BitSet(new long[]{0x0000000000040002L});

}