package com.demo.onlinebanking.service;

import com.demo.onlinebanking.entity.PrimaryAccount;
import com.demo.onlinebanking.entity.SavingsAccount;

import java.security.Principal;


public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}