package starpattern;
import java.util.Scanner;
public class Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1   
 */
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int row=1;row<=n;row++) {
			for(int col1=1;col1<=row;col1++) {
				System.out.print(col1+" ");
			}
			for(int space=1;space<=2*(n-row)-1;space++) {
				System.out.print("  ");
			}
			if(row==n) {
				for(int col2=row-1;col2>=1;col2--) {
					
					System.out.print(col2+" ");
				}
			}
			else {
			for(int col2=row;col2>=1;col2--) {
				
				System.out.print(col2+" ");
			}
			}
		  System.out.println();
		}
	}

}
