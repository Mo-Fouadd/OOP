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
//A person has a name, address, phone number, and
//email address.
public class Person {
    String name;
    String address;
    long phone;
    String email;
    public Person(){}
    public Person(String name, String address, long phone, String email){
        this.address=address;
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
     @Override
	public String toString() {
		return "Person, Name: "+ name ;
	}
}
