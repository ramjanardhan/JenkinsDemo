package com.janardhan.jenkins.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDemo 
{
    @RequestMapping(value="/" , method = RequestMethod.GET)
	public String restcall()
	{
		return "Jenkins overview";
	}
    
    @RequestMapping(value="/Rest", method = RequestMethod.POST)
	public String restcall1()
	{
		return "Sample Rest Call";
	}
	
}
