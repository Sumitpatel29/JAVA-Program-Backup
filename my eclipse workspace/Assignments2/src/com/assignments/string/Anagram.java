package com.assignments.string;

import java.util.Arrays;

public class Anagram 
{
	public static boolean isAnagram(String a,String b)
	{
		 if (a.length() != b.length())
	    {
			 return false;
	    }
		         
		// Convert strings to char arrays and sort them
		char[] ar1 = a.toCharArray();
		char[] ar2 = b.toCharArray();
		Arrays.sort(ar1);
		Arrays.sort(ar2);

		// Compare sorted char arrays
		return Arrays.equals(ar1, ar2);  //it will check the length also
	}
	//-------------------logic 2------------------------------//
	public static char[] tocharArray(String str)
	{
		char[] ch=new char[str.length()];
		for(int i=0; i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		return ch;
	}

	public static char[] sort(char[] ch)  //bubble Sort
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length-1;j++)
			{
				if(ch[j]>ch[j+1])
				{
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		return ch;
	}  //dont forget to write and use all these helper methods isAnagram method
public static void main(String[] args)
{
	// TODO Auto-generated method stub

}

}
