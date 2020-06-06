package com.codegym.book.service.product;

import com.codegym.book.model.Product;
import com.codegym.book.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;
    @Override
    public Iterable<Product> getList() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }
}
