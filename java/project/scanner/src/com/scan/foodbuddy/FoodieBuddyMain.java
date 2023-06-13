package com.scan.foodbuddy;
import java.util.Scanner;

public class FoodieBuddyMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Zomato!, Let's create your account to enjoy delicious food");
		System.out.println("Enter your good name");
		String user_name = sc.nextLine();
		
		System.out.println("Enter your password");		
		String password = sc.next();
		while(FoodieBuddy.ValidatePassword(password)!= "Valid") {
			System.out.println("Password must contatin atleast one special character,one digit and total characters should be between 6 and 20");
			System.out.println("Enter your password");
			password = sc.next();
			FoodieBuddy.ValidatePassword(password);
		}		

		System.out.println("Enter your mobile number");
		long mobile_no = sc.nextLong();
		while (FoodieBuddy.countDigit(mobile_no)!=10) {
			System.out.println("Mobile number should be of 10 digits");
			System.out.println("Enter your mobile number");
			mobile_no = sc.nextLong();
		}
		
		sc.nextLine();
		
		System.out.println("Enter your locality ");
		String locality = sc.nextLine();

		System.out.println("Enter your pincode to deliver the order");
		long pincode = sc.nextLong();
		while (FoodieBuddy.countDigit(pincode)!=6) {
			System.out.println("Pincode number should be of 6 digits");
			System.out.println("Enter your pincode number");
			pincode = sc.nextLong();
		}

		/*String user_name = "Rahul"; long mobile_no = 123l;
		String password ="123";long pincode = 582103l;String locality = "Gadag";*/

		FoodieBuddy f1 = new FoodieBuddy(user_name,mobile_no,password,locality,pincode);
		f1.registration();
		f1.login();
		f1.logic();

		System.out.println("Your order will be delivered to this address : ");
		f1.showUserDetails();
		System.out.println("Thanks for ordering food with us, Visit Again !!!");
		sc.close();
	}
}
