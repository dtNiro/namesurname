package com.example.myapp_list;

public class Book {
    private String book_name;
    private String book_surname;

    public Book (String book_surname, String book_name){
        this.book_surname = book_surname;
        this.book_name = book_name;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_surname() {
        return book_surname;
    }

    public void setBook_surname(String book_surname) {
        this.book_surname = book_surname;
    }

}
