package com.yi.ask.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogLeve {
	
	private static Logger  logger = LoggerFactory.getLogger(LogLeve.class);
	
	public static void logLeve(){
		logger.debug("===== debug ========");
		logger.info("====== info ========== ");
		logger.warn("======= warn =========");
		logger.error("====== error ============");
		
	} 
	
	public static void main(String[] args) {
		logLeve();
	}

}
