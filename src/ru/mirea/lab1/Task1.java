package ru.mirea.lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("кол-во эл-ов массива");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Введите " + (i+1) + " эл. массива: ");
            arr[i] = sc.nextInt();
        }

        int sumArr = 0;
        for (int i = 0; i < size; i++){
            sumArr += arr[i];
        }
        System.out.println("Sum: " + sumArr);

        double avg = (double) sumArr /size;
        System.out.println("AVG: " + avg);

        sc.close();
    }}

