package arrays;
import java.util.Scanner;
public class Findinglargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,2,3,4,5};
      int n=arr.length;
      for(int i=0;i<n/2;i++){
          arr[i]=i;
          arr[n-i]=i+1;
      }
      int size=arr.length;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<size;i++) {
    	 if(arr[i]>max) {
    		 max=arr[i];
    	  }
      }
      System.out.println(max);
	}

}
