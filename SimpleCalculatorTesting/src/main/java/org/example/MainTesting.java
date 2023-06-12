package org.example;

import SimpleCalculator.SimpleCalculator;

public class MainTesting {
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        double result = simpleCalculator.addAToB(8.4, 8.4);

        System.out.println(result);

    }
}
