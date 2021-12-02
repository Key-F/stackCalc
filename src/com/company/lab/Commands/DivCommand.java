package com.company.lab.Commands;

import com.company.lab.StackCalc;

public class DivCommand implements Command {
    private StackCalc stack;

    public DivCommand(StackCalc stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        stack.DIV();
    }
}
