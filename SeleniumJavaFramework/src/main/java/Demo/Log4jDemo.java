package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello world\n");
logger.trace("This is trace message ");
logger.info("This is information message");
logger.error("This is error messgae");
logger.warn("This is warning message");
logger.fatal("This is a fatal messge");

System.out.println("\n completed");
	}

}
