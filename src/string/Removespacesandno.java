package string;

public class Removespacesandno {
	public static void isPalindrome(String s) {
        StringBuilder newstring=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                if(Character.isUpperCase(s.charAt(i))){
                    newstring.append(Character.toLowerCase(s.charAt(i)));
                }
                else{
                        newstring.append(s.charAt(i));
                }
            }
        }
            System.out.println(newstring.toString()); 
            
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome("A man, a plan, a canal: Panama");
	}
}
