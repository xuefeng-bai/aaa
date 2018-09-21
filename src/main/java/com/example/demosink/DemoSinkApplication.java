package com.example.demosink;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import com.example.demosink.DatabaseInfo;



@SpringBootApplication
@EnableBinding(Sink.class)
public class DemoSinkApplication {
	
	private static Logger logger = LoggerFactory.getLogger(DemoSinkApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoSinkApplication.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void handle(String message){
		
		logger.info("received message: "+message);
		
	}
	
	
}