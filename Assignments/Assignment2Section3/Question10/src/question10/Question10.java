/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Student-1
 */
public class Question10 {
//10.(The Person, Student, Employee, Faculty, and Staff classes) Design a class named
//Person and its two subclasses named Student and Employee. Make Faculty and
//Staff subclasses of Employee. A person has a name, address, phone number, and
//email address. A student has a class status (freshman, sophomore, junior, or
//senior). Define the status as a constant. An employee has an office, salary, and
//date hired. A faculty member has office hours and a rank. A staff member has a
//title. Override the toString method in each class to display the class name and the
//person’s name. Draw the UML diagram for the classes and implement them.
//Write a test program that creates a Person, Student, Employee, Faculty, and Staff,
//and invokes their toString() methods.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person a = new Person("3obad","gleem",012730,"3obad@email.com");
        Student b = new Student("Mo","King",20100919,"Mo@email.com",Student.SOPHOMORE);
        Employee c = new Employee("Yo7","Gleem bardo",2010,"yo7@email.com","Aboqeer",9999,LocalDate.now());
        Faculty d = new Faculty("Tifa","Rushdy",20101,"Tifa@email.com","Miami",99999,LocalDate.now(),8,"Boss");
        Staff e = new Staff("Rani","Ganakleez",201010,"Rani@email.com","Sheraton",999999,LocalDate.now(),"VIP");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    
}
