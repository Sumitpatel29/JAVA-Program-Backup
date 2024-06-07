package lambdaLargestof2Nums;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		//---------using lambda function-----------//
//		Abc n=(a,b)->
//		{
//			if(a>b)
//			{
//				return a;
//			}
//			return b;
//		};
//		System.out.println(n.check(3,6));
		
		//----------------------using inner class--------------//
		Abc n=new Abc()
				{
				@Override
				public int check(int a,int b)
				{
					if(a>b)
					{
						return a;
					}
					return b;
				}
	       };
	       System.out.println(n.check(5, 9));
	}
}
