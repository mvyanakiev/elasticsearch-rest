package com.milko.elastic.service;

import com.milko.elastic.model.Article;
import com.milko.elastic.model.Author;
import com.milko.elastic.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import static java.util.Arrays.asList;

@Service
public class ElasticsearchService {

    @Autowired
    private ArticleRepository articleRepository;

    private ElasticsearchOperations elasticsearchOperations;

    public ElasticsearchService(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }

    public void find (){
        elasticsearchOperations.indexOps(Article.class).create();

        Article article = new Article("Spring Data Elasticsearch");
        article.setAuthors(asList(new Author("John Smith"), new Author("John Doe")));
        articleRepository.save(article);

        System.out.println("hoi");
    }
}
