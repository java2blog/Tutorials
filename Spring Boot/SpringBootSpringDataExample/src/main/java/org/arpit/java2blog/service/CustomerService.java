
package org.arpit.java2blog.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.arpit.java2blog.dao.CustomerRepository;
import org.arpit.java2blog.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Transactional
	public List<Customer> getAllCustomers() {
		List<Customer> customers=new ArrayList<Customer>();
		Iterable<Customer> customersIterable=customerRepository.findAll();
		Iterator<Customer> customersIterator=customersIterable.iterator();
		while(customersIterator.hasNext())
		{
			customers.add(customersIterator.next());
		}
		return customers;
	}

	@Transactional
	public Customer getCustomer(int id) {
		return customerRepository.findOne(id);
	}

	@Transactional
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Transactional
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);

	}

	@Transactional
	public void deleteCustomer(int id) {
		customerRepository.delete(id);
	}
}
