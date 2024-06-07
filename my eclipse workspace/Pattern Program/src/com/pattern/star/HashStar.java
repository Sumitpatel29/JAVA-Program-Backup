package com.pattern.star;
/*

 # # # # * 
 # # # * * 
 # # * * * 
 # * * * * 
  
 */
public class HashStar
{
	public static void printPattern(int n)
	{
		for (int i = 1; i <= n; i++)	
		{ 	
			for (int j = i; j <= n; j++)			
			{
				System.out.print("# ");	//check in question if it is asking for * with space or only *
			}
			for (int j = 1; j <= i; j++)			
			{
				System.out.print("* ");	
			}
			System.out.println();			
		}
	}
	public static void main(String args[])
	{
		int n = 4;
		printPattern(n);
	}

}
