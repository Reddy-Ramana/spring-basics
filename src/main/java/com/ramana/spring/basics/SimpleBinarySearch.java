package com.ramana.spring.basics;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SimpleBinarySearch {
   private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("quick")
	private Sorting sort;

	public String binarySearchService(int[] Numbers, int result) {

		return sort.sort(Numbers, result);
	}
	
	@PostConstruct
	public void postConstruct() {
		
		LOGGER.info("within Post construct");
		
	}
	
	@PostConstruct
	public void postConstruct1() {
		
		LOGGER.info("within Post construct1");
		
	}

}
