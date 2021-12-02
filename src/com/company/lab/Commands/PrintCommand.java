package com.company.lab.Commands;

import com.company.lab.StackCalc;

public class PrintCommand implements Command {
    private StackCalc stack;

    public PrintCommand(StackCalc stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        stack.PRINT();
    }
}
