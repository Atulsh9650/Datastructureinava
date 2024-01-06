package starpattern;
import java.util.Scanner;
public class Firstpattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		    * 
		  * 1 * 
		* 1 * 1 * 
	   * 1 * 1 * 1 * 
	  * 1 * 1 * 1 * 1 * 
		 */
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int nsp=n-1;
int nst=1;
int row=1;
while(row<=n) {
	for(int csp=1;csp<=nsp;csp++) {
		System.out.print(" ");
	}
	for(int cst=1;cst<=nst;cst++) {
		if(cst%2==0) {
			System.out.print("1");
		}
		else {
			System.out.print("*");
		}
	}
	System.out.println();
	nst=nst+2;
	nsp--;
	row++;
	
}
	}

}
