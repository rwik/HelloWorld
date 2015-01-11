
import java.io.FileNotFoundException;
import java.io.FileReader;
public class checkedExcp {

	public static void main(String[] args) {
		try{
		FileReader fr = new FileReader("abc.txt");
		//compiler wont allow compilation if you don't write try catch
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
