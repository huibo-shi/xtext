package org.eclipse.xtext.web.example.statemachine.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.web.example.statemachine.services.StatemachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalStatemachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'signal'", "'input'", "'output'", "'state'", "'end'", "'if'", "'goto'", "'and'", "'=='", "'set'", "'='"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalStatemachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStatemachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStatemachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStatemachine.g"; }



     	private StatemachineGrammarAccess grammarAccess;

        public InternalStatemachineParser(TokenStream input, StatemachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Statemachine";
       	}

       	@Override
       	protected StatemachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStatemachine"
    // InternalStatemachine.g:67:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // InternalStatemachine.g:67:53: (iv_ruleStatemachine= ruleStatemachine EOF )
            // InternalStatemachine.g:68:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // InternalStatemachine.g:74:1: ruleStatemachine returns [EObject current=null] : ( () ( (lv_signals_1_0= ruleSignal ) )* ( (lv_states_2_0= ruleState ) )* ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_1_0 = null;

        EObject lv_states_2_0 = null;



        	enterRule();

        try {
            // InternalStatemachine.g:80:2: ( ( () ( (lv_signals_1_0= ruleSignal ) )* ( (lv_states_2_0= ruleState ) )* ) )
            // InternalStatemachine.g:81:2: ( () ( (lv_signals_1_0= ruleSignal ) )* ( (lv_states_2_0= ruleState ) )* )
            {
            // InternalStatemachine.g:81:2: ( () ( (lv_signals_1_0= ruleSignal ) )* ( (lv_states_2_0= ruleState ) )* )
            // InternalStatemachine.g:82:3: () ( (lv_signals_1_0= ruleSignal ) )* ( (lv_states_2_0= ruleState ) )*
            {
            // InternalStatemachine.g:82:3: ()
            // InternalStatemachine.g:83:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
            					current);
            			

            }

            // InternalStatemachine.g:89:3: ( (lv_signals_1_0= ruleSignal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStatemachine.g:90:4: (lv_signals_1_0= ruleSignal )
            	    {
            	    // InternalStatemachine.g:90:4: (lv_signals_1_0= ruleSignal )
            	    // InternalStatemachine.g:91:5: lv_signals_1_0= ruleSignal
            	    {

            	    					newCompositeNode(grammarAccess.getStatemachineAccess().getSignalsSignalParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_signals_1_0=ruleSignal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"signals",
            	    						lv_signals_1_0,
            	    						"org.eclipse.xtext.web.example.statemachine.Statemachine.Signal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalStatemachine.g:108:3: ( (lv_states_2_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStatemachine.g:109:4: (lv_states_2_0= ruleState )
            	    {
            	    // InternalStatemachine.g:109:4: (lv_states_2_0= ruleState )
            	    // InternalStatemachine.g:110:5: lv_states_2_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_states_2_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_2_0,
            	    						"org.eclipse.xtext.web.example.statemachine.Statemachine.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleSignal"
    // InternalStatemachine.g:131:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalStatemachine.g:131:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalStatemachine.g:132:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalStatemachine.g:138:1: ruleSignal returns [EObject current=null] : ( (this_InputSignal_0= ruleInputSignal | this_OutputSignal_1= ruleOutputSignal ) otherlv_2= 'signal' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject this_InputSignal_0 = null;

        EObject this_OutputSignal_1 = null;



        	enterRule();

        try {
            // InternalStatemachine.g:144:2: ( ( (this_InputSignal_0= ruleInputSignal | this_OutputSignal_1= ruleOutputSignal ) otherlv_2= 'signal' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalStatemachine.g:145:2: ( (this_InputSignal_0= ruleInputSignal | this_OutputSignal_1= ruleOutputSignal ) otherlv_2= 'signal' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalStatemachine.g:145:2: ( (this_InputSignal_0= ruleInputSignal | this_OutputSignal_1= ruleOutputSignal ) otherlv_2= 'signal' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalStatemachine.g:146:3: (this_InputSignal_0= ruleInputSignal | this_OutputSignal_1= ruleOutputSignal ) otherlv_2= 'signal' ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalStatemachine.g:146:3: (this_InputSignal_0= ruleInputSignal | this_OutputSignal_1= ruleOutputSignal )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStatemachine.g:147:4: this_InputSignal_0= ruleInputSignal
                    {

                    				newCompositeNode(grammarAccess.getSignalAccess().getInputSignalParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_InputSignal_0=ruleInputSignal();

                    state._fsp--;


                    				current = this_InputSignal_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalStatemachine.g:156:4: this_OutputSignal_1= ruleOutputSignal
                    {

                    				newCompositeNode(grammarAccess.getSignalAccess().getOutputSignalParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_OutputSignal_1=ruleOutputSignal();

                    state._fsp--;


                    				current = this_OutputSignal_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSignalAccess().getSignalKeyword_1());
            		
            // InternalStatemachine.g:169:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalStatemachine.g:170:4: (lv_name_3_0= RULE_ID )
            {
            // InternalStatemachine.g:170:4: (lv_name_3_0= RULE_ID )
            // InternalStatemachine.g:171:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleInputSignal"
    // InternalStatemachine.g:191:1: entryRuleInputSignal returns [EObject current=null] : iv_ruleInputSignal= ruleInputSignal EOF ;
    public final EObject entryRuleInputSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputSignal = null;


        try {
            // InternalStatemachine.g:191:52: (iv_ruleInputSignal= ruleInputSignal EOF )
            // InternalStatemachine.g:192:2: iv_ruleInputSignal= ruleInputSignal EOF
            {
             newCompositeNode(grammarAccess.getInputSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputSignal=ruleInputSignal();

            state._fsp--;

             current =iv_ruleInputSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputSignal"


    // $ANTLR start "ruleInputSignal"
    // InternalStatemachine.g:198:1: ruleInputSignal returns [EObject current=null] : ( () otherlv_1= 'input' ) ;
    public final EObject ruleInputSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalStatemachine.g:204:2: ( ( () otherlv_1= 'input' ) )
            // InternalStatemachine.g:205:2: ( () otherlv_1= 'input' )
            {
            // InternalStatemachine.g:205:2: ( () otherlv_1= 'input' )
            // InternalStatemachine.g:206:3: () otherlv_1= 'input'
            {
            // InternalStatemachine.g:206:3: ()
            // InternalStatemachine.g:207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputSignalAccess().getInputSignalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInputSignalAccess().getInputKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputSignal"


    // $ANTLR start "entryRuleOutputSignal"
    // InternalStatemachine.g:221:1: entryRuleOutputSignal returns [EObject current=null] : iv_ruleOutputSignal= ruleOutputSignal EOF ;
    public final EObject entryRuleOutputSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputSignal = null;


        try {
            // InternalStatemachine.g:221:53: (iv_ruleOutputSignal= ruleOutputSignal EOF )
            // InternalStatemachine.g:222:2: iv_ruleOutputSignal= ruleOutputSignal EOF
            {
             newCompositeNode(grammarAccess.getOutputSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputSignal=ruleOutputSignal();

            state._fsp--;

             current =iv_ruleOutputSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputSignal"


    // $ANTLR start "ruleOutputSignal"
    // InternalStatemachine.g:228:1: ruleOutputSignal returns [EObject current=null] : ( () otherlv_1= 'output' ) ;
    public final EObject ruleOutputSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalStatemachine.g:234:2: ( ( () otherlv_1= 'output' ) )
            // InternalStatemachine.g:235:2: ( () otherlv_1= 'output' )
            {
            // InternalStatemachine.g:235:2: ( () otherlv_1= 'output' )
            // InternalStatemachine.g:236:3: () otherlv_1= 'output'
            {
            // InternalStatemachine.g:236:3: ()
            // InternalStatemachine.g:237:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputSignalAccess().getOutputSignalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputSignalAccess().getOutputKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputSignal"


    // $ANTLR start "entryRuleState"
    // InternalStatemachine.g:251:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStatemachine.g:251:46: (iv_ruleState= ruleState EOF )
            // InternalStatemachine.g:252:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStatemachine.g:258:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_commands_2_0= ruleCommand ) )* ( (lv_transitions_3_0= ruleTransition ) )* otherlv_4= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_commands_2_0 = null;

        EObject lv_transitions_3_0 = null;



        	enterRule();

        try {
            // InternalStatemachine.g:264:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_commands_2_0= ruleCommand ) )* ( (lv_transitions_3_0= ruleTransition ) )* otherlv_4= 'end' ) )
            // InternalStatemachine.g:265:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_commands_2_0= ruleCommand ) )* ( (lv_transitions_3_0= ruleTransition ) )* otherlv_4= 'end' )
            {
            // InternalStatemachine.g:265:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_commands_2_0= ruleCommand ) )* ( (lv_transitions_3_0= ruleTransition ) )* otherlv_4= 'end' )
            // InternalStatemachine.g:266:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_commands_2_0= ruleCommand ) )* ( (lv_transitions_3_0= ruleTransition ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStatemachine.g:270:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStatemachine.g:271:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStatemachine.g:271:4: (lv_name_1_0= RULE_ID )
            // InternalStatemachine.g:272:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStatemachine.g:288:3: ( (lv_commands_2_0= ruleCommand ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStatemachine.g:289:4: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalStatemachine.g:289:4: (lv_commands_2_0= ruleCommand )
            	    // InternalStatemachine.g:290:5: lv_commands_2_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getCommandsCommandParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_2_0,
            	    						"org.eclipse.xtext.web.example.statemachine.Statemachine.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalStatemachine.g:307:3: ( (lv_transitions_3_0= ruleTransition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStatemachine.g:308:4: (lv_transitions_3_0= ruleTransition )
            	    {
            	    // InternalStatemachine.g:308:4: (lv_transitions_3_0= ruleTransition )
            	    // InternalStatemachine.g:309:5: lv_transitions_3_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_transitions_3_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_3_0,
            	    						"org.eclipse.xtext.web.example.statemachine.Statemachine.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStatemachine.g:334:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStatemachine.g:334:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStatemachine.g:335:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStatemachine.g:341:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_condition_1_0 = null;



        	enterRule();

        try {
            // InternalStatemachine.g:347:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalStatemachine.g:348:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalStatemachine.g:348:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) )
            // InternalStatemachine.g:349:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getIfKeyword_0());
            		
            // InternalStatemachine.g:353:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalStatemachine.g:354:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalStatemachine.g:354:4: (lv_condition_1_0= ruleCondition )
            // InternalStatemachine.g:355:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.xtext.web.example.statemachine.Statemachine.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getGotoKeyword_2());
            		
            // InternalStatemachine.g:376:3: ( (otherlv_3= RULE_ID ) )
            // InternalStatemachine.g:377:4: (otherlv_3= RULE_ID )
            {
            // InternalStatemachine.g:377:4: (otherlv_3= RULE_ID )
            // InternalStatemachine.g:378:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleCondition"
    // InternalStatemachine.g:393:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalStatemachine.g:393:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalStatemachine.g:394:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalStatemachine.g:400:1: ruleCondition returns [EObject current=null] : ( ( (lv_events_0_0= ruleEvent ) ) (otherlv_1= 'and' ( (lv_events_2_0= ruleEvent ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_events_0_0 = null;

        EObject lv_events_2_0 = null;



        	enterRule();

        try {
            // InternalStatemachine.g:406:2: ( ( ( (lv_events_0_0= ruleEvent ) ) (otherlv_1= 'and' ( (lv_events_2_0= ruleEvent ) ) )* ) )
            // InternalStatemachine.g:407:2: ( ( (lv_events_0_0= ruleEvent ) ) (otherlv_1= 'and' ( (lv_events_2_0= ruleEvent ) ) )* )
            {
            // InternalStatemachine.g:407:2: ( ( (lv_events_0_0= ruleEvent ) ) (otherlv_1= 'and' ( (lv_events_2_0= ruleEvent ) ) )* )
            // InternalStatemachine.g:408:3: ( (lv_events_0_0= ruleEvent ) ) (otherlv_1= 'and' ( (lv_events_2_0= ruleEvent ) ) )*
            {
            // InternalStatemachine.g:408:3: ( (lv_events_0_0= ruleEvent ) )
            // InternalStatemachine.g:409:4: (lv_events_0_0= ruleEvent )
            {
            // InternalStatemachine.g:409:4: (lv_events_0_0= ruleEvent )
            // InternalStatemachine.g:410:5: lv_events_0_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getEventsEventParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_events_0_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					add(
            						current,
            						"events",
            						lv_events_0_0,
            						"org.eclipse.xtext.web.example.statemachine.Statemachine.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStatemachine.g:427:3: (otherlv_1= 'and' ( (lv_events_2_0= ruleEvent ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStatemachine.g:428:4: otherlv_1= 'and' ( (lv_events_2_0= ruleEvent ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getAndKeyword_1_0());
            	    			
            	    // InternalStatemachine.g:432:4: ( (lv_events_2_0= ruleEvent ) )
            	    // InternalStatemachine.g:433:5: (lv_events_2_0= ruleEvent )
            	    {
            	    // InternalStatemachine.g:433:5: (lv_events_2_0= ruleEvent )
            	    // InternalStatemachine.g:434:6: lv_events_2_0= ruleEvent
            	    {

            	    						newCompositeNode(grammarAccess.getConditionAccess().getEventsEventParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_events_2_0=ruleEvent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"events",
            	    							lv_events_2_0,
            	    							"org.eclipse.xtext.web.example.statemachine.Statemachine.Event");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEvent"
    // InternalStatemachine.g:456:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStatemachine.g:456:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStatemachine.g:457:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalStatemachine.g:463:1: ruleEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '==' ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalStatemachine.g:469:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '==' ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // InternalStatemachine.g:470:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '==' ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // InternalStatemachine.g:470:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '==' ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // InternalStatemachine.g:471:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '==' ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            // InternalStatemachine.g:471:3: ( (otherlv_0= RULE_ID ) )
            // InternalStatemachine.g:472:4: (otherlv_0= RULE_ID )
            {
            // InternalStatemachine.g:472:4: (otherlv_0= RULE_ID )
            // InternalStatemachine.g:473:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getEventAccess().getSignalSignalCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalStatemachine.g:488:3: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // InternalStatemachine.g:489:4: (lv_value_2_0= RULE_BOOLEAN )
            {
            // InternalStatemachine.g:489:4: (lv_value_2_0= RULE_BOOLEAN )
            // InternalStatemachine.g:490:5: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getEventAccess().getValueBOOLEANTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.web.example.statemachine.Statemachine.BOOLEAN");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCommand"
    // InternalStatemachine.g:510:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalStatemachine.g:510:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalStatemachine.g:511:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalStatemachine.g:517:1: ruleCommand returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_newValue_3_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_newValue_3_0=null;


        	enterRule();

        try {
            // InternalStatemachine.g:523:2: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_newValue_3_0= RULE_BOOLEAN ) ) ) )
            // InternalStatemachine.g:524:2: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_newValue_3_0= RULE_BOOLEAN ) ) )
            {
            // InternalStatemachine.g:524:2: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_newValue_3_0= RULE_BOOLEAN ) ) )
            // InternalStatemachine.g:525:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_newValue_3_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getSetKeyword_0());
            		
            // InternalStatemachine.g:529:3: ( (otherlv_1= RULE_ID ) )
            // InternalStatemachine.g:530:4: (otherlv_1= RULE_ID )
            {
            // InternalStatemachine.g:530:4: (otherlv_1= RULE_ID )
            // InternalStatemachine.g:531:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getSignalSignalCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getEqualsSignKeyword_2());
            		
            // InternalStatemachine.g:546:3: ( (lv_newValue_3_0= RULE_BOOLEAN ) )
            // InternalStatemachine.g:547:4: (lv_newValue_3_0= RULE_BOOLEAN )
            {
            // InternalStatemachine.g:547:4: (lv_newValue_3_0= RULE_BOOLEAN )
            // InternalStatemachine.g:548:5: lv_newValue_3_0= RULE_BOOLEAN
            {
            lv_newValue_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            					newLeafNode(lv_newValue_3_0, grammarAccess.getCommandAccess().getNewValueBOOLEANTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newValue",
            						lv_newValue_3_0,
            						"org.eclipse.xtext.web.example.statemachine.Statemachine.BOOLEAN");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000230000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});

}