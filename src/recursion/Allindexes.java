package recursion;

public class Allindexes {
	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input,x,0);
	}
	
	private static int[] allIndexes(int input[], int x,int startindex) {
		if(startindex==input.length) {
			 int arr[]=new int[0];
			 return arr;
		}
		int smallans[]=allIndexes(input,x,startindex+1);
		if(input[startindex]==x) {
			int newarr[]=new int[smallans.length+1];
			newarr[0]=startindex;
			for(int i=0;i<smallans.length;i++) {
				newarr[i+1]=smallans[i];
			}
			return newarr;
		}
		else {
			return smallans;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,4,7,2};
		int check[]=allIndexes(arr,1);
		for(int i=0;i<check.length;i++) {
		System.out.print(check[i]+" ");
		}
		}

	}


