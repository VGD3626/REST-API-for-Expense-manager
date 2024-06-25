package com.JT.ExpenseManager.DAO;
import com.JT.ExpenseManager.entities.Transaction;
import java.util.List;

public interface TransactionDAO {
    public void save(Transaction t);
    public List<Transaction> findAll();
    public Transaction findById(Long id);
    public void deleteById(Long id);
    public void update(Transaction t);
}
