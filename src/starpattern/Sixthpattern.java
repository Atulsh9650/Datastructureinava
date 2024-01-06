package starpattern;

import java.util.Scanner;
public class Sixthpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nst=1;
		int nsp=n-1;
		int row=1;
		while(row<=n) {
			
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			System.out.println();
			row++;
			nst++;
			nsp--;
		}


	}

}
