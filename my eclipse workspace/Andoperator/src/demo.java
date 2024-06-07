
public class demo 
{

	public static void main(String[] args)
	{
		int opin=1122 , upin=1234;
		int balance=75000 , amount=14500;
		int bankcode=2;
		if(upin>=1000 && upin<=9999)
		{
			System.out.println("4 digit pin");
	    	 if(opin==upin) 
			{
			System.out.println("correct pin entered");
			
			if(balance>=amount)
			{
				balance=balance-amount;
				if((bankcode==2 || bankcode==3) && (balance>10000))
				{
						System.out.println("low minimum balance");
						System.out.println(10000-balance +"must be deposited");
					}
				else
				{
					System.out.println(balance);
				}
				}
			}
			else
			{
				System.out.println("insufficient balance");
			}
		}
		else 
		{
			System.out.println("invalid pin");
		}
		else
		{
			System.out.println("enter 4 digit pin");
			
		}
		
	}

	
}
