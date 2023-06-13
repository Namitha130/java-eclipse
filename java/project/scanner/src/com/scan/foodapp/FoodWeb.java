package com.scan.foodapp;
import java.util.Scanner;
public class FoodWeb {
	double total_price;
	double  item_price;
	public int quantity;
	int dosa=45;
	int southThali=145;
	int northThali=120;
	int friderice=120;
	int frenchprise=130;
	int ch1;
	String name="veg";
	String nextorder;
	int biryani=450;
	int chicken_roll=100;
	Scanner sc=new Scanner(System.in);
	public void display_menu()
	{
		System.out.println("*********************");
		System.out.println("------------WELCOME TO FOODZONE----------------------------");
		System.out.println("              1:DOSA        :45");
		System.out.println("              2:southThali  :145");
		System.out.println("              3:northThali  :120");
		System.out.println("              4:friderice   :120");
		System.out.println("              5:frechprise  :130");
		System.out.println("********************");
	
		
	}
   public void bill_generate()
   {
	   System.out.println();
	   System.out.println("*******Thank you for the ordering ********");
	   System.out.println("your bill is :"+total_price);
   }
   public void veg_food()
   {
	   while(true)
	   {
	  ch1=sc.nextInt();
	   switch(ch1)
	   {
	   case 1:  System.out.println("you have selected dosa !!");
	            System.out.println();
	            System.out.println("Quantity"); 
	            quantity=sc.nextInt();
	            total_price=total_price+quantity*dosa;
	            break;
	   case 2:  System.out.println("you have selected southThali !!");
                System.out.println();
                System.out.println("Quantity"); 
                quantity=sc.nextInt();
                total_price=total_price+quantity*southThali;
                break;
	   case 3:  System.out.println("you have selected northThali !!");
                System.out.println();
                System.out.println("Quantity"); 
                quantity=sc.nextInt();
                total_price=total_price+quantity*northThali;
                break;
	   case 4:  System.out.println("you have selected friderice !!");
                System.out.println();
                System.out.println("Quantity"); 
                quantity=sc.nextInt();
                total_price=total_price+quantity*friderice;
                 break;
	   case 5:  System.out.println("you have selected frenchprise !!");
                System.out.println();
                System.out.println("Quantity"); 
                quantity=sc.nextInt();
                total_price=total_price+quantity*frenchprise;
                break;
	   case 6:  System.out.println("you have selected biriyani !!");
                System.out.println();
                System.out.println("Quantity"); 
                 quantity=sc.nextInt();
                 total_price=total_price+quantity*biryani;
                  break;
        case 7:  System.out.println("you have selected chicken_roll !!");
                   System.out.println();
                  System.out.println("Quantity"); 
                   quantity=sc.nextInt();
                   total_price=total_price+quantity*chicken_roll;
                  break;

	   default :System.out.println("oops!! invalid choice");
	   break;
	   }
	   System.out.println();
	   System.out.println("do you want to order more!!(true)(false)");
	   nextorder =sc.next();
	   if(nextorder.equalsIgnoreCase("ya"))
	   {
		   
		   veg_food();
	   }
	   else if(nextorder.equalsIgnoreCase("no"))
	   {
		   bill_generate();
		   System.exit(1);
	   }
	   }
	   }
   public void display_menu_nonveg()
	{
		System.out.println("*********************");
		System.out.println("------------WELCOME TO FOODZONE----------------------------");
		System.out.println("              6:biryani      :450");
		System.out.println("              7:chicken-roll  :100");
		System.out.println("********************");
	
		
	}

}