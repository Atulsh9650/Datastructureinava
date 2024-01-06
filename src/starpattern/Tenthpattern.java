package starpattern;
import java.util.Scanner;
public class Tenthpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
    *****
   *   *
  *   *
 *   *
*****
 */
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nst=n;
		int nsp=n-1;
		int row=1;
		while(row<=n) {
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) {
			if(row==1 ||row==n ||cst==1 ||cst==n) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			System.out.println();
			nsp--;
			row++;
	}

}
}
