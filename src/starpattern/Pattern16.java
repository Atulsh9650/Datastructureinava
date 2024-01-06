package starpattern;
import java.util.Scanner;
public class Pattern16 {

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
		for(int i=1;i<=n;i++) {
			int k=1;
			int b=i;
			if(i>=1 && i<=n-1) {
				 b=i;
			}
			else {
				b=n-1;
			}
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			for(int l=i;l<=n-1;l++) {
				System.out.print("  ");
			}
			for(int l=i+1;l<=n-1;l++) {
				System.out.print("  ");
			}
			for(int a=1;a<=i;a++) {
				
				System.out.print(b+" ");
				b--;
			}
			System.out.println();
		}
		
	}

}
