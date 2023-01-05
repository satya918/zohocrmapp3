package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactService {
	public void savecontact(Contact contact);
	public List<Contact> listallcontacts();
	public Contact getContactByid(long id);

}
