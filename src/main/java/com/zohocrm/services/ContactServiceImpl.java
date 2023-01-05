package com.zohocrm.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
	
	
	@Autowired
	private ContactRepository contactrepo;

	@Override
	public void savecontact(Contact contact) {
		contactrepo.save(contact);
	}

	@Override
	public List<Contact> listallcontacts() {
		List<Contact> contacts = contactrepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContactByid(long id) {
		Optional<Contact> findById = contactrepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}
}
