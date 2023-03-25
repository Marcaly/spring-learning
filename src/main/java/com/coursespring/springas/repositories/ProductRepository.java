package com.coursespring.springas.repositories;

import com.coursespring.springas.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
