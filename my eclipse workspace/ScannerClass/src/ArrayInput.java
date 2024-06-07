import java.util.Scanner;

public class ArrayInput
{
	public static void printarray(int []a1)
	{
		for(int i=0;i<=a1.length-1;i++) //check only for even
		{
			System.out.println(a1[i]+" ");
		}
		System.out.println();
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
