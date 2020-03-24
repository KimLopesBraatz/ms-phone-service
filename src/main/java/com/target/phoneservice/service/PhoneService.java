package com.target.phoneservice.service;

import com.target.phoneservice.domain.Phone;
import com.target.phoneservice.repository.PhoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PhoneService {

    private PhoneRepository repository;

    public Phone getPhoneByNumber(Long number) {
        return repository.findByNumber(number);
    }

    public List<Phone> save(List<Phone> phoneList) {
        return repository.saveAll(phoneList);
    }
}
