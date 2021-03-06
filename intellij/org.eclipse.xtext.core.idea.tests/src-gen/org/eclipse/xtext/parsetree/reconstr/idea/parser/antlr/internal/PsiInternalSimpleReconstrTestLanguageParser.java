package org.eclipse.xtext.parsetree.reconstr.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.idea.lang.SimpleReconstrTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parsetree.reconstr.services.SimpleReconstrTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalSimpleReconstrTestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ID1", "RULE_ID2", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'!'", "'#'", "'='", "'type'", "'extends'", "'#2'", "'mykeyword1'", "'mykeyword2'", "'#3'", "'.'", "'#4'", "'myoption'", "'kw'", "'#5'", "'*'", "','", "'#6'", "'v1'", "'v2'", "'#7'", "'kw0'", "'#8'", "'kw1'", "'kw2'", "'kw30'", "'#9'", "'kw3'", "'kw4'", "'kw5'", "'kw6'", "'#10'", "'#11'", "'kw7'", "'#12'", "'interface'", "'class'", "'#13'", "'static'", "'final'", "'transient'", "'#14'", "'item'", "'#15'", "'#16'", "'refs'", "'#17'", "'#18'", "'ka'", "'kb'", "'#19'", "'kx'", "'ky'", "'kz'", "'#20'", "'#21'", "'#22'", "'lit1'", "'lit2'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_ID1=7;
    public static final int RULE_ID2=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public PsiInternalSimpleReconstrTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalSimpleReconstrTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalSimpleReconstrTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalSimpleReconstrTestLanguage.g"; }



    	protected SimpleReconstrTestLanguageGrammarAccess grammarAccess;

    	protected SimpleReconstrTestLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalSimpleReconstrTestLanguageParser(PsiBuilder builder, TokenStream input, SimpleReconstrTestLanguageElementTypeProvider elementTypeProvider, SimpleReconstrTestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Op";
    	}




    // $ANTLR start "entryRuleOp"
    // PsiInternalSimpleReconstrTestLanguage.g:52:1: entryRuleOp : ruleOp EOF ;
    public final void entryRuleOp() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:52:12: ( ruleOp EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:53:2: ruleOp EOF
            {
             markComposite(elementTypeProvider.getOpElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOp();

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
    // $ANTLR end "entryRuleOp"


    // $ANTLR start "ruleOp"
    // PsiInternalSimpleReconstrTestLanguage.g:58:1: ruleOp : ( ruleTerm ( () ( (lv_values_2_0= ruleTerm ) ) )* ) ;
    public final void ruleOp() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:58:7: ( ( ruleTerm ( () ( (lv_values_2_0= ruleTerm ) ) )* ) )
            // PsiInternalSimpleReconstrTestLanguage.g:59:2: ( ruleTerm ( () ( (lv_values_2_0= ruleTerm ) ) )* )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:59:2: ( ruleTerm ( () ( (lv_values_2_0= ruleTerm ) ) )* )
            // PsiInternalSimpleReconstrTestLanguage.g:60:3: ruleTerm ( () ( (lv_values_2_0= ruleTerm ) ) )*
            {

            			markComposite(elementTypeProvider.getOp_TermParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_3);
            ruleTerm();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalSimpleReconstrTestLanguage.g:67:3: ( () ( (lv_values_2_0= ruleTerm ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==13||(LA1_0>=17 && LA1_0<=18)||LA1_0==20||LA1_0==23||LA1_0==25||LA1_0==28||LA1_0==31||(LA1_0>=34 && LA1_0<=38)||(LA1_0>=40 && LA1_0<=41)||LA1_0==46||LA1_0==48||LA1_0==51||LA1_0==55||(LA1_0>=57 && LA1_0<=58)||(LA1_0>=60 && LA1_0<=61)||LA1_0==64||(LA1_0>=68 && LA1_0<=70)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:68:4: () ( (lv_values_2_0= ruleTerm ) )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:68:4: ()
            	    // PsiInternalSimpleReconstrTestLanguage.g:69:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getOp_OpValuesAction_1_0ElementType());
            	    					doneComposite();
            	    				

            	    }

            	    // PsiInternalSimpleReconstrTestLanguage.g:74:4: ( (lv_values_2_0= ruleTerm ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:75:5: (lv_values_2_0= ruleTerm )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:75:5: (lv_values_2_0= ruleTerm )
            	    // PsiInternalSimpleReconstrTestLanguage.g:76:6: lv_values_2_0= ruleTerm
            	    {

            	    						markComposite(elementTypeProvider.getOp_ValuesTermParserRuleCall_1_1_0ElementType());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    ruleTerm();

            	    state._fsp--;


            	    						doneComposite();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleOp"


    // $ANTLR start "entryRuleTerm"
    // PsiInternalSimpleReconstrTestLanguage.g:90:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:90:14: ( ruleTerm EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:91:2: ruleTerm EOF
            {
             markComposite(elementTypeProvider.getTermElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerm();

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // PsiInternalSimpleReconstrTestLanguage.g:96:1: ruleTerm : ( ruleAtom | ruleTwoNumbers | ruleManyStrings | ruleType | ruleRef2 | ruleSpare | ruleBoolean | ruleTransient1 | ruleConsumed1 | ruleConsumed2 | ruleLoop1 | ruleLoop2 | ruleLoop3 | ruleLoop4 | ruleLoopBug285452 | ruleDuplicateBug284491 | ruleEmptyObjectBug284850 | ruleMultiInheritanceBug280439 | ruleEObjectRef | ruleTypeBug305577_1 | ruleTypeBug305577_2 | ruleParens | ruleBug305171 | ruleBug310435Val | ruleBug310435Enum | ruleCrossRefNameTest ) ;
    public final void ruleTerm() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:96:9: ( ( ruleAtom | ruleTwoNumbers | ruleManyStrings | ruleType | ruleRef2 | ruleSpare | ruleBoolean | ruleTransient1 | ruleConsumed1 | ruleConsumed2 | ruleLoop1 | ruleLoop2 | ruleLoop3 | ruleLoop4 | ruleLoopBug285452 | ruleDuplicateBug284491 | ruleEmptyObjectBug284850 | ruleMultiInheritanceBug280439 | ruleEObjectRef | ruleTypeBug305577_1 | ruleTypeBug305577_2 | ruleParens | ruleBug305171 | ruleBug310435Val | ruleBug310435Enum | ruleCrossRefNameTest ) )
            // PsiInternalSimpleReconstrTestLanguage.g:97:2: ( ruleAtom | ruleTwoNumbers | ruleManyStrings | ruleType | ruleRef2 | ruleSpare | ruleBoolean | ruleTransient1 | ruleConsumed1 | ruleConsumed2 | ruleLoop1 | ruleLoop2 | ruleLoop3 | ruleLoop4 | ruleLoopBug285452 | ruleDuplicateBug284491 | ruleEmptyObjectBug284850 | ruleMultiInheritanceBug280439 | ruleEObjectRef | ruleTypeBug305577_1 | ruleTypeBug305577_2 | ruleParens | ruleBug305171 | ruleBug310435Val | ruleBug310435Enum | ruleCrossRefNameTest )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:97:2: ( ruleAtom | ruleTwoNumbers | ruleManyStrings | ruleType | ruleRef2 | ruleSpare | ruleBoolean | ruleTransient1 | ruleConsumed1 | ruleConsumed2 | ruleLoop1 | ruleLoop2 | ruleLoop3 | ruleLoop4 | ruleLoopBug285452 | ruleDuplicateBug284491 | ruleEmptyObjectBug284850 | ruleMultiInheritanceBug280439 | ruleEObjectRef | ruleTypeBug305577_1 | ruleTypeBug305577_2 | ruleParens | ruleBug305171 | ruleBug310435Val | ruleBug310435Enum | ruleCrossRefNameTest )
            int alt2=26;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            case 25:
                {
                alt2=7;
                }
                break;
            case 28:
                {
                alt2=8;
                }
                break;
            case 31:
                {
                alt2=9;
                }
                break;
            case 34:
                {
                alt2=10;
                }
                break;
            case 35:
            case 36:
                {
                alt2=11;
                }
                break;
            case 40:
                {
                alt2=12;
                }
                break;
            case 37:
            case 38:
            case 41:
                {
                alt2=13;
                }
                break;
            case 46:
                {
                alt2=14;
                }
                break;
            case 48:
                {
                alt2=15;
                }
                break;
            case 51:
                {
                alt2=16;
                }
                break;
            case 55:
                {
                alt2=17;
                }
                break;
            case 57:
                {
                alt2=18;
                }
                break;
            case 58:
                {
                alt2=19;
                }
                break;
            case 60:
                {
                alt2=20;
                }
                break;
            case 61:
                {
                alt2=21;
                }
                break;
            case 13:
                {
                alt2=22;
                }
                break;
            case 64:
                {
                alt2=23;
                }
                break;
            case 69:
                {
                alt2=24;
                }
                break;
            case 68:
                {
                alt2=25;
                }
                break;
            case 70:
                {
                alt2=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:98:3: ruleAtom
                    {

                    			markComposite(elementTypeProvider.getTerm_AtomParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAtom();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:106:3: ruleTwoNumbers
                    {

                    			markComposite(elementTypeProvider.getTerm_TwoNumbersParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTwoNumbers();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalSimpleReconstrTestLanguage.g:114:3: ruleManyStrings
                    {

                    			markComposite(elementTypeProvider.getTerm_ManyStringsParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleManyStrings();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalSimpleReconstrTestLanguage.g:122:3: ruleType
                    {

                    			markComposite(elementTypeProvider.getTerm_TypeParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleType();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // PsiInternalSimpleReconstrTestLanguage.g:130:3: ruleRef2
                    {

                    			markComposite(elementTypeProvider.getTerm_Ref2ParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRef2();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // PsiInternalSimpleReconstrTestLanguage.g:138:3: ruleSpare
                    {

                    			markComposite(elementTypeProvider.getTerm_SpareParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSpare();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 7 :
                    // PsiInternalSimpleReconstrTestLanguage.g:146:3: ruleBoolean
                    {

                    			markComposite(elementTypeProvider.getTerm_BooleanParserRuleCall_6ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 8 :
                    // PsiInternalSimpleReconstrTestLanguage.g:154:3: ruleTransient1
                    {

                    			markComposite(elementTypeProvider.getTerm_Transient1ParserRuleCall_7ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTransient1();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 9 :
                    // PsiInternalSimpleReconstrTestLanguage.g:162:3: ruleConsumed1
                    {

                    			markComposite(elementTypeProvider.getTerm_Consumed1ParserRuleCall_8ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleConsumed1();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 10 :
                    // PsiInternalSimpleReconstrTestLanguage.g:170:3: ruleConsumed2
                    {

                    			markComposite(elementTypeProvider.getTerm_Consumed2ParserRuleCall_9ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleConsumed2();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 11 :
                    // PsiInternalSimpleReconstrTestLanguage.g:178:3: ruleLoop1
                    {

                    			markComposite(elementTypeProvider.getTerm_Loop1ParserRuleCall_10ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLoop1();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 12 :
                    // PsiInternalSimpleReconstrTestLanguage.g:186:3: ruleLoop2
                    {

                    			markComposite(elementTypeProvider.getTerm_Loop2ParserRuleCall_11ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLoop2();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 13 :
                    // PsiInternalSimpleReconstrTestLanguage.g:194:3: ruleLoop3
                    {

                    			markComposite(elementTypeProvider.getTerm_Loop3ParserRuleCall_12ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLoop3();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 14 :
                    // PsiInternalSimpleReconstrTestLanguage.g:202:3: ruleLoop4
                    {

                    			markComposite(elementTypeProvider.getTerm_Loop4ParserRuleCall_13ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLoop4();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 15 :
                    // PsiInternalSimpleReconstrTestLanguage.g:210:3: ruleLoopBug285452
                    {

                    			markComposite(elementTypeProvider.getTerm_LoopBug285452ParserRuleCall_14ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLoopBug285452();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 16 :
                    // PsiInternalSimpleReconstrTestLanguage.g:218:3: ruleDuplicateBug284491
                    {

                    			markComposite(elementTypeProvider.getTerm_DuplicateBug284491ParserRuleCall_15ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDuplicateBug284491();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 17 :
                    // PsiInternalSimpleReconstrTestLanguage.g:226:3: ruleEmptyObjectBug284850
                    {

                    			markComposite(elementTypeProvider.getTerm_EmptyObjectBug284850ParserRuleCall_16ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEmptyObjectBug284850();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 18 :
                    // PsiInternalSimpleReconstrTestLanguage.g:234:3: ruleMultiInheritanceBug280439
                    {

                    			markComposite(elementTypeProvider.getTerm_MultiInheritanceBug280439ParserRuleCall_17ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMultiInheritanceBug280439();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 19 :
                    // PsiInternalSimpleReconstrTestLanguage.g:242:3: ruleEObjectRef
                    {

                    			markComposite(elementTypeProvider.getTerm_EObjectRefParserRuleCall_18ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEObjectRef();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 20 :
                    // PsiInternalSimpleReconstrTestLanguage.g:250:3: ruleTypeBug305577_1
                    {

                    			markComposite(elementTypeProvider.getTerm_TypeBug305577_1ParserRuleCall_19ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypeBug305577_1();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 21 :
                    // PsiInternalSimpleReconstrTestLanguage.g:258:3: ruleTypeBug305577_2
                    {

                    			markComposite(elementTypeProvider.getTerm_TypeBug305577_2ParserRuleCall_20ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypeBug305577_2();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 22 :
                    // PsiInternalSimpleReconstrTestLanguage.g:266:3: ruleParens
                    {

                    			markComposite(elementTypeProvider.getTerm_ParensParserRuleCall_21ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParens();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 23 :
                    // PsiInternalSimpleReconstrTestLanguage.g:274:3: ruleBug305171
                    {

                    			markComposite(elementTypeProvider.getTerm_Bug305171ParserRuleCall_22ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBug305171();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 24 :
                    // PsiInternalSimpleReconstrTestLanguage.g:282:3: ruleBug310435Val
                    {

                    			markComposite(elementTypeProvider.getTerm_Bug310435ValParserRuleCall_23ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBug310435Val();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 25 :
                    // PsiInternalSimpleReconstrTestLanguage.g:290:3: ruleBug310435Enum
                    {

                    			markComposite(elementTypeProvider.getTerm_Bug310435EnumParserRuleCall_24ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBug310435Enum();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 26 :
                    // PsiInternalSimpleReconstrTestLanguage.g:298:3: ruleCrossRefNameTest
                    {

                    			markComposite(elementTypeProvider.getTerm_CrossRefNameTestParserRuleCall_25ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCrossRefNameTest();

                    state._fsp--;


                    			doneComposite();
                    		

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // PsiInternalSimpleReconstrTestLanguage.g:309:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:309:14: ( ruleAtom EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:310:2: ruleAtom EOF
            {
             markComposite(elementTypeProvider.getAtomElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAtom();

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // PsiInternalSimpleReconstrTestLanguage.g:315:1: ruleAtom : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void ruleAtom() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:315:9: ( ( (lv_name_0_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:316:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:316:2: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:317:3: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:317:3: (lv_name_0_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:318:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getAtom_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				doneLeaf(lv_name_0_0);
            			

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParens"
    // PsiInternalSimpleReconstrTestLanguage.g:330:1: entryRuleParens : ruleParens EOF ;
    public final void entryRuleParens() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:330:16: ( ruleParens EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:331:2: ruleParens EOF
            {
             markComposite(elementTypeProvider.getParensElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParens();

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
    // $ANTLR end "entryRuleParens"


    // $ANTLR start "ruleParens"
    // PsiInternalSimpleReconstrTestLanguage.g:336:1: ruleParens : (otherlv_0= '(' ruleOp otherlv_2= ')' ( (lv_em_3_0= '!' ) )? ) ;
    public final void ruleParens() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_em_3_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:336:11: ( (otherlv_0= '(' ruleOp otherlv_2= ')' ( (lv_em_3_0= '!' ) )? ) )
            // PsiInternalSimpleReconstrTestLanguage.g:337:2: (otherlv_0= '(' ruleOp otherlv_2= ')' ( (lv_em_3_0= '!' ) )? )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:337:2: (otherlv_0= '(' ruleOp otherlv_2= ')' ( (lv_em_3_0= '!' ) )? )
            // PsiInternalSimpleReconstrTestLanguage.g:338:3: otherlv_0= '(' ruleOp otherlv_2= ')' ( (lv_em_3_0= '!' ) )?
            {

            			markLeaf(elementTypeProvider.getParens_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParens_OpParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_5);
            ruleOp();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParens_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_6); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:359:3: ( (lv_em_3_0= '!' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:360:4: (lv_em_3_0= '!' )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:360:4: (lv_em_3_0= '!' )
                    // PsiInternalSimpleReconstrTestLanguage.g:361:5: lv_em_3_0= '!'
                    {

                    					markLeaf(elementTypeProvider.getParens_EmExclamationMarkKeyword_3_0ElementType());
                    				
                    lv_em_3_0=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                    					doneLeaf(lv_em_3_0);
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleParens"


    // $ANTLR start "entryRuleTwoNumbers"
    // PsiInternalSimpleReconstrTestLanguage.g:374:1: entryRuleTwoNumbers : ruleTwoNumbers EOF ;
    public final void entryRuleTwoNumbers() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:374:20: ( ruleTwoNumbers EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:375:2: ruleTwoNumbers EOF
            {
             markComposite(elementTypeProvider.getTwoNumbersElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTwoNumbers();

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
    // $ANTLR end "entryRuleTwoNumbers"


    // $ANTLR start "ruleTwoNumbers"
    // PsiInternalSimpleReconstrTestLanguage.g:380:1: ruleTwoNumbers : ( ( (lv_num1_0_0= RULE_INT ) ) ( (lv_num2_1_0= RULE_INT ) ) (otherlv_2= '#' ( (lv_num3_3_0= RULE_INT ) ) )* ) ;
    public final void ruleTwoNumbers() throws RecognitionException {
        Token lv_num1_0_0=null;
        Token lv_num2_1_0=null;
        Token otherlv_2=null;
        Token lv_num3_3_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:380:15: ( ( ( (lv_num1_0_0= RULE_INT ) ) ( (lv_num2_1_0= RULE_INT ) ) (otherlv_2= '#' ( (lv_num3_3_0= RULE_INT ) ) )* ) )
            // PsiInternalSimpleReconstrTestLanguage.g:381:2: ( ( (lv_num1_0_0= RULE_INT ) ) ( (lv_num2_1_0= RULE_INT ) ) (otherlv_2= '#' ( (lv_num3_3_0= RULE_INT ) ) )* )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:381:2: ( ( (lv_num1_0_0= RULE_INT ) ) ( (lv_num2_1_0= RULE_INT ) ) (otherlv_2= '#' ( (lv_num3_3_0= RULE_INT ) ) )* )
            // PsiInternalSimpleReconstrTestLanguage.g:382:3: ( (lv_num1_0_0= RULE_INT ) ) ( (lv_num2_1_0= RULE_INT ) ) (otherlv_2= '#' ( (lv_num3_3_0= RULE_INT ) ) )*
            {
            // PsiInternalSimpleReconstrTestLanguage.g:382:3: ( (lv_num1_0_0= RULE_INT ) )
            // PsiInternalSimpleReconstrTestLanguage.g:383:4: (lv_num1_0_0= RULE_INT )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:383:4: (lv_num1_0_0= RULE_INT )
            // PsiInternalSimpleReconstrTestLanguage.g:384:5: lv_num1_0_0= RULE_INT
            {

            					markLeaf(elementTypeProvider.getTwoNumbers_Num1INTTerminalRuleCall_0_0ElementType());
            				
            lv_num1_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); 

            					doneLeaf(lv_num1_0_0);
            				

            }


            }

            // PsiInternalSimpleReconstrTestLanguage.g:393:3: ( (lv_num2_1_0= RULE_INT ) )
            // PsiInternalSimpleReconstrTestLanguage.g:394:4: (lv_num2_1_0= RULE_INT )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:394:4: (lv_num2_1_0= RULE_INT )
            // PsiInternalSimpleReconstrTestLanguage.g:395:5: lv_num2_1_0= RULE_INT
            {

            					markLeaf(elementTypeProvider.getTwoNumbers_Num2INTTerminalRuleCall_1_0ElementType());
            				
            lv_num2_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_8); 

            					doneLeaf(lv_num2_1_0);
            				

            }


            }

            // PsiInternalSimpleReconstrTestLanguage.g:404:3: (otherlv_2= '#' ( (lv_num3_3_0= RULE_INT ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:405:4: otherlv_2= '#' ( (lv_num3_3_0= RULE_INT ) )
            	    {

            	    				markLeaf(elementTypeProvider.getTwoNumbers_NumberSignKeyword_2_0ElementType());
            	    			
            	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalSimpleReconstrTestLanguage.g:412:4: ( (lv_num3_3_0= RULE_INT ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:413:5: (lv_num3_3_0= RULE_INT )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:413:5: (lv_num3_3_0= RULE_INT )
            	    // PsiInternalSimpleReconstrTestLanguage.g:414:6: lv_num3_3_0= RULE_INT
            	    {

            	    						markLeaf(elementTypeProvider.getTwoNumbers_Num3INTTerminalRuleCall_2_1_0ElementType());
            	    					
            	    lv_num3_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_8); 

            	    						doneLeaf(lv_num3_3_0);
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleTwoNumbers"


    // $ANTLR start "entryRuleManyStrings"
    // PsiInternalSimpleReconstrTestLanguage.g:428:1: entryRuleManyStrings : ruleManyStrings EOF ;
    public final void entryRuleManyStrings() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:428:21: ( ruleManyStrings EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:429:2: ruleManyStrings EOF
            {
             markComposite(elementTypeProvider.getManyStringsElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleManyStrings();

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
    // $ANTLR end "entryRuleManyStrings"


    // $ANTLR start "ruleManyStrings"
    // PsiInternalSimpleReconstrTestLanguage.g:434:1: ruleManyStrings : (otherlv_0= '=' ( (lv_str1_1_0= RULE_STRING ) )* ( (lv_str2_2_0= RULE_STRING ) ) ) ;
    public final void ruleManyStrings() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_str1_1_0=null;
        Token lv_str2_2_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:434:16: ( (otherlv_0= '=' ( (lv_str1_1_0= RULE_STRING ) )* ( (lv_str2_2_0= RULE_STRING ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:435:2: (otherlv_0= '=' ( (lv_str1_1_0= RULE_STRING ) )* ( (lv_str2_2_0= RULE_STRING ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:435:2: (otherlv_0= '=' ( (lv_str1_1_0= RULE_STRING ) )* ( (lv_str2_2_0= RULE_STRING ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:436:3: otherlv_0= '=' ( (lv_str1_1_0= RULE_STRING ) )* ( (lv_str2_2_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getManyStrings_EqualsSignKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:443:3: ( (lv_str1_1_0= RULE_STRING ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_STRING) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:444:4: (lv_str1_1_0= RULE_STRING )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:444:4: (lv_str1_1_0= RULE_STRING )
            	    // PsiInternalSimpleReconstrTestLanguage.g:445:5: lv_str1_1_0= RULE_STRING
            	    {

            	    					markLeaf(elementTypeProvider.getManyStrings_Str1STRINGTerminalRuleCall_1_0ElementType());
            	    				
            	    lv_str1_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_9); 

            	    					doneLeaf(lv_str1_1_0);
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // PsiInternalSimpleReconstrTestLanguage.g:454:3: ( (lv_str2_2_0= RULE_STRING ) )
            // PsiInternalSimpleReconstrTestLanguage.g:455:4: (lv_str2_2_0= RULE_STRING )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:455:4: (lv_str2_2_0= RULE_STRING )
            // PsiInternalSimpleReconstrTestLanguage.g:456:5: lv_str2_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getManyStrings_Str2STRINGTerminalRuleCall_2_0ElementType());
            				
            lv_str2_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_str2_2_0);
            				

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
    // $ANTLR end "ruleManyStrings"


    // $ANTLR start "entryRuleType"
    // PsiInternalSimpleReconstrTestLanguage.g:469:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:469:14: ( ruleType EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:470:2: ruleType EOF
            {
             markComposite(elementTypeProvider.getTypeElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleType();

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // PsiInternalSimpleReconstrTestLanguage.g:475:1: ruleType : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) ;
    public final void ruleType() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:475:9: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:476:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:476:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:477:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getType_TypeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:484:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:485:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:485:4: (lv_name_1_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:486:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getType_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_ExtendsKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:502:3: ( (otherlv_3= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:503:4: (otherlv_3= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:503:4: (otherlv_3= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:504:5: otherlv_3= RULE_ID
            {

            					markLeaf(elementTypeProvider.getType_ExtendsTypeCrossReference_3_0ElementType());
            				
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(otherlv_3);
            				

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRef2"
    // PsiInternalSimpleReconstrTestLanguage.g:517:1: entryRuleRef2 : ruleRef2 EOF ;
    public final void entryRuleRef2() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:517:14: ( ruleRef2 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:518:2: ruleRef2 EOF
            {
             markComposite(elementTypeProvider.getRef2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRef2();

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
    // $ANTLR end "entryRuleRef2"


    // $ANTLR start "ruleRef2"
    // PsiInternalSimpleReconstrTestLanguage.g:523:1: ruleRef2 : (otherlv_0= '#2' ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) ) ) ;
    public final void ruleRef2() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_ref2_1_1=null;
        Token lv_ref2_1_2=null;
        Token lv_ref2_1_3=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:523:9: ( (otherlv_0= '#2' ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:524:2: (otherlv_0= '#2' ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:524:2: (otherlv_0= '#2' ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:525:3: otherlv_0= '#2' ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) )
            {

            			markLeaf(elementTypeProvider.getRef2_NumberSignDigitTwoKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_12); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:532:3: ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:533:4: ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:533:4: ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) )
            // PsiInternalSimpleReconstrTestLanguage.g:534:5: (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:534:5: (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:535:6: lv_ref2_1_1= 'mykeyword1'
                    {

                    						markLeaf(elementTypeProvider.getRef2_Ref2Mykeyword1Keyword_1_0_0ElementType());
                    					
                    lv_ref2_1_1=(Token)match(input,21,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_ref2_1_1);
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:543:6: lv_ref2_1_2= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getRef2_Ref2STRINGTerminalRuleCall_1_0_1ElementType());
                    					
                    lv_ref2_1_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_ref2_1_2);
                    					

                    }
                    break;
                case 3 :
                    // PsiInternalSimpleReconstrTestLanguage.g:551:6: lv_ref2_1_3= 'mykeyword2'
                    {

                    						markLeaf(elementTypeProvider.getRef2_Ref2Mykeyword2Keyword_1_0_2ElementType());
                    					
                    lv_ref2_1_3=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_ref2_1_3);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleRef2"


    // $ANTLR start "entryRuleSpare"
    // PsiInternalSimpleReconstrTestLanguage.g:565:1: entryRuleSpare : ruleSpare EOF ;
    public final void entryRuleSpare() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:565:15: ( ruleSpare EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:566:2: ruleSpare EOF
            {
             markComposite(elementTypeProvider.getSpareElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSpare();

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
    // $ANTLR end "entryRuleSpare"


    // $ANTLR start "ruleSpare"
    // PsiInternalSimpleReconstrTestLanguage.g:571:1: ruleSpare : (otherlv_0= '#3' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_id_3_0= RULE_ID ) ) )* ) ;
    public final void ruleSpare() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:571:10: ( (otherlv_0= '#3' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_id_3_0= RULE_ID ) ) )* ) )
            // PsiInternalSimpleReconstrTestLanguage.g:572:2: (otherlv_0= '#3' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_id_3_0= RULE_ID ) ) )* )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:572:2: (otherlv_0= '#3' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_id_3_0= RULE_ID ) ) )* )
            // PsiInternalSimpleReconstrTestLanguage.g:573:3: otherlv_0= '#3' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_id_3_0= RULE_ID ) ) )*
            {

            			markLeaf(elementTypeProvider.getSpare_NumberSignDigitThreeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:580:3: ( (lv_id_1_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:581:4: (lv_id_1_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:581:4: (lv_id_1_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:582:5: lv_id_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSpare_IdIDTerminalRuleCall_1_0ElementType());
            				
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

            					doneLeaf(lv_id_1_0);
            				

            }


            }

            // PsiInternalSimpleReconstrTestLanguage.g:591:3: (otherlv_2= '.' ( (lv_id_3_0= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:592:4: otherlv_2= '.' ( (lv_id_3_0= RULE_ID ) )
            	    {

            	    				markLeaf(elementTypeProvider.getSpare_FullStopKeyword_2_0ElementType());
            	    			
            	    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_10); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalSimpleReconstrTestLanguage.g:599:4: ( (lv_id_3_0= RULE_ID ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:600:5: (lv_id_3_0= RULE_ID )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:600:5: (lv_id_3_0= RULE_ID )
            	    // PsiInternalSimpleReconstrTestLanguage.g:601:6: lv_id_3_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getSpare_IdIDTerminalRuleCall_2_1_0ElementType());
            	    					
            	    lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

            	    						doneLeaf(lv_id_3_0);
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleSpare"


    // $ANTLR start "entryRuleBoolean"
    // PsiInternalSimpleReconstrTestLanguage.g:615:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:615:17: ( ruleBoolean EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:616:2: ruleBoolean EOF
            {
             markComposite(elementTypeProvider.getBooleanElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBoolean();

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // PsiInternalSimpleReconstrTestLanguage.g:621:1: ruleBoolean : (otherlv_0= '#4' ( (lv_bool_1_0= 'myoption' ) )? otherlv_2= 'kw' ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final void ruleBoolean() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_bool_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:621:12: ( (otherlv_0= '#4' ( (lv_bool_1_0= 'myoption' ) )? otherlv_2= 'kw' ( (lv_value_3_0= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:622:2: (otherlv_0= '#4' ( (lv_bool_1_0= 'myoption' ) )? otherlv_2= 'kw' ( (lv_value_3_0= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:622:2: (otherlv_0= '#4' ( (lv_bool_1_0= 'myoption' ) )? otherlv_2= 'kw' ( (lv_value_3_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:623:3: otherlv_0= '#4' ( (lv_bool_1_0= 'myoption' ) )? otherlv_2= 'kw' ( (lv_value_3_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getBoolean_NumberSignDigitFourKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_14); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:630:3: ( (lv_bool_1_0= 'myoption' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:631:4: (lv_bool_1_0= 'myoption' )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:631:4: (lv_bool_1_0= 'myoption' )
                    // PsiInternalSimpleReconstrTestLanguage.g:632:5: lv_bool_1_0= 'myoption'
                    {

                    					markLeaf(elementTypeProvider.getBoolean_BoolMyoptionKeyword_1_0ElementType());
                    				
                    lv_bool_1_0=(Token)match(input,26,FollowSets000.FOLLOW_15); 

                    					doneLeaf(lv_bool_1_0);
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getBoolean_KwKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:648:3: ( (lv_value_3_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:649:4: (lv_value_3_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:649:4: (lv_value_3_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:650:5: lv_value_3_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getBoolean_ValueIDTerminalRuleCall_3_0ElementType());
            				
            lv_value_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_value_3_0);
            				

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleTransient1"
    // PsiInternalSimpleReconstrTestLanguage.g:663:1: entryRuleTransient1 : ruleTransient1 EOF ;
    public final void entryRuleTransient1() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:663:20: ( ruleTransient1 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:664:2: ruleTransient1 EOF
            {
             markComposite(elementTypeProvider.getTransient1ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTransient1();

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
    // $ANTLR end "entryRuleTransient1"


    // $ANTLR start "ruleTransient1"
    // PsiInternalSimpleReconstrTestLanguage.g:669:1: ruleTransient1 : (otherlv_0= '#5' ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) ) (otherlv_3= ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )? ) ;
    public final void ruleTransient1() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_precStar_1_0=null;
        Token lv_prec_2_0=null;
        Token otherlv_3=null;
        Token lv_scaleStar_4_0=null;
        Token lv_scale_5_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:669:15: ( (otherlv_0= '#5' ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) ) (otherlv_3= ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )? ) )
            // PsiInternalSimpleReconstrTestLanguage.g:670:2: (otherlv_0= '#5' ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) ) (otherlv_3= ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )? )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:670:2: (otherlv_0= '#5' ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) ) (otherlv_3= ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )? )
            // PsiInternalSimpleReconstrTestLanguage.g:671:3: otherlv_0= '#5' ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) ) (otherlv_3= ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )?
            {

            			markLeaf(elementTypeProvider.getTransient1_NumberSignDigitFiveKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_16); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:678:3: ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:679:4: ( (lv_precStar_1_0= '*' ) )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:679:4: ( (lv_precStar_1_0= '*' ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:680:5: (lv_precStar_1_0= '*' )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:680:5: (lv_precStar_1_0= '*' )
                    // PsiInternalSimpleReconstrTestLanguage.g:681:6: lv_precStar_1_0= '*'
                    {

                    						markLeaf(elementTypeProvider.getTransient1_PrecStarAsteriskKeyword_1_0_0ElementType());
                    					
                    lv_precStar_1_0=(Token)match(input,29,FollowSets000.FOLLOW_17); 

                    						doneLeaf(lv_precStar_1_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:691:4: ( (lv_prec_2_0= RULE_INT ) )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:691:4: ( (lv_prec_2_0= RULE_INT ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:692:5: (lv_prec_2_0= RULE_INT )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:692:5: (lv_prec_2_0= RULE_INT )
                    // PsiInternalSimpleReconstrTestLanguage.g:693:6: lv_prec_2_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getTransient1_PrecINTTerminalRuleCall_1_1_0ElementType());
                    					
                    lv_prec_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_17); 

                    						doneLeaf(lv_prec_2_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalSimpleReconstrTestLanguage.g:703:3: (otherlv_3= ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:704:4: otherlv_3= ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) )
                    {

                    				markLeaf(elementTypeProvider.getTransient1_CommaKeyword_2_0ElementType());
                    			
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_16); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalSimpleReconstrTestLanguage.g:711:4: ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==29) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_INT) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // PsiInternalSimpleReconstrTestLanguage.g:712:5: ( (lv_scaleStar_4_0= '*' ) )
                            {
                            // PsiInternalSimpleReconstrTestLanguage.g:712:5: ( (lv_scaleStar_4_0= '*' ) )
                            // PsiInternalSimpleReconstrTestLanguage.g:713:6: (lv_scaleStar_4_0= '*' )
                            {
                            // PsiInternalSimpleReconstrTestLanguage.g:713:6: (lv_scaleStar_4_0= '*' )
                            // PsiInternalSimpleReconstrTestLanguage.g:714:7: lv_scaleStar_4_0= '*'
                            {

                            							markLeaf(elementTypeProvider.getTransient1_ScaleStarAsteriskKeyword_2_1_0_0ElementType());
                            						
                            lv_scaleStar_4_0=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                            							doneLeaf(lv_scaleStar_4_0);
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalSimpleReconstrTestLanguage.g:724:5: ( (lv_scale_5_0= RULE_INT ) )
                            {
                            // PsiInternalSimpleReconstrTestLanguage.g:724:5: ( (lv_scale_5_0= RULE_INT ) )
                            // PsiInternalSimpleReconstrTestLanguage.g:725:6: (lv_scale_5_0= RULE_INT )
                            {
                            // PsiInternalSimpleReconstrTestLanguage.g:725:6: (lv_scale_5_0= RULE_INT )
                            // PsiInternalSimpleReconstrTestLanguage.g:726:7: lv_scale_5_0= RULE_INT
                            {

                            							markLeaf(elementTypeProvider.getTransient1_ScaleINTTerminalRuleCall_2_1_1_0ElementType());
                            						
                            lv_scale_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                            							doneLeaf(lv_scale_5_0);
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTransient1"


    // $ANTLR start "entryRuleConsumed1"
    // PsiInternalSimpleReconstrTestLanguage.g:741:1: entryRuleConsumed1 : ruleConsumed1 EOF ;
    public final void entryRuleConsumed1() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:741:19: ( ruleConsumed1 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:742:2: ruleConsumed1 EOF
            {
             markComposite(elementTypeProvider.getConsumed1ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConsumed1();

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
    // $ANTLR end "entryRuleConsumed1"


    // $ANTLR start "ruleConsumed1"
    // PsiInternalSimpleReconstrTestLanguage.g:747:1: ruleConsumed1 : (otherlv_0= '#6' ( (otherlv_1= 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | (otherlv_4= 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) ) ) ;
    public final void ruleConsumed1() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_v1_2_0=null;
        Token lv_v2_3_0=null;
        Token otherlv_4=null;
        Token lv_v2_5_0=null;
        Token lv_v1_6_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:747:14: ( (otherlv_0= '#6' ( (otherlv_1= 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | (otherlv_4= 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:748:2: (otherlv_0= '#6' ( (otherlv_1= 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | (otherlv_4= 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:748:2: (otherlv_0= '#6' ( (otherlv_1= 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | (otherlv_4= 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:749:3: otherlv_0= '#6' ( (otherlv_1= 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | (otherlv_4= 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) )
            {

            			markLeaf(elementTypeProvider.getConsumed1_NumberSignDigitSixKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_18); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:756:3: ( (otherlv_1= 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | (otherlv_4= 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:757:4: (otherlv_1= 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:757:4: (otherlv_1= 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:758:5: otherlv_1= 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getConsumed1_V1Keyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_19); 

                    					doneLeaf(otherlv_1);
                    				
                    // PsiInternalSimpleReconstrTestLanguage.g:765:5: ( (lv_v1_2_0= RULE_INT ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_INT) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // PsiInternalSimpleReconstrTestLanguage.g:766:6: (lv_v1_2_0= RULE_INT )
                    	    {
                    	    // PsiInternalSimpleReconstrTestLanguage.g:766:6: (lv_v1_2_0= RULE_INT )
                    	    // PsiInternalSimpleReconstrTestLanguage.g:767:7: lv_v1_2_0= RULE_INT
                    	    {

                    	    							markLeaf(elementTypeProvider.getConsumed1_V1INTTerminalRuleCall_1_0_1_0ElementType());
                    	    						
                    	    lv_v1_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_19); 

                    	    							doneLeaf(lv_v1_2_0);
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // PsiInternalSimpleReconstrTestLanguage.g:776:5: ( (lv_v2_3_0= RULE_ID ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:777:6: (lv_v2_3_0= RULE_ID )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:777:6: (lv_v2_3_0= RULE_ID )
                    // PsiInternalSimpleReconstrTestLanguage.g:778:7: lv_v2_3_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getConsumed1_V2IDTerminalRuleCall_1_0_2_0ElementType());
                    						
                    lv_v2_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    							doneLeaf(lv_v2_3_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:789:4: (otherlv_4= 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:789:4: (otherlv_4= 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:790:5: otherlv_4= 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) )
                    {

                    					markLeaf(elementTypeProvider.getConsumed1_V2Keyword_1_1_0ElementType());
                    				
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_19); 

                    					doneLeaf(otherlv_4);
                    				
                    // PsiInternalSimpleReconstrTestLanguage.g:797:5: ( (lv_v2_5_0= RULE_ID ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // PsiInternalSimpleReconstrTestLanguage.g:798:6: (lv_v2_5_0= RULE_ID )
                    	    {
                    	    // PsiInternalSimpleReconstrTestLanguage.g:798:6: (lv_v2_5_0= RULE_ID )
                    	    // PsiInternalSimpleReconstrTestLanguage.g:799:7: lv_v2_5_0= RULE_ID
                    	    {

                    	    							markLeaf(elementTypeProvider.getConsumed1_V2IDTerminalRuleCall_1_1_1_0ElementType());
                    	    						
                    	    lv_v2_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); 

                    	    							doneLeaf(lv_v2_5_0);
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // PsiInternalSimpleReconstrTestLanguage.g:808:5: ( (lv_v1_6_0= RULE_INT ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:809:6: (lv_v1_6_0= RULE_INT )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:809:6: (lv_v1_6_0= RULE_INT )
                    // PsiInternalSimpleReconstrTestLanguage.g:810:7: lv_v1_6_0= RULE_INT
                    {

                    							markLeaf(elementTypeProvider.getConsumed1_V1INTTerminalRuleCall_1_1_2_0ElementType());
                    						
                    lv_v1_6_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    							doneLeaf(lv_v1_6_0);
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConsumed1"


    // $ANTLR start "entryRuleConsumed2"
    // PsiInternalSimpleReconstrTestLanguage.g:825:1: entryRuleConsumed2 : ruleConsumed2 EOF ;
    public final void entryRuleConsumed2() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:825:19: ( ruleConsumed2 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:826:2: ruleConsumed2 EOF
            {
             markComposite(elementTypeProvider.getConsumed2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConsumed2();

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
    // $ANTLR end "entryRuleConsumed2"


    // $ANTLR start "ruleConsumed2"
    // PsiInternalSimpleReconstrTestLanguage.g:831:1: ruleConsumed2 : (otherlv_0= '#7' ( (lv_child_1_0= ruleConsumed1 ) ) ) ;
    public final void ruleConsumed2() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:831:14: ( (otherlv_0= '#7' ( (lv_child_1_0= ruleConsumed1 ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:832:2: (otherlv_0= '#7' ( (lv_child_1_0= ruleConsumed1 ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:832:2: (otherlv_0= '#7' ( (lv_child_1_0= ruleConsumed1 ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:833:3: otherlv_0= '#7' ( (lv_child_1_0= ruleConsumed1 ) )
            {

            			markLeaf(elementTypeProvider.getConsumed2_NumberSignDigitSevenKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_20); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:840:3: ( (lv_child_1_0= ruleConsumed1 ) )
            // PsiInternalSimpleReconstrTestLanguage.g:841:4: (lv_child_1_0= ruleConsumed1 )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:841:4: (lv_child_1_0= ruleConsumed1 )
            // PsiInternalSimpleReconstrTestLanguage.g:842:5: lv_child_1_0= ruleConsumed1
            {

            					markComposite(elementTypeProvider.getConsumed2_ChildConsumed1ParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConsumed1();

            state._fsp--;


            					doneComposite();
            				

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
    // $ANTLR end "ruleConsumed2"


    // $ANTLR start "entryRuleLoop1"
    // PsiInternalSimpleReconstrTestLanguage.g:855:1: entryRuleLoop1 : ruleLoop1 EOF ;
    public final void entryRuleLoop1() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:855:15: ( ruleLoop1 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:856:2: ruleLoop1 EOF
            {
             markComposite(elementTypeProvider.getLoop1ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLoop1();

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
    // $ANTLR end "entryRuleLoop1"


    // $ANTLR start "ruleLoop1"
    // PsiInternalSimpleReconstrTestLanguage.g:861:1: ruleLoop1 : ( (otherlv_0= 'kw0' )? otherlv_1= '#8' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'kw1' )? ( (lv_id_4_0= RULE_ID ) ) ( (otherlv_5= 'kw2' )* otherlv_6= 'kw30' )+ ) ;
    public final void ruleLoop1() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:861:10: ( ( (otherlv_0= 'kw0' )? otherlv_1= '#8' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'kw1' )? ( (lv_id_4_0= RULE_ID ) ) ( (otherlv_5= 'kw2' )* otherlv_6= 'kw30' )+ ) )
            // PsiInternalSimpleReconstrTestLanguage.g:862:2: ( (otherlv_0= 'kw0' )? otherlv_1= '#8' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'kw1' )? ( (lv_id_4_0= RULE_ID ) ) ( (otherlv_5= 'kw2' )* otherlv_6= 'kw30' )+ )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:862:2: ( (otherlv_0= 'kw0' )? otherlv_1= '#8' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'kw1' )? ( (lv_id_4_0= RULE_ID ) ) ( (otherlv_5= 'kw2' )* otherlv_6= 'kw30' )+ )
            // PsiInternalSimpleReconstrTestLanguage.g:863:3: (otherlv_0= 'kw0' )? otherlv_1= '#8' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'kw1' )? ( (lv_id_4_0= RULE_ID ) ) ( (otherlv_5= 'kw2' )* otherlv_6= 'kw30' )+
            {
            // PsiInternalSimpleReconstrTestLanguage.g:863:3: (otherlv_0= 'kw0' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:864:4: otherlv_0= 'kw0'
                    {

                    				markLeaf(elementTypeProvider.getLoop1_Kw0Keyword_0ElementType());
                    			
                    otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_21); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getLoop1_NumberSignDigitEightKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:879:3: ( (lv_id_2_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:880:4: (lv_id_2_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:880:4: (lv_id_2_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:881:5: lv_id_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getLoop1_IdIDTerminalRuleCall_2_0ElementType());
            				
            lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

            					doneLeaf(lv_id_2_0);
            				

            }


            }

            // PsiInternalSimpleReconstrTestLanguage.g:890:3: (otherlv_3= 'kw1' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:891:4: otherlv_3= 'kw1'
                    {

                    				markLeaf(elementTypeProvider.getLoop1_Kw1Keyword_3ElementType());
                    			
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_10); 

                    				doneLeaf(otherlv_3);
                    			

                    }
                    break;

            }

            // PsiInternalSimpleReconstrTestLanguage.g:899:3: ( (lv_id_4_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:900:4: (lv_id_4_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:900:4: (lv_id_4_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:901:5: lv_id_4_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getLoop1_IdIDTerminalRuleCall_4_0ElementType());
            				
            lv_id_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

            					doneLeaf(lv_id_4_0);
            				

            }


            }

            // PsiInternalSimpleReconstrTestLanguage.g:910:3: ( (otherlv_5= 'kw2' )* otherlv_6= 'kw30' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    int LA18_2 = input.LA(2);

                    if ( ((LA18_2>=38 && LA18_2<=39)) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:911:4: (otherlv_5= 'kw2' )* otherlv_6= 'kw30'
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:911:4: (otherlv_5= 'kw2' )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==38) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // PsiInternalSimpleReconstrTestLanguage.g:912:5: otherlv_5= 'kw2'
            	    	    {

            	    	    					markLeaf(elementTypeProvider.getLoop1_Kw2Keyword_5_0ElementType());
            	    	    				
            	    	    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_23); 

            	    	    					doneLeaf(otherlv_5);
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);


            	    				markLeaf(elementTypeProvider.getLoop1_Kw30Keyword_5_1ElementType());
            	    			
            	    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_24); 

            	    				doneLeaf(otherlv_6);
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


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
    // $ANTLR end "ruleLoop1"


    // $ANTLR start "entryRuleLoop2"
    // PsiInternalSimpleReconstrTestLanguage.g:932:1: entryRuleLoop2 : ruleLoop2 EOF ;
    public final void entryRuleLoop2() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:932:15: ( ruleLoop2 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:933:2: ruleLoop2 EOF
            {
             markComposite(elementTypeProvider.getLoop2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLoop2();

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
    // $ANTLR end "entryRuleLoop2"


    // $ANTLR start "ruleLoop2"
    // PsiInternalSimpleReconstrTestLanguage.g:938:1: ruleLoop2 : (otherlv_0= '#9' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) otherlv_4= 'kw2' ) ) (otherlv_5= 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw4' ) )? (otherlv_8= 'kw5' | otherlv_9= 'kw6' ) ) ;
    public final void ruleLoop2() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_id_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:938:10: ( (otherlv_0= '#9' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) otherlv_4= 'kw2' ) ) (otherlv_5= 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw4' ) )? (otherlv_8= 'kw5' | otherlv_9= 'kw6' ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:939:2: (otherlv_0= '#9' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) otherlv_4= 'kw2' ) ) (otherlv_5= 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw4' ) )? (otherlv_8= 'kw5' | otherlv_9= 'kw6' ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:939:2: (otherlv_0= '#9' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) otherlv_4= 'kw2' ) ) (otherlv_5= 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw4' ) )? (otherlv_8= 'kw5' | otherlv_9= 'kw6' ) )
            // PsiInternalSimpleReconstrTestLanguage.g:940:3: otherlv_0= '#9' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) otherlv_4= 'kw2' ) ) (otherlv_5= 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw4' ) )? (otherlv_8= 'kw5' | otherlv_9= 'kw6' )
            {

            			markLeaf(elementTypeProvider.getLoop2_NumberSignDigitNineKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:947:3: ( (lv_id_1_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:948:4: (lv_id_1_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:948:4: (lv_id_1_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:949:5: lv_id_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getLoop2_IdIDTerminalRuleCall_1_0ElementType());
            				
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

            					doneLeaf(lv_id_1_0);
            				

            }


            }

            // PsiInternalSimpleReconstrTestLanguage.g:958:3: (otherlv_2= 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) otherlv_4= 'kw2' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:959:4: otherlv_2= 'kw1'
                    {

                    				markLeaf(elementTypeProvider.getLoop2_Kw1Keyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_25); 

                    				doneLeaf(otherlv_2);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:967:4: ( ( (lv_id_3_0= RULE_ID ) ) otherlv_4= 'kw2' )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:967:4: ( ( (lv_id_3_0= RULE_ID ) ) otherlv_4= 'kw2' )
                    // PsiInternalSimpleReconstrTestLanguage.g:968:5: ( (lv_id_3_0= RULE_ID ) ) otherlv_4= 'kw2'
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:968:5: ( (lv_id_3_0= RULE_ID ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:969:6: (lv_id_3_0= RULE_ID )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:969:6: (lv_id_3_0= RULE_ID )
                    // PsiInternalSimpleReconstrTestLanguage.g:970:7: lv_id_3_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getLoop2_IdIDTerminalRuleCall_2_1_0_0ElementType());
                    						
                    lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

                    							doneLeaf(lv_id_3_0);
                    						

                    }


                    }


                    					markLeaf(elementTypeProvider.getLoop2_Kw2Keyword_2_1_1ElementType());
                    				
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_25); 

                    					doneLeaf(otherlv_4);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalSimpleReconstrTestLanguage.g:988:3: (otherlv_5= 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw4' ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:989:4: otherlv_5= 'kw3'
                    {

                    				markLeaf(elementTypeProvider.getLoop2_Kw3Keyword_3_0ElementType());
                    			
                    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_27); 

                    				doneLeaf(otherlv_5);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:997:4: ( ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw4' )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:997:4: ( ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw4' )
                    // PsiInternalSimpleReconstrTestLanguage.g:998:5: ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw4'
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:998:5: ( (lv_id_6_0= RULE_ID ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:999:6: (lv_id_6_0= RULE_ID )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:999:6: (lv_id_6_0= RULE_ID )
                    // PsiInternalSimpleReconstrTestLanguage.g:1000:7: lv_id_6_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getLoop2_IdIDTerminalRuleCall_3_1_0_0ElementType());
                    						
                    lv_id_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); 

                    							doneLeaf(lv_id_6_0);
                    						

                    }


                    }


                    					markLeaf(elementTypeProvider.getLoop2_Kw4Keyword_3_1_1ElementType());
                    				
                    otherlv_7=(Token)match(input,42,FollowSets000.FOLLOW_27); 

                    					doneLeaf(otherlv_7);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalSimpleReconstrTestLanguage.g:1018:3: (otherlv_8= 'kw5' | otherlv_9= 'kw6' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            else if ( (LA21_0==44) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1019:4: otherlv_8= 'kw5'
                    {

                    				markLeaf(elementTypeProvider.getLoop2_Kw5Keyword_4_0ElementType());
                    			
                    otherlv_8=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    				doneLeaf(otherlv_8);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1027:4: otherlv_9= 'kw6'
                    {

                    				markLeaf(elementTypeProvider.getLoop2_Kw6Keyword_4_1ElementType());
                    			
                    otherlv_9=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                    				doneLeaf(otherlv_9);
                    			

                    }
                    break;

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
    // $ANTLR end "ruleLoop2"


    // $ANTLR start "entryRuleLoop3"
    // PsiInternalSimpleReconstrTestLanguage.g:1039:1: entryRuleLoop3 : ruleLoop3 EOF ;
    public final void entryRuleLoop3() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1039:15: ( ruleLoop3 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1040:2: ruleLoop3 EOF
            {
             markComposite(elementTypeProvider.getLoop3ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLoop3();

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
    // $ANTLR end "entryRuleLoop3"


    // $ANTLR start "ruleLoop3"
    // PsiInternalSimpleReconstrTestLanguage.g:1045:1: ruleLoop3 : ( (otherlv_0= 'kw1' | otherlv_1= 'kw2' | otherlv_2= 'kw3' ) otherlv_3= '#10' ( (lv_id_4_0= RULE_ID ) ) (otherlv_5= 'kw4' ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw5' )* ) ;
    public final void ruleLoop3() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token lv_id_6_0=null;
        Token otherlv_7=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1045:10: ( ( (otherlv_0= 'kw1' | otherlv_1= 'kw2' | otherlv_2= 'kw3' ) otherlv_3= '#10' ( (lv_id_4_0= RULE_ID ) ) (otherlv_5= 'kw4' ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw5' )* ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1046:2: ( (otherlv_0= 'kw1' | otherlv_1= 'kw2' | otherlv_2= 'kw3' ) otherlv_3= '#10' ( (lv_id_4_0= RULE_ID ) ) (otherlv_5= 'kw4' ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw5' )* )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1046:2: ( (otherlv_0= 'kw1' | otherlv_1= 'kw2' | otherlv_2= 'kw3' ) otherlv_3= '#10' ( (lv_id_4_0= RULE_ID ) ) (otherlv_5= 'kw4' ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw5' )* )
            // PsiInternalSimpleReconstrTestLanguage.g:1047:3: (otherlv_0= 'kw1' | otherlv_1= 'kw2' | otherlv_2= 'kw3' ) otherlv_3= '#10' ( (lv_id_4_0= RULE_ID ) ) (otherlv_5= 'kw4' ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw5' )*
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1047:3: (otherlv_0= 'kw1' | otherlv_1= 'kw2' | otherlv_2= 'kw3' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt22=1;
                }
                break;
            case 38:
                {
                alt22=2;
                }
                break;
            case 41:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1048:4: otherlv_0= 'kw1'
                    {

                    				markLeaf(elementTypeProvider.getLoop3_Kw1Keyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_29); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1056:4: otherlv_1= 'kw2'
                    {

                    				markLeaf(elementTypeProvider.getLoop3_Kw2Keyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_29); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 3 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1064:4: otherlv_2= 'kw3'
                    {

                    				markLeaf(elementTypeProvider.getLoop3_Kw3Keyword_0_2ElementType());
                    			
                    otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_29); 

                    				doneLeaf(otherlv_2);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getLoop3_NumberSignDigitOneDigitZeroKeyword_1ElementType());
            		
            otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1079:3: ( (lv_id_4_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1080:4: (lv_id_4_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1080:4: (lv_id_4_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1081:5: lv_id_4_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getLoop3_IdIDTerminalRuleCall_2_0ElementType());
            				
            lv_id_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); 

            					doneLeaf(lv_id_4_0);
            				

            }


            }

            // PsiInternalSimpleReconstrTestLanguage.g:1090:3: (otherlv_5= 'kw4' ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw5' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:1091:4: otherlv_5= 'kw4' ( (lv_id_6_0= RULE_ID ) ) otherlv_7= 'kw5'
            	    {

            	    				markLeaf(elementTypeProvider.getLoop3_Kw4Keyword_3_0ElementType());
            	    			
            	    otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_10); 

            	    				doneLeaf(otherlv_5);
            	    			
            	    // PsiInternalSimpleReconstrTestLanguage.g:1098:4: ( (lv_id_6_0= RULE_ID ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1099:5: (lv_id_6_0= RULE_ID )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1099:5: (lv_id_6_0= RULE_ID )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1100:6: lv_id_6_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getLoop3_IdIDTerminalRuleCall_3_1_0ElementType());
            	    					
            	    lv_id_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_31); 

            	    						doneLeaf(lv_id_6_0);
            	    					

            	    }


            	    }


            	    				markLeaf(elementTypeProvider.getLoop3_Kw5Keyword_3_2ElementType());
            	    			
            	    otherlv_7=(Token)match(input,43,FollowSets000.FOLLOW_30); 

            	    				doneLeaf(otherlv_7);
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


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
    // $ANTLR end "ruleLoop3"


    // $ANTLR start "entryRuleLoop4"
    // PsiInternalSimpleReconstrTestLanguage.g:1121:1: entryRuleLoop4 : ruleLoop4 EOF ;
    public final void entryRuleLoop4() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1121:15: ( ruleLoop4 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1122:2: ruleLoop4 EOF
            {
             markComposite(elementTypeProvider.getLoop4ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLoop4();

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
    // $ANTLR end "entryRuleLoop4"


    // $ANTLR start "ruleLoop4"
    // PsiInternalSimpleReconstrTestLanguage.g:1127:1: ruleLoop4 : (otherlv_0= '#11' (otherlv_1= 'kw1' | otherlv_2= 'kw2' | (otherlv_3= 'kw3' otherlv_4= 'kw4' ) ) ( (lv_id_5_0= RULE_ID ) ) (otherlv_6= 'kw5' (otherlv_7= 'kw6' (otherlv_8= 'kw7' )? )? )+ ) ;
    public final void ruleLoop4() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1127:10: ( (otherlv_0= '#11' (otherlv_1= 'kw1' | otherlv_2= 'kw2' | (otherlv_3= 'kw3' otherlv_4= 'kw4' ) ) ( (lv_id_5_0= RULE_ID ) ) (otherlv_6= 'kw5' (otherlv_7= 'kw6' (otherlv_8= 'kw7' )? )? )+ ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1128:2: (otherlv_0= '#11' (otherlv_1= 'kw1' | otherlv_2= 'kw2' | (otherlv_3= 'kw3' otherlv_4= 'kw4' ) ) ( (lv_id_5_0= RULE_ID ) ) (otherlv_6= 'kw5' (otherlv_7= 'kw6' (otherlv_8= 'kw7' )? )? )+ )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1128:2: (otherlv_0= '#11' (otherlv_1= 'kw1' | otherlv_2= 'kw2' | (otherlv_3= 'kw3' otherlv_4= 'kw4' ) ) ( (lv_id_5_0= RULE_ID ) ) (otherlv_6= 'kw5' (otherlv_7= 'kw6' (otherlv_8= 'kw7' )? )? )+ )
            // PsiInternalSimpleReconstrTestLanguage.g:1129:3: otherlv_0= '#11' (otherlv_1= 'kw1' | otherlv_2= 'kw2' | (otherlv_3= 'kw3' otherlv_4= 'kw4' ) ) ( (lv_id_5_0= RULE_ID ) ) (otherlv_6= 'kw5' (otherlv_7= 'kw6' (otherlv_8= 'kw7' )? )? )+
            {

            			markLeaf(elementTypeProvider.getLoop4_NumberSignDigitOneDigitOneKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_32); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1136:3: (otherlv_1= 'kw1' | otherlv_2= 'kw2' | (otherlv_3= 'kw3' otherlv_4= 'kw4' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case 41:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1137:4: otherlv_1= 'kw1'
                    {

                    				markLeaf(elementTypeProvider.getLoop4_Kw1Keyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_10); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1145:4: otherlv_2= 'kw2'
                    {

                    				markLeaf(elementTypeProvider.getLoop4_Kw2Keyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_10); 

                    				doneLeaf(otherlv_2);
                    			

                    }
                    break;
                case 3 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1153:4: (otherlv_3= 'kw3' otherlv_4= 'kw4' )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:1153:4: (otherlv_3= 'kw3' otherlv_4= 'kw4' )
                    // PsiInternalSimpleReconstrTestLanguage.g:1154:5: otherlv_3= 'kw3' otherlv_4= 'kw4'
                    {

                    					markLeaf(elementTypeProvider.getLoop4_Kw3Keyword_1_2_0ElementType());
                    				
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_28); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getLoop4_Kw4Keyword_1_2_1ElementType());
                    				
                    otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_10); 

                    					doneLeaf(otherlv_4);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalSimpleReconstrTestLanguage.g:1170:3: ( (lv_id_5_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1171:4: (lv_id_5_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1171:4: (lv_id_5_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1172:5: lv_id_5_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getLoop4_IdIDTerminalRuleCall_2_0ElementType());
            				
            lv_id_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_31); 

            					doneLeaf(lv_id_5_0);
            				

            }


            }

            // PsiInternalSimpleReconstrTestLanguage.g:1181:3: (otherlv_6= 'kw5' (otherlv_7= 'kw6' (otherlv_8= 'kw7' )? )? )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:1182:4: otherlv_6= 'kw5' (otherlv_7= 'kw6' (otherlv_8= 'kw7' )? )?
            	    {

            	    				markLeaf(elementTypeProvider.getLoop4_Kw5Keyword_3_0ElementType());
            	    			
            	    otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_33); 

            	    				doneLeaf(otherlv_6);
            	    			
            	    // PsiInternalSimpleReconstrTestLanguage.g:1189:4: (otherlv_7= 'kw6' (otherlv_8= 'kw7' )? )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==44) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // PsiInternalSimpleReconstrTestLanguage.g:1190:5: otherlv_7= 'kw6' (otherlv_8= 'kw7' )?
            	            {

            	            					markLeaf(elementTypeProvider.getLoop4_Kw6Keyword_3_1_0ElementType());
            	            				
            	            otherlv_7=(Token)match(input,44,FollowSets000.FOLLOW_34); 

            	            					doneLeaf(otherlv_7);
            	            				
            	            // PsiInternalSimpleReconstrTestLanguage.g:1197:5: (otherlv_8= 'kw7' )?
            	            int alt25=2;
            	            int LA25_0 = input.LA(1);

            	            if ( (LA25_0==47) ) {
            	                alt25=1;
            	            }
            	            switch (alt25) {
            	                case 1 :
            	                    // PsiInternalSimpleReconstrTestLanguage.g:1198:6: otherlv_8= 'kw7'
            	                    {

            	                    						markLeaf(elementTypeProvider.getLoop4_Kw7Keyword_3_1_1ElementType());
            	                    					
            	                    otherlv_8=(Token)match(input,47,FollowSets000.FOLLOW_35); 

            	                    						doneLeaf(otherlv_8);
            	                    					

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


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
    // $ANTLR end "ruleLoop4"


    // $ANTLR start "entryRuleLoopBug285452"
    // PsiInternalSimpleReconstrTestLanguage.g:1212:1: entryRuleLoopBug285452 : ruleLoopBug285452 EOF ;
    public final void entryRuleLoopBug285452() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1212:23: ( ruleLoopBug285452 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1213:2: ruleLoopBug285452 EOF
            {
             markComposite(elementTypeProvider.getLoopBug285452ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLoopBug285452();

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
    // $ANTLR end "entryRuleLoopBug285452"


    // $ANTLR start "ruleLoopBug285452"
    // PsiInternalSimpleReconstrTestLanguage.g:1218:1: ruleLoopBug285452 : (otherlv_0= '#12' ( ( (lv_interface_1_0= 'interface' ) ) | otherlv_2= 'class' ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final void ruleLoopBug285452() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_interface_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1218:18: ( (otherlv_0= '#12' ( ( (lv_interface_1_0= 'interface' ) ) | otherlv_2= 'class' ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1219:2: (otherlv_0= '#12' ( ( (lv_interface_1_0= 'interface' ) ) | otherlv_2= 'class' ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1219:2: (otherlv_0= '#12' ( ( (lv_interface_1_0= 'interface' ) ) | otherlv_2= 'class' ) ( (lv_name_3_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1220:3: otherlv_0= '#12' ( ( (lv_interface_1_0= 'interface' ) ) | otherlv_2= 'class' ) ( (lv_name_3_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getLoopBug285452_NumberSignDigitOneDigitTwoKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_36); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1227:3: ( ( (lv_interface_1_0= 'interface' ) ) | otherlv_2= 'class' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            else if ( (LA28_0==50) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1228:4: ( (lv_interface_1_0= 'interface' ) )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:1228:4: ( (lv_interface_1_0= 'interface' ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:1229:5: (lv_interface_1_0= 'interface' )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:1229:5: (lv_interface_1_0= 'interface' )
                    // PsiInternalSimpleReconstrTestLanguage.g:1230:6: lv_interface_1_0= 'interface'
                    {

                    						markLeaf(elementTypeProvider.getLoopBug285452_InterfaceInterfaceKeyword_1_0_0ElementType());
                    					
                    lv_interface_1_0=(Token)match(input,49,FollowSets000.FOLLOW_10); 

                    						doneLeaf(lv_interface_1_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1240:4: otherlv_2= 'class'
                    {

                    				markLeaf(elementTypeProvider.getLoopBug285452_ClassKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_10); 

                    				doneLeaf(otherlv_2);
                    			

                    }
                    break;

            }

            // PsiInternalSimpleReconstrTestLanguage.g:1248:3: ( (lv_name_3_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1249:4: (lv_name_3_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1249:4: (lv_name_3_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1250:5: lv_name_3_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getLoopBug285452_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_name_3_0);
            				

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
    // $ANTLR end "ruleLoopBug285452"


    // $ANTLR start "entryRuleDuplicateBug284491"
    // PsiInternalSimpleReconstrTestLanguage.g:1263:1: entryRuleDuplicateBug284491 : ruleDuplicateBug284491 EOF ;
    public final void entryRuleDuplicateBug284491() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1263:28: ( ruleDuplicateBug284491 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1264:2: ruleDuplicateBug284491 EOF
            {
             markComposite(elementTypeProvider.getDuplicateBug284491ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDuplicateBug284491();

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
    // $ANTLR end "entryRuleDuplicateBug284491"


    // $ANTLR start "ruleDuplicateBug284491"
    // PsiInternalSimpleReconstrTestLanguage.g:1269:1: ruleDuplicateBug284491 : (otherlv_0= '#13' ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )* ) ;
    public final void ruleDuplicateBug284491() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_final_2_0=null;
        Token lv_transient_3_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1269:23: ( (otherlv_0= '#13' ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )* ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1270:2: (otherlv_0= '#13' ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )* )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1270:2: (otherlv_0= '#13' ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )* )
            // PsiInternalSimpleReconstrTestLanguage.g:1271:3: otherlv_0= '#13' ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )*
            {

            			markLeaf(elementTypeProvider.getDuplicateBug284491_NumberSignDigitOneDigitThreeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_37); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1278:3: ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )*
            loop29:
            do {
                int alt29=4;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    alt29=1;
                    }
                    break;
                case 53:
                    {
                    alt29=2;
                    }
                    break;
                case 54:
                    {
                    alt29=3;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:1279:4: ( (lv_static_1_0= 'static' ) )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1279:4: ( (lv_static_1_0= 'static' ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1280:5: (lv_static_1_0= 'static' )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1280:5: (lv_static_1_0= 'static' )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1281:6: lv_static_1_0= 'static'
            	    {

            	    						markLeaf(elementTypeProvider.getDuplicateBug284491_StaticStaticKeyword_1_0_0ElementType());
            	    					
            	    lv_static_1_0=(Token)match(input,52,FollowSets000.FOLLOW_37); 

            	    						doneLeaf(lv_static_1_0);
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:1291:4: ( (lv_final_2_0= 'final' ) )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1291:4: ( (lv_final_2_0= 'final' ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1292:5: (lv_final_2_0= 'final' )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1292:5: (lv_final_2_0= 'final' )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1293:6: lv_final_2_0= 'final'
            	    {

            	    						markLeaf(elementTypeProvider.getDuplicateBug284491_FinalFinalKeyword_1_1_0ElementType());
            	    					
            	    lv_final_2_0=(Token)match(input,53,FollowSets000.FOLLOW_37); 

            	    						doneLeaf(lv_final_2_0);
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:1303:4: ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1303:4: ( (lv_transient_3_0= 'transient' ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1304:5: (lv_transient_3_0= 'transient' )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1304:5: (lv_transient_3_0= 'transient' )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1305:6: lv_transient_3_0= 'transient'
            	    {

            	    						markLeaf(elementTypeProvider.getDuplicateBug284491_TransientTransientKeyword_1_2_0ElementType());
            	    					
            	    lv_transient_3_0=(Token)match(input,54,FollowSets000.FOLLOW_37); 

            	    						doneLeaf(lv_transient_3_0);
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


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
    // $ANTLR end "ruleDuplicateBug284491"


    // $ANTLR start "entryRuleEmptyObjectBug284850"
    // PsiInternalSimpleReconstrTestLanguage.g:1319:1: entryRuleEmptyObjectBug284850 : ruleEmptyObjectBug284850 EOF ;
    public final void entryRuleEmptyObjectBug284850() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1319:30: ( ruleEmptyObjectBug284850 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1320:2: ruleEmptyObjectBug284850 EOF
            {
             markComposite(elementTypeProvider.getEmptyObjectBug284850ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEmptyObjectBug284850();

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
    // $ANTLR end "entryRuleEmptyObjectBug284850"


    // $ANTLR start "ruleEmptyObjectBug284850"
    // PsiInternalSimpleReconstrTestLanguage.g:1325:1: ruleEmptyObjectBug284850 : (otherlv_0= '#14' ( (lv_items_1_0= ruleEmptyObjectItems ) ) ) ;
    public final void ruleEmptyObjectBug284850() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1325:25: ( (otherlv_0= '#14' ( (lv_items_1_0= ruleEmptyObjectItems ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1326:2: (otherlv_0= '#14' ( (lv_items_1_0= ruleEmptyObjectItems ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1326:2: (otherlv_0= '#14' ( (lv_items_1_0= ruleEmptyObjectItems ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1327:3: otherlv_0= '#14' ( (lv_items_1_0= ruleEmptyObjectItems ) )
            {

            			markLeaf(elementTypeProvider.getEmptyObjectBug284850_NumberSignDigitOneDigitFourKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_38); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1334:3: ( (lv_items_1_0= ruleEmptyObjectItems ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1335:4: (lv_items_1_0= ruleEmptyObjectItems )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1335:4: (lv_items_1_0= ruleEmptyObjectItems )
            // PsiInternalSimpleReconstrTestLanguage.g:1336:5: lv_items_1_0= ruleEmptyObjectItems
            {

            					markComposite(elementTypeProvider.getEmptyObjectBug284850_ItemsEmptyObjectItemsParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmptyObjectItems();

            state._fsp--;


            					doneComposite();
            				

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
    // $ANTLR end "ruleEmptyObjectBug284850"


    // $ANTLR start "entryRuleEmptyObjectItems"
    // PsiInternalSimpleReconstrTestLanguage.g:1349:1: entryRuleEmptyObjectItems : ruleEmptyObjectItems EOF ;
    public final void entryRuleEmptyObjectItems() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1349:26: ( ruleEmptyObjectItems EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1350:2: ruleEmptyObjectItems EOF
            {
             markComposite(elementTypeProvider.getEmptyObjectItemsElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEmptyObjectItems();

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
    // $ANTLR end "entryRuleEmptyObjectItems"


    // $ANTLR start "ruleEmptyObjectItems"
    // PsiInternalSimpleReconstrTestLanguage.g:1355:1: ruleEmptyObjectItems : ( (lv_list_0_0= ruleEmptyObjectItem ) )* ;
    public final void ruleEmptyObjectItems() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1355:21: ( ( (lv_list_0_0= ruleEmptyObjectItem ) )* )
            // PsiInternalSimpleReconstrTestLanguage.g:1356:2: ( (lv_list_0_0= ruleEmptyObjectItem ) )*
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1356:2: ( (lv_list_0_0= ruleEmptyObjectItem ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==56) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:1357:3: (lv_list_0_0= ruleEmptyObjectItem )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1357:3: (lv_list_0_0= ruleEmptyObjectItem )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1358:4: lv_list_0_0= ruleEmptyObjectItem
            	    {

            	    				markComposite(elementTypeProvider.getEmptyObjectItems_ListEmptyObjectItemParserRuleCall_0ElementType());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    ruleEmptyObjectItem();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleEmptyObjectItems"


    // $ANTLR start "entryRuleEmptyObjectItem"
    // PsiInternalSimpleReconstrTestLanguage.g:1370:1: entryRuleEmptyObjectItem : ruleEmptyObjectItem EOF ;
    public final void entryRuleEmptyObjectItem() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1370:25: ( ruleEmptyObjectItem EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1371:2: ruleEmptyObjectItem EOF
            {
             markComposite(elementTypeProvider.getEmptyObjectItemElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEmptyObjectItem();

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
    // $ANTLR end "entryRuleEmptyObjectItem"


    // $ANTLR start "ruleEmptyObjectItem"
    // PsiInternalSimpleReconstrTestLanguage.g:1376:1: ruleEmptyObjectItem : (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final void ruleEmptyObjectItem() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1376:20: ( (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1377:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1377:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1378:3: otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getEmptyObjectItem_ItemKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1385:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1386:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1386:4: (lv_name_1_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1387:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEmptyObjectItem_NameIDTerminalRuleCall_1_0ElementType());
            				
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
    // $ANTLR end "ruleEmptyObjectItem"


    // $ANTLR start "entryRuleMultiInheritanceBug280439"
    // PsiInternalSimpleReconstrTestLanguage.g:1400:1: entryRuleMultiInheritanceBug280439 : ruleMultiInheritanceBug280439 EOF ;
    public final void entryRuleMultiInheritanceBug280439() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1400:35: ( ruleMultiInheritanceBug280439 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1401:2: ruleMultiInheritanceBug280439 EOF
            {
             markComposite(elementTypeProvider.getMultiInheritanceBug280439ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMultiInheritanceBug280439();

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
    // $ANTLR end "entryRuleMultiInheritanceBug280439"


    // $ANTLR start "ruleMultiInheritanceBug280439"
    // PsiInternalSimpleReconstrTestLanguage.g:1406:1: ruleMultiInheritanceBug280439 : (otherlv_0= '#15' ( (lv_val_1_0= ruleConcreteMulti ) ) ) ;
    public final void ruleMultiInheritanceBug280439() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1406:30: ( (otherlv_0= '#15' ( (lv_val_1_0= ruleConcreteMulti ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1407:2: (otherlv_0= '#15' ( (lv_val_1_0= ruleConcreteMulti ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1407:2: (otherlv_0= '#15' ( (lv_val_1_0= ruleConcreteMulti ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1408:3: otherlv_0= '#15' ( (lv_val_1_0= ruleConcreteMulti ) )
            {

            			markLeaf(elementTypeProvider.getMultiInheritanceBug280439_NumberSignDigitOneDigitFiveKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1415:3: ( (lv_val_1_0= ruleConcreteMulti ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1416:4: (lv_val_1_0= ruleConcreteMulti )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1416:4: (lv_val_1_0= ruleConcreteMulti )
            // PsiInternalSimpleReconstrTestLanguage.g:1417:5: lv_val_1_0= ruleConcreteMulti
            {

            					markComposite(elementTypeProvider.getMultiInheritanceBug280439_ValConcreteMultiParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConcreteMulti();

            state._fsp--;


            					doneComposite();
            				

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
    // $ANTLR end "ruleMultiInheritanceBug280439"


    // $ANTLR start "entryRuleConcreteMulti"
    // PsiInternalSimpleReconstrTestLanguage.g:1430:1: entryRuleConcreteMulti : ruleConcreteMulti EOF ;
    public final void entryRuleConcreteMulti() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1430:23: ( ruleConcreteMulti EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1431:2: ruleConcreteMulti EOF
            {
             markComposite(elementTypeProvider.getConcreteMultiElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConcreteMulti();

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
    // $ANTLR end "entryRuleConcreteMulti"


    // $ANTLR start "ruleConcreteMulti"
    // PsiInternalSimpleReconstrTestLanguage.g:1436:1: ruleConcreteMulti : ( ( (lv_m1_0_0= RULE_ID ) ) ( (lv_m2_1_0= RULE_ID ) ) ) ;
    public final void ruleConcreteMulti() throws RecognitionException {
        Token lv_m1_0_0=null;
        Token lv_m2_1_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1436:18: ( ( ( (lv_m1_0_0= RULE_ID ) ) ( (lv_m2_1_0= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1437:2: ( ( (lv_m1_0_0= RULE_ID ) ) ( (lv_m2_1_0= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1437:2: ( ( (lv_m1_0_0= RULE_ID ) ) ( (lv_m2_1_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1438:3: ( (lv_m1_0_0= RULE_ID ) ) ( (lv_m2_1_0= RULE_ID ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1438:3: ( (lv_m1_0_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1439:4: (lv_m1_0_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1439:4: (lv_m1_0_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1440:5: lv_m1_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getConcreteMulti_M1IDTerminalRuleCall_0_0ElementType());
            				
            lv_m1_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					doneLeaf(lv_m1_0_0);
            				

            }


            }

            // PsiInternalSimpleReconstrTestLanguage.g:1449:3: ( (lv_m2_1_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1450:4: (lv_m2_1_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1450:4: (lv_m2_1_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1451:5: lv_m2_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getConcreteMulti_M2IDTerminalRuleCall_1_0ElementType());
            				
            lv_m2_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_m2_1_0);
            				

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
    // $ANTLR end "ruleConcreteMulti"


    // $ANTLR start "entryRuleEObjectRef"
    // PsiInternalSimpleReconstrTestLanguage.g:1464:1: entryRuleEObjectRef : ruleEObjectRef EOF ;
    public final void entryRuleEObjectRef() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1464:20: ( ruleEObjectRef EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1465:2: ruleEObjectRef EOF
            {
             markComposite(elementTypeProvider.getEObjectRefElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEObjectRef();

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
    // $ANTLR end "entryRuleEObjectRef"


    // $ANTLR start "ruleEObjectRef"
    // PsiInternalSimpleReconstrTestLanguage.g:1470:1: ruleEObjectRef : (otherlv_0= '#16' ( (lv_obj_1_0= ruleEObjectElement ) ) otherlv_2= 'refs' ( (otherlv_3= RULE_ID ) ) ) ;
    public final void ruleEObjectRef() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1470:15: ( (otherlv_0= '#16' ( (lv_obj_1_0= ruleEObjectElement ) ) otherlv_2= 'refs' ( (otherlv_3= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1471:2: (otherlv_0= '#16' ( (lv_obj_1_0= ruleEObjectElement ) ) otherlv_2= 'refs' ( (otherlv_3= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1471:2: (otherlv_0= '#16' ( (lv_obj_1_0= ruleEObjectElement ) ) otherlv_2= 'refs' ( (otherlv_3= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1472:3: otherlv_0= '#16' ( (lv_obj_1_0= ruleEObjectElement ) ) otherlv_2= 'refs' ( (otherlv_3= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getEObjectRef_NumberSignDigitOneDigitSixKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1479:3: ( (lv_obj_1_0= ruleEObjectElement ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1480:4: (lv_obj_1_0= ruleEObjectElement )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1480:4: (lv_obj_1_0= ruleEObjectElement )
            // PsiInternalSimpleReconstrTestLanguage.g:1481:5: lv_obj_1_0= ruleEObjectElement
            {

            					markComposite(elementTypeProvider.getEObjectRef_ObjEObjectElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_40);
            ruleEObjectElement();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEObjectRef_RefsKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,59,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1497:3: ( (otherlv_3= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1498:4: (otherlv_3= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1498:4: (otherlv_3= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1499:5: otherlv_3= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEObjectRef_RefEObjectCrossReference_3_0ElementType());
            				
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(otherlv_3);
            				

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
    // $ANTLR end "ruleEObjectRef"


    // $ANTLR start "entryRuleEObjectElement"
    // PsiInternalSimpleReconstrTestLanguage.g:1512:1: entryRuleEObjectElement : ruleEObjectElement EOF ;
    public final void entryRuleEObjectElement() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1512:24: ( ruleEObjectElement EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1513:2: ruleEObjectElement EOF
            {
             markComposite(elementTypeProvider.getEObjectElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEObjectElement();

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
    // $ANTLR end "entryRuleEObjectElement"


    // $ANTLR start "ruleEObjectElement"
    // PsiInternalSimpleReconstrTestLanguage.g:1518:1: ruleEObjectElement : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void ruleEObjectElement() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1518:19: ( ( (lv_name_0_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1519:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1519:2: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1520:3: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1520:3: (lv_name_0_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1521:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getEObjectElement_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				doneLeaf(lv_name_0_0);
            			

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
    // $ANTLR end "ruleEObjectElement"


    // $ANTLR start "entryRuleTypeBug305577_1"
    // PsiInternalSimpleReconstrTestLanguage.g:1533:1: entryRuleTypeBug305577_1 : ruleTypeBug305577_1 EOF ;
    public final void entryRuleTypeBug305577_1() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1533:25: ( ruleTypeBug305577_1 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1534:2: ruleTypeBug305577_1 EOF
            {
             markComposite(elementTypeProvider.getTypeBug305577_1ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeBug305577_1();

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
    // $ANTLR end "entryRuleTypeBug305577_1"


    // $ANTLR start "ruleTypeBug305577_1"
    // PsiInternalSimpleReconstrTestLanguage.g:1539:1: ruleTypeBug305577_1 : (otherlv_0= '#17' ( ruleTypeBug1A | ruleTypeBug1B ) ) ;
    public final void ruleTypeBug305577_1() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1539:20: ( (otherlv_0= '#17' ( ruleTypeBug1A | ruleTypeBug1B ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1540:2: (otherlv_0= '#17' ( ruleTypeBug1A | ruleTypeBug1B ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1540:2: (otherlv_0= '#17' ( ruleTypeBug1A | ruleTypeBug1B ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1541:3: otherlv_0= '#17' ( ruleTypeBug1A | ruleTypeBug1B )
            {

            			markLeaf(elementTypeProvider.getTypeBug305577_1_NumberSignDigitOneDigitSevenKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_41); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1548:3: ( ruleTypeBug1A | ruleTypeBug1B )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==62) ) {
                alt31=1;
            }
            else if ( (LA31_0==63) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1549:4: ruleTypeBug1A
                    {

                    				markComposite(elementTypeProvider.getTypeBug305577_1_TypeBug1AParserRuleCall_1_0ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypeBug1A();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1557:4: ruleTypeBug1B
                    {

                    				markComposite(elementTypeProvider.getTypeBug305577_1_TypeBug1BParserRuleCall_1_1ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypeBug1B();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleTypeBug305577_1"


    // $ANTLR start "entryRuleTypeBug305577_2"
    // PsiInternalSimpleReconstrTestLanguage.g:1569:1: entryRuleTypeBug305577_2 : ruleTypeBug305577_2 EOF ;
    public final void entryRuleTypeBug305577_2() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1569:25: ( ruleTypeBug305577_2 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1570:2: ruleTypeBug305577_2 EOF
            {
             markComposite(elementTypeProvider.getTypeBug305577_2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeBug305577_2();

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
    // $ANTLR end "entryRuleTypeBug305577_2"


    // $ANTLR start "ruleTypeBug305577_2"
    // PsiInternalSimpleReconstrTestLanguage.g:1575:1: ruleTypeBug305577_2 : (otherlv_0= '#18' ( ruleTypeBug2B | ruleTypeBug2A ) ) ;
    public final void ruleTypeBug305577_2() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1575:20: ( (otherlv_0= '#18' ( ruleTypeBug2B | ruleTypeBug2A ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1576:2: (otherlv_0= '#18' ( ruleTypeBug2B | ruleTypeBug2A ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1576:2: (otherlv_0= '#18' ( ruleTypeBug2B | ruleTypeBug2A ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1577:3: otherlv_0= '#18' ( ruleTypeBug2B | ruleTypeBug2A )
            {

            			markLeaf(elementTypeProvider.getTypeBug305577_2_NumberSignDigitOneDigitEightKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_41); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1584:3: ( ruleTypeBug2B | ruleTypeBug2A )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==63) ) {
                alt32=1;
            }
            else if ( (LA32_0==62) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1585:4: ruleTypeBug2B
                    {

                    				markComposite(elementTypeProvider.getTypeBug305577_2_TypeBug2BParserRuleCall_1_0ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypeBug2B();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1593:4: ruleTypeBug2A
                    {

                    				markComposite(elementTypeProvider.getTypeBug305577_2_TypeBug2AParserRuleCall_1_1ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypeBug2A();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleTypeBug305577_2"


    // $ANTLR start "entryRuleTypeBug1A"
    // PsiInternalSimpleReconstrTestLanguage.g:1605:1: entryRuleTypeBug1A : ruleTypeBug1A EOF ;
    public final void entryRuleTypeBug1A() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1605:19: ( ruleTypeBug1A EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1606:2: ruleTypeBug1A EOF
            {
             markComposite(elementTypeProvider.getTypeBug1AElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeBug1A();

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
    // $ANTLR end "entryRuleTypeBug1A"


    // $ANTLR start "ruleTypeBug1A"
    // PsiInternalSimpleReconstrTestLanguage.g:1611:1: ruleTypeBug1A : ( () otherlv_1= 'ka' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final void ruleTypeBug1A() throws RecognitionException {
        Token otherlv_1=null;
        Token lv_name_2_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1611:14: ( ( () otherlv_1= 'ka' ( (lv_name_2_0= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1612:2: ( () otherlv_1= 'ka' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1612:2: ( () otherlv_1= 'ka' ( (lv_name_2_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1613:3: () otherlv_1= 'ka' ( (lv_name_2_0= RULE_ID ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1613:3: ()
            // PsiInternalSimpleReconstrTestLanguage.g:1614:4: 
            {

            				precedeComposite(elementTypeProvider.getTypeBug1A_TypeBug1AAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getTypeBug1A_KaKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1626:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1627:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1627:4: (lv_name_2_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1628:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTypeBug1A_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_name_2_0);
            				

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
    // $ANTLR end "ruleTypeBug1A"


    // $ANTLR start "entryRuleTypeBug1B"
    // PsiInternalSimpleReconstrTestLanguage.g:1641:1: entryRuleTypeBug1B : ruleTypeBug1B EOF ;
    public final void entryRuleTypeBug1B() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1641:19: ( ruleTypeBug1B EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1642:2: ruleTypeBug1B EOF
            {
             markComposite(elementTypeProvider.getTypeBug1BElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeBug1B();

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
    // $ANTLR end "entryRuleTypeBug1B"


    // $ANTLR start "ruleTypeBug1B"
    // PsiInternalSimpleReconstrTestLanguage.g:1647:1: ruleTypeBug1B : ( () otherlv_1= 'kb' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final void ruleTypeBug1B() throws RecognitionException {
        Token otherlv_1=null;
        Token lv_name_2_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1647:14: ( ( () otherlv_1= 'kb' ( (lv_name_2_0= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1648:2: ( () otherlv_1= 'kb' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1648:2: ( () otherlv_1= 'kb' ( (lv_name_2_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1649:3: () otherlv_1= 'kb' ( (lv_name_2_0= RULE_ID ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1649:3: ()
            // PsiInternalSimpleReconstrTestLanguage.g:1650:4: 
            {

            				precedeComposite(elementTypeProvider.getTypeBug1B_TypeBug1BAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getTypeBug1B_KbKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1662:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1663:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1663:4: (lv_name_2_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1664:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTypeBug1B_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_name_2_0);
            				

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
    // $ANTLR end "ruleTypeBug1B"


    // $ANTLR start "entryRuleTypeBug2A"
    // PsiInternalSimpleReconstrTestLanguage.g:1677:1: entryRuleTypeBug2A : ruleTypeBug2A EOF ;
    public final void entryRuleTypeBug2A() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1677:19: ( ruleTypeBug2A EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1678:2: ruleTypeBug2A EOF
            {
             markComposite(elementTypeProvider.getTypeBug2AElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeBug2A();

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
    // $ANTLR end "entryRuleTypeBug2A"


    // $ANTLR start "ruleTypeBug2A"
    // PsiInternalSimpleReconstrTestLanguage.g:1683:1: ruleTypeBug2A : ( () otherlv_1= 'ka' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final void ruleTypeBug2A() throws RecognitionException {
        Token otherlv_1=null;
        Token lv_name_2_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1683:14: ( ( () otherlv_1= 'ka' ( (lv_name_2_0= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1684:2: ( () otherlv_1= 'ka' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1684:2: ( () otherlv_1= 'ka' ( (lv_name_2_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1685:3: () otherlv_1= 'ka' ( (lv_name_2_0= RULE_ID ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1685:3: ()
            // PsiInternalSimpleReconstrTestLanguage.g:1686:4: 
            {

            				precedeComposite(elementTypeProvider.getTypeBug2A_TypeBug2AAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getTypeBug2A_KaKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1698:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1699:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1699:4: (lv_name_2_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1700:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTypeBug2A_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_name_2_0);
            				

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
    // $ANTLR end "ruleTypeBug2A"


    // $ANTLR start "entryRuleTypeBug2B"
    // PsiInternalSimpleReconstrTestLanguage.g:1713:1: entryRuleTypeBug2B : ruleTypeBug2B EOF ;
    public final void entryRuleTypeBug2B() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1713:19: ( ruleTypeBug2B EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1714:2: ruleTypeBug2B EOF
            {
             markComposite(elementTypeProvider.getTypeBug2BElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeBug2B();

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
    // $ANTLR end "entryRuleTypeBug2B"


    // $ANTLR start "ruleTypeBug2B"
    // PsiInternalSimpleReconstrTestLanguage.g:1719:1: ruleTypeBug2B : ( () otherlv_1= 'kb' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final void ruleTypeBug2B() throws RecognitionException {
        Token otherlv_1=null;
        Token lv_name_2_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1719:14: ( ( () otherlv_1= 'kb' ( (lv_name_2_0= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1720:2: ( () otherlv_1= 'kb' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1720:2: ( () otherlv_1= 'kb' ( (lv_name_2_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1721:3: () otherlv_1= 'kb' ( (lv_name_2_0= RULE_ID ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1721:3: ()
            // PsiInternalSimpleReconstrTestLanguage.g:1722:4: 
            {

            				precedeComposite(elementTypeProvider.getTypeBug2B_TypeBug2BAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getTypeBug2B_KbKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1734:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1735:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1735:4: (lv_name_2_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1736:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTypeBug2B_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_name_2_0);
            				

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
    // $ANTLR end "ruleTypeBug2B"


    // $ANTLR start "entryRuleBug305171"
    // PsiInternalSimpleReconstrTestLanguage.g:1749:1: entryRuleBug305171 : ruleBug305171 EOF ;
    public final void entryRuleBug305171() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1749:19: ( ruleBug305171 EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1750:2: ruleBug305171 EOF
            {
             markComposite(elementTypeProvider.getBug305171ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBug305171();

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
    // $ANTLR end "entryRuleBug305171"


    // $ANTLR start "ruleBug305171"
    // PsiInternalSimpleReconstrTestLanguage.g:1755:1: ruleBug305171 : (otherlv_0= '#19' ( (otherlv_1= 'kx' ( (lv_x_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( (otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )* )? (otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) ) ( (lv_name_13_0= RULE_ID ) ) ) ;
    public final void ruleBug305171() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token lv_y_6_0=null;
        Token otherlv_7=null;
        Token lv_y_8_0=null;
        Token otherlv_9=null;
        Token lv_z_10_0=null;
        Token otherlv_11=null;
        Token lv_z_12_0=null;
        Token lv_name_13_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1755:14: ( (otherlv_0= '#19' ( (otherlv_1= 'kx' ( (lv_x_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( (otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )* )? (otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) ) ( (lv_name_13_0= RULE_ID ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1756:2: (otherlv_0= '#19' ( (otherlv_1= 'kx' ( (lv_x_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( (otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )* )? (otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) ) ( (lv_name_13_0= RULE_ID ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1756:2: (otherlv_0= '#19' ( (otherlv_1= 'kx' ( (lv_x_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( (otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )* )? (otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) ) ( (lv_name_13_0= RULE_ID ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1757:3: otherlv_0= '#19' ( (otherlv_1= 'kx' ( (lv_x_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( (otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )* )? (otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) ) ( (lv_name_13_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getBug305171_NumberSignDigitOneDigitNineKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_42); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1764:3: ( (otherlv_1= 'kx' ( (lv_x_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( (otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )* )? (otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1765:4: (otherlv_1= 'kx' ( (lv_x_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( (otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )* )? (otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )* )? )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1765:4: (otherlv_1= 'kx' ( (lv_x_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==65) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1766:5: otherlv_1= 'kx' ( (lv_x_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) ) )*
                    {

                    					markLeaf(elementTypeProvider.getBug305171_KxKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_10); 

                    					doneLeaf(otherlv_1);
                    				
                    // PsiInternalSimpleReconstrTestLanguage.g:1773:5: ( (lv_x_2_0= RULE_ID ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:1774:6: (lv_x_2_0= RULE_ID )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:1774:6: (lv_x_2_0= RULE_ID )
                    // PsiInternalSimpleReconstrTestLanguage.g:1775:7: lv_x_2_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getBug305171_XIDTerminalRuleCall_1_0_1_0ElementType());
                    						
                    lv_x_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_43); 

                    							doneLeaf(lv_x_2_0);
                    						

                    }


                    }

                    // PsiInternalSimpleReconstrTestLanguage.g:1784:5: (otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==30) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1785:6: otherlv_3= ',' ( (lv_x_4_0= RULE_ID ) )
                    	    {

                    	    						markLeaf(elementTypeProvider.getBug305171_CommaKeyword_1_0_2_0ElementType());
                    	    					
                    	    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_10); 

                    	    						doneLeaf(otherlv_3);
                    	    					
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1792:6: ( (lv_x_4_0= RULE_ID ) )
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1793:7: (lv_x_4_0= RULE_ID )
                    	    {
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1793:7: (lv_x_4_0= RULE_ID )
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1794:8: lv_x_4_0= RULE_ID
                    	    {

                    	    								markLeaf(elementTypeProvider.getBug305171_XIDTerminalRuleCall_1_0_2_1_0ElementType());
                    	    							
                    	    lv_x_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_43); 

                    	    								doneLeaf(lv_x_4_0);
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            // PsiInternalSimpleReconstrTestLanguage.g:1805:4: ( (otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )* )? (otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )* )? )
            // PsiInternalSimpleReconstrTestLanguage.g:1806:5: (otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )* )? (otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )* )?
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1806:5: (otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==66) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1807:6: otherlv_5= 'ky' ( (lv_y_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )*
                    {

                    						markLeaf(elementTypeProvider.getBug305171_KyKeyword_1_1_0_0ElementType());
                    					
                    otherlv_5=(Token)match(input,66,FollowSets000.FOLLOW_10); 

                    						doneLeaf(otherlv_5);
                    					
                    // PsiInternalSimpleReconstrTestLanguage.g:1814:6: ( (lv_y_6_0= RULE_ID ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:1815:7: (lv_y_6_0= RULE_ID )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:1815:7: (lv_y_6_0= RULE_ID )
                    // PsiInternalSimpleReconstrTestLanguage.g:1816:8: lv_y_6_0= RULE_ID
                    {

                    								markLeaf(elementTypeProvider.getBug305171_YIDTerminalRuleCall_1_1_0_1_0ElementType());
                    							
                    lv_y_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_44); 

                    								doneLeaf(lv_y_6_0);
                    							

                    }


                    }

                    // PsiInternalSimpleReconstrTestLanguage.g:1825:6: (otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==30) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1826:7: otherlv_7= ',' ( (lv_y_8_0= RULE_ID ) )
                    	    {

                    	    							markLeaf(elementTypeProvider.getBug305171_CommaKeyword_1_1_0_2_0ElementType());
                    	    						
                    	    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_10); 

                    	    							doneLeaf(otherlv_7);
                    	    						
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1833:7: ( (lv_y_8_0= RULE_ID ) )
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1834:8: (lv_y_8_0= RULE_ID )
                    	    {
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1834:8: (lv_y_8_0= RULE_ID )
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1835:9: lv_y_8_0= RULE_ID
                    	    {

                    	    									markLeaf(elementTypeProvider.getBug305171_YIDTerminalRuleCall_1_1_0_2_1_0ElementType());
                    	    								
                    	    lv_y_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_44); 

                    	    									doneLeaf(lv_y_8_0);
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            // PsiInternalSimpleReconstrTestLanguage.g:1846:5: (otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==67) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:1847:6: otherlv_9= 'kz' ( (lv_z_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )*
                    {

                    						markLeaf(elementTypeProvider.getBug305171_KzKeyword_1_1_1_0ElementType());
                    					
                    otherlv_9=(Token)match(input,67,FollowSets000.FOLLOW_10); 

                    						doneLeaf(otherlv_9);
                    					
                    // PsiInternalSimpleReconstrTestLanguage.g:1854:6: ( (lv_z_10_0= RULE_ID ) )
                    // PsiInternalSimpleReconstrTestLanguage.g:1855:7: (lv_z_10_0= RULE_ID )
                    {
                    // PsiInternalSimpleReconstrTestLanguage.g:1855:7: (lv_z_10_0= RULE_ID )
                    // PsiInternalSimpleReconstrTestLanguage.g:1856:8: lv_z_10_0= RULE_ID
                    {

                    								markLeaf(elementTypeProvider.getBug305171_ZIDTerminalRuleCall_1_1_1_1_0ElementType());
                    							
                    lv_z_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); 

                    								doneLeaf(lv_z_10_0);
                    							

                    }


                    }

                    // PsiInternalSimpleReconstrTestLanguage.g:1865:6: (otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==30) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1866:7: otherlv_11= ',' ( (lv_z_12_0= RULE_ID ) )
                    	    {

                    	    							markLeaf(elementTypeProvider.getBug305171_CommaKeyword_1_1_1_2_0ElementType());
                    	    						
                    	    otherlv_11=(Token)match(input,30,FollowSets000.FOLLOW_10); 

                    	    							doneLeaf(otherlv_11);
                    	    						
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1873:7: ( (lv_z_12_0= RULE_ID ) )
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1874:8: (lv_z_12_0= RULE_ID )
                    	    {
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1874:8: (lv_z_12_0= RULE_ID )
                    	    // PsiInternalSimpleReconstrTestLanguage.g:1875:9: lv_z_12_0= RULE_ID
                    	    {

                    	    									markLeaf(elementTypeProvider.getBug305171_ZIDTerminalRuleCall_1_1_1_2_1_0ElementType());
                    	    								
                    	    lv_z_12_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); 

                    	    									doneLeaf(lv_z_12_0);
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            // PsiInternalSimpleReconstrTestLanguage.g:1888:3: ( (lv_name_13_0= RULE_ID ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1889:4: (lv_name_13_0= RULE_ID )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1889:4: (lv_name_13_0= RULE_ID )
            // PsiInternalSimpleReconstrTestLanguage.g:1890:5: lv_name_13_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getBug305171_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_13_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_name_13_0);
            				

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
    // $ANTLR end "ruleBug305171"


    // $ANTLR start "entryRuleBug310435Enum"
    // PsiInternalSimpleReconstrTestLanguage.g:1903:1: entryRuleBug310435Enum : ruleBug310435Enum EOF ;
    public final void entryRuleBug310435Enum() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1903:23: ( ruleBug310435Enum EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1904:2: ruleBug310435Enum EOF
            {
             markComposite(elementTypeProvider.getBug310435EnumElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBug310435Enum();

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
    // $ANTLR end "entryRuleBug310435Enum"


    // $ANTLR start "ruleBug310435Enum"
    // PsiInternalSimpleReconstrTestLanguage.g:1909:1: ruleBug310435Enum : (otherlv_0= '#20' ( (otherlv_1= 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )* ) ;
    public final void ruleBug310435Enum() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1909:18: ( (otherlv_0= '#20' ( (otherlv_1= 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )* ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1910:2: (otherlv_0= '#20' ( (otherlv_1= 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )* )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1910:2: (otherlv_0= '#20' ( (otherlv_1= 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )* )
            // PsiInternalSimpleReconstrTestLanguage.g:1911:3: otherlv_0= '#20' ( (otherlv_1= 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )*
            {

            			markLeaf(elementTypeProvider.getBug310435Enum_NumberSignDigitTwoDigitZeroKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,68,FollowSets000.FOLLOW_46); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1918:3: ( (otherlv_1= 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )*
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==37) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==71) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==38) ) {
                    int LA39_3 = input.LA(2);

                    if ( (LA39_3==72) ) {
                        alt39=2;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:1919:4: (otherlv_1= 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1919:4: (otherlv_1= 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1920:5: otherlv_1= 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) )
            	    {

            	    					markLeaf(elementTypeProvider.getBug310435Enum_Kw1Keyword_1_0_0ElementType());
            	    				
            	    otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_47); 

            	    					doneLeaf(otherlv_1);
            	    				
            	    // PsiInternalSimpleReconstrTestLanguage.g:1927:5: ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1928:6: (lv_lits_2_0= ruleEnumBug310435Lit1 )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1928:6: (lv_lits_2_0= ruleEnumBug310435Lit1 )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1929:7: lv_lits_2_0= ruleEnumBug310435Lit1
            	    {

            	    							markComposite(elementTypeProvider.getBug310435Enum_LitsEnumBug310435Lit1EnumRuleCall_1_0_1_0ElementType());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    ruleEnumBug310435Lit1();

            	    state._fsp--;


            	    							doneComposite();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:1940:4: (otherlv_3= 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1940:4: (otherlv_3= 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1941:5: otherlv_3= 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) )
            	    {

            	    					markLeaf(elementTypeProvider.getBug310435Enum_Kw2Keyword_1_1_0ElementType());
            	    				
            	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_48); 

            	    					doneLeaf(otherlv_3);
            	    				
            	    // PsiInternalSimpleReconstrTestLanguage.g:1948:5: ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1949:6: (lv_lits_4_0= ruleEnumBug310435Lit2 )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1949:6: (lv_lits_4_0= ruleEnumBug310435Lit2 )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1950:7: lv_lits_4_0= ruleEnumBug310435Lit2
            	    {

            	    							markComposite(elementTypeProvider.getBug310435Enum_LitsEnumBug310435Lit2EnumRuleCall_1_1_1_0ElementType());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    ruleEnumBug310435Lit2();

            	    state._fsp--;


            	    							doneComposite();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


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
    // $ANTLR end "ruleBug310435Enum"


    // $ANTLR start "entryRuleBug310435Val"
    // PsiInternalSimpleReconstrTestLanguage.g:1965:1: entryRuleBug310435Val : ruleBug310435Val EOF ;
    public final void entryRuleBug310435Val() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1965:22: ( ruleBug310435Val EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:1966:2: ruleBug310435Val EOF
            {
             markComposite(elementTypeProvider.getBug310435ValElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBug310435Val();

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
    // $ANTLR end "entryRuleBug310435Val"


    // $ANTLR start "ruleBug310435Val"
    // PsiInternalSimpleReconstrTestLanguage.g:1971:1: ruleBug310435Val : (otherlv_0= '#21' ( (otherlv_1= 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )* ) ;
    public final void ruleBug310435Val() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_lits_2_0=null;
        Token otherlv_3=null;
        Token lv_lits_4_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:1971:17: ( (otherlv_0= '#21' ( (otherlv_1= 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )* ) )
            // PsiInternalSimpleReconstrTestLanguage.g:1972:2: (otherlv_0= '#21' ( (otherlv_1= 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )* )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:1972:2: (otherlv_0= '#21' ( (otherlv_1= 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )* )
            // PsiInternalSimpleReconstrTestLanguage.g:1973:3: otherlv_0= '#21' ( (otherlv_1= 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )*
            {

            			markLeaf(elementTypeProvider.getBug310435Val_NumberSignDigitTwoDigitOneKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_46); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:1980:3: ( (otherlv_1= 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==37) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_ID) ) {
                        alt40=1;
                    }


                }
                else if ( (LA40_0==38) ) {
                    int LA40_3 = input.LA(2);

                    if ( (LA40_3==RULE_STRING) ) {
                        alt40=2;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:1981:4: (otherlv_1= 'kw1' ( (lv_lits_2_0= RULE_ID ) ) )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1981:4: (otherlv_1= 'kw1' ( (lv_lits_2_0= RULE_ID ) ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1982:5: otherlv_1= 'kw1' ( (lv_lits_2_0= RULE_ID ) )
            	    {

            	    					markLeaf(elementTypeProvider.getBug310435Val_Kw1Keyword_1_0_0ElementType());
            	    				
            	    otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_10); 

            	    					doneLeaf(otherlv_1);
            	    				
            	    // PsiInternalSimpleReconstrTestLanguage.g:1989:5: ( (lv_lits_2_0= RULE_ID ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1990:6: (lv_lits_2_0= RULE_ID )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:1990:6: (lv_lits_2_0= RULE_ID )
            	    // PsiInternalSimpleReconstrTestLanguage.g:1991:7: lv_lits_2_0= RULE_ID
            	    {

            	    							markLeaf(elementTypeProvider.getBug310435Val_LitsIDTerminalRuleCall_1_0_1_0ElementType());
            	    						
            	    lv_lits_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); 

            	    							doneLeaf(lv_lits_2_0);
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:2002:4: (otherlv_3= 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:2002:4: (otherlv_3= 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:2003:5: otherlv_3= 'kw2' ( (lv_lits_4_0= RULE_STRING ) )
            	    {

            	    					markLeaf(elementTypeProvider.getBug310435Val_Kw2Keyword_1_1_0ElementType());
            	    				
            	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_9); 

            	    					doneLeaf(otherlv_3);
            	    				
            	    // PsiInternalSimpleReconstrTestLanguage.g:2010:5: ( (lv_lits_4_0= RULE_STRING ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:2011:6: (lv_lits_4_0= RULE_STRING )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:2011:6: (lv_lits_4_0= RULE_STRING )
            	    // PsiInternalSimpleReconstrTestLanguage.g:2012:7: lv_lits_4_0= RULE_STRING
            	    {

            	    							markLeaf(elementTypeProvider.getBug310435Val_LitsSTRINGTerminalRuleCall_1_1_1_0ElementType());
            	    						
            	    lv_lits_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_46); 

            	    							doneLeaf(lv_lits_4_0);
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


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
    // $ANTLR end "ruleBug310435Val"


    // $ANTLR start "entryRuleCrossRefNameTest"
    // PsiInternalSimpleReconstrTestLanguage.g:2027:1: entryRuleCrossRefNameTest : ruleCrossRefNameTest EOF ;
    public final void entryRuleCrossRefNameTest() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:2027:26: ( ruleCrossRefNameTest EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:2028:2: ruleCrossRefNameTest EOF
            {
             markComposite(elementTypeProvider.getCrossRefNameTestElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCrossRefNameTest();

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
    // $ANTLR end "entryRuleCrossRefNameTest"


    // $ANTLR start "ruleCrossRefNameTest"
    // PsiInternalSimpleReconstrTestLanguage.g:2033:1: ruleCrossRefNameTest : (otherlv_0= '#22' ( (lv_named_1_0= ruleCrossRefNamed ) )* otherlv_2= 'kw1' ( (otherlv_3= 'kw2' ( (otherlv_4= RULE_ID1 ) ) ) | (otherlv_5= 'kw3' ( (otherlv_6= RULE_ID2 ) ) ) )* ) ;
    public final void ruleCrossRefNameTest() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:2033:21: ( (otherlv_0= '#22' ( (lv_named_1_0= ruleCrossRefNamed ) )* otherlv_2= 'kw1' ( (otherlv_3= 'kw2' ( (otherlv_4= RULE_ID1 ) ) ) | (otherlv_5= 'kw3' ( (otherlv_6= RULE_ID2 ) ) ) )* ) )
            // PsiInternalSimpleReconstrTestLanguage.g:2034:2: (otherlv_0= '#22' ( (lv_named_1_0= ruleCrossRefNamed ) )* otherlv_2= 'kw1' ( (otherlv_3= 'kw2' ( (otherlv_4= RULE_ID1 ) ) ) | (otherlv_5= 'kw3' ( (otherlv_6= RULE_ID2 ) ) ) )* )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:2034:2: (otherlv_0= '#22' ( (lv_named_1_0= ruleCrossRefNamed ) )* otherlv_2= 'kw1' ( (otherlv_3= 'kw2' ( (otherlv_4= RULE_ID1 ) ) ) | (otherlv_5= 'kw3' ( (otherlv_6= RULE_ID2 ) ) ) )* )
            // PsiInternalSimpleReconstrTestLanguage.g:2035:3: otherlv_0= '#22' ( (lv_named_1_0= ruleCrossRefNamed ) )* otherlv_2= 'kw1' ( (otherlv_3= 'kw2' ( (otherlv_4= RULE_ID1 ) ) ) | (otherlv_5= 'kw3' ( (otherlv_6= RULE_ID2 ) ) ) )*
            {

            			markLeaf(elementTypeProvider.getCrossRefNameTest_NumberSignDigitTwoDigitTwoKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_49); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:2042:3: ( (lv_named_1_0= ruleCrossRefNamed ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_ID1 && LA41_0<=RULE_ID2)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:2043:4: (lv_named_1_0= ruleCrossRefNamed )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:2043:4: (lv_named_1_0= ruleCrossRefNamed )
            	    // PsiInternalSimpleReconstrTestLanguage.g:2044:5: lv_named_1_0= ruleCrossRefNamed
            	    {

            	    					markComposite(elementTypeProvider.getCrossRefNameTest_NamedCrossRefNamedParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    ruleCrossRefNamed();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getCrossRefNameTest_Kw1Keyword_2ElementType());
            		
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_50); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalSimpleReconstrTestLanguage.g:2060:3: ( (otherlv_3= 'kw2' ( (otherlv_4= RULE_ID1 ) ) ) | (otherlv_5= 'kw3' ( (otherlv_6= RULE_ID2 ) ) ) )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==38) ) {
                    int LA42_2 = input.LA(2);

                    if ( (LA42_2==RULE_ID1) ) {
                        alt42=1;
                    }


                }
                else if ( (LA42_0==41) ) {
                    int LA42_3 = input.LA(2);

                    if ( (LA42_3==RULE_ID2) ) {
                        alt42=2;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:2061:4: (otherlv_3= 'kw2' ( (otherlv_4= RULE_ID1 ) ) )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:2061:4: (otherlv_3= 'kw2' ( (otherlv_4= RULE_ID1 ) ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:2062:5: otherlv_3= 'kw2' ( (otherlv_4= RULE_ID1 ) )
            	    {

            	    					markLeaf(elementTypeProvider.getCrossRefNameTest_Kw2Keyword_3_0_0ElementType());
            	    				
            	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_51); 

            	    					doneLeaf(otherlv_3);
            	    				
            	    // PsiInternalSimpleReconstrTestLanguage.g:2069:5: ( (otherlv_4= RULE_ID1 ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:2070:6: (otherlv_4= RULE_ID1 )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:2070:6: (otherlv_4= RULE_ID1 )
            	    // PsiInternalSimpleReconstrTestLanguage.g:2071:7: otherlv_4= RULE_ID1
            	    {

            	    							markLeaf(elementTypeProvider.getCrossRefNameTest_RefCrossRefNamedCrossReference_3_0_1_0ElementType());
            	    						
            	    otherlv_4=(Token)match(input,RULE_ID1,FollowSets000.FOLLOW_50); 

            	    							doneLeaf(otherlv_4);
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSimpleReconstrTestLanguage.g:2082:4: (otherlv_5= 'kw3' ( (otherlv_6= RULE_ID2 ) ) )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:2082:4: (otherlv_5= 'kw3' ( (otherlv_6= RULE_ID2 ) ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:2083:5: otherlv_5= 'kw3' ( (otherlv_6= RULE_ID2 ) )
            	    {

            	    					markLeaf(elementTypeProvider.getCrossRefNameTest_Kw3Keyword_3_1_0ElementType());
            	    				
            	    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_52); 

            	    					doneLeaf(otherlv_5);
            	    				
            	    // PsiInternalSimpleReconstrTestLanguage.g:2090:5: ( (otherlv_6= RULE_ID2 ) )
            	    // PsiInternalSimpleReconstrTestLanguage.g:2091:6: (otherlv_6= RULE_ID2 )
            	    {
            	    // PsiInternalSimpleReconstrTestLanguage.g:2091:6: (otherlv_6= RULE_ID2 )
            	    // PsiInternalSimpleReconstrTestLanguage.g:2092:7: otherlv_6= RULE_ID2
            	    {

            	    							markLeaf(elementTypeProvider.getCrossRefNameTest_RefCrossRefNamedCrossReference_3_1_1_0ElementType());
            	    						
            	    otherlv_6=(Token)match(input,RULE_ID2,FollowSets000.FOLLOW_50); 

            	    							doneLeaf(otherlv_6);
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


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
    // $ANTLR end "ruleCrossRefNameTest"


    // $ANTLR start "entryRuleCrossRefNamed"
    // PsiInternalSimpleReconstrTestLanguage.g:2107:1: entryRuleCrossRefNamed : ruleCrossRefNamed EOF ;
    public final void entryRuleCrossRefNamed() throws RecognitionException {
        try {
            // PsiInternalSimpleReconstrTestLanguage.g:2107:23: ( ruleCrossRefNamed EOF )
            // PsiInternalSimpleReconstrTestLanguage.g:2108:2: ruleCrossRefNamed EOF
            {
             markComposite(elementTypeProvider.getCrossRefNamedElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCrossRefNamed();

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
    // $ANTLR end "entryRuleCrossRefNamed"


    // $ANTLR start "ruleCrossRefNamed"
    // PsiInternalSimpleReconstrTestLanguage.g:2113:1: ruleCrossRefNamed : ( ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) ) ) ;
    public final void ruleCrossRefNamed() throws RecognitionException {
        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:2113:18: ( ( ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:2114:2: ( ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:2114:2: ( ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) ) )
            // PsiInternalSimpleReconstrTestLanguage.g:2115:3: ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:2115:3: ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) )
            // PsiInternalSimpleReconstrTestLanguage.g:2116:4: (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:2116:4: (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID1) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID2) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // PsiInternalSimpleReconstrTestLanguage.g:2117:5: lv_name_0_1= RULE_ID1
                    {

                    					markLeaf(elementTypeProvider.getCrossRefNamed_NameID1TerminalRuleCall_0_0ElementType());
                    				
                    lv_name_0_1=(Token)match(input,RULE_ID1,FollowSets000.FOLLOW_2); 

                    					doneLeaf(lv_name_0_1);
                    				

                    }
                    break;
                case 2 :
                    // PsiInternalSimpleReconstrTestLanguage.g:2125:5: lv_name_0_2= RULE_ID2
                    {

                    					markLeaf(elementTypeProvider.getCrossRefNamed_NameID2TerminalRuleCall_0_1ElementType());
                    				
                    lv_name_0_2=(Token)match(input,RULE_ID2,FollowSets000.FOLLOW_2); 

                    					doneLeaf(lv_name_0_2);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleCrossRefNamed"


    // $ANTLR start "ruleEnumBug310435Lit1"
    // PsiInternalSimpleReconstrTestLanguage.g:2138:1: ruleEnumBug310435Lit1 : (enumLiteral_0= 'lit1' ) ;
    public final void ruleEnumBug310435Lit1() throws RecognitionException {
        Token enumLiteral_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:2138:22: ( (enumLiteral_0= 'lit1' ) )
            // PsiInternalSimpleReconstrTestLanguage.g:2139:2: (enumLiteral_0= 'lit1' )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:2139:2: (enumLiteral_0= 'lit1' )
            // PsiInternalSimpleReconstrTestLanguage.g:2140:3: enumLiteral_0= 'lit1'
            {

            			markLeaf(elementTypeProvider.getEnumBug310435Lit1_Lit1EnumLiteralDeclarationElementType());
            		
            enumLiteral_0=(Token)match(input,71,FollowSets000.FOLLOW_2); 

            			doneLeaf(enumLiteral_0);
            		

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
    // $ANTLR end "ruleEnumBug310435Lit1"


    // $ANTLR start "ruleEnumBug310435Lit2"
    // PsiInternalSimpleReconstrTestLanguage.g:2151:1: ruleEnumBug310435Lit2 : (enumLiteral_0= 'lit2' ) ;
    public final void ruleEnumBug310435Lit2() throws RecognitionException {
        Token enumLiteral_0=null;

        try {
            // PsiInternalSimpleReconstrTestLanguage.g:2151:22: ( (enumLiteral_0= 'lit2' ) )
            // PsiInternalSimpleReconstrTestLanguage.g:2152:2: (enumLiteral_0= 'lit2' )
            {
            // PsiInternalSimpleReconstrTestLanguage.g:2152:2: (enumLiteral_0= 'lit2' )
            // PsiInternalSimpleReconstrTestLanguage.g:2153:3: enumLiteral_0= 'lit2'
            {

            			markLeaf(elementTypeProvider.getEnumBug310435Lit2_Lit2EnumLiteralDeclarationElementType());
            		
            enumLiteral_0=(Token)match(input,72,FollowSets000.FOLLOW_2); 

            			doneLeaf(enumLiteral_0);
            		

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
    // $ANTLR end "ruleEnumBug310435Lit2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x3689437C92962032L,0x0000000000000071L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x3689437C92962030L,0x0000000000000071L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000010L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00001A0000000010L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000026000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000180000000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000880000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0070000000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xC000000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000010L,0x000000000000000EL});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000040000010L,0x000000000000000CL});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000010L,0x0000000000000008L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000002000000180L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000024000000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000100L});
    }


}