package com.company.lab.Commands;

import com.company.lab.StackCalc;

import java.util.Scanner;

public class DefineCommand implements Command {
    private StackCalc stack;
    private String param;
    private String val;

    public DefineCommand(StackCalc stack, String val) {
        Scanner in = new Scanner(val);
        this.stack = stack;
        this.param = in.next();
        this.val = in.next();
        in.close();
    }

    @Override
    public void execute() {
        stack.DEFINE(param, val);
    }
}
