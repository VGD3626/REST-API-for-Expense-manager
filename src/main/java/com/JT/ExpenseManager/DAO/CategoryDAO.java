package com.JT.ExpenseManager.DAO;

import com.JT.ExpenseManager.entities.Category;
import java.util.List;

public interface CategoryDAO {
    public Category save(Category c);
    public List<Category> findAll();
    public Category findById(Long id);
    public Category deleteById(Long id);
    public Category update(Category category,Long id);
}
