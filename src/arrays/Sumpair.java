package arrays;

public class Sumpair {

	public static int pairsum(int arr[],int x) {
		int pair=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					pair=pair+1;
				}
			}
		}
		return pair;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3,4,5};
     int pairs=pairsum(arr,5);
     System.out.println(pairs);
	}

}
