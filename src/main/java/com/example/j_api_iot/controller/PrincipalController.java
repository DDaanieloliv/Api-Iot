package com.example.j_api_iot.controller;

import com.example.j_api_iot.model.entity.Principal;
import com.example.j_api_iot.model.repository.PrincipalRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PrincipalController {

    private  PrincipalRepository repository;

    public PrincipalController(PrincipalRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @Transactional
    public Principal salvar(@RequestBody Principal principal){

    return repository.save(principal);

    }


    @GetMapping
    public List<Principal> findAll(Principal principal){

        return repository.findAll();

    }

}
