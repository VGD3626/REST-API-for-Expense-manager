package com.JT.ExpenseManager.service;

import com.JT.ExpenseManager.DAO.TransactionDAO;
import com.JT.ExpenseManager.entities.Transaction;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServicei implements TransactionService {

    TransactionDAO transactionDAO;

    @Autowired
    TransactionServicei(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    @Override
    @Transactional
    public void save(Transaction f) {
        transactionDAO.save(f);
    }

    @Override
    @Transactional
    public List<Transaction> findAll() {
        return transactionDAO.findAll();
    }

    @Override
    @Transactional
    public Transaction findById(Long id) {
        return transactionDAO.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        transactionDAO.deleteById(id);
    }

    @Override
    @Transactional
    public void update(Transaction f) {
        transactionDAO.update(f);
    }
}
