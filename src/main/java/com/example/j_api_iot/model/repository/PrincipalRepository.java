package com.example.j_api_iot.model.repository;

import com.example.j_api_iot.model.entity.Principal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrincipalRepository extends JpaRepository<Principal, String> {



}
