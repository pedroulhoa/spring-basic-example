package br.com.app.springbasicexample.repository;

import br.com.app.springbasicexample.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
