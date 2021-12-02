package com.company.lab.Commands;

import com.company.lab.StackCalc;

public class PopCommand implements Command {
    private StackCalc stack;

    public PopCommand(StackCalc stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        stack.POP();
    }
}
