package arrays;
import java.util.*;
public class Duplicate1 {
public static int dup(int input[],int size) {
	int ans=0;
    for(int i=0;i<input.length;i++){
        ans=ans^input[i];
    }
    for(int i=1;i<input.length-1;i++){
        ans=ans^i;
    }
    return ans;
}
public static void removedup(String ans) {
	StringBuilder str=new StringBuilder();
	boolean check[]=new boolean[256];
    for(int i=0;i<ans.length();i++){
        if(!check[ans.charAt(i)]) {
        	str.append(ans.charAt(i));
        	check[ans.charAt(i)]=true;
        }
    }
    System.out.println(str.toString());
  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {0 ,7 ,2, 5 ,4, 7, 1, 3, 6};
      String ans="hello world";
      removedup(ans);
      int x=dup(arr,9);
      System.out.println(x);
      
	}

}
