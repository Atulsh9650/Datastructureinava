package sortingarray;

public class Insertionsort {

	public static void insertion(int arr[]) {
		 int n=arr.length;
		 for(int i=0;i<n-1;i++) {
			 for(int j=i+1;j>0;j--) {
				 if(arr[j]<arr[j-1]) {
					 int temp=arr[j];
					 arr[j]=arr[j-1];
					 arr[j-1]=temp;
				 }
				 else {
					 break;
				 }
			 }
		 }
			 
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arr[]= {2,1,5,3,4,1,2};
	insertion(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ " ");
	}
		}


}
