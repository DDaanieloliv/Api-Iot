package com.example.j_api_iot.model.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Document(collection = "principal")
@Data
public class Principal {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String rgb;

    @CreatedDate
    @Field("creationTimeStamp")
    private Instant creationTimeStamp;


}
