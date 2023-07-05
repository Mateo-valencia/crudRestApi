package co.com.crud.jpa.customer;

import co.com.crud.jpa.helper.AdapterOperations;
import co.com.crud.model.costumer.Customer;
import co.com.crud.model.costumer.gateways.CustomerRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerDataRepositoryAdapter extends AdapterOperations<Customer, CustomerData, String, CustomerDataRepository>
        implements CustomerRepository
{

    @Autowired
    public CustomerDataRepositoryAdapter(CustomerDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Customer.CustomerBuilder.class).build());
    }

    @Override
    public Optional<Customer> findByUuid(String uuid) {
        return repository.findById(uuid)
                .map(this::toEntity);
    }

    @Override
    public void deleteCustomer(String uuid) {
        repository.deleteById(uuid);
    }
}
