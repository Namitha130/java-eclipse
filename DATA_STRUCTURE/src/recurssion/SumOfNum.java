package recurssion;

public class SumOfNum {
	
	//method 1
	
//	public static int display(int n)
//	{
//		if(n == 0)
//		{
//			return 0;
//		}
//		else {
//			return n + display(n-1);
//		}
//	}
	
	//method 2
   static int sum=0;	static int i=1;
	public static int display(int n)
	{
		if(i <=n)
		{
			sum=sum+i;
			i++;
			display(n);
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("start");
		System.out.println(	display(10));
		System.out.println("stop");
	}

}
