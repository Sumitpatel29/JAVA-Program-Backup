package com.pr.conditionalstatemets;

public class IfElseExample
{
	public static void main(String[] args) 
	{
		boolean voterid=true;
		int age=45;
		if(age>=21)
		{
			if(voterid==true)
			{
				System.out.println("eligible");
			}
			else
			{
				System.out.println("Voter  id not available");
			}
		}
		else
		{
			System.out.println("Not eligible");
		}
	}

}
