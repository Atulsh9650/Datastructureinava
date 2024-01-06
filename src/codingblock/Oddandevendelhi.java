package codingblock;


import java.util.*;
public class Oddandevendelhi {
    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++){
		arr[i]=s.nextInt();
	}
	for(int j=0;j<arr.length;j++){
    int num=arr[j];
	int odd=0;
	int even=0;
	int rem=0;
	while(num>0){
		rem=num%10;
		if(rem%2==0){
			even=even+rem;
		}
		else{
			odd=odd+rem;
		}
		num=num/10;
	}
	if(even%4==0 || odd%3==0){
		System.out.println("Yes");
	}
	else{
       System.out.println("No");
	}
	}
    }
}