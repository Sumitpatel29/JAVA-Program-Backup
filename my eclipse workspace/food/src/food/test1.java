package food;

public class test1 
{
   public static void main (String[] args)
   {
		 String flavour=null;	
		 int fcode=1;
		 int price=0;
		 boolean toppings=true,dryfruits=true;
		
		 if (fcode==1)
		 {
			 price=100; flavour="vanilla";
		 }
		 if (fcode==2)
		 {
			 price=120;flavour="kiwi";
		 }
		 if (fcode==3)
		 {
			 price=135;flavour="butterscotch";
		 }
		 if (toppings==true)
		 {
			 price=price+10;
		 }
		 if (dryfruits==true)
		 {
			 price=price+15;
		 }
		 float gst=price*0.18f;
		 float total=price+gst;
		 System.out.println(total);
		 
	  
   }
}
