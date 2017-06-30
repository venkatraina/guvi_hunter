package guvi;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		int n;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int flag=0;
		for(int i=1;i<arr.length;i++){
			if(arr[0]==arr[i]){
				flag++;
			}
		}if(flag!=0){
			System.out.println("The 1st element repeated");
		}else{
			System.out.println("The 1st element not repeated");
		}in.close();

	}

}
