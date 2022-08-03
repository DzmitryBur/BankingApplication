package com.cot.bankingapplication.controller;

import com.cot.bankingapplication.entity.Transaction;
import com.cot.bankingapplication.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getAll() {
        return transactionService.getAll();
    }

    @GetMapping("/{id}")
    public Transaction getById(@PathVariable long id) {
        return transactionService.getById(id);
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        return transactionService.create(transaction);
    }

    @PutMapping
    public Transaction update(@RequestBody Transaction transaction) {
        return transactionService.update(transaction);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        transactionService.delete(id);
    }
}
