package lms;

import java.util.Scanner;

public class Library {
    int bookId;
    String bookName;
    String author;
    boolean isAvailable;
    static int totalBooks = 0;
    static Library[] library;


    public Library() {
    }

    public Library(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.isAvailable = true;
    }

    void addBooksInLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Books you want to Add: ");
        int n =  sc.nextInt();
        library= new Library[n];
        for (int i = 0; i < library.length; i++) {
            library[i] = new Library();
            System.out.print("Enter bookId: ");
            library[i].bookId = sc.nextInt();

            System.out.print("Enter Name: ");
            library[i].bookName = sc.next();

            System.out.print("Enter Author: ");
            library[i].author = sc.next();

            library[i].isAvailable = true;
            totalBooks++;

        }
    }

    void issueBook() {
        System.out.print("Enter Book Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean found = false;


        for (Library b : library) {
            if (b != null && b.bookName.equalsIgnoreCase(name)) {
                found = true;
                if (b.isAvailable) {
                    b.isAvailable = false;
                    System.out.println("Success: '" + name + "' has been issued.");
                } else {
                    System.out.println("Error: '" + name + "' is already issued to someone else.");
                }
                break;
            }
        }
        if (!found) System.out.println("Book not found in system.");
    }

    void printIssueBook(Library library) {
        System.out.println("==========================================");
        System.out.println("This Book is Already Issued");
        System.out.println(" ** BOOK DETAILS **");
        System.out.println("Book Id     : " + library.bookId);
        System.out.println("Name        : " + library.bookName);
        System.out.println("Author      : " + library.author);
        System.out.println("Available   : " + "Not Available");
        System.out.println();
    }

    void printAvailableBook(Library library) {
        System.out.println("==========================================");
        System.out.println("This Book is Available");
        System.out.println("   ** BOOK DETAILS **");
        System.out.println("Book Id     : " + library.bookId);
        System.out.println("Name        : " + library.bookName);
        System.out.println("Author      : " + library.author);
        System.out.println();
    }

    void displayBooks() {
        for (int i = 0; i < library.length; i++) {
            if (library[i].isAvailable) printAvailableBook(library[i]);
            else printIssueBook(library[i]);

        }
    }


    public static void main(String[] args) {
        Library library1 = new Library();
        library1.addBooksInLibrary();
        library1.displayBooks();

        library1.issueBook();

        System.out.println("Total No of books in library: " + Library.totalBooks);
        library1.displayBooks();
    }
}
