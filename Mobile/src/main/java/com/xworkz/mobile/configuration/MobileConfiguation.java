package com.xworkz.mobile.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.mobile")
public class MobileConfiguation {

	public MobileConfiguation() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Bean
	public MultipartResolver MultipartResolver() {
		System.out.println("Registereing in MultiPartResolver...");
		return new StandardServletMultipartResolver();
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Created ViewResolver..");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}

	@Bean
	LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Created in LocalConatinerEntityManagerFactoryBean...");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
	}

}
