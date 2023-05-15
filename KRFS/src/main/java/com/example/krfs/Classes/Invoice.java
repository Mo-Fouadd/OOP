package com.example.krfs.Classes;

import java.util.Date;
public class Invoice implements Display
{
    private int invoiceNo;
    private User user;
    private int amountOfBooks;
    private double price;
    public Date dateOfPurchase;

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAmountOfBooks() {
        return amountOfBooks;
    }

    public void setAmountOfBooks(int amountOfBooks) {
        this.amountOfBooks = amountOfBooks;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setAmount(double p)
    {

    }
    public String DisplayDetails(){
        return null;
    }

}
