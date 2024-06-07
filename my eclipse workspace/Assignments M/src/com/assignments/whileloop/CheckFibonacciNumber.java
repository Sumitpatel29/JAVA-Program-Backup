package com.assignments.whileloop;

public class CheckFibonacciNumber {
	public static void main(String[] args) {
		System.out.println(checkFibo(4));
		
	}

	public static boolean checkFibo(int n) 
	{
		if(n == 0 || n ==1) {
			return true;
		}
		int n1 = 0;
		int n2 = 1;
		while(true)
		{
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			
			if(n3 == n) {
				return true;
			}else if(n3 >n) {
				return false;
			}
		}
	}
}