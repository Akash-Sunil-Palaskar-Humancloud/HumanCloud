package practice;

import java.util.Scanner;

public class ConvertStringToInteger {
	


		static int  convert(String str) {
			Scanner scan = new Scanner(str);
			int i= scan.nextInt();
			System.out.println("print integer "+i);
			return 0;
		}
	
	
	public static void main(String[] args) {
		String str="123456";
		System.out.println("print String "+str);
		convert(str);
	}

}
