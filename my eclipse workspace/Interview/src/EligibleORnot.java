
public class EligibleORnot {

	public static void main(String[] args)
	{
		int perc=70;
		int yop=2023;
		int qua=1;
		int str=6;
		if((perc>=55) && (yop>=2022 && yop<=2024) && (qua==1 || qua==3) && (str==1 ||str==6 || str==2))
		{
			System.out.println(" you are eligible");
			                                                                                                                                                             
				}
				else
				{
					System.out.println("you are not eligible");
					if(perc<55)
					{
						System.out.println("percentage not matching");
					}
					if(yop<2022||yop>2024)
					{
						System.out.println("yop is not matching");
					}
					if(qua!=1 && qua!=3)
					{
						System.out.println("qualification not matching");
					}
					if(str!=1 && str!=2 && str!=6)
					{
						System.out.println("stream not matching");
					}
				}
			  
}
}
