package com.evaluable.web.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/asignaturas")

public class asignaturasController {
	
	@Value("asignaturas")
	private String tituloEnClaseControladora;
	@GetMapping("/")
	public String asiganturas(Model model) {
	
		model.addAttribute("titulo", "");
		model.addAttribute("titular", "");
		model.addAttribute("parrafo", "");

		return "asignaturas";
		
	}
}
	