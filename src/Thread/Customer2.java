package Thread;

public class Customer2 extends Thread{
	BankAccount b2;
	public void run()
	{
		b2.withdraw();
	}
}
