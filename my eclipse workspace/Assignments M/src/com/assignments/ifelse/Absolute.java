/*Write a program to print absolute value of a number entered by user .
 * E.g:- input: 1     output:1
 *       input: -1    output:1
 */
package com.assignments.ifelse;

import java.util.Scanner;

public class Absolute 
{
 public static int absolute(int num)
 {
	 if(num<0)
	 {
		 num=num*(-1);
		 return num;
	 }
	 return num;
 }
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number for getting absolut of it: ");
  int num=sc.nextInt();
  System.out.println(absolute(num));
  sc.close();
}
}

//----------------USING VOID RETURNTYPE-------------//
/*
public class Absolute 
{
 public static void absolute(int num)
 {
	 if(num<0)
	 {
		 num=num*(-1);
		 System.out.println("the number is: "+ num);
	 }
	 else
	 {
	 System.out.printls(num);
	 }
 }
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number for getting absolut of it: ");
  int num=sc.nextInt();
  absolute(num);
}
}
*/