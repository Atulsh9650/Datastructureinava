package starpattern;
import java.util.Scanner;
public class Seventhpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * * * * *
*        *
*        *
*        *
* * * * *
 */
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int nst=n;
		while(row<=n) {
			
				for(int cst=1;cst<=nst;cst++) {
					if(row==1 || row==n) {
				System.out.print(" *");
				}
					else {
						if(cst==1 || cst==n) {
							System.out.print(" *");
						}
						else {
							System.out.print(" ");
						}
					}
				}

			System.out.println();
			row++;
			
		}
	}

}
