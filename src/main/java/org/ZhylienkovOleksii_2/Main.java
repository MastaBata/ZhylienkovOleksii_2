package org.ZhylienkovOleksii_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a new book");
            System.out.println("2. Show all books");
            System.out.println("3. Search book by name");
            System.out.println("4. Delete book by ISBN");
            System.out.println("5. Add a new DVD");
            System.out.println("6. Show all DVD's");
            System.out.println("7. Search DVD by name");
            System.out.println("8. Delete DVD by name");
            System.out.println("9. Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Book name: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    Book newBook = new Book(title, author, isbn, year);
                    library.addBook(newBook);
                    System.out.println("Book added.");
                    break;
                case 2:
                    System.out.println("Books list:");
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Type book name to search: ");
                    String searchTitleBook = scanner.nextLine();
                    System.out.println("Results:");
                    library.searchByTitleBooks(searchTitleBook);
                    break;
                case 4:
                    System.out.print("Type ISBN of book to delete: ");
                    String isbnToDelete = scanner.nextLine();
                    library.removeBookByIsbn(isbnToDelete);
                    System.out.println("Book deleted.");
                    break;
                case 5:
                    System.out.print("DVD name: ");
                    String BookTitle = scanner.nextLine();
                    System.out.print("Author: ");
                    String BookAuthor = scanner.nextLine();
                    System.out.print("Year: ");
                    int BookYear = scanner.nextInt();
                    scanner.nextLine();
                    DVD newDVD = new DVD(BookTitle, BookAuthor, BookYear);
                    library.addDVD(newDVD);
                    System.out.println("Book added.");
                    break;
                case 6:
                    System.out.println("DVDs list:");
                    library.displayDVDs();
                    break;
                case 7:
                    System.out.print("Type DVD name to search: ");
                    String searchTitleDVD = scanner.nextLine();
                    System.out.println("Results:");
                    library.searchByTitleDVDs(searchTitleDVD);
                    break;
                case 8:
                    System.out.print("Type name of DVD to delete: ");
                    String nameToDelete = scanner.nextLine();
                    library.removeDVDbyName(nameToDelete);
                    System.out.println("DVD deleted.");
                    break;
                case 9:
                    System.out.println("program end.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Unavailable option. Try again.");
            }
        }
    }
}