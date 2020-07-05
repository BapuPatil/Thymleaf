package com.example.User.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.User.Beans.User;

@Controller
public class UserController {

	
	@GetMapping("/user")
	public String inputForm(Model model) {
		
		model.addAttribute("user", new User());
		
		return "input";
	}
	
}
