package br.com.app.springbasicexample.controller;

import br.com.app.springbasicexample.dto.ProductDTO;
import br.com.app.springbasicexample.entity.Product;
import br.com.app.springbasicexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public @ResponseBody
    Product create(@RequestBody @Valid ProductDTO p) {
        Product product = new Product(p);
        productRepository.save(product);
        return product;
    }

    @GetMapping
    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public Optional<Product> get(@PathVariable Long id) {
        return productRepository.findById(id);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Product> update(@RequestBody @Valid ProductDTO p, @PathVariable Long id) {
        Optional<Product> productOptional = productRepository.findById(id);

        if (!productOptional.isPresent())
            return ResponseEntity.notFound().build();

        Product product = new Product(p);
        product.setId(id);
        productRepository.save(product);

        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);
    }

}
