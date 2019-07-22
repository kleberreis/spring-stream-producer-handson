package com.engineering.handson.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	private DemoService service;
	
	@Autowired	
	public DemoController(DemoService service) {
		super();
		this.service = service;
	}

	@GetMapping("/publish")
	public ResponseEntity<Object> messagePublish(@RequestParam("message") String message){
		service.messagePublish(message);
		return ResponseEntity.ok().build();
	}
}
