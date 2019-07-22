package com.engineering.handson.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	private MessageProducer producer;
	
	@Autowired
	public DemoService(MessageProducer producer) {
		super();
		this.producer = producer;
	}


	public void messagePublish(String message) {
		producer.publishMessage(message);
	}
}
