package com.demo.onlinebanking.repository;

import com.demo.onlinebanking.entity.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}