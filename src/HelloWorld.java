import java.util.ArrayList;
import java.sql.*;


public class HelloWorld {

	public static void main(String[] args) {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
