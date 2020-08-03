package com.test.web.app.controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TestController {
	
	@GetMapping(value="/hello")
	public String newUsuario(Model model, RedirectAttributes flash, Locale locale)
	{

		model.addAttribute("saludo", "Hola mundo");		
		return "saludo";
	}	

}
