package com.JT.ExpenseManager.DAO;

import com.JT.ExpenseManager.entities.Currency;

import java.util.List;

public interface CurrencyDAO {

    public Currency save(Currency c);
    public List<Currency> findAll();
    public Currency findById(Long id);
    public Currency deleteById(Long id);

    public Currency update(Currency c,Long id);


}
