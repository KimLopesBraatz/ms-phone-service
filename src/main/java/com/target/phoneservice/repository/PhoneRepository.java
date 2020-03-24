package com.target.phoneservice.repository;

import com.target.phoneservice.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

    Phone findByNumber(Long numero);
}
