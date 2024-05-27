package com.example.j_api_iot.model.repository;

import com.example.j_api_iot.model.entity.Principal;

//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrincipalRepository extends JpaRepository<Principal, Integer> {


    List<Principal> findAll();
}

