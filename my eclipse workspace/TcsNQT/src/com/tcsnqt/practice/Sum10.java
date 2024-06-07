package com.tcsnqt.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sum10 
{
	public static void main(String[] args) 
	{
		int[] num= {5,2,4,6,5,7,8,5};
		Arrays.sort(num);
		int i=0,j=num.length-1;
//		for (int i= 0; i < num.length; i++)
//		{
//			for (int j = num.length-1; j>=0; j--) 
//			{
				while(i<j)
				{
					if(num[i]+num[j]==10)
					{
						System.out.print(num[i]+" "+num[j]);
						i++;
						j--;
					}
					else if(num[i]+num[j]<10)
					{
						j--;
					}
					else
					{
						i++;
					}
				}
//			}
//		}
	}
}