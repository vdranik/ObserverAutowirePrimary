package com.vdranik.spring.observer.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}