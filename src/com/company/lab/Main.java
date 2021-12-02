package com.company.lab;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader;
        if (args[0] != null) {
            System.out.println(args[0]);
            try {
                fileReader = new FileReader(args[0]);
            } catch (IOException e) {
                System.out.println("Не удалось считать из файла");
                return;
            }
            Scanner in = new Scanner(fileReader);
            //in.useDelimiter(System.getProperty("line.separator"));
            while (in.hasNextLine()) { // Построчно читаем из файла и парсим нужные значения
                String commandLine = in.nextLine();
            }

            System.out.println(args[0]);

        }
        else {
            Scanner scanner = new Scanner(System.in);

            while (true) {

                String myLine = scanner.nextLine();
                System.out.println(myLine);
                //
            }
        }

	// write your code here
    }
}
