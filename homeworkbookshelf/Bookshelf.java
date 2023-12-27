package com.proftelran.org.homeworkbookshelf;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bookshelf {
    List<Book> booksList;

    public Bookshelf(List<Book> booksList) {
        this.booksList = booksList;
    }

    public void sortBooks(int sortOption) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (sortOption == 1) {
                System.out.println("Сортировка по фамилии автора:");
                Collections.sort(booksList, Comparator.comparing(book -> book.author.lastName));
                break;
            } else if (sortOption == 2) {
                System.out.println("Сортировка по году издания:");
                Collections.sort(booksList, Comparator.comparing(book -> book.publishingYear));
                break;
            } else if (sortOption == 3) {
                System.out.println("Сортировка по издательству:");
                Collections.sort(booksList, Comparator.comparing(book -> book.publisher.title));
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте ещё раз:");
                sortOption = scanner.nextInt();
            }
        }
    }

    public void displayBooks() {
        for (Book book : booksList
        ) {
            System.out.println(
                    book.titleBook + " - " +
                            book.author.firstName + " " + book.author.lastName + " (" +
                            book.publishingYear + "), Издательство: " + book.publisher.title);
        }
    }
}
