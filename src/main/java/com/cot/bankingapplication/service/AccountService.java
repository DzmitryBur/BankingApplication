package com.cot.bankingapplication.service;

import com.cot.bankingapphibernate.entity.Account;
import com.cot.bankingapphibernate.repository.AccountRepository;
import com.cot.bankingapplication.entity.Account;
import com.cot.bankingapplication.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    public Account getById(long id) {
        return accountRepository.getById(id);
    }

    public Account create(Account account) {
        return accountRepository.save(account);
    }

    public Account update(Account account) {
        return accountRepository.save(account);
    }

    public void delete(Long id) {
        accountRepository.deleteById(id);
    }

    public void transferMoneyFromFirstToSecondIban(String ibanFirst, String ibanSecond, long money){
        //1 вытащить 1 аккаунт по iban Account account1 =
        //2 вытащить 2 аккаунт по iban Account account2 =
        //3 Отнять у первого 500, создать транзакцию и createTransaction
        // добавить второму 500 создать транзакцию и createTransaction
        //4 update acc1 acc2
    }
}


