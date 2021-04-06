package exceptions;

import java.util.Scanner;

public class Emp {
	public void display(String firstName, String lastName) {
		try {
			if(firstName==null||lastName==null) {
				throw new FirstnameOrLastnameNotFound("Both first and last name must not be empty");	
			}	
			}
			catch(FirstnameOrLastnameNotFound e) {
				System.out.println(e);
				System.exit(1);
			}
		System.out.println("Name of the employee :"+firstName+" "+lastName);
	}

	public static void main(String[] args) {
		String firstName=null;
		String lastName=null;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first and last name:");
		String firstNameAndLastName=sc.nextLine();
		String[]name=firstNameAndLastName.split(" ");
		Emp obj= new Emp();
		firstName=name[0];
		if(name[1]!=null) {
		lastName=name[1];
		}
		System.out.println(firstName+ lastName);
		obj.display(firstName,lastName);
	}



}
