public class laptop
{ 
	 String brand;
	 String name;
	 String processor;
	 int price;
		public static void main(String[] args)
		{
	     laptop l1=new laptop();
	    l1.brand="Dell"; l1.name="Inspiron";l1.processor="i3";l1.price=78665;
	     System.out.println(l1.brand +" "+l1.name +" "+ l1.processor + " " + l1.price );
	     laptop l2=new laptop();
	     l2.brand="HP";l2.name="Pavilion";l2.processor="i7";l2.price=62990;
	     System.out.println(l2.brand +" " +l2.name +" "+ l2.processor + " " + l2.price );
	     laptop l3=new laptop();
	     l3.brand="apple";l3.name="mac-boook";l3.processor="i7";l3.price=110000;
	     System.out.println(l3.brand +" " +l3.name +" "+ l3.processor + " " + l3.price );
		}

}
