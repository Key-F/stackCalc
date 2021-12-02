package com.company.lab.Commands;

import com.company.lab.StackCalc;

public class CommandFactory { // Фабрика

    public enum CommandType { // Перечисление всех возможных команд
        POP,
        PUSH,
        PRINT,
        DEFINE,
        SUMM("+"),
        MINUS("-"),
        MULTI("*"),
        DIV("/"),
        SQRT,
        COMMENT("#");

        private String value;

        CommandType(){}
        CommandType(String value) // Конструктор для "символьных" элементов перечисления
        {
            this.value = value;
        }

        public String toString()
        {
            if (this.value == null) return this.name(); // Если value нет, то выдаем name
            return this.value; // Чтобы использовать символы (выдаст '+' вместо SUMM)
        }

        public static CommandType getEnum(String value) { // Метод для поучения нужного CommandType
            for(CommandType v : values()) // Проходим по всем
                if(v.toString().equalsIgnoreCase(value)) return v; // И сравниваем
            throw new IllegalArgumentException("Неизвестный аргумент");
        }

    }

    public Command createCommand(CommandType type, StackCalc stack, String val){ // Создание нужной команды
        switch (type){
            case POP: return new PopCommand(stack);
            case PUSH: return new PushCommand(stack, val);
            case PRINT: return new PrintCommand(stack);
            case DEFINE: return new DefineCommand(stack, val);
            case SUMM: return new SummCommand(stack);
            case MINUS: return new MinusCommand(stack);
            case MULTI: return new MultiCommand(stack);
            case DIV: return new DivCommand(stack);
            case SQRT: return new SqrtCommand(stack);
            case COMMENT: return new CommentCommand(stack);
            default: return null;
        }
    }
}
