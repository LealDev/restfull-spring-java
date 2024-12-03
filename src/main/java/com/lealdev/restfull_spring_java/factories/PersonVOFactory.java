package com.lealdev.restfull_spring_java.factories;

import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.models.VO.PersonVO;
import com.lealdev.restfull_spring_java.models.VO.PersonVOV2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PersonVOFactory {
    public static void updateEntityWithVO(Person entity, PersonVO VO){
        entity.setFirstName(VO.getFirstName());
        entity.setLastName(VO.getLastName());
        entity.setAddress(VO.getAddress());
        entity.setGender(VO.getGender());
    }
    public static void updateEntityWithVOV2(Person entity, PersonVOV2 VO){
        entity.setFirstName(VO.getFirstName());
        entity.setLastName(VO.getLastName());
        entity.setAddress(VO.getAddress());
        entity.setGender(VO.getGender());
    }
}
