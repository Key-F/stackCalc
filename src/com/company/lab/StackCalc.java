package com.company.lab;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class StackCalc {
    // begin Singleton
    private static StackCalc instance;
    private StackCalc(){} // Нет доступа извне к конструктору
    public static StackCalc getInstance(){
        if(instance == null){ // Проверка, что объекта нет
            instance = new StackCalc();
        }
        return instance;
    }
    // end Singleton

    Stack<Double> stack;
    private HashMap<String, Double> params;

    void comment(){}
    public void POP(){
        stack.pop();
    }
    public void PUSH(String arg){
        if (params.get(arg)!= null)
            stack.push(params.get(arg));
        else
            stack.push(Double.parseDouble(arg));
    }
    public void PRINT(){
        System.out.println(stack.peek());
    }

    public void DEFINE(String param, String val){
        params.put(param, Double.parseDouble(val));
    }

    public void SUMM(){
        Double first = stack.pop();
        Double second = stack.pop();
        stack.push(first + second);
    }

    public void MINUS(){
        Double first = stack.pop();
        Double second = stack.pop();
        stack.push(first - second);
    }

    public void MULTI(){
        Double first = stack.pop();
        Double second = stack.pop();
        stack.push(first * second);
    }

    public void DIV(){
        Double first = stack.pop();
        Double second = stack.pop();
        stack.push(first / second);
    }

    public void SQRT(){
        stack.push(Math.sqrt(stack.pop()));
    }




}
