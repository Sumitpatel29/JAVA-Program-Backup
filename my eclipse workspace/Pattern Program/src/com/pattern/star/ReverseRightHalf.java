package com.pattern.star;
/*
  
 ****
 ***
 **
 *
 
 */
public class ReverseRightHalf 
{
	public static void printPattern(int n)
	{
		for(int i=n;i>=1;i--)
		{ 		
			// inner loop to handle columns
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");			
			}
			// printing new line for each row
			System.out.println();				
		}
	}
	public static void main(String args[])
	{
		int n = 5;
		printPattern(n);
	}
}

