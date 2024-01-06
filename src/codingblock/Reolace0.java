package codingblock;
import java.util.Scanner;
public class Reolace0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
long n=s.nextLong();

long ans=0;
long rem=0;
long mul=1;
if(n==0) {
	ans=5;
	System.out.println(ans);
	return;
}
while(n>0) {
	rem=n%10;
	if(rem==0) {
		rem=5;
	}
	else {
		
	}
	ans+=rem*mul;
	mul*=10;
	n=n/10;
}

System.out.println(ans);
	}

}
