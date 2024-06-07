
public class functionreturningexprsn 
{
 static String fname(String fn) 
 {
	 return "$"+fn;
 }
 static String lname(String ln)
 {
	 return ln+"$";
 }
 static void Fullname(String f,String l)
 {
	 String Fullname=f+" "+l;
	 System.out.println(Fullname);
 }
 public static void main(String[] args) 
 {
	 String x = fname("Rahul");
	 String y = lname("Dravid");
	 Fullname(x,y);
}
}
