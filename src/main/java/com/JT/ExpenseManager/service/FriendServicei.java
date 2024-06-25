package com.JT.ExpenseManager.service;

import com.JT.ExpenseManager.DAO.FriendDAO;
import com.JT.ExpenseManager.entities.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServicei implements FriendService {

    private final FriendDAO friendDAO;

    @Autowired
    public FriendServicei(FriendDAO friendDAO) {
        this.friendDAO = friendDAO;
    }

    @Override
    public Friend save(Friend friend) {
        return friendDAO.save(friend);
    }

    @Override
    public List<Friend> findAll() {
        return friendDAO.findAll();
    }

    @Override
    public Friend findById(Long id) {
        return friendDAO.findById(id);
    }

    @Override
    public Friend deleteById(Long id) {
        return friendDAO.deleteById(id);
    }

    @Override
    public Friend update(Friend friend, Long id) {
        return friendDAO.update(friend, id);
    }
}
