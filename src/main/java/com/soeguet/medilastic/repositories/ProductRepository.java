package com.soeguet.medilastic.repositories;

import com.soeguet.medilastic.entities.Product;
import java.util.List;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ListCrudRepository<Product, String> {
  List<Product> findProductsByName(String name);
}

