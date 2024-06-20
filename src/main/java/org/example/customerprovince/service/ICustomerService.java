package org.example.customerprovince.service;

import org.example.customerprovince.model.Customer;
import org.example.customerprovince.model.Province;

import java.util.Optional;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}


