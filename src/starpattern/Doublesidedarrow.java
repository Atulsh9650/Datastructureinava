package starpattern;
import java.util.Scanner;
public class Doublesidedarrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		                    1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 
		 */
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int rows=n;
int nst=1;
int nst1=1;
int nsp=n-1;
int nsp1=0;
for(int row=1;row<=rows;row++) {
	if(row<=n/2+1) {
		for(int csp=1;csp<=nsp;csp++) {
			System.out.print("  ");
		}
	    for(int cst=nst;cst>=1;cst--) {
	    	System.out.print(cst+" ");
	    }
	    for(int csp1=1;csp1<nsp1;csp1++) {
	    	System.out.print("  ");
	    }
	    for(int cst=1;cst<nst1;cst++) {
	    	System.out.print(cst+" ");
	    }
	    nsp--;
	    nst++;
	    nsp1++;
	    nst1++;
	}
	 
	 System.out.println();
}
	}

}
