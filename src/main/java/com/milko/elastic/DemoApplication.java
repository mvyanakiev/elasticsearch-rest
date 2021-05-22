package com.milko.elastic;

import com.milko.elastic.service.ElasticsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.milko.elastic")
public class DemoApplication implements CommandLineRunner {

    @Autowired
    ElasticsearchService elasticsearchService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");
        elasticsearchService.find();
    }
}
