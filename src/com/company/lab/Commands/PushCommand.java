package com.company.lab.Commands;

import com.company.lab.StackCalc;

public class PushCommand implements Command{
    private StackCalc stack;
    private String val;

    public PushCommand(StackCalc stack, String val) { // alt + ins for Generate
        this.stack = stack;
        this.val = val;
    }

    @Override
    public void execute() {
        stack.PUSH(val);
    }
}
