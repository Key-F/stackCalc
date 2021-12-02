package com.company.lab;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class StackCalc {
    // begin Singleton
    private static StackCalc instance;
    private StackCalc(){ // Нет доступа извне к конструктору
        stack = new Stack<>();
        params = new HashMap<>();
    }
    public static StackCalc getInstance(){
        if(instance == null){ // Проверка, что объекта нет
            instance = new StackCalc();
        }
        return instance;
    }
    // end Singleton

    private Stack<Double> stack;
    private HashMap<String, Double> params;


    public void POP(){
        try{
        getInstance().stack.pop();
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст");
        }

    }
    public void PUSH(String arg){
        if (params.get(arg)!= null)
            getInstance().stack.push(params.get(arg));
        else
            getInstance().stack.push(Double.parseDouble(arg));
    }
    public void PRINT(){
        System.out.println(getInstance().stack.peek());
    }

    public void DEFINE(String param, String val){
        params.put(param, Double.parseDouble(val));
    }

    public void SUMM(){
        Double first = getInstance().stack.pop();
        Double second = getInstance().stack.pop();
        getInstance().stack.push(first + second);
    }

    public void MINUS(){
        Double first = getInstance().stack.pop();
        Double second = getInstance().stack.pop();
        getInstance().stack.push(first - second);
    }

    public void MULTI(){
        Double first = getInstance().stack.pop();
        Double second = getInstance().stack.pop();
        getInstance().stack.push(first * second);
    }

    public void DIV(){
        Double first = getInstance().stack.pop();
        Double second = getInstance().stack.pop();
        getInstance().stack.push(first / second);
    }

    public void SQRT(){
        getInstance().stack.push(Math.sqrt(getInstance().stack.pop()));
    }




}
