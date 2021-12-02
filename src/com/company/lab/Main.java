package com.company.lab;

import com.company.lab.Commands.Command;
import com.company.lab.Commands.CommandFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader;
        if (args.length != 0) { // аргументом подается путь до файла
            System.out.println(args[0]);
            try {
                fileReader = new FileReader(args[0]);
            } catch (IOException e) {
                System.out.println("Не удалось считать из файла");
                return;
            }
            Scanner in = new Scanner(fileReader);
            while (in.hasNextLine()) { // Построчно читаем из файла и парсим нужные значения
                read(in);
            }
            in.close();
        }
        else { // Если аргумента нет, то читаем из консоли
            Scanner scanner = new Scanner(System.in);
            while (true) {
                read(scanner);
            }
        }
    }

    public static void read(Scanner in){
        String commandLine = in.nextLine(); // берем строку
        Scanner lineScanner = new Scanner(commandLine); // для нее свой сканер
        String type = lineScanner.next(); // получаем тип
        String value = commandLine.replace(type, ""); // value - остальная часть строки
        value = value.trim(); // убираем лишние пробелы
        CommandFactory factory = new CommandFactory(); // Создаем объект фабрики
        Command command = factory.createCommand(CommandFactory.CommandType.getEnum(type), StackCalc.getInstance(), value); // вызываем создатель команд
        command.execute(); // выполняем команду
    }

}
