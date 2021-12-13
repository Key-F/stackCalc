package com.company.lab.Commands;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class DefineCommand implements Command {
    private Stack stack;
    private String param;
    private String val;
    private HashMap<String, Double> params; // Тут хранятся параметры

    public DefineCommand(Stack stack, String val, HashMap params) {
        this.params = params;
        Scanner in = new Scanner(val);
        this.stack = stack;
        this.param = in.next();
        this.val = in.next();
        in.close();
    }

    @Override
    public void execute() {
        try {
            params.put(param, Double.parseDouble(val));
        }
        catch (NumberFormatException e) {
            System.out.println("Некорректное значение параметра");
        }
    }
}
