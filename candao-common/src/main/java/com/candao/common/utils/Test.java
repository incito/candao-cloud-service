package com.candao.common.utils;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public void main(String args[]) throws IOException{
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-provider-test.xml");    
	     context.start();  
	     System.out.println("Press any key to exit.");
	     System.in.read(); 
	}

}
