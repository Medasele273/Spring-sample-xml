package com.meda.repository;

import java.util.List;

import com.meda.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}