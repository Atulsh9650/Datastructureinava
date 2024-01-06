package recursion;

public class Pairstar {
	public static String addStars(String s) {
		// Write your code here
     if(s.length()==1)
            return s;
        String smallans=addStars(s.substring(1));
        if(s.charAt(0)==smallans.charAt(0))
            return s.charAt(0)+"*"+smallans;
        else
            return s.charAt(0)+smallans;
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abbb";
s=addStars(s);
System.out.println(s);
	}

}
