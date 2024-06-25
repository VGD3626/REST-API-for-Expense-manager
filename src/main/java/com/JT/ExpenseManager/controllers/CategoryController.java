package com.JT.ExpenseManager.controllers;

import com.JT.ExpenseManager.entities.Category;
import com.JT.ExpenseManager.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @PutMapping("/categories/{id}")
    public Category updateCategory(@RequestBody Category category, @PathVariable Long id) {
        return categoryService.update(category, id);
    }

    @DeleteMapping("/categories/{id}")
    public Category deleteCategoryById(@PathVariable Long id) {
        return categoryService.deleteById(id);
    }
}
