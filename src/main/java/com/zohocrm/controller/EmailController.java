package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.utill.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	EmailService emailservice;

	
	@RequestMapping("/composeEmail")
	public String email(@RequestParam("email")String email,Model model) {
		model.addAttribute("mail", email);
		return"compose_email";
	}
	

	@RequestMapping("/compose_email")
	public String sendemail(@RequestParam("to")String to,@RequestParam("sub")String sub,@RequestParam("msg")String msg,Model model) {
		emailservice.sendEmail(to, sub, msg);
		model.addAttribute("msg", "Message sent sucessfully!!1");
		return"compose_email";
	}
}
