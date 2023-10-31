package ru.mirea.lab11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println("Введите месяц (1-12):");
        int month = scanner.nextInt() - 1;
        System.out.println("Введите число:");
        int day = scanner.nextInt();

        System.out.println("Введите часы (0-23):");
        int hours = scanner.nextInt();
        System.out.println("Введите минуты (0-59):");
        int minutes = scanner.nextInt();

        Date date = new Date(year - 1900, month, day, hours, minutes);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes, 0);

        System.out.println("Созданный объект Date: " + date);
        System.out.println("Созданный объект Calendar: " + calendar.getTime());

        scanner.close();
    }

}
