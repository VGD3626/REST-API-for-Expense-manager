package com.JT.ExpenseManager.service;

import com.JT.ExpenseManager.entities.Friend;

import java.util.List;

public interface FriendService {
    public Friend save(Friend f);
    public List<Friend> findAll();
    public Friend findById(Long id);
    public Friend deleteById(Long id);
    public Friend update(Friend f,Long id);
}
