package br.com.app.springbasicexample.controller;

import br.com.app.springbasicexample.entity.Product;
import br.com.app.springbasicexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public @ResponseBody Product create(String name) {
        Product product = new Product(name);
        productRepository.save(product);
        return product;
    }
}
