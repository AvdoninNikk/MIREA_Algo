package ru.mirea.lab2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Авдонин Ник", "test@mail.ru", 'M');

        System.out.println("Имя автора " + author.getName());
        System.out.println("E-mail автора " + author.getEmail());

        author.setEmail("test2@mail.ru");
        System.out.println("Новый Email " + author.getEmail());

        System.out.println("Пол автора: " + author.getGender());
        System.out.println(author.toString());

    }
}