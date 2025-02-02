package _NiceToKnow;

import java.util.Scanner;

public class PatientInfo_BooleanEquals_Replit {

	public static void main(String[] args) {
		
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
	    int age, zipcode;
	    double height, weight;
	    boolean isMarried;
	    long workPhoneNumber, personalPhoneNumber;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");

	    firstName = scan.nextLine();
		System.out.println("Enter your last name");
		lastName = scan.nextLine();
		   // this part is already provided DO NOT CHANGE
		        System.out.println("Enter your email");
		        email = scan.next();
		        scan.nextLine();//to capture Enter key press
		        System.out.println("Enter your street");
		        street = scan.nextLine();
		     // continue for city
		        
		        System.out.println("Enter your city");
		        city = scan.nextLine();
		        System.out.println("Enter your state");
		        state = scan.nextLine();
		      System.out.println("Enter your zip code");
		        zipcode = scan.nextInt();
		    System.out.println("Enter your work phone number");
		        workPhoneNumber = scan.nextInt();
		 System.out.println("Enter your personal phone number");
		       personalPhoneNumber = scan.nextInt();
		 System.out.println("Enter your age");
		        age = scan.nextInt();
		 System.out.println("Enter your height");
		        height = scan.nextDouble();
		System.out.println("Enter your weight");
		        weight = scan.nextDouble();
		System.out.println("Are you married?");
		isMarried = scan.nextBoolean();  /*
		isMarried=scan.next().equals("yes");
Question is tru/false but the input is String , we can not convert a string to boolean. Actually scan.nextBoolean() is a kind of function to read the input string and convert it to boolean. 
But our input string is the word "yes". So compiler can not understand wheter "yes" means true or false. So we interpret it to a boolean value.
		*/

			contacts = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: "+ email;
			fullName = "Patient personal information\nFull name: " + lastName+ ", " + firstName;
			address = "Address: " + street + ", "+city+", "+state+" "+ zipcode;
		        
		     /*
		      * Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314, email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true   
		      */
			System.out.println(fullName);
		    System.out.println(address);
		    System.out.println("Contacts: " + contacts);
		    System.out.println("Age: "+ age);
		    System.out.println("Height: "+ height);
		    System.out.println("Weight: "+ weight + " pounds");
		    System.out.println("Married?: " + isMarried);
		        
	}

}
