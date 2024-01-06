package starpattern;

import java.util.Scanner;

public class Fifthpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nst=n;
		
		int row=1;
		while(row<=n) {
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("* ");
			}
			System.out.println();
			row++;
			nst--;
		}
	}

}
