package com.genie.ECommerce.controller;

import com.genie.ECommerce.entity.Product;
import com.genie.ECommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/get/{id}")
    public Product getProductWithId(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Integer id) {
         productService.deleteProduct(id);
    }

//    @GetMapping("/getwithCId/{id}")
//    public List<Product> getWithCategoryId(@PathVariable Integer id) {
//        return productService.getProductWithCategoryId(id);
//    }
}
