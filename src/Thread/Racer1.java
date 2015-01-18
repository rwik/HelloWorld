package Thread;

public class Racer1 extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Racer 1 running");
		}
	}

}
