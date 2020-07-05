package com.example.User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.User.Beans.User;
import com.example.User.Service.UserService;

@Controller
public class UserController {

	private User output;
	
	@Autowired
	private UserService service;
	
	@GetMapping("/user")
	public ModelAndView inputForm(Model model) {
		
		ModelAndView mav =  new ModelAndView();
		
	/*	model.addAttribute("user", new User());
		
		return "input";*/
		
		
			mav.setViewName("input");
			mav.addObject("user",new User());
			
			return mav;
	}
	
	@PostMapping("/user")
	public ModelAndView outputDetails(@ModelAttribute User user) {
		
		ModelAndView mav =  new ModelAndView();
		
		/*User user2 = new User();
		user2.setUserId(user.getUserId());
		user2.setUserName("gopal");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("output");
		mav.addObject("user2",user2);
		*/
		
		User record = service.findById(user.getUserId());
		mav.setViewName("output");
		mav.addObject("record",record);
		
		
		return mav;
	}
	
}
