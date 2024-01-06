package recursion;

public class Firstindex {
	
		public static int firstIndex(int input[], int x) {
		        //method overloading
		        return firstIndex(input,x,0);		

		    }
		    private static int firstIndex(int input[],int x,int startIndex){
		        if(startIndex==input.length)
		            return -1;
		        if(input[startIndex]==x)
		            return startIndex;
		        return firstIndex(input,x,startIndex+1);
		        }
			
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,4,7,2};
		int check=firstIndex(arr,6);
		System.out.println(check);
	}
	}

