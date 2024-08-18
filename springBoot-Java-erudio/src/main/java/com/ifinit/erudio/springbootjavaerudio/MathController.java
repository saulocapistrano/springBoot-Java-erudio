package com.ifinit.erudio.springbootjavaerudio;

import com.ifinit.erudio.springbootjavaerudio.converters.NumberConverter;
import com.ifinit.erudio.springbootjavaerudio.exceptions.UnsupportedOperatorMathException;
import com.ifinit.erudio.springbootjavaerudio.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();

    private SimpleMath math = new SimpleMath();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        // Verifica se os parâmetros são numéricos antes de tentar convertê-los
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperatorMathException("Please set a numeric params.");
        }

        // Converte os parâmetros de String para Double
        Double convertedNumberOne = NumberConverter.convertToDouble(numberOne);
        Double convertedNumberTwo = NumberConverter.convertToDouble(numberTwo);

        // Passa os valores convertidos para o método sum que espera Double
        return math.sum(convertedNumberOne, convertedNumberTwo);
    }

    // O mesmo padrão deve ser seguido para os outros métodos

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double sub(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperatorMathException("Please set a numeric params.");
        }

        Double convertedNumberOne = NumberConverter.convertToDouble(numberOne);
        Double convertedNumberTwo = NumberConverter.convertToDouble(numberTwo);

        return math.sub(convertedNumberOne, convertedNumberTwo);
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double mult(@PathVariable(value = "numberOne") String numberOne,
                       @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperatorMathException("Please set a numeric params.");
        }

        Double convertedNumberOne = NumberConverter.convertToDouble(numberOne);
        Double convertedNumberTwo = NumberConverter.convertToDouble(numberTwo);

        return math.mult(convertedNumberOne, convertedNumberTwo);
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double div(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperatorMathException("Please set a numeric params.");
        }

        Double convertedNumberOne = NumberConverter.convertToDouble(numberOne);
        Double convertedNumberTwo = NumberConverter.convertToDouble(numberTwo);

        return math.div(convertedNumberOne, convertedNumberTwo);
    }

    @RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double med(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperatorMathException("Please set a numeric params.");
        }

        Double convertedNumberOne = NumberConverter.convertToDouble(numberOne);
        Double convertedNumberTwo = NumberConverter.convertToDouble(numberTwo);

        return math.med(convertedNumberOne, convertedNumberTwo);
    }

    @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
    public double squareRoot(@PathVariable(value = "number") String number
    ) throws Exception {

        if (!NumberConverter.isNumeric(number)) {
            throw new UnsupportedOperatorMathException("Please set a numeric params.");
        }

        Double convertedNumber = NumberConverter.convertToDouble(number);

        return math.squareRoot(convertedNumber);
    }

}
