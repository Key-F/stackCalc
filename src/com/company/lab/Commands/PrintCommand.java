package com.company.lab.Commands;

import com.company.lab.StackCalc;

import java.util.EmptyStackException;
import java.util.Stack;

public class PrintCommand implements Command {
    private Stack stack;

    public PrintCommand(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        try {
            System.out.println(stack.peek());
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст");
        }
    }
}
