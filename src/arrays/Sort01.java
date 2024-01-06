package arrays;

public class Sort01 {
public static void sortZeroesAndOne(int[] arr) {
    int n=arr.length;
    int count=0;
	for(int i=0;i<n;i++) {
		if(arr[i]==0) {
			count++;
		}
     }
	for(int i=0;i<count;i++) {
		arr[i]=0;
		System.out.print(arr[i]+" ");
	}
	for(int i=count;i<n;i++) {
		arr[i]=1;
		System.out.print(arr[i]+" ");
	}
    }
public static void sort(int[] arr) {
	int k=0;
for(int i=0;i<arr.length;i++) {
if(arr[i]==0) {
	int temp=arr[k];
	arr[k]=arr[i];
	arr[i]=temp;
	k++;
}
}
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
}

public static void main(String args[]) {
	int arr[]= {1,0,1,0,1,1,1,0};
//	sortZeroesAndOne(arr);
	sort(arr);
}
}
