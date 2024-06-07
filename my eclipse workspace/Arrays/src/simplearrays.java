
public class simplearrays {

	public static void main(String[] args)
	{
		//1. Declaration and instantiation
        int x[]=new int[4];
        //2. Initialiization
        x[0]=100;
        x[1]=755;
        x[2]=300;
        x[3]=400;
       // x[4]=4500; -> Runtime error , ArrayIndexOutofBoundsException
        //3. accessing the data from array
        int a=x[2];
        System.out.println(a);
        System.out.println(x[3]);  //also we can print like this
     //   System.out.println(x[6]);   -> Runtime Error
	}

}
