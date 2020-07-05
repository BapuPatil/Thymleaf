package com.example.User.Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@RestController
public class GenericExpHandler {
	
	
	@ExceptionHandler (UserNotFoundException.class)
	public ModelAndView exceptionHandler() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("exception");
		
		return mav;
	}

}
