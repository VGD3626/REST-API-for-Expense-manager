package com.JT.ExpenseManager.DAO;

import com.JT.ExpenseManager.entities.Transaction;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionDAOi implements TransactionDAO {
    EntityManager entityManager;

    @Autowired
    TransactionDAOi(EntityManager em) {
        entityManager = em;
    }

    @Override
    public void save(Transaction t) {
        entityManager.merge(t);
    }

    @Override
    public List<Transaction> findAll() {
        Query Q = entityManager.createQuery("from Transaction",Transaction.class);
        return Q.getResultList();
    }

    @Override
    public Transaction findById(Long id) {
        return entityManager.find(Transaction.class, id);
    }

    @Override
    public void deleteById(Long id) {
        entityManager.remove(findById(id));
    }

    @Override
    public void update(Transaction t) {
        entityManager.merge(t);
    }
}
