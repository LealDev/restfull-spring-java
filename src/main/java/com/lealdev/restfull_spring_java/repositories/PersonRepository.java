package com.lealdev.restfull_spring_java.repositories;

import com.lealdev.restfull_spring_java.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
