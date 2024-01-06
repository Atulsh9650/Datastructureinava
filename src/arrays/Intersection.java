package arrays;

public class Intersection {
	public static void intersections(int arr1[], int arr2[]) {
	 for(int i=0;i<arr1.length;i++) {
		 int element=arr1[i];
		 for(int j=0;j<arr2.length;j++) {
			 if(element==arr2[j]) {
				 System.out.print(element+" ");
				 arr2[j]=Integer.MIN_VALUE;
				 break;
			 }
			
		 }
	 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {1,2,2,3,4};
int arr2[]= {1,2,2,3,5};
intersections(arr1,arr2);
	}

}
