package com.target.phoneservice.repository;

import com.target.phoneservice.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

    Phone findByNumber(Long numero);

    List<Phone> findByPersonId(Long personId);
}
