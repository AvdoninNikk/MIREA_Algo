package ru.mirea.lab11;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String developerName = "Avdonin";

        Date assignmentReceivedDate = new Date();
        long assignmentReceivedTimeMillis = assignmentReceivedDate.getTime();

        long assignmentDueTimeMillis = assignmentReceivedTimeMillis + 7 * 24 * 60 * 60 * 1000; //
        Date assignmentDueDate = new Date(assignmentDueTimeMillis);

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + assignmentReceivedDate);
        System.out.println("Дата и время сдачи задания: " + assignmentDueDate);
    }
}