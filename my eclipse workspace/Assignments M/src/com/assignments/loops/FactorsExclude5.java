//write a java code to return true if the factors of the number if it have any factors within 5 and excluding itself//

package com.assignments.loops;

import java.util.Scanner;

public class FactorsExclude5 
{
	public static boolean checkfactors(int n)
	{
		if(n<5)
		{
			return false;
		}
		for(int i=2;i<=n-1;i++)
		{
			if (n % i == 0 && i != n) 
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(checkfactors(n));

	}

}
