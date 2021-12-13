package com.company.lab.Commands;

import com.company.lab.StackCalc;

import java.util.EmptyStackException;
import java.util.Stack;

public class SummCommand implements Command {
    private Stack<Double> stack;

    public SummCommand(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        try {
            Double first = stack.pop();
            Double second = stack.pop();
            stack.push(first + second);
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст / Не хватает элементов для действия");
        }
    }
}
