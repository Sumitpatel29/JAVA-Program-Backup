public class Ticket 
{
 public static void price(int km,char x)
 {
	 if(x=='m' || x=='M')
	 {
		 double price=km*2;
		 System.out.println("you are male and your ticket price is " +price);
	 }
		 else if(x=='f' || x=='F')
	 {
		 System.out.println("The ticket is free for females");
	 }
	 else
	 {
		 System.out.println("Insert what km u travelled and your gender in M / F ");
	 }
	 }
	 
 
 public static void main(String[] args) 
 {
    price(45,'a');	
 }
}
