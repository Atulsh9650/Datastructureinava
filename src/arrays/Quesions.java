package arrays;

public class Quesions {
	public static int second(int arr[]) {
		if(arr.length<=1)
            return -2147483648;
      int issame=arr[0];
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==issame)
             count++;
        }
        if(count==arr.length)
            return -2147483648;
       
        int largest=Integer.MIN_VALUE;
       
        for(int i=0;i<arr.length;i++)
        {  if(arr[i]>largest)
        { largest=arr[i];
         
        }
         }  
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length ;i++)
        {   
            if(arr[i]==largest)
                continue;
           if(arr[i]>secondLargest)
               secondLargest=arr[i];
        }
        return secondLargest;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {90 ,90, 90, 90};
int secondlargest=second(arr);
System.out.println(secondlargest);
	}

}
