package starpattern;

import java.util.Scanner;
public class Secondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *
		 * * * * 
		 * * *
		 * *
		 * 
		 */
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nst=1;
		int row=1;
		while(row< 2*n) {
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("* ");
			}
			System.out.println();
			if(row<n) {
		        nst++;
		        row++;
				}
			else if(row>=n) {
				nst--;
				row++;
			}
			
			
		}

	}

	}
