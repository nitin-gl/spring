package com.gl.Driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.service.Teacher;
import com.gl.serviceimpl.HindiTeacher;

public class SpringDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1. Load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Step 2. retrieve bean from spring container

		Teacher teacher = context.getBean("hindiTeacher", HindiTeacher.class);// bean id, class name with .class
																				// extension

		// Step 3. call methods on bean
		System.out.println(teacher.getHomework());

		// Step 4. close the context
		context.close();
	}

}
