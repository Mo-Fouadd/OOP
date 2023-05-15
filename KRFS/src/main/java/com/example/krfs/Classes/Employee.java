package com.example.krfs.Classes;

public class Employee extends Person
{
    public Employee(String name, String pass, int ID, String type)
    {
        super(name, pass, ID, type);
    }
    public boolean updatePrice(int price , Book book)
    {
        book.setPrice(price);
        return false;
    }
    public boolean addEmployee()
    {
        return false;
    }
    public boolean addUser()
    {
        return false;
    }
    public boolean addBook()
    {
        return false;
    }
    public boolean addAuthor()
    {
        return false;
    }
    public boolean removeBook()
    {
        return false;
    }
    public boolean removeUser() {
        return false;
    }
}
