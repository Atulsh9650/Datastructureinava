package arrays;
import java.util.Scanner;

  
public class Arrayinput {
	
	public static int islargest(int input[]) {
		int size=input.length;
		int max=Integer.MIN_VALUE;
	      for(int i=0;i<size;i++) {
	    	 if(input[i]>max) {
	    		 max=input[i];
	    	  }
	    	 
	      }
	      return max;
	}
	public static int[] takeinput() {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=s.nextInt();
		}
		return array;
	}
	public static void print(int input[]){
		int size=input.length;
		for(int i=0;i<size;i++) {
			System.out.println(input[i]+"");
		}
	}
 public static void main(String args[]) {
	 int arr[]=takeinput();
	 print(arr);
	 int largest=islargest(arr);
	 System.out.println("largest"+largest);
 }
}
