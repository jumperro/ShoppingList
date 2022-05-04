package com.jumperro.git.ShoppingList.Product;

import com.jumperro.git.ShoppingList.AppLogger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductServlet implements AppLogger {
    private ProductRepository repository;

    public ProductServlet(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/list")
    ResponseEntity<List<Product>> findAllProducts(){
        logger.info("Request get");
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping(value = "list")
    ResponseEntity<Product> saveProduct(@RequestBody Product product){
        logger.info("new product added");
        return ResponseEntity.ok(repository.save(product));
    }

    }
