package co.com.crud.usecase.findcustomer;

import co.com.crud.model.costumer.Customer;
import co.com.crud.model.costumer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class FindCustomerUseCase {

    private final CustomerRepository customerRepository;

    public Optional<Customer> findByUuid(String uuid){
        return customerRepository.findByUuid(uuid);
    }
}
