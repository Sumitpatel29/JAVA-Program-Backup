public class Bill 
{
 public static void bill(int unit)
 {
	 if(unit<=200)
	 {
		 System.out.println("Your bill is free");
	 }
	 if(unit>200 && unit <=300)
	 {
		 double bill=unit*6;
		 System.out.println("your bill is " +bill);
	 }
	 if(unit>300)
	 {
		 double bill=unit*7;
		 System.out.println("your bill is " +bill);
	 }
 }
 public static void main(String[] args) 
 {
	bill(201);
 }
}
