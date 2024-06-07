package test1;
public class Round 
{
 public static int roundUp(int n)
 {
	 if((n%10)>=5)
	 {
		return n= 10-(n%10)+n;
	 }
	 else
	 {
		 return n= (n%10)-n;
	 }
 }
 public static void main(String[] args) 
{
 System.out.println(roundUp(5));
}
}
