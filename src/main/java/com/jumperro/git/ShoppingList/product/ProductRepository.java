package com.jumperro.git.ShoppingList.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


    @Override
    Optional<Product> findById(Integer id);

    Product save(Product entity);
}
