package com.api.market.devmarket.domain.repository;

import com.api.market.devmarket.domain.Product;

import java.util.List;
import java.util.Optional;

//Product es un dominio
public interface ProductRepository {
     List<Product> getAll();
     Optional<List<Product>> getCategory(int categoryId);
     Optional<List<Product>> getScarseProducts(int quantity);
     Optional<Product> getProduct(int productId);
     Product save(Product product);
     void deletete(int productId);
}
