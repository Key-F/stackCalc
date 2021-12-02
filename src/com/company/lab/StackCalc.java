package com.company.lab;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

public class StackCalc {
    // begin Singleton
    private static StackCalc instance;
    private StackCalc(){ // Нет доступа извне к конструктору
        stack = new Stack<>();
        params = new HashMap<>();
    }
    static StackCalc getInstance(){
        if(instance == null){ // Проверка, что объекта нет
            instance = new StackCalc();
        }
        return instance;
    }
    // end Singleton

    private Stack<Double> stack; // Сам стек
    private HashMap<String, Double> params; // Тут хранятся параметры


    public void POP(){ // Снять число со стека
        try{
        getInstance().stack.pop();
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст");
        }

    }
    public void PUSH(String arg) { // Положить чисто на стек
        if (params.get(arg) != null)  // Если есть параметр с таким именем
            getInstance().stack.push(params.get(arg)); // Кладем на стек значение параметра
        else // Параметра нет, пришло число
            try {
                getInstance().stack.push(Double.parseDouble(arg)); // Пытаемся положить число
            } catch (NumberFormatException e) {
                System.out.println("Некорректное значение");
            }
    }

    public void PRINT(){ // Выводим верхний элемент стека (сам элемент не удаляем)
        try {
            System.out.println(getInstance().stack.peek());
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст");
        }
    }

    public void DEFINE(String param, String val){ // Задаем значение параметра
        try {
            params.put(param, Double.parseDouble(val));
        }
        catch (NumberFormatException e) {
            System.out.println("Некорректное значение параметра");
        }
    }

    public void SUMM(){ // Сумма
        try {
            Double first = getInstance().stack.pop();
            Double second = getInstance().stack.pop();
            getInstance().stack.push(first + second);
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст / Не хватает элементов для действия");
        }
    }

    public void MINUS(){ // Вычитание
        try {
            Double first = getInstance().stack.pop();
            Double second = getInstance().stack.pop();
            getInstance().stack.push(first - second);
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст / Не хватает элементов для действия");
        }
    }

    public void MULTI(){ // Умножение
        try {
            Double first = getInstance().stack.pop();
            Double second = getInstance().stack.pop();
            getInstance().stack.push(first * second);
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст / Не хватает элементов для действия");
        }
    }

    public void DIV(){ // Деление
        try {
            Double first = getInstance().stack.pop();
            Double second = getInstance().stack.pop();
            getInstance().stack.push(first / second);
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст / Не хватает элементов для действия");
        }
    }

    public void SQRT(){ // Получение квадратного корня
        try {
            getInstance().stack.push(Math.sqrt(getInstance().stack.pop()));
        }
        catch (EmptyStackException e) {
            System.out.println("Стек пуст");
        }
    }
}
