package com.lealdev.restfull_spring_java.factories;

import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.models.VO.PersonVO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PersonVOFactory {

    public static Person toBean (PersonVO personVO){
        if (personVO == null){
            return null;
        }
        return new Person(
                personVO.getId(),
                personVO.getFirstName(),
                personVO.getLastName(),
                personVO.getAddress(),
                personVO.getGender()
        );
    }

//    public static List<Person> toBeanLista(List<PersonVO> VOlist ){
//        List<Person> personList = new ArrayList<>();
//        VOlist.forEach( vo -> {
//            personList.add(toBean(vo));
//        });
//        return personList;
//    }

    public static List<Person> toBeanList(List<PersonVO> VOlist){
        if (VOlist == null || VOlist.isEmpty()){
            return Collections.emptyList();
        }
        return VOlist.stream()
                .map(PersonVOFactory::toBean)
                .collect(Collectors.toList());
    }

    public static void updateEntityWithVO(Person entity, PersonVO VO){
        entity.setFirstName(VO.getFirstName());
        entity.setLastName(VO.getLastName());
        entity.setAddress(VO.getAddress());
        entity.setGender(VO.getGender());
    }

    public static PersonVO toVO (Person person){
        return new PersonVO(
                person.getId(),
                person.getFirstName(),
                person.getLastName(),
                person.getAddress(),
                person.getGender()
        );
    }

}
