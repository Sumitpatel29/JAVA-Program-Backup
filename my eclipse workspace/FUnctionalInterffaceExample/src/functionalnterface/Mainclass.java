package functionalnterface;

public class Mainclass {

	public static void main(String[] args) 
	{
//		Abc a1=new Subclass1();
//		a1.print(5);
//		Abc a2=new Subclass2();
//		a2.print(5);
		
		Abc a1=new Abc()
				{
					@Override
					public void print(int n) 
					{
						System.out.println("Print method implementation1");	
					}
				};
				a1.print(6);
	}

}
