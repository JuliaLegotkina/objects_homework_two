package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author tolkien = new Author("John", "Tolkien");
        Author rowling = new Author ("Joanne", "Rowling");

        Book hobbit = new Book (tolkien, "Hobbit", 1937);
        Book harryPotter = new Book (rowling, "Harry Potter", 1997);

        System.out.println(hobbit);
        System.out.println(harryPotter);

        harryPotter.setPublishingYear(2000);
        System.out.println(harryPotter);
    }
}
