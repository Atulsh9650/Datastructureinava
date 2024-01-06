package starpattern;
import java.util.Scanner;
public class Eleventhpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1 2 3 4 5
1 2 3 4 * 
1 2 3 * * *
1 2 * * * * *
1 * * * * * * *
		 */
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nst=0;
		int nc=n;
		int row=1;
		while(row<=n) {
			for(int cc=1;cc<=nc;cc++) {
				System.out.print(cc+" ");
			}
			for(int cst=1;cst<nst;cst++) {
				System.out.print("* ");
			}
			System.out.println();
			nst=nst+2;
			nc--;
			row++;
		}
	}

}
