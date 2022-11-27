package com.sprng.repository;

import com.sprng.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
// CREATE READ UPDATE DELETE -> CRUD

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Modifying
    @Query(value = "insert into Products (title, price) values (:title, :price)",
            nativeQuery = true)
    void addProduct(@Param("title") String title, @Param("price") Integer price);


}
