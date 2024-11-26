package com.lealdev.restfull_spring_java.services;

import com.lealdev.restfull_spring_java.services.interfaces.IMathService;
import com.lealdev.restfull_spring_java.exceptions.UnsuportedMathOperationException;
import org.springframework.stereotype.Service;
import static com.lealdev.restfull_spring_java.utils.MathUtils.convertToDouble;
import static com.lealdev.restfull_spring_java.utils.MathUtils.isNumeric;

@Service
public class MathService implements IMathService {

    @Override
    public Double sum(String numberOne, String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @Override
    public Double subtraction(String numberOne, String numberTwo) throws Exception {
        if (isNumeric(numberOne) || isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    @Override
    public Double average(String numberOne, String numberTwo) throws Exception {
        if (isNumeric(numberOne) || isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    @Override
    public Double squareRoot(String number) throws Exception {
        if (isNumeric(number)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return Math.sqrt(convertToDouble(number));
    }

    @Override
    public Double multiplication(String numberOne, String numberTwo) throws Exception {
        if (isNumeric(numberOne) || isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    @Override
    public Double division(String numberOne, String numberTwo) throws Exception {
        if (isNumeric(numberOne) || isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }


}
