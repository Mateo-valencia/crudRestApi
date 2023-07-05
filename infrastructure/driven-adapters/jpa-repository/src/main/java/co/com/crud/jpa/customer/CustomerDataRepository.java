package co.com.crud.jpa.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface CustomerDataRepository extends CrudRepository<CustomerData, String>, QueryByExampleExecutor<CustomerData> {
}
