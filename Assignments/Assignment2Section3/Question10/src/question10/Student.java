/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Student-1
 */
//A student has a class status (freshman, sophomore, junior, or
//senior). Define the status as a constant.
public class Student extends Person {
    
        int status;
	final static int FRESHMAN = 1;
        final static int JUNIOR = 2;
	final static int SOPHOMORE = 3;
	final static int SENIOR = 4;
        public Student(){}
	public Student(String name, String address,  
		long phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

	
//	public void setStatus(int status) {
//		this.status = status; 
//	}

	
	public String getStatus() {
		switch (status) {
			case 1 : return "Freshman"; 
			case 2 : return "Sophomore"; 
			case 3 : return "Junior"; 
			case 4 : return "Senior";
			default : return "Unknown"; 
		}
	}

	
       @Override
	public String toString() {
		return "Student, Name: "+ name ;
	}
}
