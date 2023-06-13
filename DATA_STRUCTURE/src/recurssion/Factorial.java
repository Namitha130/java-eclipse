package recurssion;

public class Factorial 
{	
	static int fact=1;
	static int i=1;
	public static int factorial(int n)
	{
		if( i <=n)
		{
			fact = fact*i;
			i++;
			factorial(n);
		}
		return fact;
	}
	public static void main(String[] args) 
	{	
		System.out.println("start");
		System.out.println(factorial(3));
		System.out.println("stop");
	}
}
