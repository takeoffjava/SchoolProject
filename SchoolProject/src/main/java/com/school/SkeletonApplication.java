package com.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.school.configuration.HibernateConfiguration;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan({ "com.skeleton.*" })
//@Import({ UserController.class,HibernateConfiguration.class})



  @Configuration
  
  @EnableAutoConfiguration
  
  //@ComponentScan({ "com.skeleton.*" })
  @ComponentScan(basePackages={"com.school"})
 
  //@ComponentScan(basePackageClasses=UserController.class)
  
  //@ComponentScan({ "com.skeleton" })
 
 //@SpringBootApplication
/*@Configuration
@EnableAutoConfiguration(exclude={HibernateConfiguration.class})
@ComponentScan(basePackageClasses=EmployeeRoleController.class)*/
 

public class SkeletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkeletonApplication.class, args);
	}

}
