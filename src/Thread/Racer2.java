package Thread;

public class Racer2 extends Thread {
	Racer1 r1;
	public void run()
	{
		try {
			r1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Racer 2 running");
		}
	}
	

}
