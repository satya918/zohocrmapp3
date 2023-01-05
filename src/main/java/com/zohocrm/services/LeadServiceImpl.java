package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadServices {
	
	@Autowired
	LeadRepository leadRepo;
	
	
	
	
	

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
		
	}

	@Override
	public Lead getbyId(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		  Lead lead = findById.get();
		  return lead;
		
	}

	@Override
	public void deletebyid(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public List<Lead> listallleads() {
			List<Lead> lead = leadRepo.findAll();
		return lead;
	}


}
