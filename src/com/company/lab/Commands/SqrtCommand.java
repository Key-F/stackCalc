package com.company.lab.Commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class SqrtCommand implements Command {
    private Stack<Double> stack;

    public SqrtCommand(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void execute() throws Exception{
        try {
            if(stack.peek() >= 0){
                stack.push(Math.sqrt(stack.pop()));
            } else {
                throw new Exception("Число меньше 0, нельзя взять корень");
            }
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст");
        }
    }
}
