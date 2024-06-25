package com.JT.ExpenseManager.controllers;

import com.JT.ExpenseManager.entities.Transaction;
import com.JT.ExpenseManager.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.event.ListDataEvent;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionController {

    TransactionService transactionService;

    @Autowired
    TransactionController(TransactionService t) {this.transactionService=t;}

    @PostMapping("/transactions")
    public void addTransaction(@RequestBody Transaction t) {
        transactionService.save(t);
    }

    @GetMapping("/transactions")
    public List<Transaction> allTransactions() {
        return transactionService.findAll();
    }

    @GetMapping("/transactions/{id}")
    public Transaction findTransactionById(@RequestBody Transaction t, @PathVariable Long id) {
        return transactionService.findById(id);
    }

    @PutMapping("/transactions/{id}")
    public void updateTransaction(@RequestBody Transaction t, @PathVariable Long id) {
        t.setT_id(id);
        transactionService.update(t);
    }

    @DeleteMapping("/transactions/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionService.deleteById(id);
    }
}
