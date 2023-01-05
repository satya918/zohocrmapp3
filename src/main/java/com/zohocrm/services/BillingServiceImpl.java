package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	BillingRepository billingrepo;

	@Override
	public void generatebill(Billing bill) {
		billingrepo.save(bill);
		
		

	}

	@Override
	public List<Billing> listallbill() {
		List<Billing> bills = billingrepo.findAll();
		return bills;
	}

}
