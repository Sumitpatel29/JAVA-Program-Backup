
public class perc 
{
	public static void main (String[] args)
	{
		String car="verna";
		float price=1545000;
		int cc=1500;
		float tax=0;
		int insurance=0;
		if(price>=500000 && price<=1000000)
		{
			tax=price*0.15f;
			price=price+tax;
			System.out.println("tax is " +tax );
			System.out.println("");
		}
		if(price>1000000 && price<=1500000)
		{
			tax=price*0.22f;
			price=price+tax;
			System.out.println("tax is " +tax );
			System.out.println("");
		}
		if(price>1500000 && price<=2500000)
		{
			tax=price*0.28f;
			System.out.println("tax is " +tax );
		}
		if(price>2500000)
		{
			tax=price*0.32f;
			System.out.println("tax is " +tax );
		}
		if (cc>=800 && cc<=1000)
		{
			insurance=3250*5;
			System.out.println("insurance is " +insurance);
		}
		if (cc>1000 && cc<=1500)
		{
			insurance=4580*5;
			System.out.println("insurance is " +insurance);
		}
		if (cc>1500 && cc<=2600)
		{
			insurance=5700*5;
			System.out.println("insurance is " +insurance);
		}
		if (cc>2600)
		{
			insurance=6500*5;
			System.out.println("insurance is " +insurance);
			
		}
		float total=price+tax+insurance;
		System.out.println("total price is " +total);
	}
	

}


