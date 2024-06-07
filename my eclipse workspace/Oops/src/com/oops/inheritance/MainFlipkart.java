package com.oops.inheritance;

import java.util.Scanner;

class FlipkartOrder
{
	public void orderProduct() 
	{
		System.out.println("Oder Placed");	
	}
}
class Fashion extends FlipkartOrder
{
	public void mensFashion()
	{
		System.out.println("Enter your choice \n"+"1.place order 2.Add to Cart 3.Cancel Product");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			orderProduct();
		}
		else if(choice==2) 
		{
			System.out.println("Added to cart");
		}
		else if(choice==3)
		{
			System.out.println("Product Cancelled");
		}
	}
	public void womensFashion()
	{
		System.out.println("Enter your choice \n"+"1.place order 2.Add to Cart 3.Cancel Product");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			orderProduct();
		}
		else if(choice==2) 
		{
			System.out.println("Added to cart");
		}
		else if(choice==3)
		{
			System.out.println("Product Cancelled");
		}
	}
}
class FashionBrands extends Fashion
{
	public void puma()
	{
		System.out.println("Enter your choice \n"+"1.Mens Fashion 2.Womens Fashion");
		Scanner sc=new Scanner(System.in);
		int fashionchoice=sc.nextInt();
		if(fashionchoice == 1)
		{
			mensFashion();
		}
		else if(fashionchoice == 2)
		{
			womensFashion();
		}
		else
		{
			System.out.println("Invalid Selection");
		}
	}
	public void nike()
	{
		System.out.println("Enter your choice \n"+"1.Mens Fashion 2.Womens Fashion");
		Scanner sc=new Scanner(System.in);
		int fashionchoice=sc.nextInt();
		if(fashionchoice == 1)
		{
			mensFashion();
		}
		else if(fashionchoice == 2)
		{
			womensFashion();
		}
		else
		{
			System.out.println("Invalid Selection");
		}
	}
	public void arrow()
	{
		System.out.println("Enter your choice \n"+"1.Mens Fashion 2.Womens Fashion");
		Scanner sc=new Scanner(System.in);
		int fashionchoice=sc.nextInt();
		if(fashionchoice == 1)
		{
			mensFashion();
		}
		else if(fashionchoice == 2)
		{
			womensFashion();
		}
		else
		{
			System.out.println("Invalid Selection");

		}
	}
}
class Electronics extends FlipkartOrder
{
	public void mobile()
	{
		System.out.println("Mobile is Selected");
		System.out.println("Enter your choice \n"+"1.place order 2.Add to Cart 3.Cancel Product");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			orderProduct();
		}
		else if(choice==2) 
		{
			System.out.println("Added to cart");
		}
		else if(choice==3)
		{
			System.out.println("Product Cancelled");
		}//resume
	}
	public void laptop()
	{
		System.out.println("Laptop is Selected");
		System.out.println("Enter your choice \n"+"1.place order 2.Add to Cart 3.Cancel Product");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			orderProduct();
		}
		else if(choice==2) 
		{
			System.out.println("Added to cart");
		}
		else if(choice==3)
		{
			System.out.println("Product Cancelled");
		}
	}
}
class ElectronicsBrands extends Electronics
{
	public void dell()
	{
		
		System.out.println("Enter your choice \n"+"1.Mobile 2.Laptop");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice == 1)
		{
			
			mobile();
		}
		else if(choice == 2)
		{
			laptop();
		}
		else
		{
			System.out.println("Invalid Selection");

		}

	}
	public void apple()
	{
		System.out.println("Enter your choice \n"+"1.Mobile 2.Laptop");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice == 1)
		{
			mobile();
		}
		else if(choice == 2)
		{
			laptop();
		}
		else
		{
			System.out.println("Invalid Selection");

		}
	}
	public void samsung()
	{
		System.out.println("Enter your choice \n"+"1.Mobile 2.Laptop");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice == 1)
		{
			mobile();
		}
		else if(choice == 2)
		{
			laptop();
		}
		else
		{
			System.out.println("Invalid Selection");

		}
	}
}
class Grocery  extends FlipkartOrder
{
	public void fruits()
	{
		System.out.println("Enter your choice \n"+"1.Apple 2.Grapes 3.Orange");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Bought Apple");
		}
		else if(choice == 2)
		{
			System.out.println("Bought Grapes");
		}
		else if(choice == 3)
		{
			System.out.println("Bought Orange");
		}
		else
		{
			System.out.println("Invalid selection");
		}
	}
	public void vegetables()
	{
		System.out.println("Enter your choice \n"+"1.Potato 2.Cucumber 3.Carrot");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Bought Potato");
		}
		else if(choice == 2)
		{
			System.out.println("Bought Cucumber");
		}
		else if(choice == 3)
		{
			System.out.println("Bought Carrot");
		}
		else
		{
			System.out.println("Invalid selection");
		}
	}
}


public class MainFlipkart 
{
	public static void main(String[] args) 
	{
		System.out.println("------WELCOME TO FLIPKART------");
		System.out.println("*Enter your Choice*");
		System.out.println("1.Fashion Brands 2.Electronic Brands 3.grocery");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: FashionBrands f1= new FashionBrands();
		System.out.println("Enter your choice \n"+"1.Puma  2.Nike  3.Arrow");
		int brandchoice=sc.nextInt();
		if(brandchoice == 1)
		{
			f1.puma();
		}
		else if(brandchoice == 2)
		{
			f1.nike();
		}
		else if (brandchoice == 3) 
		{
			f1.arrow();
		}
		else
		{
			System.out.println("Invalid Selection");
		}
		break;
		case 2: ElectronicsBrands e1=new ElectronicsBrands();
		System.out.println("Enter your choice \n"+"1.Dell  2.Apple 3.Samsung");
		int brandelec =sc.nextInt();
		if(brandelec ==1)
		{
			e1.dell();
		}
		else if(brandelec==2)
		{
			e1.apple();
		}
		else if(brandelec==3)
		{
			e1.samsung();
		}
		{
			System.out.println("Invalid Selection");
		}
		break;
		case 3:Grocery g1=new Grocery();
		System.out.println("Enter your choice \n"+"1.Fruits 2.Vegetables");
		int grocerychoice=sc.nextInt();
		if(grocerychoice==1)
		{
			g1.fruits();
		}
		else if(grocerychoice==2)
		{
			g1.vegetables();
		}
		else
		{
			System.out.println("Invalid selection");
		}
			break;
		default:System.out.println("Invalid Selection");
		}
	}
}
