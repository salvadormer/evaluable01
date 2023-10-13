package com.evaluable.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
	
	@GetMapping({"/", "/home" , "/home/"})
	public String homeHandler(Model model) {
		model.addAttribute("tituloH1", "Asignaturas");
		model.addAttribute("parrafo", "ipsum dolor sit amet, consectetur adipiscing elit.");
		return "home";
	}

}
