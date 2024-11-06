package com.genie.ECommerce.repo;

import com.genie.ECommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    // Modify the method to query the category's categoryId
//    List<Product> findByCategory_CategoryId(Integer categoryId);
}
