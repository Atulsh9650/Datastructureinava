package arrays;



public class Findunique {
	 public static int findUnique2(int[] arr){
			//Your code goes here
	        int k=0;
	        boolean [] visited = new boolean[arr.length];
	        for (int i = 0; i <arr.length ; i++) {
	            int x = arr[i];
	            if(visited[i]==false) {
	                boolean isDuplicate = false;
	                for (int j = i + 1; j < arr.length; j++) {
	                    if (x == arr[j]) {
	                        isDuplicate = true;
	                        visited[j] = true;
	                    }
	                }
	                if (!isDuplicate)
	                    k=x;

	            }
	        }
	        return k;
	 }
	public static int unique(int arr[]) {
		int n=arr.length;
	    int ans=0;
		for(int i=0;i<n;i++) {
			ans=ans^arr[i];
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15,2,3,2,3};
		int ans=findUnique2(a);
        System.out.println(ans);
	}

}
