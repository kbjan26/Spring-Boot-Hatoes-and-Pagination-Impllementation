package com.spring.hateos.springbootdemo.repository;

import com.spring.hateos.springbootdemo.persistence.BankDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface BankDetailsRepository extends PagingAndSortingRepository<BankDetailsEntity, Long> {

    Optional<BankDetailsEntity> findById(Long id);
}
