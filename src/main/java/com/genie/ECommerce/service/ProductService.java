package com.genie.ECommerce.service;

import com.genie.ECommerce.entity.Category;
import com.genie.ECommerce.entity.Product;
import com.genie.ECommerce.repo.CategoryRepo;
import com.genie.ECommerce.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    // Get all products
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    // Get product by ID
    public Product getProductById(Integer id) {
        Optional<Product> product = productRepo.findById(id);

        // If the product exists, return it, else return null or handle with an exception
        return product.orElse(null);
    }

    // Save product
    public Product saveProduct(Product product) {
        // Check if category exists in the database

        return productRepo.save(product);
    }


    // Delete product
    public void deleteProduct(Integer id) {
        Optional<Product> product = productRepo.findById(id);

        if (product.isPresent()) {
            // If product exists, delete it
            productRepo.deleteById(id);
            System.out.println("Product deleted successfully");
        } else {
            // Handle case when product is not found
            System.out.println("Product not found with given ProductId");
        }
    }

    // Get products by category ID
//    public List<Product> getProductWithCategoryId(Integer id) {
//        Optional<Category> category = categoryRepo.findById(id);
//
//        // Check if the category exists
//        if (category.isPresent()) {
//            return productRepo.findByCategory_CategoryId(id);  // Assuming findByCategoryId is implemented in ProductRepo
//        } else {
//            // Handle invalid category
//            System.out.println("Invalid CategoryId");
//            return Collections.emptyList();
//        }
//    }
}
