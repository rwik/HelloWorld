package Thread;

public class DownloaderRunnable implements Runnable{

	PlayRunnable pl;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0;i<10;i++)
		{
			System.out.println("Downloading");
		}
		synchronized (pl) {
			pl.notify();
			
		}
		
	}
	

}
