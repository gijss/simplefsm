/*
* generated by Xtext
*/
grammar InternalSfsm;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package be.kuleuven.learning.simplefsm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package be.kuleuven.learning.simplefsm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import be.kuleuven.learning.simplefsm.services.SfsmGrammarAccess;

}

@parser::members {

 	private SfsmGrammarAccess grammarAccess;
 	
    public InternalSfsmParser(TokenStream input, SfsmGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "SimpleFiniteStateMachine";	
   	}
   	
   	@Override
   	protected SfsmGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSimpleFiniteStateMachine
entryRuleSimpleFiniteStateMachine returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSimpleFiniteStateMachineRule()); }
	 iv_ruleSimpleFiniteStateMachine=ruleSimpleFiniteStateMachine 
	 { $current=$iv_ruleSimpleFiniteStateMachine.current; } 
	 EOF 
;

// Rule SimpleFiniteStateMachine
ruleSimpleFiniteStateMachine returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='sfsm' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSimpleFiniteStateMachineAccess().getSfsmKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSimpleFiniteStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSimpleFiniteStateMachineRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSimpleFiniteStateMachineAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='initial' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSimpleFiniteStateMachineAccess().getInitialKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSimpleFiniteStateMachineAccess().getStatesStateParserRuleCall_4_0()); 
	    }
		lv_states_4_0=ruleState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSimpleFiniteStateMachineRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_4_0, 
        		"State");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSimpleFiniteStateMachineAccess().getStatesStateParserRuleCall_5_0()); 
	    }
		lv_states_5_0=ruleState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSimpleFiniteStateMachineRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_5_0, 
        		"State");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSimpleFiniteStateMachineAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleState
entryRuleState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	 iv_ruleState=ruleState 
	 { $current=$iv_ruleState.current; } 
	 EOF 
;

// Rule State
ruleState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='state' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='action' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionKeyword_3());
    }
(
(
		lv_action_4_0=RULE_STRING
		{
			newLeafNode(lv_action_4_0, grammarAccess.getStateAccess().getActionSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"action",
        		lv_action_4_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_5_0()); 
	    }
		lv_outgoingTransitions_5_0=ruleTransition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		add(
       			$current, 
       			"outgoingTransitions",
        		lv_outgoingTransitions_5_0, 
        		"Transition");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	 iv_ruleTransition=ruleTransition 
	 { $current=$iv_ruleTransition.current; } 
	 EOF 
;

// Rule Transition
ruleTransition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='event' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventKeyword_0());
    }
(
(
		lv_event_1_0=RULE_STRING
		{
			newLeafNode(lv_event_1_0, grammarAccess.getTransitionAccess().getEventSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"event",
        		lv_event_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='goto' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getGotoKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0()); 
	}

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


