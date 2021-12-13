package com.company.lab;

import com.company.lab.Commands.Command;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class StackCalc {
    // begin Singleton
    private static StackCalc instance;
    private StackCalc(){ // Нет доступа извне к конструктору
        stack = new Stack<>();
        params = new HashMap<>();
    }
    static StackCalc getInstance(){
        if(instance == null){ // Проверка, что объекта нет
            instance = new StackCalc();
        }
        return instance;
    }
    // end Singleton

    private Stack<Double> stack; // Сам стек
    private HashMap<String, Double> params; // Тут хранятся параметры

    public HashMap<String, Double> getParams() {
        return params;
    }

    public Stack<Double> getStack() {
        return stack;
    }
}
