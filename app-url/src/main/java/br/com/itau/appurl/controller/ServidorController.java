package br.com.itau.appurl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServidorController {

	@GetMapping("/servidor")
	public String servidor() {
		return "servidor";
	}
	
}
