package com.pluralsight;

import java.util.Scanner;
public class LibraryApplication {

    public static void main(String[] args) {
        // Create an array of 20 books for the library
        Books[] library = new Books[20];
        library[0] = new Books(1, "ISBN001", "Book 1");
        library[1] = new Books(2, "ISBNXX2", "Book 2");
        library[2] = new Books(3, "ISBNPP3", "Book 3");
        library[3] = new Books(4, "ISBNNN4", "Book 4");
        library[4] = new Books(5, "ISBNLC2", "Book 5");
        library[5] = new Books(6, "ISBNWE2", "Book 6");
        library[6] = new Books(7, "ISBN005", "Book 7");
        library[7] = new Books(2, "ISBNLL1", "Book 8");
        library[8] = new Books(2, "ISBN112", "Book 9");
        library[9] = new Books(2, "ISBN002", "Book 10");
        library[10] = new Books(2, "ISBNL1", "Book 11");
        library[11] = new Books(2, "ISBN02", "Book 12");
        library[12] = new Books(2, "ISBNC2", "Book 13");
        library[13] = new Books(2, "ISBNL2", "Book 14");
        library[14] = new Books(2, "ISBNH3", "Book 15");
        library[15] = new Books(2, "ISBNH4", "Book 16");
        library[16] = new Books(2, "ISBNG5", "Book 17");
        library[17] = new Books(2, "ISBNH7", "Book 18");
        library[18] = new Books(2, "ISBNO1", "Book 19");
        library[19] = new Books(2, "ISBN02", "Book 20");

        Scanner scanner = new Scanner(System.in);
        // home screen options
        while (true) {
            System.out.println("Library Home Screen");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");

            // Simulate user input (replace with actual user input code)
            int choice = scanner.nextInt(); // Change this to get user input

            if (choice == 1) {
                showAvailableBooks(library);
            } else if (choice == 2) {
                showCheckedOutBooks(library);
            } else if (choice == 3) {
                System.out.println("Exiting the application.");
                scanner.close(); // Close the scanner
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void showAvailableBooks(Books[] library) {
        System.out.println("Available Books:");
        for (Books book : library) {
            if (!book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
            }
        }
        // Add code to check out a book or return to the home screen
    }

    public static void showCheckedOutBooks(Books[] library) {
        System.out.println("Checked Out Books:");
        for (Books book : library) {
            if (book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() + ", Checked Out To: " + book.getCheckedOutTo());
            }
        }
        // Add code to check in a book or return to the home screen
    }
}
