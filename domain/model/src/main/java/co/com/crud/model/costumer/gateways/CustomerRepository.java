package co.com.crud.model.costumer.gateways;

import co.com.crud.model.costumer.Customer;

import java.util.Optional;

public interface CustomerRepository {

    Customer save(Customer customer);

    Optional<Customer> findByUuid(String uuid);

    void deleteCustomer(String uuid);
}
