package Thread;

public class ThinkThread implements  Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			for(int i=0;i<10;i++)
			{
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println("thinking");
			}
			
		
		
	}
	

}
