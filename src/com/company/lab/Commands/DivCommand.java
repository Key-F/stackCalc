package com.company.lab.Commands;

import com.company.lab.StackCalc;

import java.util.EmptyStackException;
import java.util.Stack;

public class DivCommand implements Command {
    private Stack<Double> stack;

    public DivCommand(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void execute() throws Exception{
        try {
            Double first = stack.pop();
            Double second = stack.pop();
            if(second == 0) throw new Exception("Деление на 0");
            stack.push(first / second);
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст / Не хватает элементов для действия");
        }
    }
}
