package functionalnterface;
public class Subclass1 implements Abc
{
	@Override
	public void print(int n) 
	{
		for (int i = 1; i <=n; i++) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}	
}
