package com.genie.ECommerce.service;

import com.genie.ECommerce.entity.Category;
import com.genie.ECommerce.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public Category getCategoryById(Integer id) {
        Optional<Category> category = categoryRepo.findById(id);

        if(category.isPresent()) {
            return category.get();
        }

        System.out.println("Category Not Present in database");
        return null;
    }

    public Category saveCategory(Category category) {
        return categoryRepo.save(category);
    }

    public void deleteCategory(Integer id) {

        Optional<Category> categoryOptional = categoryRepo.findById(id);

        if(categoryOptional.isPresent()) {
            categoryRepo.deleteById(id);
            System.out.println("Category deleted Successfully");
        }
        else{
            System.out.println("No Category present with given ID");
        }
    }

}
