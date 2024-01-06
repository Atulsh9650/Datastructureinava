package arrays;

public class Sortedornot {
public static void checksorted(int arr[]) {
	int count=0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i+1]<arr[i]) {
			System.out.println("array is rotated");
			count++;
			break;
		}
	} 
	if(count==0) {
		System.out.println("array is not rotated");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[]= {3,4,5,6,7};
  checksorted(arr);
	}

}
