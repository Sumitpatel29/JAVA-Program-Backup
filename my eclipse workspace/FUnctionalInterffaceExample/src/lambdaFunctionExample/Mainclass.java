package lambdaFunctionExample;

public class Mainclass
{
	public static void main(String[] args)
	{
		//------using inner class---------//
//		Abc a=new Abc()
//		{
//			@Override
//			public boolean check(int n) 
//			{
//				if(n%2==0)
//				{
//					return true;
//				}
//				return false;
//			}
//		};
		
		//------------using lambda function-------------//
		Abc a=(n)-> 
		{
			return n%2==0;
		};
		System.out.println(a.check(20));
	}
}
