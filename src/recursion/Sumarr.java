package recursion;

public class Sumarr {
	public static int checksum(int arr[]) {
		if(arr.length<1) {
			return 0;
		}
		int newarr[]=new int[arr.length-1];
		 for(int i=1;i<arr.length;i++) {
			 newarr[i-1]=arr[i];
		 }
		int sum=arr[0]+checksum(newarr);
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,6,4,7,5};
		  int check=checksum(arr);
		  System.out.println(check);
	}

}
