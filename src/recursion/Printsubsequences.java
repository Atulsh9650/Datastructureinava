package recursion;

public class Printsubsequences {

	public static void subsequences(String input,String outputsofar) {
		if(input.length()==0) {
			System.out.println(outputsofar);
			return;
		}
		subsequences(input.substring(1),outputsofar);
		subsequences(input.substring(1),outputsofar+input.charAt(0));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="xyz";
subsequences(s,"");
	}

}
