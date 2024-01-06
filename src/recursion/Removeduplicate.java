package recursion;

public class Removeduplicate {
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()<=1) {
			return s;
		}
		String smallans=removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0)==smallans.charAt(0)) {
			return smallans;
		}
		else {
			return s.charAt(0)+smallans;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello ";
System.out.println(removeConsecutiveDuplicates(s));
	}

}
