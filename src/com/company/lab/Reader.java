package com.company.lab;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Reader {

    static String getFileAsString(String path){ // Получаем файл как строку
        try {
            byte[] fileContent = Files.readAllBytes(Paths.get(path));
            return new String(fileContent);
        }
        catch (Exception e){
            System.out.println("Ошибка чтения из файла");
            return "";
        }
    }

    static void read() throws IOException{
        FileReader fileReader;
        try {
            fileReader = new FileReader(System.getProperty("user.dir") + "/file.txt");
        }
        catch (IOException e) {System.out.println("Не удалось считать из файла"); return;}
        Scanner in = new Scanner(fileReader);
        int size = Integer.valueOf(in.next());
        in.nextLine();

        while (in.hasNext()) { // Построчно читаем из файла и парсим нужные значения
            String type = in.next();
            String key = in.next();
            String value = in.next();
        }
        fileReader.close();
    }
}
