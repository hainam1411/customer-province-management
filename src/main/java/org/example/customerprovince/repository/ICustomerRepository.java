package org.example.customerprovince.repository;

import org.example.customerprovince.model.Customer;
import org.example.customerprovince.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
