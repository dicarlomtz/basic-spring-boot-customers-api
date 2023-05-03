package com.dicarlomtz.example;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerResource {

    private final CustomerRepository customerRepository;

    public CustomerResource(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> retrieveCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping
    public void createCustomer(CreateCustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());

        customerRepository.save(customer);
    }

    @DeleteMapping(path = "{customerId}")
    public void removeCustomer(@PathVariable Integer customerId) {
        customerRepository.deleteById(customerId);
    }

    @PutMapping(path = "{customerId}")
    public void updateCustomer(@PathVariable Integer customerId, UpdateCustomerRequest request) {
        Customer customer = new Customer();
        customer.setId(customerId);
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());

        customerRepository.save(customer);
    }
}
