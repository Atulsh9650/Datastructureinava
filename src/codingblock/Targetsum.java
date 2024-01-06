package codingblock;
import java.util.*;

public class Targetsum {
	

	    public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=s.nextInt();
	}
	int target=s.nextInt();
	for(int j=0;j<n-1;j++){
	    for(int k=j+1;k<n;k++){
	        if(arr[j]+arr[k]==target){
	        	if(arr[j]>arr[k]) {
	        		System.out.println(arr[k]+" and "+arr[j]);
	        	}
	        	else {
	            System.out.println(arr[j]+" and "+arr[k]);
	        	}
	        }
	    }
	}
	    }
}