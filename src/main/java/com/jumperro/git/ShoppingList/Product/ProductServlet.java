package com.jumperro.git.ShoppingList.Product;

import com.jumperro.git.ShoppingList.AppLogger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductServlet implements AppLogger {
    private ProductRepository repository;
    public Product product;

    public ProductServlet(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/list")
    ResponseEntity<List<Product>> findAllProducts(){
        logger.info("Request get");
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping(value = "list")
    ResponseEntity<Product> saveProduct(@RequestBody Product product) throws Exception{
        if(product.getName().isEmpty() || product.getType().isEmpty() ){
            throw new RuntimeException("Either name or type must not be empty");
        }
        logger.info("new product added");
        return ResponseEntity.ok(repository.save(product));
    }
    @PatchMapping(value = "list/{id}")
    ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product toUpdate){
        if(!repository.existsById(id)){
            logger.warn("No product on such ID");
            return ResponseEntity.notFound().build();
        }
            repository.findById(id).ifPresent(Product -> {
                   Product.update(toUpdate);
                   repository.save(Product);
               });
        logger.info("Product updated");
        return ResponseEntity.ok().build();
    }
    }
