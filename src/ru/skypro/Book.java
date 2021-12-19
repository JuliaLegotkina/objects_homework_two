package ru.skypro;

import java.util.Objects;

public class Book {
    private final String bookTitle;
    private int publishingYear;
    private final Author author;

    public Book (Author author, String bookTitle, int publishingYear) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Информация о книге: " + " " + author + " " + bookTitle + " " + publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass())
            return false;
        Book book = (Book) other;
        return Objects.equals(author, book.author) && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(publishingYear, book.publishingYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookTitle, publishingYear);
    }
}