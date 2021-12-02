package com.company.lab.Commands;

import com.company.lab.StackCalc;

public class CommentCommand implements Command {
    private StackCalc stack;

    public CommentCommand(StackCalc stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        System.out.println("Комментарий, ничего не делаем");
    }
}
