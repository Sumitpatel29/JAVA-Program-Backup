
public class Percentage
{
 static void percentage(int p,int c, int m, int o)
 {
	 int total=p+c+m+o;
	 float perc=(total/400.0f)*100;
	 System.out.println(perc);
 }
 public static void main(String[] args)
 {
	percentage(45,58,64,84);
}
}
