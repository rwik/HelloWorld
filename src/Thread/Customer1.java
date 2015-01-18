package Thread;

public class Customer1 extends Thread{
	BankAccount b1;
	public void run()
	{
		b1.withdraw();
	}
}
