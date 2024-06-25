package com.JT.ExpenseManager.service;

import com.JT.ExpenseManager.DAO.CategoryDAO;
import com.JT.ExpenseManager.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoryServicei implements CategoryService {

    private CategoryDAO categoryDAO;

    @Autowired
    public CategoryServicei(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @Override
    public Category save(Category category) {
        return categoryDAO.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryDAO.findById(id);
    }

    @Override
    public Category deleteById(Long id) {
        return categoryDAO.deleteById(id);
    }

    @Override
    public Category update(Category category,Long id){
        return categoryDAO.update(category,id);
    }
}
