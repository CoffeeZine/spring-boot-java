package com.example.SpringWebTesting;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWebTestingApplication {

	@GetMapping("/start")
	public String hello(@RequestParam(value = "start", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
