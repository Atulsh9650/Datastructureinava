package codingblock;
import java.util.Scanner;
public class Inverseofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int j=0;j<n;j++){
			int v=arr[j];
			arr[v]=j;
		}
}
}