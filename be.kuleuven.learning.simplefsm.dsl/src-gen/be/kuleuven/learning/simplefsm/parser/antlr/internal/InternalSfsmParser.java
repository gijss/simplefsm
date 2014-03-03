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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSfsmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sfsm'", "'{'", "'initial'", "'}'", "'state'", "'action'", "'event'", "'gotos'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSfsmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSfsmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSfsmParser.tokenNames; }
    public String getGrammarFileName() { return "../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g"; }



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



    // $ANTLR start "entryRuleSimpleFiniteStateMachine"
    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:67:1: entryRuleSimpleFiniteStateMachine returns [EObject current=null] : iv_ruleSimpleFiniteStateMachine= ruleSimpleFiniteStateMachine EOF ;
    public final EObject entryRuleSimpleFiniteStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFiniteStateMachine = null;


        try {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:68:2: (iv_ruleSimpleFiniteStateMachine= ruleSimpleFiniteStateMachine EOF )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:69:2: iv_ruleSimpleFiniteStateMachine= ruleSimpleFiniteStateMachine EOF
            {
             newCompositeNode(grammarAccess.getSimpleFiniteStateMachineRule()); 
            pushFollow(FOLLOW_ruleSimpleFiniteStateMachine_in_entryRuleSimpleFiniteStateMachine75);
            iv_ruleSimpleFiniteStateMachine=ruleSimpleFiniteStateMachine();

            state._fsp--;

             current =iv_ruleSimpleFiniteStateMachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFiniteStateMachine85); 

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
    // $ANTLR end "entryRuleSimpleFiniteStateMachine"


    // $ANTLR start "ruleSimpleFiniteStateMachine"
    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:76:1: ruleSimpleFiniteStateMachine returns [EObject current=null] : (otherlv_0= 'sfsm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'initial' ( (lv_initialState_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' ) ;
    public final EObject ruleSimpleFiniteStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_initialState_4_0 = null;

        EObject lv_states_5_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:79:28: ( (otherlv_0= 'sfsm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'initial' ( (lv_initialState_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' ) )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:80:1: (otherlv_0= 'sfsm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'initial' ( (lv_initialState_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:80:1: (otherlv_0= 'sfsm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'initial' ( (lv_initialState_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:80:3: otherlv_0= 'sfsm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'initial' ( (lv_initialState_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSimpleFiniteStateMachine122); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleFiniteStateMachineAccess().getSfsmKeyword_0());
                
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:85:1: (lv_name_1_0= RULE_ID )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleFiniteStateMachine139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimpleFiniteStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleFiniteStateMachineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSimpleFiniteStateMachine156); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleFiniteStateMachineAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSimpleFiniteStateMachine168); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleFiniteStateMachineAccess().getInitialKeyword_3());
                
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:110:1: ( (lv_initialState_4_0= ruleState ) )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:111:1: (lv_initialState_4_0= ruleState )
            {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:111:1: (lv_initialState_4_0= ruleState )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:112:3: lv_initialState_4_0= ruleState
            {
             
            	        newCompositeNode(grammarAccess.getSimpleFiniteStateMachineAccess().getInitialStateStateParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleState_in_ruleSimpleFiniteStateMachine189);
            lv_initialState_4_0=ruleState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleFiniteStateMachineRule());
            	        }
                   		set(
                   			current, 
                   			"initialState",
                    		lv_initialState_4_0, 
                    		"State");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:128:2: ( (lv_states_5_0= ruleState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:129:1: (lv_states_5_0= ruleState )
            	    {
            	    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:129:1: (lv_states_5_0= ruleState )
            	    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:130:3: lv_states_5_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimpleFiniteStateMachineAccess().getStatesStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleSimpleFiniteStateMachine210);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimpleFiniteStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_5_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSimpleFiniteStateMachine223); 

                	newLeafNode(otherlv_6, grammarAccess.getSimpleFiniteStateMachineAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSimpleFiniteStateMachine"


    // $ANTLR start "entryRuleState"
    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:158:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:159:2: (iv_ruleState= ruleState EOF )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:160:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState259);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState269); 

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
    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:167:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'action' this_STRING_4= RULE_STRING ( (lv_outgoingTransitions_5_0= ruleTransition ) )* otherlv_6= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_6=null;
        EObject lv_outgoingTransitions_5_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:170:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'action' this_STRING_4= RULE_STRING ( (lv_outgoingTransitions_5_0= ruleTransition ) )* otherlv_6= '}' ) )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:171:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'action' this_STRING_4= RULE_STRING ( (lv_outgoingTransitions_5_0= ruleTransition ) )* otherlv_6= '}' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:171:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'action' this_STRING_4= RULE_STRING ( (lv_outgoingTransitions_5_0= ruleTransition ) )* otherlv_6= '}' )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:171:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'action' this_STRING_4= RULE_STRING ( (lv_outgoingTransitions_5_0= ruleTransition ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleState306); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:175:1: ( (lv_name_1_0= RULE_ID ) )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:176:1: (lv_name_1_0= RULE_ID )
            {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:176:1: (lv_name_1_0= RULE_ID )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:177:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState323); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleState340); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleState352); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionKeyword_3());
                
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState363); 
             
                newLeafNode(this_STRING_4, grammarAccess.getStateAccess().getSTRINGTerminalRuleCall_4()); 
                
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:205:1: ( (lv_outgoingTransitions_5_0= ruleTransition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:206:1: (lv_outgoingTransitions_5_0= ruleTransition )
            	    {
            	    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:206:1: (lv_outgoingTransitions_5_0= ruleTransition )
            	    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:207:3: lv_outgoingTransitions_5_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState383);
            	    lv_outgoingTransitions_5_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"outgoingTransitions",
            	            		lv_outgoingTransitions_5_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleState396); 

                	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:235:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:236:2: (iv_ruleTransition= ruleTransition EOF )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:237:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition432);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition442); 

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
    // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:244:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'event' ( (lv_event_1_0= RULE_STRING ) ) otherlv_2= 'gotos' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_event_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:247:28: ( (otherlv_0= 'event' ( (lv_event_1_0= RULE_STRING ) ) otherlv_2= 'gotos' ( (otherlv_3= RULE_ID ) ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:248:1: (otherlv_0= 'event' ( (lv_event_1_0= RULE_STRING ) ) otherlv_2= 'gotos' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:248:1: (otherlv_0= 'event' ( (lv_event_1_0= RULE_STRING ) ) otherlv_2= 'gotos' ( (otherlv_3= RULE_ID ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:248:3: otherlv_0= 'event' ( (lv_event_1_0= RULE_STRING ) ) otherlv_2= 'gotos' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTransition479); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventKeyword_0());
                
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:252:1: ( (lv_event_1_0= RULE_STRING ) )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:253:1: (lv_event_1_0= RULE_STRING )
            {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:253:1: (lv_event_1_0= RULE_STRING )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:254:3: lv_event_1_0= RULE_STRING
            {
            lv_event_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransition496); 

            			newLeafNode(lv_event_1_0, grammarAccess.getTransitionAccess().getEventSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"event",
                    		lv_event_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleTransition513); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getGotosKeyword_2());
                
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:274:1: ( (otherlv_3= RULE_ID ) )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:275:1: (otherlv_3= RULE_ID )
            {
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:275:1: (otherlv_3= RULE_ID )
            // ../be.kuleuven.learning.simplefsm.dsl/src-gen/be/kuleuven/learning/simplefsm/parser/antlr/internal/InternalSfsm.g:276:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition533); 

            		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0()); 
            	

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSimpleFiniteStateMachine_in_entryRuleSimpleFiniteStateMachine75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFiniteStateMachine85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSimpleFiniteStateMachine122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleFiniteStateMachine139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSimpleFiniteStateMachine156 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSimpleFiniteStateMachine168 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleState_in_ruleSimpleFiniteStateMachine189 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleState_in_ruleSimpleFiniteStateMachine210 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleSimpleFiniteStateMachine223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleState306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState323 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState340 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleState352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState363 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState383 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleState396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTransition479 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition496 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTransition513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition533 = new BitSet(new long[]{0x0000000000000002L});

}