package starpattern;
import java.util.Scanner;
public class Fourthpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nst=1;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int row=1;
while(row<=n) {
	for(int cst=1;cst<=nst;cst++) {
		System.out.print("* ");
	}
	System.out.println();
	row++;
	nst++;
}

	}

}
