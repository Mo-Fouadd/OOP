package com.example.krfs.Classes;

public class Sci_FiBooks extends Book {
    private String topic;

    public Sci_FiBooks(String title, Author author, int bookId, double price, String category, String topic) {
        super(title, author, bookId, price, category);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String DisplayDetails() {
        return ("Book Title: "+ super.getTitle() + "\nBook Author: " + super.getAuthor() + "\nBook ID: " + super.getBookId() + "\nBook Price: " + super.getPrice() + "\nBook category: " + super.getCategory() + "\nBook topic: " + this.getTopic());
    }
}
