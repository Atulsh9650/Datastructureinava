package codingblock;

public class fibpattern {
	public static int fib(int n) {
		if(n==0||n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n=10;
            int k=0;
            for(int i=0;i<n;i++) {
            System.out.print(fib(i)+" ");
            }
            System.out.println();
            for(int i=1;i<=4;i++) {
            	for(int j=1;j<=i;j++) {
            		System.out.print(fib(k)+" ");
            		k++;
            	}
            	System.out.println();
            }
	}
}
