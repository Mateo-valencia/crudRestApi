package co.com.crud.usecase.deletecustomer;

import co.com.crud.model.costumer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class DeleteCustomerUseCase {

    private final CustomerRepository customerRepository;

    public String deleteCustomerRepository(String uuid){
        customerRepository.deleteCustomer(uuid);
        return "The Customer was deleted Succesful";
    }
}
