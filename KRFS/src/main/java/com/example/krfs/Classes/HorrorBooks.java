package com.example.krfs.Classes;

public class HorrorBooks extends Book{
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public HorrorBooks(String title, Author author, int bookId, double price, String category, int level) {
        super(title, author, bookId, price, category);
        this.level = level;
    }

    @Override
    public String DisplayDetails() {
        return ("Book Title: "+ super.getTitle() + "\nBook Author: " + super.getAuthor() + "\nBook ID: " + super.getBookId() + "\nBook Price: " + super.getPrice() + "\nBook category: " + super.getCategory() + "\nBook Horror Level: " + this.getLevel());
    }
}
