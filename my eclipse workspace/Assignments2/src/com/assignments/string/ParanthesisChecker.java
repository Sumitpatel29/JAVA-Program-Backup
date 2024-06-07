package com.assignments.string;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisChecker 
{

	public static boolean ispar(String x)
	    {
	        Stack<Character> s1=new Stack<Character>();
	        for(int i=0;i<x.length();i++)
	        {
	            if(x.charAt(i)=='{' || x.charAt(i)=='(' || x.charAt(i)=='[')
	            {
	                s1.push(x.charAt(i));
	            }
	            else if(s1.isEmpty()==false && (s1.peek()=='[' && x.charAt(i)==']' || s1.peek()=='{' && x.charAt(i)=='}'
	                || s1.peek()=='(' && x.charAt(i)==')'))
	            {
	                s1.pop();
	            }
	            else
	            {
	                s1.push(x.charAt(i));
	            }
	        }
	        if(s1.isEmpty())
	        {
	            return true;
	        }
	        return false;
	        //return s1.isEmpty();
	    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		System.out.println(ispar(str));
	}
}
