package com.milko.elastic.repository;

import com.milko.elastic.model.LogRecord;
import com.milko.elastic.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LogRecordRepository extends ElasticsearchRepository<LogRecord, String> {

    List<LogRecord> findByIndexContaining(String index);

}
