package functions;

import java.util.Scanner;
public class Ncr {

	public static int factorial(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans=ans*i;
		}
		return ans;
	}
	
	public static boolean isprime(int n) {
		int d=2;
		while(d<n) {
			if(n%d==0) {
				return false;
			}
			d++;
		}
		return true;
	}
	public static void display(int n) {
		if(n<=0) {
			return;
		}
		for(int i=1;i<=n;i++) {
			System.out.print(i);
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int r=s.nextInt();
    display(n);
	boolean ansprime=isprime(13);
	System.out.println(ansprime);
	
	int num=factorial(n);
	int num1=factorial(r);
	int num2=factorial(n-r);
	
	
	int answ=num/(num1*num2);
    System.out.println(answ);	
    
   
	}

}