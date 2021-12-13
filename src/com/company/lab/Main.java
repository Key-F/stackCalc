package com.company.lab;

import com.company.lab.Commands.Command;
import com.company.lab.Commands.CommandFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Queue<Command> commands = new LinkedList<>();;

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
                commands.offer(read(in));
            }
            in.close();
            while(!commands.isEmpty()){
                commands.poll().execute();
            }
        }

        else { // Если аргумента нет, то читаем из консоли
            Scanner scanner = new Scanner(System.in);
            while (true) {
                read(scanner).execute();
            }
        }
    }

    public static Command read(Scanner in) throws Exception{
        String commandLine = in.nextLine(); // берем строку
        Scanner lineScanner = new Scanner(commandLine); // для нее свой сканер
        String type = lineScanner.next(); // получаем тип
        String value = commandLine.replace(type, ""); // value - остальная часть строки
        value = value.trim(); // убираем лишние пробелы
        CommandFactory factory = new CommandFactory(); // Создаем объект фабрики
        return factory.createCommand(CommandFactory.CommandType.getEnum(type), StackCalc.getInstance().getStack(), value,  StackCalc.getInstance().getParams()); // вызываем создатель команд
    }

}
