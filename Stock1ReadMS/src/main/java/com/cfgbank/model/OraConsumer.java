package com.cfgbank.model;


import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class OraConsumer {

	@KafkaListener(topics = "STOCK1", groupId="grp2")
	public void consume(String message){
		System.out.println(message);
		// you may call other applications from here
		// you may do some processing on this data and you can send it to another kafka topic
	}
}

