package arrays;

public class Binarysearch {

	 public static int binary(int arr[],int x) {
		 int start=0;
		    int end=arr.length-1;
		    while(start<=end)
		    {
		    int mid=(start+end)/2;
		    if(x==arr[mid])
		    {
		        return mid;
		    }
		    else if(x>arr[mid])
		    {
		        start=mid+1;
		     
		    }
		    else 
		    {
		     
		     end=mid-1;
		    
			}
		    }
		    return -1;
		}
	    
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int ans=binary(arr,6);
		System.out.println(ans);
	}

}
