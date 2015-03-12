package com.vdranik.spring.observer.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.vdranik.spring.observer.bean.impl.ObserverHelper;

public class MyConcreteObserverClient {

	@Autowired
	ObserverHelper observer;
}