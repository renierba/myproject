/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.microservice.product.service;

import com.microservice.product.entity.Category;
import com.microservice.product.entity.Product;
import java.util.List;

/**
 *
 * @author rbatista
 */
public interface ProductService {
    
    
    public List<Product> listAllProduct();
    public Product getProduct(Long id);
    public Product createProduct(Product p);
    public Product updateProduct(Product p);
    public Product deleteProduct(Long id);
    public List<Product> findByCategory(Category cat);
    public Product updateStock(Long id, int stock);
    
    
    
}
