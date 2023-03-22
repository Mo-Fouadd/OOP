/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.time.LocalDate;

/**
 *
 * @author Student-1
 */
//An employee has an office, salary, and
//date hired.
public class Employee extends Person {
    String office;
    double salary;
    LocalDate dateHired;
    public Employee(){}
    public Employee(String name, String address, long phone, String email, String office,
            double salary, LocalDate dateHired) {
		super(name, address, phone, email);
		this.office=office;
                this.salary=salary;
                this.dateHired=dateHired;
	}
    @Override
	public String toString() {
		return "Employee, Name: "+ name ;
	}
}
