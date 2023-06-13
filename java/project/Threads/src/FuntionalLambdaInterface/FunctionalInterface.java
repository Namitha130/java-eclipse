package FuntionalLambdaInterface;

public class FunctionalInterface {
	public static void main(String[] args) {
		Runnable ref = () ->
		{
			for(int i=1; i<=5 ; i++)
			{
				System.out.println(i);
			}
			System.out.println(Thread.currentThread());
		};
		ref.run();
		System.out.println("-----------");
		Runnable ref1 = () ->
		{
			for(int i=1; i<=5 ; i++)
			{
				System.out.println(i);
				
			}
			System.out.println("-------");
			for(int j=2; j<=8 ; j++)
			{
				System.out.println(j);
			}
		};
		ref1.run();
		System.out.println("------");
		for(int k=3 ; k<=9;k++)
			System.out.println(k);
		System.out.println(Thread.currentThread());
	}
}
