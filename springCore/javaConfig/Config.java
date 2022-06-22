package com.ranjan.springCore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ranjan.springCore.javaConfig")
public class Config {
	
	
	/** in this way we can create the bean using @Bean tag and inject the 
	 * dependencies without using autowired**/
	
	
//	@Bean(name= {"name","getName"})
//	public Name getName() {
//		Name name = new Name("Ranjan", "Jha");
//		return name;
//	}
	
	
//	@Bean(name= {"person", "getPerson"})
//	public Person getPerson() {
//		Person p = new Person(getName(),12);
//		return p;
//	}
}
