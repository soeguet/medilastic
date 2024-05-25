package com.soeguet.medilastic.repositories;

import com.soeguet.medilastic.entities.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {
	List<Product> findByName(String name);
}
