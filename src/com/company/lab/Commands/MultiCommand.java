package com.company.lab.Commands;

import com.company.lab.StackCalc;

public class MultiCommand implements Command {
    private StackCalc stack;

    public MultiCommand(StackCalc stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        stack.MULTI();
    }
}
