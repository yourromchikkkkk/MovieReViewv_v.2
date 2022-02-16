package com.cursor.lobo.moviereview.controllers;


import com.cursor.lobo.moviereview.entity.Category;
import com.cursor.lobo.moviereview.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAll() {
        return categoryService.findAll();
    }
}
