package com.example.User.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.User.Beans.User;

@Controller
public class UserController {

	private User output;
	
	@GetMapping("/user")
	public String inputForm(Model model) {
		
		model.addAttribute("user", new User());
		
		return "input";
	}
	
	@PostMapping("/user")
	public ModelAndView outputDetails(@ModelAttribute User user) {
		
		
		User user2 = new User();
		
		user2.setUserId(user.getUserId());
		user2.setUserName("gopal");
//		user = user2;
		ModelAndView mav = new ModelAndView();
		mav.setViewName("output");
		mav.addObject("user2",user2);
		
		return mav;
	}
	
}
