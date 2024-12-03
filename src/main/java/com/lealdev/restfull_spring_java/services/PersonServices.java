package com.lealdev.restfull_spring_java.services;

import com.lealdev.restfull_spring_java.exceptions.ResourceNotFoundException;
import com.lealdev.restfull_spring_java.factories.PersonVOFactory;
import com.lealdev.restfull_spring_java.mapper.PersonMapper;
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

    @Autowired
    PersonMapper personMapper;

    @Override
    public List<PersonVO> findAll() {
        logger.info("Finding all people!");
        return personMapper.toVOList(personRepository.findAll());
    }

    @Override
    public PersonVO findById(Long id) {
        logger.info("Finding one person!");
        var entity = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        return personMapper.toVO(entity);
    }

    @Override
    public PersonVO create(PersonVO personVO){
        logger.info("Create one person!");
        var entity = personMapper.toBean(personVO);
        return personMapper.toVO(personRepository.save(entity));
    }

    @Override
    public List<PersonVO> createAll(List<PersonVO> personVOList){
        logger.info("Create persons!");
        var entity = personMapper.toBeanList(personVOList);
        return personMapper.toVOList(personRepository.saveAll(entity));
    }

    @Override
    public PersonVO update(PersonVO personVO){
        logger.info("Update one person!");
        Person entity = personRepository.findById(personVO.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        PersonVOFactory.updateEntityWithVO(entity, personVO);
        return personMapper.toVO(personRepository.save(entity));
    }

    @Override
    public void delete(Long id){
        Person entity = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        personRepository.delete(entity);
        logger.info("Delete one person!");
    }
}
