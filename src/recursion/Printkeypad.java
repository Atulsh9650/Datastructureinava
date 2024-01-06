package recursion;

public class Printkeypad {
	public static void returnkey(int input){
		returnkey(input,"");}


	public static void returnkey(int n,String outputsofar) {
		if(n==0) {
			System.out.println(outputsofar);
			return;
		}
		String help=helper(n%10);
		for(int i=0;i<help.length();i++) {
		returnkey(n/10,help.charAt(i)+outputsofar);
		}
	}
	public static String helper(int n) {
		if(n==0||n==1) {
			return "";
		}
		if(n==2) {
			return "abc";
		}
		if(n==3) {
			return "def";
		}
		if(n==4) {
			return "ghi";
		}
		if(n==5) {
			return "jkl";
		}
		if(n==6) {
			return "mno";
		}
		if(n==7) {
			return "pqrs";
		}
		if(n==8) {
			return "tuv";
		}
		if(n==9) {
			return "wxyz";
		}
		else {
			return "";
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 int a=23;
	 returnkey(a);
	 
		}

}
