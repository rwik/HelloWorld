package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class iodemo {

	public static void main(String[] args) {
		// OLD STYLE
//		String name = "";
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("type name");
//		try {
//			 name = br.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(name);
		// New Style
		Scanner sc= new Scanner(System.in);
		System.out.println("Num1");
		int i1= sc.nextInt();
		System.out.println(i1);
		sc.close();

		
		

	}

}
