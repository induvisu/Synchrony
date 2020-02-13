package com.hcl.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.bean.User;
import com.hcl.bean.User1;

@Controller
public class RegisterController {
	@RequestMapping(value="/index")
	public String emp()
	{
		
		return "reg";
		
	}
	@RequestMapping(value="/save",params="action1")
	public String save(Map<String,Object> map)
	{
		map.put("validationForm", new User());
		map.put("value", 0);
		return "registration";
					
	}
	@RequestMapping(value="/save",params="action2")
	public String save1(Map<String,Object> map)
	{
		map.put("validform", new User1());
		map.put("value", 1);
		return "registration";
					
	}
	@RequestMapping(value="/registration")
	public String empform(Map<String,Object> map)
	{
		map.put("validationForm", new User());
		return "registration";
		
	}
	@RequestMapping(value="/saveForm",params="action1")
	public ModelAndView saveform(@Validated @ModelAttribute("validationForm")User user,BindingResult result)
	{
		if(result.hasErrors())
		return new ModelAndView("registration");
		else
			return new ModelAndView("success");
			
		
	}
	@RequestMapping(value="/saveForm",params="action2")
	public ModelAndView saveform1(@Validated @ModelAttribute("validationForm")User user,BindingResult result)
	{
		if(result.hasErrors())
		return new ModelAndView("registration");
		else
			return new ModelAndView("success1");
			
		
	}
}     
