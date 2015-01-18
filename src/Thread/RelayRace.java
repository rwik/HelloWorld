package Thread;

public class RelayRace {

	public static void main(String[] args) {
		Racer1 r1 = new Racer1();
		Racer2 r2 = new Racer2();
		r2.r1 = r1;
		r1.start();
		r2.start();

	}

}
