package functions;
import java.util.Scanner;
public class Fib {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
		int a = 0;
        int b = 1;
        if (n==a || n==b) return true;
        int c = a+b;
        while(c<=n)
        {
            if(c == n) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
   
	public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean ans=checkMember(n);
        System.out.println(ans);
    }

}
