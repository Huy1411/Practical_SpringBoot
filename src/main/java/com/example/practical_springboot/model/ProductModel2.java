package com.example.practical_springboot.model;


import com.example.practical_springboot.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductModel2 extends PagingAndSortingRepository<Product, Integer> {
    Page<Product> findByNameAndPrice(String name, int price, Pageable pageable);

    List<Product> findDistinctByName(String name);

}
