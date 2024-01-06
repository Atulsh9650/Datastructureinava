package arrays;
import java.util.Scanner;
public class Swapalternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       
       int ans=0;
		int arr[]= {1,2,1,2,3};
		int size=arr.length;
		for(int i=0;i<size;i++) {
		ans=ans^arr[i];
		}
		System.out.println(ans);
	}

}
