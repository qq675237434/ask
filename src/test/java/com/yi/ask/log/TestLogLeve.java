package com.yi.ask.log;

import javax.annotation.Resource;

import org.junit.Test;

public class TestLogLeve   {

	@Resource
	private LogLeve  logLeve ;
	
	@Test
	public  void testLog(){
		logLeve.logLeve();
	}
}
