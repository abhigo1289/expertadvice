package com.springmvcdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView getdata(HttpServletResponse response,HttpServletRequest request){
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		
		if(name.equals("loki") && (pass.equals("123"))){
			return new ModelAndView("welcome","msg","Hello");
		}
		else{
			return new ModelAndView("error","msg","Sorry u have entered wrong username or password");
		}
	}
}
