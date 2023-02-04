package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.been.Ghost;
import com.xworkz.configuration.GhostConfiguration;

public class GhostRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(GhostConfiguration.class);

		container.getBean(Arrays.toString(container.getBeanDefinitionNames()));

		GhostConfiguration refOf = container.getBean(GhostConfiguration.class);
		System.out.println(refOf.GhostGender());
		System.out.println(refOf.GhostName());
		System.out.println(refOf.NailLength());
		System.out.println(refOf.DateOfDeath());

	}
}
