package io.dewe.project.service;

import io.dewe.project.customer.Customer;
import io.dewe.project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImplementations implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return this.customerRepository.findById(id);
    }

    @Override
    public Customer findByEmail(String email) {
        return this.customerRepository.findByEmail(email);
    }

}
