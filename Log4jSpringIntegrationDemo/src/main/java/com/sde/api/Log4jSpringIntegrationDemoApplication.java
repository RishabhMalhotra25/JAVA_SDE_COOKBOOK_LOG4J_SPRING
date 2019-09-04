package com.sde.api;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jSpringIntegrationDemoApplication {

	static Logger logger = Logger.getLogger(Log4jSpringIntegrationDemoApplication.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir")
                + "/src/main/resources/" + "log4j.properties";
        PropertyConfigurator.configure(log4jConfigFile);
        logger.debug("this is a debug log message");
		SpringApplication.run(Log4jSpringIntegrationDemoApplication.class, args);
	}

}
