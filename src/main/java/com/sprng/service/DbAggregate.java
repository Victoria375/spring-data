package com.sprng.service;

import com.sprng.model.Product;
import com.sprng.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DbAggregate {

    @Autowired
    private ProductRepository productRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void fillDatabaseOnStartApplication() {
        productRepository.save(createProduct("Bread", 50));
        productRepository.save(createProduct("Milk", 20));
        productRepository.save(createProduct("Apple", 32));
        productRepository.save(createProduct("Orange", 10));
        productRepository.save(createProduct("Water", 25));
        productRepository.save(createProduct("Phone", 1000));
        productRepository.save(createProduct("Computer", 5000));
        productRepository.save(createProduct("Lipstick", 100));
        productRepository.save(createProduct("Pencil", 56));
        productRepository.save(createProduct("Bag", 123));
        productRepository.save(createProduct("Hat", 135));
        productRepository.save(createProduct("Dress", 160));
        productRepository.save(createProduct("Napkins", 11));
        productRepository.save(createProduct("Orange", 10));
        productRepository.save(createProduct("Cup", 54));
        productRepository.save(createProduct("Glass", 60));
        productRepository.save(createProduct("Mirror", 74));
        productRepository.save(createProduct("Chair", 117));
        productRepository.save(createProduct("Table", 155));
        productRepository.save(createProduct("Earrings", 111));
    }

    private Product createProduct(String title, int price) {
        Product product = new Product();
        product.setTitle(title);
        product.setPrice(price);
        return product;
    }
}
