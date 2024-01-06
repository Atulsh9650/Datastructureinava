package arrays;

public class Sumof2array {

	public static int[] sum(int arr1[],int arr2[]) {
		int n1=arr1.length;
		int n2=arr2.length;
		int k=Math.max(n1, n2);
		int temp[]=new int[k+1];
		int carry=0;
		int i=n1-1;
		int j=n2-1;
		while(i>=0 && j>=0) {
			int sum=arr1[i]+arr2[j]+carry;
			temp[k]=sum%10;
			carry=sum/10;
			k--;
			i--;
			j--;
		}
		while(i>=0) {
			int sum=arr1[i]+carry;
			temp[k]=sum%10;
			carry=sum/10;
			i--;
			k--;
		}
		while(j>=0) {
			int sum=arr2[j]+carry;
			temp[k]=sum%10;
			carry=sum/10;
			j--;
			k--;
		}
		temp[0]=carry;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr1[]= {9,4,5,7,6};
      int arr2[]= {9,5,6,7,6,6,8};
      int temp[]=sum(arr1,arr2);
      for(int i=0;i<temp.length;i++) {
    	  System.out.print(temp[i]+" ");
      }
	}

}
