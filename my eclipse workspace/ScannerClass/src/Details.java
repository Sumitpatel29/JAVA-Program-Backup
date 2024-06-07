import java.util.Scanner;
public class Details 
{
 public static void details()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a name ");
	 String name=sc.nextLine();
	 System.out.println("enter your id ");
	 int id = sc.nextInt();
	 System.out.println("enter phoneNumber ");
	 long phone=sc.nextLong();
	 sc.nextLine();
	 System.out.println("enter your email");
	 String email= sc.nextLine();
 }
 public static void main(String[] args) 
 {
	details();
 }
}
