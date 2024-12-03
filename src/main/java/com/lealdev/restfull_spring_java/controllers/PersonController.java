package com.lealdev.restfull_spring_java.controllers;

import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.models.VO.PersonVO;
import com.lealdev.restfull_spring_java.models.VO.PersonVOV2;
import com.lealdev.restfull_spring_java.services.interfaces.IPersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonServices service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonVO> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonVO findById(@PathVariable(value = "id") Long id){
        return service.findById(id);
    }

    @GetMapping(value = "/v2/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonVOV2 findByIdV2(@PathVariable(value = "id") Long id){
        return service.findByIdV2(id);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public PersonVO create(@RequestBody PersonVO personVO){
        return service.create(personVO);
    }

    @PostMapping(value = "/v2", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public PersonVOV2 createV2(@RequestBody PersonVOV2 personVO){
        return service.createV2(personVO);
    }

    @PostMapping(value = "/all",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonVO> createAll(@RequestBody List<PersonVO> personVOList){
        return service.createAll(personVOList);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public PersonVO update(@RequestBody PersonVO personVO){
        return service.update(personVO);
    }
}
