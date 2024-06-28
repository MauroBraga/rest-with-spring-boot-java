package br.com.mrb.restwithspringboot.controller;

import br.com.mrb.restwithspringboot.entity.Greeting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private static final  String template = "Hello, %s !";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}")
    public Double sumg(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception {

        if(!isNumeric(numberOne) || isNumeric(numberTwo)){
            throw new Exception();
        }

        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    private Double convertToDouble(String strNumber) {
        return  null;
    }

    private boolean isNumeric(String numberOne) {
        return false;
    }
}
