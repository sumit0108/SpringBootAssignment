package com.Assignment1.SBA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SBControler {
	
	//Part-1
	@RequestMapping("/bankName")
	public ModelAndView getBankName()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("bankName", "Punjab National Bank"); 
		mv.setViewName("bankName");
		return mv;
	}
	//Part-2
	@RequestMapping("/bankAddress")
	public ModelAndView getBankAddress()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("bankAddress", "Mohan Nagar"); 
		mv.setViewName("bankAddress");
		return mv;
	}


}
