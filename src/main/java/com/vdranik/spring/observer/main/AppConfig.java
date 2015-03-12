package com.vdranik.spring.observer.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.vdranik.spring.observer.bean.ConcreteObserver1;
import com.vdranik.spring.observer.bean.ConcreteObserver2;
import com.vdranik.spring.observer.bean.MyConcreteObserverClient;

@Configuration
// @Profile("dev")
// @PropertySource("classpath:spring-training.properties")
public class AppConfig {

	@Bean(name = "concreteObserver1")
	@Primary
	public ConcreteObserver1 concreteObserver1() {
		return new ConcreteObserver1();
	}

	@Bean(name = "concreteObserver2")
	// если вписать еще один @Primary, то Spring не сможет выбрать между concreteObserver1 и concreteObserver2 - вылетит org.springframework.beans.factory.NoUniqueBeanDefinitionException
	public ConcreteObserver2 concreteObserver2() {
		return new ConcreteObserver2();
	}

	@Bean(name = "myConreteObserverClient")
	public MyConcreteObserverClient myConcreteObserverClient() {
		return new MyConcreteObserverClient();
	}

	// @Bean(name = "observerAddEventListener")
	// public ObserverAddEventListener observerAddEventListener() {
	// return new ObserverAddEventListener();
	// }
	//
	// @Bean(name = "beanForDevEnabledEnvironment")
	// @Conditional(PropertyCondition.class)
	// public BeanForDevEnabledEnvironment beanForDevEnabledEnvironment() {
	// return new BeanForDevEnabledEnvironment();
	// }
	//
	// @Bean(name = "observerNotifyEventListener")
	// public ObserverNotifyEventListener observerNotifyEventListener() {
	// return new ObserverNotifyEventListener();
	// }
	//
	// @Bean(name = "observerRemoveEventListener")
	// public ObserverRemoveEventListener observerRemoveEventListener() {
	// return new ObserverRemoveEventListener();
	// }
}