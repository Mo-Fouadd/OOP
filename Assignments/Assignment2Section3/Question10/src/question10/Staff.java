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
// A staff member has a title.
public class Staff extends Employee {
    String title;
    public Staff(){}
    public Staff(String name, String address, long phone, String email, String office,
            double salary, LocalDate dateHired,String title){
            super(name,address,phone,email,office,salary,dateHired);
            this.title=title;
    }
    @Override
	public String toString() {
		return "Staff, Name: "+ name ;
	}
}
