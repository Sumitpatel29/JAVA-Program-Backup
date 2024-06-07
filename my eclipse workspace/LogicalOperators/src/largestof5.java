
public class largestof5 {

	public static void main(String[] args) 
	{
		int n1=25,n2=98,n3=45,n4=75,n5=65;
		if (n1>n2 && n1<n3 && n1>n4 && n1>n5)
		{
			System.out.println(n1 + "is largest");
		}
		else if (n2>n3 && n2>n4 && n2>n5)
		{
			System.out.println(n2 + "is largest");
		}
		else if (n3>n4 && n3>n5)
		{
			System.out.println(n3 + "is largest");
		}
		else if (n4>n5)
		{
			System.out.println(n4 + "is largest");
		}
		else
		{
			System.out.println(n5 + "is largest");
		}
			
		

	}

}
