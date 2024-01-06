package arrays;

public class Merge2array {
	
   
	public static int[] merge(int arr1[],int arr2[]) {
		int mergearray[]=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
          if(arr1[i]<arr2[j])
          {
              mergearray[k]=arr1[i];
              k++;
              i++;
          }
            else{
              mergearray[k]=arr2[j];
              k++;
              j++;
            }
        }
        while(i<arr1.length)
        {
            mergearray[k]=arr1[i];
            k++;
            i++;        
        
        }
        while(j<arr2.length)
        {
         mergearray[k]=arr2[j];
            k++;
            j++;    
        }
        return mergearray;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr1[]= {3,4 ,7, 9, 25, 30, 300, 450};
       int arr2[]= {7,45,89,90};
       int ans[]=merge(arr1,arr2);
       for(int i=0;i<ans.length;i++) {
    	   System.out.print(ans[i]+" ");
       }
       
	}

}
