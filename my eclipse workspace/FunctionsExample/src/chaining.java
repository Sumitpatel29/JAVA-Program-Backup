public class chaining 
{
static int total(int p,int c,int m,int o)
{
	return p+c+m+o;
}
static void percentage(int phy,int che,int mth,int opt)
{
	int x=total(phy,che,mth,opt);
	float perc=x/(400.0f)*100;
	System.out.println(perc);
}
public static void main(String[] args)
{
percentage(45,64,85,46);	
}
}
