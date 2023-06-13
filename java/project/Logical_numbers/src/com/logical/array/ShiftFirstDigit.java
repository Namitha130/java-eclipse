package com.logical.array;

public class ShiftFirstDigit
{	
	public static int[] shiftLeft(int[] nums) 
	{ 
	 if(nums.length > 1)
	  {
	     int first =nums[0];
	    for(int i=0 ; i< nums.length-1; i++)
	    {
	      nums[i] =  nums[i+1];
	    }
	    nums[nums.length-1] = first;
	  }
	   return nums; 
	}
	public static void main(String[] args)
	{
		int[] nums= {6,2,5,3,5};
		//System.out.println(shiftLeft(nums));
		for(int j=0; j<=nums.length-1;j++)
		{
			System.out.print(nums[j] +" ");
		}
	}
}
