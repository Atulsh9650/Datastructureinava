package arrays;

public class Secondlargest {

	public static int seclarge(int[] arr) {
		if(arr.length==1) {
			return Integer.MIN_VALUE;
		}
		boolean ele=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				ele=false;
			}
			else {
				ele=true;
			    break;
			}
		}
		
		if(ele==false) {
			return Integer.MIN_VALUE;
		}
		int seclarge=Integer.MIN_VALUE;
		int large=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				seclarge=large;
				large=arr[i];
			}
			else if(arr[i]>seclarge && arr[i]<large) {
				seclarge=arr[i];
			}
		}
		return seclarge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {2,2,2,2,3};
     System.out.println(seclarge(arr));
	}

}
