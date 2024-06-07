package icecream;

public class Iceceam {

	public static void main(String[] args) 
	{
		int balance=75000;int amount=75000;int bankcode=2;
		int availableamt=balance-amount;int needamt=0;
		System.out.println("your available balance is " +balance);
		System.out.println("amount you want to withdrawl is " +amount);
		if(balance>=amount)
		{
		if(bankcode==1)
		{
				balance=balance-amount;
				System.out.println("your remaining balance is " +balance);
		}
		if(bankcode==2)
		{
			if(availableamt>10000)
			{
				balance=balance-amount;
				System.out.println("your remaining balance is " +balance);
			}
			else
			{
			    needamt=10000-availableamt;
                System.out.println("low minimum balance.please deposit " +needamt +" to proceed");
			}
		}
		
		if(bankcode==4 || bankcode==3)
		{
			if(availableamt>5000)
			{
				balance=balance-amount;
				System.out.println("your remaining blance" +balance);
			}
			else
			{
				needamt=5000-availableamt;
                System.out.println("low minimum balance.please deposit " +needamt +" to proceed");
			}
		}
	}
		else
		{
			System.out.println("insufficient balance");
		}
	}

}
