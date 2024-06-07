public class Customer 
{
 String name;
 int pin;
 int balance;
 long phno;
 int bankCode;
 Customer(String n,long p,int b ,int p1)
 {
	 this.name=n;
	 this.phno=p;
	 this.bankCode=b; this.setpin(p1);
 }
 void setpin(int p1)
 {
	 this.pin=p1;
 }
 void updatephno(int p,long np)
 {
	 if(this.pin==p)
	 {
		 this.phno=np;
		 System.out.println("phno updated");
	 }
	 else
	 {
		 System.out.println("wrong pin");
	 }
 }
 void deposit(int p,int amt)
 {
	 if(this.pin==p)
	 {
		 this.balance=this.balance+amt;
	 }
	 else
	 {
		 System.out.println("wrong pin");
	 }
 }
 void withdrawl(int p, int amt)
 {
	 if(this.pin==p)
	 {
		 if(amt<=this.balance)
		 {
			 this.balance=this.balance-amt;
		 }
		 else
		 {
			 System.out.println("insufficient balance");
		 }
	 }
	 else 
	 {
		System.out.println("incorrect pin"); 
	 }	 
 }
 void checkbalance(int p)
 {
	 if(this.pin==p)
	 {
		 System.out.println(this.balance);
	 }
	 else
	 {
		 System.out.println("incorrect pin");
     }
 }
 void updatepin(int p,int np)
 {
	 if(this.pin==p)
	 {
		 this.pin=np;
	 }
	 else
	 {
		 System.out.println("wrong pin");
	 }
 }
 public static void main(String[] args) 
{
 Customer c1 = new Customer("Sumit",9876543210L,1,1234);
 c1.setpin(1234);
 
}
}
