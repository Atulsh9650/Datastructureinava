package arrays;
/*you have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.*/

public class Que2 {

	public static void alternate(int arr[]) {
		int x=arr.length;
		for(int i=0;i<x-1;i++) {
				int temp=arr[i];
			    arr[i]=arr[i+1];
			    arr[i+1]=temp;
			    i++;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,2,3,4,5,6,7};
      alternate(arr);
      for(int i=0;i<7;i++) {
    	  System.out.print(arr[i]+" ");
	}
	}
}
