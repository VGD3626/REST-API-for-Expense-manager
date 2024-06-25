package com.JT.ExpenseManager.DAO;

import com.JT.ExpenseManager.entities.Friend;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FriendDAOi implements FriendDAO {

    private EntityManager entityManager;

    @Autowired
    public FriendDAOi(EntityManager em) {
        entityManager = em;
    }

    @Override
    @Transactional
    public Friend save(Friend friend) {
        entityManager.persist(friend);
        return friend;
    }

    @Override
    @Transactional
    public List<Friend> findAll() {
        return entityManager.createQuery("FROM Friend", Friend.class)
                .getResultList();
    }

    @Override
    @Transactional
    public Friend findById(Long id) {
        return entityManager.find(Friend.class, id);
    }

    @Override
    @Transactional
    public Friend deleteById(Long id) {
        Friend friend = findById(id);
        if (friend != null) {
            entityManager.remove(friend);
        }
        return friend;
    }

    @Override
    @Transactional
    public Friend update(Friend updatedFriend, Long id) {
        Friend existingFriend = findById(id);
        if (existingFriend != null) {
            existingFriend.setName(updatedFriend.getName());

            entityManager.merge(existingFriend);
        }
        return existingFriend;
    }
}
