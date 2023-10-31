package ru.mirea.lab3.MathRandom.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("кол-во эл-ов массива");
        int sizeArray = scanner.nextInt();
        double[] array = new double[sizeArray];

        for (int i = 0; i < sizeArray; i++){
            array[i] = random.nextDouble();
        }
        System.out.println("1)Массив с рандомными числами: ");

        for (int i = 0; i < sizeArray; i++){
            System.out.println("array["+i+"]"+ " = "+ array[i]);
        }

        Arrays.sort(array);
        System.out.println(" ");
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < sizeArray; i++){
            System.out.println("array["+i+"]"+ " = "+ array[i]);
        }

        System.out.println(" ");

        double[] arrSecond = new double[sizeArray];

        for (int i = 0; i < sizeArray; i++){
            arrSecond[i] = Math.random();
        }
        System.out.println("2)110Массив с рандомными числами: ");
        for (int i = 0; i < sizeArray; i++){
            System.out.println("array["+i+"]"+ " = "+ arrSecond[i]);
        }

        System.out.println(" ");

        Arrays.sort(arrSecond);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < sizeArray; i++){
            System.out.println("array["+i+"]"+ " = "+ arrSecond[i]);
        }
    }
}
