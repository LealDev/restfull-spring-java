package com.lealdev.restfull_spring_java.services;

import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.services.interfaces.IPersonServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices implements IPersonServices {

    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Override
    public List<Person> findAll() {
        logger.info("Finding all people!");
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    @Override
    public Person findById(String id) {
        logger.info("Finding one person!");
        return new Person(
                counter.incrementAndGet(),
                "Emanuel",
                "Leal",
                "Nova Almeida-Serra-Espirito Santo-Brazil",
                "Male"
        );
    }

    @Override
    public Person create(Person person){
        logger.info("Create one person!");
        return person;
    }

    @Override
    public Person update(Person person){
        logger.info("Update one person!");
        return person;
    }

    @Override
    public void delete(String id){
        logger.info("Delete one person!");
    }

    private Person mockPerson(int i) {
        return new Person(
                counter.incrementAndGet(),
                "Person Name " + i,
                "Leal " + i,
                "Some address in Brazil "+i,
                "Male"
        );
    }

}
