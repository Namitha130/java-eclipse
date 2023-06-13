package com.logical.array;

public class CountPairNum 
{
	public static int sort(int[] num)
	{	
		 int pair =0;
		for(int i=0; i<=num.length-1;i++)
		{
			for(int j=0; j<=num.length-2;j++)
			{
				if(num[j] > num[j+1]) 
				{
					int temp=num[j];
					num[j] = num[j+1];
					num[j+1] =temp;
				}
			}
		}
		//System.out.println(Arrays.toString(num));
//		return num;
		
		for(int k=0; k<num.length-1;k++)
		{
			if(num[k]==num[k+1])
			{	
				//System.out.println(k + " " +(k+1));
				pair++;
				k++;
			}
		}
		return pair;
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,1,2,1,4,2,7,8,2};
		System.out.println(sort(num));
	}
}
