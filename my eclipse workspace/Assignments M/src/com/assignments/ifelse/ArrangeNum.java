package com.assignments.ifelse;

import java.util.Scanner;

public class ArrangeNum 
{
 public static void arrange(int a, int b , int c)
 {
	 if(a<b && b<c)
	 {
		 if(b<c)
		 {
			 System.out.println(a +" "+b+" "+ c);
		 }
		 else
		 {
			 System.out.println(a+" "+b+""+c);
		 }
	 }
		 else if(b<a && b<c)
		 {
			 if(a<c)
			 {
				 System.out.println(b+""+a+""+c);
			 }
			 else
			 {
				 System.out.println(b+""+c+""+a);
			 }
		 }
		 else
		 {
			 if(a<b)
			 {
				 System.out.println(c+""+a+""+b);
			 }
			 else
			 {
				 System.out.println(c+""+b+""+a);
			 }
		 }
	 }
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 3 integers: ");
	 int a =sc.nextInt();
	 int b =sc.nextInt();
	 int c =sc.nextInt();
  	 arrange(a,b,c);
  	 sc.close();
}
}
//arrange given 3 integers in increment order 
/* input:- int a=12,int b=19,int c=17
output:- a=14,b=17,c=19*/