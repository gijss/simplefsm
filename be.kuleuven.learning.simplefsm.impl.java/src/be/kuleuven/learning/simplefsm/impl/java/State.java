package be.kuleuven.learning.simplefsm.impl.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class State {
	public State() {
	}
		
	public State(String name, String action, List<Transition> transitions,
			SimpleFiniteStateMachine owningFSM) {
		super();
		this.name = name;
		this.action = action;
		this.transitions = transitions;
		this.owningFSM = owningFSM;
	}
	
	public void run() {
		System.out.println("State " + getName() + ":");
		System.out.println(getAction());
		if(getTransitions().size() == 0)
			System.out.println("-- FSM completed!");
		else {
			System.out.println("-- choose one of the following possibitities: ");
			for(Transition trans: getTransitions()) 
				System.out.print(" " + trans.getEvent() + " (" + trans.getName() + ") ");
			doTransition().run();
		}
	}
	
	public State doTransition() {
		State state = null;
		String input = null;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    do {
		    try {
				input = br.readLine();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    state = doTransition(input);
	    } while (state == null);
		
		return state;
	}
	
	public State doTransition(String event) {
		State state = null;
		
		for(Transition trans : getTransitions())
			if(trans.getEvent().equals(event)) {
				state = trans.getTarget();
				break;
			}
		
		return state;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<Transition> getTransitions() {
		return transitions;
	}
	public void setTransitions(List<Transition> transitions) {
		this.transitions = transitions;
	}
	public SimpleFiniteStateMachine getOwningFSM() {
		return owningFSM;
	}
	public void setOwningFSM(SimpleFiniteStateMachine owningFSM) {
		this.owningFSM = owningFSM;
	}

	private String name;
	private String action;
	private List<Transition> transitions; //map is better
	private SimpleFiniteStateMachine owningFSM;
}
