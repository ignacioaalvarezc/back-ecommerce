package com.app.ecommerce.service;

import com.app.ecommerce.model.Product;
import com.app.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImplements implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product newProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }

    @Override
    public Product updateProduct(Product product) {
        Optional<Product> productFound= this.productRepository.findById(product.getId());
        if(productFound.get() != null){
            productFound.get().setName(product.getName());
            productFound.get().setDescription(product.getDescription());
            productFound.get().setAmount(product.getAmount());
            productFound.get().setPrice(product.getPrice());
            productFound.get().setImage(product.getImage());
            return this.newProduct(productFound.get());
        }
        return null;
    }

    @Override
    public Iterable<Product> getAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Boolean deleteProduct(Long idProduct) {
        this.productRepository.deleteById(idProduct);
        return true;
    }
}
