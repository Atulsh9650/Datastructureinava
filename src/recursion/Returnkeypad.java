package recursion;

public class Returnkeypad {
public static String[] returnkey(int n) {
	if(n==0||n==1) {
		String s[]= {""};
		return s;
	}
	String help=helper(n%10);
  String smallans[]=returnkey(n/10);
  String arr[]=new String[smallans.length*help.length()];
  int k=0;
  for(int i=0;i<smallans.length;i++) {
	  for(int j=0;j<help.length();j++) {
		  arr[k]=smallans[i]+help.charAt(j);
	  k++;
	  }
  }
  return arr;
}
public static String helper(int n) {
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
 String s[]=returnkey(a);
 for(int i=0;i<s.length;i++) {
	 System.out.println(s[i]);
 }
	}

}
