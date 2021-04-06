package exceptions;

import java.util.*;

public class Person {
	
	private String lastName;
	private String firstName;
	public Person(String firstName,String lastName) {
		try {
			if (firstName.length()==0 ||lastName.length()==0) {
				String msg = "First and last name is must";
				throw new FirstnameOrLastnameNotFound(msg);

			}
		} catch (FirstnameOrLastnameNotFound e) {
			System.out.println(e);
			System.exit(1);
		}

		this.firstName = firstName;
		this.lastName=lastName;
	}

	public void display() {

		System.out.println("Age of the person: " + this.firstName+" "+ this.lastName);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		Person obj = new Person("afs","last");
		obj.display();
	}
}
