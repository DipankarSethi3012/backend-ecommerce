package com.genie.ECommerce.controller;

import com.genie.ECommerce.entity.Category;
import com.genie.ECommerce.service.CategoryService;
import org.hibernate.Internal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController {

    @Autowired
    CategoryService service;

    @GetMapping("/getAll")
    public List<Category> getAllCategory(){
        return service.getAllCategories();
    }

    @PostMapping("/save")
    public Category saveCategory(@RequestBody Category category) {
        return service.saveCategory(category);
    }

    @GetMapping("/get/{id}")
    public Category getCategoryById(@PathVariable Integer id) {
        return service.getCategoryById(id);
    }

    @DeleteMapping("/delete")
    public void deleteCategory(@PathVariable Integer id) {
        service.deleteCategory(id);
    }
}
