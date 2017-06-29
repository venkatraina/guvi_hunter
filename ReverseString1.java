package guvi;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String s;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		String[] reverseString=s.split(" ");
		for(int i=reverseString.length-1;i>=0;i--){
			System.out.println(reverseString[i]);
		}in.close();

	}

}
