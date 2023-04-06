package com.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
	Student student1 =(Student) context.getBean("Student1");
	Student student2 =(Student) context.getBean("Student2");
	Student names =(Student) context.getBean("names");
	System.out.println(student1);	

	System.out.println(student2);
	System.out.println(names);
	
		
	}

}
