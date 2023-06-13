package com.scan.foodmania;

import java.util.Scanner;

class UnAvailableService extends Exception
{
	public UnAvailableService(String str) 
	{
		super(str);
	}
}

public class UtilityFoodMania 
{
	public static void availability(double local_time) throws UnAvailableService
	{
		if (local_time > 11.30 && local_time < 12.00) 
		{
			throw new UnAvailableService("Ooops!! Food is being preparing please wait ..");
		} 
		else if(local_time>23.30 && local_time<6.00)
		{
			System.out.println("SORRY.... for the Inconvenience!!! We won't serve food in midnight");
		}
		else{
			System.out.println("");
		}
	}

	public static void main(String[] args) 
	{	System.out.println("---------------------------------------------------------------------------");System.out.println();
		System.out.println("                    Welcome to FOODMANIA Food service                       ");
		System.out.println();System.out.println("--------------------------------------------------------------");
		System.out.println("Please register with your details:");
		System.out.println("");
		// adding user information to scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String First_name = scan.next();
		System.out.println("Enter your last name");
		String last_name = scan.next();
		String s1 = new String(" ");
		
		String Username = First_name.concat(s1).concat(last_name);
		System.out.println("Your Full name is : " + Username);
		System.out.println("");
		System.out.println("Enter your Contact number:");
		long contact_no = scan.nextLong();
		while (FoodDetails.countDigit(contact_no) != 10) 
		{
			System.out.println("Mobile number should be of 10 digits");
			System.out.println("Enter your mobile number");
			contact_no = scan.nextLong();
		}
		System.out.println("Enter Delivery address:");
		String address = scan.next();
		System.out.println("Enter Pincode:");
		int pincode = scan.nextInt();

		FoodDetails user = new FoodDetails(Username, contact_no, address, pincode);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Hey, " + Username + "!!!");
		System.out.println("");
		System.out.println("You have successfully login to FoodMania Service");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Kindly...Check your details: ");
		System.out.println();
		user.show_UserDetails(); // calling show user details method by reference object of food details class
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		// local timings
		System.out.println("Please..Enter your local-time: ");
		double timing = scan.nextDouble();
		FoodDetails local_time = new FoodDetails(timing);
		local_time.local_timings();
		// choice for veg nd nonveg
		try
		  {
			availability(timing);
		  }
		  catch(UnAvailableService i)
		  {
			 // System.out.println("Caught the exception");
			  System.out.println("Exception occured "+ i);
		  }

		if (timing >= 06.00 && timing <= 11.30)
		{
				System.out.println("Enter your breakfast choice: 1.veg or 2. nonveg");
				int choose = scan.nextInt();
				if (choose == 1) 
				{
					user.display_Veg_breakfast();
					// System.out.println("Would you like to change your choice???");
					System.out.println("Select your dishes:1,2,3,4,5");
					user.Display_bf_food();
				} 
				else if (choose == 2)
				{
					user.display_NonVeg_breakfast();
					System.out.println("Select your dish: 6,7,8,9,10,11");
					user.Display_bf_food();
				} 
				else 
				{
					System.out.println("Kindly enter your correct choice....");
				}
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println(" Do you want to add more ???");
				System.out.println("Make your choice: 1. yes or 2.no");
				int orderAgain = scan.nextInt();
				if(orderAgain == 1)
				{
					System.out.println("");
					user.display_NonVeg_breakfast();
					user.display_NonVeg_breakfast();
					System.out.println();
					System.out.println("----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("Select your dish:");
					user.Display_bf_food();
				}
				else {
					System.out.println("-------------------------------------------------------------------------");
				}
		} 
		else if (timing >= 12.00 && timing <= 23.30)
		{
				System.out.println("Enter your choice: 1.veg or 2. nonveg");
				int choose = scan.nextInt();
				if (choose == 1) 
				{
					user.display_Veg_lunch();
					System.out.println("Select your dishes:1 or 2 or 3 or 4 or 5");
					user.Display_food();
				} 
				else if (choose == 2) 
				{
					user.display_NonVeg_lunch();
					System.out.println("Select your dish: 6,7,8,9,10");
					user.Display_food();
				} else 
				{
					System.out.println("Kindly enter your correct choice....");
				}
				
				System.out.println("---------------------------------------------------------------------------");
				System.out.println(" Do you want to add more ???");System.out.println();
				System.out.println("Make your choice: 1. yes or 2.no");
				int orderAgain = scan.nextInt();
				if(orderAgain == 1)
				{
					System.out.println("");
					user.display_Veg_lunch();
					user.display_NonVeg_lunch();
					System.out.println();
					System.out.println("----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("Select your dish:");
					user.Display_food();
				}
				else {
					System.out.println("");
				}
		} 
		else
		{
				System.out.println("");
		}

		System.out.println("Hey!!!!"+  Username);System.out.println("");
		System.out.println("I have some tempting offers to quench your thirst");
		System.out.println();
		System.out.println("If you want to know please enter: 1 for YES or 2 for NO");
		int addMore = scan.nextInt();
		if (addMore == 1) 
		{
			user.display_desserts_menu();
			System.out.println();
			System.out.println("Select your dish: 1,2,3,4,5,6,7");
			System.out.println();
			user.Display_desserts();
			user.apply_coupon();
			user.bill_generate();
		}
		else 
		{
			user.apply_coupon();
			user.bill_generate();
		}

		user.Customer_reviews();
	}

}
