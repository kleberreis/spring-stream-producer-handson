package com.engineering.handson.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

	private Source source;

	@Autowired
	public MessageProducer(Source source) {
		super();
		this.source = source;
	}
	
	public void publishMessage(String message) {
		source.output().send(MessageBuilder.withPayload(message).build());
	}
	
}
