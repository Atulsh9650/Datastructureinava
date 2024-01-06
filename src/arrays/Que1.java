package arrays;
/*Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.*/


public class Que1 {

	public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int val=1, nVal=0;
     if(n!=0){
            if(n%2==0)
            nVal=n;
            else
            nVal=n-1;
         for(int j=0;j<=(n-1)/2;j++){
               arr[j]=val;
                val+=2;            
            }     
        for(int j=(((n-1)/2)+1);j<n;j++){
            arr[j]=nVal;
            nVal-=2;
        }
     }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= new int[6];
      arrange(arr,6);
      for(int i=0;i<6;i++) {
    	  System.out.print(arr[i]+" ");
      }
	}

}
