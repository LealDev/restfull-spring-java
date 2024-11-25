package com.lealdev.restfull_spring_java;

public interface IMathService {

    public Double sum(String numberOne, String numberTwo) throws Exception;

    Double subtraction(String numberOne, String numberTwo) throws Exception;

    Double Average(String numberOne, String numberTwo) throws Exception;

    Double squareRoot(String numberOne, String numberTwo) throws Exception;

    Double multiplication(String numberOne, String numberTwo) throws Exception;

    Double division(String numberOne, String numberTwo) throws Exception;
}
