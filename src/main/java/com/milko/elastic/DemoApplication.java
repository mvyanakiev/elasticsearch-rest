package com.milko.elastic;

import com.milko.elastic.service.ElasticsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.milko.elastic")
public class DemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                applicationContext = new AnnotationConfigApplicationContext(DemoApplication.class);

        System.out.println("test");

//        ElasticsearchService elasticsearchService = new ElasticsearchService();
//        elasticsearchService.find();

        applicationContext.close();
    }
}
