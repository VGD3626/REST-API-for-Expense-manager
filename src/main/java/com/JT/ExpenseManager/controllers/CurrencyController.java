package com.JT.ExpenseManager.controllers;

import com.JT.ExpenseManager.entities.Currency;
import com.JT.ExpenseManager.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CurrencyController {

    private CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @PostMapping("/currencies")
    public Currency addCurrency(@RequestBody Currency currency) {
        return currencyService.save(currency);
    }

    @GetMapping("/currencies")
    public List<Currency> allCurrencies() {
        return currencyService.findAll();
    }

    @GetMapping("/currencies/{id}")
    public Currency findCurrencyById(@PathVariable Long id) {
        return currencyService.findById(id);
    }

    @PutMapping("/currencies/{id}")
    public Currency updateCurrency(@RequestBody Currency currency, @PathVariable Long id) {
        return currencyService.update(currency, id);
    }

    @DeleteMapping("/currencies/{id}")
    public Currency deleteCurrency(@PathVariable Long id) {
        return currencyService.deleteById(id);
    }
}
