package br.com.app.springbasicexample.controller;

import br.com.app.springbasicexample.dto.ProductDTO;
import br.com.app.springbasicexample.entity.Product;
import br.com.app.springbasicexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public @ResponseBody Product create(@RequestBody @Valid ProductDTO p) {
        Product product = new Product(p);
        productRepository.save(product);
        return product;
    }

    @GetMapping
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }
}
