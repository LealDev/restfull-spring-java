package com.lealdev.restfull_spring_java.mapper;


import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.models.VO.PersonVO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.ERROR)
public interface PersonMapper {

    Person toBean(PersonVO personVO);
    PersonVO toVO(Person person);
    List<PersonVO> toVOList(List<Person> personList);
    List<Person> toBeanList(List<PersonVO> personVOList);
}

