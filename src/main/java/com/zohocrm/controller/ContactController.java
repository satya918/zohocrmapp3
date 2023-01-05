package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;
@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactservice;
	
	@Autowired
	private BillingService billingservice;
	
	
	@RequestMapping("/listcontact")
	public String listallcontact(Model model) {
		List<Contact> contacts = contactservice.listallcontacts();
		model.addAttribute("con", contacts);
		return"list_contact";
	}
	@RequestMapping("/createbill")
	public String createbill(@RequestParam("id")long id,Model model) {
		Contact contact = contactservice.getContactByid(id);
		model.addAttribute("contact", contact);
		return"generate_bill";
		
		
	}
	@RequestMapping("/savebill")
	public String savebill(Billing bill,Model model) {
		billingservice.generatebill(bill);
		
		List<Billing> allbills = billingservice.listallbill();
		model.addAttribute("bill", allbills);
		return"list_bill";
		
		
		
				
	}
	
}
