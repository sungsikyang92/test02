package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profit")
public class ProfitController {
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
//	public String chkProfit() {
//		
//	}
//	
//	public String getMonthlyProfit() {
//		
//	}
//	
//	public String chkProfitByStore() {
//		
//	}
//	
//	public String getProfitGraphByStore() {
//		
//	}
}
