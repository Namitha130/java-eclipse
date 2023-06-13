package com.scan.foodmania;

import java.util.Scanner;

public class FoodDetails {
	private String userName;
	private long contact_no;
	private String address;
	private int pincode;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	double local_time;
	int compliment = 1;
	int deliver_fee = 50;

	double total_price;
	double item_price;
	public int quantity;
	// veg breafst
	int dosa = 105;
	int Idli_Vada_Samber = 60;
	int Bisibele_bath = 55;
	int Puliyogare_bath = 70;
	int Poori_saagu_Chutney = 100;
	// nonveg breafst
	int Dosa_chicken_curry = 150;
	int Dosa_Mutton_curry = 180;
	int Idli_vada_mutton_curry = 150;
	int Parata_fish_curry = 225;
	int Eggrice = 105;
	int Chapati_egg_burji = 155;
	// veg dishes for both lunch nd evening
	int Veg_Biriyani_combo = 235;
	int Panner_manchurian_tikka = 225;
	int Jeera_rice_combo = 210;
	int Mashroom_biriyani_combo = 256;
	int Panner_biriyani_combo = 315;
	// Non-veg dishes for both lunch nd eveng
	int Chicken_Biriyani_combo = 345;
	int Mutton_Biriytani_Combo = 356;
	int Chicken_lolypop = 245;
	int Chicken_tandoori = 420;
	int chicken_biriyani = 299;
	// Desserts
	int Gulab_jamun = 50;
	int badhampuri = 65;
	int carrot_halwa = 45;
	int mysorepak = 25;
	// Beverages
	int Sweet_lassi = 25;
	int Coke = 30;
	int Sprite = 30;
	//
	Scanner scan = new Scanner(System.in);

	// constructor for usr details
	FoodDetails(String userName, long contact_no, String address, int pincode)
	{
		this.userName = userName;
		this.contact_no = contact_no;
		this.address = address;
		this.pincode = pincode;
	}

	// method to show user details
	public void show_UserDetails() 
	{
		System.out.println("User name is :" + userName);
		System.out.println("User Contact number is :" + contact_no);
		System.out.println("Delivery address is: " + address);
		System.out.println("locality pincode is: " + pincode);
	}
	
	public static int countDigit(long n)
	{
		int count = 0;
		while (n != 0) 
		{
			n = n / 10;
			++count;
		}
		return count;
	}
	FoodDetails(double local_time) 
	{
		this.local_time = local_time;
	}

	public void local_timings() 
	{
		if (local_time >= 6.00 && local_time <= 11.30) 
		{
			System.out.println("Good Morning!!!!");
		}
		else if (local_time >= 12.00 && local_time <= 16.00)
		{
			System.out.println("Good Afternoon!!!!");
		} 
		else if (local_time >= 16.01 && local_time <= 23.30)
		{
			System.out.println("GOOd Evening!!!!!");
			System.out.println("************what would you like to have for Dinner ?*********");
		} 
		else if (local_time >= 11.31 && local_time <= 11.59) 
		{
//			IllegalArgumentException ie1 = new IllegalArgumentException();
//			throw ie1;
			// System.out.println("Ooops!! Food is being preparing please wait ..");
		} else 
		{
			// System.out.println("SORRY.... for the Inconvenience!!! We won't serve food in
			// midnight");
//			IllegalArgumentException ie2 = new IllegalArgumentException();
//			throw ie2;
		}
	}

	public void display_Veg_breakfast() {
		System.out.println("*********Vegetarian Breakfast Menu***********");
		System.out.println();
		System.out.println("1. Dosa ...................105rs");
		System.out.println("2. Idli Vada Samber .......60rs");
		System.out.println("3. Bisibele bath...........55rs");
		System.out.println("4. Puliyogare ............70rs");
		System.out.println("5. Poori saagu Chutney.....100rs ");

	}

	public void display_NonVeg_breakfast() {
		System.out.println("*********Non-Vegetarian Breakfast Menu***********");
		System.out.println();
		System.out.println("6. Dosa & chicken curry............150rs");
		System.out.println("7. Dosa & Mutton curry.............180rs ");
		System.out.println("8. Idli & vada mutton curry........150rs ");
		System.out.println("9. Parata fish curry...............225rs");
		System.out.println("10. Eggrice and sherwah.............105rs ");
		System.out.println("11. Chapati with egg burji...............155rs ");
	}

	public void display_Veg_lunch() {
		System.out.println("*********Vegetarian dishes ***********");
		System.out.println();
		System.out.println("1.Veg Biriyani with combo.............235rs ");
		System.out.println("2. Panner manchurian tikka............225");
		System.out.println("3. Jeera rice combo...................210rs");
		System.out.println("4. Mashroom biriyani combo............256rs ");
		System.out.println("5. Panner biriyani combo..............315rs");
	}

	public void display_NonVeg_lunch() {
		System.out.println("*********Non-Vegetarian Dishes ***********");
		System.out.println();
		System.out.println("6.Chicken Biriyani with combo........345rs ");
		System.out.println("7. Mutton Biriytani Combo............356rs ");
		System.out.println("8. Chicken lolypop...................245rs");
		System.out.println("9. Chicken tandoori..................420rs ");
		System.out.println("10. chicken biriyani..................299rs ");
	}

	public void display_desserts_menu() {
		System.out.println("***********DESSERT MENU******************");
		System.out.println();
		System.out.println("1.Gulab jamun...........50rs");
		System.out.println("2.Badampuri ............65rs");
		System.out.println("3.Carrot halwa..........45rs");
		System.out.println("4.Mysorepak ............25rs");
		System.out.println();
		System.out.println("***************BEVERAGES*************");
		System.out.println();
		System.out.println("5.Sweet_lassi...........25rs");
		System.out.println("6.Coke..................30rs");
		System.out.println("7.Sprite...............30rs");
	}

	public void Display_bf_food() {
		int dish = scan.nextInt();
		switch (dish) {
		case 1:
			System.out.println("Dosa is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * dosa;
			System.out.println("Total Price is :" + total_price);
			break;
		case 2:
			System.out.println("Idli_Vada_Samber is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Idli_Vada_Samber;
			System.out.println("Total Price is :" + total_price);
			break;
		case 3:
			System.out.println("Bisibele_bath is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Bisibele_bath;
			System.out.println("Total Price is :" + total_price);
			break;
		case 4:
			System.out.println("Puliyogare_bath is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Puliyogare_bath;
			System.out.println("Total Price is :" + total_price);
			break;
		case 5:
			System.out.println("Poori_saagu_Chutney is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Poori_saagu_Chutney;
			System.out.println("Total Price is :" + total_price);
			break;
		case 6:
			System.out.println("Dosa_chicken_curry is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Dosa_chicken_curry;
			System.out.println("Total Price is :" + total_price);
			break;

		case 7:
			System.out.println("Dosa_mutton_curry is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Dosa_Mutton_curry;
			System.out.println("Total Price is :" + total_price);
			break;
		case 8:
			System.out.println("Idli_vada_mutton_curry is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Idli_vada_mutton_curry;
			System.out.println("Total Price is :" + total_price);
			break;
		case 9:
			System.out.println("Parata_fish_curry is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Parata_fish_curry;
			System.out.println("Total Price is :" + total_price);
			break;
		case 10:
			System.out.println("Eggrice is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Eggrice;
			System.out.println("Total Price is :" + total_price);
			break;
		case 11:
			System.out.println("Chapati_egg_burji is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Chapati_egg_burji;
			System.out.println("Total Price is :" + total_price);
			break;

		default:
			System.out.println("oops!! Invalid dish choice");
			break;
		}

	}

	public void Display_food() {
		int dishnv = scan.nextInt();
		switch (dishnv) {
		case 1:
			System.out.println("Veg_Biriyani_combo is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Veg_Biriyani_combo;
			System.out.println("Total Price is :" + total_price);
			break;
		case 2:
			System.out.println("Panner_manchurian_tikkais selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Panner_manchurian_tikka;
			System.out.println("Total Price is :" + total_price);
			break;
		case 3:
			System.out.println("Jeera_rice_combo is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Jeera_rice_combo;
			System.out.println("Total Price is :" + total_price);
			break;
		case 4:
			System.out.println("Mashroom_biriyani_combo is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Mashroom_biriyani_combo;
			System.out.println("Total Price is :" + total_price);
			break;
		case 5:
			System.out.println("Panner_biriyani_combo is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Panner_biriyani_combo;
			System.out.println("Total Price is :" + total_price);
			break;
		case 6:
			System.out.println("Chicken_Biriyani_combo is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Chicken_Biriyani_combo;
			System.out.println("Total Price is :" + total_price);
			break;
		case 7:
			System.out.println("Mutton_Biriytani_Combo is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Mutton_Biriytani_Combo;
			System.out.println("Total Price is :" + total_price);
			break;
		case 8:
			System.out.println("Chicken_lolypop is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Chicken_lolypop;
			System.out.println("Total Price is :" + total_price);
			break;
		case 9:
			System.out.println(" Chicken_tandoori is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Chicken_tandoori;
			System.out.println("Total Price is :" + total_price);
			break;
		case 10:
			System.out.println("chicken_biriyani is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * chicken_biriyani;
			System.out.println("Total Price is :" + total_price);
			break;

		default:
			System.out.println("oops!! Invalid dish choice");
			break;
		}

	}

	public void Display_desserts() {
		int dessert = scan.nextInt();
		switch (dessert) {
		case 1:
			System.out.println("Gulab jamun is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Gulab_jamun;
			System.out.println("Total Price is :" + total_price);
			break;
		case 2:
			System.out.println("badhampuri is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * badhampuri;
			System.out.println("Total Price is :" + total_price);
			break;
		case 3:
			System.out.println("carrot halwa is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * carrot_halwa;
			System.out.println("Total Price is :" + total_price);
			break;
		case 4:
			System.out.println("mysorepak is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * mysorepak;
			System.out.println("Total Price is :" + total_price);
			break;
		case 5:
			System.out.println("Sweet lassi is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Sweet_lassi;
			System.out.println("Total Price is :" + total_price);
			break;
		case 6:
			System.out.println("Coke  is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Coke;
			System.out.println("Total Price is :" + total_price);
			break;
		case 7:
			System.out.println("Sprite is selected");
			System.out.println();
			System.out.println("Enter Quantity:");
			quantity = scan.nextInt();
			total_price = total_price + quantity * Sprite;
			System.out.println("Total Price is :" + total_price);
			break;
		default:
			System.out.println("oops!! Invalid  choice");
			break;
		}
	}

	public void apply_coupon() 
	{
		if (total_price > 350) 
		{
			System.out.println("*******Congratulation!! You got free delivery for your order*******");
			System.out.println("*****Whenever an order exceeds 300 rupees,*********");
			System.out
					.println("As a compliment, we love to tell you that you're getting chicken kabab for rupees 1rs.");
			System.out.println("Enter 1.to add COMPLIMENTORY  2. to SKIP");
			int compliment = scan.nextInt();

			if (compliment == 1) 
			{
				total_price = total_price + compliment;
			} 
			else 
			{
				bill_generate();
			}
		} 
		else if (total_price > 250) 
		{
			System.out.println("****Congratulation!! You got free delivery with your order..********");
			System.out.println();

		}
		else
		{
			System.out.println("Your total cost is: " + total_price);
			System.out.println("Delivery charge = 50rs ");
			total_price = total_price + deliver_fee;
			bill_generate();
		}
	}

	public void bill_generate() {
		System.out.println();

		System.out.println("Total Bill will be :" + total_price);

	}

	public void Customer_reviews() 
	{
		System.out.println("***********THANK YOU for the ordering***********");
		System.out.println("********** Your food is being preparing and will be delivered to below address in 30min");
		System.out.println("Delivery address : ");
		show_UserDetails();
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Please share your experience in the range of 1-5");
		System.out.println("Rate us: ");
		int ratings = scan.nextInt();
		switch (ratings) {
		case 1:
			System.out.println("*");
			System.out.println(
					"SORRY! FOR THE Uneasiness. Next time, we intend to deliver the highest level of service. ");
			break;
		case 2:
			System.out.println("**");
			System.out.println(
					"SORRY! FOR THE Uneasiness. Next time, we intend to deliver the highest level of service.");
			break;
		case 3:
			System.out.println("***");
			System.out.println("Fine.. We hope to provide the best service the next time.");
			break;
		case 4:
			System.out.println("****");
			System.out.println("Good..Thank you for your Feedback");
			break;
		case 5:
			System.out.println("*****");
			System.out.println("EXCELLENT..Thank you for your Feedback********");
			break;
		default:
			System.out.println("Kindly enter valid ratings points..");
			break;
		}
		System.out.println("*******************Thank you for ordering!!! VISIT AGAIN**************");
	}

}
