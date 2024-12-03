package com.lealdev.restfull_spring_java.services.interfaces;

import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.models.VO.PersonVO;
import com.lealdev.restfull_spring_java.models.VO.PersonVOV2;

import java.util.List;

public interface IPersonServices {


    List<PersonVO> findAll();

    PersonVO findById(Long id);

    PersonVOV2 findByIdV2(Long id);

    PersonVO create(PersonVO personVO);

    PersonVOV2 createV2(PersonVOV2 personVO);

    List<PersonVO> createAll(List<PersonVO> personVOList);

    PersonVO update(PersonVO personVO);

    void delete(Long id);
}
