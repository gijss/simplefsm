package be.kuleuven.learning.simplefsm.impl.java;

import java.util.List;

//This is a very, very basic implementation
//for testing purposes only
public class SimpleFiniteStateMachine {
	public SimpleFiniteStateMachine() {
		// TODO Auto-generated constructor stub
	}
	
	public SimpleFiniteStateMachine(String name, List<State> states) {
		super();
		this.name = name;
		this.states = states;
	}
	
	public void run() {
		if(getInitialState() != null) {
			getInitialState().run();
		}
	}
	
	public State getInitialState() {
		if(states != null) {
			return states.get(0);
		}
		else
			return null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<State> getStates() {
		return states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}
	
	private String name;
	private List<State> states;
}
