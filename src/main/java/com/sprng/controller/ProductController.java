package com.sprng.controller;

import com.sprng.model.Product;
import com.sprng.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productRepository.getReferenceById(id);
    }

    @GetMapping
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/add/{title}/{price}")
    public String addProduct(@PathVariable String title, @PathVariable Integer price) {
        productRepository.addProduct(title, price);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }

//    @GetMapping
//    public List<Product> getProducts() {
//       Iterable<Product> products = productRepository.findAll();
//       List<Product> productList = new ArrayList<>();
//        for (Product p : products) {
//            productList.add(p);
//        }
//        return productList;
//    }

}
