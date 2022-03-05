package com.org.shop.services;


import com.org.shop.model.CustomerDetails;
import com.org.shop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServicesImp implements CustomerServices{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void create(CustomerDetails customerDetails) {
        customerRepository.save(customerDetails);
    }

    @Override
    public void update(CustomerDetails customerDetails) {
customerRepository.save(customerDetails);
    }

    @Override
    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerDetails> getAll() {
        return customerRepository.findAll();
    }
}
