package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSenderService {
	
//	@Autowired
//	private KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping("/sendMessage")
	public String sendMessageToKafka(@RequestParam String message) {
		//System.out.println("KafkaSenderService.sendMessageToKafka");
//		for(int i=0; i<100; i++)
//			kafkaTemplate.send("karthitopic", message + "-" + i);
		return "Message sent...";
	}
	
	
	
}
