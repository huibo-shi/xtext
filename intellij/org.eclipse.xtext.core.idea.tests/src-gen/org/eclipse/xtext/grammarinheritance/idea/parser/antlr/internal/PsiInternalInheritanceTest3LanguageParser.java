package org.eclipse.xtext.grammarinheritance.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.grammarinheritance.idea.lang.InheritanceTest3LanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.grammarinheritance.services.InheritanceTest3LanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalInheritanceTest3LanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SUPER_ID", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'element'", "'model'", "'{'", "'}'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=5;
    public static final int T__15=15;
    public static final int SUPER_ID=4;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public PsiInternalInheritanceTest3LanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalInheritanceTest3LanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalInheritanceTest3LanguageParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalInheritanceTest3Language.g"; }



    	protected InheritanceTest3LanguageGrammarAccess grammarAccess;

    	protected InheritanceTest3LanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalInheritanceTest3LanguageParser(PsiBuilder builder, TokenStream input, InheritanceTest3LanguageElementTypeProvider elementTypeProvider, InheritanceTest3LanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Model";
    	}




    // $ANTLR start "entryRuleModel"
    // PsiInternalInheritanceTest3Language.g:52:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // PsiInternalInheritanceTest3Language.g:52:15: ( ruleModel EOF )
            // PsiInternalInheritanceTest3Language.g:53:2: ruleModel EOF
            {
             markComposite(elementTypeProvider.getModelElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleModel();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // PsiInternalInheritanceTest3Language.g:58:1: ruleModel : superModel ;
    public final void ruleModel() throws RecognitionException {
        try {
            // PsiInternalInheritanceTest3Language.g:58:10: ( superModel )
            // PsiInternalInheritanceTest3Language.g:59:2: superModel
            {

            		markComposite(elementTypeProvider.getModel_ModelParserRuleCallElementType());
            	
            pushFollow(FollowSets000.FOLLOW_2);
            superModel();

            state._fsp--;


            		doneComposite();
            	

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // PsiInternalInheritanceTest3Language.g:69:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // PsiInternalInheritanceTest3Language.g:69:17: ( ruleElement EOF )
            // PsiInternalInheritanceTest3Language.g:70:2: ruleElement EOF
            {
             markComposite(elementTypeProvider.getElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // PsiInternalInheritanceTest3Language.g:75:1: ruleElement : ( superElement | ( () otherlv_2= 'element' ( (lv_name_3_0= SUPER_ID ) ) ) | ( () otherlv_5= 'element' ( (lv_name_6_0= RULE_STRING ) ) ) ) ;
    public final void ruleElement() throws RecognitionException {
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;

        try {
            // PsiInternalInheritanceTest3Language.g:75:12: ( ( superElement | ( () otherlv_2= 'element' ( (lv_name_3_0= SUPER_ID ) ) ) | ( () otherlv_5= 'element' ( (lv_name_6_0= RULE_STRING ) ) ) ) )
            // PsiInternalInheritanceTest3Language.g:76:2: ( superElement | ( () otherlv_2= 'element' ( (lv_name_3_0= SUPER_ID ) ) ) | ( () otherlv_5= 'element' ( (lv_name_6_0= RULE_STRING ) ) ) )
            {
            // PsiInternalInheritanceTest3Language.g:76:2: ( superElement | ( () otherlv_2= 'element' ( (lv_name_3_0= SUPER_ID ) ) ) | ( () otherlv_5= 'element' ( (lv_name_6_0= RULE_STRING ) ) ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                switch ( input.LA(2) ) {
                case SUPER_ID:
                    {
                    alt1=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt1=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt1=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // PsiInternalInheritanceTest3Language.g:77:3: superElement
                    {

                    			markComposite(elementTypeProvider.getElement_ElementParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    superElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalInheritanceTest3Language.g:85:3: ( () otherlv_2= 'element' ( (lv_name_3_0= SUPER_ID ) ) )
                    {
                    // PsiInternalInheritanceTest3Language.g:85:3: ( () otherlv_2= 'element' ( (lv_name_3_0= SUPER_ID ) ) )
                    // PsiInternalInheritanceTest3Language.g:86:4: () otherlv_2= 'element' ( (lv_name_3_0= SUPER_ID ) )
                    {
                    // PsiInternalInheritanceTest3Language.g:86:4: ()
                    // PsiInternalInheritanceTest3Language.g:87:5: 
                    {

                    					precedeComposite(elementTypeProvider.getElement_ElementAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getElement_ElementKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalInheritanceTest3Language.g:99:4: ( (lv_name_3_0= SUPER_ID ) )
                    // PsiInternalInheritanceTest3Language.g:100:5: (lv_name_3_0= SUPER_ID )
                    {
                    // PsiInternalInheritanceTest3Language.g:100:5: (lv_name_3_0= SUPER_ID )
                    // PsiInternalInheritanceTest3Language.g:101:6: lv_name_3_0= SUPER_ID
                    {

                    						markLeaf(elementTypeProvider.getElement_NameIDTerminalRuleCall_1_2_0ElementType());
                    					
                    lv_name_3_0=(Token)match(input,SUPER_ID,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_name_3_0);
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalInheritanceTest3Language.g:112:3: ( () otherlv_5= 'element' ( (lv_name_6_0= RULE_STRING ) ) )
                    {
                    // PsiInternalInheritanceTest3Language.g:112:3: ( () otherlv_5= 'element' ( (lv_name_6_0= RULE_STRING ) ) )
                    // PsiInternalInheritanceTest3Language.g:113:4: () otherlv_5= 'element' ( (lv_name_6_0= RULE_STRING ) )
                    {
                    // PsiInternalInheritanceTest3Language.g:113:4: ()
                    // PsiInternalInheritanceTest3Language.g:114:5: 
                    {

                    					precedeComposite(elementTypeProvider.getElement_ElementAction_2_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getElement_ElementKeyword_2_1ElementType());
                    			
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_4); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalInheritanceTest3Language.g:126:4: ( (lv_name_6_0= RULE_STRING ) )
                    // PsiInternalInheritanceTest3Language.g:127:5: (lv_name_6_0= RULE_STRING )
                    {
                    // PsiInternalInheritanceTest3Language.g:127:5: (lv_name_6_0= RULE_STRING )
                    // PsiInternalInheritanceTest3Language.g:128:6: lv_name_6_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getElement_NameSTRINGTerminalRuleCall_2_2_0ElementType());
                    					
                    lv_name_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_name_6_0);
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entrySuperModel"
    // PsiInternalInheritanceTest3Language.g:142:1: entrySuperModel : superModel EOF ;
    public final void entrySuperModel() throws RecognitionException {
        try {
            // PsiInternalInheritanceTest3Language.g:142:16: ( superModel EOF )
            // PsiInternalInheritanceTest3Language.g:143:2: superModel EOF
            {
             markComposite(elementTypeProvider.getInheritanceTestLanguageModelElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            superModel();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entrySuperModel"


    // $ANTLR start "superModel"
    // PsiInternalInheritanceTest3Language.g:148:1: superModel : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' ) ;
    public final void superModel() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // PsiInternalInheritanceTest3Language.g:148:11: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' ) )
            // PsiInternalInheritanceTest3Language.g:149:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' )
            {
            // PsiInternalInheritanceTest3Language.g:149:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' )
            // PsiInternalInheritanceTest3Language.g:150:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}'
            {

            			markLeaf(elementTypeProvider.getInheritanceTestLanguageModel_ModelKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalInheritanceTest3Language.g:157:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalInheritanceTest3Language.g:158:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalInheritanceTest3Language.g:158:4: (lv_name_1_0= RULE_ID )
            // PsiInternalInheritanceTest3Language.g:159:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getInheritanceTestLanguageModel_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getInheritanceTestLanguageModel_LeftCurlyBracketKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_7); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalInheritanceTest3Language.g:175:3: ( (lv_elements_3_0= ruleElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalInheritanceTest3Language.g:176:4: (lv_elements_3_0= ruleElement )
            	    {
            	    // PsiInternalInheritanceTest3Language.g:176:4: (lv_elements_3_0= ruleElement )
            	    // PsiInternalInheritanceTest3Language.g:177:5: lv_elements_3_0= ruleElement
            	    {

            	    					markComposite(elementTypeProvider.getInheritanceTestLanguageModel_ElementsElementParserRuleCall_3_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    ruleElement();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getInheritanceTestLanguageModel_RightCurlyBracketKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_4);
            		

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
    // $ANTLR end "superModel"


    // $ANTLR start "entrySuperElement"
    // PsiInternalInheritanceTest3Language.g:197:1: entrySuperElement : superElement EOF ;
    public final void entrySuperElement() throws RecognitionException {
        try {
            // PsiInternalInheritanceTest3Language.g:197:18: ( superElement EOF )
            // PsiInternalInheritanceTest3Language.g:198:2: superElement EOF
            {
             markComposite(elementTypeProvider.getInheritanceTestLanguageElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            superElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entrySuperElement"


    // $ANTLR start "superElement"
    // PsiInternalInheritanceTest3Language.g:203:1: superElement : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final void superElement() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalInheritanceTest3Language.g:203:13: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalInheritanceTest3Language.g:204:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalInheritanceTest3Language.g:204:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalInheritanceTest3Language.g:205:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getInheritanceTestLanguageElement_ElementKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalInheritanceTest3Language.g:212:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalInheritanceTest3Language.g:213:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalInheritanceTest3Language.g:213:4: (lv_name_1_0= RULE_ID )
            // PsiInternalInheritanceTest3Language.g:214:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getInheritanceTestLanguageElement_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }


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
    // $ANTLR end "superElement"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009000L});
    }


}