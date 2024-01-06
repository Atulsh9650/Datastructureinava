package arrays;
import java.util.Scanner;
public class Arrays1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
      arr[0]=1;
      System.out.println(arr[0]);
      char a[]=new char[10];
      a[0]='a';
      System.out.println(a[0]);
      boolean ar[] = new boolean[5];
      System.out.println(ar[1]);
	}

}
