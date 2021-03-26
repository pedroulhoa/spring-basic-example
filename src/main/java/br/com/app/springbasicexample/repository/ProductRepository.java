package br.com.app.springbasicexample.repository;

import br.com.app.springbasicexample.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    public Iterable<Product> findByNameContaining(String part);
}
