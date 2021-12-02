package com.company.lab.Commands;

import com.company.lab.StackCalc;

public class SqrtCommand implements Command {
    private StackCalc stack;

    public SqrtCommand(StackCalc stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        stack.SQRT();
    }
}
