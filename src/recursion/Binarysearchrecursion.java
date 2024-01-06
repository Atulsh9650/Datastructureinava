package recursion;

public class Binarysearchrecursion {
	
	public static int binarysearch(int n[],int si,int ei,int x) {
		if(si>ei) {
			return -1;
		}
		int mid=(si+ei)/2;
		if(n[mid]==x) {
			return mid;
		}
		else if(n[mid]<x) {
			return binarysearch(n,mid+1,ei,x);
		}
		else {
			return binarysearch(n,si,mid-1,x);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,45,50};
int s=binarysearch(arr,0,arr.length-1,3);
System.out.println(s);
	}

}
