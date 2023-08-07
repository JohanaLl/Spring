package com.api.market.devmarket.domain.service;

import com.api.market.devmarket.domain.Product;
import com.api.market.devmarket.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }
    public Optional<Product> getProduct(int productId) {
        return productRepository.getProduct(productId);
    }
    public Optional<List<Product>> getByCategory(int categoryId) {
        return productRepository.getByCategory(categoryId);
    }
    public Product save(Product product) {
        return productRepository.save(product);
    }
    public boolean deletete(int productId) {
        productRepository.deletete(productId);
        return getProduct(productId).map(product -> {
            productRepository.deletete(productId);
            return true;
        }).orElse(false);
    }

}
