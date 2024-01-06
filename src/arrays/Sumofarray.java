package arrays;
import java.util.Scanner;
public class Sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int t=s.nextInt();
     
     for(int i=1;i<=t;i++) {
    	 int sum=0;
    	 int size=s.nextInt();
    	 int arr[]=new int[size];
    	 for(int j=0;j<size;j++) {
    		 arr[j]=s.nextInt();
    		 sum=sum+arr[j];
    	 }
    	 System.out.println(sum);
     }
	}

}
