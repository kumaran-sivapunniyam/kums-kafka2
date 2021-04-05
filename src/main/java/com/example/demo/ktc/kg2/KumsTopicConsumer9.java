package com.example.demo.ktc.kg2;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class KumsTopicConsumer9 {

	
	@KafkaListener(topics = "kumstopic", groupId="KumsGroupId2")
	public void onMessage(ConsumerRecord<String, String> consumerRecord) {
		
		String key = consumerRecord.key();
		String value = consumerRecord.value();
		
		
		System.out.println("KTC9, KG2: key=" + key + ", value=" + value);
		
	}
}
