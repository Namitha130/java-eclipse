package FuntionalLambdaInterface;
interface A
{
	public void test(int a);
}
public class FunctionalInterface1 {
	public static void main(String[] args) 
	{
		A a1= (a) ->
		{
			System.out.println(a);
		};
		a1.test(123);
	}
}
