package be.kuleuven.learning.simplefsm.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import be.kuleuven.learning.simplefsm.services.SfsmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSfsmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sfsm'", "'{'", "'initial'", "'}'", "'state'", "'action'", "'event'", "'gotos'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g"; }


     
     	private SfsmGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SfsmGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSimpleFiniteStateMachine"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:60:1: entryRuleSimpleFiniteStateMachine : ruleSimpleFiniteStateMachine EOF ;
    public final void entryRuleSimpleFiniteStateMachine() throws RecognitionException {
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:61:1: ( ruleSimpleFiniteStateMachine EOF )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:62:1: ruleSimpleFiniteStateMachine EOF
            {
             before(grammarAccess.getSimpleFiniteStateMachineRule()); 
            pushFollow(FOLLOW_ruleSimpleFiniteStateMachine_in_entryRuleSimpleFiniteStateMachine61);
            ruleSimpleFiniteStateMachine();

            state._fsp--;

             after(grammarAccess.getSimpleFiniteStateMachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFiniteStateMachine68); 

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
    // $ANTLR end "entryRuleSimpleFiniteStateMachine"


    // $ANTLR start "ruleSimpleFiniteStateMachine"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:69:1: ruleSimpleFiniteStateMachine : ( ( rule__SimpleFiniteStateMachine__Group__0 ) ) ;
    public final void ruleSimpleFiniteStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:73:2: ( ( ( rule__SimpleFiniteStateMachine__Group__0 ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:74:1: ( ( rule__SimpleFiniteStateMachine__Group__0 ) )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:74:1: ( ( rule__SimpleFiniteStateMachine__Group__0 ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:75:1: ( rule__SimpleFiniteStateMachine__Group__0 )
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getGroup()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:76:1: ( rule__SimpleFiniteStateMachine__Group__0 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:76:2: rule__SimpleFiniteStateMachine__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__0_in_ruleSimpleFiniteStateMachine94);
            rule__SimpleFiniteStateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFiniteStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleFiniteStateMachine"


    // $ANTLR start "entryRuleState"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:88:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:89:1: ( ruleState EOF )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:90:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState121);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState128); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:97:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:101:2: ( ( ( rule__State__Group__0 ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:102:1: ( ( rule__State__Group__0 ) )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:102:1: ( ( rule__State__Group__0 ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:103:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:104:1: ( rule__State__Group__0 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:104:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState154);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:116:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:117:1: ( ruleTransition EOF )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:118:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition181);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition188); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:125:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:129:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:130:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:130:1: ( ( rule__Transition__Group__0 ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:131:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:132:1: ( rule__Transition__Group__0 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:132:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition214);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__0"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:146:1: rule__SimpleFiniteStateMachine__Group__0 : rule__SimpleFiniteStateMachine__Group__0__Impl rule__SimpleFiniteStateMachine__Group__1 ;
    public final void rule__SimpleFiniteStateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:150:1: ( rule__SimpleFiniteStateMachine__Group__0__Impl rule__SimpleFiniteStateMachine__Group__1 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:151:2: rule__SimpleFiniteStateMachine__Group__0__Impl rule__SimpleFiniteStateMachine__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__0__Impl_in_rule__SimpleFiniteStateMachine__Group__0248);
            rule__SimpleFiniteStateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__1_in_rule__SimpleFiniteStateMachine__Group__0251);
            rule__SimpleFiniteStateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__0"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__0__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:158:1: rule__SimpleFiniteStateMachine__Group__0__Impl : ( 'sfsm' ) ;
    public final void rule__SimpleFiniteStateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:162:1: ( ( 'sfsm' ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:163:1: ( 'sfsm' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:163:1: ( 'sfsm' )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:164:1: 'sfsm'
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getSfsmKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__SimpleFiniteStateMachine__Group__0__Impl279); 
             after(grammarAccess.getSimpleFiniteStateMachineAccess().getSfsmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__0__Impl"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__1"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:177:1: rule__SimpleFiniteStateMachine__Group__1 : rule__SimpleFiniteStateMachine__Group__1__Impl rule__SimpleFiniteStateMachine__Group__2 ;
    public final void rule__SimpleFiniteStateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:181:1: ( rule__SimpleFiniteStateMachine__Group__1__Impl rule__SimpleFiniteStateMachine__Group__2 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:182:2: rule__SimpleFiniteStateMachine__Group__1__Impl rule__SimpleFiniteStateMachine__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__1__Impl_in_rule__SimpleFiniteStateMachine__Group__1310);
            rule__SimpleFiniteStateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__2_in_rule__SimpleFiniteStateMachine__Group__1313);
            rule__SimpleFiniteStateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__1"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__1__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:189:1: rule__SimpleFiniteStateMachine__Group__1__Impl : ( ( rule__SimpleFiniteStateMachine__NameAssignment_1 ) ) ;
    public final void rule__SimpleFiniteStateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:193:1: ( ( ( rule__SimpleFiniteStateMachine__NameAssignment_1 ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:194:1: ( ( rule__SimpleFiniteStateMachine__NameAssignment_1 ) )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:194:1: ( ( rule__SimpleFiniteStateMachine__NameAssignment_1 ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:195:1: ( rule__SimpleFiniteStateMachine__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getNameAssignment_1()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:196:1: ( rule__SimpleFiniteStateMachine__NameAssignment_1 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:196:2: rule__SimpleFiniteStateMachine__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__NameAssignment_1_in_rule__SimpleFiniteStateMachine__Group__1__Impl340);
            rule__SimpleFiniteStateMachine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFiniteStateMachineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__1__Impl"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__2"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:206:1: rule__SimpleFiniteStateMachine__Group__2 : rule__SimpleFiniteStateMachine__Group__2__Impl rule__SimpleFiniteStateMachine__Group__3 ;
    public final void rule__SimpleFiniteStateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:210:1: ( rule__SimpleFiniteStateMachine__Group__2__Impl rule__SimpleFiniteStateMachine__Group__3 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:211:2: rule__SimpleFiniteStateMachine__Group__2__Impl rule__SimpleFiniteStateMachine__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__2__Impl_in_rule__SimpleFiniteStateMachine__Group__2370);
            rule__SimpleFiniteStateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__3_in_rule__SimpleFiniteStateMachine__Group__2373);
            rule__SimpleFiniteStateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__2"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__2__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:218:1: rule__SimpleFiniteStateMachine__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleFiniteStateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:222:1: ( ( '{' ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:223:1: ( '{' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:223:1: ( '{' )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:224:1: '{'
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__SimpleFiniteStateMachine__Group__2__Impl401); 
             after(grammarAccess.getSimpleFiniteStateMachineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__2__Impl"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__3"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:237:1: rule__SimpleFiniteStateMachine__Group__3 : rule__SimpleFiniteStateMachine__Group__3__Impl rule__SimpleFiniteStateMachine__Group__4 ;
    public final void rule__SimpleFiniteStateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:241:1: ( rule__SimpleFiniteStateMachine__Group__3__Impl rule__SimpleFiniteStateMachine__Group__4 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:242:2: rule__SimpleFiniteStateMachine__Group__3__Impl rule__SimpleFiniteStateMachine__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__3__Impl_in_rule__SimpleFiniteStateMachine__Group__3432);
            rule__SimpleFiniteStateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__4_in_rule__SimpleFiniteStateMachine__Group__3435);
            rule__SimpleFiniteStateMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__3"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__3__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:249:1: rule__SimpleFiniteStateMachine__Group__3__Impl : ( 'initial' ) ;
    public final void rule__SimpleFiniteStateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:253:1: ( ( 'initial' ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:254:1: ( 'initial' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:254:1: ( 'initial' )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:255:1: 'initial'
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getInitialKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__SimpleFiniteStateMachine__Group__3__Impl463); 
             after(grammarAccess.getSimpleFiniteStateMachineAccess().getInitialKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__3__Impl"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__4"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:268:1: rule__SimpleFiniteStateMachine__Group__4 : rule__SimpleFiniteStateMachine__Group__4__Impl rule__SimpleFiniteStateMachine__Group__5 ;
    public final void rule__SimpleFiniteStateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:272:1: ( rule__SimpleFiniteStateMachine__Group__4__Impl rule__SimpleFiniteStateMachine__Group__5 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:273:2: rule__SimpleFiniteStateMachine__Group__4__Impl rule__SimpleFiniteStateMachine__Group__5
            {
            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__4__Impl_in_rule__SimpleFiniteStateMachine__Group__4494);
            rule__SimpleFiniteStateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__5_in_rule__SimpleFiniteStateMachine__Group__4497);
            rule__SimpleFiniteStateMachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__4"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__4__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:280:1: rule__SimpleFiniteStateMachine__Group__4__Impl : ( ( rule__SimpleFiniteStateMachine__InitialStateAssignment_4 ) ) ;
    public final void rule__SimpleFiniteStateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:284:1: ( ( ( rule__SimpleFiniteStateMachine__InitialStateAssignment_4 ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:285:1: ( ( rule__SimpleFiniteStateMachine__InitialStateAssignment_4 ) )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:285:1: ( ( rule__SimpleFiniteStateMachine__InitialStateAssignment_4 ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:286:1: ( rule__SimpleFiniteStateMachine__InitialStateAssignment_4 )
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getInitialStateAssignment_4()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:287:1: ( rule__SimpleFiniteStateMachine__InitialStateAssignment_4 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:287:2: rule__SimpleFiniteStateMachine__InitialStateAssignment_4
            {
            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__InitialStateAssignment_4_in_rule__SimpleFiniteStateMachine__Group__4__Impl524);
            rule__SimpleFiniteStateMachine__InitialStateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFiniteStateMachineAccess().getInitialStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__4__Impl"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__5"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:297:1: rule__SimpleFiniteStateMachine__Group__5 : rule__SimpleFiniteStateMachine__Group__5__Impl rule__SimpleFiniteStateMachine__Group__6 ;
    public final void rule__SimpleFiniteStateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:301:1: ( rule__SimpleFiniteStateMachine__Group__5__Impl rule__SimpleFiniteStateMachine__Group__6 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:302:2: rule__SimpleFiniteStateMachine__Group__5__Impl rule__SimpleFiniteStateMachine__Group__6
            {
            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__5__Impl_in_rule__SimpleFiniteStateMachine__Group__5554);
            rule__SimpleFiniteStateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__6_in_rule__SimpleFiniteStateMachine__Group__5557);
            rule__SimpleFiniteStateMachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__5"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__5__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:309:1: rule__SimpleFiniteStateMachine__Group__5__Impl : ( ( rule__SimpleFiniteStateMachine__StatesAssignment_5 )* ) ;
    public final void rule__SimpleFiniteStateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:313:1: ( ( ( rule__SimpleFiniteStateMachine__StatesAssignment_5 )* ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:314:1: ( ( rule__SimpleFiniteStateMachine__StatesAssignment_5 )* )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:314:1: ( ( rule__SimpleFiniteStateMachine__StatesAssignment_5 )* )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:315:1: ( rule__SimpleFiniteStateMachine__StatesAssignment_5 )*
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getStatesAssignment_5()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:316:1: ( rule__SimpleFiniteStateMachine__StatesAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:316:2: rule__SimpleFiniteStateMachine__StatesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__StatesAssignment_5_in_rule__SimpleFiniteStateMachine__Group__5__Impl584);
            	    rule__SimpleFiniteStateMachine__StatesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSimpleFiniteStateMachineAccess().getStatesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__5__Impl"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__6"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:326:1: rule__SimpleFiniteStateMachine__Group__6 : rule__SimpleFiniteStateMachine__Group__6__Impl ;
    public final void rule__SimpleFiniteStateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:330:1: ( rule__SimpleFiniteStateMachine__Group__6__Impl )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:331:2: rule__SimpleFiniteStateMachine__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SimpleFiniteStateMachine__Group__6__Impl_in_rule__SimpleFiniteStateMachine__Group__6615);
            rule__SimpleFiniteStateMachine__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__6"


    // $ANTLR start "rule__SimpleFiniteStateMachine__Group__6__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:337:1: rule__SimpleFiniteStateMachine__Group__6__Impl : ( '}' ) ;
    public final void rule__SimpleFiniteStateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:341:1: ( ( '}' ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:342:1: ( '}' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:342:1: ( '}' )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:343:1: '}'
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__SimpleFiniteStateMachine__Group__6__Impl643); 
             after(grammarAccess.getSimpleFiniteStateMachineAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__Group__6__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:370:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:374:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:375:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__0688);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__0691);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:382:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:386:1: ( ( 'state' ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:387:1: ( 'state' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:387:1: ( 'state' )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:388:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__State__Group__0__Impl719); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:401:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:405:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:406:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__1750);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__1753);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:413:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:417:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:418:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:418:1: ( ( rule__State__NameAssignment_1 ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:419:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:420:1: ( rule__State__NameAssignment_1 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:420:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl780);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:430:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:434:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:435:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__2810);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__2813);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:442:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:446:1: ( ( '{' ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:447:1: ( '{' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:447:1: ( '{' )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:448:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__State__Group__2__Impl841); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:461:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:465:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:466:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__3872);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__3875);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:473:1: rule__State__Group__3__Impl : ( 'action' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:477:1: ( ( 'action' ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:478:1: ( 'action' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:478:1: ( 'action' )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:479:1: 'action'
            {
             before(grammarAccess.getStateAccess().getActionKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__State__Group__3__Impl903); 
             after(grammarAccess.getStateAccess().getActionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:492:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:496:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:497:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__4934);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__4937);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:504:1: rule__State__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:508:1: ( ( RULE_STRING ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:509:1: ( RULE_STRING )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:509:1: ( RULE_STRING )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:510:1: RULE_STRING
            {
             before(grammarAccess.getStateAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__Group__4__Impl964); 
             after(grammarAccess.getStateAccess().getSTRINGTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:521:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:525:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:526:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__5993);
            rule__State__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__6_in_rule__State__Group__5996);
            rule__State__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:533:1: rule__State__Group__5__Impl : ( ( rule__State__OutgoingTransitionsAssignment_5 )* ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:537:1: ( ( ( rule__State__OutgoingTransitionsAssignment_5 )* ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:538:1: ( ( rule__State__OutgoingTransitionsAssignment_5 )* )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:538:1: ( ( rule__State__OutgoingTransitionsAssignment_5 )* )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:539:1: ( rule__State__OutgoingTransitionsAssignment_5 )*
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_5()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:540:1: ( rule__State__OutgoingTransitionsAssignment_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:540:2: rule__State__OutgoingTransitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__State__OutgoingTransitionsAssignment_5_in_rule__State__Group__5__Impl1023);
            	    rule__State__OutgoingTransitionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group__6"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:550:1: rule__State__Group__6 : rule__State__Group__6__Impl ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:554:1: ( rule__State__Group__6__Impl )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:555:2: rule__State__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__61054);
            rule__State__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6"


    // $ANTLR start "rule__State__Group__6__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:561:1: rule__State__Group__6__Impl : ( '}' ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:565:1: ( ( '}' ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:566:1: ( '}' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:566:1: ( '}' )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:567:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__State__Group__6__Impl1082); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:594:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:598:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:599:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01127);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01130);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:606:1: rule__Transition__Group__0__Impl : ( 'event' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:610:1: ( ( 'event' ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:611:1: ( 'event' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:611:1: ( 'event' )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:612:1: 'event'
            {
             before(grammarAccess.getTransitionAccess().getEventKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Transition__Group__0__Impl1158); 
             after(grammarAccess.getTransitionAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:625:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:629:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:630:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11189);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11192);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:637:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__EventAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:641:1: ( ( ( rule__Transition__EventAssignment_1 ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:642:1: ( ( rule__Transition__EventAssignment_1 ) )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:642:1: ( ( rule__Transition__EventAssignment_1 ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:643:1: ( rule__Transition__EventAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_1()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:644:1: ( rule__Transition__EventAssignment_1 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:644:2: rule__Transition__EventAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_1_in_rule__Transition__Group__1__Impl1219);
            rule__Transition__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:654:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:658:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:659:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21249);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21252);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:666:1: rule__Transition__Group__2__Impl : ( 'gotos' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:670:1: ( ( 'gotos' ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:671:1: ( 'gotos' )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:671:1: ( 'gotos' )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:672:1: 'gotos'
            {
             before(grammarAccess.getTransitionAccess().getGotosKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Transition__Group__2__Impl1280); 
             after(grammarAccess.getTransitionAccess().getGotosKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:685:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:689:1: ( rule__Transition__Group__3__Impl )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:690:2: rule__Transition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__31311);
            rule__Transition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:696:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__TargetAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:700:1: ( ( ( rule__Transition__TargetAssignment_3 ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:701:1: ( ( rule__Transition__TargetAssignment_3 ) )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:701:1: ( ( rule__Transition__TargetAssignment_3 ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:702:1: ( rule__Transition__TargetAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_3()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:703:1: ( rule__Transition__TargetAssignment_3 )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:703:2: rule__Transition__TargetAssignment_3
            {
            pushFollow(FOLLOW_rule__Transition__TargetAssignment_3_in_rule__Transition__Group__3__Impl1338);
            rule__Transition__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__SimpleFiniteStateMachine__NameAssignment_1"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:722:1: rule__SimpleFiniteStateMachine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleFiniteStateMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:726:1: ( ( RULE_ID ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:727:1: ( RULE_ID )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:727:1: ( RULE_ID )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:728:1: RULE_ID
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleFiniteStateMachine__NameAssignment_11381); 
             after(grammarAccess.getSimpleFiniteStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__NameAssignment_1"


    // $ANTLR start "rule__SimpleFiniteStateMachine__InitialStateAssignment_4"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:737:1: rule__SimpleFiniteStateMachine__InitialStateAssignment_4 : ( ruleState ) ;
    public final void rule__SimpleFiniteStateMachine__InitialStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:741:1: ( ( ruleState ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:742:1: ( ruleState )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:742:1: ( ruleState )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:743:1: ruleState
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getInitialStateStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__SimpleFiniteStateMachine__InitialStateAssignment_41412);
            ruleState();

            state._fsp--;

             after(grammarAccess.getSimpleFiniteStateMachineAccess().getInitialStateStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__InitialStateAssignment_4"


    // $ANTLR start "rule__SimpleFiniteStateMachine__StatesAssignment_5"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:752:1: rule__SimpleFiniteStateMachine__StatesAssignment_5 : ( ruleState ) ;
    public final void rule__SimpleFiniteStateMachine__StatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:756:1: ( ( ruleState ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:757:1: ( ruleState )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:757:1: ( ruleState )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:758:1: ruleState
            {
             before(grammarAccess.getSimpleFiniteStateMachineAccess().getStatesStateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__SimpleFiniteStateMachine__StatesAssignment_51443);
            ruleState();

            state._fsp--;

             after(grammarAccess.getSimpleFiniteStateMachineAccess().getStatesStateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFiniteStateMachine__StatesAssignment_5"


    // $ANTLR start "rule__State__NameAssignment_1"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:767:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:771:1: ( ( RULE_ID ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:772:1: ( RULE_ID )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:772:1: ( RULE_ID )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:773:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_11474); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__OutgoingTransitionsAssignment_5"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:782:1: rule__State__OutgoingTransitionsAssignment_5 : ( ruleTransition ) ;
    public final void rule__State__OutgoingTransitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:786:1: ( ( ruleTransition ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:787:1: ( ruleTransition )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:787:1: ( ruleTransition )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:788:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__OutgoingTransitionsAssignment_51505);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OutgoingTransitionsAssignment_5"


    // $ANTLR start "rule__Transition__EventAssignment_1"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:797:1: rule__Transition__EventAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Transition__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:801:1: ( ( RULE_STRING ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:802:1: ( RULE_STRING )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:802:1: ( RULE_STRING )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:803:1: RULE_STRING
            {
             before(grammarAccess.getTransitionAccess().getEventSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Transition__EventAssignment_11536); 
             after(grammarAccess.getTransitionAccess().getEventSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_1"


    // $ANTLR start "rule__Transition__TargetAssignment_3"
    // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:812:1: rule__Transition__TargetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:816:1: ( ( ( RULE_ID ) ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:817:1: ( ( RULE_ID ) )
            {
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:817:1: ( ( RULE_ID ) )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:818:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0()); 
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:819:1: ( RULE_ID )
            // ../be.kuleuven.learning.simplefsm.dsl.ui/src-gen/be/kuleuven/learning/simplefsm/ui/contentassist/antlr/internal/InternalSfsm.g:820:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_31571); 
             after(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSimpleFiniteStateMachine_in_entryRuleSimpleFiniteStateMachine61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFiniteStateMachine68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__0_in_ruleSimpleFiniteStateMachine94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__0__Impl_in_rule__SimpleFiniteStateMachine__Group__0248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__1_in_rule__SimpleFiniteStateMachine__Group__0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SimpleFiniteStateMachine__Group__0__Impl279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__1__Impl_in_rule__SimpleFiniteStateMachine__Group__1310 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__2_in_rule__SimpleFiniteStateMachine__Group__1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__NameAssignment_1_in_rule__SimpleFiniteStateMachine__Group__1__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__2__Impl_in_rule__SimpleFiniteStateMachine__Group__2370 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__3_in_rule__SimpleFiniteStateMachine__Group__2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleFiniteStateMachine__Group__2__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__3__Impl_in_rule__SimpleFiniteStateMachine__Group__3432 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__4_in_rule__SimpleFiniteStateMachine__Group__3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SimpleFiniteStateMachine__Group__3__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__4__Impl_in_rule__SimpleFiniteStateMachine__Group__4494 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__5_in_rule__SimpleFiniteStateMachine__Group__4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__InitialStateAssignment_4_in_rule__SimpleFiniteStateMachine__Group__4__Impl524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__5__Impl_in_rule__SimpleFiniteStateMachine__Group__5554 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__6_in_rule__SimpleFiniteStateMachine__Group__5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__StatesAssignment_5_in_rule__SimpleFiniteStateMachine__Group__5__Impl584 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__SimpleFiniteStateMachine__Group__6__Impl_in_rule__SimpleFiniteStateMachine__Group__6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleFiniteStateMachine__Group__6__Impl643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__0688 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__0691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Group__0__Impl719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__1750 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__2810 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__State__Group__2__Impl841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__3872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__Group__3__Impl903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__4934 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__Group__4__Impl964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__5993 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__State__Group__6_in_rule__State__Group__5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__OutgoingTransitionsAssignment_5_in_rule__State__Group__5__Impl1023 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__61054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__State__Group__6__Impl1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Transition__Group__0__Impl1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11189 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_1_in_rule__Transition__Group__1__Impl1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Transition__Group__2__Impl1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__31311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TargetAssignment_3_in_rule__Transition__Group__3__Impl1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleFiniteStateMachine__NameAssignment_11381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__SimpleFiniteStateMachine__InitialStateAssignment_41412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__SimpleFiniteStateMachine__StatesAssignment_51443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_11474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__OutgoingTransitionsAssignment_51505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Transition__EventAssignment_11536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_31571 = new BitSet(new long[]{0x0000000000000002L});

}