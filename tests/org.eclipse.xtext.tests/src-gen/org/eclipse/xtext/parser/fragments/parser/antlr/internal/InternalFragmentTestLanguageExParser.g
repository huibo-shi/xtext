/*
 * generated by Xtext
 */
parser grammar InternalFragmentTestLanguageExParser;

options {
	tokenVocab=InternalFragmentTestLanguageExLexer;
	superClass=AbstractInternalAntlrParser;
	
}

@header {
package org.eclipse.xtext.parser.fragments.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.fragments.services.FragmentTestLanguageExGrammarAccess;

}

@members {


	private FragmentTestLanguageExGrammarAccess grammarAccess;
	 	
	public InternalFragmentTestLanguageExParser(TokenStream input, FragmentTestLanguageExGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}
	
	@Override
	protected String getFirstRuleName() {
		return "ParserRuleFragmentsEx";	
	} 
	   	   	
	@Override
	protected FragmentTestLanguageExGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}
}

@rulecatch { 
	catch (RecognitionException re) { 
	    recover(input,re); 
	    appendSkippedTokens();
	}
}




// Entry rule entryRuleParserRuleFragmentsEx
entryRuleParserRuleFragmentsEx returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getParserRuleFragmentsExRule()); }
	 iv_ruleParserRuleFragmentsEx=ruleParserRuleFragmentsEx 
	 { $current=$iv_ruleParserRuleFragmentsEx.current; } 
	 EOF 
;

// Rule ParserRuleFragmentsEx
ruleParserRuleFragmentsEx returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getParserRuleFragmentsExAccess().getParserRuleFragmentsParserRuleCall()); 
    }
    this_ParserRuleFragments_0=ruleParserRuleFragments
    {
        $current = $this_ParserRuleFragments_0.current;
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleParserRuleFragments
entryRuleParserRuleFragments returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getParserRuleFragmentsRule()); }
	 iv_ruleParserRuleFragments=ruleParserRuleFragments 
	 { $current=$iv_ruleParserRuleFragments.current; } 
	 EOF 
;

// Rule ParserRuleFragments
ruleParserRuleFragments returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getParserRuleFragmentsAccess().getParserRuleFragmentsAction_0(),
            $current);
    }
)((
	otherlv_1=NumberSignDigitOne
    {
    	newLeafNode(otherlv_1, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitOneKeyword_1_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedParserRuleCall_1_0_1_0()); 
	    }
		lv_element_2_0=rulePRFNamed		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_2_0, 
        		"org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamed");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
	otherlv_3=NumberSignDigitTwo
    {
    	newLeafNode(otherlv_3, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitTwoKeyword_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedParserRuleCall_1_1_1_0()); 
	    }
		lv_element_4_0=rulePRFNamed		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_4_0, 
        		"org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamed");
	        afterParserOrEnumRuleCall();
	    }

)
)
	otherlv_5=HyphenMinusGreaterThanSign
    {
    	newLeafNode(otherlv_5, grammarAccess.getParserRuleFragmentsAccess().getHyphenMinusGreaterThanSignKeyword_1_1_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParserRuleFragmentsRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getParserRuleFragmentsAccess().getRefPRFNamedCrossReference_1_1_3_0()); 
	}

)
))
    |(
	otherlv_7=NumberSignDigitThree
    {
    	newLeafNode(otherlv_7, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitThreeKeyword_1_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedRefFirstParserRuleCall_1_2_1_0()); 
	    }
		lv_element_8_0=rulePRFNamedRefFirst		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_8_0, 
        		"org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamedRefFirst");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
	otherlv_9=NumberSignDigitFour
    {
    	newLeafNode(otherlv_9, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitFourKeyword_1_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedWithActionParserRuleCall_1_3_1_0()); 
	    }
		lv_element_10_0=rulePRFNamedWithAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_10_0, 
        		"org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamedWithAction");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
	otherlv_11=NumberSignDigitEight
    {
    	newLeafNode(otherlv_11, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitEightKeyword_1_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedWithFQNParserRuleCall_1_4_1_0()); 
	    }
		lv_element_12_0=rulePRFNamedWithFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_12_0, 
        		"org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamedWithFQN");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
	otherlv_13=NumberSignDigitNine
    {
    	newLeafNode(otherlv_13, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitNineKeyword_1_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFWithPredicateParserRuleCall_1_5_1_0()); 
	    }
		lv_element_14_0=rulePRFWithPredicate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_14_0, 
        		"org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFWithPredicate");
	        afterParserOrEnumRuleCall();
	    }

)
))))
;





// Entry rule entryRulePRFNamed
entryRulePRFNamed returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getPRFNamedRule()); }
	 iv_rulePRFNamed=rulePRFNamed 
	 { $current=$iv_rulePRFNamed.current; } 
	 EOF 
;

// Rule PRFNamed
rulePRFNamed returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
		if ($current==null) {
			$current = createModelElement(grammarAccess.getPRFNamedRule());
		}
        newCompositeNode(grammarAccess.getPRFNamedAccess().getPRFNamedFragmentParserRuleCall_0()); 
    }
    this_PRFNamedFragment_0=rulePRFNamedFragment[$current]
    {
        $current = $this_PRFNamedFragment_0.current;
        afterParserOrEnumRuleCall();
    }
((
	otherlv_1=Colon
    {
    	newLeafNode(otherlv_1, grammarAccess.getPRFNamedAccess().getColonKeyword_1_0_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPRFNamedRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getPRFNamedAccess().getRefPRFNamedCrossReference_1_0_1_0()); 
	}

)
))
    |(
	otherlv_3=HyphenMinus
    {
    	newLeafNode(otherlv_3, grammarAccess.getPRFNamedAccess().getHyphenMinusKeyword_1_1_0());
    }

    { 
		if ($current==null) {
			$current = createModelElement(grammarAccess.getPRFNamedRule());
		}
        newCompositeNode(grammarAccess.getPRFNamedAccess().getPRFNamedRefParserRuleCall_1_1_1()); 
    }
    this_PRFNamedRef_4=rulePRFNamedRef[$current]
    {
        $current = $this_PRFNamedRef_4.current;
        afterParserOrEnumRuleCall();
    }
))?)
;





// Entry rule entryRulePRFNamedRefFirst
entryRulePRFNamedRefFirst returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getPRFNamedRefFirstRule()); }
	 iv_rulePRFNamedRefFirst=rulePRFNamedRefFirst 
	 { $current=$iv_rulePRFNamedRefFirst.current; } 
	 EOF 
;

// Rule PRFNamedRefFirst
rulePRFNamedRefFirst returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPRFNamedRefFirstRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getPRFNamedRefFirstAccess().getRefPRFNamedCrossReference_0_0()); 
	}

)
)
	otherlv_1=LessThanSignHyphenMinus
    {
    	newLeafNode(otherlv_1, grammarAccess.getPRFNamedRefFirstAccess().getLessThanSignHyphenMinusKeyword_1());
    }

    { 
		if ($current==null) {
			$current = createModelElement(grammarAccess.getPRFNamedRefFirstRule());
		}
        newCompositeNode(grammarAccess.getPRFNamedRefFirstAccess().getPRFNamedFragmentParserRuleCall_2()); 
    }
    this_PRFNamedFragment_2=rulePRFNamedFragment[$current]
    {
        $current = $this_PRFNamedFragment_2.current;
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRulePRFNamedWithAction
entryRulePRFNamedWithAction returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getPRFNamedWithActionRule()); }
	 iv_rulePRFNamedWithAction=rulePRFNamedWithAction 
	 { $current=$iv_rulePRFNamedWithAction.current; } 
	 EOF 
;

// Rule PRFNamedWithAction
rulePRFNamedWithAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPRFNamedWithActionAccess().getPRFNamedParserRuleCall_0()); 
    }
    this_PRFNamed_0=rulePRFNamed
    {
        $current = $this_PRFNamed_0.current;
        afterParserOrEnumRuleCall();
    }
(
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getPRFNamedWithActionAccess().getPRFNamedWithActionPrevAction_1(),
            $current);
    }
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getPRFNamedWithActionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPRFNamedWithActionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPRFNamedWithActionRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getPRFNamedWithActionAccess().getRefPRFNamedCrossReference_3_0_0()); 
	}

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPRFNamedWithActionRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getPRFNamedWithActionAccess().getRef2PRFNamedCrossReference_3_1_0()); 
	}

)
))?)
;





// Entry rule entryRulePRFNamedWithFQN
entryRulePRFNamedWithFQN returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getPRFNamedWithFQNRule()); }
	 iv_rulePRFNamedWithFQN=rulePRFNamedWithFQN 
	 { $current=$iv_rulePRFNamedWithFQN.current; } 
	 EOF 
;

// Rule PRFNamedWithFQN
rulePRFNamedWithFQN returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getPRFNamedWithFQNAccess().getNameFQNParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPRFNamedWithFQNRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"org.eclipse.xtext.parser.fragments.FragmentTestLanguage.FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_1=HyphenMinus
    {
    	newLeafNode(otherlv_1, grammarAccess.getPRFNamedWithFQNAccess().getHyphenMinusKeyword_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPRFNamedWithFQNRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getPRFNamedWithFQNAccess().getRefPRFNamedCrossReference_1_1_0()); 
	    }
		ruleFQN2
		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRulePRFWithPredicate
entryRulePRFWithPredicate returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getPRFWithPredicateRule()); }
	 iv_rulePRFWithPredicate=rulePRFWithPredicate 
	 { $current=$iv_rulePRFWithPredicate.current; } 
	 EOF 
;

// Rule PRFWithPredicate
rulePRFWithPredicate returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
		if ($current==null) {
			$current = createModelElement(grammarAccess.getPRFWithPredicateRule());
		}
        newCompositeNode(grammarAccess.getPRFWithPredicateAccess().getPRFNamedFragmentParserRuleCall_0()); 
    }
    this_PRFNamedFragment_0=rulePRFNamedFragment[$current]
    {
        $current = $this_PRFNamedFragment_0.current;
        afterParserOrEnumRuleCall();
    }
(((
HyphenMinus
rulePRFNamedRef[null]))=>(
	otherlv_1=HyphenMinus
    {
    	newLeafNode(otherlv_1, grammarAccess.getPRFWithPredicateAccess().getHyphenMinusKeyword_1_0_0());
    }

    { 
		if ($current==null) {
			$current = createModelElement(grammarAccess.getPRFWithPredicateRule());
		}
        newCompositeNode(grammarAccess.getPRFWithPredicateAccess().getPRFNamedRefParserRuleCall_1_0_1()); 
    }
    this_PRFNamedRef_2=rulePRFNamedRef[$current]
    {
        $current = $this_PRFNamedRef_2.current;
        afterParserOrEnumRuleCall();
    }
))?)
;





// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getFQNRule()); } 
	 iv_ruleFQN=ruleFQN 
	 { $current=$iv_ruleFQN.current.getText(); }  
	 EOF 
;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
    }
(
    { 
        newCompositeNode(grammarAccess.getFQNAccess().getSuffixParserRuleCall_1()); 
    }
    this_Suffix_1=ruleSuffix    {
		$current.merge(this_Suffix_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)?)
    ;





// Entry rule entryRuleFQN2
entryRuleFQN2 returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getFQN2Rule()); } 
	 iv_ruleFQN2=ruleFQN2 
	 { $current=$iv_ruleFQN2.current.getText(); }  
	 EOF 
;

// Rule FQN2
ruleFQN2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getFQN2Access().getIDTerminalRuleCall_0()); 
    }
(
    { 
        newCompositeNode(grammarAccess.getFQN2Access().getSuffix2ParserRuleCall_1()); 
    }
    this_Suffix2_1=ruleSuffix2    {
		$current.merge(this_Suffix2_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;






// Rule Suffix
ruleSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
	kw=FullStop 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSuffixAccess().getFullStopKeyword_0()); 
    }
    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getSuffixAccess().getIDTerminalRuleCall_1()); 
    }
(
    { 
        newCompositeNode(grammarAccess.getSuffixAccess().getSuffixParserRuleCall_2()); 
    }
    this_Suffix_2=ruleSuffix    {
		$current.merge(this_Suffix_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)?)
    ;






// Rule Suffix2
ruleSuffix2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
	kw=FullStop 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSuffix2Access().getFullStopKeyword_0()); 
    }
    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getSuffix2Access().getIDTerminalRuleCall_1()); 
    }
)
    ;






// Rule PRFNamedFragment
rulePRFNamedFragment [EObject in_current] returns [EObject current=in_current] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getPRFNamedFragmentAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPRFNamedFragmentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)
;






// Rule PRFNamedRef
rulePRFNamedRef [EObject in_current] returns [EObject current=in_current] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPRFNamedRefRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getPRFNamedRefAccess().getRefPRFNamedCrossReference_0()); 
	}

)
)
;





