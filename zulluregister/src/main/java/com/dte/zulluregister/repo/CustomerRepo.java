package com.dte.zulluregister.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dte.zulluregister.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String>{
	
	@Query("select c from Customer c where c.username=:username")
    public List<Customer> getAllCustomersBasedOnUsername(String username);

}