package com.JT.ExpenseManager.service;

import com.JT.ExpenseManager.DAO.CurrencyDAO;
import com.JT.ExpenseManager.entities.Currency;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CurrencyServicei implements CurrencyService {
    CurrencyDAO currencyDAO;

    @Autowired
    CurrencyServicei(CurrencyDAO cd) {
        currencyDAO = cd;
    }

    @Override
    @Transactional
    public Currency save(Currency c) {
        return currencyDAO.save(c);
    }

    @Override
    @Transactional
    public List<Currency> findAll() {
        return currencyDAO.findAll();
    }

    @Override
    public Currency findById(Long id) {
        return currencyDAO.findById(id);
    }

    @Override
    public Currency deleteById(Long id) {
        return currencyDAO.deleteById(id);
    }

    @Override
    public Currency update(Currency c,Long id) {
        return currencyDAO.update(c,id);
    }


}