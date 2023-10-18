package com.pluralsight;

public class Books {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Books(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

public void checkOut(String name) {
    if (!isCheckedOut) {
        isCheckedOut = true;
        checkedOutTo = name;
        System.out.println(title + " has been checked out to " + name);
    } else {
        System.out.println(title + " is already checked out to " + checkedOutTo);
    }
}

    public void checkIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            checkedOutTo = "";
            System.out.println(title + " has been checked in.");
        } else {
            System.out.println(title + " is not currently checked out.");
        }
    }
}






