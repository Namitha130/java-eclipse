package com.scan.foodapp;
import java.util.Scanner;
public class MainFood {

	public static void main(String[] args) {
		System.out.println("*******Have Anything But Pay the Bill!!!!*******");
			FoodWeb f1=new FoodWeb();
			Scanner sc12=new Scanner(System.in);
			System.out.println("ENTER YOUR OPTION 1:VEG 2:NO-VEG");
			int choose=sc12.nextInt();
			if(choose==1)
			{
				System.out.println("WELCOME TO VEG RESTO!!");
		 	f1.display_menu();
		 	System.out.println("Enter your choice"); 
		 	f1.veg_food();
			}
			else if(choose==2)
			{
				System.out.println("WELCOME TO NON-VEG!!!!!!");
			   f1.display_menu_nonveg();
			   System.out.println("Enter your choice");
			 	f1.veg_food();
				System.out.println("Please choose valid option");
			}
}
}
