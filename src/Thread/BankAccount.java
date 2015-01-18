package Thread;

public class BankAccount {

	double balance = 5000;
	synchronized void withdraw()
	{
		if(balance >= 5000)
		{
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance = balance -5000;
		}
		System.out.println(balance);
	}
	public static void main(String[] args) {
		BankAccount b= new BankAccount();
		Customer1 c1 = new Customer1();
		c1.b1 = b;
		Customer2 c2 = new Customer2();
		c2.b2 = b;
		
		c1.start();
		c2.start();
		
		// TODO Auto-generated method stub
		

	}

}
