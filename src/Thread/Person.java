package Thread;

public class Person {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new EatThread());
		Thread t2 = new Thread(new ThinkThread());
		t1.start();
		t2.start();
		Thread t3 = new Thread(new HearingThread());
		t3.start();

		System.out.println("Main die");
		

		

	}

}
