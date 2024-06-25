package com.JT.ExpenseManager.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long f_id;

    @Column(length = 30)
    private String name;

    public void setF_id(Long id) {
        System.out.println("setter for f_id...");
        this.f_id = id;
    }

    public Long getF_id() {
        return f_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "friend", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

}