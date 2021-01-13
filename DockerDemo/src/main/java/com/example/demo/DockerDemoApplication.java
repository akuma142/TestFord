package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoApplication {
	@GetMapping("/a")
	public String  message()
	{
		return "Hellow to Docker World!!";
	}
	@GetMapping("/b")
	public String  message2(String message)
	{
		return message+"Hellow to Docker World!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
