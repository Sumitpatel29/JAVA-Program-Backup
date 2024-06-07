package com.pr.conditionalstatemets;

public class ShopDiscount {

	public static void main(String[] args) 
	{
		//int qty=100;
		float bill=51000f;
		if(bill>1000)
		{
			float disc=bill+bill*0.10f;
			bill=bill-disc;
			System.out.println("got discount");
			System.out.println(bill);
			
		}
		else
		{
			System.out.println("no discount");
			System.out.println(bill);
		}
	}

}
