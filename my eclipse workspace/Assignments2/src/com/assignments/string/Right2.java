package com.assignments.string;

public class Right2
{
	public static String right2(String str)
	{
		String frst2=str.charAt(0)+""+str.charAt(1);
		String last2=str.substring(str.length()-2,str.length());
		String mid =str.substring(str.length()/2);
		if(str.length()>=2)
		{
			return last2+frst2;
		}
		return str;	
	}

	public static void main(String[] args) 
	{
		String str="12345";
		System.out.println(right2(str));
	}

}
