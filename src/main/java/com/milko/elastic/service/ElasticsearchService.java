package com.milko.elastic.service;

import com.milko.elastic.model.Product;
import com.milko.elastic.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElasticsearchService {

    @Autowired
    private ProductRepository productRepository;

    public void find() {
        List<Product> products = productRepository.findByNameContaining("heli");

        System.out.println("Found: " + products.size());
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}
