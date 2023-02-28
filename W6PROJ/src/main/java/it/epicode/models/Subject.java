package it.epicode.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private final List<Observer> observers = new ArrayList<Observer>();
	
	public void notifyObservers() {
		this.getObservers().forEach(el -> el.update(this));
	}
	
	public void addObserver(Observer obs) {
		this.getObservers().add(obs);
	}
	
	public void removeObserver(Observer obs) {
		this.getObservers().remove(obs);
	}

	public List<Observer> getObservers() {
		return observers;
	}
	
	
}
