package com.ramana.test.component.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	
	@Autowired
	private ComponentJDBC componentJDBC;
	
	

}
