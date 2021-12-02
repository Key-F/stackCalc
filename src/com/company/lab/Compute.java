package com.company.lab;

public class Compute {

    public Double calc(double num1, double num2, String operator){
        switch (operator){
            case "+": return num1 + num2;
            case "-": return num2 - num1;
            case "*": return num1 * num2;
            case "/": return num2 / num1;
            case "SQRT": return Math.sqrt(num1);
            default: return null;
        }
    }
}
