package com.candao.ad.service.impl;

import org.springframework.stereotype.Service;

import com.candao.ad.api.test.ITest;
@Service("test")
public class TestImpl implements ITest{

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "这是测试!!!!!!!!!!!!";
	}

}
