package com.example.krfs.Classes;

public class CrimeFictionBooks extends Book{
    private boolean isSeries;
    private boolean isFilmed;

    public boolean isSeries() {
        return isSeries;
    }

    public void setSeries(boolean series) {
        isSeries = series;
    }

    public boolean isFilmed() {
        return isFilmed;
    }

    public void setFilmed(boolean filmed) {
        isFilmed = filmed;
    }

    public CrimeFictionBooks(String title, Author author, int bookId, double price, String category, boolean isFilmed, boolean isSeries) {
        super(title, author, bookId, price, category);
        this.isFilmed = isFilmed;
        this.isSeries = isSeries;
    }

    @Override
    public String DisplayDetails() {
        return ("Book Title: "+ super.getTitle() + "\nBook Author: " + super.getAuthor() + "\nBook ID: " + super.getBookId() + "\nBook Price: " + super.getPrice() + "\nBook category: " + super.getCategory() + "\nBook is Filmed: " + this.isFilmed() + "\nBook is Series: " + this.isSeries());
    }
}
