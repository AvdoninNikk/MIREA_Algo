package ru.mirea.lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("кол-во эл-ов массива");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i+1) + " эл. массива: ");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        int i = 0;

        do {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        } while (i < size);

        System.out.println("SUM: " + sum);
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);

    }
}
