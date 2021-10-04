package com.ramana.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ramana.spring.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringComponentApplication.class);
		PersonDAO dao = applicationContext.getBean(PersonDAO.class);
		PersonDAO dao1 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}", dao);
		LOGGER.info("{}", dao.getjDBCConnection());
		LOGGER.info("{}", dao1);
		LOGGER.info("{}", dao1.getjDBCConnection());

	}

}
