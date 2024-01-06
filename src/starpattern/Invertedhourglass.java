package starpattern;
import java.util.Scanner;
public class Invertedhourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 
 */
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int spacescnt=1;
	int spacescnt2=1;
	
	for(int row1=1;row1<=n;row1++) {
		int count=n;
		
		for(int col1=1;col1<=row1;col1++) {
		     System.out.print(count+" ");
		     count--;
		}
		for(int spaces=1;spaces<=2*n-spacescnt;spaces++) {
			System.out.print("  ");
		}
		spacescnt+=2;
		count++;
		for(int col2=1;col2<=row1;col2++) {
			
			System.out.print(count+" ");
			count++;
		}
		System.out.println();
	}
	int count2=n;
	int count3=1;
	for(int i=1;i<=2*n+1;i++) {
		
		if(i<=n+1) {
			System.out.print(count2+" ");
			count2--;
		}
		else {
			System.out.print(count3+" ");
			count3++;
		}
	}
	System.out.println();
	for(int row1=1;row1<=n;row1++) {
		int cnt3=row1;
		
		for(int col1=n;col1>=row1;col1--) {
		     System.out.print(col1+" ");
		   
		}
		for(int spaces=1;spaces<=spacescnt2;spaces++) {
			System.out.print("  ");
		}
		spacescnt2+=2;
		
		for(int col2=n;col2>=row1;col2--) {
			
			System.out.print(cnt3+" ");
			cnt3++;
		}
		System.out.println();
	}
	}

}
