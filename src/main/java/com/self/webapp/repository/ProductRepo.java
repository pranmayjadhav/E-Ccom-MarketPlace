package com.self.webapp.repository;

import com.self.webapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
