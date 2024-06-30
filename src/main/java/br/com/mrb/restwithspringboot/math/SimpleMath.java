package br.com.mrb.restwithspringboot.math;

import static br.com.mrb.restwithspringboot.converters.NumberConverter.convertToDouble;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) throws Exception {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) throws Exception {
        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne,Double numberTwo) throws Exception {
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne,Double numberTwo) throws Exception {
        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne,Double numberTwo) throws Exception {
        return (numberOne + numberTwo) / 2;
    }
    public Double square(Double number) throws Exception {
        return Math.sqrt(number);
    }
}
