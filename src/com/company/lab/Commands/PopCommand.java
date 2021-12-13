package com.company.lab.Commands;

import com.company.lab.StackCalc;

import java.util.EmptyStackException;
import java.util.Stack;

public class PopCommand implements Command {
    private Stack stack;

    public PopCommand(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        try{
            stack.pop();
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст");
        }
    }
}
