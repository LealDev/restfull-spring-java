package com.lealdev.restfull_spring_java.unittests.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.lealdev.restfull_spring_java.mapper.PersonMapper;
import com.lealdev.restfull_spring_java.models.Person;
import com.lealdev.restfull_spring_java.models.VO.PersonVO;
import com.lealdev.restfull_spring_java.unittests.mapper.moks.MockPerson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapperConverterTest {

    MockPerson inputObject;

    @Autowired
    PersonMapper personMapper;

    @BeforeEach
    public void setUp() {
        inputObject = new MockPerson();
    }

    @Test
    public void parseEntityToVOTest() {
        PersonVO output = personMapper.toVO(inputObject.mockEntity());
        assertEquals(Long.valueOf(0L), output.getKey());
        assertEquals("First Name Test0", output.getFirstName());
        assertEquals("Last Name Test0", output.getLastName());
        assertEquals("Addres Test0", output.getAddress());
        assertEquals("Male", output.getGender());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<PersonVO> outputList = personMapper.toVOList(inputObject.mockEntityList());
        PersonVO outputZero = outputList.getFirst();

        assertEquals(Long.valueOf(0L), outputZero.getKey());
        assertEquals("First Name Test0", outputZero.getFirstName());
        assertEquals("Last Name Test0", outputZero.getLastName());
        assertEquals("Addres Test0", outputZero.getAddress());
        assertEquals("Male", outputZero.getGender());

        PersonVO outputSeven = outputList.get(7);

        assertEquals(Long.valueOf(7L), outputSeven.getKey());
        assertEquals("First Name Test7", outputSeven.getFirstName());
        assertEquals("Last Name Test7", outputSeven.getLastName());
        assertEquals("Addres Test7", outputSeven.getAddress());
        assertEquals("Female", outputSeven.getGender());

        PersonVO outputTwelve = outputList.get(12);

        assertEquals(Long.valueOf(12L), outputTwelve.getKey());
        assertEquals("First Name Test12", outputTwelve.getFirstName());
        assertEquals("Last Name Test12", outputTwelve.getLastName());
        assertEquals("Addres Test12", outputTwelve.getAddress());
        assertEquals("Male", outputTwelve.getGender());
    }

    @Test
    public void parseVOToEntityTest() {
        Person output = personMapper.toBean(inputObject.mockVO());
        assertEquals(Long.valueOf(0L), output.getId());
        assertEquals("First Name Test0", output.getFirstName());
        assertEquals("Last Name Test0", output.getLastName());
        assertEquals("Addres Test0", output.getAddress());
        assertEquals("Male", output.getGender());
    }

    @Test
    public void parserVOListToEntityListTest() {
        List<Person> outputList = personMapper.toBeanList(inputObject.mockVOList());
        Person outputZero = outputList.getFirst();

        assertEquals(Long.valueOf(0L), outputZero.getId());
        assertEquals("First Name Test0", outputZero.getFirstName());
        assertEquals("Last Name Test0", outputZero.getLastName());
        assertEquals("Addres Test0", outputZero.getAddress());
        assertEquals("Male", outputZero.getGender());

        Person outputSeven = outputList.get(7);

        assertEquals(Long.valueOf(7L), outputSeven.getId());
        assertEquals("First Name Test7", outputSeven.getFirstName());
        assertEquals("Last Name Test7", outputSeven.getLastName());
        assertEquals("Addres Test7", outputSeven.getAddress());
        assertEquals("Female", outputSeven.getGender());

        Person outputTwelve = outputList.get(12);

        assertEquals(Long.valueOf(12L), outputTwelve.getId());
        assertEquals("First Name Test12", outputTwelve.getFirstName());
        assertEquals("Last Name Test12", outputTwelve.getLastName());
        assertEquals("Addres Test12", outputTwelve.getAddress());
        assertEquals("Male", outputTwelve.getGender());
    }
}
