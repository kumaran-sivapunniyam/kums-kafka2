//package com.example.demo.ktc.kg1;
//
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KumsTopicConsumer3 {
//
//	
//	@KafkaListener(topics = "karthitopic", groupId="KumsGroupId1")
//	public void onMessage(ConsumerRecord<String, String> consumerRecord) {
//		
//		String key = consumerRecord.key();
//		String value = consumerRecord.value();
//		
//		
//		System.out.println("KTC3, KG1: key=" + key + ", value=" + value);
//		
//	}
//}
