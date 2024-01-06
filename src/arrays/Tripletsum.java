package arrays;

public class Tripletsum {
 public static int findtriplet(int arr[],int x) {
	 int pair=0;
	 for(int i=0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 for(int k=j+1;k<arr.length;k++) {
				 if(arr[i]+arr[j]+arr[k]==x) {
					 pair++;
				 }
				 
			 }
					 }
		 
	 }
	 return pair;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,3,45,1};
int sum=findtriplet(arr,2);
System.out.println(sum);
	}

}
