package com.assignments.arra2;

public class FourInOne
{
	public static void printduplicate(int[] num)
	{
		for (int i = 0; i < num.length-1; i++) 
		{
			int c=1;
			for (int j = i+1; j < num.length-1; j++) 
			{
				if(num[i]==num[j])
				{
					c++;
					num[j]=-1;
				}
			}
			//if(num[i]!=-1 && c>1)   { print duplicate elements
			//if(num[i]!=-1 && c==1   { print unique elements
			//if(num[i]!=-1  		  { Remove duplicate elements
			if(num[i]!=-1 )
			{
				//System.out.print(num[i]+" ");
				System.out.println(num[i]+"---->"+c);  //printing frequency of each numbers with count
			}
		}
	}
	public static void main(String[] args)
	{
		int[] num= {1,2,1,3,5,6,2,1,1};
		printduplicate(num);

	}

}
