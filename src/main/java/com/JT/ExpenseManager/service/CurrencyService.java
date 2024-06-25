package com.JT.ExpenseManager.service;

import com.JT.ExpenseManager.entities.Currency;

import java.util.List;

public interface CurrencyService {
    public Currency save(Currency c);
    public List<Currency> findAll();
    public Currency findById(Long id);
    public Currency deleteById(Long id);

    public Currency update(Currency c,Long id);
}
