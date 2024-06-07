package food1;

public class taste {

	public static void main(String[] args) 
	{
		int p1=549;
		int p2=699;
		int p3=99;
		int p4=79;
		int total=p1+p2+p3+p4;
		float disc=0;int bill=0;
		if(total<1500)
		{
			System.out.println("no discount");
			1500-total;
			System.out.println("purchase more " + "to get 10% discount" );
		}
		if(total>1500 && total<=2000)
		{
			disc=total*0.15f;
			System.out.println("10% discount");
		}


	}

}
