package arrays;

public class Checkifarraysorted {

	 public static int check(int arr[]) {
		 int count=0;
		 int n=arr.length;
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i-1]>arr[i]) {
				 count++;
			 }
			 
		 }

		 if(arr[n-1]>arr[0]) {
			 count++;
		 }
		 return count;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {3,4,5,1,2};
     int count=check(arr);
     if(count<=1) {
    	 System.out.println("array is sorted and rotated");
     }
     else {
    	 System.out.println("array is not sorted");
     }
     }
	}


