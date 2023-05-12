package com.xworkz.mani.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableWebMvc
public class ProjectInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public ProjectInit() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses");
		return new Class[] { ProjectConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		log.info("Running configureDefaultServletHandling");
		configurer.enable();
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		String temDir = "C:\\temp";
		int maxUploadedImb = 3 * 1024 * 1024;
		File uploadDirectry = new File(temDir);
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(uploadDirectry.getAbsolutePath(),
				maxUploadedImb, maxUploadedImb * 2, maxUploadedImb / 2);
		registration.setMultipartConfig(multipartConfigElement);
	}

}
