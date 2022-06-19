package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.dto.TestDto;
import com.test.service.TestService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TestController {
	
	private final TestService testService;
	
	@GetMapping("/")
	public String mainPage() {
		return "input";
	}
	
	@GetMapping("/test.do")
	public String testInput(TestDto dto) {
		testService.testInput(dto);
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto.getAddr());
		return "input";
	}
}
