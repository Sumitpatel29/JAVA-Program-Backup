import java.util.Scanner;

public class Sumofarray
{
	public static void printarray(int []a1)
	{
		int sum=0;//declare variable first
		for(int i=0;i<=a1.length-1;i++) //check only for even
			
		{
			if(a1[i]%2 == 0)
			{
				sum=sum+a1[i]; 
			}
		}
		System.out.println("sum of your array is: " +sum);
	}
	public static void main(String[] args) //declaration and creation of array inside main method
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size: ");
		int size=sc.nextInt();
		//create array based on user defined size
		int[]ar1=new int[size];
		System.out.println("enter the arrey elements: ");
		for(int i=0;i<=ar1.length-1;i++)
		{
			ar1[i]=sc.nextInt();
		}
		printarray(ar1);
		sc.close();
}
}
