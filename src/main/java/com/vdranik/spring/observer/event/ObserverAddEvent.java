package com.vdranik.spring.observer.event;

import org.springframework.context.ApplicationEvent;

import com.vdranik.spring.observer.bean.impl.ObserverHelper;

public class ObserverAddEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public ObserverAddEvent(ObserverHelper observer) {
		super(observer);
	}

	@Override
	public ObserverHelper getSource() {
		return (ObserverHelper) super.getSource();
	}
}