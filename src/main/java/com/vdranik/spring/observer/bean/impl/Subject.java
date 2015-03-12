package com.vdranik.spring.observer.bean.impl;

import java.util.List;

public interface Subject {

	List<ObserverHelper> getObservers();

	void setObservers(List<ObserverHelper> observers);

	void addObserver(ObserverHelper observer);

	public void removeObserver(ObserverHelper observer);

	public void removeAllObservers();

	public void notifyObservers(String message);
}