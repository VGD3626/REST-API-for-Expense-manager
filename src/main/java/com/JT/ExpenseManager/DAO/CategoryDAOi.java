package com.JT.ExpenseManager.DAO;

import com.JT.ExpenseManager.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CategoryDAOi implements CategoryDAO {
    EntityManager entityManager;

    @Autowired
    public CategoryDAOi(EntityManager em) {
        this.entityManager = em;
    }

    @Override
    @Transactional
    public Category save(Category category) {
        entityManager.persist(category);
        return category;
    }

    @Override
    @Transactional
    public List<Category> findAll() {
        Query query = entityManager.createQuery("FROM Category", Category.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public Category findById(Long id) {
        return entityManager.find(Category.class, id);
    }

    @Override
    @Transactional
    public Category deleteById(Long id) {
        Category category = findById(id);
        if (category != null) {
            entityManager.remove(category);
        }
        return category;
    }

    @Override
    @Transactional
    public Category update(Category updatedCategory, Long id) {
        Category existingCategory = findById(id);
        if (existingCategory != null) {
            existingCategory.setName(updatedCategory.getName());

            entityManager.merge(existingCategory);
        }
        return existingCategory;
    }
}
