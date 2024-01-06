package sortingarray;
import java.util.Scanner;
public class Quicksort {
public static void sort(int arr[],int low,int high) {
	if(low>=high) {
		return;
	}
	int s=low;
	int e=high;
	int m=s+(e-s)/2;
	int pivot=arr[m];
	while(s<=e) {
		while(arr[s]<pivot) {
			s++;
		}
		while(arr[e]>pivot) {
			e--;
		}
		if(s<=e) {
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
	}
	sort(arr,low,e);
	sort(arr,s,high);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,4,5,7,8};
sort(arr,0,arr.length-1);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
