package guvi;

import java.util.Scanner;

public class AppearsOnlyOnes {

	public static void main(String[] args) {
		int n;
		int min=0;
		int once=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[] ar=new int[n];
		int[] c=new int[n];
		for(int i=0;i<ar.length;i++){
			ar[i]=in.nextInt();
		}for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar.length;j++){
				if(ar[i]==ar[j]){
					c[i]++;
				}
			}
			
		}min=c[0];
		for(int i=1;i<c.length;i++){
			if(min>c[i]){
				min=c[i];
				once=i;
			}
			
		}System.out.println(ar[once]+" is appears once in the array");
         in.close();


	}

}
