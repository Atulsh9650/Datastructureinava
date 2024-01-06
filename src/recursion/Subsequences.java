package recursion;

public class Subsequences {
public static String[] subsequences(String s) {
	if(s.length()==0) {
		String a[]= {""};
		return a;
	}
	String smallans[]=subsequences(s.substring(1));
    String ans[]=new String[2*smallans.length];
	for(int i=0;i<smallans.length;i++) {
		ans[i]=smallans[i];
	}
	for(int i=0;i<smallans.length;i++) {
		ans[i+smallans.length]=s.charAt(0)+smallans[i];
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="xyz";
     String arr[]=subsequences(s);
     for(int i=0;i<arr.length;i++) {
    	 System.out.println(arr[i]);
     }
	}

}
