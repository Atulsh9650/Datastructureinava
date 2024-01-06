package starpattern;
import java.util.Scanner;
public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
                         1
                       2 3 2
                     3 4 5 4 3
                       2 3 2
                         1 
 */
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 for (int i = 1; i <= n; i++) {
	            // print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // print numbers
	            for (int j = i; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            for (int j = 2 * i - 2; j >= i; j--) {
	                System.out.print(j);
	            }
	            // move to next line
	            System.out.println();
	        }

	        // print lower half of the pattern
	        for (int i = n - 1; i >= 1; i--) {
	            // print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // print numbers
	            for (int j = i; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            for (int j = 2 * i - 2; j >= i; j--) {
	                System.out.print(j);
	            }
	            // move to next line
	            System.out.println();
	        }
		
	}

}
