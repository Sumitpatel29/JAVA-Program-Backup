
public class smallestof4 {

	public static void main(String[] args)
	{
		int n1=45,n2=64,n3=6,n4=45;
		if (n1<n2 && n1<n3 && n1<n4)
		{
			System.out.println(n1 + "is smallest");
		}
		else if (n2<n3 && n2<n4)
		{
			System.out.println(n2 + "is smallest");
		}
		else if (n3<n4)
		{
			System.out.println(n3 + "is smallest");
		}
		else 
		{
			System.out.println(n4 + "is smallest");
		}

	}

}
