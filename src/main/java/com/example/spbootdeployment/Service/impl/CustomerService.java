package com.example.spbootdeployment.Service.impl;

import com.example.spbootdeployment.Service.CustomerServiceImpl;
import com.example.spbootdeployment.entity.Customer;
import com.example.spbootdeployment.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService implements CustomerServiceImpl {
    private final CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


}
