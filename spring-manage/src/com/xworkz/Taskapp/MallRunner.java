package com.xworkz.Taskapp;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MallRunner {

	public static void main(String[] args) {

		ApplicationContext mall = new AnnotationConfigApplicationContext(Malls.class);

		String[] string = mall.getBeanDefinitionNames();
		System.out.println(Arrays.toString(string));
		
		String refOfstring=mall.getBean("OrienMalls",String.class);
		
		System.out.println(refOfstring.hashCode());
	}

}
