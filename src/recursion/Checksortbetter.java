package recursion;

public class Checksortbetter {

	public static boolean check(int arr[],int startindex) {
		if(startindex>=arr.length-1) {
			return true;
		}
		if(arr[startindex]>arr[startindex+1]) {
			return false;
		}
		boolean smallans=check(arr,startindex+1);
		return smallans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,3,4,5};
		boolean check=check(arr,0);
		System.out.println(check);
	}

}
