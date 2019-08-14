package com.demo.onlinebanking.repository;

import com.demo.onlinebanking.entity.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;


public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
}