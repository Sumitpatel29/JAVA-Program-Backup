package com.pattern.star;

/*
  
 *
 **
 ***
 ****
 
 */
public class RightHalfPyramid 
{
	public static void printPattern(int n)
	{
		// outer loop to handle rows
		for (int i = 1; i <= n; i++)	
		{ 		
			// inner loop to handle columns
			for (int j = 1; j <= i; j++)			
			{
				System.out.print("* ");	//check in question if it is asking for * with space or only *
			}
			// printing new line for each row
			System.out.println();				//System.out.println();
		}
	}
	public static void main(String args[])
	{
		int n = 4;
		printPattern(n);
	}
}
