package com.assignments.array;

import java.util.Scanner;

/*Find frequency of given element.i.e find how many times the element is present in the array
 intput:= int[] num={1,2,2,3,4,1,5,6,7,1,2}    int key=1
 output:= 3
 */
public class Frequency      
{
	public static void frequency(int[] num,int key)
	{
		int count=0;
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]==key)
			{
			count++;	
			}			
		}
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers into the array:");
		int[] num=new int[5];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the Key:");
		int key=sc.nextInt();
		frequency(num,key);
		sc.close();
		
	}

}
