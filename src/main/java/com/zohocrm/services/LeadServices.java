package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadServices {
	
	public void saveLead(Lead lead);
	
	public Lead getbyId(long id);
	
	public void deletebyid(long id);

	public List<Lead> listallleads();

	

}
