package binarytree;

public class Sortedarray {

	public static Binarytreenode<Integer> SortedArrayToBST(int[] arr, int n){
		Binarytreenode<Integer> root=sortedhelper(arr,0,n-1);
		return root;
	}
	public static Binarytreenode<Integer> sortedhelper(int arr[],int si,int ei){
		if(si>ei) {
			return  null;
		}
		int mid=(si+ei)/2;
		Binarytreenode<Integer> root=new Binarytreenode<Integer>(arr[mid]);
		root.left=sortedhelper(arr,0,mid-1);
		root.right=sortedhelper(arr,mid+1,ei);
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
