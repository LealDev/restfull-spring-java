package com.lealdev.restfull_spring_java.mapper;


import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.models.VO.PersonVOV2;
import org.mapstruct.*;

import java.util.Date;
import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PersonMapperV2 {

    Person toBean(PersonVOV2 personVOV2);

    PersonVOV2 toV0(Person person);

    List<PersonVOV2> toV0V2List(List<Person> personList);

    List<Person> toBeanList(List<PersonVOV2> personVOV2List);
}


