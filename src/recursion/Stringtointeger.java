package recursion;

public class Stringtointeger {

	public static int replace(String input) {
		if(input.length()==1)
{
			return input.charAt(0)-'0';
		}
		int ans=replace(input.substring(1));
		int x=input.charAt(0)-'0';
		x=x*(int)Math.pow(10,input.length()-1)+ans;
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123";
		int result=replace(s);
		System.out.println(result);

	}

}
