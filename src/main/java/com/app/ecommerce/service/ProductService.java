package com.app.ecommerce.service;

import com.app.ecommerce.model.Product;
import org.springframework.stereotype.Service;

public interface ProductService {
    Product newProduct(Product newProduct);

    Iterable<Product> getAll();
    Product updateProduct(Product product);
    Boolean deleteProduct(Long idProduct);
}
