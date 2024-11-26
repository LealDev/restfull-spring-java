package com.lealdev.restfull_spring_java.services.interfaces;

public interface IMathService {

    public Double sum(String numberOne, String numberTwo) throws Exception;

    Double subtraction(String numberOne, String numberTwo) throws Exception;

    Double average(String numberOne, String numberTwo) throws Exception;

    Double squareRoot(String number) throws Exception;

    Double multiplication(String numberOne, String numberTwo) throws Exception;

    Double division(String numberOne, String numberTwo) throws Exception;
}
