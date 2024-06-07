package com.assignments.string;

public class Seperate
{
	public static void separatestring(String str)
	{
		String upper="";
		String lower="";
		String num="";
		String spl="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				upper=upper+str.charAt(i);
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				lower=lower+str.charAt(i);
			}
			else if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				num=num+str.charAt(i);
			}
			else
			{
			spl=spl+str.charAt(i);
			}
		}
		System.out.println("upper case="+upper);
		System.out.println("lower case="+lower);
		System.out.println("number="+num);
		System.out.println("Special Character="+spl);
		
	}
	public static void main(String[] args) {
		separatestring("Sumit!123");

	}

}
