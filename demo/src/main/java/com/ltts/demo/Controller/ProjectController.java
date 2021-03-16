package com.ltts.demo.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProjectController {

@RequestMapping("/hii")
public String firstMethod()
{
	return "hello SpringBoot";
}
	
@RequestMapping("/")
public ModelAndView secondMethod()
{
	return new ModelAndView("index");
}
	
}


