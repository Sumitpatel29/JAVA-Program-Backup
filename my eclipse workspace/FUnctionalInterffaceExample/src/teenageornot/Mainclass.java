package teenageornot;

public class Mainclass {

	public static void main(String[] args)
	{
//		Teenage t=new Teenage()
//				{	
//			@Override
//			public boolean checkteenage(int n)
//			{
//				if(n<18)
//				{
//					return true;
//				}
//				return false;
//			}
//		};
//		System.out.println(t.checkteenage(16));
		
		//-------using lambda function---------//
		Teenage t=(n)->
		{
			if(n<18)
				{
					return true;
				}
				return false;
		};
		System.out.println(t.checkteenage(5));		
	}

}
