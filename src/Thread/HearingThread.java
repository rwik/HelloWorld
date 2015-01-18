package Thread;

public class HearingThread extends Thread {
	public void run(){
		for(int i=0;i<10;i++)
		{
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Hearing");
		}
		
		
	}

}
