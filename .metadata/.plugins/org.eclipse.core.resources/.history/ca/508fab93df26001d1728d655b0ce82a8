package com.example.demo.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;
import com.example.demo.service.MessageService;

@RestController
public class MessageRestController {
	
	@Autowired
	private MessageService service;
	
	@GetMapping("/message")
	public List<Message> listAll() {
		
		return service.lstAll();
	}
	
	@GetMapping("/message/pie")
	public List<Object[]> FrequencymsgType(){
		
		return service.countMessagesByType();
	}
}
