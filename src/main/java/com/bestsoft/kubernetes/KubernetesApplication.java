package com.bestsoft.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetesApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Kubernetes!";
	}

	public static void main(String[] args) {
		SpringApplication.run(KubernetesApplication.class, args);
	}

}
