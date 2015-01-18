package Thread;

public class YouTube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayRunnable plr = new PlayRunnable();
		DownloaderRunnable dl =new DownloaderRunnable();
		dl.pl = plr;
		
		Thread t1 = new Thread(plr);
		t1.start();
		Thread t2 = new Thread(dl);
		t2.start();

	}

}
