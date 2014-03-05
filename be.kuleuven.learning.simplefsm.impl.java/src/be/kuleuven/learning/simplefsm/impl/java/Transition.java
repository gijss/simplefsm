package be.kuleuven.learning.simplefsm.impl.java;

public class Transition {
	public Transition() {
		// TODO Auto-generated constructor stub
	}
	
	public Transition(String name, String event, State target, State owningState) {
		super();
		this.name = name;
		this.event = event;
		this.target = target;
		this.owningState = owningState;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public State getTarget() {
		return target;
	}
	public void setTarget(State target) {
		this.target = target;
	}
	public State getOwningState() {
		return owningState;
	}
	public void setOwningState(State owningState) {
		this.owningState = owningState;
	}

	private String name;
	private String event;
	private State target;
	private State owningState;
}
