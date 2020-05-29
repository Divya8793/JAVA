package com.divya.SpringBoot.SpringBootConnection.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class SpringBootController {
	
	@RequestMapping("/user")
	public String checkConnection() {
		
		return "welcome to this page";
	}

}
