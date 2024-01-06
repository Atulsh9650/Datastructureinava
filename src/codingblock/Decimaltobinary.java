package codingblock;
import java.util.Scanner;
public class Decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
for(int i=1;i<=n1;i++) {
int n2=s.nextInt();
int decimal=0;
int j=1;
while(n2>0) {
	int rem=n2%10;
	decimal=rem*i+decimal;
	i=i*2;
	n2=n2/10;
}
System.out.println(decimal);
	}
	}
}
