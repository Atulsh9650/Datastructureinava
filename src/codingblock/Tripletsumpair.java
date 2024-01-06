package codingblock;
import java.util.Scanner;
public class Tripletsumpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		for(int i=0;i<n-1;i++) {
			 for(int j=0;j<n-i-1;j++) {
				 if(arr[j+1]<arr[j]) {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }	 
			 }
		 }
		for(int j=0;j<n-2;j++){
		    for(int k=j+1;k<n-1;k++){
				for(int l=k+1;l<n;l++){
		        if(arr[j]+arr[k]+arr[l]==target) {
		        		System.out.println(arr[j]+", "+arr[k]+" and "+arr[l]);
		        }
					}
		        }
				}
		    }
		}
	


