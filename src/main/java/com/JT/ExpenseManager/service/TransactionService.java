package com.JT.ExpenseManager.service;

import com.JT.ExpenseManager.entities.Transaction;
import java.util.List;

public interface TransactionService {
    public void save(Transaction f);
    public List<Transaction> findAll();
    public Transaction findById(Long id);
    public void deleteById(Long id);
    public void update(Transaction f);
}
