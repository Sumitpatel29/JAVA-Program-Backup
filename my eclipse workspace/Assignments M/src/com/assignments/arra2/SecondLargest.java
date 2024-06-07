package com.assignments.arra2;

public class SecondLargest 
{
/*
 //---------Space Complexity-----------------------//
	 There are two integer variables 'max' and 'slarge', each requiring a constant amount of space.
     There is an integer array 'num' containing the input numbers, which consumes space proportional to the size of the input array.
	 There are no additional data structures or variables created inside the methods.
	 
	 Therefore, the space complexity of the code can be considered as O(n), where n is the number of elements in the input array 'num'. 
	 This is because the space required by the input array grows linearly with the size of the input. 
	
	//------------Time Complexity------------------------//
	
	 The time complexity of the given code is O(n), where n is the number of elements in the input array.
	 This is because the code iterates through the input array twice:

	 In the first loop, it finds the maximum element in the array, which requires iterating through the entire array once.
	 In the second loop, it finds the second largest element in the array, which again requires iterating through the entire array once.
	 Since the loops iterate through the array separately, their time complexities are additive, resulting in a time complexity of O(n + n) = O(2n).
 	 However, in asymptotic analysis, constants are typically ignored, so the time complexity is simplified to O(n). 
 */
	 
	public static int findsecondlargest(int[] num)
	{
		int max=num[0];
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]>max)
			{
				max=num[i];
			}
		}
		int slarge=-1;
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]>slarge && num[i]<max)   //checks if the number is grater then -1 and that number is less then the max we got,then that is the second largest
			{
				slarge=num[i];
			}
		}
		return slarge;
	}

	public static void main(String[] args) 
	{
		int[] num= {1,3,4,6,2,4,2,9};
		System.out.println(findsecondlargest(num));
	}

}
