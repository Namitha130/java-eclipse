package com.scan.foodbuddy;
import java.util.Scanner;

class InvalidPasswordException extends Exception
{
	private static final long serialVersionUID = 1L;
	public InvalidPasswordException(String str) 
	{
		super(str);
	}
}
public class FoodieBuddy {
	private String user_name;
	private long mobile_no;
	private String password;
	private String locality;
	private long pincode;
	double total=0;    

	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public FoodieBuddy(String user_name, long mobile_no, String password, String locality, long pincode) {
		this.user_name = user_name;
		this.mobile_no = mobile_no;
		this.password = password;
		this.locality = locality;
		this.pincode = pincode;
	}

	Scanner sc = new Scanner(System.in);
	public void registration() {
		System.out.println("User account creation successful!");
	}	

	public void login() {
		System.out.println("Let's login to order delicious food");
		System.out.println("Enter Your Mobile Number");
		long mobile_no1=sc.nextLong();
		System.out.println("Enter Your Password");
		String password1=sc.next();
		try {
			validateLogin(password1,mobile_no1);
		}
		catch(InvalidPasswordException i) 
		{   
			System.out.println("Caught The Exception");
			System.out.println("Exception Occured "+i);
			login();
		}
	}
	public static String ValidatePassword(String password) {
		if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length() >=6 && password.length()<=20){
			return "Valid";
		}
		else
		{
			return "Invalid";        	
		}

	}
	public static int countDigit(long n)
	{
		int count = 0;
		while (n != 0) {
			n = n / 10;
			++count;
		}
		return count;
	}
	
	public boolean validateLogin(String password1,long mobile_no1) throws InvalidPasswordException{
		if(mobile_no1==getMobile_no()) {
			if(getPassword().equals(password1)) {
				return true;
			}
			else {
				throw new InvalidPasswordException("Kindly check your credentials");				
			}
		} else {
			throw new InvalidPasswordException("Kindly check your credentials");
		}
	}
	public FoodieBuddy() {
		super();
	}
	public void logic() {
		System.out.println("Select below what kind of food you want to order");
		typeFood();

		System.out.println("Enter your choice for Food Type");
		int food_type = sc.nextInt();
		while(food_type > 5 || food_type <1) {
			System.out.println("Enter correct choice");
			food_type = sc.nextInt();
		}
		selectRestaurent(food_type);
		System.out.println("Enter your choice to select the Restaurent");
		int restaurent_choice = sc.nextInt();
		while(restaurent_choice > 5 || restaurent_choice <1) {
			System.out.println("Enter correct choice");
			restaurent_choice = sc.nextInt();
		}
		selectMenu(food_type,restaurent_choice);

		int food_choice = sc.nextInt();
		while(food_choice > 10 || food_choice <1) {
			System.out.println("Enter correct choice");
			food_choice = sc.nextInt();
		}
		order_place(food_choice);
		System.out.println();

	}
	/*	public void continueOrder(){
	System.out.println("Do you want to continue order? Press Y to continue OR N to proceed to checkout");
	String choice = sc.next();
	while(!(choice.equalsIgnoreCase("Y")|| (choice.equalsIgnoreCase("N")))) {
		System.out.println("Enter correct choice");
		choice = sc.next();
	}
	if(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("n")) {
		logic();
	}
	else {
		checkout();
	}

		if(choice.equalsIgnoreCase("y")||(choice.equalsIgnoreCase("n"))) {
			if(choice.equalsIgnoreCase("y")) {
				logic();
			}
			else{
				checkout();
			}
		}

	}*/
	public void checkout() {
		System.out.println("Your order total is "+total);
		System.out.println("Your order will be delivered to this address : ");
		showUserDetails();				
		System.out.println("Thanks for ordering food with us, Visit Again !!!");
	}
	public void selectRestaurent(int restaurent_choice) {		
		switch(restaurent_choice) {
		case 1 : biriyaniRestaurents();
		break;
		case 2 : pizzaRestaurents();
		break;
		case 3 : chickenRestaurents();
		break;
		case 4 : burgerRestaurents();
		break;
		case 5 : rollsRestaurents();
		break;
		default: System.out.println("Please enter correct choice");	    		 
		}
	}
	public void selectMenu(int restaurent_choice,int menu_choice) {
		if(restaurent_choice == 1 ) {
			switch(menu_choice) {
			case 1 : biriyaniMenu();
			break;
			case 2 : biriyaniMenu();
			break;
			case 3 : biriyaniMenu();
			break;
			case 4 : biriyaniMenu();
			break;
			case 5 : biriyaniMenu();
			break;
			default: System.out.println("Please enter correct choice");	    		 
			}
		}
		else if (restaurent_choice == 2 && menu_choice == 2) {
			switch(menu_choice) {
			case 1 :			
			case 2 :			
			case 3 :		
			case 4 :			
			case 5 : pizzaMenu();
			break;
			default: System.out.println("Please enter correct choice");	    		 
			}
		}
		else if (restaurent_choice == 3) {
			switch(menu_choice) {
			case 1 : 
			case 2 :
			case 3 : 
			case 4 : 
			case 5 : biriyaniMenu();
			break;
			default: System.out.println("Please enter correct choice");	    		 
			}
		}
		else if (restaurent_choice == 4) {
			switch(menu_choice) {
			case 1 :			
			case 2 :			
			case 3 :
			case 4 :			
			case 5 : burgerMenu();
			break;
			default: System.out.println("Please enter correct choice");	    		 
			}
		}
		else if (restaurent_choice == 5) {
			switch(menu_choice) {
			case 1 :			
			case 2 :			
			case 3 :			
			case 4 :			
			case 5 : rollsMenu();
			break;
			default: System.out.println("Please enter correct choice");	    		 
			}
		}
		else {
			System.out.println("Enter valid choice");
		}
	}
	public void showUserDetails() {
		System.out.println("Name : "+getUser_name());
		System.out.println("Place : "+getLocality());
		System.out.println("Mobile No : "+getMobile_no());
		System.out.println("Pincode : "+getPincode());
	}

	public void typeFood() {
		System.out.println("1  : Biriyani");
		System.out.println("2  : Pizza");
		System.out.println("3  : Chicken");
		System.out.println("4  : Burger");
		System.out.println("5  : Rolls");
	}
	public void biriyaniRestaurents() {
		System.out.println("Select from the below Restaurents for Biriyani");
		System.out.println("1  : Donne Biriyani");
		System.out.println("2  : Ambur Biriyani");
		System.out.println("3  : Kannur Food Point");
		System.out.println("4  : Hyderabad Biriyani House");
		System.out.println("5  : Paradise Biriyani");
	}
	public void pizzaRestaurents() {
		System.out.println("Select from the below Restaurents for yummy Pizza's");
		System.out.println("1  : The Pizza Bakery");
		System.out.println("2  : Domino's Pizza");
		System.out.println("3  : Great Pizza's");
		System.out.println("4  : Pizza Hut");
		System.out.println("5  : Brik Oven");
	}
	public void chickenRestaurents() {
		System.out.println("Select from the below Restaurents for Chicken");
		System.out.println("1  : Afghani Tandoori Hub");
		System.out.println("2  : Imperial Restaurent");
		System.out.println("3  : Empire Restaurent");
		System.out.println("4  : New Taj Darbar");
		System.out.println("5  : KFC");
	}
	public void burgerRestaurents() {
		System.out.println("Select from the below Restaurents for Burger");
		System.out.println("1  : Habibi Falafel");
		System.out.println("2  : McDonald's");
		System.out.println("3  : Truffles");
		System.out.println("4  : Burger King");
		System.out.println("5  : Boss Burger");
	}
	public void rollsRestaurents() {
		System.out.println("Select from the below Restaurents for Rolls");
		System.out.println("1  : Rolls On Wheels");
		System.out.println("2  : Truffles");
		System.out.println("3  : 7 Plates");
		System.out.println("4  : Lazeez");
		System.out.println("5  : Rolls King");
	}

	public void biriyaniMenu() {
		System.out.println("Select the food you want to order");
		System.out.println("1 : Donne Mutton Biriyani       170");
		System.out.println("2 : Donne Chicken Biriyani      110");
		System.out.println("3 : Donne Biriyani Rice          80");
		System.out.println("4 : Donne Egg Biriyani          100");
		System.out.println("5 : Kshatriya Kabab Biriyani    110");
		System.out.println("6 : Kshatriya Kabab             110");
		System.out.println("7 : Guntur Chicken              130");
		System.out.println("8 : Chilly Chicken              110");
		System.out.println("9 : Pepper Chicken              110");
		System.out.println("10: Chicken Lollipop            140");		
	}
	public void pizzaMenu() {
		System.out.println("Select the Pizza you want to order");
		System.out.println("1 : Margherita           170");
		System.out.println("2 : Tandoori Paneer      110");
		System.out.println("3 : Veggie Supreme        80");
		System.out.println("4 : Classic Corn         100");
		System.out.println("5 : Veg Kabab Surprise   110");
		System.out.println("6 : Tandoori Mushroom    110");
		System.out.println("7 : Italian Onion        130");
		System.out.println("8 : Italian Tomato       110");
		System.out.println("9 : Classic Sausage      110");
		System.out.println("10: Veg Loaded           140");
	}
	public void burgerMenu() {
		System.out.println("Select the Burger you want to order");
		System.out.println("1 : Crispy Veg Burger     170");
		System.out.println("2 : Chicken Burger        110");
		System.out.println("3 : Paneer Burger          80");
		System.out.println("4 : Tikki Twist Burger    100");
		System.out.println("5 : Double Patty Burger   110");
		System.out.println("6 : Cheese Burger         110");
		System.out.println("7 : Brown Burger          130");
		System.out.println("8 : Pasta Special Burger  110");
		System.out.println("9 : Sausage Burger        110");
		System.out.println("10: Cheese Tikka Burger   140");
	}
	public void rollsMenu() {
		System.out.println("Select the Rolls you want to order");
		System.out.println("1 : Aloo Cheese Roll       170");
		System.out.println("2 : Veg Cheese Roll        110");
		System.out.println("3 : Veg Paneer Roll         80");
		System.out.println("4 : Cheesy Corn Roll       100");
		System.out.println("5 : Panneer Mayonaise Roll 110");
		System.out.println("6 : Cheesy BBQ Roll        110");
		System.out.println("7 : Butter Chicken Roll    130");
		System.out.println("8 : Kolkata Roll           110");
		System.out.println("9 : Soya Chaap Roll        110");
		System.out.println("10: Mix Chicken Roll       140");
	}
	public void order_place(int food_choice) {
		int quantity = 0;

		switch(food_choice) {
		case 1 : System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = quantity * 170;
		System.out.println("Your order total is : "+total );
		break;
		case 2 : System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = quantity * 110;
		System.out.println("Your order total is : "+total );
		break;
		case 3 : System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = quantity * 80;
		System.out.println("Your order total is : "+total );
		break;
		case 4 : System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = quantity * 100;
		System.out.println("Your order total is : "+total );
		break;
		case 5 : System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = quantity * 110;
		System.out.println("Your order total is : "+total );
		break;
		case 6 : System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = quantity * 110;
		System.out.println("Your order total is : "+total );
		break;
		case 7 : System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = quantity * 130;
		System.out.println("Your order total is : "+total );
		break;
		case 8 : System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = quantity * 110;
		System.out.println("Your order total is : "+total );
		break;
		case 9 : System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = quantity * 110;
		System.out.println("Your order total is : "+total );
		break;
		case 10 : System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = quantity * 140;
		System.out.println("Your order total is : "+total );
		break;
		default : System.out.println("Enter valid choice");
		}	
	}
}
