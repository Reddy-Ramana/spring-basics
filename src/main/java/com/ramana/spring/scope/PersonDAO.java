package com.ramana.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

	private Logger LOGGER = LoggerFactory.getLogger(PersonDAO.class);
	public PersonDAO() {
		
		LOGGER.info("Within person info DAO");
	}
	@Autowired
	private JDBCConnection jDBCConnection;

	public JDBCConnection getjDBCConnection() {
		return jDBCConnection;
	}

	public void setjDBCConnection(JDBCConnection jDBCConnection) {
		this.jDBCConnection = jDBCConnection;
	}

}
