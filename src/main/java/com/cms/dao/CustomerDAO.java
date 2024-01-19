package com.cms.dao;

import java.util.LinkedList; 



import org.springframework.data.repository.CrudRepository;

import com.cms.bean.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
