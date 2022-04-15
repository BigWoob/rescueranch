package com.techelevator.dao;

import com.techelevator.model.Account;

import java.util.List;

public interface AccountDao {
    Account createApplicant(Account account);
    Account getAccount(Long id);
    List<Account> getApplicants();
}
