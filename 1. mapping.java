package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/hello") // hello 메서드 매핑
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
