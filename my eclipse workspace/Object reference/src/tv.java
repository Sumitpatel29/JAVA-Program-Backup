
public class tv
{
 String name;
 String type;
 int price;
	public static void main(String[] args)
	{
     tv t1=new tv();
     t1.name="Sony";t1.type="lcd";t1.price=45000;
     System.out.println(t1.name +" "+ t1.type + " " + t1.price );
     tv t2=new tv();
     t2.name="MI";t2.type="led";t2.price=28765;
     System.out.println(t2.name +" "+ t2.type + " " + t2.price );
     tv t3=new tv();
     t3.name="Oneplus";t3.type="led";t3.price=25664;
     System.out.println(t3.name +" "+ t3.type + " " + t3.price );
	}

}
