package com.company.lab.Commands;


import java.util.Stack;

public class CommentCommand implements Command {
    private Stack stack;

    public CommentCommand(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        System.out.println("Комментарий, ничего не делаем");
    }
}
