package com.david.springnotificationsample.jsm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sender {

	  private static final Logger LOGGER =
		      LoggerFactory.getLogger(Sender.class);
	  
	 @Autowired
	  private JmsTemplate jmsTemplate;

	  public void send(String message) {
	    jmsTemplate.convertAndSend("test", message);
	  }
}
