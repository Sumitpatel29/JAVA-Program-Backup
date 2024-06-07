package functionalnterface;

public class Subclass2 implements Abc
{
	@Override
	public void print(int n)
	{
		for (int i = n; i>=1; i--)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
	}
}
