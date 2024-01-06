package sortingarray;

public class Bubblesort {
	 public static void bubble(int arr[]) {
		 int n=arr.length;
		 for(int i=0;i< n-1;i++) {
			 for(int j=0;j<n-i-1;j++) {
				 if(arr[j+1]<arr[j]) {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }	 
			 }
		 }
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arr[]= {9,8,7,6,1};
	bubble(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
		}

	}
