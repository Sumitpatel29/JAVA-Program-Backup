package test1;
public class Ticket 
{
 public static int blue(int a,int b,int c)
 {
	 if(a+b==10 || b+c==10 || a+c==10)
	 {
		 return 10;
	 }
	 if(a+b==b+c+10 || a+b==a+c+10)
	 {
		 return 5;
	 }
	 else
	 {
		 return 0;
	 }
 }
 public static void main(String[] args) 
{
 System.out.println(blue(5,5,10));
}
}