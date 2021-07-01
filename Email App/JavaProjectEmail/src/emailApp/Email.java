package emailApp;

import java.util.Scanner;

public class Email {
	
	//	Assigning class level variables
	private String firstname;
	private String lastname;
	private String password;
	private int passwordLengthDefault = 8;
	private String department;
	private int capacityMailbox = 700;
	private String email;
	private String alternateEmail;
	private String companyName = "GMT Holdings";
	//	Ignoring the spaces in-between the Company name	
	private String spaceIgnoredCompanyName = companyName.replaceAll("\\s","");
	
	//	constructor made to receive the first and last name
	public Email(String firstname, String lastname, String spaceIgnoredCompanyName) {
		
		//	this.firstname and this.lastname is the class level variable and, 
		//	it is equaled to the firstname and lastname respectively, which is a local variable inside the constructor created 		
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("New Employee Name: " + this.firstname + " " + this.lastname );
		
		//	Calling the setter/method - asking the department to return the department 
		this.department = setDepartment();
//		System.out.println("\nDepartment: " + this.department);
		
		//	Calling the setter/method - to generate a password which is randomly generated and  return
		this.password = passwordRandom(passwordLengthDefault);
		System.out.println("The Password (which contains "+ this.passwordLengthDefault +" characters) is: " + this.password);
		
		this.spaceIgnoredCompanyName = spaceIgnoredCompanyName;	
		//	Generating the email as requested by combining the elements needed in the appropriate format in lower case
		email = (firstname + "." + lastname + "@" + department + "." + spaceIgnoredCompanyName + ".com" ).toLowerCase();
//		System.out.println("The Email is: " + email);
		
		
	}
	
	
	//	Setter - Ask for which department
	private String setDepartment() {
		System.out.println("\nThe Department Numbers are as follows:");
		System.out.println("\tEnter '1' for Sales Department");
		System.out.println("\tEnter '2' for IT Department");
		System.out.println("\tEnter '3' for Finance Department");
		System.out.println("\tEnter '4' for HR Department");
		System.out.println("\tEnter '0' to show no department \n");
		System.out.print("Enter the Department Number to select: ");
		
		Scanner integer = new Scanner(System.in);
		int selectedDepartment = integer.nextInt();
		
		//	Switch case used to select which department	
		switch (selectedDepartment) {
			
			case 1:	
				return "Sales" ;
			
			case 2:
				return "IT";
				
			case 3:
				return "Finance";
			
			case 4:
				return "HR";
				
			default:
				return "No department";								
		
		}
		
	}
	
	
	//	Setter - Generate a password which is randomly generated
	private String passwordRandom(int length) {
		
		//	Contains all; the letters in the English alphabet(capital and simple), password special characters and numbers from 0 to 9
		//	Note: Even I might have mistakenly added few extra characters or missed a few characters... so please excuse in-advance	
		String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~1234567890";
		
		// array of characters		
		char[] password = new char[length];
		
		//	iterating through the value of the length
		for(int x=0; x<length; x++) {
			
			//	Generating a random number and casting to integer type and multiply by the length of the setPassword and pass the random number to the array one by one
			int randomNumber = (int)(Math.random()* setPassword.length());
			password[x] = setPassword.charAt(randomNumber); 
		}
		//	Since password was a set of characters, re-modifying password as a new String to make keep it in string type	
		return new String(password);
						
	}
		
	//	Setter - Setting the capacity of the mailbox
	public void setCapacityMailbox(int capacity) {
		this.capacityMailbox = capacity;
		
	}
		
	//	Setter - Setting the alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
		
	}
			
	//	Setter - Changing the password
	public void changePassword(String password) {
		this.password = password;
		
	}
	
	// Getter - getting the capacity of the mailbox and returning it
	public int getCapacityMailbox() {
		return capacityMailbox;
		
	}
	
	// Getter - getting the alternate email and returning it
	public String getAlternateEmail() {
		return alternateEmail;
		
	}
	
	// Getter - getting the password and returning it
	public String getPassword() {
		return password;
		
	}
	
	//	Method to Display the main information
	public String displayInformation() {
		return "Full Name: " + firstname + " " + lastname + "\nCompany Email-address: " + email +
				"\nMail box Capacity: " + capacityMailbox + " mb ";
		
		
		
	}
	

}
