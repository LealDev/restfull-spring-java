package com.lealdev.restfull_spring_java;

import com.lealdev.restfull_spring_java.exceptions.UnsuportedMathOperationException;
import org.springframework.stereotype.Service;

@Service
public class MathService implements IMathService{

    @Override
    public Double sum(String numberOne, String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }


    @Override
    public Double subtraction(String numberOne, String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @Override
    public Double Average(String numberOne, String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @Override
    public Double squareRoot(String numberOne, String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @Override
    public Double multiplication(String numberOne, String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @Override
    public Double division(String numberOne, String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    private Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;
        String number = strNumber.replace(",",".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }
    private boolean isNumeric(String strNumber){
        if (strNumber == null) return false;
        String number = strNumber.replace(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    };
}
