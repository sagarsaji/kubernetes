package com.example.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetesApplication {

	@GetMapping("/world")
		public String hello(){
			return "Hello World";
		}


	public static void main(String[] args) {
		SpringApplication.run(KubernetesApplication.class, args);
	}

}
