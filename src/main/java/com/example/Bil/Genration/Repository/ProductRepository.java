package com.example.Bil.Genration.Repository;

import com.example.Bil.Genration.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository  extends JpaRepository<Product,Long> {
}
