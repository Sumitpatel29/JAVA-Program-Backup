package com.assignments.array;

public class MissingElement
{
	public static int missing(int[] num,int N)  //[O(n^2) time complexity] 
	{
		int i=1;
		for (i = 1; i <=N; i++) //start checking from 1 {this loop is checking the numbers from 1 to N
		{
			boolean b=false;
			for (int j = 0; j < num.length; j++)  //this loop is checking if the number of first loop is present in the given array or not
			{
				if(num[j]==i)    //if that is present
				{
					b=true;       //make boolean value b to true
					break;        // and break the inner loop 
				}
			}
			if(b==false)  //after breaking inner loop,the outer loop is still running. So, break the outer loop when b is false
			{
				break;
			}
		}
		return i; //we are returning i because from an array having  10 elements if one element is missing means that must be the ith element.(i.e 9) 
	}
	
	
	//------------------LOGIC 2---------------------------//
	
	
	public static int missing2(int[] num,int N)    // [O(n)] -> time complexity
	{
		int[] res=new int[N+1];                  //O(2n) -> space complexity
		for (int i = 0; i < num.length; i++) 	//iterating an array of elements
		{
			res[num[i]] =1;  //taking the index of num array and checking it for res array index and replacing that with 1 and at last we will check which array index is 0
		}
		int i;
		for ( i = 1; i < res.length; i++)   
		{
			if(res[i]==0)   //when the array index of result array will be 0, break the loop there and return at which iteration it is breaked.
			{
				break;
			}
		}
		return i;
	}

	public static void main(String[] args) 
	{
		int[] num= {6,1,2,8,3,4,7,10,5}; // giving array input
		int N=10; 							//size of array
		System.out.println(missing2(num, N));
		//System.out.println(missing(num, N));

	}

}
