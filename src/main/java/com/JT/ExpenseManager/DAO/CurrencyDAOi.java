package com.JT.ExpenseManager.DAO;

import com.JT.ExpenseManager.entities.Currency;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CurrencyDAOi implements CurrencyDAO {

    EntityManager entityManager;

    @Autowired
    public CurrencyDAOi(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Currency save(Currency currency) {
        entityManager.persist(currency);
        return currency;
    }

    @Override
    @Transactional
    public List<Currency> findAll() {
        return entityManager.createQuery("FROM Currency", Currency.class)
                .getResultList();
    }

    @Override
    @Transactional
    public Currency findById(Long id) {
        return entityManager.find(Currency.class, id);
    }

    @Override
    @Transactional
    public Currency deleteById(Long id) {
        Currency currency = findById(id);
        if (currency != null) {
            entityManager.remove(currency);
        }
        return currency;
    }

    @Override
    @Transactional
    public Currency update(Currency updatedCurrency, Long id) {
        Currency existingCurrency = findById(id);
        if (existingCurrency != null) {
            existingCurrency.setName(updatedCurrency.getName());
            existingCurrency.setCountry(updatedCurrency.getCountry());
            existingCurrency.setExchange_rate(updatedCurrency.getExchange_rate());

            entityManager.merge(existingCurrency);
        }
        return existingCurrency;
    }
}
