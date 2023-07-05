package co.com.crud.usecase.createcustomer;

import co.com.crud.model.costumer.Customer;
import co.com.crud.model.costumer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class CreateCustomerUseCase {

    private final CustomerRepository customerRepository;

    public Customer createCustomer(){
        Customer customer = Customer.builder()
                .uuid(UUID.randomUUID().toString())
                .build();

        return customerRepository.save(customer);
    }
}
