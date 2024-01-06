package string;

public class Incrementstring {

	public static String increment(String s) {
		StringBuilder output=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
			char currentchar=s.charAt(i);
			char newchar=(char)(currentchar+1);
		    
if(newchar=='a' || newchar=='e' || newchar=='i' || newchar=='o' ||	newchar=='u') {
				output.append(Character.toUpperCase(newchar));
			}
        else {
	output.append(newchar);
}
			}
			
			else {
				output.append(s.charAt(i));
			}
		}
		return output.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="abcd*";
   String output=increment(s);
   System.out.println(output);
   
	}

}
