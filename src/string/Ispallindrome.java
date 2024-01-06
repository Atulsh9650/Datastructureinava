package string;
import java.util.Scanner;
public class Ispallindrome {
public static boolean checkpallindrome(String s) {
	int j=s.length()-1;
	for(int i=0;i<s.length()/2;i++) {
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		j--;
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     boolean result=checkpallindrome(s);
     System.out.println(result);
	}

}
