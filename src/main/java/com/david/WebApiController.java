package com.david;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApiController {
	
	@GetMapping("/hi")
	public String hello() {
		return "hi";
	}
	
	@GetMapping("/1")
	public WebApiModel getWeb1(@RequestParam(value="name", defaultValue = "Davi")String name) {
		return new WebApiModel(1, name);
	}
}
