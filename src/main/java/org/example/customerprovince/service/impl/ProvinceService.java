package org.example.customerprovince.service.impl;

import org.example.customerprovince.model.Province;
import org.example.customerprovince.repository.IProvinceRepository;
import org.example.customerprovince.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceService implements IProvinceService {
    private final IProvinceRepository iProvinceRepository;
    @Autowired
    public ProvinceService(IProvinceRepository provinceRepository) {
        this.iProvinceRepository = provinceRepository;
    }

    @Override
    public Iterable<Province> findAll() {
        return iProvinceRepository.findAll();
    }

    @Override
    public void save(Province province) {
         iProvinceRepository.save(province);
    }


    @Override
    public Optional<Province> findById(Long id) {
        return iProvinceRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iProvinceRepository.deleteById(id);
    }
}
