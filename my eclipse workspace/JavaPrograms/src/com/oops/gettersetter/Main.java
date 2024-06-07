package com.oops.gettersetter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		System.out.println("--------welcome--------");
		System.out.println("1.signup ");
		Service s1=new Service();
		User u1=new User();
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice == 1 )
		{
			System.out.println("enter email");
			String email=sc.nextLine();sc.nextLine();
			System.out.println("enter password");
			String pw=sc.nextLine();
			s1.signUp(email,pw, u1);
			System.out.println("2.login");
			System.out.println("enter choice");
			int choice2 = sc.nextInt();
			if(choice2 == 2)
			{
				System.out.println("enter email");
				String email1=sc.nextLine();sc.nextLine();
				System.out.println("enter password");
				String pw1=sc.nextLine();
				s1.logIn(email1, pw1, u1);
			}
		} 
	}
}
