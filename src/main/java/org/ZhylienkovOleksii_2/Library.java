package org.ZhylienkovOleksii_2;

import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books = new ArrayList<Book>();
    private List<DVD> dvds = new ArrayList<DVD>();
    private String isbn;

    public void addBook(Book book) {
        books.add(book);
    }
    public void addDVD(DVD dvd) {
        dvds.add(dvd);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Name: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Year: " + book.getYear());
            System.out.println();
        }
    }
    public void displayDVDs() {
        for (DVD dvd : dvds) {
            System.out.println("Name: " + dvd.getTitle());
            System.out.println("Author: " + dvd.getAuthor());
            System.out.println("Year: " + dvd.getYear());
            System.out.println();
        }
    }

    public void searchByTitleBooks(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
                return;
            }
        }
    }
    public void searchByTitleDVDs(String title) {
        List<DVD> result = new ArrayList<>();
        for (DVD dvd : dvds) {
            if (dvd.getTitle().equals(title)) {
                result.add(dvd);
                return;
            }
        }
    }

    public void removeBookByIsbn(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }
    public void removeDVDbyName(String title) {
        books.removeIf(dvd -> dvd.getTitle().equals(title));
    }

    public boolean hasBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
    }
}