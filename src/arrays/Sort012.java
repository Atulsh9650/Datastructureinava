package arrays;

public class Sort012 {

	public static int[] merge(int arr[]) {
		int temp[]=new int[arr.length];
		int count=0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
			else {
				temp[k]=arr[i];
				k++;
			}
		}
		for(int i=count;i<arr.length;i++) {
				temp[k]=0;
				k++;
			}
		
		return temp;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr1[]= {3,0,7,5,6,0,0,0,7,0};
       
       int ans[]=merge(arr1);
       for(int i=0;i<ans.length;i++) {
    	   System.out.print(ans[i]+" ");
       }
       
	}
}
