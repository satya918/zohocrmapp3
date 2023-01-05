package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadServices;

@Controller
public class LeadController {
	
	
	@Autowired
	LeadServices leadservice;
	
	
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/createLead")
	public String viewCreateLead() {
		
		return"create_lead";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveoneLead(@ModelAttribute("lead")Lead lead,Model model) {
		
		leadservice.saveLead(lead);
		model.addAttribute("lead", lead);		
		return"lead_info";
	}
	@RequestMapping("/convertlead")
	public String convertlead(@RequestParam("id")long id,Model model) {
		Lead lead = leadservice.getbyId(id);
		
		Contact contact=new Contact();
		contact.setFirstname(lead.getFirstname());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactservice.savecontact(contact);
		
		leadservice.deletebyid(id);
		
		List<Contact> contacts = contactservice.listallcontacts();
		model.addAttribute("con", contacts);
		
		return"list_contact";
		
	}
	@RequestMapping("/listall")
	public String listall(Model model) {
		List<Lead> listallleads = leadservice.listallleads();
		model.addAttribute("lead", listallleads);
		return"list_leads";
	}
	@RequestMapping("/leadinfo")
	public String leadinfo(@RequestParam("id")long id,Model model) {
		Lead lead = leadservice.getbyId(id);
		model.addAttribute("lead", lead);
		return"lead_info";
	}
	
	
}
