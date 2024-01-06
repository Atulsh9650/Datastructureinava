package arrays;

public class Sort0123 {

	public static void rotate (int arr[]) {
		int count0=0;
		int count1=0;
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count0++;
			}
			else if (arr[i]==1) {
				count1++;
			}
		}
		int i=0;
		while(i<count0) {
			arr[i]=0;
			i++;
		}
		int k=count0+count1;
		while(i<k) {
			arr[i]=1;
			i++;
		}
		while(i<n) {
			arr[i]=2;
			i++;
		}
	    
	}  
	public static void main(String args[]) {
		int arr[]= {2,1,2,0,1,0,2,1};
		rotate(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
}
}
