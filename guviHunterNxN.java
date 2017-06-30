package guvi;

import java.util.Scanner;

public class guviHunterNxN {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=in.nextInt();
			}
		}for(int j=0;j<n;j++){
            for(int i=0;i<1;i++){
				if(a[j][i]==0){
					for(int k=i+1 ;k<n;k++){
						a[j][k]=0;
					}
					
				}
			}
			
		}for(int i=0;i<1;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]==0){
					for(int k=i+1;k<n;k++){
						a[k][j]=0;
					}
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		in.close();


	}

}
