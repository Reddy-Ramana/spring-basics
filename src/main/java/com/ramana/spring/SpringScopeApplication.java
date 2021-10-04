package com.ramana.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ramana.spring.scope.PersonDAO;

@SpringBootApplication
public class SpringScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringScopeApplication.class, args);
		PersonDAO dao = applicationContext.getBean(PersonDAO.class);
		PersonDAO dao1 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}", dao);
		LOGGER.info("{}", dao.getjDBCConnection());
		LOGGER.info("{}", dao1);
		LOGGER.info("{}", dao1.getjDBCConnection());

	}

}
