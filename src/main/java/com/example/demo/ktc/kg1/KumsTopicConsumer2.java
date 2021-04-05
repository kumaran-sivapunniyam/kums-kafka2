//package com.example.demo.ktc.kg1;
//
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KumsTopicConsumer2 {
//
//	
//	@KafkaListener(topics = "karthitopic", groupId="KumsGroupId1")
//	public void onMessage(ConsumerRecord<String, String> consumerRecord) {
//		
//		String key = consumerRecord.key();
//		String value = consumerRecord.value();
//		
//		
//		System.out.println("KTC2, KG1: key=" + key + ", value=" + value);
//		
//	}
//}
