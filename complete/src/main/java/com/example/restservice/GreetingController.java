package com.example.restservice;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/Hii")
	// @CrossOrigin(origins = "http://localhost:4200/conn")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Guys") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
