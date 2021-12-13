package com.company.lab.Commands;

import com.company.lab.StackCalc;

import java.util.HashMap;
import java.util.Stack;

public class PushCommand implements Command{
    private Stack stack;
    private String val;
    private HashMap<String, Double> params; // Тут хранятся параметры

    public PushCommand(Stack stack, String val, HashMap params) { // alt + ins for Generate
        this.stack = stack;
        this.val = val;
        this.params = params;
    }

    @Override
    public void execute() {
        if (params.get(val) != null)  // Если есть параметр с таким именем
            stack.push(params.get(val)); // Кладем на стек значение параметра
        else // Параметра нет, пришло число
            try {
                stack.push(Double.parseDouble(val)); // Пытаемся положить число
            } catch (NumberFormatException e) {
                System.out.println("Некорректное значение");
            }
    }
}
