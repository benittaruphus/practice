package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		Demo1Application d = new Demo1Application();
		d.getAndWritePersons();
	}
	
	
	public void getAndWritePersons()
	{
		FileWriteService writeService = new FileWriteService();
		writeService.chunkList();
	}

}
