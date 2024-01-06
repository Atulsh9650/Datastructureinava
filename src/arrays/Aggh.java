package arrays;

public class Aggh {

	public static void arrange(int a[])
	{
		int n=a.length;
	int j=0;
	while(j<n-1) {
		int temp=a[j+1];
		a[j+1]=a[j];
		a[j]=temp;
		j+=2;
	}
	int i=0;
	while(i<n) {
		System.out.print(a[i]);
		i++;
	}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2,3,4,5,7,8,9};
        arrange(arr);
	}

}
