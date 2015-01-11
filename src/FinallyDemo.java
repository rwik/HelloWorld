
public class FinallyDemo {

	public static void main(String[] args) {

		try{
			System.out.println(args[0]);
			
			System.out.println("wont get executed in case of exception");

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();

		}
		finally
		{
			System.out.println("will get executed in all case ");

			
		}
	}

}
