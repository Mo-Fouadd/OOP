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
//A faculty member has office hours and a rank.
public class Faculty extends Employee {
    int officeHours;
    String rank;
    public Faculty(){}
    public Faculty(String name, String address, long phone, String email, String office,
            double salary, LocalDate dateHired, int officeHours, String rank){
        super(name,address,phone,email,office,salary,dateHired);
        this.officeHours=officeHours;
        this.rank=rank;
    }
    @Override
	public String toString() {
		return "Faculty, Name: "+ name ;
	}
}
