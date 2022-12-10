package com.Assignment2.SBA2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {	
	List<Bank> bank=new ArrayList<Bank>();
	
	@RequestMapping("/branche")
	//@ResponseBody
	public ModelAndView getbranches()
	{
		ModelAndView mv=new ModelAndView();
		Bank m1= new Bank("Kasturi Nagar");
		Bank m2=new Bank("Main Gandhi Nagar");
		Bank m3=new Bank("Giri Nagar");
		Bank m4=new Bank("Jai Bheema Nagar,");
		Bank m5=new Bank("Seshadripuram");
		Bank m6=new Bank("Konankunte Crosskanakpura Road");
		Bank m7=new Bank("Bannerghatta Rd");
		Bank m8=new Bank("Netaji Circle Mathikere");
		Bank m9=new Bank("Davanagere");
		Bank m10=new Bank("Infantry Road");
		bank.add(m1);
		bank.add(m2);
		bank.add(m3);
		bank.add(m4);
		bank.add(m5);
		bank.add(m6);
		bank.add(m7);
		bank.add(m8);
		bank.add(m9);
		bank.add(m10);
		mv.addObject("Banks",bank);
		mv.setViewName("branche");
		return mv;
	}
	
	@RequestMapping("/Services")
	public String services() {
		
		return "services";
	}
	
	
	

}
