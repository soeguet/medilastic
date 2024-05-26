package com.soeguet.medilastic.controller;

import com.soeguet.medilastic.entities.Product;
import com.soeguet.medilastic.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/search")
	public List<Product> search(@RequestParam String query) {
		return productRepository.findProductsByName(query);
	}
}