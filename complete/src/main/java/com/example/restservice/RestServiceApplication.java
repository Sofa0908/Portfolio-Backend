package com.example.restservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RestServiceApplication {

    @GetMapping("/resource")
    // @CrossOrigin(origins = "http://localhost:4200")
    @CrossOrigin(origins = "http://sofa-portfolio-host.s3-website-us-west-2.amazonaws.com")
	public ArrayList<HashMap<String, Object>> sayHi() {
        
        ArrayList<HashMap<String, Object>> model_list = new ArrayList<HashMap<String, Object>>();
        
        for (int i = 0; i < 2; i++){
            HashMap<String, Object> model = new HashMap<String, Object>();
            model.put("id", UUID.randomUUID().toString());
            model.put("content", "Saying Hi");
            model_list.add(model);
        }
        
        return model_list;
	}
    
    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }

}
