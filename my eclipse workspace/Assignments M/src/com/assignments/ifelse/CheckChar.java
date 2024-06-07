package com.assignments.ifelse;

import java.util.Scanner;

public class CheckChar 
{
 public static String checkChar(char x)  //RETURN TYPE METHOD//
 {
	if(x>='A' && x<='Z')
	{
		return "It is upper case alphabet";
	}
	else if(x>='a' && x<='z')
	{
		return "It is lower case alphabet";
	}
	else if(x>='0' && x<='9')
	{
		return "It is a number";
	}
	else
	{
		return "special character";
	}
 }
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a character: ");
  char x=sc.next().charAt(0);
  System.out.println(checkChar(x));
  
  /*Scanner sc=new Scanner(System.in);
    while(true)   //has.Next()
    {
  System.out.println("Enter a character: ");
  char x=sc.next().charAt(0);
  System.out.println(checkChar(x));
    }*/
  sc.close();
}
}

//-------USING VOID RETURNTYPE--------//
/*

public class CheckChar 
{
public static void checkChar(char x)
{
	if(x>='A' && x<='Z')
	{
		System.out.println("It is upper case alphabet");
	}
	else if(x>='a' && x<='z')
	{
		System.out.println("It is lower case alphabet");
	}
	else if(x>='0' && x<='9')
	{
		System.out.println("It is Number");
	}
	else
	{
		System.out.println("It is Special Character");
	}
}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character: ");
char x=sc.next().charAt(0); //chatAt() will take string as a reference and index as an argument as gives character as output
 checkChar(x);	
 sc.close();
}
}
*/