package recursion;

public class Checksorted {
 public static boolean check(int arr[]) {
	 if(arr.length<=1) {
		 return true;
	 }
	 if(arr[0]>arr[1]) {
		 return false;
	 }
	 int newarr[]=new int[arr.length-1];
	 for(int i=1;i<arr.length;i++) {
		 newarr[i-1]=arr[i];
	 }
	 boolean ans=check(newarr);
	 return ans;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,6,4,5};
  boolean checksort=check(arr);
  System.out.println(checksort);
	}

}
