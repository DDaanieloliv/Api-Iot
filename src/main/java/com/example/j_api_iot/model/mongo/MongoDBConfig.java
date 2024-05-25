package com.example.j_api_iot.model.mongo;

import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoDBConfig {

    @Bean
    public MongoDatabaseFactory mongoConfigure(){
        return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/mydatabase");

    }


    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoConfigure());
    }
}
