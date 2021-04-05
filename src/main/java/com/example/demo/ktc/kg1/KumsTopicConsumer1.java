package com.example.demo.ktc.kg1;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class KumsTopicConsumer1 {

	
	@KafkaListener(topics = "deepatopic2", groupId="DG7")
	public void onMessage(ConsumerRecord<String, String> consumerRecord, Acknowledgment ack) {
		
		System.out.println(consumerRecord.toString());
		
		if(ack != null) {
			System.out.println("ack=" + ack.toString());
			//ack.acknowledge();
		} 
		else {
			System.out.println("ack is null");
		}
		
		//System.out.println("KTC1, KG1: key=" + key + ", value=" + value);
		
		
	}
	
//	@KafkaListener(topics = "deepatopic", groupId="KumsGroupId1")
//	public void onMessage(ConsumerRecord<String, String> consumerRecord) {
//		
//		System.out.println(consumerRecord.toString());
//		
//		
//		
//		//System.out.println("KTC1, KG1: key=" + key + ", value=" + value);
//		
//		
//	}
}
