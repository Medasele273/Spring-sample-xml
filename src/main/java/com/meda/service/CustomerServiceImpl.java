package com.meda.service;

import java.util.List;

import com.meda.model.Customer;
import com.meda.repository.CustomerRepository;
import com.meda.repository.HibernateCustomerRepositoryImpl; 

public class CustomerServiceImpl implements  CustomerService {
	
	private CustomerRepository customerRepository ;
	
	public CustomerServiceImpl() {
		
	}
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}
	@Override
	public List<Customer> findAll(){
		
		return customerRepository.findAll();
	}
  
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	
}
