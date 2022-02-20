package io.dewe.project.service;

import io.dewe.project.customer.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerService {

   List<Customer> getAllCustomers();

    Optional<Customer> getCustomerById(Long id);

    Customer findByEmail(String email );
}
