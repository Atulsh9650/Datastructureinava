package arrays;

public class Rotatearray {
 public static void rotate(int arr[],int d) {
	 int temp[]=new int[arr.length];
	 for(int i=0;i<arr.length;i++) {
		 temp[i]=arr[i];
	 }
	int i=0;
	int k=0;
		 for(int j=d;j<temp.length;j++) {
			 arr[i]=temp[j];
			 i++;
		 }
		 while(i<arr.length) {
			 arr[i]=temp[k];
			 i++;
			 k++;
		 }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,6,7,5};
int d=4;
 rotate(arr,d);
 for(int i=0;i<arr.length;i++) {
	 System.out.print(arr[i]+" ");
 }


	}

}
