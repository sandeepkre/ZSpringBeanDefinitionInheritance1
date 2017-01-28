package org.sandeep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle) ac.getBean("triangle");
		t.display();
	}

}
