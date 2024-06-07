package com.tcsnqt.practice;

import java.util.Scanner;

public class StarHash 	//if no. of * > # :- +ve  //if # > * :- -ve  //if # == * :- 0
{
//	public static int countstarhash(char[] sh)
//	{
//		int counts=0;
//		int counth=0;
//		for (int i = 0; i < sh.length(); i++) 
//		{
//			if(sh.charAt(i)=='*')
//			{
//				counts++;
//			}
//			if(sh[i]=='#')
//			{
//				counth++;
//			}
//		}
//		if(counts > counth)
//		{
//			return 1;
//		}
//		else if(counts < counth)
//		{
//			return -1;
//		}
//		return 0;
//
//	}
	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter  * and # :");
//		char[] sh=new char[5];
//		for(int i=0;i<sh.length;i++)
//		{
//			sh[i]=sc.ne
//		}
//		countstarhash(sh);
//	}
		String s="* * * # # #";
		int ch=0,cs=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='*')
			{
				ch++;
			}
			else if (s.charAt(i)=='#')
			{
				cs++;
			}
		}
		System.out.println(ch-cs);
		
		
		
		
		
	}

}
