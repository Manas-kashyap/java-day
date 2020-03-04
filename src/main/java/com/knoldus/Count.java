package com.knoldus;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {

        String filePath = "./src/main/resources/words.txt";
        ReadFile(filePath);

    }

    private static void ReadFile(String FilePath) {
        List<String> ListofWords = new ArrayList<>();

        BufferedReader fileBR = null;
        try {

            fileBR = Files.newBufferedReader(Paths.get(FilePath));

        } catch (IOException e) {
            e.printStackTrace();
        }

        ListofWords = fileBR.lines().distinct().collect(Collectors.toList());
        ListofWords.forEach(System.out::println);

    }

    private static void log(String string) {
        System.out.println(string);

    }

}

