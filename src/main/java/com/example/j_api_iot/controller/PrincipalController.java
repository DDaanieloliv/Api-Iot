package com.example.j_api_iot.controller;

import com.example.j_api_iot.model.entity.Principal;
import com.example.j_api_iot.model.repository.PrincipalRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PrincipalController {

    private final PrincipalRepository repository;

    public PrincipalController(PrincipalRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @Transactional
    public Principal salvar(@RequestBody Principal principal){

    return repository.save(principal);

    }



}
