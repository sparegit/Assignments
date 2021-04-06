package exceptions;

import java.util.Scanner;

public class Employee {
	 String firstName;
	 String lastName;
	
		public Employee(String firstName,String lastName) {
			try {
			if(firstName.length()==0||lastName.length()==0) {
				throw new FirstnameOrLastnameNotFound("Both first and last name must not be empty");	
			}	
			}
			catch(FirstnameOrLastnameNotFound e) {
				System.out.println(e);
				System.exit(1);
			}
			this.firstName=firstName;
			this.lastName=lastName;
		}
		public void display() {

			System.out.println("Name of the employee: " + this.firstName+" "+ this.lastName);
		}

	public static void main(String[] args) {
		
		String firstName;
		String lastName;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first name:");
		firstName=sc.nextLine();
		System.out.println("Enter the last name:");
		lastName=sc.nextLine();
		Employee obj= new Employee(firstName,lastName);
		obj.display();
	}

}
