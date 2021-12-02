package com.company.lab.Commands;

import com.company.lab.StackCalc;

public class SummCommand implements Command {
    private StackCalc stack;

    public SummCommand(StackCalc stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        stack.SUMM();
    }
}
