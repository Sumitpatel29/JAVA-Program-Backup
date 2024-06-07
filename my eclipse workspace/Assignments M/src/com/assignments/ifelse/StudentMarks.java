/*A school has following rules for grading system:
 * below 25 - F
 * 25 to 45-E
 * 45 to 50 - D
 * 50 to 60 -C
 * 60 to 80 - B
 * Above 80 - A
 * Ask user to enter marks and print the corresponding grade.
 */
package com.assignments.ifelse;

import java.util.Scanner;

public class StudentMarks 
{
public static char checkMarks(int mark)
{
	if(mark<25)
	{
		return 'F';
	}
	else if(mark>=25 && mark<45)
	{
		return 'E';
	}
	else if(mark>=45 && mark<50)
	{
		return 'D';
	}
	else if(mark>=50 && mark<60)
	{
		return 'C';
	}
	else if(mark>=60 && mark<80)
	{
		return 'B';
	}
	else
	{
		return 'A';
	}
}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Marks: ");
int x=sc.nextInt();
System.out.println(checkMarks(x));
sc.close();
}
}

//--------------USING VOID RETURNTYPE-------------//
/*
public class StudentMarks 
{
public static void checkMarks(int mark)
{
	if(mark<25)
	{
		System.out.println("Your grade is F");
	}
	else if(mark>=25 && mark<45)
	{
		System.out.println("Your grade is E");
	}
	else if(mark>=45 && mark<50)
	{
		System.out.println("Your grade is D");
	}
	else if(mark>=50 && mark<60)
	{
		System.out.println("Your grade is C");
	}
	else if(mark>=60 && mark<80)
	{
		System.out.println("Your grade is B");
	}
	else
	{
		System.out.println("Your grade is A");
	}
}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Marks: ");
int mark=sc.nextInt();
checkMarks(mark);
sc.close();
}
}
*/