// ---------USING VOID TYPE-----------//

package com.test.revise;

public class SumUsingVoid 
{
	public static void add(int a, int b)//in void returning is not supported. So to get the sum, we have to print the value inside the add() only.
	{
		int sum=a+b;
		//return;  //if we write return here, the compiler will exit from here and we will get an error called unreachable statement
		System.out.println(sum);
		//return; /*in void it returns but ,it returns explicitly by the constructor.*/
	}
	public static void main(String[] args) 
	{
		add(45,85);
		add(45,75);
	}
}

