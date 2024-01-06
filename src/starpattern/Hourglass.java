package starpattern;
import java.util.Scanner;
public class Hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4 
                              3 2 1 0 1 2 3 
                                2 1 0 1 2 
                                  1 0 1 
                                    0 
                                  1 0 1 
                                2 1 0 1 2 
                              3 2 1 0 1 2 3 
                            4 3 2 1 0 1 2 3 4 
                          5 4 3 2 1 0 1 2 3 4 5
 */
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int row1=1;row1<=n;row1++) {
			for(int space1=1;space1<row1;space1++) {
				System.out.print("  ");
			}
			for(int col1=n+1-row1;col1>=1;col1--) {
				System.out.print(col1+" ");
			}
			for(int i=1;i<=1;i++) {
				System.out.print("0 ");
			}
			for(int col2=1;col2<=n+1-row1;col2++) {
				System.out.print(col2+" ");
			}
		  System.out.println();
		}
		for(int i=1;i<=n;i++) {
			System.out.print("  ");
		}
		System.out.print("0 ");
		System.out.println();
		for(int row2=1;row2<=n;row2++) {
			for(int space1=n-row2;space1>=1;space1--) {
				System.out.print("  ");
			}
			
			for(int col2=row2;col2>=1;col2--) {
				System.out.print(col2+" ");
			}
			
			for(int i=1;i<=1;i++) {
				System.out.print("0 ");
			}
			
			for(int col2=1;col2<=row2;col2++) {
				System.out.print(col2+" ");
			}
			
		  System.out.println();
		}
		
	}

}
