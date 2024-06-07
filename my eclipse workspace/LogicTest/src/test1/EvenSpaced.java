package test1;
public class EvenSpaced 
{
public static boolean evenlySpaced(int a,int b,int c)
{
	if((b-a) == (c-b) || (a-b)==(c-b) || (b-a)==(b-c))
	{
	return true;
	}
	else
	{
		return false;
	}
}
public static void main(String[] args) 
{
 System.out.println(evenlySpaced(1,3,5));	
}
}
