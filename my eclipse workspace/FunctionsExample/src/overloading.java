public class overloading 
{
static void add(int a,int b)
{
	int z=a+b;
	System.out.println(z +"<-add method1");
}
static void add(int x,int y,int z)
{
	int sum=x+y+z;
	System.out.println(sum +"<-add method2");
}
public static void main(String[] args) 
{
	add(54,74);
	add(57,49,45);
}
}
