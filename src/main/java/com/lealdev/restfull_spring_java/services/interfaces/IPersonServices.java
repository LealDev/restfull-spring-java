package com.lealdev.restfull_spring_java.services.interfaces;

import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.models.VO.PersonVO;

import java.util.List;

public interface IPersonServices {


    List<Person> findAll();

    Person findById(Long id);

    Person create(PersonVO person);

    List<Person> createAll(List<PersonVO> personVOList);

    Person update(PersonVO personVO);

    void delete(Long id);
}
