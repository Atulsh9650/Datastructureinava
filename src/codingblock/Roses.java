package codingblock;
import java.util.Scanner;
import java.util.Arrays;
public class Roses {
	public static void main(String args[]) {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
		 for(int i=0;i<t;i++){
			 int n=s.nextInt();
			 int arr[]=new int[n];
			 for(int j=0;j<n;j++){
				 arr[j]=s.nextInt();
			 }
			 int money=s.nextInt();
			 Arrays.sort(arr);

		        int left = 0;
		        int right = arr.length - 1;
                int min1=0;
                int min2=0;
		        while (left < right) {
		            int sum = arr[left] + arr[right];
                  
		            if (sum == money) {
		             min1=arr[left];
		             min2=arr[right];
		             left++;
		             right--;
		             
		            }
		            else if (sum < money) {
		                left++;
		            } else {
		                right--;
		            }
		        }
System.out.println("Deepak should buy roses whose prices are " +min1+" and "+min2+".");    
			 /*
			 for(int k=0;k<n-1;k++){
				 for(int l=k+1;l<n;l++){
					 if(arr[k]+arr[l]==money){
						min=arr[k]-arr[l];
						System.out.println("Deepak should buy roses whose prices are " +arr[k]+" and "+arr[l]+".");
						return;
					 }
				 }
			 }
			 */
		 }
	    }
	}

