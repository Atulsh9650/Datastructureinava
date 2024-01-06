package recursion;

public class Checknumber {
	
	public static boolean checkno(int arr[],int x) {
		if(arr.length<1) {
			return false;
		}
		if(arr[0]==x) {
			return true;
		}
		int newarr[]=new int[arr.length-1];
		 for(int i=1;i<arr.length;i++) {
			 newarr[i-1]=arr[i];
		 }
		boolean check=checkno(newarr,x);
		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,6,4,7,5};
		boolean check=checkno(arr,9);
		System.out.println(check);
	}

}
