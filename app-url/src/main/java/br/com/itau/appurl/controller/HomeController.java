package br.com.itau.appurl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/tables")
	public String tables() {
		return "tables";
	}
	
	@GetMapping("/charts")
	public String charts() {
		return "charts";
	}
	
	@GetMapping("/buttons")
	public String buttons() {
		return "buttons";
	}
	
	@GetMapping("/cards")
	public String cards() {
		return "cards";
	}
	
	@GetMapping("/servidores")
	public String servidores() {
		return "servidores";
	}
}
