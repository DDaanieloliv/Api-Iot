package com.example.j_api_iot.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Data
public class Principal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;
    public String rgb;

    @CreationTimestamp
    @Column(name = "acessado")
    private Instant creationTimeStamp;


}
