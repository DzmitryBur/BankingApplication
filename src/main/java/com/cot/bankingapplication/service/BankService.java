package com.cot.bankingapplication.service;

import com.cot.bankingapplication.entity.Bank;
import com.cot.bankingapplication.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    private BankRepository bankRepository;

    public List<Bank> getAll() {
        return bankRepository.findAll();
    }

    public Bank getById(long id) {
        return bankRepository.getById(id);
    }

    public Bank create(Bank bank) {
        return bankRepository.save(bank);
    }

    public Bank update(Bank bank) {
        return bankRepository.save(bank);
    }

    public void delete(Long id) {
        bankRepository.deleteById(id);
    }
}

