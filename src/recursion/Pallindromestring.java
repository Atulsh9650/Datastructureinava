package recursion;

public class Pallindromestring {
	
	public static boolean isStringPalindrome(String input) {
		// Write your code here
if(input.length()<=1)
            return true;
        if(input.charAt(0)==input.charAt(input.length()-1)){
            return isStringPalindrome(input.substring(1,input.length()-1));

        }
        else
            return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="abbaad";
 boolean check= isStringPalindrome(s);
 System.out.println(check);
 String a=s.substring(0,s.length()-1);
 System.out.println(a);
 String b=s.charAt(s.length()-1);
 
	}

}
