package com.ifinit.erudio.springbootjavaerudio.math;

public class SimpleMath {

    public double sum( Double numberOne,
                       Double numberTwo
    )  {
        return numberOne + numberTwo;
    }


    public double sub(Double numberOne,
                      Double numberTwo
    )  {

        return numberOne - numberTwo;
    }


    public double mult( Double numberOne,
                        Double numberTwo
    )  {


        return numberOne * numberTwo;
    }


    public double div( Double numberOne,
                       Double numberTwo
    )  {


        return numberOne / numberTwo;
    }


    public double med( Double numberOne,
                      Double numberTwo
    ) {

         return ((numberOne) + (numberTwo))/2;
    }


    public Double squareRoot(Double number
    ) {


        return Math.sqrt(number);
    }

}
