package com.jumperro.git.ShoppingList.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
 //   List<Product> findAll();

    @Override
    Optional<Product> findById(Integer id);

    Product save (Product entity);
}
