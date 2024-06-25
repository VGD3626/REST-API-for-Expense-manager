package com.JT.ExpenseManager.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;
    @Column(length = 30)
    private String name;

    public void setC_id(Long cId) {
        this.c_id = cId;
    }

    public Long getC_id() {
        return c_id;
    }

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Transaction> transactions;
}
