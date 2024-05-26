package com.soeguet.medilastic;

import com.soeguet.medilastic.entities.Product;
import com.soeguet.medilastic.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedilasticApplication implements CommandLineRunner {

  @Autowired private ProductRepository productRepository;

  public static void main(String[] args) {
    SpringApplication.run(MedilasticApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    if (productRepository.count() == 0) {
      Product product1 = new Product();
      product1.setId("1");
      product1.setName("Aspirin");

      Product product2 = new Product();
      product2.setId("2");
      product2.setName("Ibuprofen");

      productRepository.save(product1);
      productRepository.save(product2);

      System.out.println("test data added to elasticsearch");
    }
  }
}
