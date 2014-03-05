//Epsilon should generate code that looks like this

package be.kuleuven.learning.simplefsm.impl.java.test;

import java.util.ArrayList;
import java.util.List;

import be.kuleuven.learning.simplefsm.impl.java.SimpleFiniteStateMachine;
import be.kuleuven.learning.simplefsm.impl.java.State;
import be.kuleuven.learning.simplefsm.impl.java.Transition;;


public class TestFsm1 {

	public static void main(String[] args) {
		
		SimpleFiniteStateMachine sfsm = new SimpleFiniteStateMachine("TestFsm1", new ArrayList<State>());
		
		State state1 = new State();
		State state2 = new State();
		
		sfsm.getStates().add(state1);
		state1.setOwningFSM(sfsm);
		state1.setName("state1");
		state1.setAction("action1");
		state1.setTransitions(new ArrayList<Transition>());
		state1.getTransitions().add(new Transition("a", "a", state1, state1));
		state1.getTransitions().add(new Transition("b", "b", state2, state1));
		
		sfsm.getStates().add(state2);
		state2.setOwningFSM(sfsm);
		state2.setName("state2");
		state2.setAction("action2");
		state2.setTransitions(new ArrayList<Transition>());
		
		sfsm.run();
	}

}
