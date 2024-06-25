package com.JT.ExpenseManager.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.util.List;

@Entity
@Check(constraints = "exchange_rate > 0")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long currencyId;
    @Column(unique = true)
    private String country;
    @Column(length = 30)
    private String name;
    double exchange_rate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExchange_rate() {
        return exchange_rate;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public void setExchange_rate(double exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    @OneToMany(mappedBy = "currency", cascade = CascadeType.ALL)
    private List<Transaction> transactions;
}
