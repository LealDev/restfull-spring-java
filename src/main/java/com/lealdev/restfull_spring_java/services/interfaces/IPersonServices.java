package com.lealdev.restfull_spring_java.services.interfaces;

import com.lealdev.restfull_spring_java.models.Person;

import java.util.List;

public interface IPersonServices {

    List<Person> findAll();

    public Person findById(String id);
}
