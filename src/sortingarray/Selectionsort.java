package sortingarray;

public class Selectionsort {
	
	public static void selection(int arr[]) {
		int n=arr.length;
		int count=0;
		for(int i=0;i<n-1;i++) {
			int min=arr[i];
			int minindex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minindex=j;
					
				}
			}
			if(minindex!=i) {
				arr[minindex]=arr[i];
				arr[i]=min;
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {2 ,8, 5, 4};
    selection(arr);
    for(int i=0;i<arr.length;i++) {
    	System.out.print(arr[i]+" ");
    }
	}
}
