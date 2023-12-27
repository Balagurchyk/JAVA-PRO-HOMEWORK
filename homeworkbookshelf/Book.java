package com.proftelran.org.homeworkbookshelf;

public class Book {
    String titleBook;
    Author author;
    int numberOfPages;
    int publishingYear;
    Publisher publisher;

    public Book(String titleBook, Author author, int numberOfPages, int publishingYear, Publisher publisher) {
        this.titleBook = titleBook;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publishingYear = publishingYear;
        this.publisher = publisher;
    }
}
