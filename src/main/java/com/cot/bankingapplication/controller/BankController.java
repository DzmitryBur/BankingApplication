package com.cot.bankingapplication.controller;

import com.cot.bankingapphibernate.entity.Bank;
import com.cot.bankingapphibernate.service.BankService;
import com.cot.bankingapplication.entity.Bank;
import com.cot.bankingapplication.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping
    public List<Bank> getAll() {
        return bankService.getAll();
    }

    @GetMapping("/{id}")
    public Bank getById(@PathVariable long id) {
        return bankService.getById(id);
    }

    @PostMapping
    public Bank create(@RequestBody Bank bank) {
        return bankService.create(bank);
    }

    @PutMapping
    public Bank update(@RequestBody Bank bank) {
        return bankService.update(bank);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        bankService.delete(id);
    }
}
