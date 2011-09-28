// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Eclipse Projects\\Prog2\\Read.g 2011-09-20 15:25:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ReadParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "READ", "OB", "CB", "CM", "ID", "IDLIST", "AL"
    };
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


        public ReadParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ReadParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ReadParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Eclipse Projects\\Prog2\\Read.g"; }


      /*public static void main(String[] args)
      throws Exception
      {
        ReadLexer lex = new ReadLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        ReadParser parser = new ReadParser(tokens);
        try
        {
          parser.expr();
        }
        catch(RecognitionException e)
        {
          e.printStackTrace();
        }
      }*/                                                                                          



    // $ANTLR start "read"
    // D:\\Eclipse Projects\\Prog2\\Read.g:38:1: read : READ OB IDLIST CB ;
    public final void read() throws RecognitionException {
        try {
            // D:\\Eclipse Projects\\Prog2\\Read.g:38:5: ( READ OB IDLIST CB )
            // D:\\Eclipse Projects\\Prog2\\Read.g:38:7: READ OB IDLIST CB
            {
            match(input,READ,FOLLOW_READ_in_read106); 
            match(input,OB,FOLLOW_OB_in_read108); 
            match(input,IDLIST,FOLLOW_IDLIST_in_read110); 
            match(input,CB,FOLLOW_CB_in_read112); 

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
    // $ANTLR end "read"

    // Delegated rules


 

    public static final BitSet FOLLOW_READ_in_read106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OB_in_read108 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_IDLIST_in_read110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CB_in_read112 = new BitSet(new long[]{0x0000000000000002L});

}