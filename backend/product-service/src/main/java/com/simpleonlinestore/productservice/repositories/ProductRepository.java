package com.simpleonlinestore.productservice.repositories;

import com.simpleonlinestore.productservice.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
