package com.example.demo.Rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Informer;
import com.example.demo.model.Message;
import com.example.demo.service.MessageService;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class MessageRestController {
	
	@Autowired
	private MessageService service;
	
	@GetMapping("/message")
	public List<Message> listAll() {
		
		return service.lstAll();
	}
	
	@GetMapping("/message/allpie")
	public Informer AllFrequencymsgType(){
		
		return service.countMessagesByType();
		
	}
	
	@GetMapping("/message/pie")
	public Informer msgFrequency() {
		
		return service.PieMessages();
	}
}
