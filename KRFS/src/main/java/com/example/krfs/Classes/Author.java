package com.example.krfs.Classes;

import java.util.ArrayList;
import java.util.Date;

public class Author implements Display{
    private String name;
    private Date dateOfBirth;
    private ArrayList<Book> booksWritten;

    public Author(String name, Date dateOfBirth, ArrayList<Book> booksWritten) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.booksWritten = booksWritten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<Book> getBooksWritten() {
        return booksWritten;
    }


    public void setBooksWritten(ArrayList<Book> booksWritten) {
        this.booksWritten = booksWritten;
    }
    public String DisplayDetails()
    {
        return ("Author Name: " + this.getName() + "Author Date Of Birth: " + this.getDateOfBirth() + "Author Books Written: " + this.getBooksWritten());
    }
}
