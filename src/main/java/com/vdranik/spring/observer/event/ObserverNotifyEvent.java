package com.vdranik.spring.observer.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class ObserverNotifyEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public ObserverNotifyEvent(String message) {
		super(message);
	}

	@Override
	public String getSource() {
		return (String) super.getSource();
	}
}