package com.ramana.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS)
public class JDBCConnection {

	private Logger LOGGER = LoggerFactory.getLogger(JDBCConnection.class);
	
	public JDBCConnection() {

		LOGGER.info("{}","Inside JDBC Connection Constructor");
	}

}
