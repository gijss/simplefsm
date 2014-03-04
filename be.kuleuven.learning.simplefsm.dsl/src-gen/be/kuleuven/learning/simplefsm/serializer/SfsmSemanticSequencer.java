package be.kuleuven.learning.simplefsm.serializer;

import be.kuleuven.learning.simplefsm.model.ModelPackage;
import be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine;
import be.kuleuven.learning.simplefsm.model.State;
import be.kuleuven.learning.simplefsm.model.Transition;
import be.kuleuven.learning.simplefsm.services.SfsmGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class SfsmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SfsmGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ModelPackage.SIMPLE_FINITE_STATE_MACHINE:
				if(context == grammarAccess.getSimpleFiniteStateMachineRule()) {
					sequence_SimpleFiniteStateMachine(context, (SimpleFiniteStateMachine) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID states+=State states+=State*)
	 */
	protected void sequence_SimpleFiniteStateMachine(EObject context, SimpleFiniteStateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID outgoingTransitions+=Transition*)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=STRING target=[State|ID])
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
