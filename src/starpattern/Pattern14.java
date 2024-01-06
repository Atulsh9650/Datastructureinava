package starpattern;
import java.util.Scanner;
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	 * * * * *
     * *   * *
     *       *
     * *   * *
     * * * * *
		 */
		Scanner scn=new Scanner(System.in);

	    int n=scn.nextInt();
	  

	    int  nst=n/2;     //initialize number of stars

	    int nsp=0;       //initialize number of spaces 
	    int nsta=n/2;   //initialize number of stars after spaces

	     //Outer loop to handle number of rows
	    for(int i=1;i<=n;i++)
	    {
	        //work for stars
	        for(int cst=0;cst<=nst;cst++)
	        {
	            System.out.print("* ");
	        }

	        //work for spaces


	        for(int csp=1;csp<nsp;csp++)
	        {
	            System.out.print(" ");

	        }

	        //work for stars

	        for(int cst=1;cst<=nsta;cst++)
	        {
	            System.out.print("* ");
	        }

	        //preparation for next iteration
	        if(i>1 && i<=n/2)
	            nsta=nsta-1;
	        if(i>n/2 &&i<n-1)
	            nsta=nsta+1;



	        if(i<=n/2)
	        {
	            nst=nst-1;
	            nsp=nsp+2;
	        }
	        else
	        {
	            nst=nst+1;
	            nsp=nsp-2;
	        }

	        System.out.println();
	    }
	}

}
