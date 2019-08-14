package com.demo.onlinebanking.repository;

import com.demo.onlinebanking.entity.SavingsAccount;
import org.springframework.data.repository.CrudRepository;


public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);
}