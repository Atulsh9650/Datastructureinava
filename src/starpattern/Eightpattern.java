package starpattern;
import java.util.Scanner;
public class Eightpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int nst=n;
int nsp=1;
int row=1;
while(row<=n) {
	if(row==1 || row==n) {
		for(int cst=1;cst<=nst;cst++) {
		System.out.print("* ");
		}
	}
}
	}

}
