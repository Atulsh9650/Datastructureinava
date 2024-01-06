package starpattern;
import java.util.Scanner;
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
 */
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
for(int i=1;i<=n;i++) {
	int l=i;
	for(int j=i;j<=n-1;j++){
		System.out.print("  ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(l+" ");
		l++;
	}
	int k=l-2;
	for(int a=2;a<=i;a++)
	{
		
		{System.out.print(k+" ");
		k--;
		
		}
	}
	System.out.println();
}
	}

}
