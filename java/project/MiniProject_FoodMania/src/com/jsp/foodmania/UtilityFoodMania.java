package com.jsp.foodmania;

import java.util.Scanner;

class UnAvailableService extends Exception {
	public UnAvailableService(String str) {
		super(str);
	}
}

public class UtilityFoodMania {

	public static void main(String[] args) {

		System.out.println("**************Welcome to FOODMANIA Food service **************");
		// adding user information to scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String First_name = scan.next();
		System.out.println("Enter your last name");
		String last_name = scan.next();
		String s1 = new String(" ");
		String Username = First_name.concat(s1).concat(last_name);
		System.out.println("Your Full name is : " + Username);

//		System.out.println("Enter your full Name:");
//		String Username = scan.next();
		System.out.println("Enter your Contact number:");
		long contact_no = scan.nextLong();
		System.out.println("Enter Delivery address:");
		String address = scan.next();
		System.out.println("Enter Pincode:");
		int pincode = scan.nextInt();

		FoodDetails user = new FoodDetails(Username, contact_no, address, pincode);

		System.out.println("****************Hey, " + Username + "!!! ****************");
		System.out.println("****************You have successfully logged in**************** ");
		System.out.println("Kindly...Check your details: ");
		System.out.println();
		user.show_UserDetails(); // calling show user details method by reference object of food details class
		System.out.println();

		// local timings
		System.out.println("Please..Enter your local-time: ");
		double timing = scan.nextDouble();
		FoodDetails local_time = new FoodDetails(timing); //construtor for local time
		local_time.local_timings();
		// choice for veg nd nonveg
		

		if (timing >= 06.00 && timing <= 11.30) {
			System.out.println("Enter your breakfast choice: 1.veg or 2. nonveg");

			int choose = scan.nextInt();
			if (choose == 1) {
				user.display_Veg_breakfast();
				// System.out.println("Would you like to change your choice???");
				System.out.println("Select your dishes:1,2,3,4,5");
				user.Display_bf_food();
			} else if (choose == 2) {
				user.display_NonVeg_breakfast();
				System.out.println("Select your dish: 6,7,8,9,10,11");
				user.Display_bf_food();
			} else {
				System.out.println("Kindly enter your correct choice....");
			}
		} else if (timing >= 12.00 && timing <= 23.30) {
			System.out.println("Enter your choice: 1.veg or 2. nonveg");
			int choose = scan.nextInt();
			if (choose == 1) {
				user.display_Veg_lunch();
				System.out.println("Select your dishes:1 or 2 or 3 or 4 or 5");
				user.Display_food();
			} else if (choose == 2) {
				user.display_NonVeg_lunch();
				System.out.println("Select your dish: 6,7,8,9,10");
				user.Display_food();
			} else {
				System.out.println("Kindly enter your correct choice....");
			}
		} 
		else {
			try {
				availability(timing);
			} catch (UnAvailableService i) {
				// System.out.println("Caught the exception");
				System.out.println("Exception occured " + i);
			}
		}
		
		public static void availability(double timing) throws UnAvailableService
		{
			if (timing >= 11.31 && timing <= 11.59) {
				throw new UnAvailableService("Ooops!! Food is being preparing please wait ..");
			} else {
				throw new UnAvailableService("SORRY.... for the Inconvenience!!! We won't serve food in midnight");
				}
			
		}
		
	
	System.out.println("");
		System.out.println("hey!!" + Username + " I have some tempting offers to quench your thirst");
		System.out.println("If you want to know please enter: 1 for YES or 2 for NO");
		int addMore = scan.nextInt();
		if (addMore == 1) {
			user.display_desserts_menu();
			System.out.println();
			System.out.println("Select your dish: 1,2,3,4,5,6,7");
			System.out.println();
			user.Display_desserts();
			user.apply_coupon();
			user.bill_generate();
		} else {
			user.apply_coupon();
			user.bill_generate();
		}

		// bill generation process
		// user.bill_generate();
		// customer ratings
		user.Customer_reviews();
	}

}
