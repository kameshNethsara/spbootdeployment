package com.example.spbootdeployment.controller;

import com.example.spbootdeployment.Service.impl.CustomerService;
import com.example.spbootdeployment.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // Allow all origins for CORS
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping
    public String getCustomers() {
        return "List of customers";
    }

    @PostMapping
    public ResponseEntity<Customer> createProduct(@RequestBody Customer customer) {
        Customer createdProduct = customerService.saveCustomer(customer);
        return ResponseEntity.status(201).body(createdProduct);
    }
}
