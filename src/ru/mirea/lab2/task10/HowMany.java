package ru.mirea.lab2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Count words: " + wordCount);
    }

    public static int countWords(String text) {
        String[] words = text.split("[\\s\\p{Punct}]+");

        return words.length;
    }
}