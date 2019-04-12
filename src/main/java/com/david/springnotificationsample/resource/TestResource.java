package com.david.springnotificationsample.resource;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.springnotificationsample.jsm.Sender;

@RestController
@RequestMapping("/test")
public class TestResource  {

	@Autowired
	  private Sender sender;
	
	String destinationQueue;
	
	@GetMapping() 
	public String test() {
		sender.send("test");

		return "Enviado";
	}
}
