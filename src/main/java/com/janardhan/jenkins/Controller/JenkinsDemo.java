package com.janardhan.jenkins.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDemo 
{
    @RequestMapping("/")
	public String restcall()
	{
		return "Jenkins overview";
	}
    
    @RequestMapping("/Rest")
	public String restcall1()
	{
		return "Sample Rest Call";
	}
	
}
