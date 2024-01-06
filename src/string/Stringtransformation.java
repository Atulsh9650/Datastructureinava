package string;

public class Stringtransformation {
	 public static String solve(String str1, String str2) {
	        int i = 0;
	        int j = 0;

	        while (i < str1.length() && j < str2.length()) {
	            if (Character.toUpperCase(str1.charAt(i)) == str2.charAt(j)) {
	                i++;
	                j++;
	            } 
	            else {
	            	i++;
	            }
	        }
	        if(j==str2.length()) {
	        	return "YES";
	        }
	        else {
	        	return "NO";
	        }
	       
	    }

	    public static void main(String[] args) {
	        String str1 = "daBcd";
	        String str2 = "ABE";
	        String result = solve(str1, str2);
	        System.out.println(result);
	    }
}
