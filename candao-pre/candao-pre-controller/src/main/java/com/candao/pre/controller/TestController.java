package com.candao.pre.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.candao.ad.api.test.ITest;

@Controller
@RequestMapping("/testController")
public class TestController {
	@Autowired
	private ITest test;
	
	@RequestMapping("/test.do")
	@ResponseBody
	public String test(String json){
		System.out.println(test.test());
		return json;
	}
	
	@RequestMapping("/test1.do")
	@ResponseBody
	public String test1(){
		System.out.println("@@@@@@@@@@@@@");
		return "dsadafada";
	}
	
	@RequestMapping("/upload.do")
	@ResponseBody
	public String upload(String json){
		System.out.println(json);
		return "success";
	}

}
