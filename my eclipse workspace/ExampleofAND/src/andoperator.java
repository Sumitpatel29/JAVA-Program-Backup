
public class andoperator {

	public static void main(String[] args) 
	{
		int p1=549;
		int p2=699;
		int p3=959;
		int p4=99;
		int total=p1+p2+p3+p4;
		float discount=0;
		float bill=0;
		if(total<1500)
		{
			System.out.println("no discount");
			System.out.println("to get 15% discount purchase more:" + (1500-total));
			System.out.println("to get 18% discount purchase more:" + (2000-total));
			System.out.println("to get 25% discount purchase more:" + (3000-total));
			System.out.println("to get 30% discount purchase more:" + (4000-total));
		}
		if(total>1500 && total<=2000)
		{
			discount=total*0.15f;
			System.out.println("got discount " + discount);
			System.out.println("to get 18% discount purchase more:" +(2000-total));
			System.out.println("to get 25% discount purchase more:" +(3000-total));
			System.out.println("to get 30% discount purchase more:" +(4000-total));
		}
		if(total>2000 && total<=3000)
		{
			discount=total*0.18f;
			System.out.println("got discount " + discount);
			System.out.println("to get 25% discount purchase more:" +(3000-total));
			System.out.println("to get 30% discount purchase more:" +(4000-total));
        }
		if(total>3000 && total<=5000)
		{
			discount=total*0.25f;
			System.out.println("got discount " + discount);
			System.out.println("to get 30% discount purchase more:" +(4000-total));
        }
		if(total>5000)
		{
			discount=total*0.30f;
			System.out.println("got discount " + discount);
        }
		bill=total-discount;
		System.out.println("your bill is " + bill);
}}