package com.candao.ad.test;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.candao.ad.api.test.ITest;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-provider-test.xml"})
public class AdTest {
	@Autowired
	private ITest test;
	@Test
	public void test(){
		System.out.println(test.test());
	}
	
	public static void main(String args[]) throws IOException{
		//加载spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-provider-test.xml");    
        context.start();  
        System.out.println("Press any key to exit.");
        System.in.read();    
	}

}
