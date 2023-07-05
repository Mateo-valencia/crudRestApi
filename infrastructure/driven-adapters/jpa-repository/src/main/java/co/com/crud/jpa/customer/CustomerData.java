package co.com.crud.jpa.customer;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tb_customer")
public class CustomerData {

    @Id
    @Column(name = "pk_uuid")
    private String uuid;
}
