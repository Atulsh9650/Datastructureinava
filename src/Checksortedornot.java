
public class Checksortedornot {
	
public static boolean check(int[] arr) {
int n=arr.length;
if(n==1) {
	return true;
}
for(int i=0;i<n-1;i++) {
	if(arr[i+1]<arr[i]) {
		return false;
	}
}
return true;
}
	
public static void main(String[] args) {
	int arr[]= {1,2,5,6,7};
	System.out.println("array is sorted: "+check(arr));
}
}
