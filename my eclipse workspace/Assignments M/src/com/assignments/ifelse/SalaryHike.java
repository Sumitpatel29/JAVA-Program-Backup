/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
 * Ask user for their salary and year of service and print the net bonus amount.
 */

package com.assignments.ifelse;

import java.util.Scanner;

public class SalaryHike 
{
	public static double checkBonus(double sal,int exp)
	{
		if(exp>5)
		{
			double hike=sal*0.5;
			sal=sal+hike;
			System.out.println("You got a salary hike of 5% and your salary is");
		}
		return sal;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter your salary: ");
		double sal=sc.nextDouble();
		System.out.println("Enter your Year Of Service: ");
		int exp=sc.nextInt();
		System.out.println(checkBonus(sal,exp));
		sc.close();
	}
}

//----------------VOID RETURNTYPE----------------//
/*  public class SalaryHike 
{
	public static void checkBonus(double sal,int exp)
	{
		if(exp>5)
		{
			double hike=sal*0.5;
			sal=sal+hike;
			System.out.println("You got a salary hike of 5% and your salary is: " + sal);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter your salary: ");
		double sal=sc.nextDouble();
		System.out.println("Enter your Year Of Service: ");
		int exp=sc.nextInt();
		checkBonus(sal,exp);
	}
}
*/
