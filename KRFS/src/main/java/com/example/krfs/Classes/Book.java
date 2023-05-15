package com.example.krfs.Classes;

public abstract class Book implements Display{
    private String title;
    private Author author;
    private int bookId;
    private double price;
    private String category;

    public Book(String title, Author author, int bookId, double price, String category) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public abstract String DisplayDetails();
}
