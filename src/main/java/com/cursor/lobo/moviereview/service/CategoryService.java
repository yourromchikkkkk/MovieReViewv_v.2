package com.cursor.lobo.moviereview.service;

import com.cursor.lobo.moviereview.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import com.cursor.lobo.moviereview.entity.Category;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Category findById(int id) {
        return categoryRepository.findById(id);
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
