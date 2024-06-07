/*print prime within range
  int start=10,int end =20
  o/p:-11 13 17 19
 */

package com.assignments.loops;

import java.util.Scanner;

public class PrintFactorial 
{
	public static void printfact(int start,int end)
	{
		for (int n=start;n>=end;n++)
		{
			long fact=1L;
			for(int i=1;i<=end;i++)
			{
				fact=fact*i;
			}
			System.out.println(n);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int start=sc.nextInt();
		System.out.println("Enter ending number: ");
		int end=sc.nextInt();
		printfact(start,end);
	}
}

