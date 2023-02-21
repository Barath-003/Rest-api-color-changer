package com.example.color;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colorchange {
	@GetMapping("/ok")
    public String my() {
		String color="Green";
		return "My favorite color is "+color;
	}
}
