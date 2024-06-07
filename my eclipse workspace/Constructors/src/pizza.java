public class pizza 
{
 String type = "regular";
 int price=150;
 String toping1;
 String toping2;
 boolean cheese;
 pizza(String t1,String t2,boolean c)
 {
	 this.toping1=t1;
	 this.toping2=t2;
	 this.cheese=c;
	 this.price=this.price+70;
	 if(c==true)
	 {
		 this.price=this.price+80;
	 }
 }
 pizza(String t1,boolean c)
 {
	 this.toping1=t1;
	 this.cheese=c;
	 this.price=this.price+40;
	 if(c==true)
	 {
		 this.price=this.price+80;
	 }
 }
 pizza(boolean c)
 {
	 if(c==true)
	 {
		 this.price=this.price+80;
	 }
 }
 void bill()
 {
	 System.out.println("Type=" + this.type);
	 System.out.println("toping 1 = " + this.toping1);
	 System.out.println("toping 2 = " + this.toping2);
	 System.out.println("cheese=" + this.cheese);
	 float gst=this.price*0.18f;
	 System.out.println("GST= " + gst);
	 float total=this.price+gst;
	 System.out.println("total is: " + total);
	 
 }
 public static void main(String[] args)
{
 pizza p1=new pizza("paneer","pasta",true);	
 p1.bill();
}
}
