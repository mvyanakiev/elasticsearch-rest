package com.milko.elastic.service;

import com.milko.elastic.model.LogRecord;
import com.milko.elastic.repository.LogRecordRepository;
import com.milko.elastic.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ElasticsearchService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private LogRecordRepository logRecordRepository;

    public void find() {
//        List<Product> products = productRepository.findByNameContaining("heli");
//
//        System.out.println("Found: " + products.size());
//        for (Product product : products) {
//            System.out.println(product.getName());
//        }

        List<LogRecord> logRecords = logRecordRepository.findByIndexContaining("2021.05.30");

        System.out.println("debug");
    }
}
