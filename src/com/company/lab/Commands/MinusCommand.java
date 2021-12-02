package com.company.lab.Commands;

import com.company.lab.StackCalc;

public class MinusCommand implements Command {
    private StackCalc stack;

    public MinusCommand(StackCalc stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        stack.MINUS();
    }
}
