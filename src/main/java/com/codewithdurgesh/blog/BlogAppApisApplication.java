package com.codewithdurgesh.blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;


	
	
	@SpringBootApplication
	public class BlogAppApisApplication extends SpringBootServletInitializer {

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(BlogAppApisApplication.class);
	    }
	

	
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
