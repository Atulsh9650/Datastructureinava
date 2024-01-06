package arrays;

public class Pushzeroes {

	public static void push(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			 int temp=arr[i];
			 int j=i-1;
			 while(j>=0 && arr[j]==0) {
				 arr[j+1]=arr[j];
				 j--;
			 }
					 arr[j+1]=temp;
		 }
	}
	public static void push2(int arr[]) {
		int count=0;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
			else if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<count;i++) {
			arr[j]=0;
			j++;
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,2,0,4,0,0,5,0,6,7,0};
	push2(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}

	}

}
