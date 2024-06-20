package org.example.customerprovince.repository;

import org.example.customerprovince.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface IProvinceRepository extends CrudRepository<Province, Long> {
}
