package com.dependencyinjection.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPrgm {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SingleBean.xml");
		Student student=context.getBean("student",Student.class);
		student.Cheating();
		
		AnotherStudent student2=context.getBean("astu",AnotherStudent.class);
		student2.mathCheating();
	}

}
