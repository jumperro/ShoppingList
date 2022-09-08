package com.jumperro.git.ShoppingList.product;

import com.jumperro.git.ShoppingList.AppLogger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/products")
public class ProductController implements AppLogger {
    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    ResponseEntity<List<Product>> findAllProducts() {
        logger.info("Request get");
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping()
    ResponseEntity<Product> saveProduct(@RequestBody Product product) throws Exception {
        if (product.getName().isEmpty() || product.getType().isEmpty()) {
            throw new RuntimeException("Either name or type must not be empty");
        }
        logger.info("new product added");
        return ResponseEntity.ok(repository.save(product));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Product> deleteProduct(@PathVariable Integer id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
