package starpattern;
import java.util.Scanner;
public class Twelthpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1
2 2
3 0 3
4 0 0 4
5 0 0 0 5
		 */
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print(i+" ");
				}
				else {
					System.out.print("0 ");
				}
				
			}
			System.out.println();
		}

	}

}
