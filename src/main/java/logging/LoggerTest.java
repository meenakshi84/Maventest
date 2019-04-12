package logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoggerTest {
	 static String configFileName="C:\\Users\\meena\\workspace5\\Maventest\\log4j.properties";

     

     //public static final Logger logger;

     public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());//it allows to use log4j in this class
   @BeforeTest
	public static void getLogger()
	{
	   PropertyConfigurator.configure(configFileName);//it reads the property file
		
	}
	@Test
	public void testLogger()
	{
		logger.info("log test1");
		logger.info("log test2");
		logger.info("log test3");
		logger.info("log test4");
	}
	
}
