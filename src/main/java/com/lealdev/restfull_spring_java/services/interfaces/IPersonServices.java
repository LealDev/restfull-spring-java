package com.lealdev.restfull_spring_java.services.interfaces;

import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.models.VO.PersonVO;

import java.util.List;

public interface IPersonServices {


    List<PersonVO> findAll();

    PersonVO findById(Long id);

    PersonVO create(PersonVO personVO);

    List<PersonVO> createAll(List<PersonVO> personVOList);

    PersonVO update(PersonVO personVO);

    void delete(Long id);
}
