package Thread;

public class PlayRunnable implements Runnable {
	public void run()
	{
		try{
			synchronized (this) {
				wait();

			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Playing");
		}
	}

}
