package com.vdranik.spring.observer.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.vdranik.spring.observer.bean.impl.ObserverHelper;

@Component
@Profile("qa")
public class ObserverRemoveEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public ObserverRemoveEvent(ObserverHelper observer) {
		super(observer);
	}

	@Override
	public ObserverHelper getSource() {
		return (ObserverHelper) super.getSource();
	}

}
