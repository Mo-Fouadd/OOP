package com.example.krfs.Classes;

public class Person
{
    private String name;
    private String Pass;
    private int ID;
    private String Type;

    public Person(String name, String pass, int ID, String type)
    {
        this.name = name;
        Pass = pass;
        this.ID = ID;
        Type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

}
