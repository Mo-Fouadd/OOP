package com.example.krfs.Classes;

//import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Date;

public class User extends Person implements Display{
    private ArrayList<Book> booksBought;
    private Invoice inv;

    public User(String name, String pass, int ID, String type) {
        super(name, pass, ID, type);
    }

    public boolean addBook()
    {
        return false;
    }
    public boolean removeBook()
    {
        return false;
    }
    public Invoice printInvoice(int invoiceNo)
    {
        return inv;
    }
    public Invoice printInvoice(Date dateOfPurchase)
    {
        return inv;
    }
    public void addInvoice()
    {
    }
    public void removeInvoice()
    {

    }
    public String DisplayDetails(){
        return null;
    }
}
