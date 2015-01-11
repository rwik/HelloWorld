
public class errorCatch {
	public static void main(String args[])
	{
		
		//System.out.println();
		try{
		x();
		}
		catch(Error e) // instead of exception we are catching error here.
		{
			
		}
		System.out.println("last line");
	}
	static void x() // produces stackoverflow error
	{
		x();
	}

}
