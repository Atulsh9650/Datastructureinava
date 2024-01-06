package sortingarray;
public class Mergesort {
public static void mergesort(int input[],int l,int r) {
	
	if(l<r) {
		int mid=(l+r)/2;
	mergesort(input,l,mid);
	mergesort(input,mid+1,r);
	merge(input,l,mid,r);
	}	
}
public static void merge(int input[],int l,int mid,int r) {
	int b[]=new int[input.length];
	int i=l;
	int j=mid+1;
	int k=l;
	while(i<=mid && j<=r ) {
		if(input[i]<input[j]) {
			b[k]=input[i];
			i++;
			k++;
		}
		else {
			b[k]=input[j];
			k++;
			j++;
		}
	}
	if(i>mid) {
	while(j<=r) {
		b[k]=input[j];
		j++;
		k++;
	}
	}
	else {
	while(i<=mid) {
		b[k]=input[i];
		k++;
		i++;
	}
	}
	for(int a=l;a<=r;a++) {
		input[a]=b[a];
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {15,3,4,1,2,5,5};
mergesort(arr,0,6);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
