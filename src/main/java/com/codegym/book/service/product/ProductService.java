package com.codegym.book.service.product;

import com.codegym.book.model.Product;

public interface ProductService {
    Iterable<Product> getList();

    Product save(Product product);

    void delete(Long id);

    Product findById(Long id);
}
