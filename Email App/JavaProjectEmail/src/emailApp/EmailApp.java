package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		//	Adding the firstname, lastname and the company name(in the appropriate format as required for the email) 	
		Email e1 = new Email("Gavin","Manjitha","GMTHoldings");
		
		//	Calling the Setting and getting the alternate email	in E1 object in Email
		System.out.print("The alternate Email: ");
		e1.setAlternateEmail("gm@gmail.com");
		System.out.println(e1.getAlternateEmail());
		
		//	Calling displayInformation method and printing it
		System.out.println("\n"+e1.displayInformation());
		

	}

}
