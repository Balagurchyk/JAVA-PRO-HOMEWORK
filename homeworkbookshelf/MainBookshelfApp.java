package com.proftelran.org.homeworkbookshelf;

import java.util.*;

public class MainBookshelfApp {
//    Есть объект - книжная полка.
//    Организовать хранение книг на книжной полке, в различном порядке, а именно:
//    По Автору, по году издания, по издательству.
//    Соответственно должен быть класс описывающий книгу.
//    У книги должны быть поля, наименование,автор,количество страниц, год издания, издательство.
//    Поля Автор и Издательство должны быть классами.
//    Класс автор содержит имя и фамилию автора и год рождения.
//    Класс издательство содержит название издательства и год основания.
//    В основном классе программы, создать 7 книг, со всеми полями(авторы, издательство)
//    Запросить с консоли выбор варианта сортировки книг на полке.
//    Отсортировать книги на полке по выбранному варианту. Вывести в консоль содержимое полки.

    public static void main(String[] args) {
        Author authorOne = new Author("Михаил", "Булгаков", 1891);
        Author authorTwo = new Author("Александр", "Пушкин", 1799);
        Author authorThree = new Author("Николай", "Некрасов", 1821);
        Author authorFour = new Author("Николай", "Гоголь", 1809);
        Author authorFive = new Author("Максим", "Горький", 1868);
        Author authorSix = new Author("Лев", "Толстой", 1828);

        Publisher publisherOne = new Publisher("Радуга", 1995);
        Publisher publisherTwo = new Publisher("Самиздат", 1991);
        Publisher publisherThree = new Publisher("Знание", 1990);
        Publisher publisherFour = new Publisher("Печатный двор", 1998);
        Publisher publisherFive = new Publisher("Дом книги", 1995);
        Publisher publisherSix = new Publisher("Союзпечать", 1985);

        Book bookOne = new Book("Мастер и Маргарита", authorOne, 250, 2000, publisherFour);
        Book bookTwo = new Book("Капитанская дочка", authorTwo, 220, 2010, publisherSix);
        Book bookThree = new Book("Железная дорога", authorThree, 180, 2006, publisherFive);
        Book bookFour = new Book("Мёртвые души", authorFour, 360, 1999, publisherThree);
        Book bookFive = new Book("Медный всадник", authorTwo, 150, 1995, publisherTwo);
        Book bookSix = new Book("Мать", authorFive, 420, 2012, publisherFour);
        Book bookSeven = new Book("Война и мир", authorSix, 2500, 2004, publisherOne);

        List<Book> bookList = new ArrayList<>();
        bookList.add(bookOne);
        bookList.add(bookTwo);
        bookList.add(bookThree);
        bookList.add(bookFour);
        bookList.add(bookFive);
        bookList.add(bookSix);
        bookList.add(bookSeven);

        Bookshelf bookshelf = new Bookshelf(bookList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант сортировки:\nСортировка по автору - нажмите 1" +
                "\nСортировка по году издания - нажмите 2\nСортировка по издательству - нажмите 3");
        int sortOption = scanner.nextInt();

        bookshelf.sortBooks(sortOption);
        bookshelf.displayBooks();
    }
}