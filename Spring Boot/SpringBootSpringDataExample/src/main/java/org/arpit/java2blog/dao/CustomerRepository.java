
package org.arpit.java2blog.dao;

import org.arpit.java2blog.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Integer> { 
    
}
