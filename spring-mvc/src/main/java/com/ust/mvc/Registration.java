package com.ust.mvc;

//https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/register") // in http bar.
public class Registration {
//	@GetMapping
//	public String respond(Model model) {
//		model.addAttribute("mytech", "Developer");
//		model.addAttribute("location", "Thiruvananthapuram");
//		return "response2";
	
	
	@PostMapping
	public  String signup( 
			@RequestParam("username") String username,
		@RequestParam("mailId")String mailId,Model model) { // Model object will elevate the data.Some data will be kept inside the file itself.
				if(username.length()>6 && mailId.length()>6) {
					model.addAttribute("uname", username);
				model.addAttribute("mail", mailId);
					return "success";
				}
				else
					return "error";
	}

}
