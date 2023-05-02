package com.ust.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/home") // User will make request to the controler and controller decides what to do.
public class HomeController {
	@GetMapping
	public String respond(Model model) {
//		model.addAttribute("mytech", "Developer");
//		model.addAttribute("location", "Thiruvananthapuram");
		return "register";
	}

}
