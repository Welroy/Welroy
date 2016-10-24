package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController
{
	
	@RequestMapping("/")
	public String homepage()
	     {		
		return "index";
         }
	
	@RequestMapping("/login")
	public String login()
	     {		
		return "Login";
         }
	@RequestMapping("/About")
	public String about()
	     {		
		return "Nike";
         }
	@RequestMapping("/Register")
	public String register()
	     {		
		return "Register";
         }
	@RequestMapping("/myAccount")
	public String myAccount()
	     {		
		return "myAccount";
         }
	@RequestMapping(value= "/Validate")
	public String validate(@RequestParam(value="uname") String name,@RequestParam(value="pswd") String pwd, Model model)
	     {		
		if(name.equals("Welroy") && pwd.equals("qwer1234"))
		   {
		      model.addAttribute("successMessage", "You Have Successfully Login");
		      return "product";
		      
		    }
		else
		   {
			model.addAttribute("errorMessage", "Invalid Credentials... Please try again");
			return "Login";
			
			}
		
         }
	@RequestMapping("/product")
	public String Product()
	     {		
		return "product";}
	
}
