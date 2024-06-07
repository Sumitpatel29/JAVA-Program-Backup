 class demo {

	public static void main(String[] args) 
	{
		int perc=70;
		int yop=2023;
		if((perc>=65) && (yop==2023 || yop==2024))
		{
		 System.out.println("you are eligible");	
		}
		else
		{
			System.out.println("you are not eligible");
		}
		if(perc<65)
		{
			System.out.println("percentage not matching");
		}
		if(yop!=2023&&yop!=2024)
		{
			System.out.println("yop not matching");
		}

		
	}

}
