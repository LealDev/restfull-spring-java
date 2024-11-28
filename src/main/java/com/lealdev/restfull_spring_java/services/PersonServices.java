package com.lealdev.restfull_spring_java.services;

import com.lealdev.restfull_spring_java.exceptions.ResourceNotFoundException;
import com.lealdev.restfull_spring_java.factories.PersonVOFactory;
import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.models.VO.PersonVO;
import com.lealdev.restfull_spring_java.repositories.PersonRepository;
import com.lealdev.restfull_spring_java.services.interfaces.IPersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices implements IPersonServices {

    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        logger.info("Finding all people!");
        return personRepository.findAll();
    }

    @Override
    public Person findById(Long id) {
        logger.info("Finding one person!");
        return personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
    }

    @Override
    public Person create(PersonVO personVO){
        logger.info("Create one person!");
        return personRepository.save(PersonVOFactory.toBean(personVO));
    }

    @Override
    public List<Person> createAll(List<PersonVO> personVOList){
        logger.info("Create one person!");
        return personRepository.saveAll(PersonVOFactory.toBeanList(personVOList));
    }

    @Override
    public Person update(PersonVO personVO){
        logger.info("Update one person!");
        Person entity = personRepository.findById(personVO.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        PersonVOFactory.updateEntityWithVO(entity, personVO);
        return personRepository.save(entity);
    }

    @Override
    public void delete(Long id){
        Person entity = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        personRepository.delete(entity);
        logger.info("Delete one person!");
    }
}
