package com.goo.test;


import java.io.FileInputStream;
import java.util.Properties;    
import org.apache.log4j.Logger;    
import org.apache.log4j.PropertyConfigurator;        
public class LogjTest {        
	public static final Logger logger = Logger.getLogger(LogjTest.class);   
	public static void main(String args[])throws Exception{  
		String configFile = "log4j.properties";  
		
		PropertyConfigurator.configure(configFile);      
		   logger.error("测试log4j之包的使用!");   
		   logger.info("测试log4j之包的使用!");   
		   logger.debug("测试log4j之包的使用!");   

		   Properties perties = new Properties();   
		   FileInputStream fis = new FileInputStream(configFile); 
		   perties.load(fis);            
		   String str=perties.getProperty("log4j.rootCategory");         
		   logger.info("测试获取key值,如log4j.rootLogger="+str);        
		}
}